package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u0005¨\u0006\u000E"}, d2 = {"Landroidx/compose/runtime/internal/IntRef;", "", "", "element", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "a", "I", "getElement", "()I", "setElement", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class IntRef {
    public static final int $stable = 8;
    public int a;

    public IntRef() {
        this(0, 1, null);
    }

    public IntRef(int v) {
        this.a = v;
    }

    public IntRef(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    public final int getElement() {
        return this.a;
    }

    public final void setElement(int v) {
        this.a = v;
    }

    @Override
    @NotNull
    public String toString() {
        String s = Integer.toString(this.hashCode(), b.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(s, "toString(this, checkRadix(radix))");
        return "IntRef(element = " + this.a + ")@" + s;
    }
}

