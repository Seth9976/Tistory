package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A,\u0010\u0005\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00060\u0001j\u0002`\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001A$\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001A\u00020\bH\u0080\b¢\u0006\u0004\b\u000B\u0010\f\u001A\u0017\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011*\f\b\u0000\u0010\u0012\"\u00020\u00012\u00020\u0001¨\u0006\u0013"}, d2 = {"T", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "Lkotlin/Function0;", "action", "withLock", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "E", "", "expectedSize", "", "identitySet", "(I)Ljava/util/Set;", "Ljava/util/concurrent/Executor;", "executor", "", "removeFutureOnCancel", "(Ljava/util/concurrent/Executor;)Z", "ReentrantLock", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ConcurrentKt {
    public static final Method a;

    static {
        Method method0 = null;
        try {
            method0 = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        }
        catch(Throwable unused_ex) {
        }
        ConcurrentKt.a = method0;
    }

    public static void ReentrantLock$annotations() {
    }

    @NotNull
    public static final Set identitySet(int v) {
        return Collections.newSetFromMap(new IdentityHashMap(v));
    }

    public static final boolean removeFutureOnCancel(@NotNull Executor executor0) {
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = executor0 instanceof ScheduledThreadPoolExecutor ? ((ScheduledThreadPoolExecutor)executor0) : null;
            if(scheduledThreadPoolExecutor0 == null) {
                return false;
            }
            Method method0 = ConcurrentKt.a;
            if(method0 == null) {
                return false;
            }
            method0.invoke(scheduledThreadPoolExecutor0, Boolean.TRUE);
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static final Object withLock(@NotNull ReentrantLock reentrantLock0, @NotNull Function0 function00) {
        reentrantLock0.lock();
        try {
            return function00.invoke();
        }
        finally {
            reentrantLock0.unlock();
        }
    }
}

