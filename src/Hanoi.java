public class Hanoi {

    static private Torre torre1;
    static private Torre torre2;
    static private Torre torre3;

    static public void solucaoHanoi(int totalDiscos){
        torre2 = new Torre("Torre_2");
        torre3 = new Torre("Torre_3");
        torre1= new Torre(totalDiscos, "Torre_1");
        desenhaTorres();
        hanoi(totalDiscos, torre1, torre2, torre3);

    }

    static private void desenhaTorres(){
        System.out.println(torre1);
        System.out.println(torre2);
        System.out.println(torre3);
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
    static private void mover(Torre d, Torre p){
        System.out.printf("Move disco de %s para %s\n\n", d.getNome(), p.getNome());
        p.adicionaDisco(d.removerDisco());
        desenhaTorres();

    }
    static private void hanoi(int n, Torre d, Torre aux, Torre p){
        if(n==1) {
            mover(d,p);
        }else{
            hanoi(n-1,d,p,aux);
            mover(d,p);
            hanoi(n-1,aux,d,p);
        }

    }




}
