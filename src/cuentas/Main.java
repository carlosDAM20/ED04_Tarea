package cuentas;

/**
 *
 * @author Carlos J. Cortés
 * @version 1.0
 * @see CCuenta
 */
public class Main {

    /**
     * Metodo principal donde se inicializa la aplicación
     *
     * @param args para iniciar la aplicacion
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = operativa_cuenta();

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    /**
     * metodo para realizar la operativa de la cuenta
     *
     * @return el saldo de la cuenta
     */
    private static CCuenta operativa_cuenta() {

        float cantidad;
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        return cuenta1;
    }
}
