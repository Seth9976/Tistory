package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0011\u0010\u0004\u001A\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\bJ\u000F\u0010\r\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/runtime/ThreadLocal;", "T", "Ljava/lang/ThreadLocal;", "Lkotlin/Function0;", "initialValue", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "get", "()Ljava/lang/Object;", "value", "", "set", "(Ljava/lang/Object;)V", "remove", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ThreadLocal extends java.lang.ThreadLocal {
    public static final int $stable;
    public final Function0 a;

    public ThreadLocal(@NotNull Function0 function00) {
        this.a = function00;
    }

    @Override
    public Object get() {
        return super.get();
    }

    @Override
    @Nullable
    public Object initialValue() {
        return this.a.invoke();
    }

    @Override
    public void remove() {
        super.remove();
    }

    @Override
    public void set(Object object0) {
        super.set(object0);
    }
}

