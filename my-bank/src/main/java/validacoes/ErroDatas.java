package validacoes;

import javax.xml.datatype.DatatypeFactory;
import java.util.Date;

public class ErroDatas extends IllegalArgumentException{
    private Date data;
    public ErroDatas(){
        super();
    }
    @Override
    public String toString() {
        return "Data da esta incorreta";
    }
}
