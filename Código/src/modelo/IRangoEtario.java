package modelo;

public interface IRangoEtario {

	
	boolean prioridad(Paciente otro);
	
	boolean prioridadNiņo();
	
	boolean prioridadJoven();
	
	boolean prioridadMayor();
}
