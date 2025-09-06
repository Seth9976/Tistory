package kotlinx.coroutines;

import a5.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000E\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BJ\b\u0010\r\u001A\u00020\u000BH\u0016R\u0014\u0010\u0004\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\u000E"}, d2 = {"Lkotlinx/coroutines/NodeList;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/Incomplete;", "()V", "isActive", "", "()Z", "list", "getList", "()Lkotlinx/coroutines/NodeList;", "getString", "", "state", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1454:1\n341#2,6:1455\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n*L\n1364#1:1455,6\n*E\n"})
public final class NodeList extends LockFreeLinkedListHead implements Incomplete {
    @Override  // kotlinx.coroutines.Incomplete
    @NotNull
    public NodeList getList() {
        return this;
    }

    @NotNull
    public final String getString(@NotNull String s) {
        StringBuilder stringBuilder0 = b.v("List{", s, "}[");
        Object object0 = this.getNext();
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        LockFreeLinkedListNode lockFreeLinkedListNode0 = (LockFreeLinkedListNode)object0;
        boolean z = true;
        while(!Intrinsics.areEqual(lockFreeLinkedListNode0, this)) {
            if(lockFreeLinkedListNode0 instanceof JobNode) {
                if(z) {
                    z = false;
                }
                else {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(((JobNode)lockFreeLinkedListNode0));
            }
            lockFreeLinkedListNode0 = lockFreeLinkedListNode0.getNextNode();
        }
        stringBuilder0.append("]");
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "StringBuilder().apply(builderAction).toString()");
        return s1;
    }

    @Override  // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return true;
    }

    @Override  // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return super.toString();
    }
}

