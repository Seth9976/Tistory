package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001A\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lkotlin/collections/IndexingIterator;", "T", "", "Lkotlin/collections/IndexedValue;", "iterator", "<init>", "(Ljava/util/Iterator;)V", "", "hasNext", "()Z", "next", "()Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class IndexingIterator implements Iterator, KMappedMarker {
    public final Iterator a;
    public int b;

    public IndexingIterator(@NotNull Iterator iterator0) {
        Intrinsics.checkNotNullParameter(iterator0, "iterator");
        super();
        this.a = iterator0;
    }

    @Override
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public Object next() {
        return this.next();
    }

    @NotNull
    public final IndexedValue next() {
        int v = this.b;
        this.b = v + 1;
        if(v < 0) {
            CollectionsKt__CollectionsKt.throwIndexOverflow();
        }
        Object object0 = this.a.next();
        return new IndexedValue(v, object0);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

