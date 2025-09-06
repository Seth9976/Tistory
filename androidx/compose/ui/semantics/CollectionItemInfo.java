package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001A\u0004\b\u000E\u0010\fR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000F\u0010\n\u001A\u0004\b\u0010\u0010\fR\u0017\u0010\u0006\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001A\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/semantics/CollectionItemInfo;", "", "", "rowIndex", "rowSpan", "columnIndex", "columnSpan", "<init>", "(IIII)V", "a", "I", "getRowIndex", "()I", "b", "getRowSpan", "c", "getColumnIndex", "d", "getColumnSpan", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CollectionItemInfo {
    public static final int $stable;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public CollectionItemInfo(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public final int getColumnIndex() {
        return this.c;
    }

    public final int getColumnSpan() {
        return this.d;
    }

    public final int getRowIndex() {
        return this.a;
    }

    public final int getRowSpan() {
        return this.b;
    }
}

