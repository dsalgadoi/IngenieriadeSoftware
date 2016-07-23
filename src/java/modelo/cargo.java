/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author dsalgado
 */
class cargo {
    private area areaCargo;
    private int id_cargo;
    private String nombre_cargo;
    private double salario_mensual;
    private double valor_hora;

    public cargo(area areaCargo, String nombre_cargo, double salario_mensual, double valor_hora) {
        this.areaCargo = areaCargo;
        this.nombre_cargo = nombre_cargo;
        this.salario_mensual = salario_mensual;
        this.valor_hora = valor_hora;
    }

    public cargo(area areaCargo, int id_cargo, String nombre_cargo, double salario_mensual, double valor_hora) {
        this.areaCargo = areaCargo;
        this.id_cargo = id_cargo;
        this.nombre_cargo = nombre_cargo;
        this.salario_mensual = salario_mensual;
        this.valor_hora = valor_hora;
    }

    
    
    public area getAreaCargo() {
        return areaCargo;
    }

    public void setAreaCargo(area areaCargo) {
        this.areaCargo = areaCargo;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getNombre_cargo() {
        return nombre_cargo;
    }

    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }

    public double getSalario_mensual() {
        return salario_mensual;
    }

    public void setSalario_mensual(double salario_mensual) {
        this.salario_mensual = salario_mensual;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }
    
    
}
