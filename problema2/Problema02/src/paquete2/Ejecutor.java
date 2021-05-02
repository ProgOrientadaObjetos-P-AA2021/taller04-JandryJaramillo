package paquete2;

import paquete1.Profesor;

public class Ejecutor {
    public static void main(String[] args){
        
        //Objeto 1
        String name1 = "José Antonio";
        String apell1 = "Delgado Paute";
        double suba1 = 425;
        String cdi1 = "1105638049";
        
        Profesor p1 = new Profesor(name1,apell1,suba1,cdi1);
        
        System.out.printf("%s\n",p1);
        
        //Objeto2
        String name2 = "Jandry Josué";
        String apell2 = "Peña Guevara";
        double suba2 = 500;
        String cdi2 = "1105168049";
        
        Profesor p2 = new Profesor(name2,apell2,suba2,cdi2);
        
        System.out.printf("%s\n",p2);
    }
}
