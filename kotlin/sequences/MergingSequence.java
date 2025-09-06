package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B=\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\b\u001A\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00020\u000BH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", "V", "Lkotlin/sequences/Sequence;", "sequence1", "sequence2", "Lkotlin/Function2;", "transform", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MergingSequence implements Sequence {
    public final Sequence a;
    public final Sequence b;
    public final Function2 c;

    public MergingSequence(@NotNull Sequence sequence0, @NotNull Sequence sequence1, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(sequence0, "sequence1");
        Intrinsics.checkNotNullParameter(sequence1, "sequence2");
        Intrinsics.checkNotNullParameter(function20, "transform");
        super();
        this.a = sequence0;
        this.b = sequence1;
        this.c = function20;
    }

    @Override  // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return new Object() {
            public final Iterator a;
            public final Iterator b;
            public final MergingSequence c;

            {
                this.c = mergingSequence0;
                this.a = mergingSequence0.a.iterator();
                this.b = mergingSequence0.b.iterator();
            }

            @NotNull
            public final Iterator getIterator1() {
                return this.a;
            }

            @NotNull
            public final Iterator getIterator2() {
                return this.b;
            }

            // 去混淆评级： 低(20)
            @Override
            public boolean hasNext() {
                return this.a.hasNext() && this.b.hasNext();
            }

            @Override
            public Object next() {
                Function2 function20 = this.c.c;
                Object object0 = this.a.next();
                Object object1 = this.b.next();
                return function20.invoke(object0, object1);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

