package model;

public class Dependente extends Pessoa {

    private RelacaoEnum relacao;

    public RelacaoEnum getRelacao() {
        return relacao;
    }

    public void setRelacao(RelacaoEnum relacao) {
        this.relacao = relacao;
    }
}
