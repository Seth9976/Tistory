package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sf.l;
import sf.m;
import sf.n;
import sf.r0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\u001A\u001B\u0010\u0003\u001A\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u001B\u0010\u0003\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0006\u001A6\u0010\f\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0002\u001A\u00020\u00012\b\u0010\t\u001A\u0004\u0018\u00010\b2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0080\b¢\u0006\u0004\b\f\u0010\r\u001A:\u0010\u0010\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00072\n\u0010\u000F\u001A\u0006\u0012\u0002\b\u00030\u000E2\b\u0010\t\u001A\u0004\u0018\u00010\b2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001A/\u0010\u0014\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u0006\u0012\u0002\b\u00030\u000E2\u0006\u0010\u0002\u001A\u00020\u00012\b\u0010\u0012\u001A\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001A\u001A\u0010\u0017\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020\u0016H\u0080\u0010¢\u0006\u0004\b\u0017\u0010\u0018\"\u001A\u0010\u001C\u001A\u0004\u0018\u00010\u0019*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001D"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "newCoroutineContext", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "addedContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "T", "", "countOrElement", "Lkotlin/Function0;", "block", "withCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "continuation", "withContinuationContext", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "oldValue", "Lkotlinx/coroutines/UndispatchedCoroutine;", "updateUndispatchedCompletion", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Lkotlinx/coroutines/UndispatchedCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "undispatchedCompletion", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Lkotlinx/coroutines/UndispatchedCoroutine;", "", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CoroutineContextKt {
    public static final CoroutineContext a(CoroutineContext coroutineContext0, CoroutineContext coroutineContext1, boolean z) {
        boolean z1 = ((Boolean)coroutineContext0.fold(Boolean.FALSE, n.w)).booleanValue();
        boolean z2 = ((Boolean)coroutineContext1.fold(Boolean.FALSE, n.w)).booleanValue();
        if(!z1 && !z2) {
            return coroutineContext0.plus(coroutineContext1);
        }
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        ref$ObjectRef0.element = coroutineContext1;
        EmptyCoroutineContext emptyCoroutineContext0 = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext2 = (CoroutineContext)coroutineContext0.fold(emptyCoroutineContext0, new m(ref$ObjectRef0, z));
        if(z2) {
            ref$ObjectRef0.element = ((CoroutineContext)ref$ObjectRef0.element).fold(emptyCoroutineContext0, l.w);
        }
        return coroutineContext2.plus(((CoroutineContext)ref$ObjectRef0.element));
    }

    @Nullable
    public static final String getCoroutineName(@NotNull CoroutineContext coroutineContext0) [...] // Inlined contents

    @InternalCoroutinesApi
    @NotNull
    public static final CoroutineContext newCoroutineContext(@NotNull CoroutineContext coroutineContext0, @NotNull CoroutineContext coroutineContext1) {
        return ((Boolean)coroutineContext1.fold(Boolean.FALSE, n.w)).booleanValue() ? CoroutineContextKt.a(coroutineContext0, coroutineContext1, false) : coroutineContext0.plus(coroutineContext1);
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final CoroutineContext newCoroutineContext(@NotNull CoroutineScope coroutineScope0, @NotNull CoroutineContext coroutineContext0) {
        CoroutineContext coroutineContext1 = CoroutineContextKt.a(coroutineScope0.getCoroutineContext(), coroutineContext0, true);
        return coroutineContext1 == Dispatchers.getDefault() || coroutineContext1.get(ContinuationInterceptor.Key) != null ? coroutineContext1 : coroutineContext1.plus(Dispatchers.getDefault());
    }

    @Nullable
    public static final UndispatchedCoroutine undispatchedCompletion(@NotNull CoroutineStackFrame coroutineStackFrame0) {
        do {
            if(coroutineStackFrame0 instanceof DispatchedCoroutine) {
                return null;
            }
            coroutineStackFrame0 = coroutineStackFrame0.getCallerFrame();
            if(coroutineStackFrame0 == null) {
                return null;
            }
        }
        while(!(coroutineStackFrame0 instanceof UndispatchedCoroutine));
        return (UndispatchedCoroutine)coroutineStackFrame0;
    }

    @Nullable
    public static final UndispatchedCoroutine updateUndispatchedCompletion(@NotNull Continuation continuation0, @NotNull CoroutineContext coroutineContext0, @Nullable Object object0) {
        if(!(continuation0 instanceof CoroutineStackFrame)) {
            return null;
        }
        if(coroutineContext0.get(r0.a) != null) {
            UndispatchedCoroutine undispatchedCoroutine0 = CoroutineContextKt.undispatchedCompletion(((CoroutineStackFrame)continuation0));
            if(undispatchedCoroutine0 != null) {
                undispatchedCoroutine0.saveThreadContext(coroutineContext0, object0);
            }
            return undispatchedCoroutine0;
        }
        return null;
    }

    public static final Object withContinuationContext(@NotNull Continuation continuation0, @Nullable Object object0, @NotNull Function0 function00) {
        CoroutineContext coroutineContext0 = continuation0.getContext();
        Object object1 = ThreadContextKt.updateThreadContext(coroutineContext0, object0);
        UndispatchedCoroutine undispatchedCoroutine0 = object1 == ThreadContextKt.NO_THREAD_ELEMENTS ? null : CoroutineContextKt.updateUndispatchedCompletion(continuation0, coroutineContext0, object1);
        try {
            return function00.invoke();
        }
        finally {
            if(undispatchedCoroutine0 == null || undispatchedCoroutine0.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(coroutineContext0, object1);
            }
        }
    }

    public static final Object withCoroutineContext(@NotNull CoroutineContext coroutineContext0, @Nullable Object object0, @NotNull Function0 function00) {
        Object object1 = ThreadContextKt.updateThreadContext(coroutineContext0, object0);
        try {
            return function00.invoke();
        }
        finally {
            ThreadContextKt.restoreThreadContext(coroutineContext0, object1);
        }
    }
}

