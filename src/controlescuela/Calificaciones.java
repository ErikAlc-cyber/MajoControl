/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlescuela;

/**
 *
 * @author Lenovo C20-00
 */
public class Calificaciones {
    public double califAlumXMateria;
    
    public Calificaciones(double califIni){
        califAlumXMateria = califIni;
    }
    
    void registrarCalifAlum(double calif){
        califAlumXMateria = calif;
    }
    
    double consultar(){
        return califAlumXMateria;
    }
    
    
}
