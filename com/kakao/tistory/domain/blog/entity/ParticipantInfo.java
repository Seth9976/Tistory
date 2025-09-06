package com.kakao.tistory.domain.blog.entity;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BM\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\u0004\u0012\b\b\u0002\u0010\n\u001A\u00020\u0002\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00060\u000B\u00A2\u0006\u0004\b\r\u0010\u000EB_\b\u0011\u0012\u0006\u0010\u000F\u001A\u00020\u0004\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000B\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u00A2\u0006\u0004\b\r\u0010\u0012J(\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u0013\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0016H\u00C1\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\u001FJ\u0010\u0010$\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010\u001DJ\u0016\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00060\u000BH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J\\\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\u00022\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00060\u000BH\u00C6\u0001\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b)\u0010!J\u0010\u0010*\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b*\u0010\u001FJ\u001A\u0010,\u001A\u00020\u00022\b\u0010+\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b\u0003\u0010\u001DR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001FR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010!R\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b6\u00104\u001A\u0004\b7\u0010!R\u0017\u0010\t\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b8\u00101\u001A\u0004\b9\u0010\u001FR\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b:\u0010/\u001A\u0004\b\n\u0010\u001DR\u001D\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00060\u000B8\u0006\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010&\u00A8\u0006@"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/ParticipantInfo;", "", "", "isPostedToday", "", "percentage", "", "message", "description", "current", "isAgeAuthed", "", "achievedDates", "<init>", "(ZILjava/lang/String;Ljava/lang/String;IZLjava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZILjava/lang/String;Ljava/lang/String;IZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/blog/entity/ParticipantInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "copy", "(ZILjava/lang/String;Ljava/lang/String;IZLjava/util/List;)Lcom/kakao/tistory/domain/blog/entity/ParticipantInfo;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "I", "getPercentage", "c", "Ljava/lang/String;", "getMessage", "d", "getDescription", "e", "getCurrent", "f", "g", "Ljava/util/List;", "getAchievedDates", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class ParticipantInfo {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/blog/entity/ParticipantInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/blog/entity/ParticipantInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/blog/entity/ParticipantInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/blog/entity/ParticipantInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer participantInfo$$serializer0 = new .serializer();
            .serializer.INSTANCE = participantInfo$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.blog.entity.ParticipantInfo", participantInfo$$serializer0, 7);
            pluginGeneratedSerialDescriptor0.addElement("isPostedToday", true);
            pluginGeneratedSerialDescriptor0.addElement("percentage", true);
            pluginGeneratedSerialDescriptor0.addElement("message", false);
            pluginGeneratedSerialDescriptor0.addElement("description", false);
            pluginGeneratedSerialDescriptor0.addElement("current", true);
            pluginGeneratedSerialDescriptor0.addElement("isAgeAuthed", true);
            pluginGeneratedSerialDescriptor0.addElement("achievedDates", false);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer kSerializer0 = ParticipantInfo.h[6];
            return new KSerializer[]{BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, kSerializer0};
        }

        @NotNull
        public ParticipantInfo deserialize(@NotNull Decoder decoder0) {
            int v4;
            int v3;
            String s3;
            int v2;
            String s2;
            boolean z3;
            boolean z2;
            List list0;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = ParticipantInfo.h;
            if(compositeDecoder0.decodeSequentially()) {
                boolean z = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 0);
                int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 1);
                String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                int v1 = compositeDecoder0.decodeIntElement(serialDescriptor0, 4);
                boolean z1 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 5);
                list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], null);
                z2 = z;
                z3 = z1;
                s2 = s1;
                v2 = v1;
                s3 = s;
                v3 = 0x7F;
                v4 = v;
            }
            else {
                boolean z4 = false;
                int v5 = 0;
                int v6 = 0;
                int v7 = 0;
                String s4 = null;
                String s5 = null;
                List list1 = null;
                boolean z5 = false;
                boolean z6 = true;
                while(z6) {
                    int v8 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v8) {
                        case -1: {
                            z6 = false;
                            break;
                        }
                        case 0: {
                            v6 |= 1;
                            z4 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 0);
                            break;
                        }
                        case 1: {
                            v7 = compositeDecoder0.decodeIntElement(serialDescriptor0, 1);
                            v6 |= 2;
                            break;
                        }
                        case 2: {
                            s4 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                            v6 |= 4;
                            break;
                        }
                        case 3: {
                            s5 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                            v6 |= 8;
                            break;
                        }
                        case 4: {
                            v5 = compositeDecoder0.decodeIntElement(serialDescriptor0, 4);
                            v6 |= 16;
                            break;
                        }
                        case 5: {
                            z5 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 5);
                            v6 |= 0x20;
                            break;
                        }
                        case 6: {
                            list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], list1);
                            v6 |= 0x40;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v8);
                        }
                    }
                }
                z2 = z4;
                list0 = list1;
                z3 = z5;
                v2 = v5;
                v3 = v6;
                v4 = v7;
                s3 = s4;
                s2 = s5;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new ParticipantInfo(v3, z2, v4, s3, s2, v2, z3, list0, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull ParticipantInfo participantInfo0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(participantInfo0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            ParticipantInfo.write$Self$domain_release(participantInfo0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((ParticipantInfo)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/ParticipantInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/blog/entity/ParticipantInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final boolean a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final List g;
    public static final KSerializer[] h;

    static {
        ParticipantInfo.Companion = new Companion(null);
        ParticipantInfo.h = new KSerializer[]{null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public ParticipantInfo(int v, boolean z, int v1, String s, String s1, int v2, boolean z1, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
        if(76 != (v & 76)) {
            PluginExceptionsKt.throwMissingFieldException(v, 76, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = (v & 1) == 0 ? false : z;
        this.b = (v & 2) == 0 ? 0 : v1;
        this.c = s;
        this.d = s1;
        this.e = (v & 16) == 0 ? 0 : v2;
        this.f = (v & 0x20) == 0 ? true : z1;
        this.g = list0;
    }

    public ParticipantInfo(boolean z, int v, @NotNull String s, @NotNull String s1, int v1, boolean z1, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "message");
        Intrinsics.checkNotNullParameter(s1, "description");
        Intrinsics.checkNotNullParameter(list0, "achievedDates");
        super();
        this.a = z;
        this.b = v;
        this.c = s;
        this.d = s1;
        this.e = v1;
        this.f = z1;
        this.g = list0;
    }

    public ParticipantInfo(boolean z, int v, String s, String s1, int v1, boolean z1, List list0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v2 & 1) == 0 ? z : false), ((v2 & 2) == 0 ? v : 0), s, s1, ((v2 & 16) == 0 ? v1 : 0), ((v2 & 0x20) == 0 ? z1 : true), list0);
    }

    public final boolean component1() {
        return this.a;
    }

    public final int component2() {
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

    public final int component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    @NotNull
    public final List component7() {
        return this.g;
    }

    @NotNull
    public final ParticipantInfo copy(boolean z, int v, @NotNull String s, @NotNull String s1, int v1, boolean z1, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "message");
        Intrinsics.checkNotNullParameter(s1, "description");
        Intrinsics.checkNotNullParameter(list0, "achievedDates");
        return new ParticipantInfo(z, v, s, s1, v1, z1, list0);
    }

    public static ParticipantInfo copy$default(ParticipantInfo participantInfo0, boolean z, int v, String s, String s1, int v1, boolean z1, List list0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            z = participantInfo0.a;
        }
        if((v2 & 2) != 0) {
            v = participantInfo0.b;
        }
        if((v2 & 4) != 0) {
            s = participantInfo0.c;
        }
        if((v2 & 8) != 0) {
            s1 = participantInfo0.d;
        }
        if((v2 & 16) != 0) {
            v1 = participantInfo0.e;
        }
        if((v2 & 0x20) != 0) {
            z1 = participantInfo0.f;
        }
        if((v2 & 0x40) != 0) {
            list0 = participantInfo0.g;
        }
        return participantInfo0.copy(z, v, s, s1, v1, z1, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ParticipantInfo)) {
            return false;
        }
        if(this.a != ((ParticipantInfo)object0).a) {
            return false;
        }
        if(this.b != ((ParticipantInfo)object0).b) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((ParticipantInfo)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((ParticipantInfo)object0).d)) {
            return false;
        }
        if(this.e != ((ParticipantInfo)object0).e) {
            return false;
        }
        return this.f == ((ParticipantInfo)object0).f ? Intrinsics.areEqual(this.g, ((ParticipantInfo)object0).g) : false;
    }

    @NotNull
    public final List getAchievedDates() {
        return this.g;
    }

    public final int getCurrent() {
        return this.e;
    }

    @NotNull
    public final String getDescription() {
        return this.d;
    }

    @NotNull
    public final String getMessage() {
        return this.c;
    }

    public final int getPercentage() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.g.hashCode() + c.a(this.f, a.a(this.e, b.a(this.d, b.a(this.c, a.a(this.b, Boolean.hashCode(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    public final boolean isAgeAuthed() {
        return this.f;
    }

    public final boolean isPostedToday() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ParticipantInfo(isPostedToday=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", percentage=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", message=");
        androidx.room.a.w(stringBuilder0, this.c, ", description=", this.d, ", current=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", isAgeAuthed=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", achievedDates=");
        return wb.a.e(stringBuilder0, this.g, ")");
    }

    @JvmStatic
    public static final void write$Self$domain_release(ParticipantInfo participantInfo0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        KSerializer[] arr_kSerializer = ParticipantInfo.h;
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || participantInfo0.a) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 0, participantInfo0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || participantInfo0.b != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 1, participantInfo0.b);
        }
        compositeEncoder0.encodeStringElement(serialDescriptor0, 2, participantInfo0.c);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 3, participantInfo0.d);
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || participantInfo0.e != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 4, participantInfo0.e);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || !participantInfo0.f) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 5, participantInfo0.f);
        }
        compositeEncoder0.encodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], participantInfo0.g);
    }
}

