package kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\'\u0010\n\u001A\u00020\t2\u000E\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\r\u001A\u00020\f¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u000F\u001A\u00020\t¢\u0006\u0004\b\u000F\u0010\u0004J\r\u0010\u0010\u001A\u00020\f¢\u0006\u0004\b\u0010\u0010\u000EJ\r\u0010\u0011\u001A\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001A\u00020\f¢\u0006\u0004\b\u0014\u0010\u000EJ\u0015\u0010\u0016\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "E", "", "<init>", "()V", "", "buffer", "", "index", "", "reset", "([Ljava/lang/Object;I)V", "", "hasNextCell", "()Z", "moveToNextCell", "hasNextElement", "currentElement", "()Ljava/lang/Object;", "nextElement", "hasNextNode", "Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "currentNode", "()Lkotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TrieNodeIterator {
    public Object[] a;
    public int b;

    public TrieNodeIterator() {
        this.a = TrieNode.Companion.getEMPTY$kotlinx_collections_immutable().getBuffer();
    }

    public final Object currentElement() {
        this.hasNextElement();
        return this.a[this.b];
    }

    @NotNull
    public final TrieNode currentNode() {
        this.hasNextNode();
        Object object0 = this.a[this.b];
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (TrieNode)object0;
    }

    public final boolean hasNextCell() {
        return this.b < this.a.length;
    }

    // 去混淆评级： 低(20)
    public final boolean hasNextElement() {
        return this.hasNextCell() && !(this.a[this.b] instanceof TrieNode);
    }

    // 去混淆评级： 低(20)
    public final boolean hasNextNode() {
        return this.hasNextCell() && this.a[this.b] instanceof TrieNode;
    }

    public final void moveToNextCell() {
        ++this.b;
    }

    public final Object nextElement() {
        this.hasNextElement();
        int v = this.b;
        this.b = v + 1;
        return this.a[v];
    }

    public final void reset(@NotNull Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        this.a = arr_object;
        this.b = v;
    }

    public static void reset$default(TrieNodeIterator trieNodeIterator0, Object[] arr_object, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        trieNodeIterator0.reset(arr_object, v);
    }
}

