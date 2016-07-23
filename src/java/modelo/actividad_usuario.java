/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;



/**
 *
 * @author dsalgado
 */
public class actividad_usuario {
    
    private tipo_actividad actividadRealizada;
    private String descripcion_actividad;
    private Date fecha_registro;
    private int horas_laboradas;
    private int id_actividad_usuario;
    private usuario usuarioR;

    public actividad_usuario(tipo_actividad actividadRealizada, String descripcion_actividad, Date fecha_registro, int horas_laboradas, int id_actividad_usuario, usuario usuarioR) {
        this.actividadRealizada = actividadRealizada;
        this.descripcion_actividad = descripcion_actividad;
        this.fecha_registro = fecha_registro;
        this.horas_laboradas = horas_laboradas;
        this.id_actividad_usuario = id_actividad_usuario;
        this.usuarioR = usuarioR;
    }

    
    
    public tipo_actividad getActividadRealizada() {
        return actividadRealizada;
    }

    public void setActividadRealizada(tipo_actividad actividadRealizada) {
        this.actividadRealizada = actividadRealizada;
    }

    public String getDescripcion_actividad() {
        return descripcion_actividad;
    }

    public void setDescripcion_actividad(String descripcion_actividad) {
        this.descripcion_actividad = descripcion_actividad;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getHoras_laboradas() {
        return horas_laboradas;
    }

    public void setHoras_laboradas(int horas_laboradas) {
        this.horas_laboradas = horas_laboradas;
    }

    public int getId_actividad_usuario() {
        return id_actividad_usuario;
    }

    public void setId_actividad_usuario(int id_actividad_usuario) {
        this.id_actividad_usuario = id_actividad_usuario;
    }

    public usuario getUsuarioR() {
        return usuarioR;
    }

    public void setUsuarioR(usuario usuarioR) {
        this.usuarioR = usuarioR;
    }
    
    
}
