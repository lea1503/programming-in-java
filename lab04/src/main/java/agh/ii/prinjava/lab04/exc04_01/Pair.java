package agh.ii.prinjava.lab04.exc04_01;

import java.util.Objects;

public class Pair<F,S> implements Cloneable {

    private F fst;
    private S snd;

    //constructor
    public Pair(F fst, S snd) {
        this.fst = fst;
        this.snd = snd;
    }


    public F getFst(){
        return fst;
    }

    public S getSnd(){
        return snd;
    }

    public void setFst(F fst){
        this.fst = fst;
    }

    public void setSnd(S snd){
        this.snd = snd;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "fst=" + fst +
                ", snd=" + snd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(fst, pair.fst) && Objects.equals(snd, pair.snd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fst, snd);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
