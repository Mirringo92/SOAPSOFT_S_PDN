/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soapsoft.service;

import com.soapsoft.dao.TbProduccionDaoImpl;
import com.soapsoft.model.TbProduccion;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author PC
 */
@WebService(serviceName = "SVR_PRODUCCION")
public class SVR_PRODUCCION {

    /**
     * Web service operation
     */
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "fn_insertar_pr")
    public String fn_insertar_pr(@WebParam(name = "id_dpto_produccion") String id_dpto_produccion, @WebParam(name = "creadoPor") String creadoPor, @WebParam(name = "observacion") String observacion) {
        //TODO write your implementation code here:
        TbProduccion obj=new TbProduccion(id_dpto_produccion, creadoPor, Date.valueOf(LocalDate.now()), observacion);
        
                try {
            TbProduccionDaoImpl dao=new TbProduccionDaoImpl();
            dao.create(obj);  
            return "se ha realizado una insercion en produccion";
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "fn_consultar_pr")
    public List<TbProduccion> fn_consultar_pr() {
            TbProduccionDaoImpl dao = new TbProduccionDaoImpl();

           return dao.fn_consultar_nit_produccion();
      
    }
    
    
        
        
    }


    /**
     * This is a sample web service operation
     */
 

