package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0001\u0018\u00002\u00020\u0001B\u001B\b\u0000\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001C\u0010\u0002\u001A\u0004\u0018\u00010\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\u0004\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000E"}, d2 = {"Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Ljava/lang/StackTraceElement;", "stackTraceElement", "<init>", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Ljava/lang/StackTraceElement;)V", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "a", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
public final class StackTraceFrame implements CoroutineStackFrame {
    public final CoroutineStackFrame a;
    @JvmField
    @NotNull
    public final StackTraceElement stackTraceElement;

    public StackTraceFrame(@Nullable CoroutineStackFrame coroutineStackFrame0, @NotNull StackTraceElement stackTraceElement0) {
        this.a = coroutineStackFrame0;
        this.stackTraceElement = stackTraceElement0;
    }

    @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        return this.a;
    }

    @Override  // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @NotNull
    public StackTraceElement getStackTraceElement() {
        return this.stackTraceElement;
    }
}

