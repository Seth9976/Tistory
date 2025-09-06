package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\r\u001A\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0019\u0010\u0013\u001A\u0004\u0018\u00010\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001A\u0004\u0018\u00010\u000E8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001A\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0019\u001A\u00020\u000E8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001A\u0004\b\u0018\u0010\u0012R\u0019\u0010\u001C\u001A\u0004\u0018\u00010\u000E8\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0010\u001A\u0004\b\u001B\u0010\u0012R\u0019\u0010\u001F\u001A\u0004\u0018\u00010\u000E8\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u0010\u001A\u0004\b\u001E\u0010\u0012R\u001D\u0010&\u001A\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u0017\u0010+\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "Ljava/io/Serializable;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "source", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", "", "a", "Ljava/lang/Long;", "getCoroutineId", "()Ljava/lang/Long;", "coroutineId", "", "b", "Ljava/lang/String;", "getDispatcher", "()Ljava/lang/String;", "dispatcher", "c", "getName", "name", "d", "getState", "state", "e", "getLastObservedThreadState", "lastObservedThreadState", "f", "getLastObservedThreadName", "lastObservedThreadName", "", "Ljava/lang/StackTraceElement;", "g", "Ljava/util/List;", "getLastObservedStackTrace", "()Ljava/util/List;", "lastObservedStackTrace", "h", "J", "getSequenceNumber", "()J", "sequenceNumber", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
public final class DebuggerInfo implements Serializable {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final long h;

    public DebuggerInfo(@NotNull DebugCoroutineInfoImpl debugCoroutineInfoImpl0, @NotNull CoroutineContext coroutineContext0) {
        String s1;
        CoroutineId coroutineId0 = (CoroutineId)coroutineContext0.get(CoroutineId.Key);
        String s = null;
        this.a = coroutineId0 == null ? null : coroutineId0.getId();
        ContinuationInterceptor continuationInterceptor0 = (ContinuationInterceptor)coroutineContext0.get(ContinuationInterceptor.Key);
        this.b = continuationInterceptor0 == null ? null : continuationInterceptor0.toString();
        CoroutineName coroutineName0 = (CoroutineName)coroutineContext0.get(CoroutineName.Key);
        this.c = coroutineName0 == null ? null : coroutineName0.getName();
        this.d = debugCoroutineInfoImpl0.getState$kotlinx_coroutines_core();
        Thread thread0 = debugCoroutineInfoImpl0.lastObservedThread;
        if(thread0 == null) {
            s1 = null;
        }
        else {
            Thread.State thread$State0 = thread0.getState();
            s1 = thread$State0 == null ? null : thread$State0.toString();
        }
        this.e = s1;
        Thread thread1 = debugCoroutineInfoImpl0.lastObservedThread;
        if(thread1 != null) {
            s = thread1.getName();
        }
        this.f = s;
        this.g = debugCoroutineInfoImpl0.lastObservedStackTrace$kotlinx_coroutines_core();
        this.h = debugCoroutineInfoImpl0.sequenceNumber;
    }

    @Nullable
    public final Long getCoroutineId() {
        return this.a;
    }

    @Nullable
    public final String getDispatcher() {
        return this.b;
    }

    @NotNull
    public final List getLastObservedStackTrace() {
        return this.g;
    }

    @Nullable
    public final String getLastObservedThreadName() {
        return this.f;
    }

    @Nullable
    public final String getLastObservedThreadState() {
        return this.e;
    }

    @Nullable
    public final String getName() {
        return this.c;
    }

    public final long getSequenceNumber() {
        return this.h;
    }

    @NotNull
    public final String getState() {
        return this.d;
    }
}

