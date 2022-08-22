package alura;

public class Main {

    public static void main(String[] args) {

        //try with resources
        try(Conexao con = new Conexao()){
            con.lerDados();
        }catch (IllegalStateException ex){
            System.out.println("Erro na conexão");
        }

    }


}
