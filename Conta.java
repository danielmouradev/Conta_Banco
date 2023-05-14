package exerciciospoo;



public class Conta {

  //Atributos
   public int numConta;
   protected String tipo;
   private String dono;
   private float saldo;
   private boolean status;

     //Construtor
    public Conta(){  //método construtor
        this.setSaldo(0);
        this.setStatus(false);
    }

    //Métodos personalizados

    public void estadoAtual(){
        System.out.println();
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo() + " R$");
        System.out.println("Status: "+this.getStatus());
    }
    public void abrirConta(String t){  //caso seja conta poup. ou conta corrente e passa um valor String
        this.setTipo(t);    //chama o método setTipo()
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50);
        } else if (t == "CP") {
           this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){  //condição para fechar a conta
        if (this.getSaldo() > 0){
            System.out.println("Não é possível fechar conta. Conta com dinheiro! ");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito! ");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v){  //depositar valores
        if(this.getStatus() == true){
            this.setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado na conta de "+getDono());
        }else{
            System.out.println("Impossível depositar!");
        }

    }

    public void sacar(float v){   //sacar valores
        if(this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(getSaldo() - v);
                System.out.println("Saque realizado na conta de "+getDono());
            }else{
                System.out.println("Saldo insuficiente para saque!");
            }
        }else{
            System.out.println("Impossível sacar!");
        }
    }

    public void pagarMensal(){  //pagar mensalidade da conta
        float valor = 0;
        if (this.getTipo() == "CC"){
            valor = 12;
        } else if (this.getTipo() == "CP") {
            valor = 20;
        }
        if (this.getStatus()){
            if (this.getSaldo() > valor){
                this.setSaldo(getSaldo() - valor);
                System.out.println("Mensalidade paga com sucesso por "+this.getDono());
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }else{
            System.out.println("Impossível pagar!");
        }
    }

    //Métodos especiais
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int nc){
        this.numConta = nc;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean st){
        this.status = st;
    }
}

