package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 $*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002$%B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0013\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00010\u0015\"\u0004\b\u0001\u0010\u00122\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001A\u00020\u0005¢\u0006\u0004\b\u0018\u0010\nR\u0011\u0010\u0019\u001A\u00020\u00058F¢\u0006\u0006\u001A\u0004\b\u0019\u0010\nR\u0011\u0010\u001C\u001A\u00020\u00038F¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001BR%\u0010\u001F\u001A\u001C\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001E0\u001D8\u0002X\u0082\u0004R\u000B\u0010!\u001A\u00020 8\u0002X\u0082\u0004R\u0013\u0010#\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"8\u0002X\u0082\u0004¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "close", "()Z", "element", "addLast", "(Ljava/lang/Object;)I", "removeFirstOrNull", "()Ljava/lang/Object;", "next", "()Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "isClosed", "isEmpty", "getSize", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/Core;", "_next", "Lkotlinx/atomicfu/AtomicLong;", "_state", "Lkotlinx/atomicfu/AtomicArray;", "array", "Companion", "Placeholder", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n299#2,3:309\n299#2,3:312\n299#2,3:315\n299#2,3:318\n299#2,3:321\n299#2,3:325\n299#2,3:328\n1#3:324\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n91#1:309,3\n92#1:312,3\n107#1:315,3\n167#1:318,3\n200#1:321,3\n231#1:325,3\n247#1:328,3\n*E\n"})
public final class LockFreeTaskQueueCore {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001J\u001C\u0010\u0004\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0086\u0004\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000B\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001A\u00020\u0006\u00A2\u0006\u0004\b\u000B\u0010\tJR\u0010\u0013\u001A\u00028\u0001\"\u0004\b\u0001\u0010\f*\u00020\u000226\u0010\u0012\u001A2\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0006\u00A2\u0006\f\b\u000E\u0012\b\b\u000F\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00028\u00010\rH\u0086\b\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001A\u00020\u0006*\u00020\u0002\u00A2\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001A\u00020\u00068\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001A\u00020\u00068\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001A\u001A\u00020\u00068\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001A\u0010\u0018R\u0014\u0010\u001B\u001A\u00020\u00068\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001B\u0010\u0018R\u0014\u0010\u001C\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001C\u0010\u001DR\u0014\u0010\u001E\u001A\u00020\u00068\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001E\u0010\u0018R\u0014\u0010\u001F\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\u001F\u0010\u001DR\u0014\u0010 \u001A\u00020\u00068\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b \u0010\u0018R\u0014\u0010!\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b!\u0010\u001DR\u0014\u0010\"\u001A\u00020\u00068\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0014\u0010#\u001A\u00020\u00068\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b#\u0010\u0018R\u0014\u0010$\u001A\u00020\u00068\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b$\u0010\u0018R\u0014\u0010%\u001A\u00020\u00068\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b%\u0010\u0018R\u0014\u0010\'\u001A\u00020&8\u0006X\u0087\u0004\u00A2\u0006\u0006\n\u0004\b\'\u0010(R\u0014\u0010)\u001A\u00020\u00028\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b)\u0010\u001DR\u0014\u0010*\u001A\u00020\u00068\u0006X\u0086T\u00A2\u0006\u0006\n\u0004\b*\u0010\u0018\u00A8\u0006+"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "", "other", "wo", "(JJ)J", "", "newHead", "updateHead", "(JI)J", "newTail", "updateTail", "T", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "tail", "block", "withState", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "addFailReason", "(J)I", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/Symbol;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final int addFailReason(long v) {
            return (v & 0x2000000000000000L) == 0L ? 1 : 2;
        }

        public final long updateHead(long v, int v1) {
            return v & 0xFFFFFFFFC0000000L | ((long)v1);
        }

        public final long updateTail(long v, int v1) {
            return v & 0xF00000003FFFFFFFL | ((long)v1) << 30;
        }

        public final Object withState(long v, @NotNull Function2 function20) {
            return function20.invoke(((int)(0x3FFFFFFFL & v)), ((int)((v & 0xFFFFFFFC0000000L) >> 30)));
        }

        public final long wo(long v, long v1) [...] // Inlined contents
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", "index", "", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Placeholder {
        @JvmField
        public final int index;

        public Placeholder(int v) {
            this.index = v;
        }
    }

    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 0x2000000000000000L;
    public static final int CLOSED_SHIFT = 61;
    @NotNull
    public static final Companion Companion = null;
    public static final long FROZEN_MASK = 0x1000000000000000L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 0x3FFFFFFFL;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 0x3FFFFFFF;
    public static final int MIN_ADD_SPIN_CAPACITY = 0x400;
    @JvmField
    @NotNull
    public static final Symbol REMOVE_FROZEN = null;
    public static final long TAIL_MASK = 0xFFFFFFFC0000000L;
    public static final int TAIL_SHIFT = 30;
    @Volatile
    @Nullable
    private volatile Object _next;
    @Volatile
    private volatile long _state;
    public final int a;
    public final boolean b;
    public final int c;
    public final AtomicReferenceArray d;
    public static final AtomicReferenceFieldUpdater e;
    public static final AtomicLongFieldUpdater f;

    static {
        LockFreeTaskQueueCore.Companion = new Companion(null);
        LockFreeTaskQueueCore.e = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next");
        LockFreeTaskQueueCore.f = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state");
        LockFreeTaskQueueCore.REMOVE_FROZEN = new Symbol("REMOVE_FROZEN");
    }

    public LockFreeTaskQueueCore(int v, boolean z) {
        this.a = v;
        this.b = z;
        this.c = v - 1;
        this.d = new AtomicReferenceArray(v);
        if(v - 1 > 0x3FFFFFFF || (v & v - 1) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int addLast(@NotNull Object object0) {
        AtomicReferenceArray atomicReferenceArray0;
        int v2;
        int v1;
        do {
            while(true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater0 = LockFreeTaskQueueCore.f;
                long v = atomicLongFieldUpdater0.get(this);
                if((0x3000000000000000L & v) != 0L) {
                    return LockFreeTaskQueueCore.Companion.addFailReason(v);
                }
                v1 = (int)((0xFFFFFFFC0000000L & v) >> 30);
                v2 = this.c;
                if((v1 + 2 & v2) == (((int)(0x3FFFFFFFL & v)) & v2)) {
                    return 1;
                }
                atomicReferenceArray0 = this.d;
                if(this.b || atomicReferenceArray0.get(v1 & v2) == null) {
                    break;
                }
                if(this.a < 0x400 || (v1 - ((int)(0x3FFFFFFFL & v)) & 0x3FFFFFFF) > this.a >> 1) {
                    return 1;
                }
            }
        }
        while(!LockFreeTaskQueueCore.f.compareAndSet(this, v, LockFreeTaskQueueCore.Companion.updateTail(v, v1 + 1 & 0x3FFFFFFF)));
        atomicReferenceArray0.set(v1 & v2, object0);
        LockFreeTaskQueueCore lockFreeTaskQueueCore0 = this;
        while((atomicLongFieldUpdater0.get(lockFreeTaskQueueCore0) & 0x1000000000000000L) != 0L) {
            lockFreeTaskQueueCore0 = lockFreeTaskQueueCore0.next();
            AtomicReferenceArray atomicReferenceArray1 = lockFreeTaskQueueCore0.d;
            int v3 = lockFreeTaskQueueCore0.c & v1;
            Object object1 = atomicReferenceArray1.get(v3);
            if(!(object1 instanceof Placeholder) || ((Placeholder)object1).index != v1) {
                lockFreeTaskQueueCore0 = null;
            }
            else {
                atomicReferenceArray1.set(v3, object0);
            }
            if(lockFreeTaskQueueCore0 == null) {
                break;
            }
        }
        return 0;
    }

    public final boolean close() {
        do {
            AtomicLongFieldUpdater atomicLongFieldUpdater0 = LockFreeTaskQueueCore.f;
            long v = atomicLongFieldUpdater0.get(this);
            if(Long.compare(v & 0x2000000000000000L, 0L) != 0) {
                return true;
            }
            if((0x1000000000000000L & v) != 0L) {
                return false;
            }
        }
        while(!atomicLongFieldUpdater0.compareAndSet(this, v, 0x2000000000000000L | v));
        return true;
    }

    public final int getSize() {
        long v = LockFreeTaskQueueCore.f.get(this);
        return ((int)((v & 0xFFFFFFFC0000000L) >> 30)) - ((int)(0x3FFFFFFFL & v)) & 0x3FFFFFFF;
    }

    public final boolean isClosed() {
        return (LockFreeTaskQueueCore.f.get(this) & 0x2000000000000000L) != 0L;
    }

    public final boolean isEmpty() {
        long v = LockFreeTaskQueueCore.f.get(this);
        return ((int)(0x3FFFFFFFL & v)) == ((int)((v & 0xFFFFFFFC0000000L) >> 30));
    }

    @NotNull
    public final List map(@NotNull Function1 function10) {
        List list0 = new ArrayList(this.a);
        long v = LockFreeTaskQueueCore.f.get(this);
        for(int v1 = (int)(0x3FFFFFFFL & v); true; ++v1) {
            int v2 = this.c;
            if((v1 & v2) == (((int)((v & 0xFFFFFFFC0000000L) >> 30)) & v2)) {
                break;
            }
            Object object0 = this.d.get(v2 & v1);
            if(object0 != null && !(object0 instanceof Placeholder)) {
                ((ArrayList)list0).add(function10.invoke(object0));
            }
        }
        return list0;
    }

    @NotNull
    public final LockFreeTaskQueueCore next() {
        LockFreeTaskQueueCore lockFreeTaskQueueCore0;
        long v;
        AtomicLongFieldUpdater atomicLongFieldUpdater0;
        while(true) {
            atomicLongFieldUpdater0 = LockFreeTaskQueueCore.f;
            v = atomicLongFieldUpdater0.get(this);
            if((v & 0x1000000000000000L) != 0L) {
                break;
            }
            if(atomicLongFieldUpdater0.compareAndSet(this, v, v | 0x1000000000000000L)) {
                v |= 0x1000000000000000L;
                break;
            }
        }
        while(true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = LockFreeTaskQueueCore.e;
            lockFreeTaskQueueCore0 = (LockFreeTaskQueueCore)atomicReferenceFieldUpdater0.get(this);
            if(lockFreeTaskQueueCore0 != null) {
                break;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore1 = new LockFreeTaskQueueCore(this.a * 2, this.b);
            int v1 = (int)(0x3FFFFFFFL & v);
            int v2;
            while((v2 = v1 & this.c) != (this.c & ((int)((0xFFFFFFFC0000000L & v) >> 30)))) {
                Placeholder lockFreeTaskQueueCore$Placeholder0 = this.d.get(v2);
                if(lockFreeTaskQueueCore$Placeholder0 == null) {
                    lockFreeTaskQueueCore$Placeholder0 = new Placeholder(v1);
                }
                lockFreeTaskQueueCore1.d.set(lockFreeTaskQueueCore1.c & v1, lockFreeTaskQueueCore$Placeholder0);
                ++v1;
            }
            atomicLongFieldUpdater0.set(lockFreeTaskQueueCore1, v & 0xEFFFFFFFFFFFFFFFL);
            while(!atomicReferenceFieldUpdater0.compareAndSet(this, null, lockFreeTaskQueueCore1) && atomicReferenceFieldUpdater0.get(this) == null) {
            }
        }
        return lockFreeTaskQueueCore0;
    }

    @Nullable
    public final Object removeFirstOrNull() {
        int v6;
        int v3;
        Object object0;
        AtomicReferenceArray atomicReferenceArray0;
        int v1;
        long v;
        do {
            while(true) {
                v = LockFreeTaskQueueCore.f.get(this);
                if((v & 0x1000000000000000L) != 0L) {
                    return LockFreeTaskQueueCore.REMOVE_FROZEN;
                }
                v1 = this.c;
                if((((int)((0xFFFFFFFC0000000L & v) >> 30)) & v1) == (((int)(v & 0x3FFFFFFFL)) & v1)) {
                    return null;
                }
                atomicReferenceArray0 = this.d;
                object0 = atomicReferenceArray0.get(((int)(v & 0x3FFFFFFFL)) & v1);
                boolean z = this.b;
                if(object0 != null) {
                    break;
                }
                if(z) {
                    return null;
                }
            }
            if(object0 instanceof Placeholder) {
                return null;
            }
            int v2 = ((int)(v & 0x3FFFFFFFL)) + 1 & 0x3FFFFFFF;
            v3 = v2;
            if(LockFreeTaskQueueCore.f.compareAndSet(this, v, LockFreeTaskQueueCore.Companion.updateHead(v, v2))) {
                atomicReferenceArray0.set(((int)(v & 0x3FFFFFFFL)) & v1, null);
                return object0;
            }
        }
        while(!z);
        LockFreeTaskQueueCore lockFreeTaskQueueCore0 = this;
        while(true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater0 = LockFreeTaskQueueCore.f;
            long v4 = atomicLongFieldUpdater0.get(lockFreeTaskQueueCore0);
            int v5 = (int)(v4 & 0x3FFFFFFFL);
            if((v4 & 0x1000000000000000L) == 0L) {
                v6 = v3;
                if(atomicLongFieldUpdater0.compareAndSet(lockFreeTaskQueueCore0, v4, LockFreeTaskQueueCore.Companion.updateHead(v4, v6))) {
                    lockFreeTaskQueueCore0.d.set(lockFreeTaskQueueCore0.c & v5, null);
                    lockFreeTaskQueueCore0 = null;
                label_33:
                    if(lockFreeTaskQueueCore0 == null) {
                        return object0;
                    }
                }
            }
            else {
                lockFreeTaskQueueCore0 = lockFreeTaskQueueCore0.next();
                v6 = v3;
                goto label_33;
            }
            v3 = v6;
        }
    }
}

