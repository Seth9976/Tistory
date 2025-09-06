package kotlinx.coroutines.debug.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001C\u0010\u0011\u001A\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0017\u001A\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001D\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0017\u0010$\u001A\u00020\u001F8\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R\u0019\u0010*\u001A\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u0019\u0010-\u001A\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010\u000E\u001A\u0004\b,\u0010\u0010R\u001D\u0010/\u001A\b\u0012\u0004\u0012\u00020\u00190\u00188G¢\u0006\f\n\u0004\b.\u0010\u001B\u001A\u0004\b/\u0010\u001D¨\u00060"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "source", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "b", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCreationStackBottom$kotlinx_coroutines_core", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "creationStackBottom", "", "c", "J", "getSequenceNumber", "()J", "sequenceNumber", "", "Ljava/lang/StackTraceElement;", "d", "Ljava/util/List;", "getCreationStackTrace", "()Ljava/util/List;", "creationStackTrace", "", "e", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "state", "Ljava/lang/Thread;", "f", "Ljava/lang/Thread;", "getLastObservedThread", "()Ljava/lang/Thread;", "lastObservedThread", "g", "getLastObservedFrame", "lastObservedFrame", "h", "lastObservedStackTrace", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
public final class DebugCoroutineInfo {
    public final CoroutineContext a;
    public final StackTraceFrame b;
    public final long c;
    public final List d;
    public final String e;
    public final Thread f;
    public final CoroutineStackFrame g;
    public final List h;

    public DebugCoroutineInfo(@NotNull DebugCoroutineInfoImpl debugCoroutineInfoImpl0, @NotNull CoroutineContext coroutineContext0) {
        this.a = coroutineContext0;
        this.b = debugCoroutineInfoImpl0.getCreationStackBottom$kotlinx_coroutines_core();
        this.c = debugCoroutineInfoImpl0.sequenceNumber;
        this.d = debugCoroutineInfoImpl0.getCreationStackTrace();
        this.e = debugCoroutineInfoImpl0.getState$kotlinx_coroutines_core();
        this.f = debugCoroutineInfoImpl0.lastObservedThread;
        this.g = debugCoroutineInfoImpl0.getLastObservedFrame$kotlinx_coroutines_core();
        this.h = debugCoroutineInfoImpl0.lastObservedStackTrace$kotlinx_coroutines_core();
    }

    @NotNull
    public final CoroutineContext getContext() {
        return this.a;
    }

    @Nullable
    public final CoroutineStackFrame getCreationStackBottom$kotlinx_coroutines_core() {
        return this.b;
    }

    @NotNull
    public final List getCreationStackTrace() {
        return this.d;
    }

    @Nullable
    public final CoroutineStackFrame getLastObservedFrame() {
        return this.g;
    }

    @Nullable
    public final Thread getLastObservedThread() {
        return this.f;
    }

    public final long getSequenceNumber() {
        return this.c;
    }

    @NotNull
    public final String getState() {
        return this.e;
    }

    @JvmName(name = "lastObservedStackTrace")
    @NotNull
    public final List lastObservedStackTrace() {
        return this.h;
    }
}

