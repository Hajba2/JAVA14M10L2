package org.example.serializable;

import org.example.json.Human;

import java.io.*;

public class SerilizationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Human human = new Human("Olga", 22);

        OutputStream os = new FileOutputStream("files/serialized-human.bin");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(human);

        oos.flush();
        oos.close();

        InputStream is;
        FileWriter fw;
        OutputStream os2;

        File file = new File("files/serialized-human.bin");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object o = ois.readObject();
        Human res = (Human) o;

        System.out.println("o = " + o);
    }
}
