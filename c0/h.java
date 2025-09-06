package c0;

import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemProvider;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.material3.gd;
import androidx.compose.material3.j6;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.Intrinsics;

public final class h implements LazyGridItemProvider {
    public final LazyGridState a;
    public final LazyGridIntervalContent b;
    public final NearestRangeKeyIndexMap c;

    public h(LazyGridState lazyGridState0, LazyGridIntervalContent lazyGridIntervalContent0, NearestRangeKeyIndexMap nearestRangeKeyIndexMap0) {
        this.a = lazyGridState0;
        this.b = lazyGridIntervalContent0;
        this.c = nearestRangeKeyIndexMap0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void Item(int v, Object object0, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x5905C824);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changedInstance(object0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changed(this) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5905C824, v2, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
            }
            LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(object0, v, this.a.getPinnedItems$foundation_release(), ComposableLambdaKt.rememberComposableLambda(0x2B48C518, true, new gd(this, v, 5), composer1, 54), composer1, v2 >> 3 & 14 | 0xC00 | v2 << 3 & 0x70);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j6(this, v, object0, v1, 2));
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof h ? Intrinsics.areEqual(this.b, ((h)object0).b) : false;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object getContentType(int v) {
        return this.b.getContentType(v);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getIndex(Object object0) {
        return this.c.getIndex(object0);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.b.getItemCount();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object getKey(int v) {
        Object object0 = this.c.getKey(v);
        return object0 == null ? this.b.getKey(v) : object0;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.c;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public final LazyGridSpanLayoutProvider getSpanLayoutProvider() {
        return this.b.getSpanLayoutProvider$foundation_release();
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
}

