package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000B\u001A\u00028\u0000¢\u0006\u0004\b\u000B\u0010\nJ\u0015\u0010\u000B\u001A\u00028\u00002\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000B\u0010\u000EJ\r\u0010\u000F\u001A\u00020\u0006¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0013\u001A\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0004J\u0013\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001A\u00020\f8F¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/Stack;", "T", "", "<init>", "()V", "value", "", "push", "(Ljava/lang/Object;)Z", "pop", "()Ljava/lang/Object;", "peek", "", "index", "(I)Ljava/lang/Object;", "isEmpty", "()Z", "isNotEmpty", "", "clear", "", "toArray", "()[Ljava/lang/Object;", "getSize", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Stack {
    public static final int $stable = 8;
    public final ArrayList a;

    public Stack() {
        this.a = new ArrayList();
    }

    public final void clear() {
        this.a.clear();
    }

    public final int getSize() {
        return this.a.size();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.isEmpty();
    }

    public final Object peek() {
        int v = this.getSize();
        return this.a.get(v - 1);
    }

    public final Object peek(int v) {
        return this.a.get(v);
    }

    public final Object pop() {
        int v = this.getSize();
        return this.a.remove(v - 1);
    }

    public final boolean push(Object object0) {
        return this.a.add(object0);
    }

    @NotNull
    public final Object[] toArray() {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = arrayList0.get(v1);
        }
        return arr_object;
    }
}

