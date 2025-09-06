package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULongArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

@ExperimentalUnsignedTypes
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u0010\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0013\u001A\u00020\u0002H\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u00068\u0010@RX\u0090\u000E¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001A"}, d2 = {"Lkotlinx/serialization/internal/ULongArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Lkotlin/ULongArray;", "bufferWithData", "<init>", "([JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "Lkotlin/ULong;", "c", "append-VKZWuLQ$kotlinx_serialization_core", "(J)V", "append", "build-Y2RjT0g$kotlinx_serialization_core", "()[J", "build", "<set-?>", "b", "I", "getPosition$kotlinx_serialization_core", "()I", "position", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
@ExperimentalSerializationApi
public final class ULongArrayBuilder extends PrimitiveArrayBuilder {
    public long[] a;
    public int b;

    public ULongArrayBuilder(long[] arr_v, DefaultConstructorMarker defaultConstructorMarker0) {
        Intrinsics.checkNotNullParameter(arr_v, "bufferWithData");
        super();
        this.a = arr_v;
        this.b = ULongArray.getSize-impl(arr_v);
        this.ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append-VKZWuLQ$kotlinx_serialization_core(long v) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int v1 = this.getPosition$kotlinx_serialization_core();
        this.b = v1 + 1;
        ULongArray.set-k8EXiF4(this.a, v1, v);
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public Object build$kotlinx_serialization_core() {
        return ULongArray.box-impl(this.build-Y2RjT0g$kotlinx_serialization_core());
    }

    @NotNull
    public long[] build-Y2RjT0g$kotlinx_serialization_core() {
        long[] arr_v = Arrays.copyOf(this.a, this.getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(...)");
        return ULongArray.constructor-impl(arr_v);
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int v) {
        if(ULongArray.getSize-impl(this.a) < v) {
            long[] arr_v = Arrays.copyOf(this.a, c.coerceAtLeast(v, ULongArray.getSize-impl(this.a) * 2));
            Intrinsics.checkNotNullExpressionValue(arr_v, "copyOf(...)");
            this.a = ULongArray.constructor-impl(arr_v);
        }
    }

    @Override  // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public int getPosition$kotlinx_serialization_core() {
        return this.b;
    }
}

