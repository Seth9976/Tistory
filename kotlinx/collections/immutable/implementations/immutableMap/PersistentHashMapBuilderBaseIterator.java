package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u001E\u0010\n\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0014\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00028\u00002\u0006\u0010\u0013\u001A\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderBaseIterator;", "K", "V", "T", "", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "", "Lkotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "path", "<init>", "(Lkotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;[Lkotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "next", "()Ljava/lang/Object;", "", "remove", "()V", "key", "newValue", "setValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class PersistentHashMapBuilderBaseIterator extends PersistentHashMapBaseIterator implements Iterator, KMutableIterator {
    public final PersistentHashMapBuilder d;
    public Object e;
    public boolean f;
    public int g;

    public PersistentHashMapBuilderBaseIterator(@NotNull PersistentHashMapBuilder persistentHashMapBuilder0, @NotNull TrieNodeBaseIterator[] arr_trieNodeBaseIterator) {
        Intrinsics.checkNotNullParameter(persistentHashMapBuilder0, "builder");
        Intrinsics.checkNotNullParameter(arr_trieNodeBaseIterator, "path");
        super(persistentHashMapBuilder0.getNode$kotlinx_collections_immutable(), arr_trieNodeBaseIterator);
        this.d = persistentHashMapBuilder0;
        this.g = persistentHashMapBuilder0.getModCount$kotlinx_collections_immutable();
    }

    public final void c(int v, TrieNode trieNode0, Object object0, int v1) {
        if(v1 * 5 > 30) {
            this.getPath()[v1].reset(trieNode0.getBuffer$kotlinx_collections_immutable(), trieNode0.getBuffer$kotlinx_collections_immutable().length, 0);
            while(!Intrinsics.areEqual(this.getPath()[v1].currentKey(), object0)) {
                this.getPath()[v1].moveToNextKey();
            }
            this.setPathLastIndex(v1);
            return;
        }
        int v2 = v >> v1 * 5 & 0x1F;
        if(trieNode0.hasEntryAt$kotlinx_collections_immutable(1 << v2)) {
            this.getPath()[v1].reset(trieNode0.getBuffer$kotlinx_collections_immutable(), trieNode0.entryCount$kotlinx_collections_immutable() * 2, trieNode0.entryKeyIndex$kotlinx_collections_immutable(1 << v2));
            this.setPathLastIndex(v1);
            return;
        }
        int v3 = trieNode0.nodeIndex$kotlinx_collections_immutable(1 << v2);
        TrieNode trieNode1 = trieNode0.nodeAtIndex$kotlinx_collections_immutable(v3);
        this.getPath()[v1].reset(trieNode0.getBuffer$kotlinx_collections_immutable(), trieNode0.entryCount$kotlinx_collections_immutable() * 2, v3);
        this.c(v, trieNode1, object0, v1 + 1);
    }

    @Override  // kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator
    public Object next() {
        if(this.d.getModCount$kotlinx_collections_immutable() != this.g) {
            throw new ConcurrentModificationException();
        }
        this.e = this.currentKey();
        this.f = true;
        return super.next();
    }

    @Override  // kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator
    public void remove() {
        if(!this.f) {
            throw new IllegalStateException();
        }
        PersistentHashMapBuilder persistentHashMapBuilder0 = this.d;
        if(this.hasNext()) {
            Object object0 = this.currentKey();
            Object object1 = this.e;
            TypeIntrinsics.asMutableMap(persistentHashMapBuilder0).remove(object1);
            this.c((object0 == null ? 0 : object0.hashCode()), persistentHashMapBuilder0.getNode$kotlinx_collections_immutable(), object0, 0);
        }
        else {
            Object object2 = this.e;
            TypeIntrinsics.asMutableMap(persistentHashMapBuilder0).remove(object2);
        }
        this.e = null;
        this.f = false;
        this.g = persistentHashMapBuilder0.getModCount$kotlinx_collections_immutable();
    }

    public final void setValue(Object object0, Object object1) {
        PersistentHashMapBuilder persistentHashMapBuilder0 = this.d;
        if(!persistentHashMapBuilder0.containsKey(object0)) {
            return;
        }
        if(this.hasNext()) {
            Object object2 = this.currentKey();
            persistentHashMapBuilder0.put(object0, object1);
            this.c((object2 == null ? 0 : object2.hashCode()), persistentHashMapBuilder0.getNode$kotlinx_collections_immutable(), object2, 0);
        }
        else {
            persistentHashMapBuilder0.put(object0, object1);
        }
        this.g = persistentHashMapBuilder0.getModCount$kotlinx_collections_immutable();
    }
}

