package cl.copeuch.tareas.controller;

import cl.copeuch.tareas.entity.Tarea;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.copeuch.tareas.service.TareaService;

@RestController
@RequestMapping("/tarea")
public class TareaController {
	
	@Autowired
	TareaService tareaService;
	
	@CrossOrigin(origins="http://localhost:3000")
	@GetMapping()
	public ArrayList<Tarea> obtenerTareas(){
		return tareaService.obtenerTareas();
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@PostMapping()
	public Tarea guardarTarea(@RequestBody Tarea tarea) {
		return this.tareaService.guardarTarea(tarea);
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.tareaService.eliminarTarea(id);
		if (ok) {
			return "usuario eliminado con id " + id;
		}else {
			return "No se puedo eliminar el usuario con id " + id;
		}
	}
	
}
