package Funcionalidade;

import Funcionalidade.Interfaces.Compartilhamento;
import Funcionalidade.Interfaces.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void compartilhar() {
        System.out.println("Compartilhando foto no Google+!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Google+!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no Google+!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentando no Google+!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizando vídeo conferência no Google+!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtindo publicação no Google+!");
    }
}
