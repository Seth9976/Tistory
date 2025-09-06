package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\u000B¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/BufferIterator;", "T", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "", "buffer", "", "index", "size", "<init>", "([Ljava/lang/Object;II)V", "next", "()Ljava/lang/Object;", "previous", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BufferIterator extends AbstractListIterator {
    public static final int $stable = 8;
    public final Object[] c;

    public BufferIterator(@NotNull Object[] arr_object, int v, int v1) {
        super(v, v1);
        this.c = arr_object;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int v = this.getIndex();
        this.setIndex(v + 1);
        return this.c[v];
    }

    @Override
    public Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.setIndex(this.getIndex() - 1);
        return this.c[this.getIndex()];
    }
}

