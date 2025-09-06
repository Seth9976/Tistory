package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class f implements WildcardType, TypeImpl {
    public final Type a;
    public final Type b;
    public static final WildcardTypeImpl.Companion c;
    public static final f d;

    static {
        f.c = new WildcardTypeImpl.Companion(null);
        f.d = new f(null, null);
    }

    public f(Type type0, Type type1) {
        this.a = type0;
        this.b = type1;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof WildcardType && Arrays.equals(this.getUpperBounds(), ((WildcardType)object0).getUpperBounds()) && Arrays.equals(this.getLowerBounds(), ((WildcardType)object0).getLowerBounds());
    }

    @Override
    public final Type[] getLowerBounds() {
        return this.b == null ? new Type[0] : new Type[]{this.b};
    }

    @Override  // kotlin.reflect.TypeImpl
    public final String getTypeName() {
        Type type0 = this.b;
        if(type0 != null) {
            return "? super " + TypesJVMKt.access$typeToString(type0);
        }
        return this.a == null || Intrinsics.areEqual(this.a, Object.class) ? "?" : "? extends " + TypesJVMKt.access$typeToString(this.a);
    }

    @Override
    public final Type[] getUpperBounds() {
        Type type0 = this.a;
        if(type0 == null) {
            type0 = Object.class;
        }
        return new Type[]{type0};
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.getUpperBounds()) ^ Arrays.hashCode(this.getLowerBounds());
    }

    @Override
    public final String toString() {
        return this.getTypeName();
    }
}

