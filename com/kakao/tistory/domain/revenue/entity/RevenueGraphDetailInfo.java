package com.kakao.tistory.domain.revenue.entity;

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
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0011\u0012\u0006\u0010\t\u001A\u00020\b\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001C\u0010\u0017J\u0010\u0010\u001D\u001A\u00020\bHÖ\u0001¢\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010!\u001A\u00020 2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0017R \u0010\u0005\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\'\u0012\u0004\b)\u0010*\u001A\u0004\b(\u0010\u0019¨\u0006-"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "", "", "lastUpdateTime", "Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;", "graphDetailInfo", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;)Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLastUpdateTime", "b", "Lcom/kakao/tistory/domain/revenue/entity/GraphDetailInfo;", "getGraphDetailInfo", "getGraphDetailInfo$annotations", "()V", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class RevenueGraphDetailInfo {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer revenueGraphDetailInfo$$serializer0 = new .serializer();
            .serializer.INSTANCE = revenueGraphDetailInfo$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.revenue.entity.RevenueGraphDetailInfo", revenueGraphDetailInfo$$serializer0, 2);
            pluginGeneratedSerialDescriptor0.addElement("lastUpdateTime", true);
            pluginGeneratedSerialDescriptor0.addElement("revenueInfo", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE, com.kakao.tistory.domain.revenue.entity.GraphDetailInfo..serializer.INSTANCE};
        }

        @NotNull
        public RevenueGraphDetailInfo deserialize(@NotNull Decoder decoder0) {
            int v;
            GraphDetailInfo graphDetailInfo0;
            String s;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            if(compositeDecoder0.decodeSequentially()) {
                s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                graphDetailInfo0 = (GraphDetailInfo)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.revenue.entity.GraphDetailInfo..serializer.INSTANCE, null);
                v = 3;
            }
            else {
                int v1 = 0;
                s = null;
                GraphDetailInfo graphDetailInfo1 = null;
                boolean z = true;
                while(z) {
                    int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            graphDetailInfo1 = (GraphDetailInfo)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.revenue.entity.GraphDetailInfo..serializer.INSTANCE, graphDetailInfo1);
                            v1 |= 2;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                graphDetailInfo0 = graphDetailInfo1;
                v = v1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new RevenueGraphDetailInfo(v, s, graphDetailInfo0, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull RevenueGraphDetailInfo revenueGraphDetailInfo0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(revenueGraphDetailInfo0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            RevenueGraphDetailInfo.write$Self$domain_release(revenueGraphDetailInfo0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((RevenueGraphDetailInfo)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraphDetailInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final GraphDetailInfo b;

    static {
        RevenueGraphDetailInfo.Companion = new Companion(null);
    }

    public RevenueGraphDetailInfo() {
        this(null, null, 3, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public RevenueGraphDetailInfo(int v, String s, @SerialName("revenueInfo") GraphDetailInfo graphDetailInfo0, SerializationConstructorMarker serializationConstructorMarker0) {
        this.a = (v & 1) == 0 ? "" : s;
        this.b = (v & 2) == 0 ? new GraphDetailInfo(0.0f, null, 0, 0, null, null, null, null, null, null, null, 0x7FF, null) : graphDetailInfo0;
    }

    public RevenueGraphDetailInfo(@NotNull String s, @NotNull GraphDetailInfo graphDetailInfo0) {
        Intrinsics.checkNotNullParameter(s, "lastUpdateTime");
        Intrinsics.checkNotNullParameter(graphDetailInfo0, "graphDetailInfo");
        super();
        this.a = s;
        this.b = graphDetailInfo0;
    }

    public RevenueGraphDetailInfo(String s, GraphDetailInfo graphDetailInfo0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? graphDetailInfo0 : new GraphDetailInfo(0.0f, null, 0, 0, null, null, null, null, null, null, null, 0x7FF, null)));
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final GraphDetailInfo component2() {
        return this.b;
    }

    @NotNull
    public final RevenueGraphDetailInfo copy(@NotNull String s, @NotNull GraphDetailInfo graphDetailInfo0) {
        Intrinsics.checkNotNullParameter(s, "lastUpdateTime");
        Intrinsics.checkNotNullParameter(graphDetailInfo0, "graphDetailInfo");
        return new RevenueGraphDetailInfo(s, graphDetailInfo0);
    }

    public static RevenueGraphDetailInfo copy$default(RevenueGraphDetailInfo revenueGraphDetailInfo0, String s, GraphDetailInfo graphDetailInfo0, int v, Object object0) {
        if((v & 1) != 0) {
            s = revenueGraphDetailInfo0.a;
        }
        if((v & 2) != 0) {
            graphDetailInfo0 = revenueGraphDetailInfo0.b;
        }
        return revenueGraphDetailInfo0.copy(s, graphDetailInfo0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RevenueGraphDetailInfo)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((RevenueGraphDetailInfo)object0).a) ? Intrinsics.areEqual(this.b, ((RevenueGraphDetailInfo)object0).b) : false;
    }

    @NotNull
    public final GraphDetailInfo getGraphDetailInfo() {
        return this.b;
    }

    @SerialName("revenueInfo")
    public static void getGraphDetailInfo$annotations() {
    }

    @NotNull
    public final String getLastUpdateTime() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "RevenueGraphDetailInfo(lastUpdateTime=" + this.a + ", graphDetailInfo=" + this.b + ")";
    }

    @JvmStatic
    public static final void write$Self$domain_release(RevenueGraphDetailInfo revenueGraphDetailInfo0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(revenueGraphDetailInfo0.a, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, revenueGraphDetailInfo0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.revenue.entity.GraphDetailInfo..serializer.INSTANCE, revenueGraphDetailInfo0.b);
        }
        else {
            GraphDetailInfo graphDetailInfo0 = new GraphDetailInfo(0.0f, null, 0, 0, null, null, null, null, null, null, null, 0x7FF, null);
            if(!Intrinsics.areEqual(revenueGraphDetailInfo0.b, graphDetailInfo0)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.revenue.entity.GraphDetailInfo..serializer.INSTANCE, revenueGraphDetailInfo0.b);
            }
        }
    }
}

