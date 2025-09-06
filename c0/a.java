package c0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope;
import androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class a implements LazyGridPrefetchStrategy {
    public final int a;
    public int b;
    public final MutableVector c;
    public boolean d;

    public a(int v) {
        this.a = v;
        this.b = -1;
        this.c = new MutableVector(new PrefetchHandle[16], 0);
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final void onNestedPrefetch(NestedPrefetchScope nestedPrefetchScope0, int v) {
        for(int v1 = 0; v1 < this.a; ++v1) {
            nestedPrefetchScope0.schedulePrefetch(v + v1);
        }
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final void onScroll(LazyGridPrefetchScope lazyGridPrefetchScope0, float f, LazyGridLayoutInfo lazyGridLayoutInfo0) {
        int v2;
        int v1;
        int v = 0;
        if(!lazyGridLayoutInfo0.getVisibleItemsInfo().isEmpty()) {
            boolean z = Float.compare(f, 0.0f) < 0;
            if(z) {
                LazyGridItemInfo lazyGridItemInfo0 = (LazyGridItemInfo)CollectionsKt___CollectionsKt.last(lazyGridLayoutInfo0.getVisibleItemsInfo());
                v1 = (lazyGridLayoutInfo0.getOrientation() == Orientation.Vertical ? lazyGridItemInfo0.getRow() : lazyGridItemInfo0.getColumn()) + 1;
                v2 = ((LazyGridItemInfo)CollectionsKt___CollectionsKt.last(lazyGridLayoutInfo0.getVisibleItemsInfo())).getIndex() + 1;
            }
            else {
                LazyGridItemInfo lazyGridItemInfo1 = (LazyGridItemInfo)CollectionsKt___CollectionsKt.first(lazyGridLayoutInfo0.getVisibleItemsInfo());
                v1 = (lazyGridLayoutInfo0.getOrientation() == Orientation.Vertical ? lazyGridItemInfo1.getRow() : lazyGridItemInfo1.getColumn()) - 1;
                v2 = ((LazyGridItemInfo)CollectionsKt___CollectionsKt.first(lazyGridLayoutInfo0.getVisibleItemsInfo())).getIndex() - 1;
            }
            if(v2 >= 0 && v2 < lazyGridLayoutInfo0.getTotalItemsCount()) {
                MutableVector mutableVector0 = this.c;
                if(v1 != this.b) {
                    if(this.d != z) {
                        int v3 = mutableVector0.getSize();
                        if(v3 > 0) {
                            Object[] arr_object = mutableVector0.getContent();
                            int v4 = 0;
                            while(true) {
                                ((PrefetchHandle)arr_object[v4]).cancel();
                                ++v4;
                                if(v4 >= v3) {
                                    break;
                                }
                            }
                        }
                    }
                    this.d = z;
                    this.b = v1;
                    mutableVector0.clear();
                    mutableVector0.addAll(mutableVector0.getSize(), lazyGridPrefetchScope0.scheduleLinePrefetch(v1));
                }
                if(z) {
                    LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo)CollectionsKt___CollectionsKt.last(lazyGridLayoutInfo0.getVisibleItemsInfo());
                    int v5 = LazyGridSnapLayoutInfoProviderKt.sizeOnMainAxis(lazyGridItemInfo2, lazyGridLayoutInfo0.getOrientation());
                    int v6 = lazyGridLayoutInfo0.getMainAxisItemSpacing();
                    if(((float)(LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo2, lazyGridLayoutInfo0.getOrientation()) + v5 + v6 - lazyGridLayoutInfo0.getViewportEndOffset())) < -f) {
                        int v7 = mutableVector0.getSize();
                        if(v7 > 0) {
                            Object[] arr_object1 = mutableVector0.getContent();
                            do {
                                ((PrefetchHandle)arr_object1[v]).markAsUrgent();
                                ++v;
                            }
                            while(v < v7);
                        }
                    }
                }
                else {
                    LazyGridItemInfo lazyGridItemInfo3 = (LazyGridItemInfo)CollectionsKt___CollectionsKt.first(lazyGridLayoutInfo0.getVisibleItemsInfo());
                    if(((float)(lazyGridLayoutInfo0.getViewportStartOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridItemInfo3, lazyGridLayoutInfo0.getOrientation()))) < f) {
                        int v8 = mutableVector0.getSize();
                        if(v8 > 0) {
                            Object[] arr_object2 = mutableVector0.getContent();
                            while(true) {
                                ((PrefetchHandle)arr_object2[v]).markAsUrgent();
                                ++v;
                                if(v >= v8) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final void onVisibleItemsUpdated(LazyGridPrefetchScope lazyGridPrefetchScope0, LazyGridLayoutInfo lazyGridLayoutInfo0) {
        int v;
        if(this.b != -1 && !lazyGridLayoutInfo0.getVisibleItemsInfo().isEmpty()) {
            if(this.d) {
                LazyGridItemInfo lazyGridItemInfo0 = (LazyGridItemInfo)CollectionsKt___CollectionsKt.last(lazyGridLayoutInfo0.getVisibleItemsInfo());
                v = (lazyGridLayoutInfo0.getOrientation() == Orientation.Vertical ? lazyGridItemInfo0.getRow() : lazyGridItemInfo0.getColumn()) + 1;
            }
            else {
                LazyGridItemInfo lazyGridItemInfo1 = (LazyGridItemInfo)CollectionsKt___CollectionsKt.first(lazyGridLayoutInfo0.getVisibleItemsInfo());
                v = (lazyGridLayoutInfo0.getOrientation() == Orientation.Vertical ? lazyGridItemInfo1.getRow() : lazyGridItemInfo1.getColumn()) - 1;
            }
            if(this.b != v) {
                this.b = -1;
                MutableVector mutableVector0 = this.c;
                int v1 = mutableVector0.getSize();
                if(v1 > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    int v2 = 0;
                    while(true) {
                        ((PrefetchHandle)arr_object[v2]).cancel();
                        ++v2;
                        if(v2 >= v1) {
                            break;
                        }
                    }
                }
                mutableVector0.clear();
            }
        }
    }
}

