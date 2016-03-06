package com.mycompany;

import com.mycompany.model.MathTable;
import com.mycompany.service.MathOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by pandian on 2/20/16.
 */
@RestController
public class MyController {

    @Autowired
    @Qualifier("Multiplication")
    private MathOperation mathOperation;

    @RequestMapping("version")
    public String whatIsMyVerrsion() {
        return "v1.0";
    }

    @RequestMapping("multiply/{item1}/{item2}")
    public String multiplyMyValue(@PathVariable("item1") int item1, @PathVariable("item2") int item2) {

        return "" + mathOperation.action(item1, item2);

    }

    @RequestMapping("list")
    public List<MathTable> getList() {
        return mathOperation.list();
    }

}
