package net.kimleo.rec.v2.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Persistence {
    public static void saveObjectToFile(Serializable serializable, String file) throws IOException {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));
        stream.writeObject(serializable);
    }

    public static <T extends Serializable> T loadObjectFromFile(String file)
            throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));

        return (T) in.readObject();
    }
}