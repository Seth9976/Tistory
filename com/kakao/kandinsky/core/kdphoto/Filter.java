package com.kakao.kandinsky.core.kdphoto;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.k;
import kotlin.collections.x;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Immutable
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u000F\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u00A2\u0006\u0004\b\b\u0010\tB?\b\u0011\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u00A2\u0006\u0004\b\b\u0010\u000EJ(\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u00C1\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0019J\u0016\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ4\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\u000E\b\u0002\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00C6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0019J\u0010\u0010 \u001A\u00020\nH\u00D6\u0001\u00A2\u0006\u0004\b \u0010!J\u001A\u0010$\u001A\u00020#2\b\u0010\"\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010\'\u001A\u0004\b*\u0010\u0019R\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010\u001CR\u0011\u0010.\u001A\u00020#8F\u00A2\u0006\u0006\u001A\u0004\b.\u0010/\u00A8\u00062"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Filter;", "", "", "alias", "filterId", "", "Lcom/kakao/kandinsky/core/kdphoto/FilterAdjustment;", "adjustments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kdphoto_release", "(Lcom/kakao/kandinsky/core/kdphoto/Filter;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/kakao/kandinsky/core/kdphoto/Filter;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAlias", "b", "getFilterId", "c", "Ljava/util/List;", "getAdjustments", "isOriginalFilter", "()Z", "Companion", "$serializer", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class Filter {
    @StabilityInferred(parameters = 1)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/core/kdphoto/Filter.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/core/kdphoto/Filter;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/core/kdphoto/Filter;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public static final int $stable;
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer filter$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
            .serializer.INSTANCE = filter$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.core.kdphoto.Filter", filter$$serializer0, 3);
            pluginGeneratedSerialDescriptor0.addElement("alias", false);
            pluginGeneratedSerialDescriptor0.addElement("filterId", false);
            pluginGeneratedSerialDescriptor0.addElement("adjustments", false);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer kSerializer0 = Filter.d[2];
            return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer0};
        }

        @NotNull
        public Filter deserialize(@NotNull Decoder decoder0) {
            String s4;
            int v;
            String s3;
            List list0;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = Filter.d;
            String s = null;
            if(compositeDecoder0.decodeSequentially()) {
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], null);
                s3 = s1;
                v = 7;
                s4 = s2;
            }
            else {
                int v1 = 0;
                String s5 = null;
                List list1 = null;
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
                            s5 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], list1);
                            v1 |= 4;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                v = v1;
                s3 = s;
                s4 = s5;
                list0 = list1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new Filter(v, s3, s4, list0, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull Filter filter0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(filter0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            Filter.write$Self$kdphoto_release(filter0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((Filter)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\tR\u0014\u0010\u000B\u001A\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Filter$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "serializer", "()Lkotlinx/serialization/KSerializer;", "default", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "getDefault", "()Lcom/kakao/kandinsky/core/kdphoto/Filter;", "", "ORIGINAL_FILTER_ID", "Ljava/lang/String;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Filter getDefault() {
            return Filter.e;
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final String a;
    public final String b;
    public final List c;
    public static final KSerializer[] d;
    public static final Filter e;

    static {
        Filter.Companion = new Companion(null);
        Filter.d = new KSerializer[]{null, null, new ArrayListSerializer(com.kakao.kandinsky.core.kdphoto.FilterAdjustment..serializer.INSTANCE)};
        Filter.e = new Filter("원본", "original", k.listOf(new FilterAdjustment(x.emptyMap(), "1", "basic")));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public Filter(int v, String s, String s1, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
        if(7 != (v & 7)) {
            PluginExceptionsKt.throwMissingFieldException(v, 7, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = s;
        this.b = s1;
        this.c = list0;
    }

    public Filter(@NotNull String s, @NotNull String s1, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "alias");
        Intrinsics.checkNotNullParameter(s1, "filterId");
        Intrinsics.checkNotNullParameter(list0, "adjustments");
        super();
        this.a = s;
        this.b = s1;
        this.c = list0;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final List component3() {
        return this.c;
    }

    @NotNull
    public final Filter copy(@NotNull String s, @NotNull String s1, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "alias");
        Intrinsics.checkNotNullParameter(s1, "filterId");
        Intrinsics.checkNotNullParameter(list0, "adjustments");
        return new Filter(s, s1, list0);
    }

    public static Filter copy$default(Filter filter0, String s, String s1, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            s = filter0.a;
        }
        if((v & 2) != 0) {
            s1 = filter0.b;
        }
        if((v & 4) != 0) {
            list0 = filter0.c;
        }
        return filter0.copy(s, s1, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Filter)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((Filter)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((Filter)object0).b) ? Intrinsics.areEqual(this.c, ((Filter)object0).c) : false;
    }

    @NotNull
    public final List getAdjustments() {
        return this.c;
    }

    @NotNull
    public final String getAlias() {
        return this.a;
    }

    @NotNull
    public final String getFilterId() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.c.hashCode() + q.c(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    public final boolean isOriginalFilter() {
        return Intrinsics.areEqual(this.b, "original");
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Filter(alias=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", filterId=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", adjustments=");
        return a.e(stringBuilder0, this.c, ")");
    }

    @JvmStatic
    public static final void write$Self$kdphoto_release(Filter filter0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        compositeEncoder0.encodeStringElement(serialDescriptor0, 0, filter0.a);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 1, filter0.b);
        compositeEncoder0.encodeSerializableElement(serialDescriptor0, 2, Filter.d[2], filter0.c);
    }
}

