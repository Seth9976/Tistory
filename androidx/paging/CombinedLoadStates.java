package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\r\u001A\u00020\f2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001B\u001A\u00020\u00172\u001E\u0010\u0018\u001A\u001A\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001D\u001A\u0004\b!\u0010\u001FR\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001D\u001A\u0004\b#\u0010\u001FR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010%\u001A\u0004\b)\u0010\'R\u0017\u0010,\u001A\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u0017\u0010/\u001A\u00020\f8G¢\u0006\f\n\u0004\b.\u0010+\u001A\u0004\b/\u0010-¨\u00060"}, d2 = {"Landroidx/paging/CombinedLoadStates;", "", "Landroidx/paging/LoadState;", "refresh", "prepend", "append", "Landroidx/paging/LoadStates;", "source", "mediator", "<init>", "(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function3;", "Landroidx/paging/LoadType;", "", "op", "forEach$paging_common_release", "(Lkotlin/jvm/functions/Function3;)V", "forEach", "a", "Landroidx/paging/LoadState;", "getRefresh", "()Landroidx/paging/LoadState;", "b", "getPrepend", "c", "getAppend", "d", "Landroidx/paging/LoadStates;", "getSource", "()Landroidx/paging/LoadStates;", "e", "getMediator", "f", "Z", "isIdle", "()Z", "g", "hasError", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCombinedLoadStates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStates\n+ 2 LoadStates.kt\nandroidx/paging/LoadStates\n*L\n1#1,161:1\n36#2,4:162\n36#2,4:166\n*S KotlinDebug\n*F\n+ 1 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStates\n*L\n110#1:162,4\n113#1:166,4\n*E\n"})
public final class CombinedLoadStates {
    public final LoadState a;
    public final LoadState b;
    public final LoadState c;
    public final LoadStates d;
    public final LoadStates e;
    public final boolean f;
    public final boolean g;

    public CombinedLoadStates(@NotNull LoadState loadState0, @NotNull LoadState loadState1, @NotNull LoadState loadState2, @NotNull LoadStates loadStates0, @Nullable LoadStates loadStates1) {
        Intrinsics.checkNotNullParameter(loadState0, "refresh");
        Intrinsics.checkNotNullParameter(loadState1, "prepend");
        Intrinsics.checkNotNullParameter(loadState2, "append");
        Intrinsics.checkNotNullParameter(loadStates0, "source");
        super();
        this.a = loadState0;
        this.b = loadState1;
        this.c = loadState2;
        this.d = loadStates0;
        this.e = loadStates1;
        boolean z = false;
        this.f = loadStates0.isIdle() && (loadStates1 == null ? true : loadStates1.isIdle());
        if(loadStates0.hasError() || (loadStates1 == null ? false : loadStates1.hasError())) {
            z = true;
        }
        this.g = z;
    }

    public CombinedLoadStates(LoadState loadState0, LoadState loadState1, LoadState loadState2, LoadStates loadStates0, LoadStates loadStates1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 16) != 0) {
            loadStates1 = null;
        }
        this(loadState0, loadState1, loadState2, loadStates0, loadStates1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(CombinedLoadStates.class != class0 || !Intrinsics.areEqual(this.a, ((CombinedLoadStates)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((CombinedLoadStates)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((CombinedLoadStates)object0).c)) {
                return false;
            }
            return Intrinsics.areEqual(this.d, ((CombinedLoadStates)object0).d) ? Intrinsics.areEqual(this.e, ((CombinedLoadStates)object0).e) : false;
        }
        return false;
    }

    public final void forEach$paging_common_release(@NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "op");
        LoadType loadType0 = LoadType.REFRESH;
        function30.invoke(loadType0, Boolean.FALSE, this.d.getRefresh());
        LoadType loadType1 = LoadType.PREPEND;
        function30.invoke(loadType1, Boolean.FALSE, this.d.getPrepend());
        LoadType loadType2 = LoadType.APPEND;
        function30.invoke(loadType2, Boolean.FALSE, this.d.getAppend());
        LoadStates loadStates0 = this.e;
        if(loadStates0 != null) {
            function30.invoke(loadType0, Boolean.TRUE, loadStates0.getRefresh());
            function30.invoke(loadType1, Boolean.TRUE, loadStates0.getPrepend());
            function30.invoke(loadType2, Boolean.TRUE, loadStates0.getAppend());
        }
    }

    @NotNull
    public final LoadState getAppend() {
        return this.c;
    }

    @Nullable
    public final LoadStates getMediator() {
        return this.e;
    }

    @NotNull
    public final LoadState getPrepend() {
        return this.b;
    }

    @NotNull
    public final LoadState getRefresh() {
        return this.a;
    }

    @NotNull
    public final LoadStates getSource() {
        return this.d;
    }

    @JvmName(name = "hasError")
    public final boolean hasError() {
        return this.g;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = this.c.hashCode();
        int v3 = this.d.hashCode();
        return this.e == null ? (v3 + (v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F) * 0x1F : (v3 + (v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F) * 0x1F + this.e.hashCode();
    }

    public final boolean isIdle() {
        return this.f;
    }

    @Override
    @NotNull
    public String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }
}

