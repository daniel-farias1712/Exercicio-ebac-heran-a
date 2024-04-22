abstract class Pessoa {

    private String nome;
    private String rg;
    private String localizacao;


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getrg(){
        return rg;
    }
    public void setrg(String rg) {
        this.rg =rg;
    }
    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


}
