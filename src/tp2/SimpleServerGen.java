package tp2;
import java.lang.annotation.Retention;

import org.junit.experimental.theories.ParametersSuppliedBy;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(SimpleServerGenSupplier.class)
public @interface SimpleServerGen {

}

