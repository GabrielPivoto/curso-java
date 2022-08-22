package alura;

public class Conexao implements AutoCloseable{

    public Conexao(){
        System.out.println("Abrindo conexão");
        //throw new IllegalStateException();
    }

    public void lerDados(){
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    @Override //Pode colocar throws Exception ou não
    public void close()  {
        System.out.println("Fechando conexão");
    }
}
