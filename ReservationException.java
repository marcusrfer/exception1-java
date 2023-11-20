package excecoes;
import java.io.Serial;

public class ReservationException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    public ReservationException(String msg){
        super(msg);
    };
}
