package exemplo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Definir onde a anotação é válida através da anotação Target
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME) // Indica se a anotação precisa ser passada para o código compilado ou não
public @interface DoublePositivo {

    //Anotações não possuem implementação, são apenas interpretadas

}
