package p0;

import androidx.compose.material.SnackbarData;
import androidx.compose.runtime.internal.ComposableLambda;
import kotlin.jvm.internal.Intrinsics;

public final class j4 {
    public final SnackbarData a;
    public final ComposableLambda b;

    public j4(SnackbarData snackbarData0, ComposableLambda composableLambda0) {
        this.a = snackbarData0;
        this.b = composableLambda0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j4)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((j4)object0).a) ? Intrinsics.areEqual(this.b, ((j4)object0).b) : false;
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

