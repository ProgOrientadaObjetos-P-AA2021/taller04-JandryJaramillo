package paquete1;

public class Profesor {
    
    private String nombre;
    private String apellido;
    private double sueldoBásico;
    private double sueldoTotal;
    private String cédula;
    
    public Profesor(String name,String apell,double suba,String cdi){
        nombre = name;
        apellido = apell;
        sueldoBásico = suba;
        cédula = cdi;
    }
    
    public void establecerNombre(String n){
        nombre = n;        
    }
    
    public void establecerApellido(String a){
        apellido = a;
    }
    
    public void establecerSueldoBásico(double sb){
        sueldoBásico = sb;        
    }
    
    public void establecerSueldoTotal(){             
    }
    
    public void establecerCédula(String c){
        cédula = c;        
    }
    
    public String obtenerNombre(){
        return nombre;        
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public double obtenerSueldoBásico(){
        return sueldoBásico;
    }
    
    public double obtenerSueldoTotal(){             
        return (sueldoBásico + (sueldoBásico * 0.20));
    }
    
    public String obtenerCédula(){
        return cédula;        
    }
    @Override
    public String toString(){
        
        String cadena = String.format("Los datos son: \n"
                +"Nombre: %s \nApellido: %s \nSueldo Básico: %.2f\n"
                +"Sueldo Total: %.2f \nCédula: %s\n",obtenerNombre(),
                obtenerApellido(),obtenerSueldoBásico(),obtenerSueldoTotal(),
                obtenerCédula());
        return cadena;
    }
}