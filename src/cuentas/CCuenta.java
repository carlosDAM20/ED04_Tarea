package cuentas;

/**
 *
 * @author Carlos J. Cortés
 * @version 1.0
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Metodo para obtener el nombre
     *
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para insertar el nombre
     *
     * @param nombre el nombre a insertar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener la cuenta
     *
     * @return la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Metodo para insertar la cuenta
     *
     * @param cuenta la cuenta a insertar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Metodo para obtener el saldo
     *
     * @return el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo para insertar el saldo
     *
     * @param saldo el saldo a insertar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo para obtener el tipo de interes
     *
     * @return el tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * metodo para establecer el tipo de interes
     *
     * @param tipoInterés el tipoInterés a establecer
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Este es el metodo constructor por defecto
     */
    public CCuenta() {
    }

    /**
     * Este es el metodo constructor con parametros
     *
     * @param nom para el nombre
     * @param cue para la cuenta
     * @param sal para el saldo
     * @param tipo para el tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Metodo para retornar el saldo
     *
     * @return retorna el saldo
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * metodo para realizar ingresos en cuenta
     *
     * @param cantidad para la cantidad a ingresas
     * @throws Exception si el valor introducido es negativo
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo para retirar cantidades de la cuenta
     *
     * @param cantidad para la cantidad a retirar
     * @throws Exception si el valor introducido es negativo o no hay suficiente
     * saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
