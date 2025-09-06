package androidx.paging;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY})
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000E\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B/\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\u000B\u0012\b\u0010\f\u001A\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/paging/InitialPagedList;", "K", "", "V", "Landroidx/paging/ContiguousPagedList;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "notifyDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "backgroundDispatcher", "config", "Landroidx/paging/PagedList$Config;", "initialLastKey", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$Config;Ljava/lang/Object;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class InitialPagedList extends ContiguousPagedList {
    public InitialPagedList(@NotNull CoroutineScope coroutineScope0, @NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull CoroutineDispatcher coroutineDispatcher1, @NotNull Config pagedList$Config0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(coroutineDispatcher1, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
        super(new LegacyPagingSource(coroutineDispatcher0, new InitialDataSource()), coroutineScope0, coroutineDispatcher0, coroutineDispatcher1, null, pagedList$Config0, Page.Companion.empty$paging_common_release(), object0);
    }
}

