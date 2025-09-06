package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001D\u0010\u000B\u001A\u00020\n2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00028\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u000F\u001A\u00028\u00002\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0013\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0011H\u0014¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0019\u001A\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"Lkotlinx/serialization/json/JsonTransformingSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "tSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "transformDeserialize", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;", "transformSerialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class JsonTransformingSerializer implements KSerializer {
    public final KSerializer a;

    public JsonTransformingSerializer(@NotNull KSerializer kSerializer0) {
        Intrinsics.checkNotNullParameter(kSerializer0, "tSerializer");
        super();
        this.a = kSerializer0;
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final Object deserialize(@NotNull Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        JsonDecoder jsonDecoder0 = JsonElementSerializersKt.asJsonDecoder(decoder0);
        JsonElement jsonElement0 = jsonDecoder0.decodeJsonElement();
        Json json0 = jsonDecoder0.getJson();
        JsonElement jsonElement1 = this.transformDeserialize(jsonElement0);
        return json0.decodeFromJsonElement(this.a, jsonElement1);
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(object0, "value");
        JsonEncoder jsonEncoder0 = JsonElementSerializersKt.asJsonEncoder(encoder0);
        jsonEncoder0.encodeJsonElement(this.transformSerialize(TreeJsonEncoderKt.writeJson(jsonEncoder0.getJson(), object0, this.a)));
    }

    @NotNull
    public JsonElement transformDeserialize(@NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "element");
        return jsonElement0;
    }

    @NotNull
    public JsonElement transformSerialize(@NotNull JsonElement jsonElement0) {
        Intrinsics.checkNotNullParameter(jsonElement0, "element");
        return jsonElement0;
    }
}

