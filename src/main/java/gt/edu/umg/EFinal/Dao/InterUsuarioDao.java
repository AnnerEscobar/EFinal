/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.EFinal.Dao;

import gt.edu.umg.EFinal.Metodos.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author  anner
 */
public interface InterUsuarioDao extends CrudRepository<Usuario,Integer>{
    
}
