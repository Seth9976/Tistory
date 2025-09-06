package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000E\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001A\u0004\u0018\u00018\u00002\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u0000¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001A\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001A\u00020\u000F¢\u0006\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0017\u001A\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001A\u00020\f8F¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0013R\u0013\u0010\u0003\u001A\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001A\u001A\u00020\f8&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0013R\u0013\u0010\u001C\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001B8\u0002X\u0082\u0004R\u0013\u0010\u001D\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001B8\u0002X\u0082\u0004¨\u0006\u001E"}, d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "", "prev", "<init>", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)V", "Lkotlin/Function0;", "", "onClosedAction", "nextOrIfClosed", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "value", "", "trySetNext", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Z", "", "cleanPrev", "()V", "markAsClosed", "()Z", "remove", "getNext", "()Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "next", "isTail", "getPrev", "isRemoved", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n107#1,7:270\n1#2:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n115#1:270,7\n*E\n"})
public abstract class ConcurrentLinkedListNode {
    @Volatile
    @Nullable
    private volatile Object _next;
    @Volatile
    @Nullable
    private volatile Object _prev;
    public static final AtomicReferenceFieldUpdater a;
    public static final AtomicReferenceFieldUpdater b;

    static {
        ConcurrentLinkedListNode.a = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_next");
        ConcurrentLinkedListNode.b = AtomicReferenceFieldUpdater.newUpdater(ConcurrentLinkedListNode.class, Object.class, "_prev");
    }

    public ConcurrentLinkedListNode(@Nullable ConcurrentLinkedListNode concurrentLinkedListNode0) {
        this._prev = concurrentLinkedListNode0;
    }

    public static final Object access$getNextOrClosed(ConcurrentLinkedListNode concurrentLinkedListNode0) {
        concurrentLinkedListNode0.getClass();
        return ConcurrentLinkedListNode.a.get(concurrentLinkedListNode0);
    }

    public final void cleanPrev() {
        ConcurrentLinkedListNode.b.lazySet(this, null);
    }

    @Nullable
    public final ConcurrentLinkedListNode getNext() {
        Object object0 = ConcurrentLinkedListNode.access$getNextOrClosed(this);
        return object0 == ConcurrentLinkedListKt.access$getCLOSED$p() ? null : ((ConcurrentLinkedListNode)object0);
    }

    @Nullable
    public final ConcurrentLinkedListNode getPrev() {
        return (ConcurrentLinkedListNode)ConcurrentLinkedListNode.b.get(this);
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
        return this.getNext() == null;
    }

    public final boolean markAsClosed() {
        Symbol symbol0 = ConcurrentLinkedListKt.access$getCLOSED$p();
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = ConcurrentLinkedListNode.a;
            if(atomicReferenceFieldUpdater0.compareAndSet(this, null, symbol0)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(this) == null);
        return false;
    }

    @Nullable
    public final ConcurrentLinkedListNode nextOrIfClosed(@NotNull Function0 function00) {
        Object object0 = ConcurrentLinkedListNode.access$getNextOrClosed(this);
        if(object0 != ConcurrentLinkedListKt.access$getCLOSED$p()) {
            return (ConcurrentLinkedListNode)object0;
        }
        function00.invoke();
        throw new KotlinNothingValueException();
    }

    public final void remove() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0;
        if(this.isTail()) {
            return;
        }
        do {
            ConcurrentLinkedListNode concurrentLinkedListNode0;
            for(concurrentLinkedListNode0 = this.getPrev(); true; concurrentLinkedListNode0 = (ConcurrentLinkedListNode)atomicReferenceFieldUpdater0.get(concurrentLinkedListNode0)) {
                atomicReferenceFieldUpdater0 = ConcurrentLinkedListNode.b;
                if(concurrentLinkedListNode0 == null || !concurrentLinkedListNode0.isRemoved()) {
                    break;
                }
            }
            ConcurrentLinkedListNode concurrentLinkedListNode1 = this.getNext();
            Intrinsics.checkNotNull(concurrentLinkedListNode1);
            while(concurrentLinkedListNode1.isRemoved()) {
                ConcurrentLinkedListNode concurrentLinkedListNode2 = concurrentLinkedListNode1.getNext();
                if(concurrentLinkedListNode2 == null) {
                    break;
                }
                concurrentLinkedListNode1 = concurrentLinkedListNode2;
            }
            while(true) {
                Object object0 = atomicReferenceFieldUpdater0.get(concurrentLinkedListNode1);
                ConcurrentLinkedListNode concurrentLinkedListNode3 = ((ConcurrentLinkedListNode)object0) == null ? null : concurrentLinkedListNode0;
            label_16:
                if(atomicReferenceFieldUpdater0.compareAndSet(concurrentLinkedListNode1, object0, concurrentLinkedListNode3)) {
                    break;
                }
                if(atomicReferenceFieldUpdater0.get(concurrentLinkedListNode1) != object0) {
                    continue;
                }
                if(false) {
                    break;
                }
                goto label_16;
            }
            if(concurrentLinkedListNode0 != null) {
                ConcurrentLinkedListNode.a.set(concurrentLinkedListNode0, concurrentLinkedListNode1);
            }
        }
        while(concurrentLinkedListNode1.isRemoved() && !concurrentLinkedListNode1.isTail() || concurrentLinkedListNode0 != null && concurrentLinkedListNode0.isRemoved());
    }

    public final boolean trySetNext(@NotNull ConcurrentLinkedListNode concurrentLinkedListNode0) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = ConcurrentLinkedListNode.a;
            if(atomicReferenceFieldUpdater0.compareAndSet(this, null, concurrentLinkedListNode0)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(this) == null);
        return false;
    }
}

