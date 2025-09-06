package kotlinx.coroutines.internal;

import androidx.compose.material3.rg;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.f;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u00012B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001A\u00020\t2\n\u0010\u0005\u001A\u00060\u0000j\u0002`\u00042\u000E\b\u0004\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\b\u00A2\u0006\u0004\b\n\u0010\u000BJ\u0019\u0010\f\u001A\u00020\u00072\n\u0010\u0005\u001A\u00060\u0000j\u0002`\u0004\u00A2\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000F\u001A\u00020\u000E2\n\u0010\u0005\u001A\u00060\u0000j\u0002`\u0004\u00A2\u0006\u0004\b\u000F\u0010\u0010J,\u0010\u0011\u001A\u00020\u00072\n\u0010\u0005\u001A\u00060\u0000j\u0002`\u00042\u000E\b\u0004\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\b\u00A2\u0006\u0004\b\u0011\u0010\u0012J\'\u0010\u0014\u001A\u00020\u00072\n\u0010\u0005\u001A\u00060\u0000j\u0002`\u00042\n\u0010\u0013\u001A\u00060\u0000j\u0002`\u0004H\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0018\u001A\u00020\u00172\n\u0010\u0005\u001A\u00060\u0000j\u0002`\u00042\n\u0010\u0013\u001A\u00060\u0000j\u0002`\u00042\u0006\u0010\u0016\u001A\u00020\tH\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001C\u001A\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004H\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001E\u001A\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004H\u0014\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\'\u0010\"\u001A\u00020\u000E2\n\u0010\u001F\u001A\u00060\u0000j\u0002`\u00042\n\u0010\u0013\u001A\u00060\u0000j\u0002`\u0004H\u0000\u00A2\u0006\u0004\b \u0010!J\u000F\u0010$\u001A\u00020#H\u0016\u00A2\u0006\u0004\b$\u0010%R\u0014\u0010&\u001A\u00020\u00078VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b&\u0010\u001BR\u0011\u0010\u0013\u001A\u00020\u00018F\u00A2\u0006\u0006\u001A\u0004\b\'\u0010(R\u0015\u0010*\u001A\u00060\u0000j\u0002`\u00048F\u00A2\u0006\u0006\u001A\u0004\b)\u0010\u001DR\u0015\u0010,\u001A\u00060\u0000j\u0002`\u00048F\u00A2\u0006\u0006\u001A\u0004\b+\u0010\u001DR\u0011\u0010.\u001A\b\u0012\u0004\u0012\u00020\u00010-8\u0002X\u0082\u0004R\u0011\u0010/\u001A\b\u0012\u0004\u0012\u00020\u00000-8\u0002X\u0082\u0004R\u0013\u00101\u001A\n\u0012\u0006\u0012\u0004\u0018\u0001000-8\u0002X\u0082\u0004\u00A8\u00063"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "node", "Lkotlin/Function0;", "", "condition", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "addOneIfEmpty", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "", "addLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "addLastIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "next", "addNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "condAdd", "", "tryCondAddNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;)I", "remove", "()Z", "removeOrNext", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "nextIfRemoved", "prev", "validateNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "validateNode", "", "toString", "()Ljava/lang/String;", "isRemoved", "getNext", "()Ljava/lang/Object;", "getNextNode", "nextNode", "getPrevNode", "prevNode", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "Lzf/f;", "_removedRef", "CondAddOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,367:1\n73#1,3:369\n1#2:368\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n*L\n134#1:369,3\n*E\n"})
@InternalCoroutinesApi
public class LockFreeLinkedListNode {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001E\u0010\u0007\u001A\u00020\b2\n\u0010\t\u001A\u00060\u0002j\u0002`\u00032\b\u0010\n\u001A\u0004\u0018\u00010\u000BH\u0016R\u0014\u0010\u0004\u001A\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\u0006\u001A\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000E¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", "", "affected", "failure", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @PublishedApi
    public static abstract class CondAddOp extends AtomicOp {
        @JvmField
        @NotNull
        public final LockFreeLinkedListNode newNode;
        @JvmField
        @Nullable
        public LockFreeLinkedListNode oldNext;

        public CondAddOp(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode0) {
            this.newNode = lockFreeLinkedListNode0;
        }

        @Override  // kotlinx.coroutines.internal.AtomicOp
        public void complete(Object object0, Object object1) {
            this.complete(((LockFreeLinkedListNode)object0), object1);
        }

        public void complete(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode0, @Nullable Object object0) {
            LockFreeLinkedListNode lockFreeLinkedListNode1 = object0 == null ? this.oldNext : this.newNode;
            if(lockFreeLinkedListNode1 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = LockFreeLinkedListNode.a;
                while(true) {
                    if(atomicReferenceFieldUpdater0.compareAndSet(lockFreeLinkedListNode0, this, lockFreeLinkedListNode1)) {
                        if(object0 != null) {
                            break;
                        }
                        LockFreeLinkedListNode lockFreeLinkedListNode2 = this.oldNext;
                        Intrinsics.checkNotNull(lockFreeLinkedListNode2);
                        this.newNode.b(lockFreeLinkedListNode2);
                        return;
                    }
                    if(atomicReferenceFieldUpdater0.get(lockFreeLinkedListNode0) != this) {
                        break;
                    }
                }
            }
        }
    }

    @Volatile
    @Nullable
    private volatile Object _next;
    @Volatile
    @Nullable
    private volatile Object _prev;
    @Volatile
    @Nullable
    private volatile Object _removedRef;
    public static final AtomicReferenceFieldUpdater a;
    public static final AtomicReferenceFieldUpdater b;
    public static final AtomicReferenceFieldUpdater c;

    static {
        LockFreeLinkedListNode.a = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");
        LockFreeLinkedListNode.b = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");
        LockFreeLinkedListNode.c = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_removedRef");
    }

    public LockFreeLinkedListNode() {
        this._next = this;
        this._prev = this;
    }

    public final LockFreeLinkedListNode a() {
        LockFreeLinkedListNode lockFreeLinkedListNode1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0;
    alab1:
        while(true) {
            atomicReferenceFieldUpdater0 = LockFreeLinkedListNode.b;
            LockFreeLinkedListNode lockFreeLinkedListNode0 = (LockFreeLinkedListNode)atomicReferenceFieldUpdater0.get(this);
            lockFreeLinkedListNode1 = lockFreeLinkedListNode0;
            while(true) {
                LockFreeLinkedListNode lockFreeLinkedListNode2 = null;
            label_4:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1 = LockFreeLinkedListNode.a;
                Object object0 = atomicReferenceFieldUpdater1.get(lockFreeLinkedListNode1);
                if(object0 == this) {
                    if(lockFreeLinkedListNode0 == lockFreeLinkedListNode1) {
                        return lockFreeLinkedListNode1;
                    }
                    do {
                        if(atomicReferenceFieldUpdater0.compareAndSet(this, lockFreeLinkedListNode0, lockFreeLinkedListNode1)) {
                            return lockFreeLinkedListNode1;
                        }
                    }
                    while(atomicReferenceFieldUpdater0.get(this) == lockFreeLinkedListNode0);
                    break;
                }
                if(this.isRemoved()) {
                    return null;
                }
                if(object0 == null) {
                    return lockFreeLinkedListNode1;
                }
                if(object0 instanceof OpDescriptor) {
                    ((OpDescriptor)object0).perform(lockFreeLinkedListNode1);
                    break;
                }
                if(!(object0 instanceof f)) {
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    lockFreeLinkedListNode2 = lockFreeLinkedListNode1;
                    lockFreeLinkedListNode1 = (LockFreeLinkedListNode)object0;
                    goto label_4;
                }
                if(lockFreeLinkedListNode2 == null) {
                    break alab1;
                }
                LockFreeLinkedListNode lockFreeLinkedListNode3 = ((f)object0).a;
            label_27:
                if(!atomicReferenceFieldUpdater1.compareAndSet(lockFreeLinkedListNode2, lockFreeLinkedListNode1, lockFreeLinkedListNode3)) {
                    if(atomicReferenceFieldUpdater1.get(lockFreeLinkedListNode2) == lockFreeLinkedListNode1) {
                        goto label_27;
                    }
                    break;
                }
                lockFreeLinkedListNode1 = lockFreeLinkedListNode2;
            }
        }
        lockFreeLinkedListNode1 = (LockFreeLinkedListNode)atomicReferenceFieldUpdater0.get(lockFreeLinkedListNode1);
        goto label_4;
    }

    public final void addLast(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode0) {
        while(!this.getPrevNode().addNext(lockFreeLinkedListNode0, this)) {
        }
    }

    public final boolean addLastIf(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode0, @NotNull Function0 function00) {
        kotlinx.coroutines.internal.LockFreeLinkedListNode.makeCondAddOp.1 lockFreeLinkedListNode$makeCondAddOp$10 = new kotlinx.coroutines.internal.LockFreeLinkedListNode.makeCondAddOp.1(lockFreeLinkedListNode0, function00);
    alab1:
        while(true) {
            switch(this.getPrevNode().tryCondAddNext(lockFreeLinkedListNode0, this, lockFreeLinkedListNode$makeCondAddOp$10)) {
                case 1: {
                    return true;
                }
                case 2: {
                    break alab1;
                }
            }
        }
        return false;
    }

    @PublishedApi
    public final boolean addNext(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode0, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode1) {
        LockFreeLinkedListNode.b.lazySet(lockFreeLinkedListNode0, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = LockFreeLinkedListNode.a;
        atomicReferenceFieldUpdater0.lazySet(lockFreeLinkedListNode0, lockFreeLinkedListNode1);
        do {
            if(atomicReferenceFieldUpdater0.compareAndSet(this, lockFreeLinkedListNode1, lockFreeLinkedListNode0)) {
                lockFreeLinkedListNode0.b(lockFreeLinkedListNode1);
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(this) == lockFreeLinkedListNode1);
        return false;
    }

    public final boolean addOneIfEmpty(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode0) {
        LockFreeLinkedListNode.b.lazySet(lockFreeLinkedListNode0, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = LockFreeLinkedListNode.a;
        atomicReferenceFieldUpdater0.lazySet(lockFreeLinkedListNode0, this);
        while(true) {
            if(this.getNext() != this) {
                return false;
            }
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(this, this, lockFreeLinkedListNode0)) {
                    lockFreeLinkedListNode0.b(this);
                    return true;
                }
            }
            while(atomicReferenceFieldUpdater0.get(this) == this);
        }
    }

    public final void b(LockFreeLinkedListNode lockFreeLinkedListNode0) {
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = LockFreeLinkedListNode.b;
            LockFreeLinkedListNode lockFreeLinkedListNode1 = (LockFreeLinkedListNode)atomicReferenceFieldUpdater0.get(lockFreeLinkedListNode0);
            if(this.getNext() != lockFreeLinkedListNode0) {
                return;
            }
            do {
                if(atomicReferenceFieldUpdater0.compareAndSet(lockFreeLinkedListNode0, lockFreeLinkedListNode1, this)) {
                    if(this.isRemoved()) {
                        lockFreeLinkedListNode0.a();
                    }
                    return;
                }
            }
            while(atomicReferenceFieldUpdater0.get(lockFreeLinkedListNode0) == lockFreeLinkedListNode1);
        }
    }

    @NotNull
    public final Object getNext() {
        Object object0;
        while(true) {
            object0 = LockFreeLinkedListNode.a.get(this);
            if(!(object0 instanceof OpDescriptor)) {
                break;
            }
            ((OpDescriptor)object0).perform(this);
        }
        return object0;
    }

    @NotNull
    public final LockFreeLinkedListNode getNextNode() {
        return LockFreeLinkedListKt.unwrap(this.getNext());
    }

    @NotNull
    public final LockFreeLinkedListNode getPrevNode() {
        LockFreeLinkedListNode lockFreeLinkedListNode0 = this.a();
        if(lockFreeLinkedListNode0 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = LockFreeLinkedListNode.b;
            for(lockFreeLinkedListNode0 = (LockFreeLinkedListNode)atomicReferenceFieldUpdater0.get(this); lockFreeLinkedListNode0.isRemoved(); lockFreeLinkedListNode0 = (LockFreeLinkedListNode)atomicReferenceFieldUpdater0.get(lockFreeLinkedListNode0)) {
            }
        }
        return lockFreeLinkedListNode0;
    }

    public boolean isRemoved() {
        return this.getNext() instanceof f;
    }

    @PublishedApi
    @NotNull
    public final CondAddOp makeCondAddOp(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode0, @NotNull Function0 function00) {
        return new CondAddOp(function00) {
            @Override  // kotlinx.coroutines.internal.AtomicOp
            public Object prepare(Object object0) {
                return this.prepare(((LockFreeLinkedListNode)object0));
            }

            // 去混淆评级： 低(20)
            @Nullable
            public Object prepare(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode0) {
                return ((Boolean)this.b.invoke()).booleanValue() ? null : LockFreeLinkedListKt.getCONDITION_FALSE();
            }
        };
    }

    @Nullable
    public LockFreeLinkedListNode nextIfRemoved() {
        Object object0 = this.getNext();
        f f0 = object0 instanceof f ? ((f)object0) : null;
        return f0 == null ? null : f0.a;
    }

    public boolean remove() {
        return this.removeOrNext() == null;
    }

    @PublishedApi
    @Nullable
    public final LockFreeLinkedListNode removeOrNext() {
        while(true) {
            Object object0 = this.getNext();
            if(object0 instanceof f) {
                return ((f)object0).a;
            }
            if(object0 == this) {
                return (LockFreeLinkedListNode)object0;
            }
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            ((LockFreeLinkedListNode)object0).getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = LockFreeLinkedListNode.c;
            f f0 = (f)atomicReferenceFieldUpdater0.get(((LockFreeLinkedListNode)object0));
            if(f0 == null) {
                f0 = new f(((LockFreeLinkedListNode)object0));
                atomicReferenceFieldUpdater0.lazySet(((LockFreeLinkedListNode)object0), f0);
            }
            do {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1 = LockFreeLinkedListNode.a;
                if(atomicReferenceFieldUpdater1.compareAndSet(this, object0, f0)) {
                    ((LockFreeLinkedListNode)object0).a();
                    return null;
                }
            }
            while(atomicReferenceFieldUpdater1.get(this) == object0);
        }
    }

    @Override
    @NotNull
    public String toString() {
        return new rg(1, this, DebugStringsKt.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 6) + '@' + DebugStringsKt.getHexAddress(this);
    }

    @PublishedApi
    public final int tryCondAddNext(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode0, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode1, @NotNull CondAddOp lockFreeLinkedListNode$CondAddOp0) {
        LockFreeLinkedListNode.b.lazySet(lockFreeLinkedListNode0, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = LockFreeLinkedListNode.a;
        atomicReferenceFieldUpdater0.lazySet(lockFreeLinkedListNode0, lockFreeLinkedListNode1);
        lockFreeLinkedListNode$CondAddOp0.oldNext = lockFreeLinkedListNode1;
        do {
            if(atomicReferenceFieldUpdater0.compareAndSet(this, lockFreeLinkedListNode1, lockFreeLinkedListNode$CondAddOp0)) {
                return lockFreeLinkedListNode$CondAddOp0.perform(this) == null ? 1 : 2;
            }
        }
        while(atomicReferenceFieldUpdater0.get(this) == lockFreeLinkedListNode1);
        return 0;
    }

    public final void validateNode$kotlinx_coroutines_core(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode0, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode1) {
    }
}

