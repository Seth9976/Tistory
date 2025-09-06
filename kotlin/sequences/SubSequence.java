package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u000EH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "", "startIndex", "endIndex", "<init>", "(Lkotlin/sequences/Sequence;II)V", "n", "drop", "(I)Lkotlin/sequences/Sequence;", "take", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
public final class SubSequence implements DropTakeSequence, Sequence {
    public final Sequence a;
    public final int b;
    public final int c;

    public SubSequence(@NotNull Sequence sequence0, int v, int v1) {
        Intrinsics.checkNotNullParameter(sequence0, "sequence");
        super();
        this.a = sequence0;
        this.b = v;
        this.c = v1;
        if(v < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + v).toString());
        }
        if(v1 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + v1).toString());
        }
        if(v1 < v) {
            throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + v1 + " < " + v).toString());
        }
    }

    @Override  // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence drop(int v) {
        int v1 = this.c;
        int v2 = this.b;
        return v >= v1 - v2 ? SequencesKt__SequencesKt.emptySequence() : new SubSequence(this.a, v2 + v, v1);
    }

    @Override  // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return new Object() {
            public final Iterator a;
            public int b;
            public final SubSequence c;

            {
                this.c = subSequence0;
                this.a = subSequence0.a.iterator();
            }

            public final void a() {
                while(this.b < this.c.b) {
                    Iterator iterator0 = this.a;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    iterator0.next();
                    ++this.b;
                }
            }

            @NotNull
            public final Iterator getIterator() {
                return this.a;
            }

            public final int getPosition() {
                return this.b;
            }

            @Override
            public boolean hasNext() {
                this.a();
                return this.b < this.c.c && this.a.hasNext();
            }

            @Override
            public Object next() {
                this.a();
                if(this.b >= this.c.c) {
                    throw new NoSuchElementException();
                }
                ++this.b;
                return this.a.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setPosition(int v) {
                this.b = v;
            }
        };
    }

    @Override  // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence take(int v) {
        return v < this.c - this.b ? new SubSequence(this.a, this.b, v + this.b) : this;
    }
}

