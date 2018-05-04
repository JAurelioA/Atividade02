public class CalcularFrete {
    private Frete frete;
    private String cepOrigem;
    private String cepDestino;
    private NotaFiscal notaFiscal;

    /**
     * @return valor calculado do frete
     */
    public double valorFrete() {
        return frete.calcular(cepOrigem, cepDestino, notaFiscal);
    }

    /**
     * @param frete the frete to set
     */
    public void setFrete(Frete frete) {
        this.frete = frete;
    }
}
