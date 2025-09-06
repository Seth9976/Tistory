package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambda;
import kotlin.jvm.internal.Intrinsics;

public final class ea {
    public final SnackbarData a;
    public final ComposableLambda b;

    public ea(SnackbarData snackbarData0, ComposableLambda composableLambda0) {
        this.a = snackbarData0;
        this.b = composableLambda0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ea)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((ea)object0).a) ? Intrinsics.areEqual(this.b, ((ea)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.b.hashCode() : this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}

