package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001A\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00028\u00002\b\u0010\t\u001A\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u000B\u0010\fJ\u0019\u0010\r\u001A\u0004\u0018\u00010\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\bR\u0018\u0010\u0010\u001A\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u0013\u0010\u0012\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00118\u0002X\u0082\u0004¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/AtomicOp;", "T", "Lkotlinx/coroutines/internal/OpDescriptor;", "<init>", "()V", "affected", "", "prepare", "(Ljava/lang/Object;)Ljava/lang/Object;", "failure", "", "complete", "(Ljava/lang/Object;Ljava/lang/Object;)V", "perform", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "atomicOp", "Lkotlinx/atomicfu/AtomicRef;", "_consensus", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAtomic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Atomic.kt\nkotlinx/coroutines/internal/AtomicOp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
@InternalCoroutinesApi
public abstract class AtomicOp extends OpDescriptor {
    @Volatile
    @Nullable
    private volatile Object _consensus;
    public static final AtomicReferenceFieldUpdater a;

    static {
        AtomicOp.a = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus");
    }

    public AtomicOp() {
        this._consensus = AtomicKt.NO_DECISION;
    }

    public abstract void complete(Object arg1, @Nullable Object arg2);

    @Override  // kotlinx.coroutines.internal.OpDescriptor
    @NotNull
    public AtomicOp getAtomicOp() {
        return this;
    }

    @Override  // kotlinx.coroutines.internal.OpDescriptor
    @Nullable
    public final Object perform(@Nullable Object object0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = AtomicOp.a;
        Object object1 = atomicReferenceFieldUpdater0.get(this);
        Object object2 = AtomicKt.NO_DECISION;
        if(object1 == object2) {
            Object object3 = this.prepare(object0);
            object1 = atomicReferenceFieldUpdater0.get(this);
            if(object1 == object2) {
                while(true) {
                    if(atomicReferenceFieldUpdater0.compareAndSet(this, object2, object3)) {
                        object1 = object3;
                        break;
                    }
                    if(atomicReferenceFieldUpdater0.get(this) != object2) {
                        object1 = atomicReferenceFieldUpdater0.get(this);
                        break;
                    }
                }
            }
        }
        this.complete(object0, object1);
        return object1;
    }

    @Nullable
    public abstract Object prepare(Object arg1);
}

