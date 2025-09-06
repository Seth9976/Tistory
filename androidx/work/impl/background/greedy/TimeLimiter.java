package androidx.work.impl.background.greedy;

import androidx.activity.m;
import androidx.work.RunnableScheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkLauncher;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u000F\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u000F\u0010\u000E¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/background/greedy/TimeLimiter;", "", "Landroidx/work/RunnableScheduler;", "runnableScheduler", "Landroidx/work/impl/WorkLauncher;", "launcher", "", "timeoutMs", "<init>", "(Landroidx/work/RunnableScheduler;Landroidx/work/impl/WorkLauncher;J)V", "Landroidx/work/impl/StartStopToken;", "token", "", "track", "(Landroidx/work/impl/StartStopToken;)V", "cancel", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTimeLimiter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeLimiter.kt\nandroidx/work/impl/background/greedy/TimeLimiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class TimeLimiter {
    public final RunnableScheduler a;
    public final WorkLauncher b;
    public final long c;
    public final Object d;
    public final LinkedHashMap e;

    @JvmOverloads
    public TimeLimiter(@NotNull RunnableScheduler runnableScheduler0, @NotNull WorkLauncher workLauncher0) {
        Intrinsics.checkNotNullParameter(runnableScheduler0, "runnableScheduler");
        Intrinsics.checkNotNullParameter(workLauncher0, "launcher");
        this(runnableScheduler0, workLauncher0, 0L, 4, null);
    }

    @JvmOverloads
    public TimeLimiter(@NotNull RunnableScheduler runnableScheduler0, @NotNull WorkLauncher workLauncher0, long v) {
        Intrinsics.checkNotNullParameter(runnableScheduler0, "runnableScheduler");
        Intrinsics.checkNotNullParameter(workLauncher0, "launcher");
        super();
        this.a = runnableScheduler0;
        this.b = workLauncher0;
        this.c = v;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public TimeLimiter(RunnableScheduler runnableScheduler0, WorkLauncher workLauncher0, long v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            v = TimeUnit.MINUTES.toMillis(90L);
        }
        this(runnableScheduler0, workLauncher0, v);
    }

    public final void cancel(@NotNull StartStopToken startStopToken0) {
        Runnable runnable0;
        Intrinsics.checkNotNullParameter(startStopToken0, "token");
        synchronized(this.d) {
            runnable0 = (Runnable)this.e.remove(startStopToken0);
        }
        if(runnable0 != null) {
            this.a.cancel(runnable0);
        }
    }

    public final void track(@NotNull StartStopToken startStopToken0) {
        Intrinsics.checkNotNullParameter(startStopToken0, "token");
        m m0 = new m(27, this, startStopToken0);
        synchronized(this.d) {
            Runnable runnable0 = (Runnable)this.e.put(startStopToken0, m0);
        }
        this.a.scheduleWithDelay(this.c, m0);
    }
}

