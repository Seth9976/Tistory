package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001A\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u000BR&\u0010\u0013\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000E0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\"\u0010\u001B\u001A\u00020\u00148\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001A¨\u0006\u001C"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "currentElement", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "a", "Ljava/util/List;", "getPath", "()Ljava/util/List;", "path", "", "b", "I", "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "pathLastIndex", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class PersistentHashSetIterator implements Iterator, KMappedMarker {
    public static final int $stable = 8;
    public final List a;
    public int b;
    public boolean c;

    public PersistentHashSetIterator(@NotNull TrieNode trieNode0) {
        List list0 = CollectionsKt__CollectionsKt.mutableListOf(new TrieNodeIterator[]{new TrieNodeIterator()});
        this.a = list0;
        this.c = true;
        TrieNodeIterator.reset$default(((TrieNodeIterator)list0.get(0)), trieNode0.getBuffer(), 0, 2, null);
        this.b = 0;
        this.a();
    }

    public final void a() {
        List list0 = this.a;
        if(((TrieNodeIterator)list0.get(this.b)).hasNextElement()) {
            return;
        }
        for(int v = this.b; -1 < v; --v) {
            int v1 = this.b(v);
            if(v1 == -1 && ((TrieNodeIterator)list0.get(v)).hasNextCell()) {
                ((TrieNodeIterator)list0.get(v)).moveToNextCell();
                v1 = this.b(v);
            }
            if(v1 != -1) {
                this.b = v1;
                return;
            }
            if(v > 0) {
                ((TrieNodeIterator)list0.get(v - 1)).moveToNextCell();
            }
            ((TrieNodeIterator)list0.get(v)).reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer(), 0);
        }
        this.c = false;
    }

    public final int b(int v) {
        List list0 = this.a;
        if(((TrieNodeIterator)list0.get(v)).hasNextElement()) {
            return v;
        }
        if(((TrieNodeIterator)list0.get(v)).hasNextNode()) {
            TrieNode trieNode0 = ((TrieNodeIterator)list0.get(v)).currentNode();
            if(v + 1 == list0.size()) {
                list0.add(new TrieNodeIterator());
            }
            TrieNodeIterator.reset$default(((TrieNodeIterator)list0.get(v + 1)), trieNode0.getBuffer(), 0, 2, null);
            return this.b(v + 1);
        }
        return -1;
    }

    public final Object currentElement() {
        return ((TrieNodeIterator)this.a.get(this.b)).currentElement();
    }

    @NotNull
    public final List getPath() {
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
        if(!this.c) {
            throw new NoSuchElementException();
        }
        Object object0 = ((TrieNodeIterator)this.a.get(this.b)).nextElement();
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

