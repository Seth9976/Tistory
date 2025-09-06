package androidx.paging;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0011\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001A\u00020\n2\u0018\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\bH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\tH\u0000\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001D\u001A\u00020\u001CH\u00D6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010 \u001A\u00020\u001FH\u00D6\u0001\u00A2\u0006\u0004\b \u0010!J\u001A\u0010$\u001A\u00020#2\b\u0010\"\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0017R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010\'\u001A\u0004\b*\u0010\u0017R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b+\u0010\'\u001A\u0004\b,\u0010\u0017R\u0017\u0010/\u001A\u00020#8G\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100R\u0017\u00102\u001A\u00020#8\u0006\u00A2\u0006\f\n\u0004\b1\u0010.\u001A\u0004\b2\u00100\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u00064"}, d2 = {"Landroidx/paging/LoadStates;", "", "Landroidx/paging/LoadState;", "refresh", "prepend", "append", "<init>", "(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;)V", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "", "op", "forEach", "(Lkotlin/jvm/functions/Function2;)V", "loadType", "newState", "modifyState$paging_common_release", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)Landroidx/paging/LoadStates;", "modifyState", "get$paging_common_release", "(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;", "get", "component1", "()Landroidx/paging/LoadState;", "component2", "component3", "copy", "(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;)Landroidx/paging/LoadStates;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/paging/LoadState;", "getRefresh", "b", "getPrepend", "c", "getAppend", "d", "Z", "hasError", "()Z", "e", "isIdle", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LoadStates {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/LoadStates$Companion;", "", "Landroidx/paging/LoadStates;", "IDLE", "Landroidx/paging/LoadStates;", "getIDLE", "()Landroidx/paging/LoadStates;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final LoadStates getIDLE() {
            return LoadStates.f;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LoadType.values().length];
            try {
                arr_v[LoadType.APPEND.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.PREPEND.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.REFRESH.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final LoadState a;
    public final LoadState b;
    public final LoadState c;
    public final boolean d;
    public final boolean e;
    public static final LoadStates f;

    static {
        LoadStates.Companion = new Companion(null);
        LoadStates.f = new LoadStates(NotLoading.Companion.getIncomplete$paging_common_release(), NotLoading.Companion.getIncomplete$paging_common_release(), NotLoading.Companion.getIncomplete$paging_common_release());
    }

    public LoadStates(@NotNull LoadState loadState0, @NotNull LoadState loadState1, @NotNull LoadState loadState2) {
        Intrinsics.checkNotNullParameter(loadState0, "refresh");
        Intrinsics.checkNotNullParameter(loadState1, "prepend");
        Intrinsics.checkNotNullParameter(loadState2, "append");
        super();
        this.a = loadState0;
        this.b = loadState1;
        this.c = loadState2;
        boolean z = true;
        this.d = loadState0 instanceof Error || loadState2 instanceof Error || loadState1 instanceof Error;
        if(!(loadState0 instanceof NotLoading) || !(loadState2 instanceof NotLoading) || !(loadState1 instanceof NotLoading)) {
            z = false;
        }
        this.e = z;
    }

    @NotNull
    public final LoadState component1() {
        return this.a;
    }

    @NotNull
    public final LoadState component2() {
        return this.b;
    }

    @NotNull
    public final LoadState component3() {
        return this.c;
    }

    @NotNull
    public final LoadStates copy(@NotNull LoadState loadState0, @NotNull LoadState loadState1, @NotNull LoadState loadState2) {
        Intrinsics.checkNotNullParameter(loadState0, "refresh");
        Intrinsics.checkNotNullParameter(loadState1, "prepend");
        Intrinsics.checkNotNullParameter(loadState2, "append");
        return new LoadStates(loadState0, loadState1, loadState2);
    }

    public static LoadStates copy$default(LoadStates loadStates0, LoadState loadState0, LoadState loadState1, LoadState loadState2, int v, Object object0) {
        if((v & 1) != 0) {
            loadState0 = loadStates0.a;
        }
        if((v & 2) != 0) {
            loadState1 = loadStates0.b;
        }
        if((v & 4) != 0) {
            loadState2 = loadStates0.c;
        }
        return loadStates0.copy(loadState0, loadState1, loadState2);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LoadStates)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((LoadStates)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((LoadStates)object0).b) ? Intrinsics.areEqual(this.c, ((LoadStates)object0).c) : false;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void forEach(@NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "op");
        function20.invoke(LoadType.REFRESH, this.getRefresh());
        function20.invoke(LoadType.PREPEND, this.getPrepend());
        function20.invoke(LoadType.APPEND, this.getAppend());
    }

    @NotNull
    public final LoadState get$paging_common_release(@NotNull LoadType loadType0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        switch(WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()]) {
            case 1: {
                return this.c;
            }
            case 2: {
                return this.b;
            }
            case 3: {
                return this.a;
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

    @JvmName(name = "hasError")
    public final boolean hasError() {
        return this.d;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    public final boolean isIdle() {
        return this.e;
    }

    @NotNull
    public final LoadStates modifyState$paging_common_release(@NotNull LoadType loadType0, @NotNull LoadState loadState0) {
        Intrinsics.checkNotNullParameter(loadType0, "loadType");
        Intrinsics.checkNotNullParameter(loadState0, "newState");
        switch(WhenMappings.$EnumSwitchMapping$0[loadType0.ordinal()]) {
            case 1: {
                return LoadStates.copy$default(this, null, null, loadState0, 3, null);
            }
            case 2: {
                return LoadStates.copy$default(this, null, loadState0, null, 5, null);
            }
            case 3: {
                return LoadStates.copy$default(this, loadState0, null, null, 6, null);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override
    @NotNull
    public String toString() {
        return "LoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ')';
    }
}

