package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A3\u0010\b\u001A\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001A\u00020\u00012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "", "source", "Lkotlinx/serialization/json/JsonElement;", "decodeStringToJsonTree", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class StreamingJsonDecoderKt {
    @JsonFriendModuleApi
    @NotNull
    public static final JsonElement decodeStringToJsonTree(@NotNull Json json0, @NotNull DeserializationStrategy deserializationStrategy0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        Intrinsics.checkNotNullParameter(s, "source");
        StringJsonLexer stringJsonLexer0 = new StringJsonLexer(s);
        SerialDescriptor serialDescriptor0 = deserializationStrategy0.getDescriptor();
        JsonElement jsonElement0 = new StreamingJsonDecoder(json0, WriteMode.OBJ, stringJsonLexer0, serialDescriptor0, null).decodeJsonElement();
        stringJsonLexer0.expectEof();
        return jsonElement0;
    }
}

