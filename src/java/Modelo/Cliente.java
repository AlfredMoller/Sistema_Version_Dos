package Modelo;

public class Cliente {
    int id;
    String dni;
    String nom;
    String dir;
    String es;
    String tipodoc;
    String telefono;
    String tipotel;
    String auxtel;
    String tipoaux;
            

    public Cliente() {
    }

    public Cliente(int id, String dni, String nom, String dir, String es, String tipodoc, String telefono, String tipotel, String auxtel, String tipoaux) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.dir = dir;
        this.es = es;
        this.tipodoc = tipodoc;
        this.telefono = telefono;
        this.tipotel = tipotel;
        this.auxtel = auxtel;
        this.tipoaux = tipoaux;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipotel() {
        return tipotel;
    }

    public void setTipotel(String tipotel) {
        this.tipotel = tipotel;
    }

    public String getAuxtel() {
        return auxtel;
    }

    public void setAuxtel(String auxtel) {
        this.auxtel = auxtel;
    }

    public String getTipoaux() {
        return tipoaux;
    }

    public void setTipoaux(String tipoaux) {
        this.tipoaux = tipoaux;
    }

     
    
    
}
