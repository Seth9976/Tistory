package e;

import com.kakao.kandinsky.history.KPhotoKey;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;

public final class v implements GeneratedSerializer {
    public static final v a;
    public static final PluginGeneratedSerialDescriptor b;

    static {
        v v0 = new v();
        v.a = v0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.history.KPhotoKey", v0, 2);
        pluginGeneratedSerialDescriptor0.addElement("uri", false);
        pluginGeneratedSerialDescriptor0.addElement("id", false);
        v.b = pluginGeneratedSerialDescriptor0;
    }

    @Override  // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE);
        return new KSerializer[]{StringSerializer.INSTANCE, kSerializer0};
    }

    @Override  // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder0) {
        int v;
        Long long0;
        String s;
        Intrinsics.checkNotNullParameter(decoder0, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = v.b;
        CompositeDecoder compositeDecoder0 = decoder0.beginStructure(pluginGeneratedSerialDescriptor0);
        if(compositeDecoder0.decodeSequentially()) {
            s = compositeDecoder0.decodeStringElement(pluginGeneratedSerialDescriptor0, 0);
            long0 = (Long)compositeDecoder0.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor0, 1, LongSerializer.INSTANCE, null);
            v = 3;
        }
        else {
            int v1 = 0;
            s = null;
            Long long1 = null;
            boolean z = true;
            while(z) {
                int v2 = compositeDecoder0.decodeElementIndex(pluginGeneratedSerialDescriptor0);
                switch(v2) {
                    case -1: {
                        z = false;
                        break;
                    }
                    case 0: {
                        s = compositeDecoder0.decodeStringElement(pluginGeneratedSerialDescriptor0, 0);
                        v1 |= 1;
                        break;
                    }
                    case 1: {
                        long1 = (Long)compositeDecoder0.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor0, 1, LongSerializer.INSTANCE, long1);
                        v1 |= 2;
                        break;
                    }
                    default: {
                        throw new UnknownFieldException(v2);
                    }
                }
            }
            long0 = long1;
            v = v1;
        }
        compositeDecoder0.endStructure(pluginGeneratedSerialDescriptor0);
        return new KPhotoKey(v, s, long0, null);
    }

    @Override  // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return v.b;
    }

    @Override  // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder0, Object object0) {
        Intrinsics.checkNotNullParameter(encoder0, "encoder");
        Intrinsics.checkNotNullParameter(((KPhotoKey)object0), "value");
        CompositeEncoder compositeEncoder0 = encoder0.beginStructure(v.b);
        KPhotoKey.write$Self$kandinsky_release(((KPhotoKey)object0), compositeEncoder0, v.b);
        compositeEncoder0.endStructure(v.b);
    }

    @Override  // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return DefaultImpls.typeParametersSerializers(this);
    }
}

