package br.com.spring_angular.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.spring_angular.model.Client;

public interface Repositorio extends CrudRepository<Client, Long> {

}
