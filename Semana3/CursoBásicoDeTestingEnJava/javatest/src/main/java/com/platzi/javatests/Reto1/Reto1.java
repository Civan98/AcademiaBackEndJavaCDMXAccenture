package com.platzi.javatests.Reto1;

public class Reto1 {
    public static boolean isEmpty(String text){
        boolean vacio=true;
        if (text==null){
            return true;
        }
        if(!text.isEmpty()){
            vacio = false;
        }
        if(text.equals("")){
            vacio = true;
        }
        if (text.trim().length() == 0){
            vacio= true;
        }
        return vacio;
    }
}
