package com.training;

public class TaskFive_Six {
    public static void main(String []args){
        char c = 0;
        String str = "AbhiJeEt";
        System.out.println("String in lowercase: "+str);

        int len = str.length();
        StringBuffer strBuffer = new StringBuffer(len);
        for (int i = 0; i < len; i++) {
            c = str.charAt(i);

            if (Character.isTitleCase(c)) {
                c = Character.toLowerCase(c);
            }

            else if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }

            else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            strBuffer.append(c);
        }
        System.out.println("Converting case: "+strBuffer.toString());
    }
}
