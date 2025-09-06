package b0;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListPrefetchScope;
import androidx.compose.foundation.lazy.LazyListPrefetchStrategy;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class a implements LazyListPrefetchStrategy {
    public final int a;
    public int b;
    public PrefetchHandle c;
    public boolean d;

    public a(int v) {
        this.a = v;
        this.b = -1;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope0, int v) {
        for(int v1 = 0; v1 < this.a; ++v1) {
            nestedPrefetchScope0.schedulePrefetch(v + v1);
        }
    }

    @Override  // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void onScroll(LazyListPrefetchScope lazyListPrefetchScope0, float f, LazyListLayoutInfo lazyListLayoutInfo0) {
        if(!lazyListLayoutInfo0.getVisibleItemsInfo().isEmpty()) {
            boolean z = Float.compare(f, 0.0f) < 0;
            int v = z ? ((LazyListItemInfo)CollectionsKt___CollectionsKt.last(lazyListLayoutInfo0.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo)CollectionsKt___CollectionsKt.first(lazyListLayoutInfo0.getVisibleItemsInfo())).getIndex() - 1;
            if(v >= 0 && v < lazyListLayoutInfo0.getTotalItemsCount()) {
                if(v != this.b) {
                    if(this.d != z) {
                        PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle0 = this.c;
                        if(lazyLayoutPrefetchState$PrefetchHandle0 != null) {
                            lazyLayoutPrefetchState$PrefetchHandle0.cancel();
                        }
                    }
                    this.d = z;
                    this.b = v;
                    this.c = lazyListPrefetchScope0.schedulePrefetch(v);
                }
                if(z) {
                    LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)CollectionsKt___CollectionsKt.last(lazyListLayoutInfo0.getVisibleItemsInfo());
                    int v1 = lazyListItemInfo0.getOffset();
                    int v2 = lazyListItemInfo0.getSize();
                    int v3 = lazyListLayoutInfo0.getViewportEndOffset();
                    if(((float)(v2 + v1 + lazyListLayoutInfo0.getMainAxisItemSpacing() - v3)) < -f) {
                        PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle1 = this.c;
                        if(lazyLayoutPrefetchState$PrefetchHandle1 != null) {
                            lazyLayoutPrefetchState$PrefetchHandle1.markAsUrgent();
                        }
                    }
                }
                else {
                    LazyListItemInfo lazyListItemInfo1 = (LazyListItemInfo)CollectionsKt___CollectionsKt.first(lazyListLayoutInfo0.getVisibleItemsInfo());
                    if(((float)(lazyListLayoutInfo0.getViewportStartOffset() - lazyListItemInfo1.getOffset())) < f) {
                        PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle2 = this.c;
                        if(lazyLayoutPrefetchState$PrefetchHandle2 != null) {
                            lazyLayoutPrefetchState$PrefetchHandle2.markAsUrgent();
                        }
                    }
                }
            }
        }
    }

    @Override  // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void onVisibleItemsUpdated(LazyListPrefetchScope lazyListPrefetchScope0, LazyListLayoutInfo lazyListLayoutInfo0) {
        if(this.b != -1 && !lazyListLayoutInfo0.getVisibleItemsInfo().isEmpty()) {
            int v = this.d ? ((LazyListItemInfo)CollectionsKt___CollectionsKt.last(lazyListLayoutInfo0.getVisibleItemsInfo())).getIndex() + 1 : ((LazyListItemInfo)CollectionsKt___CollectionsKt.first(lazyListLayoutInfo0.getVisibleItemsInfo())).getIndex() - 1;
            if(this.b != v) {
                this.b = -1;
                PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle0 = this.c;
                if(lazyLayoutPrefetchState$PrefetchHandle0 != null) {
                    lazyLayoutPrefetchState$PrefetchHandle0.cancel();
                }
                this.c = null;
            }
        }
    }
}

