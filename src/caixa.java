class Caixa {

    private Double caixa_inicial;
    private String operador;
    
    Caixa(Double vl_inicial){
        this.caixa_inicial = vl_inicial;
    }

    public void setCaixaInicial(Double caixa_inicial) {
        this.caixa_inicial = caixa_inicial;
    }

    public Double getCaixaInicial() {
        return caixa_inicial;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getOperador() {
        return operador;
    }

    public void atualiza_caixa(Double vl_venda){
        this.caixa_inicial = this.caixa_inicial + vl_venda;
    }

    
}
