package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000E\u001A\u00020\r2\u000E\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n¢\u0006\u0004\b\u000E\u0010\u000FJ%\u0010\u000E\u001A\u00020\r2\u000E\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u000E\u0010\u0010J\r\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001A\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001A\u00020\r¢\u0006\u0004\b\u0016\u0010\u0006J\r\u0010\u0017\u001A\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0013J\u001D\u0010\u0019\u001A\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001AJ\r\u0010\u001B\u001A\u00020\r¢\u0006\u0004\b\u001B\u0010\u0006J\u0010\u0010\u001C\u001A\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u001C\u0010\u0013R4\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000E\u0010\u001D\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0004@BX\u0084\u000E¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!R\"\u0010\f\u001A\u00020\n8\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'¨\u0006("}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "K", "V", "T", "", "<init>", "()V", "", "", "buffer", "", "dataSize", "index", "", "reset", "([Ljava/lang/Object;II)V", "([Ljava/lang/Object;I)V", "", "hasNextKey", "()Z", "currentKey", "()Ljava/lang/Object;", "moveToNextKey", "hasNextNode", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "currentNode", "()Lkotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "moveToNextNode", "hasNext", "<set-?>", "a", "[Ljava/lang/Object;", "getBuffer", "()[Ljava/lang/Object;", "c", "I", "getIndex", "()I", "setIndex", "(I)V", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class TrieNodeBaseIterator implements Iterator, KMappedMarker {
    public Object[] a;
    public int b;
    public int c;

    public TrieNodeBaseIterator() {
        this.a = TrieNode.Companion.getEMPTY$kotlinx_collections_immutable().getBuffer$kotlinx_collections_immutable();
    }

    public final Object currentKey() {
        return this.a[this.c];
    }

    @NotNull
    public final TrieNode currentNode() {
        this.hasNextNode();
        Object object0 = this.a[this.c];
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (TrieNode)object0;
    }

    @NotNull
    public final Object[] getBuffer() {
        return this.a;
    }

    public final int getIndex() {
        return this.c;
    }

    @Override
    public boolean hasNext() {
        return this.hasNextKey();
    }

    public final boolean hasNextKey() {
        return this.c < this.b;
    }

    public final boolean hasNextNode() {
        return this.c < this.a.length;
    }

    public final void moveToNextKey() {
        this.c += 2;
    }

    public final void moveToNextNode() {
        this.hasNextNode();
        ++this.c;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(@NotNull Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        this.reset(arr_object, v, 0);
    }

    public final void reset(@NotNull Object[] arr_object, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        this.a = arr_object;
        this.b = v;
        this.c = v1;
    }

    public final void setIndex(int v) {
        this.c = v;
    }
}

