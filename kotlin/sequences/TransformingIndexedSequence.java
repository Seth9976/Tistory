package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B/\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\u0007\u001A\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00010\nH\u0096\u0002¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/sequences/TransformingIndexedSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function2;", "", "transformer", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TransformingIndexedSequence implements Sequence {
    public final Sequence a;
    public final Function2 b;

    public TransformingIndexedSequence(@NotNull Sequence sequence0, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "sequence");
        Intrinsics.checkNotNullParameter(function20, "transformer");
        super();
        this.a = sequence0;
        this.b = function20;
    }

    @Override  // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return new Object() {
            public final Iterator a;
            public int b;
            public final TransformingIndexedSequence c;

            {
                this.c = transformingIndexedSequence0;
                this.a = transformingIndexedSequence0.a.iterator();
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
                Function2 function20 = this.c.b;
                int v = this.b;
                this.b = v + 1;
                if(v < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Object object0 = this.a.next();
                return function20.invoke(v, object0);
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

