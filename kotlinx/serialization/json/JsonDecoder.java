package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0007\u001A\u00020\bH&R\u0012\u0010\u0003\u001A\u00020\u0004X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/encoding/Decoder;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "decodeJsonElement", "Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface JsonDecoder extends CompositeDecoder, Decoder {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static int decodeCollectionSize(@NotNull JsonDecoder jsonDecoder0, @NotNull SerialDescriptor serialDescriptor0) {
            Intrinsics.checkNotNullParameter(serialDescriptor0, "descriptor");
            return kotlinx.serialization.encoding.CompositeDecoder.DefaultImpls.decodeCollectionSize(jsonDecoder0, serialDescriptor0);
        }

        @ExperimentalSerializationApi
        @Nullable
        public static Object decodeNullableSerializableValue(@NotNull JsonDecoder jsonDecoder0, @NotNull DeserializationStrategy deserializationStrategy0) {
            Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
            return kotlinx.serialization.encoding.Decoder.DefaultImpls.decodeNullableSerializableValue(jsonDecoder0, deserializationStrategy0);
        }

        @ExperimentalSerializationApi
        public static boolean decodeSequentially(@NotNull JsonDecoder jsonDecoder0) {
            return false;
        }

        public static Object decodeSerializableValue(@NotNull JsonDecoder jsonDecoder0, @NotNull DeserializationStrategy deserializationStrategy0) {
            Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
            return kotlinx.serialization.encoding.Decoder.DefaultImpls.decodeSerializableValue(jsonDecoder0, deserializationStrategy0);
        }
    }

    @NotNull
    JsonElement decodeJsonElement();

    @NotNull
    Json getJson();
}

