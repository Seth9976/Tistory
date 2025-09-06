package d0;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider;
import androidx.compose.foundation.lazy.layout.PrefetchRequest;
import java.util.ArrayList;

public final class y implements NestedPrefetchScope {
    public final ArrayList a;
    public final LazyLayoutPrefetchState b;

    public y(LazyLayoutPrefetchState lazyLayoutPrefetchState0) {
        this.b = lazyLayoutPrefetchState0;
        this.a = new ArrayList();
    }

    @Override  // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
    public final void schedulePrefetch(int v) {
        this.schedulePrefetch-0kLqBqw(v, 0x400200000000L);
    }

    @Override  // androidx.compose.foundation.lazy.layout.NestedPrefetchScope
    public final void schedulePrefetch-0kLqBqw(int v, long v1) {
        LazyLayoutPrefetchState lazyLayoutPrefetchState0 = this.b;
        PrefetchHandleProvider prefetchHandleProvider0 = lazyLayoutPrefetchState0.getPrefetchHandleProvider$foundation_release();
        if(prefetchHandleProvider0 == null) {
            return;
        }
        PrefetchRequest prefetchRequest0 = prefetchHandleProvider0.createNestedPrefetchRequest-VKLhPVY(v, v1, lazyLayoutPrefetchState0.c);
        this.a.add(prefetchRequest0);
    }
}

