package androidx.paging;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\t¢\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0012R\"\u0010\u0019\u001A\u00020\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001D\u001A\u00020\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u0014\u001A\u0004\b\u001B\u0010\u0016\"\u0004\b\u001C\u0010\u0018R\"\u0010!\u001A\u00020\t8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001E\u0010\u0014\u001A\u0004\b\u001F\u0010\u0016\"\u0004\b \u0010\u0018¨\u0006\""}, d2 = {"Landroidx/paging/MutableLoadStateCollection;", "", "<init>", "()V", "Landroidx/paging/LoadStates;", "snapshot", "()Landroidx/paging/LoadStates;", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/LoadState;", "get", "(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;", "type", "state", "", "set", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", "states", "(Landroidx/paging/LoadStates;)V", "a", "Landroidx/paging/LoadState;", "getRefresh", "()Landroidx/paging/LoadState;", "setRefresh", "(Landroidx/paging/LoadState;)V", "refresh", "b", "getPrepend", "setPrepend", "prepend", "c", "getAppend", "setAppend", "append", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MutableLoadStateCollection {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LoadType.values().length];
            try {
                arr_v[LoadType.REFRESH.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.APPEND.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.PREPEND.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public LoadState a;
    public LoadState b;
    public LoadState c;

    public MutableLoadStateCollection() {
        this.a = NotLoading.Companion.getIncomplete$paging_common_release();
        this.b = NotLoading.Companion.getIncomplete$paging_common_release();
        this.c = NotLoading.Companion.getIncomplete$paging_common_release();
    }

    @NotNull
    public final LoadState get(@NotNull LoadType loadType0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        switch(WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()]) {
            case 1: {
                return this.a;
            }
            case 2: {
                return this.c;
            }
            case 3: {
                return this.b;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final LoadState getAppend() {
        return this.c;
    }

    @NotNull
    public final LoadState getPrepend() {
        return this.b;
    }

    @NotNull
    public final LoadState getRefresh() {
        return this.a;
    }

    public final void set(@NotNull LoadStates loadStates0) {
        Intrinsics.checkNotNullParameter(loadStates0, "states");
        this.a = loadStates0.getRefresh();
        this.c = loadStates0.getAppend();
        this.b = loadStates0.getPrepend();
    }

    public final void set(@NotNull LoadType loadType0, @NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadType0, "type");
        Intrinsics.checkNotNullParameter(loadState0, "state");
        switch(WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()]) {
            case 1: {
                this.a = loadState0;
                return;
            }
            case 2: {
                this.c = loadState0;
                return;
            }
            case 3: {
                this.b = loadState0;
                return;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void setAppend(@NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadState0, "<set-?>");
        this.c = loadState0;
    }

    public final void setPrepend(@NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadState0, "<set-?>");
        this.b = loadState0;
    }

    public final void setRefresh(@NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadState0, "<set-?>");
        this.a = loadState0;
    }

    @NotNull
    public final LoadStates snapshot() {
        return new LoadStates(this.a, this.b, this.c);
    }
}

