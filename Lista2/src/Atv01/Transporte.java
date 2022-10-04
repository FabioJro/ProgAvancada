package Atv01;

public class Transporte {

    private Integer id;
    private Integer ano;
    private String modelo;
    private double carga_maxima;
    private double potencia;
     

    
    public Transporte(Integer ano, String modelo, double carga_maxima, double potencia) {
        this.ano = ano;
        this.modelo = modelo;
        this.carga_maxima = carga_maxima;
        this.potencia = potencia;
    }
    public String leiaModelo(){
        return this.modelo;
    }
    public void gravaModelo(String modelo){
        this.modelo= modelo;
    }
    public double consumo(){
        return this.carga_maxima*this.potencia*100;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }


    
    
}
