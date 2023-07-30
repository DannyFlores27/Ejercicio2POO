import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int opcion = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("¡Bienvenido!");

    do {
      System.out.println("\tIngrese una opcion: \n\t\t1.Hacer promedio de velocidad.\n\t\t0.Salir");
      try {
        opcion = scanner.nextInt();
      } catch (Exception e) {
        System.out.println("Error de E/S");
      }

      switch (opcion) {
        case 1:
          int tamanio = 0;
          double distancia = 0;
          System.out.println("Cuantos vehiculos desea ingresar: ");
          try {
            tamanio = scanner.nextInt();
          } catch (Exception e) {
            System.out.println("Error de E/S");
          }

          System.out.println("Ingrese el largo que tiene la pista en kilómetros: ");
          try {
            distancia = scanner.nextDouble();
          } catch (Exception e) {
            System.out.println("Error de E/S");
          }

          Vehiculo[] vehiculos = new Vehiculo[tamanio];

          for (int i = 0; i < tamanio; i++) {
            int nVueltas = 0;
            double promedioTiempos = 0;

            System.out.println("Ingrese el id del vehículo " + (i + 1) + ":");
            int idVehiculo = scanner.nextInt();
            System.out.println("Ingrese la marca del vehículo " + (i + 1) + ":");
            String marcaVehiculo = scanner.next();
            System.out.println("Ingrese el modelo del vehículo " + (i + 1) + ":");
            String modeloVehiculo = scanner.next();

            Vehiculo vehiculo = new Vehiculo(idVehiculo, marcaVehiculo, modeloVehiculo);
            vehiculos[i] = vehiculo;

            System.out.println("Ingrese la cantidad de vueltas que realizó el vehículo " + (i + 1) + ":");
            try {
              nVueltas = scanner.nextInt();
            } catch (Exception e) {
              System.out.println("Error de E/S");
            }

            Vuelta[] vueltas = new Vuelta[nVueltas];

            for (int v = 0; v < nVueltas; v++) {
              System.out.println("Tiempo de vuelta #" + (v + 1));
              try {
                double tiempoVuelta = scanner.nextDouble();
                Vuelta vuelta = new Vuelta(tiempoVuelta);
                vueltas[v] = vuelta;
                promedioTiempos += tiempoVuelta;
              } catch (Exception e) {
                System.out.println("Error de E/S");
              }
            }

            promedioTiempos /= nVueltas;
            promedioTiempos /= 60;
            double velocidad = distancia / promedioTiempos;
            System.out.println("La velocidad promedio del vehículo " + (i + 1) + " es: " + velocidad + " KPH");
          }

          break;

        case 0:
          System.out.println("¡Gracias por su tiempo!");
          break;

        default:
          System.out.println("Opcion no valida, vuelva a intentarlo: ");
      }
    } while (opcion != 0);
  }
}