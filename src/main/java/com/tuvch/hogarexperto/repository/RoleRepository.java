package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.RelativeEntity;
import com.tuvch.hogarexperto.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity, Integer> {
    RoleEntity findRoleRepositoryByRoleId (int roleId);
}
