package ua.goit;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
       Person i = new Person("Dmytriy", "Chopyk");
       String json=new Gson().toJson(i);
        System.out.println(json);
    }
}
