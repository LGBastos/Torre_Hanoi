package Pilha;

import Exceptions.PilhaCheiaException;
import Exceptions.PilhaVaziaException;

import java.util.Iterator;
import java.util.Arrays;
public class PilhaEstatica<T> implements Pilha<T> {
    private T[] elementos;
    private int topo;

    @SuppressWarnings("unchecked")
    public PilhaEstatica(int tamanho) {
        this.elementos = (T[])new Object[tamanho];
        this.topo= -1;
    }

    public boolean isCheia() {
        return this.topo==this.elementos.length;
    }

    public boolean isVazia() {
        return this.topo==-1;
    }

    public int getQuantidade() {
        return this.topo +1;
    }

    public void push(T novoElemento) throws PilhaCheiaException {
        if(this.isCheia()) throw new PilhaCheiaException();

        this.elementos[++this.topo] = novoElemento;
    }
    public T pop() throws PilhaVaziaException {

        if (this.isVazia()) throw new PilhaVaziaException();
        return this.elementos[this.topo--];
    }

    public Iterator<T> get(){
        @SuppressWarnings("unchecked")
        T[] auxiliar = (T[]) new Object[this.topo+1];
        for(int i = this.topo; i>=0 ; i--){
            auxiliar[this.topo-i]=elementos[i];
        }
        return Arrays.asList(auxiliar).iterator();
    }

    public boolean get(T elemento) {
        for(int i=0 ; i<=this.topo ; i++) {
            if(this.elementos[i].equals(elemento)) return true;
        }
        return false;
    }

}
