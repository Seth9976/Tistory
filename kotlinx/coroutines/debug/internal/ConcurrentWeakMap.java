package kotlinx.coroutines.debug.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wf.b;
import wf.d;
import wf.e;
import wf.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\'\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\"$%B\u0011\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\n\u001A\u0004\u0018\u00018\u00012\u0006\u0010\t\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ!\u0010\r\u001A\u0004\u0018\u00018\u00012\u0006\u0010\t\u001A\u00028\u00002\u0006\u0010\f\u001A\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0019\u0010\u000F\u001A\u0004\u0018\u00018\u00012\u0006\u0010\t\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000F\u0010\u000BJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0017\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016R\u001A\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00188VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR&\u0010\u001E\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001C0\u00188VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001AR\u000B\u0010 \u001A\u00020\u001F8\u0002X\u0082\u0004R!\u0010#\u001A\u0018\u0012\u0014\u0012\u00120\"R\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000!8\u0002X\u0082\u0004¨\u0006&"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "K", "V", "Lkotlin/collections/AbstractMutableMap;", "", "weakRefQueue", "<init>", "(Z)V", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "", "clear", "()V", "runWeakRefQueueCleaningLoopUntilInterrupted", "", "getSize", "()I", "size", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getEntries", "entries", "Lkotlinx/atomicfu/AtomicInt;", "_size", "Lkotlinx/atomicfu/AtomicRef;", "Lwf/b;", "core", "wf/c", "wf/d", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1#2:285\n*E\n"})
public final class ConcurrentWeakMap extends AbstractMutableMap {
    @Volatile
    private volatile int _size;
    public final ReferenceQueue a;
    public static final AtomicIntegerFieldUpdater b;
    public static final AtomicReferenceFieldUpdater c;
    @Volatile
    @Nullable
    private volatile Object core;

    static {
        ConcurrentWeakMap.b = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size");
        ConcurrentWeakMap.c = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core");
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    public ConcurrentWeakMap(boolean z) {
        this.core = new b(this, 16);
        this.a = z ? new ReferenceQueue() : null;
    }

    public ConcurrentWeakMap(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        this(z);
    }

    public final Object a(Object object0, Object object1) {
        synchronized(this) {
            b b0 = (b)ConcurrentWeakMap.c.get(this);
            Object object2;
            while((object2 = b0.a(object0, object1, null)) == ConcurrentWeakMapKt.access$getREHASH$p()) {
                b0 = b0.b();
                ConcurrentWeakMap.c.set(this, b0);
            }
            return object2;
        }
    }

    public static final void access$decrementSize(ConcurrentWeakMap concurrentWeakMap0) {
        concurrentWeakMap0.getClass();
        ConcurrentWeakMap.b.decrementAndGet(concurrentWeakMap0);
    }

    @Override
    public void clear() {
        for(Object object0: this.keySet()) {
            this.remove(object0);
        }
    }

    @Override
    @Nullable
    public Object get(@Nullable Object object0) {
        if(object0 == null) {
            return null;
        }
        b b0 = (b)ConcurrentWeakMap.c.get(this);
        b0.getClass();
        int v = object0.hashCode() * -1640531527 >>> b0.b;
        HashedWeakRef hashedWeakRef0;
        while((hashedWeakRef0 = (HashedWeakRef)b0.d.get(v)) != null) {
            Object object1 = hashedWeakRef0.get();
            if(Intrinsics.areEqual(object0, object1)) {
                Object object2 = b0.e.get(v);
                return object2 instanceof k ? ((k)object2).a : object2;
            }
            if(object1 == null) {
                b0.c(v);
            }
            if(v == 0) {
                v = b0.a;
            }
            --v;
        }
        return null;
    }

    @Override  // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set getEntries() {
        return new d(this, e.x);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set getKeys() {
        return new d(this, e.y);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return ConcurrentWeakMap.b.get(this);
    }

    @Override  // kotlin.collections.AbstractMutableMap
    @Nullable
    public Object put(@NotNull Object object0, @NotNull Object object1) {
        Object object2 = ((b)ConcurrentWeakMap.c.get(this)).a(object0, object1, null);
        if(object2 == ConcurrentWeakMapKt.access$getREHASH$p()) {
            object2 = this.a(object0, object1);
        }
        if(object2 == null) {
            ConcurrentWeakMap.b.incrementAndGet(this);
        }
        return object2;
    }

    @Override
    @Nullable
    public Object remove(@Nullable Object object0) {
        if(object0 == null) {
            return null;
        }
        Object object1 = ((b)ConcurrentWeakMap.c.get(this)).a(object0, null, null);
        if(object1 == ConcurrentWeakMapKt.a) {
            object1 = this.a(object0, null);
        }
        if(object1 != null) {
            ConcurrentWeakMap.b.decrementAndGet(this);
        }
        return object1;
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        int v;
        b b0;
        ReferenceQueue referenceQueue0 = this.a;
        if(referenceQueue0 != null) {
            try {
                while(true) {
                    Reference reference0 = referenceQueue0.remove();
                    Intrinsics.checkNotNull(reference0, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                    HashedWeakRef hashedWeakRef0 = (HashedWeakRef)reference0;
                    b0 = (b)ConcurrentWeakMap.c.get(this);
                    b0.getClass();
                    v = hashedWeakRef0.hash * -1640531527 >>> b0.b;
                label_8:
                    HashedWeakRef hashedWeakRef1 = (HashedWeakRef)b0.d.get(v);
                    if(hashedWeakRef1 != null) {
                        if(hashedWeakRef1 != hashedWeakRef0) {
                            break;
                        }
                        b0.c(v);
                    }
                }
                if(v == 0) {
                    v = b0.a;
                }
                --v;
                goto label_8;
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        throw new IllegalStateException("Must be created with weakRefQueue = true");
    }
}

