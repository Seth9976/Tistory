package com.kakao.tistory.domain.revenue.entity;

import com.kakao.tistory.domain.blog.entity.a;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B%\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0011\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ(\u0010\u0015\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001A\u0010\u0019J.\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001E\u001A\u00020\u001DHÖ\u0001¢\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u001A\u0010#\u001A\u00020\"2\b\u0010!\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0017R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u0019R\u0017\u0010\u0006\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010)\u001A\u0004\b,\u0010\u0019¨\u0006/"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/SupportInfo;", "", "", "earnings", "", "supporterCount", "supportCount", "<init>", "(FII)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/revenue/entity/SupportInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()F", "component2", "()I", "component3", "copy", "(FII)Lcom/kakao/tistory/domain/revenue/entity/SupportInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getEarnings", "b", "I", "getSupporterCount", "c", "getSupportCount", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class SupportInfo {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/revenue/entity/SupportInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/SupportInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/revenue/entity/SupportInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/revenue/entity/SupportInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer supportInfo$$serializer0 = new .serializer();
            .serializer.INSTANCE = supportInfo$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.revenue.entity.SupportInfo", supportInfo$$serializer0, 3);
            pluginGeneratedSerialDescriptor0.addElement("earnings", true);
            pluginGeneratedSerialDescriptor0.addElement("supporterCount", true);
            pluginGeneratedSerialDescriptor0.addElement("supportCount", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{FloatSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE};
        }

        @NotNull
        public SupportInfo deserialize(@NotNull Decoder decoder0) {
            int v3;
            int v2;
            int v1;
            float f1;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            if(compositeDecoder0.decodeSequentially()) {
                float f = compositeDecoder0.decodeFloatElement(serialDescriptor0, 0);
                int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 1);
                f1 = f;
                v1 = compositeDecoder0.decodeIntElement(serialDescriptor0, 2);
                v2 = v;
                v3 = 7;
            }
            else {
                float f2 = 0.0f;
                int v4 = 0;
                int v5 = 0;
                int v6 = 0;
                boolean z = true;
                while(z) {
                    int v7 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v7) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            f2 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 0);
                            v6 |= 1;
                            break;
                        }
                        case 1: {
                            v5 = compositeDecoder0.decodeIntElement(serialDescriptor0, 1);
                            v6 |= 2;
                            break;
                        }
                        case 2: {
                            v4 = compositeDecoder0.decodeIntElement(serialDescriptor0, 2);
                            v6 |= 4;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v7);
                        }
                    }
                }
                f1 = f2;
                v1 = v4;
                v2 = v5;
                v3 = v6;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new SupportInfo(v3, f1, v2, v1, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull SupportInfo supportInfo0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(supportInfo0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            SupportInfo.write$Self$domain_release(supportInfo0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((SupportInfo)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/SupportInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/SupportInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final float a;
    public final int b;
    public final int c;

    static {
        SupportInfo.Companion = new Companion(null);
    }

    public SupportInfo() {
        this(0.0f, 0, 0, 7, null);
    }

    public SupportInfo(float f, int v, int v1) {
        this.a = f;
        this.b = v;
        this.c = v1;
    }

    public SupportInfo(float f, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            f = 0.0f;
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        this(f, v, v1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public SupportInfo(int v, float f, int v1, int v2, SerializationConstructorMarker serializationConstructorMarker0) {
        if((v & 1) == 0) {
            f = 0.0f;
        }
        this.a = f;
        this.b = (v & 2) == 0 ? 0 : v1;
        if((v & 4) == 0) {
            this.c = 0;
            return;
        }
        this.c = v2;
    }

    public final float component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    @NotNull
    public final SupportInfo copy(float f, int v, int v1) {
        return new SupportInfo(f, v, v1);
    }

    public static SupportInfo copy$default(SupportInfo supportInfo0, float f, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            f = supportInfo0.a;
        }
        if((v2 & 2) != 0) {
            v = supportInfo0.b;
        }
        if((v2 & 4) != 0) {
            v1 = supportInfo0.c;
        }
        return supportInfo0.copy(f, v, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SupportInfo)) {
            return false;
        }
        if(Float.compare(this.a, ((SupportInfo)object0).a) != 0) {
            return false;
        }
        return this.b == ((SupportInfo)object0).b ? this.c == ((SupportInfo)object0).c : false;
    }

    public final float getEarnings() {
        return this.a;
    }

    public final int getSupportCount() {
        return this.c;
    }

    public final int getSupporterCount() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.c + a.a(this.b, Float.hashCode(this.a) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SupportInfo(earnings=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", supporterCount=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", supportCount=");
        return wb.a.c(this.c, ")", stringBuilder0);
    }

    @JvmStatic
    public static final void write$Self$domain_release(SupportInfo supportInfo0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || Float.compare(supportInfo0.a, 0.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 0, supportInfo0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || supportInfo0.b != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 1, supportInfo0.b);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || supportInfo0.c != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 2, supportInfo0.c);
        }
    }
}

