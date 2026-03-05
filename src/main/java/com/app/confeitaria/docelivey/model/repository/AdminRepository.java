package com.app.confeitaria.docelivey.model.repository;

import com.app.confeitaria.docelivey.model.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

}
