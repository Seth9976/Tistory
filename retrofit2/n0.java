package retrofit2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

public final class n0 implements ParameterizedType {
    public final Type a;
    public final Type b;
    public final Type[] c;

    public n0(Type type0, Type type1, Type[] arr_type) {
        int v = 1;
        super();
        if(type1 instanceof Class) {
            if(((Class)type1).getEnclosingClass() != null) {
                v = 0;
            }
            if((type0 == null ? 1 : 0) != v) {
                throw new IllegalArgumentException();
            }
        }
        for(int v1 = 0; v1 < arr_type.length; ++v1) {
            Type type2 = arr_type[v1];
            Objects.requireNonNull(type2, "typeArgument == null");
            p0.b(type2);
        }
        this.a = type0;
        this.b = type1;
        this.c = (Type[])arr_type.clone();
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof ParameterizedType && p0.c(this, ((ParameterizedType)object0));
    }

    @Override
    public final Type[] getActualTypeArguments() {
        return (Type[])this.c.clone();
    }

    @Override
    public final Type getOwnerType() {
        return this.a;
    }

    @Override
    public final Type getRawType() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.c);
        int v1 = this.b.hashCode();
        return this.a == null ? v ^ v1 : v ^ v1 ^ this.a.hashCode();
    }

    @Override
    public final String toString() {
        Type[] arr_type = this.c;
        Type type0 = this.b;
        if(arr_type.length == 0) {
            return p0.q(type0);
        }
        StringBuilder stringBuilder0 = new StringBuilder((arr_type.length + 1) * 30);
        stringBuilder0.append(p0.q(type0));
        stringBuilder0.append("<");
        stringBuilder0.append(p0.q(arr_type[0]));
        for(int v = 1; v < arr_type.length; ++v) {
            stringBuilder0.append(", ");
            stringBuilder0.append(p0.q(arr_type[v]));
        }
        stringBuilder0.append(">");
        return stringBuilder0.toString();
    }
}

