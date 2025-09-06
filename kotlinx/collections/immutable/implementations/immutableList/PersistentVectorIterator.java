package kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u000E\u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000F\u0010\u000E¨\u0006\u0010"}, d2 = {"Lkotlinx/collections/immutable/implementations/immutableList/PersistentVectorIterator;", "T", "Lkotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "", "", "root", "tail", "", "index", "size", "trieHeight", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "next", "()Ljava/lang/Object;", "previous", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PersistentVectorIterator extends AbstractListIterator {
    public final Object[] c;
    public final TrieIterator d;

    public PersistentVectorIterator(@NotNull Object[] arr_object, @NotNull Object[] arr_object1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_object, "root");
        Intrinsics.checkNotNullParameter(arr_object1, "tail");
        super(v, v1);
        this.c = arr_object1;
        int v3 = v1 - 1 & 0xFFFFFFE0;
        this.d = new TrieIterator(arr_object, c.coerceAtMost(v, v3), v3, v2);
    }

    @Override  // kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        this.checkHasNext$kotlinx_collections_immutable();
        TrieIterator trieIterator0 = this.d;
        if(trieIterator0.hasNext()) {
            this.setIndex(this.getIndex() + 1);
            return trieIterator0.next();
        }
        int v = this.getIndex();
        this.setIndex(v + 1);
        return this.c[v - trieIterator0.getSize()];
    }

    @Override
    public Object previous() {
        this.checkHasPrevious$kotlinx_collections_immutable();
        TrieIterator trieIterator0 = this.d;
        if(this.getIndex() > trieIterator0.getSize()) {
            this.setIndex(this.getIndex() - 1);
            return this.c[this.getIndex() - trieIterator0.getSize()];
        }
        this.setIndex(this.getIndex() - 1);
        return trieIterator0.previous();
    }
}

