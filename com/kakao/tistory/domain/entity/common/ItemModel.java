package com.kakao.tistory.domain.entity.common;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002%&B-\b\u0011\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001A\u0004\u0018\u00018\u0000\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0017\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00028\u0000¢\u0006\u0002\u0010\u000BJ\t\u0010\u0011\u001A\u00020\u0006HÆ\u0003J\u000E\u0010\u0012\u001A\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ(\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001A\u00020\u0006HÖ\u0001J@\u0010\u001A\u001A\u00020\u001B\"\u0004\b\u0001\u0010\u001C2\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u0002H\u001C0\u00002\u0006\u0010\u001E\u001A\u00020\u001F2\u0006\u0010 \u001A\u00020!2\f\u0010\"\u001A\b\u0012\u0004\u0012\u0002H\u001C0#HÁ\u0001¢\u0006\u0002\b$R\u0013\u0010\u0007\u001A\u00028\u0000¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010¨\u0006\'"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/ItemModel;", "T", "", "seen1", "", "status", "", "data", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/kakao/tistory/domain/entity/common/ItemModel;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "T0", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "write$Self$domain_release", "$serializer", "Companion", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class ItemModel {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0004B\u0015\b\u0017\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000E\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u000FHÖ\u0001¢\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\u001F\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003HÖ\u0001J\u0018\u0010\u0019\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u000FHÖ\u0001¢\u0006\u0002\u0010\u0010R\u0014\u0010\b\u001A\u00020\t8VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00010\u00068BXÂ\u0005¢\u0006\u0006\u001A\u0004\b\f\u0010\r¨\u0006\u001A"}, d2 = {"com/kakao/tistory/domain/entity/common/ItemModel.$serializer", "T", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "()V", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getTypeSerial0", "()Lkotlinx/serialization/KSerializer;", "childSerializers", "", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "typeParametersSerializers", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        private final PluginGeneratedSerialDescriptor descriptor;
        private final KSerializer typeSerial0;

        private .serializer() {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.entity.common.ItemModel", this, 2);
            pluginGeneratedSerialDescriptor0.addElement("status", true);
            pluginGeneratedSerialDescriptor0.addElement("data", false);
            this.descriptor = pluginGeneratedSerialDescriptor0;
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public .serializer(KSerializer kSerializer0) {
            Intrinsics.checkNotNullParameter(kSerializer0, "typeSerial0");
            this();
            this.typeSerial0 = kSerializer0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE, this.typeSerial0};
        }

        @NotNull
        public ItemModel deserialize(@NotNull Decoder decoder0) {
            int v;
            Object object0;
            String s;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            if(compositeDecoder0.decodeSequentially()) {
                s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                object0 = compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, this.typeSerial0, null);
                v = 3;
            }
            else {
                int v1 = 0;
                s = null;
                Object object1 = null;
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
                            object1 = compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, this.typeSerial0, object1);
                            v1 |= 2;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                object0 = object1;
                v = v1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new ItemModel(v, s, object0, null);
        }

        @Override  // kotlinx.serialization.DeserializationStrategy
        public Object deserialize(Decoder decoder0) {
            return this.deserialize(decoder0);
        }

        @Override  // kotlinx.serialization.KSerializer
        @NotNull
        public SerialDescriptor getDescriptor() {
            return this.descriptor;
        }

        private final KSerializer getTypeSerial0() {
            return this.typeSerial0;
        }

        public void serialize(@NotNull Encoder encoder0, @NotNull ItemModel itemModel0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(itemModel0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            ItemModel.write$Self$domain_release(itemModel0, compositeEncoder0, serialDescriptor0, this.typeSerial0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((ItemModel)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return new KSerializer[]{this.typeSerial0};
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u0002H\u00060\u0004HÆ\u0001¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/ItemModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "T0", "typeSerial0", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer(@NotNull KSerializer kSerializer0) {
            Intrinsics.checkNotNullParameter(kSerializer0, "typeSerial0");
            return new .serializer(kSerializer0);
        }
    }

    @JvmField
    @NotNull
    private static final SerialDescriptor $cachedDescriptor;
    @NotNull
    public static final Companion Companion;
    private final Object data;
    @NotNull
    private final String status;

    static {
        ItemModel.Companion = new Companion(null);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.entity.common.ItemModel", null, 2);
        pluginGeneratedSerialDescriptor0.addElement("status", true);
        pluginGeneratedSerialDescriptor0.addElement("data", false);
        ItemModel.$cachedDescriptor = pluginGeneratedSerialDescriptor0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public ItemModel(int v, String s, Object object0, SerializationConstructorMarker serializationConstructorMarker0) {
        if(2 != (v & 2)) {
            PluginExceptionsKt.throwMissingFieldException(v, 2, ItemModel.$cachedDescriptor);
        }
        super();
        this.status = (v & 1) == 0 ? "" : s;
        this.data = object0;
    }

    public ItemModel(@NotNull String s, Object object0) {
        Intrinsics.checkNotNullParameter(s, "status");
        super();
        this.status = s;
        this.data = object0;
    }

    public ItemModel(String s, Object object0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = "";
        }
        this(s, object0);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    public final Object component2() {
        return this.data;
    }

    @NotNull
    public final ItemModel copy(@NotNull String s, Object object0) {
        Intrinsics.checkNotNullParameter(s, "status");
        return new ItemModel(s, object0);
    }

    public static ItemModel copy$default(ItemModel itemModel0, String s, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            s = itemModel0.status;
        }
        if((v & 2) != 0) {
            object0 = itemModel0.data;
        }
        return itemModel0.copy(s, object0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ItemModel)) {
            return false;
        }
        return Intrinsics.areEqual(this.status, ((ItemModel)object0).status) ? Intrinsics.areEqual(this.data, ((ItemModel)object0).data) : false;
    }

    public final Object getData() {
        return this.data;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Override
    public int hashCode() {
        int v = this.status.hashCode();
        return this.data == null ? v * 0x1F : v * 0x1F + this.data.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "ItemModel(status=" + this.status + ", data=" + this.data + ")";
    }

    @JvmStatic
    public static final void write$Self$domain_release(ItemModel itemModel0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0, KSerializer kSerializer0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(itemModel0.status, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, itemModel0.status);
        }
        compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, kSerializer0, itemModel0.data);
    }
}

