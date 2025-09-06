package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UIntArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@ExperimentalUnsignedTypes
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u000F\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\nJ\u0015\u0010\u0012\u001A\u00020\u0002H\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00068\u0010@RX\u0090\u000E¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lkotlinx/serialization/internal/UIntArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Lkotlin/UIntArray;", "bufferWithData", "<init>", "([ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "Lkotlin/UInt;", "c", "append-WZ4Q5Ns$kotlinx_serialization_core", "append", "build--hP7Qyg$kotlinx_serialization_core", "()[I", "build", "<set-?>", "b", "I", "getPosition$kotlinx_serialization_core", "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
@ExperimentalSerializationApi
public final class UIntArrayBuilder extends PrimitiveArrayBuilder {
    public int[] a;
    public int b;

    public UIntArrayBuilder(int[] arr_v, DefaultConstructorMarker defaultConstructorMarker0) {
        Intrinsics.checkNotNullParameter(arr_v, "bufferWithData");
        super();
        this.a = arr_v;
        this.b = UIntArray.getSize-impl(arr_v);
        this.ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append-WZ4Q5Ns$kotlinx_serialization_core(int v) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int v1 = this.getPosition$kotlinx_serialization_core();
        this.b = v1 + 1;
        UIntArray.set-VXSXFK8(this.a, v1, v);
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public Object build$kotlinx_serialization_core() {
        return UIntArray.box-impl(this.build--hP7Qyg$kotlinx_serialization_core());
    }

    @NotNull
    public int[] build--hP7Qyg$kotlinx_serialization_core() {
        int[] arr_v = Arrays.copyOf(this.a, this.getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(...)");
        return UIntArray.constructor-impl(arr_v);
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int v) {
        if(UIntArray.getSize-impl(this.a) < v) {
            int[] arr_v = Arrays.copyOf(this.a, c.coerceAtLeast(v, UIntArray.getSize-impl(this.a) * 2));
            Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(...)");
            this.a = UIntArray.constructor-impl(arr_v);
        }
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.b;
    }
}

