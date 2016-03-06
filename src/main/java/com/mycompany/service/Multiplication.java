package com.mycompany.service;

import com.mycompany.dao.MathTableDao;
import com.mycompany.model.MathTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pandian on 2/20/16.
 */
@Service("Multiplication")
public class Multiplication implements MathOperation {

    @Autowired
    private MathTableDao mathTableDao;

    @Override
    public int action(int item1, int item2) {
        int result = item1 * item2;
        MathTable mathTable = new MathTable(item1, item2, result);
        mathTableDao.save(mathTable);
        return result;
    }

    @Override
    public List<MathTable> list() {
        ArrayList<MathTable> list = new ArrayList<MathTable>();
        for(MathTable mathTable: mathTableDao.findAll()) {
            list.add(mathTable);
        }
        return list;
    }


}
