package ig;

import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.UStringsKt;
import kotlin.text.n;
import kotlin.text.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.PrimitiveKind.STRING;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializersKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.internal.JsonExceptionsKt;

public final class e implements KSerializer {
    public static final e a;
    public static final SerialDescriptor b;

    static {
        e.a = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        e.b = SerialDescriptorsKt.PrimitiveSerialDescriptor("kotlinx.serialization.json.JsonLiteral", STRING.INSTANCE);
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        JsonElement jsonElement0 = JsonElementSerializersKt.asJsonDecoder(decoder0).decodeJsonElement();
        if(!(jsonElement0 instanceof JsonLiteral)) {
            throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(jsonElement0.getClass()), jsonElement0.toString());
        }
        return (JsonLiteral)jsonElement0;
    }

    @Override  // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return e.b;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder0, Object object0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(((JsonLiteral)object0), "value");
        JsonElementSerializersKt.access$verify(encoder0);
        if(((JsonLiteral)object0).isString()) {
            encoder0.encodeString(((JsonLiteral)object0).getContent());
            return;
        }
        if(((JsonLiteral)object0).getCoerceToInlineType$kotlinx_serialization_json() != null) {
            encoder0.encodeInline(((JsonLiteral)object0).getCoerceToInlineType$kotlinx_serialization_json()).encodeString(((JsonLiteral)object0).getContent());
            return;
        }
        Long long0 = o.toLongOrNull(((JsonLiteral)object0).getContent());
        if(long0 != null) {
            encoder0.encodeLong(long0.longValue());
            return;
        }
        ULong uLong0 = UStringsKt.toULongOrNull(((JsonLiteral)object0).getContent());
        if(uLong0 != null) {
            encoder0.encodeInline(BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor()).encodeLong(uLong0.unbox-impl());
            return;
        }
        Double double0 = n.toDoubleOrNull(((JsonLiteral)object0).getContent());
        if(double0 != null) {
            encoder0.encodeDouble(double0.doubleValue());
            return;
        }
        Boolean boolean0 = StringsKt__StringsKt.toBooleanStrictOrNull(((JsonLiteral)object0).getContent());
        if(boolean0 != null) {
            encoder0.encodeBoolean(boolean0.booleanValue());
            return;
        }
        encoder0.encodeString(((JsonLiteral)object0).getContent());
    }
}

