package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.layout.PinnableContainer.PinnedHandle;
import androidx.compose.ui.layout.PinnableContainer;

public final class c implements PinnedItem, PinnedHandle, PinnableContainer {
    public final Object a;
    public final LazyLayoutPinnedItemList b;
    public final MutableIntState c;
    public final MutableIntState d;
    public final MutableState e;
    public final MutableState f;

    public c(Object object0, LazyLayoutPinnedItemList lazyLayoutPinnedItemList0) {
        this.a = object0;
        this.b = lazyLayoutPinnedItemList0;
        this.c = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.d = SnapshotIntStateKt.mutableIntStateOf(0);
        this.e = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.f = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList$PinnedItem
    public final int getIndex() {
        return this.c.getIntValue();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList$PinnedItem
    public final Object getKey() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.PinnableContainer
    public final PinnedHandle pin() {
        MutableIntState mutableIntState0 = this.d;
        if(mutableIntState0.getIntValue() == 0) {
            this.b.pin$foundation_release(this);
            PinnableContainer pinnableContainer0 = (PinnableContainer)this.f.getValue();
            PinnedHandle pinnableContainer$PinnedHandle0 = pinnableContainer0 == null ? null : pinnableContainer0.pin();
            this.e.setValue(pinnableContainer$PinnedHandle0);
        }
        mutableIntState0.setIntValue(mutableIntState0.getIntValue() + 1);
        return this;
    }

    @Override  // androidx.compose.ui.layout.PinnableContainer$PinnedHandle
    public final void release() {
        MutableIntState mutableIntState0 = this.d;
        if(mutableIntState0.getIntValue() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        mutableIntState0.setIntValue(mutableIntState0.getIntValue() - 1);
        if(mutableIntState0.getIntValue() == 0) {
            this.b.release$foundation_release(this);
            MutableState mutableState0 = this.e;
            PinnedHandle pinnableContainer$PinnedHandle0 = (PinnedHandle)mutableState0.getValue();
            if(pinnableContainer$PinnedHandle0 != null) {
                pinnableContainer$PinnedHandle0.release();
            }
            mutableState0.setValue(null);
        }
    }
}

