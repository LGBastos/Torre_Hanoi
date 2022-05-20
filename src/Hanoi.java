import java.util.Collection;
import java.util.Collections;

public class Hanoi {

    static private Torre torre1;
    static private Torre torre2;
    static private Torre torre3;

    static public void solucaoHanoi(int totalDiscos){
   
        torre2 = new Torre(totalDiscos,"Torre2");
        torre3 = new Torre(totalDiscos,"Torre3");
        torre1= new Torre(totalDiscos, "Torre1");
        torre1.preencherTorre();
        desenhaTorres();
        hanoi(totalDiscos, torre1, torre2, torre3);

    }

    static private void desenhaTorres(){
   	 String[][] tabuleiro = new String[torre1.getTorre().length+1][torre1.getTorre().length+1];
   	 
   	  String[] torres1= torre1.getTorre();
   	  String[] torres2= torre2.getTorre();
   	  String[] torres3= torre3.getTorre();
   	  
   	  tabuleiro[0] = torres1;
   	  tabuleiro[1] = torres2;
   	  tabuleiro[2] = torres3;

   	 for (int i = 0; i < torres1.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(String.format("%6s ", tabuleiro[j][i] == null?"|":tabuleiro[j][i]));
			}
			System.out.println("");
		}
  
   }
    static private void mover(Torre d, Torre p){
    	System.out.println(" ");
        System.out.printf("Move disco de %s para %s\n\n", d.getNome(), p.getNome());
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
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
