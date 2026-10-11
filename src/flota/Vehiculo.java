package flota;

//Superclase 
public class Vehiculo {

    protected String patente;
    protected String marca;
    protected double costoBaseKm;

    //constructor 
    public Vehiculo(String patente, String marca, double costoBaseKm) {
        this.patente = patente;
        this.marca = marca;
        this.costoBaseKm = costoBaseKm;
    }

    //metodos 
    public double calcularCostoViaje(double distanciaKm) {
        return distanciaKm * costoBaseKm;
    }

    public double calcularCostoViaje(double distanciaKm, double peajes) {
        return calcularCostoViaje(distanciaKm) + peajes;
    }

    public void mostrarFicha() {
        System.out.println("[Vehículo] Genérico | Patente: " + patente + " | Marca: " + marca);
    }
}