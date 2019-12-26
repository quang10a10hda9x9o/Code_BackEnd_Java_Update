package anotion;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("123","",20);
        System.out.println(student.toString());
        Field[] fields = student.getClass().getDeclaredFields();
        for(int i=0 ; i<fields.length ; i++) {
            NotEmpty notEmpty = fields[i].getAnnotation(NotEmpty.class);
            if(notEmpty != null) {
                try {
                    fields[i].setAccessible(true);
                    System.out.println(String.valueOf(fields[i].get(student)));
                    if (fields[i].get(student) == null || String.valueOf(fields[i].get(student)).equals("null")) {
                        System.out.println("Error");
                    }
                } catch (Exception a) {
                    a.printStackTrace();
                }
            }
        }
        System.out.println(student.toString());
    }
}
