package com.zuber.domain;

import org.springframework.data.repository.CrudRepository;

public interface MotoristaRepository extends CrudRepository<Motorista, Long> { //TODO: mudar para JPARepository e colocar a anotação @Repository  para o spring gerenciar essa classe

}
