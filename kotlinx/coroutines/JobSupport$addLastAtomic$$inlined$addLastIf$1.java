package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeLinkedListKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\u0010\u0004\u001A\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,367:1\n526#2:368\n*E\n"})
public final class JobSupport.addLastAtomic..inlined.addLastIf.1 extends CondAddOp {
    public final JobSupport b;
    public final Object c;

    public JobSupport.addLastAtomic..inlined.addLastIf.1(LockFreeLinkedListNode lockFreeLinkedListNode0, JobSupport jobSupport0, Object object0) {
        this.b = jobSupport0;
        this.c = object0;
        super(lockFreeLinkedListNode0);
    }

    @Override  // kotlinx.coroutines.internal.AtomicOp
    public Object prepare(Object object0) {
        return this.prepare(((LockFreeLinkedListNode)object0));
    }

    @Nullable
    public Object prepare(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode0) {
        return this.b.getState$kotlinx_coroutines_core() == this.c ? null : LockFreeLinkedListKt.getCONDITION_FALSE();
    }
}

