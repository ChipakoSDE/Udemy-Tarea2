import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre o descripción de la factura");
        String nombreFactura = scanner.nextLine();
        double precio1 = 0.0;
        double precio2 = 0.0;

        System.out.println("Ingrese el precio del primer producto");
        try {
            precio1 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero");
            main(args);
            return;
        }
        System.out.println("Ingrese el precio del segundo producto");
        try {
            precio2 = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero");
            main(args);
            return;
        }
        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;
        String totalBrutoStr = Double.toString(totalBruto);
        String impuestoStr = Double.toString(impuesto);
        String totalNetoStr = Double.toString(totalNeto);
        String mensaje = "La factura " + nombreFactura + " tiene un total bruto de $" + totalBrutoStr
                + ", con un impuesto de $" + impuestoStr + " y el monto final despues de impuestos es $" + totalNetoStr;
        System.out.println(mensaje);


    }
}
