package com.cryptape.cita.abi.datatypes.generated;

import java.util.List;
import com.cryptape.cita.abi.datatypes.StaticArray;
import com.cryptape.cita.abi.datatypes.Type;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use com.cryptape.cita.codegen.AbiTypesGenerator in the
 */
public class StaticArray1<T extends Type> extends StaticArray<T> {
    public StaticArray1(List<T> values) {
        super(1, values);
    }

    @SafeVarargs
    public StaticArray1(T... values) {
        super(1, values);
    }
}
