
package examen1;

import java.util.Scanner;
public class Examen1 {

    public static void main(String[] args) {
       Scanner lectura = new Scanner(System.in);
       double precio1=1250.45;
       double  precio2=3743.00;
       double  precio3=2683.78;
       double compra1=850.10;
       double compra2=850.10;
       double compra3=850.10;
       double ganancia1= precio1-compra1;
      double total1= (ganancia1/compra1)*100;
      double ganancia2= precio2-compra2;
      double total2=ganancia2/compra2;
      double ganancia3= precio3-compra3;
      double tota3=ganancia3/compra3;
        System.out.println("Nombre del instrumento" );
         String intrumento1 = lectura.nextLine();
         
         System.out.println("Su precio de venta");
         double precio = lectura.nextDouble();
        System.out.println("precio de compra"  );
        double compra=lectura.nextDouble();
       
    
         System.out.println("ganacia " + ganancia1);
     double ganancia=lectura.nextDouble();
     
      System.out.println("El total " + total1);
       double tota=lectura.nextDouble();
       lectura.close();
    }
    
}
