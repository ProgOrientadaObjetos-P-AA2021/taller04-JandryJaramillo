package paquete1;

public class Estudiante {
    
    private String nombreDeEstudiante;
    private double calificaciónDeMateria1;
    private double calificaciónDeMateria2;
    private double calificaciónDeMateria3;
    private double promedioDeCalificaciones;
    
    public Estudiante(String name,double m1,double m2,double m3){
        nombreDeEstudiante = name;
        calificaciónDeMateria1 = m1;
        calificaciónDeMateria2 = m2;
        calificaciónDeMateria3 = m3;        
    }
    
    public void establecerNombreDeEstudiante(String n){
        nombreDeEstudiante = n;        
    }
    
    public void establecerCalificaciónDeMateria1(double c1){
        calificaciónDeMateria1 = c1;
    }
    
    public void establecerCalificaciónDeMateria2(double c2){
        calificaciónDeMateria2 = c2;
    }
    
    public void establecerCalificaciónDeMateria3(double c3){
        calificaciónDeMateria3 = c3;
    }
    
    public void establecerPromedioDeCalificaciones (){       
    }
    
    public String obtenerNombreDeEstudiante(){
        return nombreDeEstudiante;        
    }
    
    public double obtenerCalificaciónDeMateria1(){
        return calificaciónDeMateria1;
    }
    
    public double obtenerCalificaciónDeMateria2(){
        return calificaciónDeMateria2;
    }
    
    public double obtenerCalificaciónDeMateria3(){
        return calificaciónDeMateria3;
    }
    
    public double obtenerPromedioDeCalificaciones(){
        return ((calificaciónDeMateria1 + calificaciónDeMateria2
                + calificaciónDeMateria3)/3);
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("Los datos son: \n"
                +"Nombre del estudiante: %s \nCalificación de materia 1: %.2f\n"
                + "Calificación de materia 2: %.2f\nCalificación de materia 3: %.2f\n"
                + "Promedio de calificaciones: %.2f\n",obtenerNombreDeEstudiante(),
                obtenerCalificaciónDeMateria1(),obtenerCalificaciónDeMateria2(),
                obtenerCalificaciónDeMateria3(),obtenerPromedioDeCalificaciones());
        return cadena;
    }
}