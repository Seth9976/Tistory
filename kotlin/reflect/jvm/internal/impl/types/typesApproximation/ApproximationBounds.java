package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ApproximationBounds {
    public final Object a;
    public final Object b;

    public ApproximationBounds(Object object0, Object object1) {
        this.a = object0;
        this.b = object1;
    }

    public final Object component1() {
        return this.a;
    }

    public final Object component2() {
        return this.b;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ApproximationBounds)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((ApproximationBounds)object0).a) ? Intrinsics.areEqual(this.b, ((ApproximationBounds)object0).b) : false;
    }

    public final Object getLower() {
        return this.a;
    }

    public final Object getUpper() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Object object0 = this.b;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "ApproximationBounds(lower=" + this.a + ", upper=" + this.b + ')';
    }
}

