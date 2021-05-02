package paquete1;

public class Cheque {

    private String nombreDelCliente;
    private String nombreDelBanco;
    private double valorDelCheque;
    private double comisión;    
    
    public Cheque(String nc,String nb,double vc){
        nombreDelCliente = nc;
        nombreDelBanco = nb;
        valorDelCheque = vc;                
    }
    
    public void establecerNombreDelCliente(String c){
        nombreDelCliente = c;        
    }
    
    public void establecerNombreDelBanco(String m){
        nombreDelBanco = m;
    }
    
    public void establecerValorDelCheque(double a){
        valorDelCheque = a;
    }
    
    public void establecerComisión(){        
    }       
    
    public String obtenerNombreDelCliente(){
        return nombreDelCliente;        
    }
    
    public String obtenerNombreDelBanco(){
        return nombreDelBanco;
    }
    
    public double obtenerValorDelCheque(){
        return valorDelCheque;
    }
    
    public double obtenerComisión(){
        return (valorDelCheque * 0.0003);
    }
   
    @Override
    public String toString(){
        
        String cadena = String.format("Los datos son: \n"
                +"Nombre del cliente: %s \nNombre del banco: %s\n"
                + "Valor del cheque: %.3f\nComisión: %.3f\n",obtenerNombreDelCliente(),
                obtenerNombreDelBanco(),obtenerValorDelCheque(),
                obtenerComisión());
        return cadena;
    }
}