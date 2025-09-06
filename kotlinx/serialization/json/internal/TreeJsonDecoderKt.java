package kotlinx.serialization.json.internal;

import jg.d;
import jg.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A1\u0010\u0000\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001A5\u0010\t\u001A\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00032\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\u0004\u001A\u00020\f2\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00010\u0007H\u0000¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"readJson", "T", "json", "Lkotlinx/serialization/json/Json;", "element", "Lkotlinx/serialization/json/JsonElement;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "readPolymorphicJson", "discriminator", "", "Lkotlinx/serialization/json/JsonObject;", "(Lkotlinx/serialization/json/Json;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class TreeJsonDecoderKt {
    @JsonFriendModuleApi
    public static final Object readJson(@NotNull Json json0, @NotNull JsonElement jsonElement0, @NotNull DeserializationStrategy deserializationStrategy0) {
        Intrinsics.checkNotNullParameter(json0, "json");
        Intrinsics.checkNotNullParameter(jsonElement0, "element");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        if(jsonElement0 instanceof JsonObject) {
            return new c(json0, ((JsonObject)jsonElement0), null, null).decodeSerializableValue(deserializationStrategy0);
        }
        if(jsonElement0 instanceof JsonArray) {
            return new f(json0, ((JsonArray)jsonElement0)).decodeSerializableValue(deserializationStrategy0);
        }
        if(!(jsonElement0 instanceof JsonLiteral ? true : Intrinsics.areEqual(jsonElement0, JsonNull.INSTANCE))) {
            throw new NoWhenBranchMatchedException();
        }
        return new d(json0, ((JsonPrimitive)jsonElement0)).decodeSerializableValue(deserializationStrategy0);
    }

    public static final Object readPolymorphicJson(@NotNull Json json0, @NotNull String s, @NotNull JsonObject jsonObject0, @NotNull DeserializationStrategy deserializationStrategy0) {
        Intrinsics.checkNotNullParameter(json0, "<this>");
        Intrinsics.checkNotNullParameter(s, "discriminator");
        Intrinsics.checkNotNullParameter(jsonObject0, "element");
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        c c0 = new c(json0, jsonObject0, s, deserializationStrategy0.getDescriptor());
        Intrinsics.checkNotNullParameter(deserializationStrategy0, "deserializer");
        return PolymorphicKt.decodeSerializableValuePolymorphic(c0, deserializationStrategy0);
    }
}

