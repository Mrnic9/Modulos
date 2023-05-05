package com.example.ejonespringboot.Controller;


import com.example.ejonespringboot.DTO.EstudianteDTO;
import com.example.ejonespringboot.Model.Estudiante;


import com.example.ejonespringboot.Service.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstudianteController {


        @Autowired
        EstudianteServicio estudianteService;

        @GetMapping("/Estudiante")
        @ResponseBody
        public List<Estudiante> listarEstudiantes(){

            return estudianteService.listarEstudiante();
        }

        @PostMapping("/Estudiante")
        @ResponseBody
        public Estudiante crearEstudiante(@RequestBody Estudiante estudiante){

            return estudianteService.crearEstudiante(estudiante);
        }

        @DeleteMapping("/Estudiante/{id}")
        public void borrarEstudiante(@PathVariable Long id){

            estudianteService.borrarEstudiante(id);
        }

        @GetMapping("/Estudiante/{id}")
        public Estudiante buscarEstudiante(@PathVariable Long id){
            return estudianteService.buscarEstudianteId(id);
        }


        @PutMapping("/Estudiante")
        public void modificarEstudiante(@RequestBody Estudiante estudiante){
            estudianteService.modificarEstudiante(estudiante);
        }




}
