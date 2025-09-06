package a;

import com.kakao.kandinsky.core.kdphoto.Decoration;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class b implements KSerializer {
    public static final b a;
    public static final SerialDescriptor b;

    static {
        b.a = new b();
        b.b = BuiltinSerializersKt.ListSerializer(Decoration.Companion.serializer()).getDescriptor();
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder0) {
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        return ExtensionsKt.toPersistentList(((Iterable)decoder0.decodeSerializableValue(BuiltinSerializersKt.ListSerializer(Decoration.Companion.serializer()))));
    }

    @Override  // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b.b;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder0, Object object0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(((PersistentList)object0), "value");
        encoder0.encodeSerializableValue(BuiltinSerializersKt.ListSerializer(Decoration.Companion.serializer()), CollectionsKt___CollectionsKt.toList(((PersistentList)object0)));
    }
}

