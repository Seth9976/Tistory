package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000B\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u000EJ\u001D\u0010\u0012\u001A\u00020\n2\u0006\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/BitVector;", "", "<init>", "()V", "", "index", "", "get", "(I)Z", "value", "", "set", "(IZ)V", "nextSet", "(I)I", "nextClear", "start", "end", "setRange", "(II)V", "", "toString", "()Ljava/lang/String;", "getSize", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/BitVector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4151:1\n1#2:4152\n*E\n"})
public final class BitVector {
    public static final int $stable = 8;
    public long a;
    public long b;
    public long[] c;

    public final boolean get(int v) {
        if(v < 0 || v >= this.getSize()) {
            throw new IllegalStateException(("Index " + v + " out of bound").toString());
        }
        if(v < 0x40) {
            return (1L << v & this.a) != 0L;
        }
        if(v < 0x80) {
            return (1L << v - 0x40 & this.b) != 0L;
        }
        long[] arr_v = this.c;
        if(arr_v == null) {
            return false;
        }
        int v1 = v / 0x40 - 2;
        return v1 < arr_v.length ? (1L << v % 0x40 & arr_v[v1]) != 0L : false;
    }

    public final int getSize() {
        return this.c == null ? 0x80 : (this.c.length + 2) * 0x40;
    }

    public final int nextClear(int v) {
        int v1 = this.getSize();
        while(v < v1) {
            if(!this.get(v)) {
                return v;
            }
            ++v;
        }
        return 0x7FFFFFFF;
    }

    public final int nextSet(int v) {
        int v1 = this.getSize();
        while(v < v1) {
            if(this.get(v)) {
                return v;
            }
            ++v;
        }
        return 0x7FFFFFFF;
    }

    public final void set(int v, boolean z) {
        if(v < 0x40) {
            this.a = z ? this.a | 1L << v : this.a & ~(1L << v);
            return;
        }
        if(v < 0x80) {
            long v1 = 1L << v - 0x40;
            this.b = z ? this.b | v1 : this.b & ~v1;
            return;
        }
        int v2 = v / 0x40 - 2;
        long v3 = 1L << v % 0x40;
        long[] arr_v = this.c;
        if(arr_v == null) {
            arr_v = new long[v / 0x40 - 1];
            this.c = arr_v;
        }
        if(v2 >= arr_v.length) {
            arr_v = Arrays.copyOf(arr_v, v / 0x40 - 1);
            Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(this, newSize)");
            this.c = arr_v;
        }
        long v4 = arr_v[v2];
        arr_v[v2] = z ? v3 | v4 : ~v3 & v4;
    }

    public final void setRange(int v, int v1) {
        while(v < v1) {
            this.set(v, true);
            ++v;
        }
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BitVector [");
        int v = this.getSize();
        boolean z = true;
        for(int v1 = 0; v1 < v; ++v1) {
            if(this.get(v1)) {
                if(!z) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(v1);
                z = false;
            }
        }
        return q.l(']', "StringBuilder().apply(builderAction).toString()", stringBuilder0);
    }
}

