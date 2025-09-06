package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadLocalKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001A\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\t\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u000B\u0010\fR\u0014\u0010\n\u001A\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u0004¨\u0006\u000F"}, d2 = {"Lkotlinx/coroutines/ThreadLocalEventLoop;", "", "Lkotlinx/coroutines/EventLoop;", "currentOrNull$kotlinx_coroutines_core", "()Lkotlinx/coroutines/EventLoop;", "currentOrNull", "", "resetEventLoop$kotlinx_coroutines_core", "()V", "resetEventLoop", "eventLoop", "setEventLoop$kotlinx_coroutines_core", "(Lkotlinx/coroutines/EventLoop;)V", "setEventLoop", "getEventLoop$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
public final class ThreadLocalEventLoop {
    @NotNull
    public static final ThreadLocalEventLoop INSTANCE;
    public static final ThreadLocal a;

    static {
        ThreadLocalEventLoop.INSTANCE = new ThreadLocalEventLoop();  // 初始化器: Ljava/lang/Object;-><init>()V
        ThreadLocalEventLoop.a = ThreadLocalKt.commonThreadLocal(new Symbol("ThreadLocalEventLoop"));
    }

    @Nullable
    public final EventLoop currentOrNull$kotlinx_coroutines_core() {
        return (EventLoop)ThreadLocalEventLoop.a.get();
    }

    @NotNull
    public final EventLoop getEventLoop$kotlinx_coroutines_core() {
        ThreadLocal threadLocal0 = ThreadLocalEventLoop.a;
        EventLoop eventLoop0 = (EventLoop)threadLocal0.get();
        if(eventLoop0 == null) {
            eventLoop0 = EventLoopKt.createEventLoop();
            threadLocal0.set(eventLoop0);
        }
        return eventLoop0;
    }

    public final void resetEventLoop$kotlinx_coroutines_core() {
        ThreadLocalEventLoop.a.set(null);
    }

    public final void setEventLoop$kotlinx_coroutines_core(@NotNull EventLoop eventLoop0) {
        ThreadLocalEventLoop.a.set(eventLoop0);
    }
}

