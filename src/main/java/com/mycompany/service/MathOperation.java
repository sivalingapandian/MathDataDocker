package com.mycompany.service;

import com.mycompany.model.MathTable;

import java.util.List;

/**
 * Created by pandian on 2/20/16.
 */
public interface MathOperation {

    public int action(int item1, int item2);
    public List<MathTable> list();

}
