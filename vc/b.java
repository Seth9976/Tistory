package vc;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import dev.chrisbanes.snapper.SnapperLayoutItemInfo;
import kotlin.jvm.internal.Intrinsics;

public final class b extends SnapperLayoutItemInfo {
    public final LazyListItemInfo a;

    public b(LazyListItemInfo lazyListItemInfo0) {
        Intrinsics.checkNotNullParameter(lazyListItemInfo0, "lazyListItem");
        super();
        this.a = lazyListItemInfo0;
    }

    @Override  // dev.chrisbanes.snapper.SnapperLayoutItemInfo
    public final int getIndex() {
        return this.a.getIndex();
    }

    @Override  // dev.chrisbanes.snapper.SnapperLayoutItemInfo
    public final int getOffset() {
        return this.a.getOffset();
    }

    @Override  // dev.chrisbanes.snapper.SnapperLayoutItemInfo
    public final int getSize() {
        return this.a.getSize();
    }
}

