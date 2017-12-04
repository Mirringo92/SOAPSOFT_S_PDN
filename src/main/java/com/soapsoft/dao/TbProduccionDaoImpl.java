/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soapsoft.dao;

import com.soapsoft.model.TbProduccion;
import com.soapsoft.util.LlaveValor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class TbProduccionDaoImpl extends GenericDaoImpl<TbProduccion, Integer> implements TbProduccionDao{
    
    public List<TbProduccion>  fn_consultar_nit_produccion(){                   
            List<TbProduccion> resultado = null;

            try{ 
                String query = "SELECT Id, id_dpto_produccion as IdDptoProduccion, observacion  FROM tb_produccion  ";

                ArrayList<LlaveValor> parametros = new ArrayList<>();
               
                resultado = this.Query(query, parametros,TbProduccion.class);

                } catch (Exception e) {
                    throw e;
                }

            return resultado;
          
       }
}
