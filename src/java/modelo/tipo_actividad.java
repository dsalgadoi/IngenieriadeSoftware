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
class tipo_actividad {
    private cargo cargoActividad;
    private String descripcion_actividad;
    private int id_actividad;
    private String nombre_actividad;

    public tipo_actividad(cargo cargoActividad, String descripcion_actividad, int id_actividad, String nombre_actividad) {
        this.cargoActividad = cargoActividad;
        this.descripcion_actividad = descripcion_actividad;
        this.id_actividad = id_actividad;
        this.nombre_actividad = nombre_actividad;
    }

    public cargo getCargoActividad() {
        return cargoActividad;
    }

    public void setCargoActividad(cargo cargoActividad) {
        this.cargoActividad = cargoActividad;
    }

    public String getDescripcion_actividad() {
        return descripcion_actividad;
    }

    public void setDescripcion_actividad(String descripcion_actividad) {
        this.descripcion_actividad = descripcion_actividad;
    }

    public int getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(int id_actividad) {
        this.id_actividad = id_actividad;
    }

    public String getNombre_actividad() {
        return nombre_actividad;
    }

    public void setNombre_actividad(String nombre_actividad) {
        this.nombre_actividad = nombre_actividad;
    }
    
    
}
