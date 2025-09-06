package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B#\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR.\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"androidx/paging/AccessorState$PendingRequest", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/PagingState;", "pagingState", "<init>", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;)V", "a", "Landroidx/paging/LoadType;", "getLoadType", "()Landroidx/paging/LoadType;", "b", "Landroidx/paging/PagingState;", "getPagingState", "()Landroidx/paging/PagingState;", "setPagingState", "(Landroidx/paging/PagingState;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AccessorState.PendingRequest {
    public final LoadType a;
    public PagingState b;

    public AccessorState.PendingRequest(@NotNull LoadType loadType0, @NotNull PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        Intrinsics.checkNotNullParameter(pagingState0, "pagingState");
        super();
        this.a = loadType0;
        this.b = pagingState0;
    }

    @NotNull
    public final LoadType getLoadType() {
        return this.a;
    }

    @NotNull
    public final PagingState getPagingState() {
        return this.b;
    }

    public final void setPagingState(@NotNull PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(pagingState0, "<set-?>");
        this.b = pagingState0;
    }
}

