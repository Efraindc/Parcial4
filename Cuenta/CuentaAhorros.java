/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebacuenta1;

/**
 *
 * @author USUARIO
 */
class CuentaAhorros extends Cuenta {

    private boolean activa;
   
    public CuentaAhorros(float saldo, float tasa) {
        super(saldo, tasa);
            if (saldo < 10000) 
                activa = false;
            else
                activa = true;
             }

    @Override
    public void retirar(float cantidad) {
        if (activa==true) // Si la cuenta está activa, se puede retirar dinero
            super.retirar(cantidad);
    }

    @Override
    public void consignar(float cantidad) {
        if (activa==true) // Si la cuenta está activa, se puede consignar dinero
            super.consignar(cantidad);
    }
    /**
    * Método que genera el extracto mensual de una cuenta de ahorros
    */
    @Override
    public void extractoMensual() {
    /* Si la cantidad de retiros es superior a cuatro, se genera una
    comisión mensual */
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
    super.extractoMensual(); 
    if ( saldo < 10000 )
        activa = false;
        }

    public void imprimir() {
            System.out.println("Saldo = $ " + saldo);
            System.out.println("Comision mensual = $ " + comisionMensual);
            System.out.println("Numero de transacciones = " + (numeroConsignaciones + numeroRetiros));
            System.out.println();
            }
}