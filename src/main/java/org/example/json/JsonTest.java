package org.example.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonTest {

    public static void main(String[] args) {
        Human h = new Human("Ivan", 45);

        Gson gson1 = new Gson();
        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();

        String json1 = gson1.toJson(h);
        String json2 = gson2.toJson(h);

        Human human = gson1.fromJson(json1, Human.class);
        System.out.println("human = " + human);

        //System.out.println(json1);
        //System.out.println(json2);
    }
}
