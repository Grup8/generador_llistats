package partXicu;

import java.util.ArrayList;

public class Alumne {

	public String id;
	public String nom;
	public String cognoms;
	public String curs;
	public ArrayList<String> assignatures;

	public Alumne(String id, String nom, String cognoms, String curs,
			ArrayList<String> llistatA) {
		super();
		this.id = id;
		this.nom = nom;
		this.cognoms = cognoms;
		this.curs = curs;
		this.assignatures = llistatA;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}

	public String getCurs() {
		return curs;
	}

	public void setCurs(String curs) {
		this.curs = curs;
	}

	public ArrayList<String> getAssignatures() {
		return assignatures;
	}

	public void setAssignatures(ArrayList<String> assignatures) {
		this.assignatures = assignatures;
	}

	@Override
	public String toString() {
		return "\n Alumne [id=" + id + ", nom=" + nom + ", cognoms=" + cognoms
				+ ", curs=" + curs + ", assignatures=" + assignatures + "]";
	}

}

