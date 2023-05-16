package com.mycompany.ud4_te1;


public class Main {

    public static void main(String[] args) {
        CCuenta cuentaTrabajo = new CCuenta("Antonio López","1000-2365-85-1230456789", 2500,0);
        operativaCuenta(cuentaTrabajo);
    }
    
    public static void operativaCuenta(CCuenta cuentaTrabajo) {
        double saldoActual = cuentaTrabajo.getSaldo();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            System.out.println("Cargo en cuenta");
            cuentaTrabajo.retirar(2300);
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
