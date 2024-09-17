package edu.ada.iphone;

import edu.ada.iphone.model.Iphone;

public class Principal {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        //Acessando métodos do objeto meuIphone
        meuIphone.fazerChamada();
        meuIphone.acessarPagina();
    }
}
