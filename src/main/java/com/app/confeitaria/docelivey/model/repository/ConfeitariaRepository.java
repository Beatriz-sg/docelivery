package com.app.confeitaria.docelivey.model.repository;

import com.app.confeitaria.docelivey.model.entity.Confeitaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfeitariaRepository extends JpaRepository<Confeitaria, Long> {
}
