/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 * Esta clase crea objeto de una TV
 * @author RubenHH/FerMS
 * @version 1.0
 */
public abstract class Television {
    String color="";
    double electricidad=0;
    int transmision=0;
    int peso=0;
    String modelo="";
    int año=0;
    String pixeles="";
    String tipotele="";
    float tipopantalla=0;
    String marca="";
    
    /**
     * 
     * @param electricidad Electricidad que se da a la television
     * @param color Numero de color
     */
    Television(int electricidad,String color){
        this.color=color;
        this.electricidad=electricidad;
        
    }
    
    /**
     *
     * @param transmision Tipo de transmision
     * @param peso Su peso
     */
    Television(int transmision,int peso){
        this.peso=0;
        this.transmision=0;
    }
    /**
     * 
     * @param modelo Modelo de la TV
     * @param año Año de la TV
     */
    Television(String modelo, int año){
        this.modelo=modelo;
        this.año=año;
    }
    /**
     * 
     * @param pixeles No de pixeles
     * @param tipo Tipo de TV
     */
    Television(String pixeles, String tipo){
        this.pixeles=pixeles;
        this.tipotele=tipo;
    }
    /**
     * 
     * @param tipo Tipo de Pantalla
     * @param marca Marca de la TV
     */
    Television(float tipo, String marca){
        this.marca=marca;
        this.tipopantalla=tipo;
    }
    
    
    public abstract void transmitir();
    
    public abstract void apagar();
    
    public abstract void prender();
    
}
