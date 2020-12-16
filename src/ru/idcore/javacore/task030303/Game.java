package ru.idcore.javacore.task030303;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Game {
    public boolean saveGame(String path, GameProgress gameProgress) {
        boolean result = false;
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(gameProgress);
            out.close();
            fileOut.close();
            result = true;
        } catch (IOException i) {
            i.printStackTrace();
        }
        return result;
    }

    public void writeLog(String path, String rec) throws IOException {
        File log = new File(path);
        FileWriter out = new FileWriter(log, true);

        try {
            out.write("\n" + rec);
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean addToZip(ZipOutputStream zout, File file) {
        boolean result = false;
        try {
            FileInputStream fis = new FileInputStream(file.getAbsoluteFile());
            ZipEntry entry = new ZipEntry(file.getName());
            zout.putNextEntry(entry);
            // считываем содержимое файла в массив
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            // добавляем содержимое к архиву
            zout.write(buffer);
            // закрываем текущую запись для новой записи
            zout.closeEntry();
            //zout.finish();
            fis.close();
            //zout.close();
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }


    public boolean openZip(String zipPath, String path, String tmpFile) {
        boolean result = false;
        try (ZipInputStream zin = new ZipInputStream(new FileInputStream(zipPath))) {
            ZipEntry entry;
            String name;
            while ((entry = zin.getNextEntry()) != null) {
                name = entry.getName();
                // получим название файла
                // распаковка
                FileOutputStream fout = new FileOutputStream(path + "\\" + name);
                for (int c = zin.read(); c != -1; c = zin.read()) {
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
                //логирование
                writeLog(tmpFile, "Файл: " + name + "  извлечен из архива - " + zipPath);
            }
            result = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
}

