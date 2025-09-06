package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001C\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/sequences/IndexingSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", "sequence", "<init>", "(Lkotlin/sequences/Sequence;)V", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class IndexingSequence implements Sequence {
    public final Sequence a;

    public IndexingSequence(@NotNull Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "sequence");
        super();
        this.a = sequence0;
    }

    @Override  // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return new Object() {
            public final Iterator a;
            public int b;

            {
                this.a = indexingSequence0.a.iterator();
            }

            public final int getIndex() {
                return this.b;
            }

            @NotNull
            public final Iterator getIterator() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override
            public Object next() {
                return this.next();
            }

            @NotNull
            public IndexedValue next() {
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

            public final void setIndex(int v) {
                this.b = v;
            }
        };
    }
}

