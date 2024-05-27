package Funcionalidade;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nome;
    private String email;
    private Set<RedeSocial> redes;

    public Usuario(RedeSocial[] redes){
        this.redes = new HashSet<>();
        Collections.addAll(this.redes, redes);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RedeSocial[] getRedes(){
        return this.redes.toArray(new RedeSocial[0]);
    }
}
