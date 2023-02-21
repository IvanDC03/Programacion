package EjerciciosClaseU10;

public enum Equipo {
private String nombreClub;
private String posicionChampions;
MADRID("Real Madrid",1),
BARÇA("FC BARCELONA",30),
ATLETI("Atletico de Madrid",32),
PSG("Paris Saint Germain",16);
}
private Equipo(String nombreClub, String posicionChampions) {
	this.nombreClub = nombreClub;
	this.posicionChampions = posicionChampions;
}
public String getNombreClub() {
	return nombreClub;
}
public void setNombreClub(String nombreClub) {
	this.nombreClub = nombreClub;
}
public String getPosicionChampions() {
	return posicionChampions;
}
public void setPosicionChampions(String posicionChampions) {
	this.posicionChampions = posicionChampions;
}
