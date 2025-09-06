package androidx.compose.runtime.collection;

import android.util.SparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u000B\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001A\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000B\u001A\u00028\u00002\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\r\u001A\u00028\u0000¢\u0006\u0004\b\u000B\u0010\u000EJ \u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0007\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0006J\r\u0010\u0014\u001A\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001A\u00020\u00038F¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/collection/IntMap;", "E", "", "", "initialCapacity", "<init>", "(I)V", "key", "", "contains", "(I)Z", "get", "(I)Ljava/lang/Object;", "valueIfAbsent", "(ILjava/lang/Object;)Ljava/lang/Object;", "value", "", "set", "(ILjava/lang/Object;)V", "remove", "clear", "()V", "getSize", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class IntMap {
    public static final int $stable = 8;
    public final SparseArray a;

    public IntMap(int v) {
        SparseArray sparseArray0 = new SparseArray(v);
        super();
        this.a = sparseArray0;
    }

    public IntMap(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 10;
        }
        this(v);
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(int v) {
        return this.a.indexOfKey(v) >= 0;
    }

    @Nullable
    public final Object get(int v) {
        return this.a.get(v);
    }

    public final Object get(int v, Object object0) {
        return this.a.get(v, object0);
    }

    public final int getSize() {
        return this.a.size();
    }

    public final void remove(int v) {
        this.a.remove(v);
    }

    public final void set(int v, Object object0) {
        this.a.put(v, object0);
    }
}

