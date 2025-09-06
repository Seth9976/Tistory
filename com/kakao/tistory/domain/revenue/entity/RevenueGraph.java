package com.kakao.tistory.domain.revenue.entity;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B/\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\t\u0010\nB?\b\u0011\u0012\u0006\u0010\u000B\u001A\u00020\u0007\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u00A2\u0006\u0004\b\t\u0010\u000EJ(\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u00C1\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ8\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u0007H\u00C6\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001A\u00020\u0007H\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010\u001EJ\u001A\u0010%\u001A\u00020$2\b\u0010#\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b*\u0010(\u001A\u0004\b+\u0010\u0019R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u001CR\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u001E\u00A8\u00064"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "", "", "startDate", "endDate", "", "earnings", "", "impression", "<init>", "(Ljava/lang/String;Ljava/lang/String;DI)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;DILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;DI)Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStartDate", "b", "getEndDate", "c", "D", "getEarnings", "d", "I", "getImpression", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class RevenueGraph {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/revenue/entity/RevenueGraph.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer revenueGraph$$serializer0 = new .serializer();
            .serializer.INSTANCE = revenueGraph$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.revenue.entity.RevenueGraph", revenueGraph$$serializer0, 4);
            pluginGeneratedSerialDescriptor0.addElement("startDate", true);
            pluginGeneratedSerialDescriptor0.addElement("endDate", true);
            pluginGeneratedSerialDescriptor0.addElement("earnings", true);
            pluginGeneratedSerialDescriptor0.addElement("impression", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, DoubleSerializer.INSTANCE, IntSerializer.INSTANCE};
        }

        @NotNull
        public RevenueGraph deserialize(@NotNull Decoder decoder0) {
            double f1;
            String s3;
            int v1;
            int v;
            String s2;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            if(compositeDecoder0.decodeSequentially()) {
                String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                double f = compositeDecoder0.decodeDoubleElement(serialDescriptor0, 2);
                s2 = s;
                v = compositeDecoder0.decodeIntElement(serialDescriptor0, 3);
                v1 = 15;
                s3 = s1;
                f1 = f;
            }
            else {
                String s4 = null;
                String s5 = null;
                double f2 = 0.0;
                int v2 = 0;
                int v3 = 0;
                boolean z = true;
                while(z) {
                    int v4 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v4) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            s4 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                            v3 |= 1;
                            break;
                        }
                        case 1: {
                            s5 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                            v3 |= 2;
                            break;
                        }
                        case 2: {
                            f2 = compositeDecoder0.decodeDoubleElement(serialDescriptor0, 2);
                            v3 |= 4;
                            break;
                        }
                        case 3: {
                            v2 = compositeDecoder0.decodeIntElement(serialDescriptor0, 3);
                            v3 |= 8;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v4);
                        }
                    }
                }
                s2 = s4;
                v = v2;
                v1 = v3;
                s3 = s5;
                f1 = f2;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new RevenueGraph(v1, s2, s3, f1, v, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull RevenueGraph revenueGraph0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(revenueGraph0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            RevenueGraph.write$Self$domain_release(revenueGraph0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((RevenueGraph)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final String b;
    public final double c;
    public final int d;

    static {
        RevenueGraph.Companion = new Companion(null);
    }

    public RevenueGraph() {
        this(null, null, 0.0, 0, 15, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public RevenueGraph(int v, String s, String s1, double f, int v1, SerializationConstructorMarker serializationConstructorMarker0) {
        this.a = (v & 1) == 0 ? "" : s;
        this.b = (v & 2) == 0 ? "" : s1;
        this.c = (v & 4) == 0 ? 0.0 : f;
        if((v & 8) == 0) {
            this.d = 0;
            return;
        }
        this.d = v1;
    }

    public RevenueGraph(@NotNull String s, @NotNull String s1, double f, int v) {
        Intrinsics.checkNotNullParameter(s, "startDate");
        Intrinsics.checkNotNullParameter(s1, "endDate");
        super();
        this.a = s;
        this.b = s1;
        this.c = f;
        this.d = v;
    }

    public RevenueGraph(String s, String s1, double f, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            f = 0.0;
        }
        if((v1 & 8) != 0) {
            v = 0;
        }
        this(((v1 & 1) == 0 ? s : ""), ((v1 & 2) == 0 ? s1 : ""), f, v);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    public final double component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    @NotNull
    public final RevenueGraph copy(@NotNull String s, @NotNull String s1, double f, int v) {
        Intrinsics.checkNotNullParameter(s, "startDate");
        Intrinsics.checkNotNullParameter(s1, "endDate");
        return new RevenueGraph(s, s1, f, v);
    }

    public static RevenueGraph copy$default(RevenueGraph revenueGraph0, String s, String s1, double f, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = revenueGraph0.a;
        }
        if((v1 & 2) != 0) {
            s1 = revenueGraph0.b;
        }
        if((v1 & 4) != 0) {
            f = revenueGraph0.c;
        }
        if((v1 & 8) != 0) {
            v = revenueGraph0.d;
        }
        return revenueGraph0.copy(s, s1, f, v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RevenueGraph)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((RevenueGraph)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((RevenueGraph)object0).b)) {
            return false;
        }
        return Double.compare(this.c, ((RevenueGraph)object0).c) == 0 ? this.d == ((RevenueGraph)object0).d : false;
    }

    public final double getEarnings() {
        return this.c;
    }

    @NotNull
    public final String getEndDate() [...] // 潜在的解密器

    public final int getImpression() {
        return this.d;
    }

    @NotNull
    public final String getStartDate() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return this.d + (Double.hashCode(this.c) + b.a(this.b, this.a.hashCode() * 0x1F, 0x1F)) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = a5.b.w("RevenueGraph(startDate=", this.a, ", endDate=", this.b, ", earnings=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", impression=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @JvmStatic
    public static final void write$Self$domain_release(RevenueGraph revenueGraph0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(revenueGraph0.a, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, revenueGraph0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || !Intrinsics.areEqual(revenueGraph0.b, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 1, revenueGraph0.b);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || Double.compare(revenueGraph0.c, 0.0) != 0) {
            compositeEncoder0.encodeDoubleElement(serialDescriptor0, 2, revenueGraph0.c);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || revenueGraph0.d != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 3, revenueGraph0.d);
        }
    }
}

