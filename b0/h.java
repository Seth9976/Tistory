package b0;

import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.LazyListItemProvider;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.material3.gd;
import androidx.compose.material3.j6;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class h implements LazyListItemProvider {
    public final LazyListState a;
    public final LazyListIntervalContent b;
    public final LazyItemScopeImpl c;
    public final NearestRangeKeyIndexMap d;

    public h(LazyListState lazyListState0, LazyListIntervalContent lazyListIntervalContent0, LazyItemScopeImpl lazyItemScopeImpl0, NearestRangeKeyIndexMap nearestRangeKeyIndexMap0) {
        this.a = lazyListState0;
        this.b = lazyListIntervalContent0;
        this.c = lazyItemScopeImpl0;
        this.d = nearestRangeKeyIndexMap0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void Item(int v, Object object0, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xE46FF536);
        int v2 = (v1 & 6) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer1.changedInstance(object0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (composer1.changed(this) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE46FF536, v2, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
            }
            LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(object0, v, this.a.getPinnedItems$foundation_release(), ComposableLambdaKt.rememberComposableLambda(0xCED7AFC2, true, new gd(this, v, 4), composer1, 54), composer1, v2 >> 3 & 14 | 0xC00 | v2 << 3 & 0x70);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j6(this, v, object0, v1, 1));
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

    @Override  // androidx.compose.foundation.lazy.LazyListItemProvider
    public final List getHeaderIndexes() {
        return this.b.getHeaderIndexes();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getIndex(Object object0) {
        return this.d.getIndex(object0);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.b.getItemCount();
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemProvider
    public final LazyItemScopeImpl getItemScope() {
        return this.c;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object getKey(int v) {
        Object object0 = this.d.getKey(v);
        return object0 == null ? this.b.getKey(v) : object0;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemProvider
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.d;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
}

