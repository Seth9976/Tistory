package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

public final class c implements ParameterizedType, TypeImpl {
    public final Class a;
    public final Type b;
    public final Type[] c;

    public c(Class class0, Type type0, ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(class0, "rawType");
        Intrinsics.checkNotNullParameter(arrayList0, "typeArguments");
        super();
        this.a = class0;
        this.b = type0;
        this.c = (Type[])arrayList0.toArray(new Type[0]);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof ParameterizedType) {
            Type type0 = ((ParameterizedType)object0).getRawType();
            if(Intrinsics.areEqual(this.a, type0)) {
                Type type1 = ((ParameterizedType)object0).getOwnerType();
                if(Intrinsics.areEqual(this.b, type1)) {
                    Type[] arr_type = ((ParameterizedType)object0).getActualTypeArguments();
                    return Arrays.equals(this.c, arr_type);
                }
            }
        }
        return false;
    }

    @Override
    public final Type[] getActualTypeArguments() {
        return this.c;
    }

    @Override
    public final Type getOwnerType() {
        return this.b;
    }

    @Override
    public final Type getRawType() {
        return this.a;
    }

    @Override  // kotlin.reflect.TypeImpl
    public final String getTypeName() {
        StringBuilder stringBuilder0 = new StringBuilder();
        Class class0 = this.a;
        Type type0 = this.b;
        if(type0 == null) {
            stringBuilder0.append(TypesJVMKt.access$typeToString(class0));
        }
        else {
            stringBuilder0.append(TypesJVMKt.access$typeToString(type0));
            stringBuilder0.append("$");
            stringBuilder0.append(class0.getSimpleName());
        }
        Type[] arr_type = this.c;
        if(arr_type.length != 0) {
            ArraysKt___ArraysKt.joinTo$default(arr_type, stringBuilder0, null, "<", ">", 0, null, b.a, 50, null);
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
        return s;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v ^ Arrays.hashCode(this.c) : v ^ this.b.hashCode() ^ Arrays.hashCode(this.c);
    }

    @Override
    public final String toString() {
        return this.getTypeName();
    }
}

