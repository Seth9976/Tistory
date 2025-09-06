package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\fH\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0013\u001A\u00020\u0002H\u0010¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u00068\u0010@RX\u0090\u000E¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Lkotlinx/serialization/internal/BooleanArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "bufferWithData", "<init>", "([Z)V", "", "requiredCapacity", "", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "", "c", "append$kotlinx_serialization_core", "(Z)V", "append", "build$kotlinx_serialization_core", "()[Z", "build", "<set-?>", "b", "I", "getPosition$kotlinx_serialization_core", "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
public final class BooleanArrayBuilder extends PrimitiveArrayBuilder {
    public boolean[] a;
    public int b;

    public BooleanArrayBuilder(@NotNull boolean[] arr_z) {
        Intrinsics.checkNotNullParameter(arr_z, "bufferWithData");
        super();
        this.a = arr_z;
        this.b = arr_z.length;
        this.ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(boolean z) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int v = this.getPosition$kotlinx_serialization_core();
        this.b = v + 1;
        this.a[v] = z;
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public Object build$kotlinx_serialization_core() {
        return this.build$kotlinx_serialization_core();
    }

    @NotNull
    public boolean[] build$kotlinx_serialization_core() {
        boolean[] arr_z = Arrays.copyOf(this.a, this.getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(arr_z, "copyOf(...)");
        return arr_z;
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int v) {
        boolean[] arr_z = this.a;
        if(arr_z.length < v) {
            boolean[] arr_z1 = Arrays.copyOf(arr_z, c.coerceAtLeast(v, arr_z.length * 2));
            Intrinsics.checkNotNullExpressionValue(arr_z1, "copyOf(...)");
            this.a = arr_z1;
        }
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.b;
    }
}

