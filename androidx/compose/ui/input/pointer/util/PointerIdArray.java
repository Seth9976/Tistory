package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerId;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000F\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001E\u0010\t\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u000E\u0010\rJ\u0015\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\u000B¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u0015\u001A\u00020\u000F¢\u0006\u0004\b\u0016\u0010\rJ\u0018\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\rJ \u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0015\u001A\u00020\u000FH\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001AJ#\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\u0006H\u0086\u0002ø\u0001\u0001¢\u0006\u0004\b\u001B\u0010\u001AJ\r\u0010\u001C\u001A\u00020\u0018¢\u0006\u0004\b\u001C\u0010\u0003J\u0018\u0010\u001E\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u001D\u0010\rJ\u0015\u0010\u001E\u001A\u00020\u000B2\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u001E\u0010\rR$\u0010$\u001A\u00020\u00042\u0006\u0010\u001F\u001A\u00020\u00048\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R\u0012\u0010&\u001A\u00020\u00048Æ\u0002¢\u0006\u0006\u001A\u0004\b%\u0010#\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "", "<init>", "()V", "", "index", "Landroidx/compose/ui/input/pointer/PointerId;", "get-_I2yYro", "(I)J", "get", "pointerId", "", "remove-0FcD4WY", "(J)Z", "remove", "", "pointerIdValue", "removeAt", "(I)Z", "isEmpty", "()Z", "value", "add", "add-0FcD4WY", "", "set", "(IJ)V", "set-DmW0f2w", "clear", "contains-0FcD4WY", "contains", "<set-?>", "a", "I", "getSize", "()I", "size", "getLastIndex", "lastIndex", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PointerIdArray {
    public static final int $stable = 8;
    public int a;
    public long[] b;

    public PointerIdArray() {
        this.b = new long[2];
    }

    public final boolean add(long v) {
        if(!this.contains(v)) {
            this.set(this.a, v);
            return true;
        }
        return false;
    }

    public final boolean add-0FcD4WY(long v) {
        return this.add(v);
    }

    public final void clear() {
        this.a = 0;
    }

    public final boolean contains(long v) {
        int v1 = this.a;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.b[v2] == v) {
                return true;
            }
        }
        return false;
    }

    public final boolean contains-0FcD4WY(long v) {
        return this.contains(v);
    }

    public final long get-_I2yYro(int v) {
        return PointerId.constructor-impl(this.b[v]);
    }

    public final int getLastIndex() {
        return this.getSize() - 1;
    }

    public final int getSize() {
        return this.a;
    }

    public final boolean isEmpty() {
        return this.a == 0;
    }

    public final boolean remove(long v) {
        int v1 = this.a;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(v == this.get-_I2yYro(v2)) {
                this.removeAt(v2);
                return true;
            }
        }
        return false;
    }

    public final boolean remove-0FcD4WY(long v) {
        return this.remove(v);
    }

    public final boolean removeAt(int v) {
        int v1 = this.a;
        if(v < v1) {
            while(v < v1 - 1) {
                this.b[v] = this.b[v + 1];
                ++v;
            }
            --this.a;
            return true;
        }
        return false;
    }

    public final void set(int v, long v1) {
        long[] arr_v = this.b;
        if(v >= arr_v.length) {
            long[] arr_v1 = Arrays.copyOf(arr_v, Math.max(v + 1, arr_v.length * 2));
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.b = arr_v1;
        }
        this.b[v] = v1;
        if(v >= this.a) {
            this.a = v + 1;
        }
    }

    public final void set-DmW0f2w(int v, long v1) {
        this.set(v, v1);
    }
}

