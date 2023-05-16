package com.mycompany.ud4_te1;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public String getCuenta() {
        return this.cuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getTipoInteres() {
        return this.tipoInteres;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        this.saldo += cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (this.getSaldo() < cantidad + 2)
            throw new Exception ("No se hay suficiente saldo");
        this.saldo -= (cantidad + 2);
    }

}
