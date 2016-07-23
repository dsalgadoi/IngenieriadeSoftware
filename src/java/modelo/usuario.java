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
public class usuario {
    
    private cargo cargoUsuario;
    private String correo_electronico;
    private int id_usuario;
    private String identificacion_usuario ;
    private String nombre_usuario;
    private rol rolUsuario;
    private String passwd;

    public usuario(cargo cargoUsuario, String correo_electronico, int id_usuario, String identificacion_usuario, String nombre_usuario, rol rolUsuario, String passwd) {
        this.cargoUsuario = cargoUsuario;
        this.correo_electronico = correo_electronico;
        this.id_usuario = id_usuario;
        this.identificacion_usuario = identificacion_usuario;
        this.nombre_usuario = nombre_usuario;
        this.rolUsuario = rolUsuario;
        this.passwd = passwd;
    }

    public usuario(int id_usuario, String nombre_usuario, rol rolUsuario, String passwd) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.rolUsuario = rolUsuario;
        this.passwd = passwd;
    }

    
    
    
    public cargo getCargoUsuario() {
        return cargoUsuario;
    }

    public void setCargoUsuario(cargo cargoUsuario) {
        this.cargoUsuario = cargoUsuario;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getIdentificacion_usuario() {
        return identificacion_usuario;
    }

    public void setIdentificacion_usuario(String identificacion_usuario) {
        this.identificacion_usuario = identificacion_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public rol getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(rol rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    
}
