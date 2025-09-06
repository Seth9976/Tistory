package com.kakao.kandinsky.launcher;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.x;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001F\u0012\u0016\b\u0002\u0010\u0005\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0016\u0010\u0005\u001A\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0014\u001A\u00020\u00112\u0006\u0010\r\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000FHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001E\u0010\u0015\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0017\u001A\u00020\u00002\u0016\b\u0002\u0010\u0005\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\bHÖ\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010\u001F\u001A\u00020\u001E2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001F\u0010 R%\u0010\u0005\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lcom/kakao/kandinsky/launcher/KandinskyOutput;", "", "", "", "Lcom/kakao/kandinsky/launcher/KandinskyOutputItem;", "output", "<init>", "(Ljava/util/Map;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kandinsky_release", "(Lcom/kakao/kandinsky/launcher/KandinskyOutput;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/kakao/kandinsky/launcher/KandinskyOutput;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "getOutput", "Companion", "$serializer", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class KandinskyOutput {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/launcher/KandinskyOutput.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/launcher/KandinskyOutput;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/launcher/KandinskyOutput;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/launcher/KandinskyOutput;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public static final int $stable;
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer kandinskyOutput$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
            .serializer.INSTANCE = kandinskyOutput$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.launcher.KandinskyOutput", kandinskyOutput$$serializer0, 1);
            pluginGeneratedSerialDescriptor0.addElement("output", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            return new KSerializer[]{KandinskyOutput.b[0]};
        }

        public KandinskyOutput deserialize(Decoder decoder0) {
            Map map0;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = KandinskyOutput.b;
            int v = 1;
            if(compositeDecoder0.decodeSequentially()) {
                map0 = (Map)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 0, arr_kSerializer[0], null);
            }
            else {
                int v1 = 0;
                Map map1 = null;
                boolean z = true;
                while(z) {
                    int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            map1 = (Map)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 0, arr_kSerializer[0], map1);
                            v1 = 1;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                map0 = map1;
                v = v1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new KandinskyOutput(v, map0, null);
        }

        @Override  // kotlinx.serialization.DeserializationStrategy
        public Object deserialize(Decoder decoder0) {
            return this.deserialize(decoder0);
        }

        @Override  // kotlinx.serialization.KSerializer
        public SerialDescriptor getDescriptor() {
            return .serializer.a;
        }

        public void serialize(Encoder encoder0, KandinskyOutput kandinskyOutput0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(kandinskyOutput0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            KandinskyOutput.write$Self$kandinsky_release(kandinskyOutput0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((KandinskyOutput)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/launcher/KandinskyOutput$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/launcher/KandinskyOutput;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    public static final int $stable;
    public static final Companion Companion;
    public final Map a;
    public static final KSerializer[] b;

    static {
        KandinskyOutput.Companion = new Companion(null);
        KandinskyOutput.$stable = 8;
        KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(com.kakao.kandinsky.launcher.KandinskyOutputItem..serializer.INSTANCE);
        KandinskyOutput.b = new KSerializer[]{new LinkedHashMapSerializer(StringSerializer.INSTANCE, kSerializer0)};
    }

    public KandinskyOutput() {
        this(null, 1, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public KandinskyOutput(int v, Map map0, SerializationConstructorMarker serializationConstructorMarker0) {
        if((v & 1) == 0) {
            this.a = x.emptyMap();
            return;
        }
        this.a = map0;
    }

    public KandinskyOutput(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "output");
        super();
        this.a = map0;
    }

    public KandinskyOutput(Map map0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            map0 = x.emptyMap();
        }
        this(map0);
    }

    public final Map component1() {
        return this.a;
    }

    public final KandinskyOutput copy(Map map0) {
        Intrinsics.checkNotNullParameter(map0, "output");
        return new KandinskyOutput(map0);
    }

    public static KandinskyOutput copy$default(KandinskyOutput kandinskyOutput0, Map map0, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = kandinskyOutput0.a;
        }
        return kandinskyOutput0.copy(map0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof KandinskyOutput ? Intrinsics.areEqual(this.a, ((KandinskyOutput)object0).a) : false;
    }

    public final Map getOutput() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return "KandinskyOutput(output=" + this.a + ")";
    }

    @JvmStatic
    public static final void write$Self$kandinsky_release(KandinskyOutput kandinskyOutput0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 0, KandinskyOutput.b[0], kandinskyOutput0.a);
        }
        else {
            Map map0 = x.emptyMap();
            if(!Intrinsics.areEqual(kandinskyOutput0.a, map0)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 0, KandinskyOutput.b[0], kandinskyOutput0.a);
            }
        }
    }
}

