package com.kakao.tistory.domain.blog.entity;

import a5.b;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u000B\n\u0002\b\"\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002YXB\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\u0006\u0012\b\b\u0002\u0010\n\u001A\u00020\u0006\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0006\u0012\b\b\u0002\u0010\f\u001A\u00020\u0006\u0012\b\b\u0002\u0010\r\u001A\u00020\u0006\u0012\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E\u0012\b\b\u0002\u0010\u0011\u001A\u00020\u000F\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0013\u0010\u0014B\u0095\u0001\b\u0011\u0012\u0006\u0010\u0015\u001A\u00020\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0006\u0012\u000E\u0010\u0010\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u000F\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0018J(\u0010!\u001A\u00020\u001E2\u0006\u0010\u0019\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u001D\u001A\u00020\u001CH\u00C1\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010\"\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010\'J\u0010\u0010)\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010\'J\u0010\u0010*\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010\'J\u0010\u0010+\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b+\u0010\'J\u0010\u0010,\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010\'J\u0010\u0010-\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010\'J\u0016\u0010.\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EH\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u0010\u00100\u001A\u00020\u000FH\u00C6\u0003\u00A2\u0006\u0004\b0\u00101J\u0010\u00102\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b2\u0010\'J\u008E\u0001\u00103\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\u00062\b\b\u0002\u0010\u000B\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\u00062\b\b\u0002\u0010\r\u001A\u00020\u00062\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u0006H\u00C6\u0001\u00A2\u0006\u0004\b3\u00104J\u0010\u00105\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b5\u0010\'J\u0010\u00106\u001A\u00020\u000FH\u00D6\u0001\u00A2\u0006\u0004\b6\u00101J\u001A\u00109\u001A\u0002082\b\u00107\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010#R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b@\u0010%R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010\'R\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bD\u0010B\u001A\u0004\bE\u0010\'R\u0017\u0010\t\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bF\u0010B\u001A\u0004\bG\u0010\'R\u0017\u0010\n\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bH\u0010B\u001A\u0004\bI\u0010\'R\u0017\u0010\u000B\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bJ\u0010B\u001A\u0004\bK\u0010\'R\u0017\u0010\f\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bL\u0010B\u001A\u0004\bM\u0010\'R\u0017\u0010\r\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bN\u0010B\u001A\u0004\bO\u0010\'R\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E8\u0006\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010/R\u0017\u0010\u0011\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\bS\u0010T\u001A\u0004\bU\u00101R\u0017\u0010\u0012\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bV\u0010B\u001A\u0004\bW\u0010\'\u00A8\u0006Z"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/ChallengeInfo;", "", "", "id", "Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;", "status", "", "code", "image", "link", "title", "description", "startDate", "endDate", "", "", "prizeInfo", "total", "today", "<init>", "(JLcom/kakao/tistory/domain/blog/entity/ChallengeStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLcom/kakao/tistory/domain/blog/entity/ChallengeStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/blog/entity/ChallengeInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "()I", "component12", "copy", "(JLcom/kakao/tistory/domain/blog/entity/ChallengeStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)Lcom/kakao/tistory/domain/blog/entity/ChallengeInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "b", "Lcom/kakao/tistory/domain/blog/entity/ChallengeStatus;", "getStatus", "c", "Ljava/lang/String;", "getCode", "d", "getImage", "e", "getLink", "f", "getTitle", "g", "getDescription", "h", "getStartDate", "i", "getEndDate", "j", "Ljava/util/List;", "getPrizeInfo", "k", "I", "getTotal", "l", "getToday", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class ChallengeInfo {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/blog/entity/ChallengeInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/blog/entity/ChallengeInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/blog/entity/ChallengeInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/blog/entity/ChallengeInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer challengeInfo$$serializer0 = new .serializer();
            .serializer.INSTANCE = challengeInfo$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.blog.entity.ChallengeInfo", challengeInfo$$serializer0, 12);
            pluginGeneratedSerialDescriptor0.addElement("id", true);
            pluginGeneratedSerialDescriptor0.addElement("status", true);
            pluginGeneratedSerialDescriptor0.addElement("code", true);
            pluginGeneratedSerialDescriptor0.addElement("image", true);
            pluginGeneratedSerialDescriptor0.addElement("link", true);
            pluginGeneratedSerialDescriptor0.addElement("title", true);
            pluginGeneratedSerialDescriptor0.addElement("description", true);
            pluginGeneratedSerialDescriptor0.addElement("startDate", true);
            pluginGeneratedSerialDescriptor0.addElement("endDate", true);
            pluginGeneratedSerialDescriptor0.addElement("prizeInfo", true);
            pluginGeneratedSerialDescriptor0.addElement("total", true);
            pluginGeneratedSerialDescriptor0.addElement("today", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer[] arr_kSerializer = ChallengeInfo.m;
            return new KSerializer[]{LongSerializer.INSTANCE, arr_kSerializer[1], StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, arr_kSerializer[9], IntSerializer.INSTANCE, StringSerializer.INSTANCE};
        }

        @NotNull
        public ChallengeInfo deserialize(@NotNull Decoder decoder0) {
            long v3;
            int v2;
            String s14;
            String s13;
            String s12;
            String s11;
            String s10;
            String s9;
            String s8;
            String s7;
            int v1;
            ChallengeStatus challengeStatus2;
            List list0;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = ChallengeInfo.m;
            ChallengeStatus challengeStatus0 = null;
            if(compositeDecoder0.decodeSequentially()) {
                long v = compositeDecoder0.decodeLongElement(serialDescriptor0, 0);
                ChallengeStatus challengeStatus1 = (ChallengeStatus)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 4);
                String s3 = compositeDecoder0.decodeStringElement(serialDescriptor0, 5);
                String s4 = compositeDecoder0.decodeStringElement(serialDescriptor0, 6);
                String s5 = compositeDecoder0.decodeStringElement(serialDescriptor0, 7);
                String s6 = compositeDecoder0.decodeStringElement(serialDescriptor0, 8);
                list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 9, arr_kSerializer[9], null);
                challengeStatus2 = challengeStatus1;
                v1 = compositeDecoder0.decodeIntElement(serialDescriptor0, 10);
                s7 = compositeDecoder0.decodeStringElement(serialDescriptor0, 11);
                s8 = s5;
                s9 = s4;
                s10 = s3;
                s11 = s1;
                s12 = s6;
                s13 = s2;
                s14 = s;
                v2 = 0xFFF;
                v3 = v;
            }
            else {
                String s15 = null;
                String s16 = null;
                String s17 = null;
                String s18 = null;
                String s19 = null;
                String s20 = null;
                int v4 = 0;
                int v5 = 0;
                long v6 = 0L;
                List list1 = null;
                String s21 = null;
                String s22 = null;
                boolean z = true;
                while(z) {
                    int v7 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v7) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            v6 = compositeDecoder0.decodeLongElement(serialDescriptor0, 0);
                            v4 |= 1;
                            break;
                        }
                        case 1: {
                            challengeStatus0 = (ChallengeStatus)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], challengeStatus0);
                            v4 |= 2;
                            break;
                        }
                        case 2: {
                            s21 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                            v4 |= 4;
                            break;
                        }
                        case 3: {
                            s22 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                            v4 |= 8;
                            break;
                        }
                        case 4: {
                            s15 = compositeDecoder0.decodeStringElement(serialDescriptor0, 4);
                            v4 |= 16;
                            break;
                        }
                        case 5: {
                            s16 = compositeDecoder0.decodeStringElement(serialDescriptor0, 5);
                            v4 |= 0x20;
                            break;
                        }
                        case 6: {
                            s17 = compositeDecoder0.decodeStringElement(serialDescriptor0, 6);
                            v4 |= 0x40;
                            break;
                        }
                        case 7: {
                            s18 = compositeDecoder0.decodeStringElement(serialDescriptor0, 7);
                            v4 |= 0x80;
                            break;
                        }
                        case 8: {
                            s19 = compositeDecoder0.decodeStringElement(serialDescriptor0, 8);
                            v4 |= 0x100;
                            break;
                        }
                        case 9: {
                            list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 9, arr_kSerializer[9], list1);
                            v4 |= 0x200;
                            break;
                        }
                        case 10: {
                            v5 = compositeDecoder0.decodeIntElement(serialDescriptor0, 10);
                            v4 |= 0x400;
                            break;
                        }
                        case 11: {
                            s20 = compositeDecoder0.decodeStringElement(serialDescriptor0, 11);
                            v4 |= 0x800;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v7);
                        }
                    }
                }
                challengeStatus2 = challengeStatus0;
                v2 = v4;
                list0 = list1;
                s14 = s21;
                s11 = s22;
                s13 = s15;
                s10 = s16;
                s9 = s17;
                s8 = s18;
                s12 = s19;
                v1 = v5;
                s7 = s20;
                v3 = v6;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new ChallengeInfo(v2, v3, challengeStatus2, s14, s11, s13, s10, s9, s8, s12, list0, v1, s7, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull ChallengeInfo challengeInfo0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(challengeInfo0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            ChallengeInfo.write$Self$domain_release(challengeInfo0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((ChallengeInfo)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/ChallengeInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/blog/entity/ChallengeInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final long a;
    public final ChallengeStatus b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final int k;
    public final String l;
    public static final KSerializer[] m;

    static {
        ChallengeInfo.Companion = new Companion(null);
        ChallengeInfo.m = new KSerializer[]{null, EnumsKt.createSimpleEnumSerializer("com.kakao.tistory.domain.blog.entity.ChallengeStatus", ChallengeStatus.values()), null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null};
    }

    public ChallengeInfo() {
        this(0L, null, null, null, null, null, null, null, null, null, 0, null, 0xFFF, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public ChallengeInfo(int v, long v1, ChallengeStatus challengeStatus0, String s, String s1, String s2, String s3, String s4, String s5, String s6, List list0, int v2, String s7, SerializationConstructorMarker serializationConstructorMarker0) {
        if((v & 1) == 0) {
            v1 = 0L;
        }
        this.a = v1;
        this.b = (v & 2) == 0 ? ChallengeStatus.UNKNOWN : challengeStatus0;
        this.c = (v & 4) == 0 ? "" : s;
        this.d = (v & 8) == 0 ? "" : s1;
        this.e = (v & 16) == 0 ? "" : s2;
        this.f = (v & 0x20) == 0 ? "" : s3;
        this.g = (v & 0x40) == 0 ? "" : s4;
        this.h = (v & 0x80) == 0 ? "" : s5;
        this.i = (v & 0x100) == 0 ? "" : s6;
        this.j = (v & 0x200) == 0 ? CollectionsKt__CollectionsKt.emptyList() : list0;
        this.k = (v & 0x400) == 0 ? 0 : v2;
        if((v & 0x800) == 0) {
            this.l = "";
            return;
        }
        this.l = s7;
    }

    public ChallengeInfo(long v, @NotNull ChallengeStatus challengeStatus0, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4, @NotNull String s5, @NotNull String s6, @NotNull List list0, int v1, @NotNull String s7) {
        Intrinsics.checkNotNullParameter(challengeStatus0, "status");
        Intrinsics.checkNotNullParameter(s, "code");
        Intrinsics.checkNotNullParameter(s1, "image");
        Intrinsics.checkNotNullParameter(s2, "link");
        Intrinsics.checkNotNullParameter(s3, "title");
        Intrinsics.checkNotNullParameter(s4, "description");
        Intrinsics.checkNotNullParameter(s5, "startDate");
        Intrinsics.checkNotNullParameter(s6, "endDate");
        Intrinsics.checkNotNullParameter(list0, "prizeInfo");
        Intrinsics.checkNotNullParameter(s7, "today");
        super();
        this.a = v;
        this.b = challengeStatus0;
        this.c = s;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = s4;
        this.h = s5;
        this.i = s6;
        this.j = list0;
        this.k = v1;
        this.l = s7;
    }

    public ChallengeInfo(long v, ChallengeStatus challengeStatus0, String s, String s1, String s2, String s3, String s4, String s5, String s6, List list0, int v1, String s7, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        ChallengeStatus challengeStatus1 = (v2 & 2) == 0 ? challengeStatus0 : ChallengeStatus.UNKNOWN;
        String s8 = "";
        List list1 = (v2 & 0x200) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList();
        if((v2 & 0x800) == 0) {
            s8 = s7;
        }
        this(((v2 & 1) == 0 ? v : 0L), challengeStatus1, ((v2 & 4) == 0 ? s : ""), ((v2 & 8) == 0 ? s1 : ""), ((v2 & 16) == 0 ? s2 : ""), ((v2 & 0x20) == 0 ? s3 : ""), ((v2 & 0x40) == 0 ? s4 : ""), ((v2 & 0x80) == 0 ? s5 : ""), ((v2 & 0x100) == 0 ? s6 : ""), list1, ((v2 & 0x400) == 0 ? v1 : 0), s8);
    }

    public final long component1() {
        return this.a;
    }

    @NotNull
    public final List component10() {
        return this.j;
    }

    public final int component11() {
        return this.k;
    }

    @NotNull
    public final String component12() {
        return this.l;
    }

    @NotNull
    public final ChallengeStatus component2() {
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
    public final String component5() {
        return this.e;
    }

    @NotNull
    public final String component6() {
        return this.f;
    }

    @NotNull
    public final String component7() {
        return this.g;
    }

    @NotNull
    public final String component8() {
        return this.h;
    }

    @NotNull
    public final String component9() {
        return this.i;
    }

    @NotNull
    public final ChallengeInfo copy(long v, @NotNull ChallengeStatus challengeStatus0, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4, @NotNull String s5, @NotNull String s6, @NotNull List list0, int v1, @NotNull String s7) {
        Intrinsics.checkNotNullParameter(challengeStatus0, "status");
        Intrinsics.checkNotNullParameter(s, "code");
        Intrinsics.checkNotNullParameter(s1, "image");
        Intrinsics.checkNotNullParameter(s2, "link");
        Intrinsics.checkNotNullParameter(s3, "title");
        Intrinsics.checkNotNullParameter(s4, "description");
        Intrinsics.checkNotNullParameter(s5, "startDate");
        Intrinsics.checkNotNullParameter(s6, "endDate");
        Intrinsics.checkNotNullParameter(list0, "prizeInfo");
        Intrinsics.checkNotNullParameter(s7, "today");
        return new ChallengeInfo(v, challengeStatus0, s, s1, s2, s3, s4, s5, s6, list0, v1, s7);
    }

    public static ChallengeInfo copy$default(ChallengeInfo challengeInfo0, long v, ChallengeStatus challengeStatus0, String s, String s1, String s2, String s3, String s4, String s5, String s6, List list0, int v1, String s7, int v2, Object object0) {
        long v3 = (v2 & 1) == 0 ? v : challengeInfo0.a;
        ChallengeStatus challengeStatus1 = (v2 & 2) == 0 ? challengeStatus0 : challengeInfo0.b;
        String s8 = (v2 & 4) == 0 ? s : challengeInfo0.c;
        String s9 = (v2 & 8) == 0 ? s1 : challengeInfo0.d;
        String s10 = (v2 & 16) == 0 ? s2 : challengeInfo0.e;
        String s11 = (v2 & 0x20) == 0 ? s3 : challengeInfo0.f;
        String s12 = (v2 & 0x40) == 0 ? s4 : challengeInfo0.g;
        String s13 = (v2 & 0x80) == 0 ? s5 : challengeInfo0.h;
        String s14 = (v2 & 0x100) == 0 ? s6 : challengeInfo0.i;
        List list1 = (v2 & 0x200) == 0 ? list0 : challengeInfo0.j;
        int v4 = (v2 & 0x400) == 0 ? v1 : challengeInfo0.k;
        return (v2 & 0x800) == 0 ? challengeInfo0.copy(v3, challengeStatus1, s8, s9, s10, s11, s12, s13, s14, list1, v4, s7) : challengeInfo0.copy(v3, challengeStatus1, s8, s9, s10, s11, s12, s13, s14, list1, v4, challengeInfo0.l);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ChallengeInfo)) {
            return false;
        }
        if(this.a != ((ChallengeInfo)object0).a) {
            return false;
        }
        if(this.b != ((ChallengeInfo)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((ChallengeInfo)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((ChallengeInfo)object0).d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, ((ChallengeInfo)object0).e)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.f, ((ChallengeInfo)object0).f)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((ChallengeInfo)object0).g)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.h, ((ChallengeInfo)object0).h)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.i, ((ChallengeInfo)object0).i)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, ((ChallengeInfo)object0).j)) {
            return false;
        }
        return this.k == ((ChallengeInfo)object0).k ? Intrinsics.areEqual(this.l, ((ChallengeInfo)object0).l) : false;
    }

    @NotNull
    public final String getCode() {
        return this.c;
    }

    @NotNull
    public final String getDescription() {
        return this.g;
    }

    @NotNull
    public final String getEndDate() [...] // 潜在的解密器

    public final long getId() {
        return this.a;
    }

    @NotNull
    public final String getImage() [...] // 潜在的解密器

    @NotNull
    public final String getLink() [...] // 潜在的解密器

    @NotNull
    public final List getPrizeInfo() {
        return this.j;
    }

    @NotNull
    public final String getStartDate() [...] // 潜在的解密器

    @NotNull
    public final ChallengeStatus getStatus() {
        return this.b;
    }

    @NotNull
    public final String getTitle() [...] // 潜在的解密器

    @NotNull
    public final String getToday() {
        return this.l;
    }

    public final int getTotal() {
        return this.k;
    }

    @Override
    public int hashCode() {
        return this.l.hashCode() + a.a(this.k, b.c(this.j, com.kakao.tistory.domain.blog.entity.b.a(this.i, com.kakao.tistory.domain.blog.entity.b.a(this.h, com.kakao.tistory.domain.blog.entity.b.a(this.g, com.kakao.tistory.domain.blog.entity.b.a(this.f, com.kakao.tistory.domain.blog.entity.b.a(this.e, com.kakao.tistory.domain.blog.entity.b.a(this.d, com.kakao.tistory.domain.blog.entity.b.a(this.c, (this.b.hashCode() + Long.hashCode(this.a) * 0x1F) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ChallengeInfo(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", status=");
        stringBuilder0.append(this.b);
        androidx.room.a.w(stringBuilder0, ", code=", this.c, ", image=", this.d);
        androidx.room.a.w(stringBuilder0, ", link=", this.e, ", title=", this.f);
        androidx.room.a.w(stringBuilder0, ", description=", this.g, ", startDate=", this.h);
        stringBuilder0.append(", endDate=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", prizeInfo=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", total=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", today=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @JvmStatic
    public static final void write$Self$domain_release(ChallengeInfo challengeInfo0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        KSerializer[] arr_kSerializer = ChallengeInfo.m;
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || challengeInfo0.a != 0L) {
            compositeEncoder0.encodeLongElement(serialDescriptor0, 0, challengeInfo0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || challengeInfo0.b != ChallengeStatus.UNKNOWN) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], challengeInfo0.b);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(challengeInfo0.c, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 2, challengeInfo0.c);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(challengeInfo0.d, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 3, challengeInfo0.d);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || !Intrinsics.areEqual(challengeInfo0.e, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 4, challengeInfo0.e);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || !Intrinsics.areEqual(challengeInfo0.f, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 5, challengeInfo0.f);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6) || !Intrinsics.areEqual(challengeInfo0.g, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 6, challengeInfo0.g);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 7) || !Intrinsics.areEqual(challengeInfo0.h, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 7, challengeInfo0.h);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 8) || !Intrinsics.areEqual(challengeInfo0.i, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 8, challengeInfo0.i);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 9) || !Intrinsics.areEqual(challengeInfo0.j, CollectionsKt__CollectionsKt.emptyList())) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 9, arr_kSerializer[9], challengeInfo0.j);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 10) || challengeInfo0.k != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 10, challengeInfo0.k);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 11) || !Intrinsics.areEqual(challengeInfo0.l, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 11, challengeInfo0.l);
        }
    }
}

