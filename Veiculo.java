package p1;

public class Veiculo {
    private int ano;
    private String marca;
    private String modelo;
    private String placa;
    private float quilometragemTotal;
    private String nomeProprietario;
    private String cpfProprietario;

    // Getters e Setters
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getQuilometragemTotal() {
        return quilometragemTotal;
    }

    public void setQuilometragemTotal(float quilometragemTotal) {
        this.quilometragemTotal = quilometragemTotal;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public String getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(String cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
    }
}
