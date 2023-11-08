package br.com.DablioW.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.DablioW.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer> {

}
