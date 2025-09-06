package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s4.k2;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B)\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0018\u0010\b\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u001C\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0086@¢\u0006\u0004\b\u000B\u0010\fJ\u001C\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/paging/SuspendingPagingSourceFactory;", "", "Key", "Value", "Lkotlin/Function0;", "Landroidx/paging/PagingSource;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "delegate", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;)V", "create", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "()Landroidx/paging/PagingSource;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SuspendingPagingSourceFactory implements Function0 {
    public final CoroutineDispatcher a;
    public final Function0 b;

    public SuspendingPagingSourceFactory(@NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher0, "dispatcher");
        Intrinsics.checkNotNullParameter(function00, "delegate");
        super();
        this.a = coroutineDispatcher0;
        this.b = function00;
    }

    @Nullable
    public final Object create(@NotNull Continuation continuation0) {
        k2 k20 = new k2(this, null);
        return BuildersKt.withContext(this.a, k20, continuation0);
    }

    @NotNull
    public PagingSource invoke() {
        return (PagingSource)this.b.invoke();
    }

    @Override  // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.invoke();
    }
}

