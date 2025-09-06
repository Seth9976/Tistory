package com.kakao.tistory.presentation.common.livedata;

import android.util.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000F\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001B\u0012\u0012\u0010\u0004\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\f\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\u00072\u0014\u0010\n\u001A\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000E\u001A\u00020\u000B2\u0014\u0010\n\u001A\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\tH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ%\u0010\u0010\u001A\u00020\u000B2\u0014\u0010\n\u001A\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000FJ\u0017\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\u000B¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0019\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/common/livedata/ChangedEntryLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "Landroid/util/LongSparseArray;", "source", "<init>", "(Landroidx/lifecycle/MutableLiveData;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Landroidx/lifecycle/Observer;", "observer", "", "observe", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V", "observeForever", "(Landroidx/lifecycle/Observer;)V", "removeObserver", "removeObservers", "(Landroidx/lifecycle/LifecycleOwner;)V", "clear", "()V", "c", "Landroidx/lifecycle/Observer;", "getSourceObserver", "()Landroidx/lifecycle/Observer;", "sourceObserver", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ChangedEntryLiveData extends MutableLiveData {
    public static final int $stable = 8;
    public final MutableLiveData a;
    public LongSparseArray b;
    public final Observer c;

    public ChangedEntryLiveData(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "source");
        super();
        this.a = mutableLiveData0;
        LongSparseArray longSparseArray0 = (LongSparseArray)mutableLiveData0.getValue();
        if(longSparseArray0 != null) {
            this.b = longSparseArray0.clone();
        }
        this.c = new q(this, 1);
    }

    public static final void a(ChangedEntryLiveData changedEntryLiveData0, LongSparseArray longSparseArray0) {
        Intrinsics.checkNotNullParameter(changedEntryLiveData0, "this$0");
        Intrinsics.checkNotNullParameter(longSparseArray0, "it");
        LongSparseArray longSparseArray1 = new LongSparseArray();
        int v = longSparseArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = longSparseArray0.keyAt(v1);
            Object object0 = changedEntryLiveData0.b == null ? null : changedEntryLiveData0.b.get(v2);
            Object object1 = longSparseArray0.valueAt(v1);
            if(!Intrinsics.areEqual(object0, object1)) {
                longSparseArray1.put(v2, object1);
            }
        }
        LongSparseArray longSparseArray2 = changedEntryLiveData0.b;
        if(longSparseArray2 != null) {
            longSparseArray2.clear();
        }
        changedEntryLiveData0.b = longSparseArray0.clone();
        changedEntryLiveData0.setValue(longSparseArray1);
    }

    public final void clear() {
        LongSparseArray longSparseArray0 = (LongSparseArray)this.a.getValue();
        if(longSparseArray0 != null) {
            longSparseArray0.clear();
        }
        LongSparseArray longSparseArray1 = this.b;
        if(longSparseArray1 != null) {
            longSparseArray1.clear();
        }
    }

    @NotNull
    public final Observer getSourceObserver() {
        return this.c;
    }

    @Override  // androidx.lifecycle.LiveData
    public void observe(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Observer observer0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        Intrinsics.checkNotNullParameter(observer0, "observer");
        this.a.observe(lifecycleOwner0, this.c);
        super.observe(lifecycleOwner0, observer0);
    }

    @Override  // androidx.lifecycle.LiveData
    public void observeForever(@NotNull Observer observer0) {
        Intrinsics.checkNotNullParameter(observer0, "observer");
        this.a.observeForever(this.c);
        super.observeForever(observer0);
    }

    @Override  // androidx.lifecycle.LiveData
    public void removeObserver(@NotNull Observer observer0) {
        Intrinsics.checkNotNullParameter(observer0, "observer");
        this.a.removeObserver(this.c);
        super.removeObserver(observer0);
    }

    @Override  // androidx.lifecycle.LiveData
    public void removeObservers(@NotNull LifecycleOwner lifecycleOwner0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        this.a.removeObservers(lifecycleOwner0);
        super.removeObservers(lifecycleOwner0);
    }
}

