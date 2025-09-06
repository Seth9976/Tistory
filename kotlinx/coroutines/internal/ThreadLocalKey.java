package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001E\u0010\u0007\u001A\u00020\u00002\f\b\u0002\u0010\u0004\u001A\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001A\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u001A\u0010\u0012\u001A\u00020\u00112\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalKey;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/internal/ThreadLocalElement;", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/ThreadLocal;)V", "copy", "(Ljava/lang/ThreadLocal;)Lkotlinx/coroutines/internal/ThreadLocalKey;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@PublishedApi
public final class ThreadLocalKey implements Key {
    public final ThreadLocal a;

    public ThreadLocalKey(@NotNull ThreadLocal threadLocal0) {
        this.a = threadLocal0;
    }

    @NotNull
    public final ThreadLocalKey copy(@NotNull ThreadLocal threadLocal0) {
        return new ThreadLocalKey(threadLocal0);
    }

    public static ThreadLocalKey copy$default(ThreadLocalKey threadLocalKey0, ThreadLocal threadLocal0, int v, Object object0) {
        if((v & 1) != 0) {
            threadLocal0 = threadLocalKey0.a;
        }
        return threadLocalKey0.copy(threadLocal0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ThreadLocalKey ? Intrinsics.areEqual(this.a, ((ThreadLocalKey)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.a + ')';
    }
}

