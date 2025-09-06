package okhttp3.internal.concurrent;

import a5.b;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\u001A1\u0010\b\u001A\u00020\u00072\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001A7\u0010\f\u001A\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001A\u0015\u0010\u0010\u001A\u00020\u00052\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", "", "messageBlock", "", "taskLog", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)V", "T", "block", "logElapsed", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "ns", "formatDuration", "(J)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TaskLoggerKt {
    public static final void access$log(Task task0, TaskQueue taskQueue0, String s) {
        Logger logger0 = TaskRunner.Companion.getLogger();
        String s1 = String.format("%-22s", Arrays.copyOf(new Object[]{s}, 1));
        Intrinsics.checkNotNullExpressionValue(s1, "format(format, *args)");
        logger0.fine(taskQueue0.getName$okhttp() + ' ' + s1 + ": " + task0.getName());
    }

    @NotNull
    public static final String formatDuration(long v) {
        if(Long.compare(v, -999500000L) <= 0) {
            return b.f(1, "%6s", "format(format, *args)", new Object[]{b.g((v - 500000000L) / 1000000000L, " s ", new StringBuilder())});
        }
        if(Long.compare(v, 0xFFFFFFFFFFF0BFB4L) <= 0) {
            return b.f(1, "%6s", "format(format, *args)", new Object[]{b.g((v - 500000L) / 1000000L, " ms", new StringBuilder())});
        }
        if(Long.compare(v, 0L) <= 0) {
            return b.f(1, "%6s", "format(format, *args)", new Object[]{b.g((v - 500L) / 1000L, " µs", new StringBuilder())});
        }
        if(v < 0xF404CL) {
            return b.f(1, "%6s", "format(format, *args)", new Object[]{b.g((v + 500L) / 1000L, " µs", new StringBuilder())});
        }
        return v >= 999500000L ? b.f(1, "%6s", "format(format, *args)", new Object[]{b.g((v + 500000000L) / 1000000000L, " s ", new StringBuilder())}) : b.f(1, "%6s", "format(format, *args)", new Object[]{b.g((v + 500000L) / 1000000L, " ms", new StringBuilder())});
    }

    public static final Object logElapsed(@NotNull Task task0, @NotNull TaskQueue taskQueue0, @NotNull Function0 function00) {
        Object object0;
        long v;
        Intrinsics.checkNotNullParameter(task0, "task");
        Intrinsics.checkNotNullParameter(taskQueue0, "queue");
        Intrinsics.checkNotNullParameter(function00, "block");
        boolean z = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if(z) {
            v = taskQueue0.getTaskRunner$okhttp().getBackend().nanoTime();
            TaskLoggerKt.access$log(task0, taskQueue0, "starting");
        }
        else {
            v = -1L;
        }
        try {
            object0 = function00.invoke();
        }
        catch(Throwable throwable0) {
            if(z) {
                TaskLoggerKt.access$log(task0, taskQueue0, "failed a run in " + TaskLoggerKt.formatDuration(taskQueue0.getTaskRunner$okhttp().getBackend().nanoTime() - v));
            }
            throw throwable0;
        }
        if(z) {
            TaskLoggerKt.access$log(task0, taskQueue0, "finished run in " + TaskLoggerKt.formatDuration(taskQueue0.getTaskRunner$okhttp().getBackend().nanoTime() - v));
        }
        return object0;
    }

    public static final void taskLog(@NotNull Task task0, @NotNull TaskQueue taskQueue0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(task0, "task");
        Intrinsics.checkNotNullParameter(taskQueue0, "queue");
        Intrinsics.checkNotNullParameter(function00, "messageBlock");
        if(TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            TaskLoggerKt.access$log(task0, taskQueue0, ((String)function00.invoke()));
        }
    }
}

