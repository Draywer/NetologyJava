package ru.idcore.javacore.task030301;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder tmp = new StringBuilder();
        String dirGame = "C://game";
        String dirSrc = dirGame + "/src";
        String dirRes = dirGame + "/res";
        String dirSavegames = dirGame + "/savegames";
        String dirTemp = dirGame + "/temp";
        String dirMain = dirSrc + "/main";
        String dirTest = dirSrc + "/test";
        String dirDrawables = dirRes + "/drawables";
        String dirVectors = dirRes + "/vectors";
        String dirIcons = dirRes + "/icons";

        FileWriter out = null;
        File gm = new File(dirGame);
        File sr = new File(dirSrc);
        File mn = new File(dirMain);
        File ts = new File(dirTest);
        File re = new File(dirRes);
        File dr = new File(dirDrawables);
        File vc = new File(dirVectors);
        File ic = new File(dirIcons);
        File sg = new File(dirSavegames);
        File tm = new File(dirTemp);
        File fTemp = new File(dirTemp + "/temp.txt");

        try {
            //директория game
            if (gm.mkdir()) {
                tmp.append("Директория: ").append(gm.getAbsoluteFile()).append(" - создана");

                //директория Src
                if (sr.mkdirs()) {
                    tmp.append("\nДиректория: ").append(sr.getAbsoluteFile()).append(" - создана");

                    //директория main
                    if (mn.mkdirs()) {
                        tmp.append("\nДиректория: ").append(mn.getAbsoluteFile()).append(" - создана");
                    } else {
                        tmp.append("\nДиректория: ").append(mn.getAbsoluteFile()).append(" - не создана");
                    }

                    //директория test
                    if (ts.mkdirs()) {
                        tmp.append("\nДиректория: ").append(ts.getAbsoluteFile()).append(" - создана");
                    } else {
                        tmp.append("\nДиректория: ").append(ts.getAbsoluteFile()).append(" - не создана");
                    }

                } else {
                    tmp.append("\nДиректория: ").append(sr.getAbsoluteFile()).append(" - не создана");
                }

                //директория Res
                if (re.mkdirs()) {
                    tmp.append("\nДиректория: ").append(re.getAbsoluteFile()).append(" - создана");

                    //директория drawables
                    if (dr.mkdirs()) {
                        tmp.append("\nДиректория: ").append(dr.getAbsoluteFile()).append(" - создана");
                    } else {
                        tmp.append("\nДиректория: ").append(dr.getAbsoluteFile()).append(" - не создана");
                    }

                    //директория vectors
                    if (vc.mkdirs()) {
                        tmp.append("\nДиректория: ").append(vc.getAbsoluteFile()).append(" - создана");
                    } else {
                        tmp.append("\nДиректория: ").append(vc.getAbsoluteFile()).append(" - не создана");
                    }

                    //директория icons
                    if (ic.mkdirs()) {
                        tmp.append("\nДиректория: ").append(ic.getAbsoluteFile()).append(" - создана");
                    } else {
                        tmp.append("\nДиректория: ").append(ic.getAbsoluteFile()).append(" - не создана");
                    }

                } else {
                    tmp.append("\nДиректория: ").append(re.getAbsoluteFile()).append(" - не создана");
                }

                //директория Savegames
                if (sg.mkdirs()) {
                    tmp.append("\nДиректория: ").append(sg.getAbsoluteFile()).append(" - создана");
                } else {
                    tmp.append("\nДиректория: ").append(sg.getAbsoluteFile()).append(" - не создана");
                }

                //директория Temp
                if (tm.mkdirs()) {
                    tmp.append("\nДиректория: ").append(tm.getAbsoluteFile()).append(" - создана");

                    //файл temp.txt
                    if (fTemp.createNewFile()) {
                        tmp.append("\nФайл: ").append(fTemp.getAbsoluteFile()).append(" - создан");

                        out = new FileWriter(fTemp);
                    } else {
                        tmp.append("\nФайл: ").append(fTemp.getAbsoluteFile()).append(" - не создан");
                    }

                } else {
                    tmp.append("\nДиректория: ").append(tm.getAbsoluteFile()).append(" - не создана");
                }


            } else {
                tmp.append("\nДиректория: ").append(gm.getAbsoluteFile()).append(" - не создана");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fTemp.exists()) {
                if (out != null) {
                    out.write(tmp.toString());
                    out.close();
                }
            } else {
                System.out.println(tmp);
            }
        }
    }
}
