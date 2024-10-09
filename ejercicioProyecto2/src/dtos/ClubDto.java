package dtos;

import java.util.Date;

public class ClubDto {

	long idClubC;
	String nombreClubC = "aaa";
	String sedePrincipalC = "aaa";
	Date fechaCreacionC = new Date();
	boolean entradaPublicaC = false;
	String codigoPrivado = "aaaa";
	
	
	public long getIdClubC() {
		return idClubC;
	}
	public void setIdClubC(long idClubC) {
		this.idClubC = idClubC;
	}
	public String getNombreClubC() {
		return nombreClubC;
	}
	public void setNombreClubC(String nombreClubC) {
		this.nombreClubC = nombreClubC;
	}
	public String getSedePrincipalC() {
		return sedePrincipalC;
	}
	public void setSedePrincipalC(String sedePrincipalC) {
		this.sedePrincipalC = sedePrincipalC;
	}
	public Date getFechaCreacionC() {
		return fechaCreacionC;
	}
	public void setFechaCreacionC(Date fechaCreacionC) {
		this.fechaCreacionC = fechaCreacionC;
	}
	public boolean isEntradaPublicaC() {
		return entradaPublicaC;
	}
	public void setEntradaPublicaC(boolean entradaPublicaC) {
		this.entradaPublicaC = entradaPublicaC;
	}
	public String getCodigoPrivado() {
		return codigoPrivado;
	}
	public void setCodigoPrivado(String codigoPrivado) {
		this.codigoPrivado = codigoPrivado;
	}
	
	public ClubDto(long idClubC, String nombreClubC, String sedePrincipalC, Date fechaCreacionC, boolean entradaPublicaC, String codigoPrivado) {
		super();
		this.idClubC = idClubC;
		this.nombreClubC = nombreClubC;
		this.sedePrincipalC = sedePrincipalC;
		this.fechaCreacionC = fechaCreacionC;
		this.entradaPublicaC = entradaPublicaC;
		this.codigoPrivado = codigoPrivado;
	}
	
	
	
	
}
