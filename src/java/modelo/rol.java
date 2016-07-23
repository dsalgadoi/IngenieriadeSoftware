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
class rol extends usuario {
    private String descripcion_rol;
    private int id_rol;
    private String nombre_rol;

    public rol(cargo cargoUsuario, String correo_electronico, int id_usuario, String identificacion_usuario, String nombre_usuario, rol rolUsuario, String passwd) {
        super(cargoUsuario, correo_electronico, id_usuario, identificacion_usuario, nombre_usuario, rolUsuario, passwd);
    }

    public rol(int id_usuario, String nombre_usuario, rol rolUsuario, String passwd) {
        super(id_usuario, nombre_usuario, rolUsuario, passwd);
    }

    

    public String getDescripcion_rol() {
        return descripcion_rol;
    }

    public void setDescripcion_rol(String descripcion_rol) {
        this.descripcion_rol = descripcion_rol;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }
    
    
}
