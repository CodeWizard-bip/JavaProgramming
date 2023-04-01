/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;

public class CuentaBancariaServicio {
     public void crearCuenta(CuentaBancaria cuenta) {
        // Código para pedir datos al usuario y asignarlos a la cuenta
    }

    public void ingresar(CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        saldoActual += cantidad;
        cuenta.setSaldoActual(saldoActual);
    }

    public void retirar(CuentaBancaria cuenta, double cantidad) {
        double saldoActual = cuenta.getSaldoActual();
        if (cantidad <= saldoActual) {
            saldoActual -= cantidad;
        } else {
            saldoActual = 0;
        }
        cuenta.setSaldoActual(saldoActual);
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        double limite = saldoActual * 0.2;
        saldoActual -= limite;
        cuenta.setSaldoActual(saldoActual);
    }

    public double consultarSaldo(CuentaBancaria cuenta) {
        return cuenta.getSaldoActual();
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
}
