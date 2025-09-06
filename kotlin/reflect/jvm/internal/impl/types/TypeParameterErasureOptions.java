package kotlin.reflect.jvm.internal.impl.types;

public final class TypeParameterErasureOptions {
    public final boolean a;
    public final boolean b;

    public TypeParameterErasureOptions(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    public final boolean getIntersectUpperBounds() {
        return this.b;
    }

    public final boolean getLeaveNonTypeParameterTypes() {
        return this.a;
    }
}

