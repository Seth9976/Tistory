package androidx.compose.runtime.snapshots;

import i1.h;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\b\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0006\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0004J\u0010\u0010\u0010\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u000F\u0010\u0011\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u000E¨\u0006\u0014"}, d2 = {"androidx/compose/runtime/snapshots/SubList$listIterator$1", "", "", "hasPrevious", "()Z", "", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "", "add", "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "next", "remove", "()Ljava/lang/Void;", "set", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SubList.listIterator.1 implements ListIterator, KMutableListIterator {
    public final IntRef a;
    public final h b;

    public SubList.listIterator.1(IntRef ref$IntRef0, h h0) {
        this.a = ref$IntRef0;
        this.b = h0;
    }

    @NotNull
    public Void add(Object object0) {
        SnapshotStateListKt.access$modificationError();
        throw new KotlinNothingValueException();
    }

    @Override
    public void add(Object object0) {
        this.add(object0);
    }

    @Override
    public boolean hasNext() {
        return this.a.element < this.b.d - 1;
    }

    @Override
    public boolean hasPrevious() {
        return this.a.element >= 0;
    }

    @Override
    public Object next() {
        int v = this.a.element + 1;
        SnapshotStateListKt.access$validateRange(v, this.b.d);
        this.a.element = v;
        return this.b.get(v);
    }

    @Override
    public int nextIndex() {
        return this.a.element + 1;
    }

    @Override
    public Object previous() {
        int v = this.a.element;
        SnapshotStateListKt.access$validateRange(v, this.b.d);
        this.a.element = v - 1;
        return this.b.get(v);
    }

    @Override
    public int previousIndex() {
        return this.a.element;
    }

    @NotNull
    public Void remove() {
        SnapshotStateListKt.access$modificationError();
        throw new KotlinNothingValueException();
    }

    @Override
    public void remove() {
        this.remove();
    }

    @NotNull
    public Void set(Object object0) {
        SnapshotStateListKt.access$modificationError();
        throw new KotlinNothingValueException();
    }

    @Override
    public void set(Object object0) {
        this.set(object0);
    }
}

