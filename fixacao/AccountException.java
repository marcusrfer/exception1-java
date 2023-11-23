package excecoes.fixacao;

public class AccountException extends RuntimeException{
    protected String msg;

    AccountException(String msg){
        super(msg);
    }

}
