package com.kakao.tistory.domain.common;

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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u0000 (*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002)(B\u0017\u0012\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0011\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u000E\u0010\u0004\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000BJB\u0010\u0017\u001A\u00020\u0014\"\u0004\b\u0001\u0010\f2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00010\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001D\u001A\u00020\u001CHÖ\u0001¢\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001F\u0010 J\u001A\u0010#\u001A\u00020\"2\b\u0010!\u001A\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0019¨\u0006*"}, d2 = {"Lcom/kakao/tistory/domain/common/ItemListModel;", "T", "", "", "items", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "T0", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/common/ItemListModel;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/kakao/tistory/domain/common/ItemListModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getItems", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class ItemListModel {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0017\b\u0017\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\t\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001E\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ&\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0010\u001A\u00020\u000F2\f\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0015\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0014\u0010\u0019\u001A\u00020\u00168VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u001A"}, d2 = {"com/kakao/tistory/domain/common/ItemListModel.$serializer", "T", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/common/ItemListModel;", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/common/ItemListModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/common/ItemListModel;)V", "typeParametersSerializers", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public final PluginGeneratedSerialDescriptor a;
        public final KSerializer b;

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public .serializer(KSerializer kSerializer0) {
            Intrinsics.checkNotNullParameter(kSerializer0, "typeSerial0");
            super();
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.common.ItemListModel", this, 1);
            pluginGeneratedSerialDescriptor0.addElement("items", true);
            this.a = pluginGeneratedSerialDescriptor0;
            this.b = kSerializer0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{new ArrayListSerializer(this.b)};
        }

        @NotNull
        public ItemListModel deserialize(@NotNull Decoder decoder0) {
            List list0;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            int v = 1;
            if(compositeDecoder0.decodeSequentially()) {
                list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 0, new ArrayListSerializer(this.b), null);
            }
            else {
                int v1 = 0;
                list0 = null;
                boolean z = true;
                while(z) {
                    int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 0, new ArrayListSerializer(this.b), list0);
                            v1 = 1;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                v = v1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new ItemListModel(v, list0, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull ItemListModel itemListModel0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(itemListModel0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            ItemListModel.write$Self$domain_release(itemListModel0, compositeEncoder0, serialDescriptor0, this.b);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((ItemListModel)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return new KSerializer[]{this.b};
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J0\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0003\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/domain/common/ItemListModel$Companion;", "", "T0", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Lcom/kakao/tistory/domain/common/ItemListModel;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final List a;

    static {
        ItemListModel.Companion = new Companion(null);
        new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.common.ItemListModel", null, 1).addElement("items", true);
    }

    public ItemListModel() {
        this(null, 1, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public ItemListModel(int v, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
        if((v & 1) == 0) {
            this.a = CollectionsKt__CollectionsKt.emptyList();
            return;
        }
        this.a = list0;
    }

    public ItemListModel(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "items");
        super();
        this.a = list0;
    }

    public ItemListModel(List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        this(list0);
    }

    @NotNull
    public final List component1() {
        return this.a;
    }

    @NotNull
    public final ItemListModel copy(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "items");
        return new ItemListModel(list0);
    }

    public static ItemListModel copy$default(ItemListModel itemListModel0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = itemListModel0.a;
        }
        return itemListModel0.copy(list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ItemListModel ? Intrinsics.areEqual(this.a, ((ItemListModel)object0).a) : false;
    }

    @NotNull
    public final List getItems() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "ItemListModel(items=" + this.a + ")";
    }

    @JvmStatic
    public static final void write$Self$domain_release(ItemListModel itemListModel0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0, KSerializer kSerializer0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(itemListModel0.a, CollectionsKt__CollectionsKt.emptyList())) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 0, new ArrayListSerializer(kSerializer0), itemListModel0.a);
        }
    }
}

