package androidx.compose.runtime.snapshots;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.TestOnly;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u000BH\u0007¢\u0006\u0004\b\u000E\u0010\u0003J\u001F\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u000F\u0010\u0010R$\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0011\u001A\u00020\u00048\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "<init>", "()V", "", "default", "lowestOrDefault", "(I)I", "value", "add", "handle", "", "remove", "(I)V", "validate", "validateHandle", "(II)V", "<set-?>", "a", "I", "getSize", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 8;
    public int a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int e;

    public SnapshotDoubleIndexHeap() {
        this.b = new int[16];
        this.c = new int[16];
        int[] arr_v = new int[16];
        for(int v = 0; v < 16; ++v) {
            arr_v[v] = v + 1;
        }
        this.d = arr_v;
    }

    public final void a(int v, int v1) {
        int[] arr_v = this.b;
        int[] arr_v1 = this.c;
        int[] arr_v2 = this.d;
        int v2 = arr_v[v];
        arr_v[v] = arr_v[v1];
        arr_v[v1] = v2;
        int v3 = arr_v1[v];
        arr_v1[v] = arr_v1[v1];
        arr_v1[v1] = v3;
        arr_v2[arr_v1[v]] = v;
        arr_v2[arr_v1[v1]] = v1;
    }

    public final int add(int v) {
        int[] arr_v = this.b;
        if(this.a + 1 > arr_v.length) {
            int[] arr_v1 = new int[arr_v.length * 2];
            int[] arr_v2 = new int[arr_v.length * 2];
            ArraysKt___ArraysJvmKt.copyInto$default(arr_v, arr_v1, 0, 0, 0, 14, null);
            ArraysKt___ArraysJvmKt.copyInto$default(this.c, arr_v2, 0, 0, 0, 14, null);
            this.b = arr_v1;
            this.c = arr_v2;
        }
        int v1 = this.a;
        this.a = v1 + 1;
        int v2 = this.d.length;
        if(this.e >= v2) {
            int[] arr_v3 = new int[v2 * 2];
            for(int v3 = 0; v3 < v2 * 2; ++v3) {
                arr_v3[v3] = v3 + 1;
            }
            ArraysKt___ArraysJvmKt.copyInto$default(this.d, arr_v3, 0, 0, 0, 14, null);
            this.d = arr_v3;
        }
        int v4 = this.e;
        int[] arr_v4 = this.d;
        this.e = arr_v4[v4];
        int[] arr_v5 = this.b;
        arr_v5[v1] = v;
        this.c[v1] = v4;
        arr_v4[v4] = v1;
        int v5 = arr_v5[v1];
        while(v1 > 0) {
            int v6 = (v1 + 1 >> 1) - 1;
            if(arr_v5[v6] <= v5) {
                break;
            }
            this.a(v6, v1);
            v1 = v6;
        }
        return v4;
    }

    public final int getSize() {
        return this.a;
    }

    public final int lowestOrDefault(int v) {
        return this.a <= 0 ? v : this.b[0];
    }

    public static int lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return snapshotDoubleIndexHeap0.lowestOrDefault(v);
    }

    public final void remove(int v) {
        int v1 = this.d[v];
        this.a(v1, this.a - 1);
        --this.a;
        int[] arr_v = this.b;
        int v2 = arr_v[v1];
        for(int v3 = v1; v3 > 0; v3 = v4) {
            int v4 = (v3 + 1 >> 1) - 1;
            if(arr_v[v4] <= v2) {
                break;
            }
            this.a(v4, v3);
        }
        int[] arr_v1 = this.b;
        int v5 = this.a >> 1;
        while(v1 < v5) {
            int v6 = v1 + 1 << 1;
            int v7 = v6 - 1;
            if(v6 < this.a) {
                int v8 = arr_v1[v6];
                if(v8 < arr_v1[v7]) {
                    if(v8 >= arr_v1[v1]) {
                        break;
                    }
                    this.a(v6, v1);
                    v1 = v6;
                    continue;
                }
            }
            if(arr_v1[v7] >= arr_v1[v1]) {
                break;
            }
            this.a(v7, v1);
            v1 = v7;
        }
        this.d[v] = this.e;
        this.e = v;
    }

    @TestOnly
    public final void validate() {
        int v = this.a;
        for(int v1 = 1; v1 < v; ++v1) {
            if(this.b[(v1 + 1 >> 1) - 1] > this.b[v1]) {
                throw new IllegalStateException(("Index " + v1 + " is out of place").toString());
            }
        }
    }

    @TestOnly
    public final void validateHandle(int v, int v1) {
        int v2 = this.d[v];
        if(this.c[v2] != v) {
            throw new IllegalStateException(("Index for handle " + v + " is corrupted").toString());
        }
        if(this.b[v2] == v1) {
            return;
        }
        StringBuilder stringBuilder0 = b.s(v, "Value for handle ", " was ");
        stringBuilder0.append(this.b[v2]);
        stringBuilder0.append(" but was supposed to be ");
        stringBuilder0.append(v1);
        throw new IllegalStateException(stringBuilder0.toString().toString());
    }
}

