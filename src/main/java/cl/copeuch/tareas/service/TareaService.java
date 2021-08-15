package cl.copeuch.tareas.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.copeuch.tareas.entity.Tarea;
import cl.copeuch.tareas.repository.TareaRepository;

@Service
public class TareaService {
	
	@Autowired
	TareaRepository tareaRepository;
	
	public ArrayList<Tarea> obtenerTareas(){
		return (ArrayList<Tarea>)tareaRepository.findAll();
	}
	
	public Tarea guardarTarea(Tarea tarea) {
		return tareaRepository.save(tarea);
	}
	
	public Optional<Tarea> obtenerPorId(Long id){
		return tareaRepository.findById(id);
	}
	
	public boolean eliminarTarea(Long id) {
		try {
			tareaRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
	
	
	
}
