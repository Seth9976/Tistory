package kotlinx.serialization.json;

import a5.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.PolymorphicKind.SEALED;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\f\u001A\u00020\u000B2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0013\u001A\u00020\u0012H$¢\u0006\u0004\b\u0015\u0010\u0016R\u001A\u0010\u001C\u001A\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001D"}, d2 = {"Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlin/reflect/KClass;", "baseClass", "<init>", "(Lkotlin/reflect/KClass;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class JsonContentPolymorphicSerializer implements KSerializer {
    public final KClass a;
    public final SerialDescriptor b;

    public JsonContentPolymorphicSerializer(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "baseClass");
        super();
        this.a = kClass0;
        this.b = SerialDescriptorsKt.buildSerialDescriptor$default(("JsonContentPolymorphicSerializer<" + kClass0.getSimpleName() + '>'), SEALED.INSTANCE, new SerialDescriptor[0], null, 8, null);
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final Object deserialize(@NotNull Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        JsonDecoder jsonDecoder0 = JsonElementSerializersKt.asJsonDecoder(decoder0);
        JsonElement jsonElement0 = jsonDecoder0.decodeJsonElement();
        DeserializationStrategy deserializationStrategy0 = this.selectDeserializer(jsonElement0);
        Intrinsics.checkNotNull(deserializationStrategy0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return jsonDecoder0.getJson().decodeFromJsonElement(((KSerializer)deserializationStrategy0), jsonElement0);
    }

    @Override  // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.b;
    }

    @NotNull
    public abstract DeserializationStrategy selectDeserializer(@NotNull JsonElement arg1);

    @Override  // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder0, @NotNull Object object0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(object0, "value");
        SerializersModule serializersModule0 = encoder0.getSerializersModule();
        KClass kClass0 = this.a;
        SerializationStrategy serializationStrategy0 = serializersModule0.getPolymorphic(kClass0, object0);
        if(serializationStrategy0 == null) {
            serializationStrategy0 = SerializersKt.serializerOrNull(Reflection.getOrCreateKotlinClass(object0.getClass()));
            if(serializationStrategy0 == null) {
                KClass kClass1 = Reflection.getOrCreateKotlinClass(object0.getClass());
                String s = kClass1.getSimpleName();
                if(s == null) {
                    s = String.valueOf(kClass1);
                }
                throw new SerializationException(b.o("Class \'", s, "\' is not registered for polymorphic serialization ", "in the scope of \'" + kClass0.getSimpleName() + '\'', ".\nMark the base class as \'sealed\' or register the serializer explicitly."));
            }
        }
        ((KSerializer)serializationStrategy0).serialize(encoder0, object0);
    }
}

