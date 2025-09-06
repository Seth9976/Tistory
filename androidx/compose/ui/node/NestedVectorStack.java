package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001A\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001B\u0010\r\u001A\u00020\f2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/node/NestedVectorStack;", "T", "", "<init>", "()V", "", "isNotEmpty", "()Z", "pop", "()Ljava/lang/Object;", "Landroidx/compose/runtime/collection/MutableVector;", "vector", "", "push", "(Landroidx/compose/runtime/collection/MutableVector;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNestedVectorStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,61:1\n523#2:62\n*S KotlinDebug\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n*L\n44#1:62\n*E\n"})
public final class NestedVectorStack {
    public static final int $stable = 8;
    public int a;
    public int[] b;
    public MutableVector[] c;

    public NestedVectorStack() {
        this.b = new int[16];
        this.c = new MutableVector[16];
    }

    public final boolean isNotEmpty() {
        return this.a > 0 && this.b[this.a - 1] >= 0;
    }

    public final Object pop() {
        int v = this.a;
        if(v <= 0) {
            throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
        }
        int v1 = this.b[v - 1];
        MutableVector mutableVector0 = this.c[v - 1];
        Intrinsics.checkNotNull(mutableVector0);
        if(v1 > 0) {
            --this.b[v - 1];
            return mutableVector0.getContent()[v1];
        }
        if(v1 == 0) {
            this.c[v - 1] = null;
            --this.a;
        }
        return mutableVector0.getContent()[v1];
    }

    public final void push(@NotNull MutableVector mutableVector0) {
        if(mutableVector0.isEmpty()) {
            return;
        }
        int v = this.a;
        int[] arr_v = this.b;
        if(v >= arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            Intrinsics.checkNotNullExpressionValue(arr_v1, "copyOf(this, newSize)");
            this.b = arr_v1;
            Object[] arr_object = Arrays.copyOf(this.c, this.c.length * 2);
            Intrinsics.checkNotNullExpressionValue(arr_object, "copyOf(this, newSize)");
            this.c = (MutableVector[])arr_object;
        }
        this.b[v] = mutableVector0.getSize() - 1;
        this.c[v] = mutableVector0;
        ++this.a;
    }
}

