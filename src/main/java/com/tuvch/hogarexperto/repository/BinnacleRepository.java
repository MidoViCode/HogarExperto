package com.tuvch.hogarexperto.repository;

import com.tuvch.hogarexperto.entity.BinnacleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinnacleRepository extends CrudRepository<BinnacleEntity, Integer> {
}
