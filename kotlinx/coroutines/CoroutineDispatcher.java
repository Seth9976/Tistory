package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor.DefaultImpls;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\b&\u0018\u0000 \u001A2\u00020\u00012\u00020\u0002:\u0001\u001AB\u0005¢\u0006\u0002\u0010\u0003J\u001C\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\n\u0010\b\u001A\u00060\tj\u0002`\nH&J\u001C\u0010\u000B\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\n\u0010\b\u001A\u00060\tj\u0002`\nH\u0017J \u0010\f\u001A\b\u0012\u0004\u0012\u0002H\u000E0\r\"\u0004\b\u0000\u0010\u000E2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u0002H\u000E0\rJ\u0010\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0006\u001A\u00020\u0007H\u0016J\u0010\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u0014H\u0017J\u0011\u0010\u0015\u001A\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u0000H\u0087\u0002J\u0012\u0010\u0017\u001A\u00020\u00052\n\u0010\u000F\u001A\u0006\u0012\u0002\b\u00030\rJ\b\u0010\u0018\u001A\u00020\u0019H\u0016¨\u0006\u001B"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "isDispatchNeeded", "", "limitedParallelism", "parallelism", "", "plus", "other", "releaseInterceptedContinuation", "toString", "", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class CoroutineDispatcher extends AbstractCoroutineContextElement implements ContinuationInterceptor {
    @ExperimentalStdlibApi
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Key extends AbstractCoroutineContextKey {
        public Key(DefaultConstructorMarker defaultConstructorMarker0) {
            super(ContinuationInterceptor.Key, a.w);
        }
    }

    @NotNull
    public static final Key Key;

    static {
        CoroutineDispatcher.Key = new Key(null);
    }

    public CoroutineDispatcher() {
        super(ContinuationInterceptor.Key);
    }

    public abstract void dispatch(@NotNull CoroutineContext arg1, @NotNull Runnable arg2);

    @InternalCoroutinesApi
    public void dispatchYield(@NotNull CoroutineContext coroutineContext0, @NotNull Runnable runnable0) {
        this.dispatch(coroutineContext0, runnable0);
    }

    @Override  // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.ContinuationInterceptor
    @Nullable
    public Element get(@NotNull kotlin.coroutines.CoroutineContext.Key coroutineContext$Key0) {
        return DefaultImpls.get(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.ContinuationInterceptor
    @NotNull
    public final Continuation interceptContinuation(@NotNull Continuation continuation0) {
        return new DispatchedContinuation(this, continuation0);
    }

    public boolean isDispatchNeeded(@NotNull CoroutineContext coroutineContext0) {
        return true;
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public CoroutineDispatcher limitedParallelism(int v) {
        LimitedDispatcherKt.checkParallelism(v);
        return new LimitedDispatcher(this, v);
    }

    @Override  // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.ContinuationInterceptor
    @NotNull
    public CoroutineContext minusKey(@NotNull kotlin.coroutines.CoroutineContext.Key coroutineContext$Key0) {
        return DefaultImpls.minusKey(this, coroutineContext$Key0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator \'+\' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @NotNull
    public final CoroutineDispatcher plus(@NotNull CoroutineDispatcher coroutineDispatcher0) {
        return coroutineDispatcher0;
    }

    @Override  // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(@NotNull Continuation continuation0) {
        Intrinsics.checkNotNull(continuation0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((DispatchedContinuation)continuation0).release$kotlinx_coroutines_core();
    }

    @Override
    @NotNull
    public String toString() [...] // 潜在的解密器
}

