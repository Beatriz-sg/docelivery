package com.app.confeitaria.docelivery.model.repository;

import com.app.confeitaria.docelivery.model.entity.Agendamento;
import com.app.confeitaria.docelivery.model.entity.SuporteUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuporteUsuarioRepository extends JpaRepository<SuporteUsuario,Long> {

}