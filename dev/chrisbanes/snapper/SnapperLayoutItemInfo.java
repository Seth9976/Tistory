package dev.chrisbanes.snapper;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import wb.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000B\u001A\u00020\fH\u0016R\u0012\u0010\u0003\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u0006¨\u0006\r"}, d2 = {"Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "", "()V", "index", "", "getIndex", "()I", "offset", "getOffset", "size", "getSize", "toString", "", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public abstract class SnapperLayoutItemInfo {
    public static final int $stable;

    public abstract int getIndex();

    public abstract int getOffset();

    public abstract int getSize();

    @Override
    @NotNull
    public String toString() {
        int v = this.getIndex();
        int v1 = this.getOffset();
        return a.c(this.getSize(), ")", q.u("SnapperLayoutItemInfo(index=", v, ", offset=", v1, ", size="));
    }
}

