public abstract class Personagem{
    
    //statico nao pertence ao objeto e sim a classe, entao ele
    //e um atributo geral.
    private static int contadorPersonagens = 0;

    // atributos dos nossos personagens.
    
    protected String nome;
    protected String raca;
    protected String classeRPG;
    protected int nivel;
    protected int pontosVida;
    protected Arma armaEquipada;
    

    //construtor e chamada dos atributos dentro do construtor

    //usamos os parametros da classe pra poder relacionar os dados fornecidos pelo usuario aos
    //nossos atributos de personagem
    public Personagem(String nome, String raca, String classeRPG, int nivel, int pontosVida, Arma arma){
        this.nome = nome;
        this.raca = raca.toUpperCase();
        this.classeRPG = classeRPG.toUpperCase();
        this.nivel = nivel;
        this.pontosVida = pontosVida;
        this.armaEquipada = arma;
        //Como contador nao e um atributo do objeto, mas sim da classe, 
        //precisamos acessar ele atraves do nome da classe
        Personagem.contadorPersonagens++;
    }    
    
        //metodos de busca
        public String getNome(){
            return this.nome;
        }

        public String getRaca(){
            return this.raca;
        }

        public String getClasse(){
            return this.classeRPG;
        }

        public int getNivel(){
            return this.nivel;
        }

        public int getHP(){
            return this.pontosVida;
        }

        //metodos de alteracao
        public void setNivel(int nivel){
            this.nivel = nivel;
        }

        public void setHp(int pontosVida){
            if (pontosVida <= 0){
                this.pontosVida = 0;            }
            else{
                this.pontosVida = pontosVida;
            }
        }

        // metodos praticos
        public void receberDano(int danoSofrido){
            this.setHp(this.getHP()-danoSofrido);
        }
        
        public void curar(int vidaCurada){
            this.pontosVida = this.pontosVida + vidaCurada;
        }
        
        public void exibirFicha(){
            System.out.println("--- Ficha de Personagem ---");
            System.out.println("Nome : " + nome);
            System.out.println("Raca : " + raca);
            System.out.println("Classe : " + classeRPG);
            System.out.println("Nivel : " + nivel);
            System.out.println("HP Atual : " + pontosVida);
            if(this.armaEquipada != null){
                System.out.println("Arma: " + armaEquipada.getNome());
                System.out.println("Dano Maximo: " + armaEquipada.getDanoMaximo());
            }
            else{
                System.out.println("Arma: Desarmado");
            }
        }

        public void equiparArma(Arma novaArma){
            this.armaEquipada = novaArma;
        }

        public static int getContadorPersonagens(){
            return Personagem.contadorPersonagens;
        }

        public abstract void atacar(Personagem alvo);
} 
