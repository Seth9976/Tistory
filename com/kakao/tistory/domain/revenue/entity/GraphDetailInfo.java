package com.kakao.tistory.domain.revenue.entity;

import com.kakao.tistory.domain.blog.entity.a;
import com.kakao.tistory.domain.blog.entity.b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u000B\n\u0002\b\"\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSB\u007F\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\u0004\u0012\b\b\u0002\u0010\n\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0011B\u0087\u0001\b\u0011\u0012\u0006\u0010\u0012\u001A\u00020\u0006\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000E\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000F\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u00A2\u0006\u0004\b\u0010\u0010\u0015J(\u0010\u001E\u001A\u00020\u001B2\u0006\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u0019H\u00C1\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010$J\u0010\u0010&\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\"J\u0010\u0010\'\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010\"J\u0012\u0010(\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010)J\u0012\u0010*\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010)J\u0012\u0010+\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b+\u0010)J\u0012\u0010,\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010)J\u0012\u0010-\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010)J\u0088\u0001\u0010.\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\u00042\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b.\u0010/J\u0010\u00100\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b0\u0010\"J\u0010\u00101\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b1\u0010$J\u001A\u00104\u001A\u0002032\b\u00102\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u0010 R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010\"R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010$R\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b?\u0010=\u001A\u0004\b@\u0010$R\u0017\u0010\t\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bA\u0010:\u001A\u0004\bB\u0010\"R\u0017\u0010\n\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bC\u0010:\u001A\u0004\bD\u0010\"R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010)R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bH\u0010F\u001A\u0004\bI\u0010)R\u0019\u0010\r\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bJ\u0010F\u001A\u0004\bK\u0010)R\"\u0010\u000E\u001A\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\bL\u0010F\u0012\u0004\bN\u0010O\u001A\u0004\bM\u0010)R\"\u0010\u000F\u001A\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\bP\u0010F\u0012\u0004\bR\u0010O\u001A\u0004\bQ\u0010)\u00A8\u0006U"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;", "", "", "earnings", "", "currency", "", "impression", "clicks", "startDate", "endDate", "rpm", "pageRpm", "pageCtr", "eCpm", "vCpm", "<init>", "(FLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()F", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "component5", "component6", "component7", "()Ljava/lang/Float;", "component8", "component9", "component10", "component11", "copy", "(FLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getEarnings", "b", "Ljava/lang/String;", "getCurrency", "c", "I", "getImpression", "d", "getClicks", "e", "getStartDate", "f", "getEndDate", "g", "Ljava/lang/Float;", "getRpm", "h", "getPageRpm", "i", "getPageCtr", "j", "getECpm", "getECpm$annotations", "()V", "k", "getVCpm", "getVCpm$annotations", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class GraphDetailInfo {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/revenue/entity/GraphDetailInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer graphDetailInfo$$serializer0 = new .serializer();
            .serializer.INSTANCE = graphDetailInfo$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.revenue.entity.GraphDetailInfo", graphDetailInfo$$serializer0, 11);
            pluginGeneratedSerialDescriptor0.addElement("earnings", true);
            pluginGeneratedSerialDescriptor0.addElement("currency", true);
            pluginGeneratedSerialDescriptor0.addElement("impression", true);
            pluginGeneratedSerialDescriptor0.addElement("clicks", true);
            pluginGeneratedSerialDescriptor0.addElement("startDate", true);
            pluginGeneratedSerialDescriptor0.addElement("endDate", true);
            pluginGeneratedSerialDescriptor0.addElement("rpm", true);
            pluginGeneratedSerialDescriptor0.addElement("pageRpm", true);
            pluginGeneratedSerialDescriptor0.addElement("pageCtr", true);
            pluginGeneratedSerialDescriptor0.addElement("ecpm", true);
            pluginGeneratedSerialDescriptor0.addElement("vcpm", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE);
            KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE);
            KSerializer kSerializer2 = BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE);
            KSerializer kSerializer3 = BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE);
            KSerializer kSerializer4 = BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE);
            return new KSerializer[]{FloatSerializer.INSTANCE, StringSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer0, kSerializer1, kSerializer2, kSerializer3, kSerializer4};
        }

        @NotNull
        public GraphDetailInfo deserialize(@NotNull Decoder decoder0) {
            int v5;
            String s5;
            int v4;
            String s4;
            Float float8;
            int v3;
            String s3;
            Float float7;
            Float float6;
            Float float5;
            Float float4;
            float f1;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            int v = 0;
            if(compositeDecoder0.decodeSequentially()) {
                float f = compositeDecoder0.decodeFloatElement(serialDescriptor0, 0);
                String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                int v1 = compositeDecoder0.decodeIntElement(serialDescriptor0, 2);
                int v2 = compositeDecoder0.decodeIntElement(serialDescriptor0, 3);
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 4);
                String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 5);
                Float float0 = (Float)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 6, FloatSerializer.INSTANCE, null);
                Float float1 = (Float)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 7, FloatSerializer.INSTANCE, null);
                Float float2 = (Float)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 8, FloatSerializer.INSTANCE, null);
                Float float3 = (Float)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 9, FloatSerializer.INSTANCE, null);
                f1 = f;
                float4 = (Float)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 10, FloatSerializer.INSTANCE, null);
                float5 = float3;
                float6 = float1;
                float7 = float0;
                s3 = s2;
                v3 = v2;
                float8 = float2;
                s4 = s1;
                v4 = v1;
                s5 = s;
                v5 = 0x7FF;
            }
            else {
                float f2 = 0.0f;
                int v6 = 0;
                Float float9 = null;
                Float float10 = null;
                Float float11 = null;
                Float float12 = null;
                Float float13 = null;
                String s6 = null;
                String s7 = null;
                String s8 = null;
                int v7 = 0;
                boolean z = true;
                while(z) {
                    int v8 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v8) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            v |= 1;
                            f2 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 0);
                            break;
                        }
                        case 1: {
                            s6 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                            v |= 2;
                            break;
                        }
                        case 2: {
                            v |= 4;
                            v6 = compositeDecoder0.decodeIntElement(serialDescriptor0, 2);
                            break;
                        }
                        case 3: {
                            v |= 8;
                            v7 = compositeDecoder0.decodeIntElement(serialDescriptor0, 3);
                            break;
                        }
                        case 4: {
                            s7 = compositeDecoder0.decodeStringElement(serialDescriptor0, 4);
                            v |= 16;
                            break;
                        }
                        case 5: {
                            s8 = compositeDecoder0.decodeStringElement(serialDescriptor0, 5);
                            v |= 0x20;
                            break;
                        }
                        case 6: {
                            float13 = (Float)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 6, FloatSerializer.INSTANCE, float13);
                            v |= 0x40;
                            break;
                        }
                        case 7: {
                            float12 = (Float)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 7, FloatSerializer.INSTANCE, float12);
                            v |= 0x80;
                            break;
                        }
                        case 8: {
                            float10 = (Float)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 8, FloatSerializer.INSTANCE, float10);
                            v |= 0x100;
                            break;
                        }
                        case 9: {
                            float11 = (Float)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 9, FloatSerializer.INSTANCE, float11);
                            v |= 0x200;
                            break;
                        }
                        case 10: {
                            float9 = (Float)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 10, FloatSerializer.INSTANCE, float9);
                            v |= 0x400;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v8);
                        }
                    }
                }
                f1 = f2;
                float4 = float9;
                float8 = float10;
                float5 = float11;
                float6 = float12;
                float7 = float13;
                v5 = v;
                v3 = v7;
                v4 = v6;
                s5 = s6;
                s4 = s7;
                s3 = s8;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new GraphDetailInfo(v5, f1, s5, v4, v3, s4, s3, float7, float6, float8, float5, float4, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull GraphDetailInfo graphDetailInfo0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(graphDetailInfo0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            GraphDetailInfo.write$Self$domain_release(graphDetailInfo0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((GraphDetailInfo)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final Float g;
    public final Float h;
    public final Float i;
    public final Float j;
    public final Float k;

    static {
        GraphDetailInfo.Companion = new Companion(null);
    }

    public GraphDetailInfo() {
        this(0.0f, null, 0, 0, null, null, null, null, null, null, null, 0x7FF, null);
    }

    public GraphDetailInfo(float f, @NotNull String s, int v, int v1, @NotNull String s1, @NotNull String s2, @Nullable Float float0, @Nullable Float float1, @Nullable Float float2, @Nullable Float float3, @Nullable Float float4) {
        Intrinsics.checkNotNullParameter(s, "currency");
        Intrinsics.checkNotNullParameter(s1, "startDate");
        Intrinsics.checkNotNullParameter(s2, "endDate");
        super();
        this.a = f;
        this.b = s;
        this.c = v;
        this.d = v1;
        this.e = s1;
        this.f = s2;
        this.g = float0;
        this.h = float1;
        this.i = float2;
        this.j = float3;
        this.k = float4;
    }

    public GraphDetailInfo(float f, String s, int v, int v1, String s1, String s2, Float float0, Float float1, Float float2, Float float3, Float float4, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v2 & 1) == 0 ? f : 0.0f), ((v2 & 2) == 0 ? s : ""), ((v2 & 4) == 0 ? v : 0), ((v2 & 8) == 0 ? v1 : 0), ((v2 & 16) == 0 ? s1 : ""), ((v2 & 0x20) == 0 ? s2 : ""), ((v2 & 0x40) == 0 ? float0 : null), ((v2 & 0x80) == 0 ? float1 : null), ((v2 & 0x100) == 0 ? float2 : null), ((v2 & 0x200) == 0 ? float3 : null), ((v2 & 0x400) == 0 ? float4 : null));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public GraphDetailInfo(int v, float f, String s, int v1, int v2, String s1, String s2, Float float0, Float float1, Float float2, @SerialName("ecpm") Float float3, @SerialName("vcpm") Float float4, SerializationConstructorMarker serializationConstructorMarker0) {
        if((v & 1) == 0) {
            f = 0.0f;
        }
        this.a = f;
        this.b = (v & 2) == 0 ? "" : s;
        this.c = (v & 4) == 0 ? 0 : v1;
        this.d = (v & 8) == 0 ? 0 : v2;
        this.e = (v & 16) == 0 ? "" : s1;
        this.f = (v & 0x20) == 0 ? "" : s2;
        this.g = (v & 0x40) == 0 ? null : float0;
        this.h = (v & 0x80) == 0 ? null : float1;
        this.i = (v & 0x100) == 0 ? null : float2;
        this.j = (v & 0x200) == 0 ? null : float3;
        if((v & 0x400) == 0) {
            this.k = null;
            return;
        }
        this.k = float4;
    }

    public final float component1() {
        return this.a;
    }

    @Nullable
    public final Float component10() {
        return this.j;
    }

    @Nullable
    public final Float component11() {
        return this.k;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    @NotNull
    public final String component5() {
        return this.e;
    }

    @NotNull
    public final String component6() {
        return this.f;
    }

    @Nullable
    public final Float component7() {
        return this.g;
    }

    @Nullable
    public final Float component8() {
        return this.h;
    }

    @Nullable
    public final Float component9() {
        return this.i;
    }

    @NotNull
    public final GraphDetailInfo copy(float f, @NotNull String s, int v, int v1, @NotNull String s1, @NotNull String s2, @Nullable Float float0, @Nullable Float float1, @Nullable Float float2, @Nullable Float float3, @Nullable Float float4) {
        Intrinsics.checkNotNullParameter(s, "currency");
        Intrinsics.checkNotNullParameter(s1, "startDate");
        Intrinsics.checkNotNullParameter(s2, "endDate");
        return new GraphDetailInfo(f, s, v, v1, s1, s2, float0, float1, float2, float3, float4);
    }

    public static GraphDetailInfo copy$default(GraphDetailInfo graphDetailInfo0, float f, String s, int v, int v1, String s1, String s2, Float float0, Float float1, Float float2, Float float3, Float float4, int v2, Object object0) {
        float f1 = (v2 & 1) == 0 ? f : graphDetailInfo0.a;
        String s3 = (v2 & 2) == 0 ? s : graphDetailInfo0.b;
        int v3 = (v2 & 4) == 0 ? v : graphDetailInfo0.c;
        int v4 = (v2 & 8) == 0 ? v1 : graphDetailInfo0.d;
        String s4 = (v2 & 16) == 0 ? s1 : graphDetailInfo0.e;
        String s5 = (v2 & 0x20) == 0 ? s2 : graphDetailInfo0.f;
        Float float5 = (v2 & 0x40) == 0 ? float0 : graphDetailInfo0.g;
        Float float6 = (v2 & 0x80) == 0 ? float1 : graphDetailInfo0.h;
        Float float7 = (v2 & 0x100) == 0 ? float2 : graphDetailInfo0.i;
        Float float8 = (v2 & 0x200) == 0 ? float3 : graphDetailInfo0.j;
        return (v2 & 0x400) == 0 ? graphDetailInfo0.copy(f1, s3, v3, v4, s4, s5, float5, float6, float7, float8, float4) : graphDetailInfo0.copy(f1, s3, v3, v4, s4, s5, float5, float6, float7, float8, graphDetailInfo0.k);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GraphDetailInfo)) {
            return false;
        }
        if(Float.compare(this.a, ((GraphDetailInfo)object0).a) != 0) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((GraphDetailInfo)object0).b)) {
            return false;
        }
        if(this.c != ((GraphDetailInfo)object0).c) {
            return false;
        }
        if(this.d != ((GraphDetailInfo)object0).d) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((GraphDetailInfo)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((GraphDetailInfo)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((GraphDetailInfo)object0).g)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((GraphDetailInfo)object0).h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((GraphDetailInfo)object0).i)) {
            return false;
        }
        return Intrinsics.areEqual(this.j, ((GraphDetailInfo)object0).j) ? Intrinsics.areEqual(this.k, ((GraphDetailInfo)object0).k) : false;
    }

    public final int getClicks() {
        return this.d;
    }

    @NotNull
    public final String getCurrency() [...] // 潜在的解密器

    @Nullable
    public final Float getECpm() {
        return this.j;
    }

    @SerialName("ecpm")
    public static void getECpm$annotations() {
    }

    public final float getEarnings() {
        return this.a;
    }

    @NotNull
    public final String getEndDate() [...] // 潜在的解密器

    public final int getImpression() {
        return this.c;
    }

    @Nullable
    public final Float getPageCtr() {
        return this.i;
    }

    @Nullable
    public final Float getPageRpm() {
        return this.h;
    }

    @Nullable
    public final Float getRpm() {
        return this.g;
    }

    @NotNull
    public final String getStartDate() [...] // 潜在的解密器

    @Nullable
    public final Float getVCpm() {
        return this.k;
    }

    @SerialName("vcpm")
    public static void getVCpm$annotations() {
    }

    @Override
    public int hashCode() {
        int v = b.a(this.f, b.a(this.e, a.a(this.d, a.a(this.c, b.a(this.b, Float.hashCode(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
        int v1 = 0;
        int v2 = this.g == null ? 0 : this.g.hashCode();
        int v3 = this.h == null ? 0 : this.h.hashCode();
        int v4 = this.i == null ? 0 : this.i.hashCode();
        int v5 = this.j == null ? 0 : this.j.hashCode();
        Float float0 = this.k;
        if(float0 != null) {
            v1 = float0.hashCode();
        }
        return ((((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v1;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("GraphDetailInfo(earnings=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", currency=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", impression=");
        r0.a.A(stringBuilder0, this.c, ", clicks=", this.d, ", startDate=");
        androidx.room.a.w(stringBuilder0, this.e, ", endDate=", this.f, ", rpm=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", pageRpm=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", pageCtr=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", eCpm=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", vCpm=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @JvmStatic
    public static final void write$Self$domain_release(GraphDetailInfo graphDetailInfo0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || Float.compare(graphDetailInfo0.a, 0.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 0, graphDetailInfo0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || !Intrinsics.areEqual(graphDetailInfo0.b, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 1, graphDetailInfo0.b);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || graphDetailInfo0.c != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 2, graphDetailInfo0.c);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || graphDetailInfo0.d != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 3, graphDetailInfo0.d);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || !Intrinsics.areEqual(graphDetailInfo0.e, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 4, graphDetailInfo0.e);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || !Intrinsics.areEqual(graphDetailInfo0.f, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 5, graphDetailInfo0.f);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6) || graphDetailInfo0.g != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 6, FloatSerializer.INSTANCE, graphDetailInfo0.g);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 7) || graphDetailInfo0.h != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 7, FloatSerializer.INSTANCE, graphDetailInfo0.h);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 8) || graphDetailInfo0.i != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 8, FloatSerializer.INSTANCE, graphDetailInfo0.i);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 9) || graphDetailInfo0.j != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 9, FloatSerializer.INSTANCE, graphDetailInfo0.j);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 10) || graphDetailInfo0.k != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 10, FloatSerializer.INSTANCE, graphDetailInfo0.k);
        }
    }
}

