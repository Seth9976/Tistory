package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0013\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0013\u0010\u0006\u001A\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/json/JsonDecoder;", "asJsonDecoder", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/json/JsonEncoder;", "asJsonEncoder", "(Lkotlinx/serialization/encoding/Encoder;)Lkotlinx/serialization/json/JsonEncoder;", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class JsonElementSerializersKt {
    public static final SerialDescriptor access$defer(Function0 function00) {
        return new JsonElementSerializersKt.defer.1(function00);
    }

    public static final void access$verify(Decoder decoder0) {
        JsonElementSerializersKt.asJsonDecoder(decoder0);
    }

    public static final void access$verify(Encoder encoder0) {
        JsonElementSerializersKt.asJsonEncoder(encoder0);
    }

    @NotNull
    public static final JsonDecoder asJsonDecoder(@NotNull Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "<this>");
        JsonDecoder jsonDecoder0 = decoder0 instanceof JsonDecoder ? ((JsonDecoder)decoder0) : null;
        if(jsonDecoder0 == null) {
            throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass(decoder0.getClass()));
        }
        return jsonDecoder0;
    }

    @NotNull
    public static final JsonEncoder asJsonEncoder(@NotNull Encoder encoder0) {
        Intrinsics.checkNotNullParameter(encoder0, "<this>");
        JsonEncoder jsonEncoder0 = encoder0 instanceof JsonEncoder ? ((JsonEncoder)encoder0) : null;
        if(jsonEncoder0 == null) {
            throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass(encoder0.getClass()));
        }
        return jsonEncoder0;
    }
}

