package flota;

public class Furgoneta extends Vehiculo {

    private boolean tieneRefrigeracion;

    public Furgoneta(String patente, String marca, double costoBaseKm, boolean tieneRefrigeracion) {
        super(patente, marca, costoBaseKm);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    //Recargo fijo de $5000 si la furgoneta tiene refrigeracion
    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double costo = distanciaKm * costoBaseKm;
        if (tieneRefrigeracion) {
            costo += 5000;
        }
        return costo;
    }

    @Override
    public void mostrarFicha() {
        System.out.println("[Vehículo] Furgoneta | Patente: " + patente + " | Marca: " + marca
                + " | Refrigerado: " + (tieneRefrigeracion ? "Sí" : "No"));
    }
}