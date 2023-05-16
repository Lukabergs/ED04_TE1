package com.mycompany.ud4_te1;

/**
 * Esta clase principal gestiona el flujo de ejecucion del programa.
 *
 * @author Luka Bergaretxe
 * @version 6.0
 */
public class Main {

// METODOS
    
    /**
     * Metodo principal del programa.
     * 
     * @param   args
     *          argumentos de linea de comandos.
     */
    public static void main(String[] args) {
        CCuenta cuentaTrabajo = new CCuenta("Antonio López","1000-2365-85-1230456789", 2500,0);
        double cantidad = 2300.0;
        operativaCuenta(cuentaTrabajo, cantidad);
    }
    
    /**
     * Metodo que encapsula la funcionalidad de operar en la cuenta bancaria.
     * 
     * @param   cuentaTrabajo
     *          CCuenta sobre la que operar.
     * @param   cantidad
     *          Double correspondiente a la cantidad a retirar.
     */
    public static void operativaCuenta(CCuenta cuentaTrabajo, double cantidad) {
        double saldoActual = cuentaTrabajo.getSaldo();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            System.out.println("Cargo en cuenta");
            cuentaTrabajo.retirar(cantidad);
            System.out.println("El nuevo saldo es: " + cuentaTrabajo.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        try {
            System.out.println("Abono en cuenta");
            cuentaTrabajo.ingresar(695);
            System.out.println("El nuevo saldo es: " + cuentaTrabajo.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
