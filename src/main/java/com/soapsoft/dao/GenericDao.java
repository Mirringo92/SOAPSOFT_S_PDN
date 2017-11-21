/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.soapsoft.dao;

/*
 * @author hdcardenas dropimax@gmail.com
 */
 
import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, E extends Serializable> {
   
    E create(T entity);
    void delete(T entity);
    void update(T entity);
    T findById(Serializable id);
    List<T> findAll();
    List<T> findList(int pageNo, int pageSize);
    int getCountOfAll();

    
}