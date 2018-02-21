package br.com.douglasramiro.imac.score.main;

import org.wildfly.swarm.Swarm;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {

//        Info info = new Info();
//        info.start();
//        try {
//            new Swarm().start().deploy();
//            String url = "http://localhost:8080";
//            if(Desktop.isDesktopSupported()){
//                Desktop desktop = Desktop.getDesktop();
//                try {
//                    desktop.browse(new URI(url));
//                } catch (IOException | URISyntaxException e) {
//                    JOptionPane.showMessageDialog(null,"Não foi possível abrir seu browser. \nPor favor, acesse o endereço http://localhost:8080");
//                    e.printStackTrace();
//                }
//            }else{
//                JOptionPane.showMessageDialog(null,"Não foi possível abrir seu browser. \nPor favor, acesse o endereço http://localhost:8080");
//            }
//
//        }catch (Exception e){
//            JOptionPane.showMessageDialog(null,"Erro ao iniciar o servidor");
//        }

        org.jboss.security.auth.spi.Util u = new org.jboss.security.auth.spi.Util();
        System.out.println(u.createPasswordHash("SHA-256","BASE64",null,null,"dsrsmoab"));

    }


    private static class Info extends Thread{
        @Override
        public void run() {
            JOptionPane.showMessageDialog(null,"O programa irá abrir seu browser. Aguarde.");
        }
    }
}


