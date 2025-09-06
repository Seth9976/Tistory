package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sf.r0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001D\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0004\u001A\u00020\u00032\b\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u000F\u0010\u0010J\u0019\u0010\u0012\u001A\u00020\u000B2\b\u0010\u0011\u001A\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001A\u00020\u000E8\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "oldValue", "", "saveThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "clearThreadContext", "()Z", "state", "afterResume", "(Ljava/lang/Object;)V", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,314:1\n1#2:315\n107#3,13:316\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n269#1:316,13\n*E\n"})
public final class UndispatchedCoroutine extends ScopeCoroutine {
    public final ThreadLocal d;
    private volatile boolean threadLocalIsSet;

    public UndispatchedCoroutine(@NotNull CoroutineContext coroutineContext0, @NotNull Continuation continuation0) {
        super((coroutineContext0.get(r0.a) == null ? coroutineContext0.plus(r0.a) : coroutineContext0), continuation0);
        this.d = new ThreadLocal();
        if(!(continuation0.getContext().get(ContinuationInterceptor.Key) instanceof CoroutineDispatcher)) {
            Object object0 = ThreadContextKt.updateThreadContext(coroutineContext0, null);
            ThreadContextKt.restoreThreadContext(coroutineContext0, object0);
            this.saveThreadContext(coroutineContext0, object0);
        }
    }

    @Override  // kotlinx.coroutines.internal.ScopeCoroutine
    public void afterResume(@Nullable Object object0) {
        if(this.threadLocalIsSet) {
            Pair pair0 = (Pair)this.d.get();
            if(pair0 != null) {
                ThreadContextKt.restoreThreadContext(((CoroutineContext)pair0.component1()), pair0.component2());
            }
            this.d.remove();
        }
        Object object1 = CompletionStateKt.recoverResult(object0, this.uCont);
        Continuation continuation0 = this.uCont;
        CoroutineContext coroutineContext0 = continuation0.getContext();
        UndispatchedCoroutine undispatchedCoroutine0 = null;
        Object object2 = ThreadContextKt.updateThreadContext(coroutineContext0, null);
        if(object2 != ThreadContextKt.NO_THREAD_ELEMENTS) {
            undispatchedCoroutine0 = CoroutineContextKt.updateUndispatchedCompletion(continuation0, coroutineContext0, object2);
        }
        try {
            this.uCont.resumeWith(object1);
        }
        finally {
            if(undispatchedCoroutine0 == null || undispatchedCoroutine0.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(coroutineContext0, object2);
            }
        }
    }

    public final boolean clearThreadContext() {
        int v = !this.threadLocalIsSet || this.d.get() != null ? 0 : 1;
        this.d.remove();
        return v ^ 1;
    }

    public final void saveThreadContext(@NotNull CoroutineContext coroutineContext0, @Nullable Object object0) {
        this.threadLocalIsSet = true;
        Pair pair0 = TuplesKt.to(coroutineContext0, object0);
        this.d.set(pair0);
    }
}

