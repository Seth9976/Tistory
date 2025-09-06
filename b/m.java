package b;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.Intrinsics;

public final class m extends p {
    public final Rect a;

    public m(Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "bounds");
        super(0);
        this.a = rect0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof m ? Intrinsics.areEqual(this.a, ((m)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "UpdateContentBounds(bounds=" + this.a + ")";
    }
}

