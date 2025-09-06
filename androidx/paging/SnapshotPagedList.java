package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000E\u001A\u00020\u00072\u0018\u0010\r\u001A\u0014\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\nH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0012\u001A\u00020\u00072\u0006\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0017\u001A\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u001A\u0010\u001A\u001A\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001A\u0004\b\u001A\u0010\u0018R\u0016\u0010\u001D\u001A\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/paging/SnapshotPagedList;", "", "T", "Landroidx/paging/PagedList;", "pagedList", "<init>", "(Landroidx/paging/PagedList;)V", "", "detach", "()V", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "callback", "dispatchCurrentLoadState", "(Lkotlin/jvm/functions/Function2;)V", "", "index", "loadAroundInternal", "(I)V", "", "k", "Z", "isImmutable", "()Z", "l", "isDetached", "getLastKey", "()Ljava/lang/Object;", "lastKey", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SnapshotPagedList extends PagedList {
    public final PagedList j;
    public final boolean k;
    public final boolean l;

    public SnapshotPagedList(@NotNull PagedList pagedList0) {
        Intrinsics.checkNotNullParameter(pagedList0, "pagedList");
        super(pagedList0.getPagingSource(), pagedList0.getCoroutineScope$paging_common_release(), pagedList0.getNotifyDispatcher$paging_common_release(), pagedList0.getStorage$paging_common_release().snapshot(), pagedList0.getConfig());
        this.j = pagedList0;
        this.k = true;
        this.l = true;
    }

    @Override  // androidx.paging.PagedList
    public void detach() {
    }

    @Override  // androidx.paging.PagedList
    public void dispatchCurrentLoadState(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "callback");
    }

    @Override  // androidx.paging.PagedList
    @Nullable
    public Object getLastKey() {
        return this.j.getLastKey();
    }

    @Override  // androidx.paging.PagedList
    public boolean isDetached() {
        return this.l;
    }

    @Override  // androidx.paging.PagedList
    public boolean isImmutable() {
        return this.k;
    }

    @Override  // androidx.paging.PagedList
    public void loadAroundInternal(int v) {
    }
}

