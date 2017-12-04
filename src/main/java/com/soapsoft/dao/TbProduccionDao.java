/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soapsoft.dao;

import com.soapsoft.model.TbProduccion;
import java.util.List;

/**
 *
 * @author PC
 */
public interface TbProduccionDao extends GenericDao<TbProduccion, Integer>{
    public List<TbProduccion>  fn_consultar_nit_produccion();
}
