package kotlinx.collections.immutable.implementations.immutableSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetMutableIterator;", "E", "Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "", "Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "builder", "<init>", "(Lkotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)V", "next", "()Ljava/lang/Object;", "", "remove", "()V", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PersistentHashSetMutableIterator extends PersistentHashSetIterator implements Iterator, KMutableIterator {
    public final PersistentHashSetBuilder d;
    public Object e;
    public boolean f;
    public int g;

    public PersistentHashSetMutableIterator(@NotNull PersistentHashSetBuilder persistentHashSetBuilder0) {
        Intrinsics.checkNotNullParameter(persistentHashSetBuilder0, "builder");
        super(persistentHashSetBuilder0.getNode$kotlinx_collections_immutable());
        this.d = persistentHashSetBuilder0;
        this.g = persistentHashSetBuilder0.getModCount$kotlinx_collections_immutable();
    }

    public final void c(int v, TrieNode trieNode0, Object object0, int v1) {
        if(trieNode0.getBitmap() == 0) {
            int v2 = ArraysKt___ArraysKt.indexOf(trieNode0.getBuffer(), object0);
            ((TrieNodeIterator)this.getPath().get(v1)).reset(trieNode0.getBuffer(), v2);
            this.setPathLastIndex(v1);
            return;
        }
        int v3 = trieNode0.indexOfCellAt$kotlinx_collections_immutable(1 << (v >> v1 * 5 & 0x1F));
        ((TrieNodeIterator)this.getPath().get(v1)).reset(trieNode0.getBuffer(), v3);
        Object object1 = trieNode0.getBuffer()[v3];
        if(object1 instanceof TrieNode) {
            this.c(v, ((TrieNode)object1), object0, v1 + 1);
            return;
        }
        this.setPathLastIndex(v1);
    }

    @Override  // kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator
    public Object next() {
        if(this.d.getModCount$kotlinx_collections_immutable() != this.g) {
            throw new ConcurrentModificationException();
        }
        Object object0 = super.next();
        this.e = object0;
        this.f = true;
        return object0;
    }

    @Override  // kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator
    public void remove() {
        if(!this.f) {
            throw new IllegalStateException();
        }
        PersistentHashSetBuilder persistentHashSetBuilder0 = this.d;
        if(this.hasNext()) {
            Object object0 = this.currentElement();
            Object object1 = this.e;
            TypeIntrinsics.asMutableCollection(persistentHashSetBuilder0).remove(object1);
            this.c((object0 == null ? 0 : object0.hashCode()), persistentHashSetBuilder0.getNode$kotlinx_collections_immutable(), object0, 0);
        }
        else {
            Object object2 = this.e;
            TypeIntrinsics.asMutableCollection(persistentHashSetBuilder0).remove(object2);
        }
        this.e = null;
        this.f = false;
        this.g = persistentHashSetBuilder0.getModCount$kotlinx_collections_immutable();
    }
}

