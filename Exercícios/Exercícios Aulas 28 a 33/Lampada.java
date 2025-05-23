class Lampada {

    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipos;
    private boolean tipoAbajur;

    public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses, String[] tipos, boolean tipoAbajur){
        this.modelo = modelo;
        this.tensao =tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.tipoAbajur = tipoAbajur;
    }

    // Métodosgetters e setters
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getTensao(){
        return this.tensao;
    }
    public void setTensao(String tensao){
        this.tensao = tensao;
    }

    public int getPotencia(){
        return this.potencia;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getTipoLuz(){
        return this.tipoLuz;
    }
    public void setTipoLuz(String tipoLuz){
        this.tipoLuz = tipoLuz;
    }
    public int getGarantiaMeses(){
        return this.garantiaMeses;
    }
    public void setGarantiaMeses(int garantiaMeses){
        this.garantiaMeses = garantiaMeses;
    }
    public String[] getTipos(){
        return this.tipos;
    }
    public void setTipos(String[] tipos){
        this.tipos = tipos;
    }
    public boolean getTipoAbajur(){
        return this.tipoAbajur;
    }
    public void setTipoAbajur(boolean tipoAbajur){
        this.tipoAbajur = tipoAbajur;
    }



    private boolean ligada;

    public void ligarLampada(){
        ligada = true;
    }

    public void desligarLampada(){
        ligada = false;
    }
    
    public void mostrarEstado(){
        if (ligada){
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");

        }
    }
    public void mudarEstado(){
        if (ligada){
            desligarLampada();
        } else {
            ligarLampada();
        }
    }

}