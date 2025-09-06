package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.jvm.Volatile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001A\u00020\t¢\u0006\u0004\b\n\u0010\u000BJ\u0013\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0012\u001A\u00020\u000FH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u000B\u0010\u0015\u001A\u00020\u00148\u0002X\u0082\u0004R\u0013\u0010\u0017\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00168\u0002X\u0082\u0004¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/OnDemandAllocatingPool;", "T", "", "", "maxCapacity", "Lkotlin/Function1;", "create", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "", "allocate", "()Z", "", "close", "()Ljava/util/List;", "", "stateRepresentation$kotlinx_coroutines_core", "()Ljava/lang/String;", "stateRepresentation", "toString", "Lkotlinx/atomicfu/AtomicInt;", "controlState", "Lkotlinx/atomicfu/AtomicArray;", "elements", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,107:1\n41#1:108\n41#1:109\n35#1,7:110\n41#1:127\n1549#2:117\n1620#2,2:118\n1622#2:122\n1549#2:123\n1620#2,3:124\n101#3,2:120\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n35#1:108\n54#1:109\n76#1:110,7\n92#1:127\n77#1:117\n77#1:118,2\n77#1:122\n91#1:123\n91#1:124,3\n79#1:120,2\n*E\n"})
public final class OnDemandAllocatingPool {
    public final int a;
    public final Function1 b;
    public final AtomicReferenceArray c;
    @Volatile
    private volatile int controlState;
    public static final AtomicIntegerFieldUpdater d;

    static {
        OnDemandAllocatingPool.d = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState");
    }

    public OnDemandAllocatingPool(int v, @NotNull Function1 function10) {
        this.a = v;
        this.b = function10;
        this.c = new AtomicReferenceArray(v);
    }

    public final boolean allocate() {
        int v;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = OnDemandAllocatingPool.d;
            v = atomicIntegerFieldUpdater0.get(this);
            if((0x80000000 & v) != 0) {
                return false;
            }
            if(v >= this.a) {
                return true;
            }
        }
        while(!atomicIntegerFieldUpdater0.compareAndSet(this, v, v + 1));
        Object object0 = this.b.invoke(v);
        this.c.set(v, object0);
        return true;
    }

    @NotNull
    public final List close() {
        Object object0;
        int v;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = OnDemandAllocatingPool.d;
            v = atomicIntegerFieldUpdater0.get(this);
            if((v & 0x80000000) != 0) {
                v = 0;
                break;
            }
        }
        while(!atomicIntegerFieldUpdater0.compareAndSet(this, v, 0x80000000 | v));
        IntRange intRange0 = c.until(0, v);
        List list0 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
        Iterator iterator0 = intRange0.iterator();
        while(iterator0.hasNext()) {
            int v1 = ((IntIterator)iterator0).nextInt();
            do {
                object0 = this.c.getAndSet(v1, null);
            }
            while(object0 == null);
            list0.add(object0);
        }
        return list0;
    }

    @NotNull
    public final String stateRepresentation$kotlinx_coroutines_core() {
        int v = OnDemandAllocatingPool.d.get(this);
        IntRange intRange0 = c.until(0, 0x7FFFFFFF & v);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
        Iterator iterator0 = intRange0.iterator();
        while(iterator0.hasNext()) {
            int v1 = ((IntIterator)iterator0).nextInt();
            arrayList0.add(this.c.get(v1));
        }
        String s = arrayList0.toString();
        return (v & 0x80000000) == 0 ? s + "" : s + "[closed]";
    }

    @Override
    @NotNull
    public String toString() {
        return "OnDemandAllocatingPool(" + this.stateRepresentation$kotlinx_coroutines_core() + ')';
    }
}

