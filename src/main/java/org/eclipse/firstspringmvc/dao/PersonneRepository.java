package org.eclipse.firstspringmvc.dao;

import org.eclipse.firstspringmvc.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long>{

}
