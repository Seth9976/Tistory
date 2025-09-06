package kotlinx.serialization.json;

import ig.c;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind.SEALED;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u0012\u001A\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/json/JsonElementSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@PublishedApi
public final class JsonElementSerializer implements KSerializer {
    @NotNull
    public static final JsonElementSerializer INSTANCE;
    public static final SerialDescriptor a;

    static {
        JsonElementSerializer.INSTANCE = new JsonElementSerializer();  // 初始化器: Ljava/lang/Object;-><init>()V
        JsonElementSerializer.a = SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.json.JsonElement", SEALED.INSTANCE, new SerialDescriptor[0], c.x);
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(Decoder decoder0) {
        return this.deserialize(decoder0);
    }

    @NotNull
    public JsonElement deserialize(@NotNull Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        return JsonElementSerializersKt.asJsonDecoder(decoder0).decodeJsonElement();
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return JsonElementSerializer.a;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder0, Object object0) {
        this.serialize(encoder0, ((JsonElement)object0));
    }

    public void serialize(@NotNull Encoder encoder0, @NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(jsonElement0, "value");
        JsonElementSerializersKt.access$verify(encoder0);
        if(jsonElement0 instanceof JsonPrimitive) {
            encoder0.encodeSerializableValue(JsonPrimitiveSerializer.INSTANCE, jsonElement0);
            return;
        }
        if(jsonElement0 instanceof JsonObject) {
            encoder0.encodeSerializableValue(JsonObjectSerializer.INSTANCE, jsonElement0);
            return;
        }
        if(jsonElement0 instanceof JsonArray) {
            encoder0.encodeSerializableValue(JsonArraySerializer.INSTANCE, jsonElement0);
        }
    }
}

