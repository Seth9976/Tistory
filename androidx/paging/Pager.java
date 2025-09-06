package androidx.paging;

import androidx.compose.ui.platform.h;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s4.e1;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00018\u0000\u0012\u0014\u0010\b\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007\u0012\u0018\u0010\u000B\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\rB7\b\u0017\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00018\u0000\u0012\u0018\u0010\u000B\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\u000ER)\u0010\u0017\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000F8\u0006¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/paging/Pager;", "", "Key", "Value", "Landroidx/paging/PagingConfig;", "config", "initialKey", "Landroidx/paging/RemoteMediator;", "remoteMediator", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "<init>", "(Landroidx/paging/PagingConfig;Ljava/lang/Object;Landroidx/paging/RemoteMediator;Lkotlin/jvm/functions/Function0;)V", "(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "a", "Lkotlinx/coroutines/flow/Flow;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", "getFlow$annotations", "()V", "flow", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Pager {
    public final Flow a;

    @ExperimentalPagingApi
    public Pager(@NotNull PagingConfig pagingConfig0, @Nullable Object object0, @Nullable RemoteMediator remoteMediator0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(pagingConfig0, "config");
        Intrinsics.checkNotNullParameter(function00, "pagingSourceFactory");
        super();
        h h0 = function00 instanceof SuspendingPagingSourceFactory ? new h(1, function00, SuspendingPagingSourceFactory.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7) : new e1(function00, null);
        this.a = new PageFetcher(h0, object0, pagingConfig0, remoteMediator0).getFlow();
    }

    public Pager(PagingConfig pagingConfig0, Object object0, RemoteMediator remoteMediator0, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            object0 = null;
        }
        this(pagingConfig0, object0, remoteMediator0, function00);
    }

    @JvmOverloads
    public Pager(@NotNull PagingConfig pagingConfig0, @Nullable Object object0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(pagingConfig0, "config");
        Intrinsics.checkNotNullParameter(function00, "pagingSourceFactory");
        this(pagingConfig0, object0, null, function00);
    }

    public Pager(PagingConfig pagingConfig0, Object object0, Function0 function00, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            object0 = null;
        }
        this(pagingConfig0, object0, function00);
    }

    @JvmOverloads
    public Pager(@NotNull PagingConfig pagingConfig0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(pagingConfig0, "config");
        Intrinsics.checkNotNullParameter(function00, "pagingSourceFactory");
        this(pagingConfig0, null, function00, 2, null);
    }

    @NotNull
    public final Flow getFlow() {
        return this.a;
    }

    public static void getFlow$annotations() {
    }
}

