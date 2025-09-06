package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "", "sendWhen", "Lkotlin/Function1;", "predicate", "<init>", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FilteringSequence implements Sequence {
    public final Sequence a;
    public final boolean b;
    public final Function1 c;

    public FilteringSequence(@NotNull Sequence sequence0, boolean z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "sequence");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        super();
        this.a = sequence0;
        this.b = z;
        this.c = function10;
    }

    public FilteringSequence(Sequence sequence0, boolean z, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            z = true;
        }
        this(sequence0, z, function10);
    }

    @Override  // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return new Object() {
            public final Iterator a;
            public int b;
            public Object c;
            public final FilteringSequence d;

            {
                this.d = filteringSequence0;
                this.a = filteringSequence0.a.iterator();
                this.b = -1;
            }

            public final void a() {
                while(true) {
                    Iterator iterator0 = this.a;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    if(((Boolean)this.d.c.invoke(object0)).booleanValue() == this.d.b) {
                        this.c = object0;
                        this.b = 1;
                        return;
                    }
                }
                this.b = 0;
            }

            @NotNull
            public final Iterator getIterator() {
                return this.a;
            }

            @Nullable
            public final Object getNextItem() {
                return this.c;
            }

            public final int getNextState() {
                return this.b;
            }

            @Override
            public boolean hasNext() {
                if(this.b == -1) {
                    this.a();
                }
                return this.b == 1;
            }

            @Override
            public Object next() {
                if(this.b == -1) {
                    this.a();
                }
                if(this.b == 0) {
                    throw new NoSuchElementException();
                }
                Object object0 = this.c;
                this.c = null;
                this.b = -1;
                return object0;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setNextItem(@Nullable Object object0) {
                this.c = object0;
            }

            public final void setNextState(int v) {
                this.b = v;
            }
        };
    }
}

