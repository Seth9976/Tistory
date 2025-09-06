package a;

import com.kakao.kandinsky.utils.MatrixValues;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.PrimitiveKind.STRING;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class l2 implements KSerializer {
    public static final l2 a;
    public static final SerialDescriptor b;

    static {
        l2.a = new l2();
        l2.b = SerialDescriptorsKt.PrimitiveSerialDescriptor("MatrixValues", STRING.INSTANCE);
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        return MatrixValues.box-impl(MatrixValues.constructor-impl(ExtensionsKt.toPersistentList(((Iterable)decoder0.decodeSerializableValue(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE)))))));
    }

    @Override  // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return l2.b;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder0, Object object0) {
        ImmutableList immutableList0 = ((MatrixValues)object0).unbox-impl();
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(immutableList0, "value");
        encoder0.encodeSerializableValue(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE)), MatrixValues.box-impl(immutableList0));
    }
}

