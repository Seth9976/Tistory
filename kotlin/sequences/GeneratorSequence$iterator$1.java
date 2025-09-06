package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kf.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001A\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\f\u001A\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\u0003\"\u0004\b\n\u0010\u000BR\"\u0010\u0014\u001A\u00020\r8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"kotlin/sequences/GeneratorSequence$iterator$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "a", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "", "b", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GeneratorSequence.iterator.1 implements Iterator, KMappedMarker {
    public Object a;
    public int b;
    public final c c;

    public GeneratorSequence.iterator.1(c c0) {
        this.c = c0;
        this.b = -2;
    }

    public final void a() {
        Object object0;
        c c0 = this.c;
        if(this.b == -2) {
            object0 = c0.a.invoke();
        }
        else {
            Object object1 = this.a;
            Intrinsics.checkNotNull(object1);
            object0 = c0.b.invoke(object1);
        }
        this.a = object0;
        this.b = object0 == null ? 0 : 1;
    }

    @Nullable
    public final Object getNextItem() {
        return this.a;
    }

    public final int getNextState() {
        return this.b;
    }

    @Override
    public boolean hasNext() {
        if(this.b < 0) {
            this.a();
        }
        return this.b == 1;
    }

    @Override
    @NotNull
    public Object next() {
        if(this.b < 0) {
            this.a();
        }
        if(this.b == 0) {
            throw new NoSuchElementException();
        }
        Object object0 = this.a;
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.b = -1;
        return object0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setNextItem(@Nullable Object object0) {
        this.a = object0;
    }

    public final void setNextState(int v) {
        this.b = v;
    }
}

