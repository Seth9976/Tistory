package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001E\u0010\t\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\rR2\u0010\t\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\"\u0010\u001D\u001A\u00020\u00168\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001C¨\u0006\u001E"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "K", "V", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "path", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "currentKey", "()Ljava/lang/Object;", "", "hasNext", "()Z", "next", "a", "[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "getPath", "()[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "", "b", "I", "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "pathLastIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class PersistentHashMapBaseIterator implements Iterator, KMappedMarker {
    public static final int $stable = 8;
    public final TrieNodeBaseIterator[] a;
    public int b;
    public boolean c;

    public PersistentHashMapBaseIterator(@NotNull TrieNode trieNode0, @NotNull TrieNodeBaseIterator[] arr_trieNodeBaseIterator) {
        this.a = arr_trieNodeBaseIterator;
        this.c = true;
        arr_trieNodeBaseIterator[0].reset(trieNode0.getBuffer$runtime_release(), trieNode0.entryCount$runtime_release() * 2);
        this.b = 0;
        this.a();
    }

    public final void a() {
        TrieNodeBaseIterator[] arr_trieNodeBaseIterator = this.a;
        if(arr_trieNodeBaseIterator[this.b].hasNextKey()) {
            return;
        }
        for(int v = this.b; -1 < v; --v) {
            int v1 = this.b(v);
            if(v1 == -1 && arr_trieNodeBaseIterator[v].hasNextNode()) {
                arr_trieNodeBaseIterator[v].moveToNextNode();
                v1 = this.b(v);
            }
            if(v1 != -1) {
                this.b = v1;
                return;
            }
            if(v > 0) {
                arr_trieNodeBaseIterator[v - 1].moveToNextNode();
            }
            arr_trieNodeBaseIterator[v].reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release(), 0);
        }
        this.c = false;
    }

    public final int b(int v) {
        TrieNodeBaseIterator[] arr_trieNodeBaseIterator = this.a;
        if(arr_trieNodeBaseIterator[v].hasNextKey()) {
            return v;
        }
        if(arr_trieNodeBaseIterator[v].hasNextNode()) {
            TrieNode trieNode0 = arr_trieNodeBaseIterator[v].currentNode();
            if(v == 6) {
                arr_trieNodeBaseIterator[7].reset(trieNode0.getBuffer$runtime_release(), trieNode0.getBuffer$runtime_release().length);
                return this.b(7);
            }
            arr_trieNodeBaseIterator[v + 1].reset(trieNode0.getBuffer$runtime_release(), trieNode0.entryCount$runtime_release() * 2);
            return this.b(v + 1);
        }
        return -1;
    }

    public final Object currentKey() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.a[this.b].currentKey();
    }

    @NotNull
    public final TrieNodeBaseIterator[] getPath() {
        return this.a;
    }

    public final int getPathLastIndex() {
        return this.b;
    }

    @Override
    public boolean hasNext() {
        return this.c;
    }

    @Override
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.a[this.b].next();
        this.a();
        return object0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPathLastIndex(int v) {
        this.b = v;
    }
}

