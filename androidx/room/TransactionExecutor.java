package androidx.room;

import androidx.activity.m;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/room/TransactionExecutor;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "scheduleNext", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTransactionExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionExecutor.kt\nandroidx/room/TransactionExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class TransactionExecutor implements Executor {
    public final Executor a;
    public final ArrayDeque b;
    public Runnable c;
    public final Object d;

    public TransactionExecutor(@NotNull Executor executor0) {
        Intrinsics.checkNotNullParameter(executor0, "executor");
        super();
        this.a = executor0;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    @Override
    public void execute(@NotNull Runnable runnable0) {
        Intrinsics.checkNotNullParameter(runnable0, "command");
        synchronized(this.d) {
            m m0 = new m(5, runnable0, this);
            this.b.offer(m0);
            if(this.c == null) {
                this.scheduleNext();
            }
        }
    }

    public final void scheduleNext() {
        synchronized(this.d) {
            Object object1 = this.b.poll();
            this.c = (Runnable)object1;
            if(object1 != null) {
                this.a.execute(((Runnable)object1));
            }
        }
    }
}

