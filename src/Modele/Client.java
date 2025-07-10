package src.Modele;
import java.io.*;
import java.util.*;
/**
 * 
 */
public class Client {

    public String nom;
    public String prenom;
    public int id_client;
    public String num_tel;

    Vector<Location> liste_location = new Vector<Location>();
    Vector<Magasin_Scooter> liste_magasin_scooter = new Vector<Magasin_Scooter>();
    Vector<Permis> liste_permis = new Vector<Permis>();

    public Client(String nom, String prenom, int id, String numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.id_client = id;
        this.num_tel = numero;
    }

    public void setNom(String newnom) {
        nom = newnom;
    }

    public void setPrenom(String newprenom) {
        prenom = newprenom;
    }

    public void setId(int newid) {
        id_client = newid;
    }

    public void setNumTel(String newnumtel) {
        num_tel = newnumtel;
    }

    public void setloc(Vector<Location> lst_loc) {
        liste_location = lst_loc;
    }

    public void setmagasin(Vector<Magasin_Scooter> magasin) {
        liste_magasin_scooter = magasin;
    }

    public void setpermis(Vector<Permis> permis) {
        liste_permis = permis;
    }

    public void ajouterLocation(Location loc) {
        liste_location.add(loc);
    }

    public void ajouterMagasin(Magasin_Scooter magasin) {
        liste_magasin_scooter.add(magasin);
    }

    public void ajouterPermis(Permis permis) {
        liste_permis.add(permis);
    }

    public void supprimerLocation(Location loc) {
        liste_location.remove(loc);
    }

    public void supprimerMagasin(Magasin_Scooter magasin) {
        liste_magasin_scooter.remove(magasin);
    }

    public void supprimerPermis(Permis permis) {
        liste_permis.remove(permis);
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getId() {
        return id_client;
    }

    public String getNumTel() {
        return num_tel;
    }

    public Vector<Location> getloc() {
        return liste_location;
    }

    public Vector<Magasin_Scooter> getmagasin() {
        return liste_magasin_scooter;
    }

    public Vector<Permis> getpermis() {
        return liste_permis;
    }

}