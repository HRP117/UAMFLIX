package CONTROLLER;


import VIEW.CONTENIDO.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import PELICULAS.*;

import DOCUMENTALES.*;
import SERIES.*;

import VIEW.PRINCIPAL.menuCU;

    
    

public class OyentecontenidoMultimedia implements ActionListener{
    //GUIS
    
     
    
    Cliente_Pelicuals cp; // GUI PELICULAS
    Cliente_Series cs; //GUI SERIES
    Cliente_Documentales cd; //GUI DOCUMENTALES
    
    //BOTONES
    JButton cp_Regresar, cp_Series, cp_Documentales, cp_Play, cp_Stop, cp_Darko, cp_Belleza;// BOTONEES GUI PELICULA
    JButton cs_Regresar, cs_Peliculas,cs_Documentales, cs_Play,cs_Stop, cs_Bob, cs_Malcom;//BOTONES GUI SERIE
    JButton cd_Regresar, cd_Peliculas, cd_Series, cd_Play,cd_Stop ,cd_Columbine ,cd_Blue ;//BOTONES GUI DOCUMENTALES
    // CONSTRUCTOR CLIENTE PELICULAS
     public OyentecontenidoMultimedia(Cliente_Pelicuals cp,JButton regresar, JButton series, JButton doc, JButton play, JButton stop, JButton belleza, JButton darko ){
         this.cp = cp;
         this.cp_Documentales = doc;
         this.cp_Regresar = regresar;
         this.cp_Series = series;
         this.cp_Play = play;
         this.cp_Stop =stop;
         this.cp_Belleza = belleza;
         this.cp_Darko = darko;
         
     }
     // series
     public OyentecontenidoMultimedia(Cliente_Series cs,JButton regresar,JButton peliculas, JButton doc, JButton play, JButton stop, JButton bob, JButton malcom){
         this.cs = cs;
         this.cs_Regresar = regresar;
         this.cs_Peliculas = peliculas;
         this.cs_Documentales = doc;
         this.cs_Play = play;
         this.cs_Stop = stop;
         this.cs_Bob = bob;
         this.cs_Malcom = malcom;
     }
     
     public OyentecontenidoMultimedia(Cliente_Documentales cd,JButton regresar, JButton peliculas, JButton series, JButton play, JButton stop, JButton columbine, JButton blue){
       this.cd = cd;
       this.cd_Regresar = regresar;
       this.cd_Series = series;
       this.cd_Peliculas = peliculas;
       this.cd_Play = play;
       this.cd_Stop = stop;
       this.cd_Columbine = columbine;
       this.cd_Blue = blue;
     }
     
  
     
    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object botonPresionado = ae.getSource();
        //CONDICIONES PARA GUI CLIENTE_PELICULA
        AVATAR avatar = new AVATAR();
        DARKO darko = new DARKO();
        BELLEZA belleza = new BELLEZA ();
        COSMOS cosmos = new COSMOS();
        COLUMBINE columbine = new COLUMBINE();
        BLUE blue = new BLUE();
        MANDALORIAN mandalorian = new MANDALORIAN();
        BOB bob = new BOB();
        MALCOM malcom = new MALCOM();
        
        
        if(botonPresionado==cp_Regresar){
            new menuCU().setVisible(true);
            cp.setVisible(false);
        }
        
        if(botonPresionado==cp_Play){           
           cp.REPRODUCTOR.add(avatar);
           avatar.setVisible(true);
           cp.JB_STOP.setVisible(true);          
        }
        
        if(botonPresionado==cp_Darko){
           cp.REPRODUCTOR.add(darko);
           darko.setVisible(true);
           cp.JB_STOP.setVisible(true); 
        }
        
        if(botonPresionado==cp_Belleza){
           cp.REPRODUCTOR.add(belleza);
           belleza.setVisible(true);
           cp.JB_STOP.setVisible(true);  
        }
        
        if(botonPresionado==cp_Series){
            new Cliente_Series().setVisible(true);
            cp.setVisible(false);
        }
        
        if(botonPresionado==cp_Documentales){
            new Cliente_Documentales().setVisible(true);
            cp.setVisible(false);
        }
        
        if(botonPresionado==cp_Stop){
              
              cp.REPRODUCTOR.removeAll();
              cp.JB_STOP.setVisible(false);
        }
        
        
        
        //ACCIONES DE LOS BOTONES GUI SERIES
        
        if(botonPresionado==cs_Regresar){
            new menuCU().setVisible(true);
            cs.setVisible(false);
        }
        
        if(botonPresionado==cs_Peliculas){
            new Cliente_Pelicuals().setVisible(true);
            cs.setVisible(false);
        }
        
        if(botonPresionado==cs_Documentales){
            new Cliente_Documentales().setVisible(true);
            cs.setVisible(false);
        }
        
        if(botonPresionado==cs_Play){
           cs.REPRODUCTOR.add(mandalorian);
           mandalorian.setVisible(true);
           cs.JB_STOP.setVisible(true);  
        }
        
        if(botonPresionado==cs_Bob){
           cs.REPRODUCTOR.add(bob);
           bob.setVisible(true);
           cs.JB_STOP.setVisible(true);  
        }
        
        if(botonPresionado==cs_Malcom){
           cs.REPRODUCTOR.add(malcom);
           malcom.setVisible(true);
           cs.JB_STOP.setVisible(true);  
        }
        
        
         if(botonPresionado==cs_Stop){
              
              cs.REPRODUCTOR.removeAll();
              cs.JB_STOP.setVisible(false);
        }
        
        
        //ACCIONES DE LOS BOTONES DE LA GUI DOCUMENTALES
        
        if(botonPresionado==cd_Regresar){
            new menuCU().setVisible(true);
            cd.setVisible(false);
        }
        
        if(botonPresionado==cd_Series){
            new Cliente_Series().setVisible(true);
            cd.setVisible(false);
        }
        
        if(botonPresionado==cd_Peliculas){
            new Cliente_Pelicuals().setVisible(true);
            cd.setVisible(false);
        }
        
        if(botonPresionado==cd_Play){
           cd.REPRODUCTOR.add(cosmos);
           cosmos.setVisible(true);
           cd.JB_STOP.setVisible(true);   
        }
        
         if(botonPresionado==cd_Columbine){
           cd.REPRODUCTOR.add(columbine);
           columbine.setVisible(true);
           cd.JB_STOP.setVisible(true);   
        }
        
          if(botonPresionado==cd_Blue){
           cd.REPRODUCTOR.add(blue);
           blue.setVisible(true);
           cd.JB_STOP.setVisible(true);   
        }
        
        
         if(botonPresionado==cd_Stop){
              
              cd.REPRODUCTOR.removeAll();
              cd.JB_STOP.setVisible(false);
        }
        
    }
    
     
}

