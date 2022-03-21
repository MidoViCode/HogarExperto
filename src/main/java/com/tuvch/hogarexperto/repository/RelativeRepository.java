package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.RelativeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RelativeRepository extends CrudRepository <RelativeEntity, Integer> {
}
