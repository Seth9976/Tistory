package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000E\b\u0001\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001A\u0004\b\r\u0010\u000BR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000E\u0010\t\u001A\u0004\b\u000F\u0010\u000B¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/FabPlacement;", "", "", "left", "width", "height", "<init>", "(III)V", "a", "I", "getLeft", "()I", "b", "getWidth", "c", "getHeight", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FabPlacement {
    public static final int $stable;
    public final int a;
    public final int b;
    public final int c;

    public FabPlacement(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    public final int getHeight() {
        return this.c;
    }

    public final int getLeft() {
        return this.a;
    }

    public final int getWidth() {
        return this.b;
    }
}

