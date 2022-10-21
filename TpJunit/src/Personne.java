import java.text.Normalizer;
import java.text.Normalizer.Form;

public class Personne{
	private String nom;
	private String prenom;
	private String login;
	
	public Personne(String unNom, String unPrenom){
		this.nom = unNom;
		this.prenom = unPrenom;
		this.login = creerLogin();
	}
	
	private String creerLogin(){
		this.login = this.prenom.toUpperCase().charAt(0)+this.nom;
		this.login = login.replaceAll(" ", "");
		this.login = login.replaceAll("-", "");
		
		return login;
		
	}
	
	public String getLogin(){
		return this.login;
	}
	
	public String toString(){
		return ("Nom : " + this.nom + " Prenom : " + this.prenom + " Login : " + this.login);
	}
}