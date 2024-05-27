package Funcionalidade;
import Exceptions.Unchecked;

public class Main {
    public static void main(String[] args) {

        //Instanciando as redes sociais
        Facebook facebook = new Facebook();
        Twitter twitter = new Twitter();
        Instagram instagram = new Instagram();
        GooglePlus googlePlus = new GooglePlus();

        //Alterando os atributos
        facebook.senha = "f12345";
        facebook.numAmigos = 150;

        twitter.senha = "t12345";
        twitter.numAmigos = 10;

        instagram.senha = "i12345";
        instagram.numAmigos = 1500;

        googlePlus.senha = "g12345";
        googlePlus.numAmigos = 70;

        //Instanciando o array de redes sociais
        RedeSocial[] redes = new RedeSocial[2];
        redes[0] = googlePlus;
        redes[1] = twitter;

        //Instanciando o usuário
        Usuario usuario = new Usuario(redes);

        //Definindo os atributos
        usuario.setNome("Antonio");
        usuario.setEmail("antonio.silva@ges.inatel.br");

        //Try-catch para realizar a verificação de exceção, e imprimindo os métodos das redes sociais do usuário
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
