package boing;

import java.util.Scanner;

public class Boing {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numbultos, e = 0;
        double carga, cargatotal = 0, menor = 0, mayor, prom, valor, pesos, disponible=18000;
        do{
        System.out.println("Ingrese el numero de bultos que desea ingresar mayor a 50: ");
        numbultos = entrada.nextInt();}
        while(numbultos < 50);
        double[] array = new double[numbultos];

        for (int i = 0; i <= numbultos; i++) {

            if (cargatotal >= 18000) {
                break;
            }
            
            System.out.println("Ingrese el peso del bulto #" + e);
            carga = entrada.nextDouble();
            
            if(!(carga > disponible)){
            if (carga > 500) {
                System.out.println("No puede exeder 500 kg por bulto");
                e--;
            } else {
                array[e] = carga;
                cargatotal = cargatotal + carga;
                disponible = disponible - carga;
            }
            e++;
            }else{
                System.out.println("Debe ingresar un bulto no mayor al peso disponible el valor disponible es :"+disponible);
                if(disponible <= 0){
                    break;
                }
            }
            

        }
        prom = cargatotal / e;
        int numarray = e;
        //Numero total de bultos
        System.out.println("El numero total de bultos es : " + e++ + "  ");

        //Encontrar el numero menor
        e = 0;
        for (int i = 1; i <= numarray; i++) {

            if (menor == 0) {
                menor = array[e];
            } else if (menor > array[e]) {
                menor = array[e];
            }
            e++;
        }
        System.out.println("El bulto peso del mas liviano es : " + menor + "  ");

        //Encontrar el numero mayor
        e = 0;
        mayor = menor;
        for (int i = 1; i <= numbultos; i++) {

            if (mayor < array[e]) {
                mayor = array[e];
            }
            e++;
        }
        System.out.println("El bulto peso del mas pesado es  : " + mayor + "  ");

        //Promedio
        System.out.println("El peso promedio es de : " + prom + "  ");
        
        //Valor
        e=0;
        numarray--;
        for (int i = 0; i <= numarray; i++) {
            
            if(array[e] <= 25){
                pesos=0;
            }else if (array[e] <= 300){
                pesos = 1500;
            }else{
                pesos =2500;
            }
            valor = array[e]*pesos;
            System.out.println("El valor del bulto #"+e+" es de: $"+valor+"  Su peso es de: "+array[e]);
            e++;
        }
        
        System.out.println("La carga total es de  bulto "+cargatotal);
        

    }

}
