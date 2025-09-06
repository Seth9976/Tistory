package ze;

import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality;

public final class e implements TypeConstructorEquality {
    public static void a(int v) {
        Object[] arr_object = new Object[3];
        arr_object[0] = v == 1 ? "b" : "a";
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        arr_object[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker$TypeConstructorEquality
    public final boolean equals(TypeConstructor typeConstructor0, TypeConstructor typeConstructor1) {
        if(typeConstructor0 != null) {
            if(typeConstructor1 != null) {
                return typeConstructor0.equals(typeConstructor1);
            }
            e.a(1);
            throw null;
        }
        e.a(0);
        throw null;
    }
}

