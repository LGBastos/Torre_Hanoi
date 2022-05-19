public class Disco {
    private int tamanho;

    public Disco(int i) {
        tamanho = i;
    }

    public String getDesenho(){
        StringBuilder disco = new StringBuilder();
        for (int i = 0; i < this.tamanho; i++) {
            disco.append("#");
        }
        return disco.toString();
    }
}
