package com.mycompany.model;

import javax.persistence.*;

/**
 * Created by pandian on 2/20/16.
 */
@Entity
@Table(name ="mathtable")
public class MathTable {

    public MathTable() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int item1;
    private int item2;
    private int result;

    public MathTable(int item1, int item2, int result) {
        this.item1 = item1;
        this.item2 = item2;
        this.result = result;
    }


    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public int getItem2() {
        return item2;
    }

    public void setItem2(int item2) {
        this.item2 = item2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MathTable mathTable = (MathTable) o;

        if (item1 != mathTable.item1) return false;
        if (item2 != mathTable.item2) return false;
        return result == mathTable.result;

    }

    @Override
    public int hashCode() {
        int result1 = item1;
        result1 = 31 * result1 + item2;
        result1 = 31 * result1 + result;
        return result1;
    }

    @Override
    public String toString() {
        return "MathTable{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                ", result=" + result +
                '}';
    }
}
