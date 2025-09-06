package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\"\u0018\u0010\u0002\u001A\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001A\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "isUnsignedNumber", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "isUnquotedLiteral", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class StreamingJsonEncoderKt {
    public static final Set a;

    static {
        StreamingJsonEncoderKt.a = f0.setOf(new SerialDescriptor[]{BuiltinSerializersKt.serializer(UInt.Companion).getDescriptor(), BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor(), BuiltinSerializersKt.serializer(UByte.Companion).getDescriptor(), BuiltinSerializersKt.serializer(UShort.Companion).getDescriptor()});
    }

    public static final boolean isUnquotedLiteral(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        return serialDescriptor0.isInline() && Intrinsics.areEqual(serialDescriptor0, JsonElementKt.getJsonUnquotedLiteralDescriptor());
    }

    public static final boolean isUnsignedNumber(@NotNull SerialDescriptor serialDescriptor0) {
        Intrinsics.checkNotNullParameter(serialDescriptor0, "<this>");
        return serialDescriptor0.isInline() && StreamingJsonEncoderKt.a.contains(serialDescriptor0);
    }
}

