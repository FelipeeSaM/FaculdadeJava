package primeiraAulaJframe;

import java.awt.*;
import javax.swing.*;

 

public class JanelaComBotao extends JFrame  {
    public JanelaComBotao(String titulo)  {
         super(titulo);
        Container ct = this.getContentPane();
         ct.setLayout(new FlowLayout());
         JButton b1 = new JButton("Botão 1");
         JButton b2 = new JButton("Botão 2");
         ct.add(b1);
         ct.add(b2);
         this.setSize(320,200);
         this.setVisible(true);
}
public static void main(String[] args)  {
     new JanelaComBotao("Segundo exemplo");
}
}