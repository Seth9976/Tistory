package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001D\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001D\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u000BJ\u0016\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lkotlin/sequences/TakeSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "", "count", "<init>", "(Lkotlin/sequences/Sequence;I)V", "n", "drop", "(I)Lkotlin/sequences/Sequence;", "take", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/TakeSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class TakeSequence implements DropTakeSequence, Sequence {
    public final Sequence a;
    public final int b;

    public TakeSequence(@NotNull Sequence sequence0, int v) {
        Intrinsics.checkNotNullParameter(sequence0, "sequence");
        super();
        this.a = sequence0;
        this.b = v;
        if(v < 0) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + v + '.').toString());
        }
    }

    @Override  // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence drop(int v) {
        int v1 = this.b;
        return v >= v1 ? SequencesKt__SequencesKt.emptySequence() : new SubSequence(this.a, v, v1);
    }

    @Override  // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return new Object() {
            public int a;
            public final Iterator b;

            {
                this.a = takeSequence0.b;
                this.b = takeSequence0.a.iterator();
            }

            @NotNull
            public final Iterator getIterator() {
                return this.b;
            }

            public final int getLeft() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a > 0 && this.b.hasNext();
            }

            @Override
            public Object next() {
                int v = this.a;
                if(v == 0) {
                    throw new NoSuchElementException();
                }
                this.a = v - 1;
                return this.b.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setLeft(int v) {
                this.a = v;
            }
        };
    }

    @Override  // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence take(int v) {
        return v < this.b ? new TakeSequence(this.a, v) : this;
    }
}

