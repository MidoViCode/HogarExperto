package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
