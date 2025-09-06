package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R$\u0010\f\u001A\u0004\u0018\u00010\u000B8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u000FR\"\u0010$\u001A\u00020\b8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\n\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "", "", "name", "", "cancelable", "<init>", "(Ljava/lang/String;Z)V", "", "runOnce", "()J", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "", "initQueue$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "initQueue", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "b", "Z", "getCancelable", "()Z", "c", "Lokhttp3/internal/concurrent/TaskQueue;", "getQueue$okhttp", "()Lokhttp3/internal/concurrent/TaskQueue;", "setQueue$okhttp", "d", "J", "getNextExecuteNanoTime$okhttp", "setNextExecuteNanoTime$okhttp", "(J)V", "nextExecuteNanoTime", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public abstract class Task {
    public final String a;
    public final boolean b;
    public TaskQueue c;
    public long d;

    public Task(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "name");
        super();
        this.a = s;
        this.b = z;
        this.d = -1L;
    }

    public Task(String s, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            z = true;
        }
        this(s, z);
    }

    public final boolean getCancelable() {
        return this.b;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    public final long getNextExecuteNanoTime$okhttp() {
        return this.d;
    }

    @Nullable
    public final TaskQueue getQueue$okhttp() {
        return this.c;
    }

    public final void initQueue$okhttp(@NotNull TaskQueue taskQueue0) {
        Intrinsics.checkNotNullParameter(taskQueue0, "queue");
        TaskQueue taskQueue1 = this.c;
        if(taskQueue1 == taskQueue0) {
            return;
        }
        if(taskQueue1 != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.c = taskQueue0;
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long v) {
        this.d = v;
    }

    public final void setQueue$okhttp(@Nullable TaskQueue taskQueue0) {
        this.c = taskQueue0;
    }

    @Override
    @NotNull
    public String toString() {
        return this.a;
    }
}

