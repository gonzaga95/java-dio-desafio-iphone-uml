package edu.ada.iphone.model;

import edu.ada.iphone.interfaces.NavegadorInternet;
import edu.ada.iphone.interfaces.ReprodutorMusical;
import edu.ada.iphone.interfaces.Telefone;

public class Iphone implements ReprodutorMusical, Telefone, NavegadorInternet {
    public void acessarPagina() {
        System.out.println("Abrindo página");
    }

    public void novaAba() {
        System.out.println("Abrindo nova aba");
    }

    public void fecharAba() {
        System.out.println("Fechando aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    public void pausarMusica() {
        System.out.println("Pausando música");
    }

    public void avancarMusica() {
        System.out.println("Tocando próxima música");
    }

    public void voltarMusica() {
        System.out.println("Tocando música anterior");
    }

    public void fazerChamada() {
        System.out.println("Realizando chamada...");
    }

    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    public void enviarMensagem() {
        System.out.println("Enviando mensagem...");
    }
}
