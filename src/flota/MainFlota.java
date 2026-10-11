package flota;

public class MainFlota {

    public static void main(String[] args) {

        //ARREGLO POLIMORFICO DE VEHICULOS
        Vehiculo[] flota = new Vehiculo[3];
        flota[0] = new Camion("AA123BB", "Scania", 450.0, 18.0);
        flota[1] = new Furgoneta("AF456CD", "Mercedes-Benz", 450.0, true);
        flota[2] = new MotoEnvios("A099XYZ", "Honda", 180.0);

        final double distanciaKm = 150.0;
        double costoTotal = 0;

        System.out.println("=== Reporte de Operaciones de Flota ===");

        for (Vehiculo vehiculo : flota) {
            vehiculo.mostrarFicha();
            double costo = vehiculo.calcularCostoViaje(distanciaKm);
            System.out.println("Costo de viaje (" + distanciaKm + " km): $" + costo);
            System.out.println("-".repeat(50));
            costoTotal += costo;
        }

        System.out.println("Costo total operativo de la flota: $" + costoTotal);
    }
}