public class Transicao {

    private char simbolo;
    private String proxEstado;
    private char subSimbolo;
    private char direcao;

    public Transicao(char simbolo, String proxEstado, char subSimbolo, char direcao) {
        this.simbolo = simbolo;
        this.proxEstado = proxEstado;
        this.subSimbolo = subSimbolo;
        this.direcao = direcao;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public String getProxEstado() {
        return proxEstado;
    }

    public char getSubSimbolo() {
        return subSimbolo;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setSubSimbolo(char subSimbolo) {
        this.subSimbolo = subSimbolo;
    }

    public void setProxEstado(String proxEstado) {
        this.proxEstado = proxEstado;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public String toString() {
        return "[ "+simbolo+" | "+proxEstado+" | "+subSimbolo +" | "+ direcao +" ]";
    }

}
