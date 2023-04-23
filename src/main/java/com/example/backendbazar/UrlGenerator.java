package com.example.backendbazar;




public class UrlGenerator {

    public static String generateString(){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        java.util.Random rnd = new java.util.Random();
        while (salt.length() < 16) {
            int index = (int) (rnd.nextFloat() * chars.length());
            salt.append(chars.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public static String generateFullUrl(String filename){
        return "https://mrskillmob.github.io/kcbazar/api/files/storage/" + filename;
    }
}
