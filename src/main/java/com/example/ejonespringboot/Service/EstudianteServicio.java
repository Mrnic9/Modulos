package com.example.ejonespringboot.Service;

import com.example.ejonespringboot.DTO.EstudianteDTO;
import com.example.ejonespringboot.Model.Estudiante;
import com.example.ejonespringboot.Repository.EstudianteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class EstudianteServicio {
    @Autowired
    EstudianteRepository Estudianterep;

    public Estudiante crearEstudiante(Estudiante estudiante){

        return Estudianterep.save(estudiante);
    }

    public void borrarEstudiante(Long id){

        Estudianterep.deleteById(id);
    }

    public List<Estudiante> listarEstudiante(){

        return Estudianterep.findAll();
    }

    public Estudiante buscarEstudianteId(Long id){

        return Estudianterep.findById(id).orElse(null);
    }

    public void modificarEstudiante(Estudiante estudiante) {
        // Se busca la persona en la base de datos por su ID
        Optional<Estudiante> estudianteEncontrado =
                Estudianterep.findById(estudiante.getId());

        if(estudianteEncontrado.isPresent()) {
            // Si se encontró la persona, se actualizan sus datos
            Estudiante estudianteActualizada = estudianteEncontrado.get();
            estudianteActualizada.setFullName(estudiante.getFullName());
            estudianteActualizada.setFacultad(estudiante.getFacultad());
            estudianteActualizada.setUser(estudiante.getUser());
            estudianteActualizada.setSemestre(estudiante.getSemestre());
            estudianteActualizada.setUser(estudiante.getPassword());


            // Aquí se pueden actualizar más campos según la necesidad
            Estudianterep.save(estudianteActualizada);
        } else {
            // Si no se encontró la persona, se puede lanzar una excepción o manejar el error de otra forma
            throw new NoSuchElementException("No se encontró el estudiante con ID " + estudiante.getId());
        }
    }

    //Este metodo es sin DTO
    /*public Persona login(String user, String password){
      return personaRepo.findByUserAndPassword(user, password);
    }*/

    //Este metodo es con DTO
    public EstudianteDTO login(String user, String password){

        Estudiante estudiante =  Estudianterep.findByUserAndPassword(user, password);
        EstudianteDTO EstudianteDTO = new EstudianteDTO(estudiante.getId(), estudiante.getSemestre(), estudiante.getFacultad(), estudiante.getFullName());

        return EstudianteDTO;
    }
}
