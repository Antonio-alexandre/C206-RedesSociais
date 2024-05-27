package Funcionalidade;

import Funcionalidade.Interfaces.Compartilhamento;
import Funcionalidade.Interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no Facebook!");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando vídeo no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentando no Facebook!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizando vídeo conferência no Facebook!");
    }

    @Override
    public void curtirPublicacao(){
        System.out.println("Curtindo publicação no Facebook!");
    }
}
