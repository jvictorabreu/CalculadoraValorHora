public class ItemSistema {
    private String nomeItem;
    private String tipoItem;
    private int complexidade;

    public int calcularQuantidadeHoras(){
        int qtdHoras = 0;

        switch (this.complexidade){
            case 1:
                qtdHoras = 24;
                break;
            case 2:
                qtdHoras = 48;
                break;
            case 3:
                qtdHoras = 72;
                break;
            default:
                qtdHoras = 96;
                break;
        }
        return qtdHoras;
    }



    // Getters and Setters
    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }
}
