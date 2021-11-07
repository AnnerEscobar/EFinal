/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.EFinal.servicios;

import gt.edu.umg.EFinal.Metodos.Usuario;
import java.util.List;

/**
 *
 * @author  anner
 */
public interface UsuarioService {
    public List<Usuario> listar();
    public void guardar(Usuario usuario);
    public void eliminar(Usuario usuario);
    public Usuario encontrar(Usuario usuario);
}
