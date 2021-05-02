package paquete2;

import paquete1.Estudiante;

public class Ejecutor {
    
    public static void main(String[] args){
        
        //Objeto 1
        String name1 = "Jandry Jaramillo";
        double c11 = 10;
        double c21 = 9;
        double c31 = 8.7;
        
        Estudiante estudiante1 = new Estudiante(name1,c11,c21,c31);
        
        System.out.printf("%s\n",estudiante1);
        
        //Objeto2
        String name2 = "Josué Peña";
        double c12 = 7;
        double c22 = 9;
        double c32 = 8.5;
        
        Estudiante estudiante2 = new Estudiante(name2,c12,c22,c32);
        
        System.out.printf("%s\n",estudiante2);
    }
}
