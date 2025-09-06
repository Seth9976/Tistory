package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000B\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\b\u001A\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/ui/semantics/CollectionInfo;", "", "", "rowCount", "columnCount", "<init>", "(II)V", "a", "I", "getRowCount", "()I", "b", "getColumnCount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CollectionInfo {
    public static final int $stable;
    public final int a;
    public final int b;

    public CollectionInfo(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public final int getColumnCount() {
        return this.b;
    }

    public final int getRowCount() {
        return this.a;
    }
}

