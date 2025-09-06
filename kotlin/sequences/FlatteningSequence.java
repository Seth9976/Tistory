package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\t\u001A\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000BJ\u0016\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function1;", "transformer", "", "iterator", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FlatteningSequence implements Sequence {
    public final Sequence a;
    public final Function1 b;
    public final Function1 c;

    public FlatteningSequence(@NotNull Sequence sequence0, @NotNull Function1 function10, @NotNull Function1 function11) {
        Intrinsics.checkNotNullParameter(sequence0, "sequence");
        Intrinsics.checkNotNullParameter(function10, "transformer");
        Intrinsics.checkNotNullParameter(function11, "iterator");
        super();
        this.a = sequence0;
        this.b = function10;
        this.c = function11;
    }

    @Override  // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return new Object() {
            public final Iterator a;
            public Iterator b;
            public final FlatteningSequence c;

            {
                this.c = flatteningSequence0;
                this.a = flatteningSequence0.a.iterator();
            }

            public final boolean a() {
                if(this.b != null && !this.b.hasNext()) {
                    this.b = null;
                }
                while(this.b == null) {
                    Iterator iterator0 = this.a;
                    if(!iterator0.hasNext()) {
                        return false;
                    }
                    Object object0 = iterator0.next();
                    Iterator iterator1 = (Iterator)this.c.c.invoke(this.c.b.invoke(object0));
                    if(iterator1.hasNext()) {
                        this.b = iterator1;
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
                return true;
            }

            @Nullable
            public final Iterator getItemIterator() {
                return this.b;
            }

            @NotNull
            public final Iterator getIterator() {
                return this.a;
            }

            @Override
            public boolean hasNext() {
                return this.a();
            }

            @Override
            public Object next() {
                if(!this.a()) {
                    throw new NoSuchElementException();
                }
                Iterator iterator0 = this.b;
                Intrinsics.checkNotNull(iterator0);
                return iterator0.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setItemIterator(@Nullable Iterator iterator0) {
                this.b = iterator0;
            }
        };
    }
}

