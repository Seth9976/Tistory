package androidx.lifecycle.viewmodel.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BR\u001A\u0010\u0004\u001A\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "Ljava/lang/AutoCloseable;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "close", "()V", "a", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CloseableCoroutineScope implements AutoCloseable, CoroutineScope {
    public final CoroutineContext a;

    public CloseableCoroutineScope(@NotNull CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "coroutineContext");
        super();
        this.a = coroutineContext0;
    }

    public CloseableCoroutineScope(@NotNull CoroutineScope coroutineScope0) {
        Intrinsics.checkNotNullParameter(coroutineScope0, "coroutineScope");
        this(coroutineScope0.getCoroutineContext());
    }

    @Override
    public void close() {
        JobKt.cancel$default(this.getCoroutineContext(), null, 1, null);
    }

    @Override  // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.a;
    }
}

