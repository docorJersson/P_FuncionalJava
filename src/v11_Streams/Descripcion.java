
package v11_Streams;

import v10_Optional.*;
import v9_Method_Avanzado.*;

public class Descripcion {
    private final Integer value;

    public Descripcion(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  "V("+ value + ")";
    }
    
    
}
