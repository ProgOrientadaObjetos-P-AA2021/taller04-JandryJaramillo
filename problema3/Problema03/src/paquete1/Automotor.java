package paquete1;

public class Automotor {

    private String cédulaDelDueño;
    private String marcaDeVehículo;
    private double añoDeFabricación;
    private double valorDeVehículo;
    private double valorDeLaMatrícula;
    
    public Automotor(String cdi,String marca,double año,double vv){
        cédulaDelDueño = cdi;
        marcaDeVehículo = marca;
        añoDeFabricación = año;
        valorDeVehículo = vv;        
    }
    
    public void establecerCédulaDelDueño(String c){
        cédulaDelDueño = c;        
    }
    
    public void establecerMarcaDeVehículo(String m){
        marcaDeVehículo = m;
    }
    
    public void establecerAñoDeFabricación(double a){
        añoDeFabricación = a;
    }
    
    public void establecerValorDeVehículo(double v){
        valorDeVehículo = v;
    }
    
    public void establecerValorDeLaMatrícula (){       
    }
    
    public String obtenerCédulaDelDueño(){
        return cédulaDelDueño;        
    }
    
    public String obtenerMarcaDeVehículo(){
        return marcaDeVehículo;
    }
    
    public double obtenerAñoDeFabricación(){
        return añoDeFabricación;
    }
    
    public double obtenerValorDeVehículo(){
        return valorDeVehículo;
    }
    
    public double obtenerValorDeLaMatrícula(){
        return ((valorDeVehículo*0.00002)* añoDeFabricación);
    }      
    
    @Override
    public String toString(){
        
        String cadena = String.format("Los datos son: \n"
                +"Cédula del dueño: %s \nMarca del vehículo: %s\n"
                + "Año de fabricación: %.2f\nValor del vehículo: %.3f\n"
                + "Valor de la matrícula: %.3f\n",obtenerCédulaDelDueño(),
                obtenerMarcaDeVehículo(),obtenerAñoDeFabricación(),
                obtenerValorDeVehículo(),obtenerValorDeLaMatrícula());
        return cadena;
    }
}