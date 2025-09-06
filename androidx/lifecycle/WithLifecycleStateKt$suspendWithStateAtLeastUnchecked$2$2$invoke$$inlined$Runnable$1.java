package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2\n*L\n1#1,18:1\n202#2:19\n*E\n"})
public final class WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.2.invoke..inlined.Runnable.1 implements Runnable {
    public final Lifecycle a;
    public final androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.observer.1 b;

    public WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.2.invoke..inlined.Runnable.1(Lifecycle lifecycle0, androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.observer.1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10) {
        this.a = lifecycle0;
        this.b = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$10;
        super();
    }

    @Override
    public final void run() {
        this.a.removeObserver(this.b);
    }
}

