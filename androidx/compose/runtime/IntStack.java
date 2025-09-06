package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000E\u001A\u00020\u0004¢\u0006\u0004\b\u000E\u0010\nJ\r\u0010\u000F\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\nJ\u0015\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0004¢\u0006\u0004\b\u000E\u0010\rJ\r\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001A\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001A\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0003J\u0015\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0016\u0010\rR\u0011\u0010\u0018\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0017\u0010\n¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/IntStack;", "", "<init>", "()V", "", "value", "", "push", "(I)V", "pop", "()I", "default", "peekOr", "(I)I", "peek", "peek2", "index", "", "isEmpty", "()Z", "isNotEmpty", "clear", "indexOf", "getSize", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class IntStack {
    public static final int $stable = 8;
    public int[] a;
    public int b;

    public IntStack() {
        this.a = new int[10];
    }

    public final void clear() {
        this.b = 0;
    }

    public final int getSize() {
        return this.b;
    }

    public final int indexOf(int v) {
        int v1 = this.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.a[v2] == v) {
                return v2;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.b == 0;
    }

    public final boolean isNotEmpty() {
        return this.b != 0;
    }

    public final int peek() {
        return this.a[this.b - 1];
    }

    public final int peek(int v) {
        return this.a[v];
    }

    public final int peek2() {
        return this.a[this.b - 2];
    }

    public final int peekOr(int v) {
        return this.b <= 0 ? v : this.peek();
    }

    public final int pop() {
        int v = this.b - 1;
        this.b = v;
        return this.a[v];
    }

    public final void push(int v) {
        int[] arr_v = this.a;
        if(this.b >= arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
        }
        int v1 = this.b;
        this.b = v1 + 1;
        this.a[v1] = v;
    }
}

