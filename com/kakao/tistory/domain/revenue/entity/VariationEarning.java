package com.kakao.tistory.domain.revenue.entity;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0011\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000BJ(\u0010\u0014\u001A\u00020\u00112\u0006\u0010\f\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000FHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u001AHÖ\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010!\u001A\u00020 2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0016R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001A\u0004\b\'\u0010\u0016¨\u0006*"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;", "", "", "value", "variation", "<init>", "(DD)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()D", "component2", "copy", "(DD)Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "getValue", "b", "getVariation", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class VariationEarning {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/revenue/entity/VariationEarning.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer variationEarning$$serializer0 = new .serializer();
            .serializer.INSTANCE = variationEarning$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.revenue.entity.VariationEarning", variationEarning$$serializer0, 2);
            pluginGeneratedSerialDescriptor0.addElement("value", true);
            pluginGeneratedSerialDescriptor0.addElement("variation", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{DoubleSerializer.INSTANCE, DoubleSerializer.INSTANCE};
        }

        @NotNull
        public VariationEarning deserialize(@NotNull Decoder decoder0) {
            int v;
            double f2;
            double f1;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            if(compositeDecoder0.decodeSequentially()) {
                double f = compositeDecoder0.decodeDoubleElement(serialDescriptor0, 0);
                f1 = compositeDecoder0.decodeDoubleElement(serialDescriptor0, 1);
                f2 = f;
                v = 3;
            }
            else {
                double f3 = 0.0;
                int v1 = 0;
                double f4 = 0.0;
                boolean z = true;
                while(z) {
                    int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            f4 = compositeDecoder0.decodeDoubleElement(serialDescriptor0, 0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            f3 = compositeDecoder0.decodeDoubleElement(serialDescriptor0, 1);
                            v1 |= 2;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                v = v1;
                f1 = f3;
                f2 = f4;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new VariationEarning(v, f2, f1, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull VariationEarning variationEarning0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(variationEarning0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            VariationEarning.write$Self$domain_release(variationEarning0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((VariationEarning)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/VariationEarning$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final double a;
    public final double b;

    static {
        VariationEarning.Companion = new Companion(null);
    }

    public VariationEarning() {
        this(0.0, 0.0, 3, null);
    }

    public VariationEarning(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    public VariationEarning(double f, double f1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            f = 0.0;
        }
        if((v & 2) != 0) {
            f1 = 0.0;
        }
        this(f, f1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public VariationEarning(int v, double f, double f1, SerializationConstructorMarker serializationConstructorMarker0) {
        this.a = (v & 1) == 0 ? 0.0 : f;
        if((v & 2) == 0) {
            this.b = 0.0;
            return;
        }
        this.b = f1;
    }

    public final double component1() {
        return this.a;
    }

    public final double component2() {
        return this.b;
    }

    @NotNull
    public final VariationEarning copy(double f, double f1) {
        return new VariationEarning(f, f1);
    }

    public static VariationEarning copy$default(VariationEarning variationEarning0, double f, double f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = variationEarning0.a;
        }
        if((v & 2) != 0) {
            f1 = variationEarning0.b;
        }
        return variationEarning0.copy(f, f1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof VariationEarning)) {
            return false;
        }
        return Double.compare(this.a, ((VariationEarning)object0).a) == 0 ? Double.compare(this.b, ((VariationEarning)object0).b) == 0 : false;
    }

    public final double getValue() {
        return this.a;
    }

    public final double getVariation() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(this.b) + Double.hashCode(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "VariationEarning(value=" + this.a + ", variation=" + this.b + ")";
    }

    @JvmStatic
    public static final void write$Self$domain_release(VariationEarning variationEarning0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || Double.compare(variationEarning0.a, 0.0) != 0) {
            compositeEncoder0.encodeDoubleElement(serialDescriptor0, 0, variationEarning0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || Double.compare(variationEarning0.b, 0.0) != 0) {
            compositeEncoder0.encodeDoubleElement(serialDescriptor0, 1, variationEarning0.b);
        }
    }
}

