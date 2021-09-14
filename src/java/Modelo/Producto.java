
package Modelo;

public class Producto {
    int id;
    String nom;
    double pre;
    int stock;
    String estado;
    String idprodcat;
    String ivav;
    double monto_ivv;
    String idus;
    
    public Producto(){
    }

    public Producto(int id, String nom, double pre, int stock, String estado, String idprodcat, String ivav, double monto_ivv, String idus) {
        this.id = id;
        this.nom = nom;
        this.pre = pre;
        this.stock = stock;
        this.estado = estado;
        this.idprodcat = idprodcat;
        this.ivav = ivav;
        this.monto_ivv = monto_ivv;
        this.idus = idus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdprodcat() {
        return idprodcat;
    }

    public void setIdprodcat(String idprodcat) {
        this.idprodcat = idprodcat;
    }

    public String getIvav() {
        return ivav;
    }

    public void setIvav(String ivav) {
        this.ivav = ivav;
    }

    public double getMonto_ivv() {
        return monto_ivv;
    }

    public void setMonto_ivv(double monto_ivv) {
        this.monto_ivv = monto_ivv;
    }

    public String getIdus() {
        return idus;
    }

    public void setIdus(String idus) {
        this.idus = idus;
    }

     
     
    
}
