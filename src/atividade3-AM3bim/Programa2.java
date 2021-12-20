package atividade3tercbim;

public class Veiculos{
    private String marca;
    private int qtdRodas;
    private int qtdPortas;
    private String modelo;
    private int velocidade = 0;
    private int numMarchas;
    private boolean bagageiro;
    private boolean partidaEletrica;
    private double potenciaDoMotor;
	public Veiculo(String marca, private int qtdRodas, private String modelo, int velocidade){
        this.marca = marca;
        this.qtdRodas = qtdRodas;
        this.modelo = modelo;
        this.velocidade = velocidade;
		public Bicicleta(int numMarchas, boolean bagageiro){
            this.numMarchas = numMarchas;
            this.bagageiro = bagageiro;
            //Método Imprimir Informações - Bicicleta
            public void imprimirInformacoes() {
                System.out.println(this.numMarchas);
                System.out.println(this.bagageiro);
	        }
		}
        public Automovel(double potenciaDoMotor){
            this.potenciaDoMotor = potenciaDoMotor;
            public Moto(boolean partidaEletrica){
                this.partidaEletrica = partidaEletrica;
                //Método Imprimir Informações - Moto
                public void imprimirInformacoes() {
                    System.out.println(this.partidaEletrica);
	            }
		    }
            public Carro(int qtdPortas){
                this.qtdPortas = qtdPortas;
                //Método Imprimir Informações - Carro
                public void imprimirInformacoes() {
                    System.out.println(this.qtdPortas);
	            }
		    }
            //Método Imprimir Informações - Automóvel
            public void imprimirInformacoes() {
                System.out.println(this.potenciaDoMotor);
	        }
		}

        //Gets 
        public String getqtdRodas() {
            return qtdRodas;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getVelocidade() {
            return velocidade;
        }    

        public int getnumMarchas() {
            return numMarchas;
        }    

        public boolean getbagageiro() {
            return bagageiro;
        }    

        public boolean getpartidaEletrica() {
            return partidaEletrica;
        }    

        public double getpotenciaDoMotor() {
            return potenciaDoMotor;
        }  


        //Sets
        public void setqtdRodas(int qtdRodas) {
            this.qtdRodas = qtdRodas;
        }
        public void setMarca(String marca) {
            this.marca = marca;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void setVelocidade(int Velocidade) {
            this.Velocidade = Velocidade;
        }    

        public void setnumMarchas(int numMarchas) {
            this.numMarchas = numMarchas;
        }    

        public void setbagageiro(boolean bagageiro) {
            this.bagageiro = bagageiro;
        }    

        public void setpartidaEletrica(boolean partidaEletrica) {
            this.partidaEletrica = partidaEletrica;
        }    

        public void setpotenciaDoMotor(double potenciaDoMotor) {
            this.potenciaDoMotor = potenciaDoMotor;
        }

        //Método Imprimir Informações - Veículo
        public void imprimirInformacoes() {
            System.out.println(this.velocidade);
            System.out.println(this.qtdRodas);
            System.out.println(this.modelo);
            System.out.println(this.marca);
	    }

        //Métodos acelerar e frear
        public void acelerar(int valor) {
            this.velocidade += valor;
        }
        
        public void frear(int valor) {
            this.velocidade -= valor;
        }
    
    }
}
