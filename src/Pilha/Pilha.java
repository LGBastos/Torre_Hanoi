package Pilha;
import java.util.Iterator;

import Exceptions.PilhaCheiaException;
import Exceptions.PilhaVaziaException;

public interface Pilha<T> {
    public boolean isVazia();

    public boolean isCheia();

    public int getQuantidade();

    public void push(T novoElemento) throws PilhaCheiaException;
    public T pop() throws PilhaVaziaException;

    public Iterator<T> get();

    public boolean get(T elemento);


}
