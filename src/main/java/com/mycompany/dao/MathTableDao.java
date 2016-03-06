package com.mycompany.dao;


import com.mycompany.model.MathTable;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pandian on 2/20/16.
 */
@javax.transaction.Transactional
public interface MathTableDao extends CrudRepository<MathTable,Long> {
}
