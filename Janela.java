package primeiraAulaJframe;

import java.awt.*;
import javax.swing.*;

 

public class Janela extends JFrame  {
    public Janela(String titulo)  {
         super(titulo);
          this.setSize(640,480);
          this.setVisible(true);
          
    }
    public static void main(String[] args)  {
          new Janela("Minha primeira aplicação Swing");
    }
      }

