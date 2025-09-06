package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.h;
import zf.i;
import zf.j;
import zf.k;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001A#\u0010\u0006\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u00002\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A!\u0010\n\u001A\u00020\t2\u0006\u0010\u0001\u001A\u00020\u00002\b\u0010\b\u001A\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000B\"\u0014\u0010\r\u001A\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "threadContextElements", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "countOrElement", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/Symbol;", "NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ThreadContextKt {
    @JvmField
    @NotNull
    public static final Symbol NO_THREAD_ELEMENTS;
    public static final h a;
    public static final i b;
    public static final j c;

    static {
        ThreadContextKt.NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
        ThreadContextKt.a = h.w;
        ThreadContextKt.b = i.w;
        ThreadContextKt.c = j.w;
    }

    public static final void restoreThreadContext(@NotNull CoroutineContext coroutineContext0, @Nullable Object object0) {
        if(object0 == ThreadContextKt.NO_THREAD_ELEMENTS) {
            return;
        }
        if(object0 instanceof k) {
            ThreadContextElement[] arr_threadContextElement = ((k)object0).c;
            int v = arr_threadContextElement.length - 1;
            if(v >= 0) {
                while(true) {
                    ThreadContextElement threadContextElement0 = arr_threadContextElement[v];
                    Intrinsics.checkNotNull(threadContextElement0);
                    threadContextElement0.restoreThreadContext(coroutineContext0, ((k)object0).b[v]);
                    if(v - 1 < 0) {
                        break;
                    }
                    --v;
                }
            }
        }
        else {
            Object object1 = coroutineContext0.fold(null, ThreadContextKt.b);
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((ThreadContextElement)object1).restoreThreadContext(coroutineContext0, object0);
        }
    }

    @NotNull
    public static final Object threadContextElements(@NotNull CoroutineContext coroutineContext0) {
        Object object0 = coroutineContext0.fold(0, ThreadContextKt.a);
        Intrinsics.checkNotNull(object0);
        return object0;
    }

    @Nullable
    public static final Object updateThreadContext(@NotNull CoroutineContext coroutineContext0, @Nullable Object object0) {
        if(object0 == null) {
            object0 = ThreadContextKt.threadContextElements(coroutineContext0);
        }
        if(object0 == 0) {
            return ThreadContextKt.NO_THREAD_ELEMENTS;
        }
        if(object0 instanceof Integer) {
            return coroutineContext0.fold(new k(coroutineContext0, ((Number)object0).intValue()), ThreadContextKt.c);
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((ThreadContextElement)object0).updateThreadContext(coroutineContext0);
    }
}

