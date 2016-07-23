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
class area {
    
    private departamento departamentoArea;
    private int id_area;
    private String nombre_area;

    public area(departamento departamentoArea, int id_area, String nombre_area) {
        this.departamentoArea = departamentoArea;
        this.id_area = id_area;
        this.nombre_area = nombre_area;
    }

    
    
    public departamento getDepartamentoArea() {
        return departamentoArea;
    }

    public void setDepartamentoArea(departamento departamentoArea) {
        this.departamentoArea = departamentoArea;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public String getNombre_area() {
        return nombre_area;
    }

    public void setNombre_area(String nombre_area) {
        this.nombre_area = nombre_area;
    }
    
    
    
}
