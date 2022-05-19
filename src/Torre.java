import java.util.ArrayList;
import java.util.List;

public class Torre {
    private List<Disco> torre = new ArrayList<>();
    private int qtdDiscos = 0;
    private String nome;

    public Torre(int totalDiscos, String nome) {
        this.nome = nome;
        for (int i = totalDiscos; i>0; i--) {
            this.adicionaDisco(new Disco(i+2));
        }
    }

    public Torre(String nome) {
        this.nome = nome;

    }

    public void adicionaDisco(Disco a){
        this.torre.add(a);
        qtdDiscos++;
    }
    public Disco removerDisco(){
        qtdDiscos--;
        return this.torre.remove(qtdDiscos);
    }

    @Override
    public String toString() {
        StringBuilder discos = new StringBuilder();
        for (int i = qtdDiscos-1 ; i>=0 ; i--) {
            Disco disco = torre.get(i);
            discos.append(disco.getDesenho()).append("\n");
        }
        discos.append(this.nome+"_______________________________");
        return discos.toString();
    }
    public String get(int i){
        return torre.get(i).getDesenho();
    }

    public String getNome() {
        return this.nome;
    }
}
