package com.kakao.kandinsky.launcher;

import com.kakao.kandinsky.history.KPhotoKey;
import e.v;
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
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0011\u0012\u0006\u0010\n\u001A\u00020\u0006\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u000E\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001AJ\u0012\u0010\u001B\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001B\u0010\u001CJ4\u0010\u001D\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001F\u0010\u001AJ\u0010\u0010 \u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u001A\u0010$\u001A\u00020#2\b\u0010\"\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0018R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u001AR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u001C¨\u00061"}, d2 = {"Lcom/kakao/kandinsky/launcher/KandinskyOutputItem;", "", "Lcom/kakao/kandinsky/history/KPhotoKey;", "key", "", "resultBitmap", "", "errorCode", "<init>", "(Lcom/kakao/kandinsky/history/KPhotoKey;Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/kakao/kandinsky/history/KPhotoKey;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kandinsky_release", "(Lcom/kakao/kandinsky/launcher/KandinskyOutputItem;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/kakao/kandinsky/history/KPhotoKey;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "copy", "(Lcom/kakao/kandinsky/history/KPhotoKey;Ljava/lang/String;Ljava/lang/Integer;)Lcom/kakao/kandinsky/launcher/KandinskyOutputItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/kandinsky/history/KPhotoKey;", "getKey", "b", "Ljava/lang/String;", "getResultBitmap", "c", "Ljava/lang/Integer;", "getErrorCode", "Companion", "$serializer", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class KandinskyOutputItem {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/launcher/KandinskyOutputItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/launcher/KandinskyOutputItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/launcher/KandinskyOutputItem;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/launcher/KandinskyOutputItem;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public static final int $stable;
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer kandinskyOutputItem$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
            .serializer.INSTANCE = kandinskyOutputItem$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.launcher.KandinskyOutputItem", kandinskyOutputItem$$serializer0, 3);
            pluginGeneratedSerialDescriptor0.addElement("key", true);
            pluginGeneratedSerialDescriptor0.addElement("resultBitmap", true);
            pluginGeneratedSerialDescriptor0.addElement("errorCode", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] childSerializers() {
            return new KSerializer[]{BuiltinSerializersKt.getNullable(v.a), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
        }

        public KandinskyOutputItem deserialize(Decoder decoder0) {
            int v;
            String s1;
            Integer integer0;
            KPhotoKey kPhotoKey2;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KPhotoKey kPhotoKey0 = null;
            if(compositeDecoder0.decodeSequentially()) {
                KPhotoKey kPhotoKey1 = (KPhotoKey)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 0, v.a, null);
                String s = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 1, StringSerializer.INSTANCE, null);
                kPhotoKey2 = kPhotoKey1;
                integer0 = (Integer)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, IntSerializer.INSTANCE, null);
                s1 = s;
                v = 7;
            }
            else {
                int v1 = 0;
                String s2 = null;
                Integer integer1 = null;
                boolean z = true;
                while(z) {
                    int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            kPhotoKey0 = (KPhotoKey)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 0, v.a, kPhotoKey0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            s2 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 1, StringSerializer.INSTANCE, s2);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            integer1 = (Integer)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, IntSerializer.INSTANCE, integer1);
                            v1 |= 4;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                v = v1;
                kPhotoKey2 = kPhotoKey0;
                s1 = s2;
                integer0 = integer1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new KandinskyOutputItem(v, kPhotoKey2, s1, integer0, null);
        }

        @Override  // kotlinx.serialization.DeserializationStrategy
        public Object deserialize(Decoder decoder0) {
            return this.deserialize(decoder0);
        }

        @Override  // kotlinx.serialization.KSerializer
        public SerialDescriptor getDescriptor() {
            return .serializer.a;
        }

        public void serialize(Encoder encoder0, KandinskyOutputItem kandinskyOutputItem0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(kandinskyOutputItem0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            KandinskyOutputItem.write$Self$kandinsky_release(kandinskyOutputItem0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((KandinskyOutputItem)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/kandinsky/launcher/KandinskyOutputItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/launcher/KandinskyOutputItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "BITMAP_GENERATE_FAILED_ERROR_CODE", "I", "kandinsky_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    public static final int $stable = 0;
    public static final int BITMAP_GENERATE_FAILED_ERROR_CODE = 500;
    public static final Companion Companion;
    public final KPhotoKey a;
    public final String b;
    public final Integer c;

    static {
        KandinskyOutputItem.Companion = new Companion(null);
    }

    public KandinskyOutputItem() {
        this(null, null, null, 7, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public KandinskyOutputItem(int v, KPhotoKey kPhotoKey0, String s, Integer integer0, SerializationConstructorMarker serializationConstructorMarker0) {
        this.a = (v & 1) == 0 ? null : kPhotoKey0;
        this.b = (v & 2) == 0 ? null : s;
        if((v & 4) == 0) {
            this.c = null;
            return;
        }
        this.c = integer0;
    }

    public KandinskyOutputItem(KPhotoKey kPhotoKey0, String s, Integer integer0) {
        this.a = kPhotoKey0;
        this.b = s;
        this.c = integer0;
    }

    public KandinskyOutputItem(KPhotoKey kPhotoKey0, String s, Integer integer0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            kPhotoKey0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            integer0 = null;
        }
        this(kPhotoKey0, s, integer0);
    }

    public final KPhotoKey component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final Integer component3() {
        return this.c;
    }

    public final KandinskyOutputItem copy(KPhotoKey kPhotoKey0, String s, Integer integer0) {
        return new KandinskyOutputItem(kPhotoKey0, s, integer0);
    }

    public static KandinskyOutputItem copy$default(KandinskyOutputItem kandinskyOutputItem0, KPhotoKey kPhotoKey0, String s, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            kPhotoKey0 = kandinskyOutputItem0.a;
        }
        if((v & 2) != 0) {
            s = kandinskyOutputItem0.b;
        }
        if((v & 4) != 0) {
            integer0 = kandinskyOutputItem0.c;
        }
        return kandinskyOutputItem0.copy(kPhotoKey0, s, integer0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof KandinskyOutputItem)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((KandinskyOutputItem)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((KandinskyOutputItem)object0).b) ? Intrinsics.areEqual(this.c, ((KandinskyOutputItem)object0).c) : false;
    }

    public final Integer getErrorCode() {
        return this.c;
    }

    public final KPhotoKey getKey() {
        return this.a;
    }

    public final String getResultBitmap() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Integer integer0 = this.c;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public String toString() {
        return "KandinskyOutputItem(key=" + this.a + ", resultBitmap=" + this.b + ", errorCode=" + this.c + ")";
    }

    @JvmStatic
    public static final void write$Self$kandinsky_release(KandinskyOutputItem kandinskyOutputItem0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || kandinskyOutputItem0.a != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 0, v.a, kandinskyOutputItem0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || kandinskyOutputItem0.b != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 1, StringSerializer.INSTANCE, kandinskyOutputItem0.b);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || kandinskyOutputItem0.c != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 2, IntSerializer.INSTANCE, kandinskyOutputItem0.c);
        }
    }
}

