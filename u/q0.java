package u;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import kotlin.jvm.internal.Intrinsics;

public final class q0 {
    public ImageBitmap a;
    public Canvas b;
    public CanvasDrawScope c;
    public Path d;

    public q0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q0)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((q0)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((q0)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((q0)object0).c) ? Intrinsics.areEqual(this.d, ((q0)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Path path0 = this.d;
        if(path0 != null) {
            v = path0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}

