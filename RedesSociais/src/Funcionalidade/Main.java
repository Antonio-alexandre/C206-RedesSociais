package Funcionalidade;
import Exceptions.Unchecked;

public class Main {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        Twitter twitter = new Twitter();
        Instagram instagram = new Instagram();
        GooglePlus googlePlus = new GooglePlus();

        facebook.senha = "f12345";
        facebook.numAmigos = 150;

        twitter.senha = "t12345";
        twitter.numAmigos = 10;

        instagram.senha = "i12345";
        instagram.numAmigos = 1500;

        googlePlus.senha = "g12345";
        googlePlus.numAmigos = 70;

        RedeSocial[] redes = new RedeSocial[2];
        redes[0] = googlePlus;
        redes[1] = twitter;

        Usuario usuario = new Usuario(redes);

        usuario.setNome("Antonio");
        usuario.setEmail("antonio.silva@ges.inatel.br");

        try{
            ((GooglePlus) usuario.getRedes()[0]).fazStreaming();
            usuario.getRedes()[0].postarVideo();
            usuario.getRedes()[0].curtirPublicacao();

            ((Twitter)usuario.getRedes()[1]).compartilhar();
            usuario.getRedes()[1].postarFoto();
            usuario.getRedes()[1].postarComentario();
        }
        catch (Unchecked e){
            e.printStackTrace();
        }
    }
}
