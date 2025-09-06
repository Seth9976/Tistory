package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH&R\u0012\u0010\u0003\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u000B"}, d2 = {"Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "encodeJsonElement", "", "element", "Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface JsonEncoder extends CompositeEncoder, Encoder {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @NotNull
        public static CompositeEncoder beginCollection(@NotNull JsonEncoder jsonEncoder0, @NotNull SerialDescriptor serialDescriptor0, int v) {
            Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
            return kotlinx.serialization.encoding.Encoder.DefaultImpls.beginCollection(jsonEncoder0, serialDescriptor0, v);
        }

        @ExperimentalSerializationApi
        public static void encodeNotNullMark(@NotNull JsonEncoder jsonEncoder0) {
        }

        @ExperimentalSerializationApi
        public static void encodeNullableSerializableValue(@NotNull JsonEncoder jsonEncoder0, @NotNull SerializationStrategy serializationStrategy0, @Nullable Object object0) {
            Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
            kotlinx.serialization.encoding.Encoder.DefaultImpls.encodeNullableSerializableValue(jsonEncoder0, serializationStrategy0, object0);
        }

        public static void encodeSerializableValue(@NotNull JsonEncoder jsonEncoder0, @NotNull SerializationStrategy serializationStrategy0, Object object0) {
            Intrinsics.checkNotNullParameter(serializationStrategy0, "serializer");
            kotlinx.serialization.encoding.Encoder.DefaultImpls.encodeSerializableValue(jsonEncoder0, serializationStrategy0, object0);
        }

        @ExperimentalSerializationApi
        public static boolean shouldEncodeElementDefault(@NotNull JsonEncoder jsonEncoder0, @NotNull SerialDescriptor serialDescriptor0, int v) {
            Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
            return kotlinx.serialization.encoding.CompositeEncoder.DefaultImpls.shouldEncodeElementDefault(jsonEncoder0, serialDescriptor0, v);
        }
    }

    void encodeJsonElement(@NotNull JsonElement arg1);

    @NotNull
    Json getJson();
}

