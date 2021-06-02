package klerSergioPB2.TM.P1;



import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;

public class Pelicula {

	private Integer codigoPelicula;
	private String descripcionPelicula;
	private Genero generoPelicula;
	private Integer anoDeEstreno;
	private String directorPelicula;
	private String actor;

	public Pelicula(Integer codigoPelicula, String descripcionPelicula, Genero generoPelicula,
			Integer anoDeEstreno, String directorPelicula) {
		this.codigoPelicula=codigoPelicula;
		this.descripcionPelicula=descripcionPelicula;
		this.generoPelicula=generoPelicula;
		this.anoDeEstreno=anoDeEstreno;
		this.directorPelicula=directorPelicula;
		this.actor= "";
		
	}

	public String agregarActor(String Actor) {
		return this.actor;
		
	}

	public Integer getCodigoPelicula() {
		return codigoPelicula;
	}

	public void setCodigoPelicula(Integer codigoPelicula) {
		this.codigoPelicula = codigoPelicula;
	}

	public String getDescripcionPelicula() {
		return descripcionPelicula;
	}

	public void setDescripcionPelicula(String descripcionPelicula) {
		this.descripcionPelicula = descripcionPelicula;
	}

	public Genero getGeneroPelicula() {
		return generoPelicula;
	}

	public void setGeneroPelicula(Genero generoPelicula) {
		this.generoPelicula = generoPelicula;
	}

	public Integer getAnoDeEstreno() {
		return anoDeEstreno;
	}

	public void setAnoDeEstreno(Integer anoDeEstreno) {
		this.anoDeEstreno = anoDeEstreno;
	}

	public String getDirectorPelicula() {
		return directorPelicula;
	}

	public void setDirectorPelicula(String directorPelicula) {
		this.directorPelicula = directorPelicula;
	}

	public Boolean actua(String aCTOR_1_ESPERADO) {
		if (aCTOR_1_ESPERADO.equals(this.actor)) {
			return true;
		}

		return null;
	}

	
	
	

	

	

}
