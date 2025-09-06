package com.kakao.tistory.domain.revenue.entity;

import androidx.room.a;
import com.kakao.tistory.domain.blog.entity.b;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0016\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BM\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\b\u00A2\u0006\u0004\b\f\u0010\rB_\b\u0011\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\b\u0010\n\u001A\u0004\u0018\u00010\b\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u00A2\u0006\u0004\b\f\u0010\u0012J(\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u0013\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0016H\u00C1\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001DJ\u0010\u0010!\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001DJ\u0010\u0010\"\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b$\u0010#J\u0010\u0010%\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010#JV\u0010&\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\bH\u00C6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010\u001DJ\u0010\u0010)\u001A\u00020\u000EH\u00D6\u0001\u00A2\u0006\u0004\b)\u0010*J\u001A\u0010-\u001A\u00020,2\b\u0010+\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u001DR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u001FR\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u00100\u001A\u0004\b6\u0010\u001DR\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b7\u00100\u001A\u0004\b8\u0010\u001DR\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010#R\u0017\u0010\n\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b<\u0010:\u001A\u0004\b=\u0010#R\u0017\u0010\u000B\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b>\u0010:\u001A\u0004\b?\u0010#\u00A8\u0006B"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;", "", "", "lastUpdateTime", "", "totalEarnings", "currency", "totalEarningsCurrency", "Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;", "day", "week", "month", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "component4", "component5", "()Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;", "component6", "component7", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;)Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLastUpdateTime", "b", "D", "getTotalEarnings", "c", "getCurrency", "d", "getTotalEarningsCurrency", "e", "Lcom/kakao/tistory/domain/revenue/entity/VariationEarning;", "getDay", "f", "getWeek", "g", "getMonth", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class RevenueSummary {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/revenue/entity/RevenueSummary.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer revenueSummary$$serializer0 = new .serializer();
            .serializer.INSTANCE = revenueSummary$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.revenue.entity.RevenueSummary", revenueSummary$$serializer0, 7);
            pluginGeneratedSerialDescriptor0.addElement("lastUpdateTime", true);
            pluginGeneratedSerialDescriptor0.addElement("totalEarnings", true);
            pluginGeneratedSerialDescriptor0.addElement("currency", true);
            pluginGeneratedSerialDescriptor0.addElement("totalEarningsCurrency", true);
            pluginGeneratedSerialDescriptor0.addElement("day", true);
            pluginGeneratedSerialDescriptor0.addElement("week", true);
            pluginGeneratedSerialDescriptor0.addElement("month", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE, DoubleSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE};
        }

        @NotNull
        public RevenueSummary deserialize(@NotNull Decoder decoder0) {
            int v;
            double f1;
            String s5;
            VariationEarning variationEarning4;
            String s4;
            VariationEarning variationEarning3;
            VariationEarning variationEarning2;
            String s3;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            if(compositeDecoder0.decodeSequentially()) {
                String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                double f = compositeDecoder0.decodeDoubleElement(serialDescriptor0, 1);
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                VariationEarning variationEarning0 = (VariationEarning)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, null);
                VariationEarning variationEarning1 = (VariationEarning)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 5, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, null);
                s3 = s;
                variationEarning2 = (VariationEarning)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, null);
                variationEarning3 = variationEarning1;
                s4 = s2;
                variationEarning4 = variationEarning0;
                s5 = s1;
                f1 = f;
                v = 0x7F;
            }
            else {
                double f2 = 0.0;
                String s6 = null;
                VariationEarning variationEarning5 = null;
                String s7 = null;
                String s8 = null;
                VariationEarning variationEarning6 = null;
                int v1 = 0;
                VariationEarning variationEarning7 = null;
                boolean z = true;
                while(z) {
                    int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            v1 |= 1;
                            s6 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                            break;
                        }
                        case 1: {
                            v1 |= 2;
                            f2 = compositeDecoder0.decodeDoubleElement(serialDescriptor0, 1);
                            break;
                        }
                        case 2: {
                            s7 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            s8 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                            v1 |= 8;
                            break;
                        }
                        case 4: {
                            variationEarning6 = (VariationEarning)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, variationEarning6);
                            v1 |= 16;
                            break;
                        }
                        case 5: {
                            variationEarning7 = (VariationEarning)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 5, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, variationEarning7);
                            v1 |= 0x20;
                            break;
                        }
                        case 6: {
                            variationEarning5 = (VariationEarning)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, variationEarning5);
                            v1 |= 0x40;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                s3 = s6;
                variationEarning2 = variationEarning5;
                variationEarning3 = variationEarning7;
                v = v1;
                f1 = f2;
                s5 = s7;
                s4 = s8;
                variationEarning4 = variationEarning6;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new RevenueSummary(v, s3, f1, s5, s4, variationEarning4, variationEarning3, variationEarning2, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull RevenueSummary revenueSummary0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(revenueSummary0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            RevenueSummary.write$Self$domain_release(revenueSummary0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((RevenueSummary)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueSummary;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final String a;
    public final double b;
    public final String c;
    public final String d;
    public final VariationEarning e;
    public final VariationEarning f;
    public final VariationEarning g;

    static {
        RevenueSummary.Companion = new Companion(null);
    }

    public RevenueSummary() {
        this(null, 0.0, null, null, null, null, null, 0x7F, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public RevenueSummary(int v, String s, double f, String s1, String s2, VariationEarning variationEarning0, VariationEarning variationEarning1, VariationEarning variationEarning2, SerializationConstructorMarker serializationConstructorMarker0) {
        this.a = (v & 1) == 0 ? "" : s;
        this.b = (v & 2) == 0 ? 0.0 : f;
        this.c = (v & 4) == 0 ? "" : s1;
        this.d = (v & 8) == 0 ? "" : s2;
        this.e = (v & 16) == 0 ? new VariationEarning(0.0, 0.0, 3, null) : variationEarning0;
        this.f = (v & 0x20) == 0 ? new VariationEarning(0.0, 0.0, 3, null) : variationEarning1;
        this.g = (v & 0x40) == 0 ? new VariationEarning(0.0, 0.0, 3, null) : variationEarning2;
    }

    public RevenueSummary(@NotNull String s, double f, @NotNull String s1, @NotNull String s2, @NotNull VariationEarning variationEarning0, @NotNull VariationEarning variationEarning1, @NotNull VariationEarning variationEarning2) {
        Intrinsics.checkNotNullParameter(s, "lastUpdateTime");
        Intrinsics.checkNotNullParameter(s1, "currency");
        Intrinsics.checkNotNullParameter(s2, "totalEarningsCurrency");
        Intrinsics.checkNotNullParameter(variationEarning0, "day");
        Intrinsics.checkNotNullParameter(variationEarning1, "week");
        Intrinsics.checkNotNullParameter(variationEarning2, "month");
        super();
        this.a = s;
        this.b = f;
        this.c = s1;
        this.d = s2;
        this.e = variationEarning0;
        this.f = variationEarning1;
        this.g = variationEarning2;
    }

    public RevenueSummary(String s, double f, String s1, String s2, VariationEarning variationEarning0, VariationEarning variationEarning1, VariationEarning variationEarning2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? f : 0.0), ((v & 4) == 0 ? s1 : ""), ((v & 8) == 0 ? s2 : ""), ((v & 16) == 0 ? variationEarning0 : new VariationEarning(0.0, 0.0, 3, null)), ((v & 0x20) == 0 ? variationEarning1 : new VariationEarning(0.0, 0.0, 3, null)), ((v & 0x40) == 0 ? variationEarning2 : new VariationEarning(0.0, 0.0, 3, null)));
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final double component2() {
        return this.b;
    }

    @NotNull
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
        return this.d;
    }

    @NotNull
    public final VariationEarning component5() {
        return this.e;
    }

    @NotNull
    public final VariationEarning component6() {
        return this.f;
    }

    @NotNull
    public final VariationEarning component7() {
        return this.g;
    }

    @NotNull
    public final RevenueSummary copy(@NotNull String s, double f, @NotNull String s1, @NotNull String s2, @NotNull VariationEarning variationEarning0, @NotNull VariationEarning variationEarning1, @NotNull VariationEarning variationEarning2) {
        Intrinsics.checkNotNullParameter(s, "lastUpdateTime");
        Intrinsics.checkNotNullParameter(s1, "currency");
        Intrinsics.checkNotNullParameter(s2, "totalEarningsCurrency");
        Intrinsics.checkNotNullParameter(variationEarning0, "day");
        Intrinsics.checkNotNullParameter(variationEarning1, "week");
        Intrinsics.checkNotNullParameter(variationEarning2, "month");
        return new RevenueSummary(s, f, s1, s2, variationEarning0, variationEarning1, variationEarning2);
    }

    public static RevenueSummary copy$default(RevenueSummary revenueSummary0, String s, double f, String s1, String s2, VariationEarning variationEarning0, VariationEarning variationEarning1, VariationEarning variationEarning2, int v, Object object0) {
        String s3 = (v & 1) == 0 ? s : revenueSummary0.a;
        double f1 = (v & 2) == 0 ? f : revenueSummary0.b;
        String s4 = (v & 4) == 0 ? s1 : revenueSummary0.c;
        String s5 = (v & 8) == 0 ? s2 : revenueSummary0.d;
        VariationEarning variationEarning3 = (v & 16) == 0 ? variationEarning0 : revenueSummary0.e;
        VariationEarning variationEarning4 = (v & 0x20) == 0 ? variationEarning1 : revenueSummary0.f;
        return (v & 0x40) == 0 ? revenueSummary0.copy(s3, f1, s4, s5, variationEarning3, variationEarning4, variationEarning2) : revenueSummary0.copy(s3, f1, s4, s5, variationEarning3, variationEarning4, revenueSummary0.g);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RevenueSummary)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((RevenueSummary)object0).a)) {
            return false;
        }
        if(Double.compare(this.b, ((RevenueSummary)object0).b) != 0) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((RevenueSummary)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((RevenueSummary)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((RevenueSummary)object0).e)) {
            return false;
        }
        return Intrinsics.areEqual(this.f, ((RevenueSummary)object0).f) ? Intrinsics.areEqual(this.g, ((RevenueSummary)object0).g) : false;
    }

    @NotNull
    public final String getCurrency() [...] // 潜在的解密器

    @NotNull
    public final VariationEarning getDay() {
        return this.e;
    }

    @NotNull
    public final String getLastUpdateTime() [...] // 潜在的解密器

    @NotNull
    public final VariationEarning getMonth() {
        return this.g;
    }

    public final double getTotalEarnings() {
        return this.b;
    }

    @NotNull
    public final String getTotalEarningsCurrency() [...] // 潜在的解密器

    @NotNull
    public final VariationEarning getWeek() {
        return this.f;
    }

    @Override
    public int hashCode() {
        return this.g.hashCode() + (this.f.hashCode() + (this.e.hashCode() + b.a(this.d, b.a(this.c, (Double.hashCode(this.b) + this.a.hashCode() * 0x1F) * 0x1F, 0x1F), 0x1F)) * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RevenueSummary(lastUpdateTime=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", totalEarnings=");
        stringBuilder0.append(this.b);
        a.w(stringBuilder0, ", currency=", this.c, ", totalEarningsCurrency=", this.d);
        stringBuilder0.append(", day=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", week=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", month=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @JvmStatic
    public static final void write$Self$domain_release(RevenueSummary revenueSummary0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(revenueSummary0.a, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, revenueSummary0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || Double.compare(revenueSummary0.b, 0.0) != 0) {
            compositeEncoder0.encodeDoubleElement(serialDescriptor0, 1, revenueSummary0.b);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(revenueSummary0.c, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 2, revenueSummary0.c);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(revenueSummary0.d, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 3, revenueSummary0.d);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 4, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, revenueSummary0.e);
        }
        else {
            VariationEarning variationEarning0 = new VariationEarning(0.0, 0.0, 3, null);
            if(!Intrinsics.areEqual(revenueSummary0.e, variationEarning0)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 4, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, revenueSummary0.e);
            }
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 5, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, revenueSummary0.f);
        }
        else {
            VariationEarning variationEarning1 = new VariationEarning(0.0, 0.0, 3, null);
            if(!Intrinsics.areEqual(revenueSummary0.f, variationEarning1)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 5, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, revenueSummary0.f);
            }
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, revenueSummary0.g);
        }
        else {
            VariationEarning variationEarning2 = new VariationEarning(0.0, 0.0, 3, null);
            if(!Intrinsics.areEqual(revenueSummary0.g, variationEarning2)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.revenue.entity.VariationEarning..serializer.INSTANCE, revenueSummary0.g);
            }
        }
    }
}

