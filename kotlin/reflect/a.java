package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

public final class a implements GenericArrayType, TypeImpl {
    public final Type a;

    public a(Type type0) {
        Intrinsics.checkNotNullParameter(type0, "elementType");
        super();
        this.a = type0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof GenericArrayType) {
            Type type0 = ((GenericArrayType)object0).getGenericComponentType();
            return Intrinsics.areEqual(this.a, type0);
        }
        return false;
    }

    @Override
    public final Type getGenericComponentType() {
        return this.a;
    }

    @Override  // kotlin.reflect.TypeImpl
    public final String getTypeName() {
        return TypesJVMKt.access$typeToString(this.a) + "[]";
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return this.getTypeName();
    }
}

