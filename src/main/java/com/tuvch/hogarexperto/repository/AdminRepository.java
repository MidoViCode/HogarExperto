package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.AdminEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AdminRepository extends CrudRepository<AdminEntity, Integer> {

    AdminEntity findAdminEntityByDateAfterAndDateBefore(Date after, Date before);
}
