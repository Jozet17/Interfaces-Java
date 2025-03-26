/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.vehiculo;
import Vista.vista;

public class controlador {
    private vehiculo objvehiculo;
    private vista objinterfaz;
    public controlador(){
        this.objinterfaz = new vista();
        this.objvehiculo = new vehiculo();
    }
    
}
