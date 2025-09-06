package com.kakao.kandinsky.core.kdphoto;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B+\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0007\u0010\bBE\b\u0011\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0014\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u000E\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u00C1\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001C\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001AJ:\u0010\u001C\u001A\u00020\u00002\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003H\u00C6\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0003H\u00D6\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001AJ\u0010\u0010\u001F\u001A\u00020\tH\u00D6\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u001A\u0010#\u001A\u00020\"2\b\u0010!\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b#\u0010$R#\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0018R\u0017\u0010\u0005\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u001AR\u0017\u0010\u0006\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b+\u0010)\u001A\u0004\b,\u0010\u001A\u00A8\u0006/"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/FilterAdjustment;", "", "", "", "params", "adjustmentId", "module", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kdphoto_release", "(Lcom/kakao/kandinsky/core/kdphoto/FilterAdjustment;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/kandinsky/core/kdphoto/FilterAdjustment;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "getParams", "b", "Ljava/lang/String;", "getAdjustmentId", "c", "getModule", "Companion", "$serializer", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class FilterAdjustment {
    @StabilityInferred(parameters = 1)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/core/kdphoto/FilterAdjustment.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/FilterAdjustment;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/core/kdphoto/FilterAdjustment;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/core/kdphoto/FilterAdjustment;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public static final int $stable;
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer filterAdjustment$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
            .serializer.INSTANCE = filterAdjustment$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.core.kdphoto.FilterAdjustment", filterAdjustment$$serializer0, 3);
            pluginGeneratedSerialDescriptor0.addElement("params", false);
            pluginGeneratedSerialDescriptor0.addElement("adjustmentId", false);
            pluginGeneratedSerialDescriptor0.addElement("module", false);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{FilterAdjustment.d[0], StringSerializer.INSTANCE, StringSerializer.INSTANCE};
        }

        @NotNull
        public FilterAdjustment deserialize(@NotNull Decoder decoder0) {
            int v;
            String s1;
            String s;
            Map map1;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = FilterAdjustment.d;
            Map map0 = null;
            if(compositeDecoder0.decodeSequentially()) {
                map1 = (Map)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 0, arr_kSerializer[0], null);
                s = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                v = 7;
            }
            else {
                int v1 = 0;
                String s2 = null;
                String s3 = null;
                boolean z = true;
                while(z) {
                    int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            map0 = (Map)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 0, arr_kSerializer[0], map0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            s3 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                            v1 |= 4;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                v = v1;
                map1 = map0;
                s = s2;
                s1 = s3;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new FilterAdjustment(v, map1, s, s1, null);
        }

        @Override  // kotlinx.serialization.DeserializationStrategy
        public Object deserialize(Decoder decoder0) {
            return this.deserialize(decoder0);
        }

        @Override  // kotlinx.serialization.KSerializer
        @NotNull
        public SerialDescriptor getDescriptor() {
            return .serializer.a;
        }

        public void serialize(@NotNull Encoder encoder0, @NotNull FilterAdjustment filterAdjustment0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(filterAdjustment0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            FilterAdjustment.write$Self$kdphoto_release(filterAdjustment0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((FilterAdjustment)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/FilterAdjustment$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/FilterAdjustment;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Map a;
    public final String b;
    public final String c;
    public static final KSerializer[] d;

    static {
        FilterAdjustment.Companion = new Companion(null);
        FilterAdjustment.$stable = 8;
        FilterAdjustment.d = new KSerializer[]{new LinkedHashMapSerializer(StringSerializer.INSTANCE, StringSerializer.INSTANCE), null, null};
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public FilterAdjustment(int v, Map map0, String s, String s1, SerializationConstructorMarker serializationConstructorMarker0) {
        if(7 != (v & 7)) {
            PluginExceptionsKt.throwMissingFieldException(v, 7, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = map0;
        this.b = s;
        this.c = s1;
    }

    public FilterAdjustment(@NotNull Map map0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(map0, "params");
        Intrinsics.checkNotNullParameter(s, "adjustmentId");
        Intrinsics.checkNotNullParameter(s1, "module");
        super();
        this.a = map0;
        this.b = s;
        this.c = s1;
    }

    @NotNull
    public final Map component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final FilterAdjustment copy(@NotNull Map map0, @NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(map0, "params");
        Intrinsics.checkNotNullParameter(s, "adjustmentId");
        Intrinsics.checkNotNullParameter(s1, "module");
        return new FilterAdjustment(map0, s, s1);
    }

    public static FilterAdjustment copy$default(FilterAdjustment filterAdjustment0, Map map0, String s, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            map0 = filterAdjustment0.a;
        }
        if((v & 2) != 0) {
            s = filterAdjustment0.b;
        }
        if((v & 4) != 0) {
            s1 = filterAdjustment0.c;
        }
        return filterAdjustment0.copy(map0, s, s1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FilterAdjustment)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((FilterAdjustment)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((FilterAdjustment)object0).b) ? Intrinsics.areEqual(this.c, ((FilterAdjustment)object0).c) : false;
    }

    @NotNull
    public final String getAdjustmentId() {
        return this.b;
    }

    @NotNull
    public final String getModule() {
        return this.c;
    }

    @NotNull
    public final Map getParams() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + q.c(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FilterAdjustment(params=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", adjustmentId=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", module=");
        return a.o(stringBuilder0, this.c, ")");
    }

    @JvmStatic
    public static final void write$Self$kdphoto_release(FilterAdjustment filterAdjustment0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        compositeEncoder0.encodeSerializableElement(serialDescriptor0, 0, FilterAdjustment.d[0], filterAdjustment0.a);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 1, filterAdjustment0.b);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 2, filterAdjustment0.c);
    }
}

