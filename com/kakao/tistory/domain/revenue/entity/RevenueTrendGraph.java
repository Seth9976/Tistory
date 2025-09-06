package com.kakao.tistory.domain.revenue.entity;

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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B!\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0011\u0012\u0006\u0010\n\u001A\u00020\t\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u000E\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001AJ*\u0010\u001B\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001D\u0010\u0018J\u0010\u0010\u001E\u001A\u00020\tHÖ\u0001¢\u0006\u0004\b\u001E\u0010\u001FJ\u001A\u0010\"\u001A\u00020!2\b\u0010 \u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u0018R&\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\'\u0010(\u0012\u0004\b*\u0010+\u001A\u0004\b)\u0010\u001A¨\u0006."}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;", "", "", "lastUpdateTime", "", "Lcom/kakao/tistory/domain/revenue/entity/RevenueGraph;", "revenueGraphList", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLastUpdateTime", "b", "Ljava/util/List;", "getRevenueGraphList", "getRevenueGraphList$annotations", "()V", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class RevenueTrendGraph {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/revenue/entity/RevenueTrendGraph.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer revenueTrendGraph$$serializer0 = new .serializer();
            .serializer.INSTANCE = revenueTrendGraph$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.revenue.entity.RevenueTrendGraph", revenueTrendGraph$$serializer0, 2);
            pluginGeneratedSerialDescriptor0.addElement("lastUpdateTime", true);
            pluginGeneratedSerialDescriptor0.addElement("items", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer kSerializer0 = RevenueTrendGraph.c[1];
            return new KSerializer[]{StringSerializer.INSTANCE, kSerializer0};
        }

        @NotNull
        public RevenueTrendGraph deserialize(@NotNull Decoder decoder0) {
            int v;
            List list0;
            String s;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = RevenueTrendGraph.c;
            if(compositeDecoder0.decodeSequentially()) {
                s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                v = 3;
            }
            else {
                int v1 = 0;
                List list1 = null;
                String s1 = null;
                boolean z = true;
                while(z) {
                    int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], list1);
                            v1 |= 2;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                list0 = list1;
                s = s1;
                v = v1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new RevenueTrendGraph(v, s, list0, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull RevenueTrendGraph revenueTrendGraph0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(revenueTrendGraph0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            RevenueTrendGraph.write$Self$domain_release(revenueTrendGraph0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((RevenueTrendGraph)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/revenue/entity/RevenueTrendGraph;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final List b;
    public static final KSerializer[] c;

    static {
        RevenueTrendGraph.Companion = new Companion(null);
        RevenueTrendGraph.c = new KSerializer[]{null, new ArrayListSerializer(com.kakao.tistory.domain.revenue.entity.RevenueGraph..serializer.INSTANCE)};
    }

    public RevenueTrendGraph() {
        this(null, null, 3, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public RevenueTrendGraph(int v, String s, @SerialName("items") List list0, SerializationConstructorMarker serializationConstructorMarker0) {
        if((v & 1) == 0) {
            s = "";
        }
        this.a = s;
        if((v & 2) == 0) {
            this.b = CollectionsKt__CollectionsKt.emptyList();
            return;
        }
        this.b = list0;
    }

    public RevenueTrendGraph(@NotNull String s, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "lastUpdateTime");
        Intrinsics.checkNotNullParameter(list0, "revenueGraphList");
        super();
        this.a = s;
        this.b = list0;
    }

    public RevenueTrendGraph(String s, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = "";
        }
        if((v & 2) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        this(s, list0);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final List component2() {
        return this.b;
    }

    @NotNull
    public final RevenueTrendGraph copy(@NotNull String s, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "lastUpdateTime");
        Intrinsics.checkNotNullParameter(list0, "revenueGraphList");
        return new RevenueTrendGraph(s, list0);
    }

    public static RevenueTrendGraph copy$default(RevenueTrendGraph revenueTrendGraph0, String s, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            s = revenueTrendGraph0.a;
        }
        if((v & 2) != 0) {
            list0 = revenueTrendGraph0.b;
        }
        return revenueTrendGraph0.copy(s, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RevenueTrendGraph)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((RevenueTrendGraph)object0).a) ? Intrinsics.areEqual(this.b, ((RevenueTrendGraph)object0).b) : false;
    }

    @NotNull
    public final String getLastUpdateTime() {
        return this.a;
    }

    @NotNull
    public final List getRevenueGraphList() {
        return this.b;
    }

    @SerialName("items")
    public static void getRevenueGraphList$annotations() {
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "RevenueTrendGraph(lastUpdateTime=" + this.a + ", revenueGraphList=" + this.b + ")";
    }

    @JvmStatic
    public static final void write$Self$domain_release(RevenueTrendGraph revenueTrendGraph0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        KSerializer[] arr_kSerializer = RevenueTrendGraph.c;
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(revenueTrendGraph0.a, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, revenueTrendGraph0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || !Intrinsics.areEqual(revenueTrendGraph0.b, CollectionsKt__CollectionsKt.emptyList())) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], revenueTrendGraph0.b);
        }
    }
}

