package androidx.paging;

import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B!\u0012\u0018\u0010\u0007\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\nH\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001C\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/paging/InvalidatingPagingSourceFactory;", "", "Key", "Value", "Landroidx/paging/PagingSourceFactory;", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "pagingSources$paging_common_release", "()Ljava/util/List;", "pagingSources", "invoke", "()Landroidx/paging/PagingSource;", "", "invalidate", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInvalidatingPagingSourceFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidatingPagingSourceFactory.kt\nandroidx/paging/InvalidatingPagingSourceFactory\n+ 2 Atomics.kt\nandroidx/paging/internal/AtomicsKt\n*L\n1#1,73:1\n54#2,6:74\n54#2,6:80\n*S KotlinDebug\n*F\n+ 1 InvalidatingPagingSourceFactory.kt\nandroidx/paging/InvalidatingPagingSourceFactory\n*L\n50#1:74,6\n61#1:80,6\n*E\n"})
public final class InvalidatingPagingSourceFactory implements PagingSourceFactory {
    public final Function0 a;
    public final ReentrantLock b;
    public List c;

    public InvalidatingPagingSourceFactory(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "pagingSourceFactory");
        super();
        this.a = function00;
        this.b = new ReentrantLock();
        this.c = CollectionsKt__CollectionsKt.emptyList();
    }

    public final void invalidate() {
        try {
            this.b.lock();
            List list0 = this.c;
            this.c = CollectionsKt__CollectionsKt.emptyList();
        }
        finally {
            this.b.unlock();
        }
        for(Object object0: list0) {
            PagingSource pagingSource0 = (PagingSource)object0;
            if(!pagingSource0.getInvalid()) {
                pagingSource0.invalidate();
            }
        }
    }

    @Override  // androidx.paging.PagingSourceFactory
    @NotNull
    public PagingSource invoke() {
        PagingSource pagingSource0 = (PagingSource)this.a.invoke();
        try {
            this.b.lock();
            this.c = CollectionsKt___CollectionsKt.plus(this.c, pagingSource0);
            return pagingSource0;
        }
        finally {
            this.b.unlock();
        }
    }

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.invoke();
    }

    @VisibleForTesting
    @NotNull
    public final List pagingSources$paging_common_release() {
        return this.c;
    }
}

