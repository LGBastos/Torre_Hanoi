import Exceptions.PilhaCheiaException;
import Exceptions.PilhaVaziaException;
import Pilha.Pilha;
import Pilha.PilhaEstatica;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Torre {
    private Pilha<Disco> torre;
    private int capacidadeTorre = 0;
    private String nome;

    public Torre(int totalDiscos, String nome) {
        this.torre = new PilhaEstatica<Disco>(totalDiscos);
        this.nome = nome;
        this.capacidadeTorre = totalDiscos;

    }
    public void preencherTorre(){
        for (int i = this.capacidadeTorre; i>0; i--) {
            this.adicionaDisco(new Disco(i+2));
        }
    }
    

    public void adicionaDisco(Disco a){
        try{
            this.torre.push(a);
        }catch (PilhaCheiaException p){
            System.out.println("Apilha está cheia");
        }

    }
    public Disco removerDisco(){


        try {
            return this.torre.pop();
        } catch (PilhaVaziaException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder discos = new StringBuilder();
        Iterator<Disco> torreTemp = torre.get();
        for (Iterator<Disco> it = torreTemp; it.hasNext(); ) {
            Disco d = it.next();
            discos.append(d.getDesenho()).append("\n");
        }
//        for (int i = qtdDiscos-1 ; i>=0 ; i--) {
//            Disco disco = torreTemp.get(i);
//            discos.append(disco.getDesenho()).append("\n");
//        }
        discos.append(this.nome+"_______________________________");
        return discos.toString();
    }


    public String getNome() {
        return this.nome;
    }
	public String[] getTorre() {
		
		String[] str = new String[capacidadeTorre+1];
		Iterator<Disco> tp = torre.get();
        for (int i = 0; tp.hasNext(); i++ ) {
            str[i] = tp.next().getDesenho();
        }
        str[str.length-1] = getNome();
		return str;
	}
}
