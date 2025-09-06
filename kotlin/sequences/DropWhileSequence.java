package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lkotlin/sequences/DropWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "Lkotlin/Function1;", "", "predicate", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DropWhileSequence implements Sequence {
    public final Sequence a;
    public final Function1 b;

    public DropWhileSequence(@NotNull Sequence sequence0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(sequence0, "sequence");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        super();
        this.a = sequence0;
        this.b = function10;
    }

    @Override  // kotlin.sequences.Sequence
    @NotNull
    public Iterator iterator() {
        return new Object() {
            public final Iterator a;
            public int b;
            public Object c;
            public final DropWhileSequence d;

            {
                this.d = dropWhileSequence0;
                this.a = dropWhileSequence0.a.iterator();
                this.b = -1;
            }

            public final void a() {
                while(true) {
                    Iterator iterator0 = this.a;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    if(!((Boolean)this.d.b.invoke(object0)).booleanValue()) {
                        this.c = object0;
                        this.b = 1;
                        return;
                    }
                }
                this.b = 0;
            }

            public final int getDropState() {
                return this.b;
            }

            @NotNull
            public final Iterator getIterator() {
                return this.a;
            }

            @Nullable
            public final Object getNextItem() {
                return this.c;
            }

            @Override
            public boolean hasNext() {
                if(this.b == -1) {
                    this.a();
                }
                return this.b == 1 || this.a.hasNext();
            }

            @Override
            public Object next() {
                if(this.b == -1) {
                    this.a();
                }
                if(this.b == 1) {
                    Object object0 = this.c;
                    this.c = null;
                    this.b = 0;
                    return object0;
                }
                return this.a.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setDropState(int v) {
                this.b = v;
            }

            public final void setNextItem(@Nullable Object object0) {
                this.c = object0;
            }
        };
    }
}

