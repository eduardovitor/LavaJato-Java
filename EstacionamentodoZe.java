package carro;

public class EstacionamentodoZé implements LavaraJato, Trocadeóleo, Valoresdaslavagens, Valoresdoestacionamentodosautomóveis {
    private final int vagas = 13;
    private String CNPJ;
    private int quantidadedecarros;
    private int quantidadedemotos;
    private int quantidadedecaminhões;
    private static final int maxcarro = 5;
    private static final int maxcaminhões = 2;
    private static final int maxmotos = 6;
    private Carro carros[];
    private Caminhão caminhões[];
    private Moto motos[];
    private int quantidadedecarroslavados;
    private int quantidadedecaminhõeslavados;
    private int quantidadedecarrosquetrocaramoóleo;
    private double valorarrecadadocomalavagem;
    private double valorarrecadadocomatrocadeoleo;
    private static double ganhototal;
    private double ganhoporcarros;
    private double ganhoporcaminhões;
    private double ganhopormotos;
    private final double valorparatrocadeoleo = 12;
    EstacionamentodoZé(String CNPJ) {
        carros = new Carro[maxcarro];
        caminhões = new Caminhão[maxcaminhões];
        motos = new Moto[maxmotos];
        this.ganhoporcaminhões = 0;
        this.ganhoporcarros = 0;
        this.ganhopormotos = 0;
        ganhototal = 0;
        this.quantidadedecarros = 0;
        this.quantidadedemotos = 0;
        this.quantidadedecaminhões = 0;
        this.CNPJ = CNPJ;
        this.quantidadedecaminhõeslavados=0;
        this.quantidadedecarroslavados=0;
        this.valorarrecadadocomalavagem=0;
        this.quantidadedecarrosquetrocaramoóleo=0;
        this.valorarrecadadocomatrocadeoleo=0;
    }
    public void ColocarCarro(Carro carro) {
        if (quantidadedecarros < maxcarro) {
            this.carros[quantidadedecarros] = carro;
            this.quantidadedecarros++;
            this.ganhoporcarros += valorparacarro;
            ganhototal += valorparacarro;
        }
    }
    public void ColocarMoto(Moto moto) {
        if (this.quantidadedemotos < maxmotos) {
            motos[quantidadedemotos] = moto;
            this.quantidadedemotos++;
            this.ganhopormotos += valorparamoto;
            ganhototal += valorparamoto;
        }
    }
    public void ColocarCaminhão(Caminhão caminhão) {
        if (this.quantidadedecaminhões < maxcaminhões) {
            caminhões[quantidadedecaminhões] = caminhão;
            this.quantidadedecaminhões++;
            this.ganhoporcaminhões += valorparacaminhão;
            ganhototal += valorparacaminhão;
        }
    }

    @Override
    public void lavagemajatodecarro(Carro carro) {
        this.ganhoporcarros += valordalavagemdocarro;
        ganhototal += valordalavagemdocarro;
        this.quantidadedecarroslavados++;
        this.valorarrecadadocomalavagem+=valordalavagemdocarro;
    }

    @Override
    public void lavagemajatodecaminhão(Caminhão caminhão) {
        this.ganhoporcaminhões += valordalavagemdocaminhão;
        ganhototal += valordalavagemdocaminhão;
        this.quantidadedecaminhõeslavados++;
        this.valorarrecadadocomalavagem+=valordalavagemdocaminhão;
    }

    @Override
    public void trocaróleodecarro(Carro carro) {
        this.ganhoporcarros += valorparatrocadeoleo;
        ganhototal += valorparatrocadeoleo;
        this.valorarrecadadocomatrocadeoleo+=valorparatrocadeoleo;
        this.quantidadedecarrosquetrocaramoóleo++;
    }
    public int getQuantidadedecarros() {
        return quantidadedecarros;
    }

    public int getQuantidadedemotos() {
        return quantidadedemotos;
    }

    public int getQuantidadedecaminhões() {
        return quantidadedecaminhões;
    }
    
    public Carro getUltimoCarroinserido() {
        return carros[this.quantidadedecarros];
    }
    
    public Caminhão getUltimoCaminhãoinserido(){
        return caminhões[this.quantidadedecaminhões];
    }
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    public static double getGanhototal() {
        return ganhototal;
    }
    
    public int getQuantidadedecarroslavados() {
        return quantidadedecarroslavados;
    }

    public int getQuantidadedecaminhõeslavados() {
        return quantidadedecaminhõeslavados;
    }

    public int getQuantidadedecarrosquetrocaramoóleo() {
        return quantidadedecarrosquetrocaramoóleo;
    }

    public double getValorarrecadadocomalavagem() {
        return valorarrecadadocomalavagem;
    }

    public double getValorarrecadadocomatrocadeoleo() {
        return valorarrecadadocomatrocadeoleo;
    }
    
    public boolean lotado(){
     if(this.quantidadedecarros==maxcarro && this.quantidadedemotos==maxmotos && this.quantidadedecaminhões==maxcaminhões){
         return true;
     }
     return false;
    }
}
