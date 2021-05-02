package paquete2;

import paquete1.Automotor;

public class Ejecutor {
    public static void main(String[] args){
        
        //Objeto 1
        String cdi1 = "1105638049";
        String mv1 = "Ford";
        double a1 = 2012;
        double v1 = 12.500;
        
        Automotor auto1 = new Automotor(cdi1,mv1,a1,v1);
        
        System.out.printf("%s\n",auto1);
        
        //Objeto 2
        String cdi2 = "1105646049";
        String mv2 = "Toyota";
        double a2 = 2017;
        double v2 = 8.500;
        
        Automotor auto2 = new Automotor(cdi2,mv2,a2,v2);
        
        System.out.printf("%s\n",auto2);
    }
}