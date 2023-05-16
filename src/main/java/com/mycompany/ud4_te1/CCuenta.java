package com.mycompany.ud4_te1;

/**
 * Esta clase representa una cuenta bancaria con un nombre de titular, numero de cuenta,
 * saldo y tasa de interes asociados. Ofrece metodos para ingresar y retirar dinero, así como para
 * obtener el nombre del titular, el numero de cuenta, el saldo actual y la tasa de interes aplicada.
 * Tambien se aplica una comision por cada retirada.
 *
 * @author Luka Bergaretxe
 * @version 6.0
 */
public class CCuenta {

// CONSTANTES

    public static final int COMISION = 2;

// ATRIBUTOS

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

// METODOS

    // Constructores

    /**
     * Crea una instancia de CCuenta a partir de un nombre de titular, numero de cuenta, 
     * saldo inicial y tasa de interes determinados.
     * 
     * @param   nom 
     *          Nombre del titular de la cuenta.
     * @param   cue
     *          Numero de cuenta.
     * @param   sal
     *          Saldo inicial.
     * @param   tipo
     *          Tasa de interes.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
    }

    // Getters

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return
     *          Double correspondiente al nombre del titular.
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Obtiene el numero de cuenta.
     * 
     * @return
     *          Double correspondiente al numero de cuenta.
     */
    public String getCuenta() {
        return this.cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return
     *          Double correspondiente al saldo actual.
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Obtiene el tipo de interes aplicado a la cuenta.
     * 
     * @return
     *          Double correspondiente al tipo de interes aplicado.
     */
    public double getTipoInteres() {
        return this.tipoInteres;
    }

    // Setters

    /**
     * Asigna un nombre al titular de la cuenta.
     * 
     * @param   nombre
     *          String correspondiente al nombre a asignar al titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Asigna un tipo de interes a aplicar a la cuenta.
     * 
     * @param   tipoInteres
     *          Double correspondiente al tipo de interes a aplicar.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    // Otros
    
    /**
     * Ingresa una cantidad de dinero determinada en la cuenta.
     * 
     * @param   cantidad
     *          Double correspondiente a la cantidad de dinero a ingresar.
     * @throws  Exception
     *          Si la cantidad a ingresar es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        this.saldo += cantidad;
    }

    /**
     * Retira una cantidad de dinero determinada de la cuenta.
     * Se aplica una comision por cada retirada.
     * 
     * @param   cantidad
     *          Double correspondiente a la cantidad de dinero a retirar.
     * @throws  Exception
     *          Si la cantidad a retirar es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (this.getSaldo() < cantidad + COMISION)
            throw new Exception ("No hay suficiente saldo");
        this.saldo -= (cantidad + COMISION);
    }

}
