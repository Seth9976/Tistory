package com.kakao.tistory.domain.common;

import com.kakao.tistory.domain.blog.entity.a;
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
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0087\b\u0018\u0000 7*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u000287B9\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0003\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\u00A2\u0006\u0004\b\t\u0010\nBG\b\u0011\u0012\u0006\u0010\u000B\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u00A2\u0006\u0004\b\t\u0010\u000EJB\u0010\u001A\u001A\u00020\u0017\"\u0004\b\u0001\u0010\u000F2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00132\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00010\u0015H\u00C1\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001B\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0012\u0010\u001D\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001CJ\u0010\u0010\u001E\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0016\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!JH\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007H\u00C6\u0001\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001A\u00020$H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010\'\u001A\u00020\u0003H\u00D6\u0001\u00A2\u0006\u0004\b\'\u0010\u001FJ\u001A\u0010*\u001A\u00020)2\b\u0010(\u001A\u0004\u0018\u00010\u0002H\u00D6\u0003\u00A2\u0006\u0004\b*\u0010+R\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u001CR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00038\u0006\u00A2\u0006\f\n\u0004\b/\u0010-\u001A\u0004\b0\u0010\u001CR\u0017\u0010\u0006\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u0010\u001FR\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u0010!\u00A8\u00069"}, d2 = {"Lcom/kakao/tistory/domain/common/PagingModel;", "T", "", "", "nextPage", "prevPage", "totalCount", "", "items", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "T0", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/common/PagingModel;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()I", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;ILjava/util/List;)Lcom/kakao/tistory/domain/common/PagingModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getNextPage", "b", "getPrevPage", "c", "I", "getTotalCount", "d", "Ljava/util/List;", "getItems", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class PagingModel {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0017\b\u0017\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\t\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001E\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ&\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0010\u001A\u00020\u000F2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0015\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0014\u0010\u0019\u001A\u00020\u00168VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"com/kakao/tistory/domain/common/PagingModel.$serializer", "T", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/common/PagingModel;", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/common/PagingModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/common/PagingModel;)V", "typeParametersSerializers", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public final PluginGeneratedSerialDescriptor a;
        public final KSerializer b;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public .serializer(KSerializer kSerializer0) {
            Intrinsics.checkNotNullParameter(kSerializer0, "typeSerial0");
            super();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.common.PagingModel", this, 4);
            pluginGeneratedSerialDescriptor0.addElement("nextPage", true);
            pluginGeneratedSerialDescriptor0.addElement("prevPage", true);
            pluginGeneratedSerialDescriptor0.addElement("totalCount", true);
            pluginGeneratedSerialDescriptor0.addElement("items", true);
            this.a = pluginGeneratedSerialDescriptor0;
            this.b = kSerializer0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE);
            KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE);
            ArrayListSerializer arrayListSerializer0 = new ArrayListSerializer(this.b);
            return new KSerializer[]{kSerializer0, kSerializer1, IntSerializer.INSTANCE, arrayListSerializer0};
        }

        @NotNull
        public PagingModel deserialize(@NotNull Decoder decoder0) {
            Integer integer3;
            int v2;
            int v1;
            List list0;
            Integer integer2;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            if(compositeDecoder0.decodeSequentially()) {
                Integer integer0 = (Integer)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 0, IntSerializer.INSTANCE, null);
                Integer integer1 = (Integer)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 1, IntSerializer.INSTANCE, null);
                int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 2);
                integer2 = integer1;
                list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, new ArrayListSerializer(this.b), null);
                v1 = v;
                v2 = 15;
                integer3 = integer0;
            }
            else {
                int v3 = 0;
                Integer integer4 = null;
                Integer integer5 = null;
                List list1 = null;
                int v4 = 0;
                boolean z = true;
                while(z) {
                    int v5 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v5) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            integer4 = (Integer)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 0, IntSerializer.INSTANCE, integer4);
                            v4 |= 1;
                            break;
                        }
                        case 1: {
                            integer5 = (Integer)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 1, IntSerializer.INSTANCE, integer5);
                            v4 |= 2;
                            break;
                        }
                        case 2: {
                            v3 = compositeDecoder0.decodeIntElement(serialDescriptor0, 2);
                            v4 |= 4;
                            break;
                        }
                        case 3: {
                            list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, new ArrayListSerializer(this.b), list1);
                            v4 |= 8;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v5);
                        }
                    }
                }
                v1 = v3;
                v2 = v4;
                integer3 = integer4;
                integer2 = integer5;
                list0 = list1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new PagingModel(v2, integer3, integer2, v1, list0, null);
        }

        @Override  // kotlinx.serialization.DeserializationStrategy
        public Object deserialize(Decoder decoder0) {
            return this.deserialize(decoder0);
        }

        @Override  // kotlinx.serialization.KSerializer
        @NotNull
        public SerialDescriptor getDescriptor() {
            return this.a;
        }

        public void serialize(@NotNull Encoder encoder0, @NotNull PagingModel pagingModel0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(pagingModel0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            PagingModel.write$Self$domain_release(pagingModel0, compositeEncoder0, serialDescriptor0, this.b);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((PagingModel)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return new KSerializer[]{this.b};
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J0\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0003\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/domain/common/PagingModel$Companion;", "", "T0", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Lcom/kakao/tistory/domain/common/PagingModel;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer(@NotNull KSerializer kSerializer0) {
            Intrinsics.checkNotNullParameter(kSerializer0, "typeSerial0");
            return new .serializer(kSerializer0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Integer a;
    public final Integer b;
    public final int c;
    public final List d;

    static {
        PagingModel.Companion = new Companion(null);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.common.PagingModel", null, 4);
        pluginGeneratedSerialDescriptor0.addElement("nextPage", true);
        pluginGeneratedSerialDescriptor0.addElement("prevPage", true);
        pluginGeneratedSerialDescriptor0.addElement("totalCount", true);
        pluginGeneratedSerialDescriptor0.addElement("items", true);
    }

    public PagingModel() {
        this(null, null, 0, null, 15, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public PagingModel(int v, Integer integer0, Integer integer1, int v1, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
        this.a = (v & 1) == 0 ? null : integer0;
        this.b = (v & 2) == 0 ? null : integer1;
        this.c = (v & 4) == 0 ? 0 : v1;
        if((v & 8) == 0) {
            this.d = CollectionsKt__CollectionsKt.emptyList();
            return;
        }
        this.d = list0;
    }

    public PagingModel(@Nullable Integer integer0, @Nullable Integer integer1, int v, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "items");
        super();
        this.a = integer0;
        this.b = integer1;
        this.c = v;
        this.d = list0;
    }

    public PagingModel(Integer integer0, Integer integer1, int v, List list0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            integer0 = null;
        }
        if((v1 & 2) != 0) {
            integer1 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        this(integer0, integer1, v, list0);
    }

    @Nullable
    public final Integer component1() {
        return this.a;
    }

    @Nullable
    public final Integer component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    @NotNull
    public final List component4() {
        return this.d;
    }

    @NotNull
    public final PagingModel copy(@Nullable Integer integer0, @Nullable Integer integer1, int v, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "items");
        return new PagingModel(integer0, integer1, v, list0);
    }

    public static PagingModel copy$default(PagingModel pagingModel0, Integer integer0, Integer integer1, int v, List list0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            integer0 = pagingModel0.a;
        }
        if((v1 & 2) != 0) {
            integer1 = pagingModel0.b;
        }
        if((v1 & 4) != 0) {
            v = pagingModel0.c;
        }
        if((v1 & 8) != 0) {
            list0 = pagingModel0.d;
        }
        return pagingModel0.copy(integer0, integer1, v, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PagingModel)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((PagingModel)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((PagingModel)object0).b)) {
            return false;
        }
        return this.c == ((PagingModel)object0).c ? Intrinsics.areEqual(this.d, ((PagingModel)object0).d) : false;
    }

    @NotNull
    public final List getItems() {
        return this.d;
    }

    @Nullable
    public final Integer getNextPage() {
        return this.a;
    }

    @Nullable
    public final Integer getPrevPage() {
        return this.b;
    }

    public final int getTotalCount() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Integer integer0 = this.b;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return this.d.hashCode() + a.a(this.c, (v1 * 0x1F + v) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "PagingModel(nextPage=" + this.a + ", prevPage=" + this.b + ", totalCount=" + this.c + ", items=" + this.d + ")";
    }

    @JvmStatic
    public static final void write$Self$domain_release(PagingModel pagingModel0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0, KSerializer kSerializer0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || pagingModel0.a != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 0, IntSerializer.INSTANCE, pagingModel0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || pagingModel0.b != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 1, IntSerializer.INSTANCE, pagingModel0.b);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || pagingModel0.c != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 2, pagingModel0.c);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(pagingModel0.d, CollectionsKt__CollectionsKt.emptyList())) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 3, new ArrayListSerializer(kSerializer0), pagingModel0.d);
        }
    }
}

