package paquete2;

import paquete1.Cheque;

public class Ejecutor {
    public static void main(String[] args){
        
        //Objeto 1
        String cdi1 = "Jandry Jaramillo";
        String mv1 = "Banco de Loja";
        double a1 = 158;        
        
        Cheque cheque1 = new Cheque(cdi1,mv1,a1);
        
        System.out.printf("%s\n",cheque1);
        
        //Objeto 2
        String cdi2 = "Josué Peña";
        String mv2 = "Banco Pichincha";
        double a2 = 450;        
        
        Cheque cheque2 = new Cheque(cdi2,mv2,a2);
        
        System.out.printf("%s\n",cheque2);
    }
}