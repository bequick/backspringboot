package cl.copeuch.tareas.repository;

import cl.copeuch.tareas.entity.Tarea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends CrudRepository<Tarea, Long> {
	
}
