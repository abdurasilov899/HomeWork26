package com.company;

public class Car {
    private int id;
    private int nomerauto;

    public Car() {
    }

    public Car(int id, int nomerauto) {
        this.id = id;
        this.nomerauto = nomerauto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNomerauto() {
        return nomerauto;
    }

    public void setNomerauto(int nomerauto) {
        this.nomerauto = nomerauto;
    }

    @Override
    public String toString() {
        return "\nCar:    " +
                "\nid:         " + id +
                "\nnomerauto:  " + nomerauto +" ";
    }
}
