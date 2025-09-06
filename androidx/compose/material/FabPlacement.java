package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000E\u001A\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000E\u001A\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/FabPlacement;", "", "", "isDocked", "", "left", "width", "height", "<init>", "(ZIII)V", "a", "Z", "()Z", "b", "I", "getLeft", "()I", "c", "getWidth", "d", "getHeight", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FabPlacement {
    public static final int $stable;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public FabPlacement(boolean z, int v, int v1, int v2) {
        this.a = z;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    public final int getHeight() {
        return this.d;
    }

    public final int getLeft() {
        return this.b;
    }

    public final int getWidth() {
        return this.c;
    }

    public final boolean isDocked() {
        return this.a;
    }
}

