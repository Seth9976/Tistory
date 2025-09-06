package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000E\u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\u000BJ7\u0010\u000E\u001A\u00020\f2\u000E\u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000BJ\u0010\u0010\u000F\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "", "", "root", "", "index", "size", "height", "<init>", "([Ljava/lang/Object;III)V", "", "reset$runtime_release", "reset", "next", "()Ljava/lang/Object;", "previous", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TrieIterator extends AbstractListIterator {
    public static final int $stable = 8;
    public int c;
    public Object[] d;
    public boolean e;

    public TrieIterator(@NotNull Object[] arr_object, int v, int v1, int v2) {
        super(v, v1);
        this.c = v2;
        Object[] arr_object1 = new Object[v2];
        this.d = arr_object1;
        int v3 = v == v1 ? 1 : 0;
        this.e = v3;
        arr_object1[0] = arr_object;
        this.b(v - v3, 1);
    }

    public final Object a() {
        Object object0 = this.d[this.c - 1];
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[])object0)[this.getIndex() & 0x1F];
    }

    public final void b(int v, int v1) {
        int v2 = (this.c - v1) * 5;
        while(v1 < this.c) {
            Object[] arr_object = this.d;
            Object object0 = arr_object[v1 - 1];
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object[v1] = ((Object[])object0)[v >> v2 & 0x1F];
            v2 -= 5;
            ++v1;
        }
    }

    public final void c(int v) {
        int v1;
        for(v1 = 0; (this.getIndex() >> v1 & 0x1F) == v; v1 += 5) {
        }
        if(v1 > 0) {
            this.b(this.getIndex(), this.c - 1 - v1 / 5 + 1);
        }
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.a();
        this.setIndex(this.getIndex() + 1);
        if(this.getIndex() == this.getSize()) {
            this.e = true;
            return object0;
        }
        this.c(0);
        return object0;
    }

    @Override
    public Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.setIndex(this.getIndex() - 1);
        if(this.e) {
            this.e = false;
            return this.a();
        }
        this.c(0x1F);
        return this.a();
    }

    public final void reset$runtime_release(@NotNull Object[] arr_object, int v, int v1, int v2) {
        this.setIndex(v);
        this.setSize(v1);
        this.c = v2;
        if(this.d.length < v2) {
            this.d = new Object[v2];
        }
        int v3 = 0;
        this.d[0] = arr_object;
        if(v == v1) {
            v3 = 1;
        }
        this.e = v3;
        this.b(v - v3, 1);
    }
}

