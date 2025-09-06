package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.ThreadMap_jvmKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0005\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/runtime/SnapshotThreadLocal;", "T", "", "<init>", "()V", "get", "()Ljava/lang/Object;", "value", "", "set", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,146:1\n89#2:147\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n*L\n74#1:147\n*E\n"})
public final class SnapshotThreadLocal {
    public static final int $stable = 8;
    public final AtomicReference a;
    public final Object b;
    public Object c;

    public SnapshotThreadLocal() {
        this.a = new AtomicReference(ThreadMap_jvmKt.getEmptyThreadMap());
        this.b = new Object();
    }

    @Nullable
    public final Object get() {
        long v = Thread.currentThread().getId();
        return v == 0L ? this.c : ((ThreadMap)this.a.get()).get(v);
    }

    public final void set(@Nullable Object object0) {
        long v = Thread.currentThread().getId();
        if(v == 0L) {
            this.c = object0;
            return;
        }
        synchronized(this.b) {
            ThreadMap threadMap0 = (ThreadMap)this.a.get();
            if(threadMap0.trySet(v, object0)) {
                return;
            }
            ThreadMap threadMap1 = threadMap0.newWith(v, object0);
            this.a.set(threadMap1);
        }
    }
}

