package ru.idcore.javacore.task030302;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Game {
    public void saveGame (String path, GameProgress gameProgress) {
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(gameProgress);
            out.close();
            fileOut.close();
            } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
