package com.example.ejonespringboot.Repository;

import com.example.ejonespringboot.Model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
    public Estudiante findByUserAndPassword(String user,String password);
}
