package com.kakao.kandinsky.core.kdphoto;

import a5.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000E\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0011\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B>\u0012\r\b\u0002\u0010\u0004\u001A\u00070\u0002\u00A2\u0006\u0002\b\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0005\u0012\b\b\u0002\u0010\t\u001A\u00020\u0005\u00A2\u0006\u0004\b\n\u0010\u000BBJ\b\u0011\u0012\u0006\u0010\r\u001A\u00020\f\u0012\r\u0010\u0004\u001A\t\u0018\u00010\u0002\u00A2\u0006\u0002\b\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u0011\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014H\u00C1\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u001B\u0010\u001C\u001A\u00070\u0002\u00A2\u0006\u0002\b\u0003H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001D\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001EJ\u0010\u0010 \u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001EJ\u0010\u0010!\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001EJJ\u0010$\u001A\u00020\u00002\r\b\u0002\u0010\u0004\u001A\u00070\u0002\u00A2\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005H\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010&\u001A\u00020%H\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\b(\u0010)J\u001A\u0010,\u001A\u00020+2\b\u0010*\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b,\u0010-R\"\u0010\u0004\u001A\u00070\u0002\u00A2\u0006\u0002\b\u00038\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\u001BR\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u0010\u001ER\u0017\u0010\u0007\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b4\u00102\u001A\u0004\b5\u0010\u001ER\u0017\u0010\b\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b6\u00102\u001A\u0004\b7\u0010\u001ER\u0017\u0010\t\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b8\u00102\u001A\u0004\b9\u0010\u001E\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006<"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "", "Landroidx/compose/ui/geometry/Size;", "Lkotlinx/serialization/Contextual;", "originalSize", "", "widthRatio", "rotate", "horizontalPaddingRatio", "verticalPaddingRatio", "<init>", "(JFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILandroidx/compose/ui/geometry/Size;FFFFLkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kdphoto_release", "(Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-NH-jbRc", "()J", "component1", "component2", "()F", "component3", "component4", "component5", "copy-_93gMUo", "(JFFFF)Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getOriginalSize-NH-jbRc", "b", "F", "getWidthRatio", "c", "getRotate", "d", "getHorizontalPaddingRatio", "e", "getVerticalPaddingRatio", "Companion", "$serializer", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class SignatureMetaData {
    @StabilityInferred(parameters = 1)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/core/kdphoto/SignatureMetaData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public static final int $stable;
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer signatureMetaData$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
            .serializer.INSTANCE = signatureMetaData$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.core.kdphoto.SignatureMetaData", signatureMetaData$$serializer0, 5);
            pluginGeneratedSerialDescriptor0.addElement("originalSize", true);
            pluginGeneratedSerialDescriptor0.addElement("widthRatio", true);
            pluginGeneratedSerialDescriptor0.addElement("rotate", true);
            pluginGeneratedSerialDescriptor0.addElement("horizontalPaddingRatio", true);
            pluginGeneratedSerialDescriptor0.addElement("verticalPaddingRatio", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{SignatureMetaData.f[0], FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE};
        }

        @NotNull
        public SignatureMetaData deserialize(@NotNull Decoder decoder0) {
            int v;
            float f5;
            float f4;
            float f3;
            float f2;
            Size size1;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = SignatureMetaData.f;
            if(compositeDecoder0.decodeSequentially()) {
                Size size0 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 0, arr_kSerializer[0], null);
                float f = compositeDecoder0.decodeFloatElement(serialDescriptor0, 1);
                float f1 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 2);
                size1 = size0;
                f2 = f;
                f3 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 3);
                f4 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 4);
                f5 = f1;
                v = 0x1F;
            }
            else {
                float f6 = 0.0f;
                float f7 = 0.0f;
                float f8 = 0.0f;
                int v1 = 0;
                Size size2 = null;
                float f9 = 0.0f;
                boolean z = true;
                while(z) {
                    int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            size2 = (Size)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 0, arr_kSerializer[0], size2);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            f6 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 1);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            f8 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 2);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            f9 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 3);
                            v1 |= 8;
                            break;
                        }
                        case 4: {
                            f7 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 4);
                            v1 |= 16;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                f2 = f6;
                f3 = f9;
                f4 = f7;
                f5 = f8;
                v = v1;
                size1 = size2;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new SignatureMetaData(v, size1, f2, f5, f3, f4, null, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull SignatureMetaData signatureMetaData0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(signatureMetaData0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            SignatureMetaData.write$Self$kdphoto_release(signatureMetaData0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((SignatureMetaData)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final long a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public static final KSerializer[] f;

    static {
        SignatureMetaData.Companion = new Companion(null);
        SignatureMetaData.f = new KSerializer[]{new ContextualSerializer(Reflection.getOrCreateKotlinClass(Size.class), null, new KSerializer[0]), null, null, null, null};
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public SignatureMetaData(int v, Size size0, float f, float f1, float f2, float f3, SerializationConstructorMarker serializationConstructorMarker0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = (v & 1) == 0 ? 0L : size0.unbox-impl();
        this.b = (v & 2) == 0 ? 0.0f : f;
        this.c = (v & 4) == 0 ? 0.0f : f1;
        this.d = (v & 8) == 0 ? 0.0f : f2;
        if((v & 16) == 0) {
            this.e = 0.0f;
            return;
        }
        this.e = f3;
    }

    public SignatureMetaData(long v, float f, float f1, float f2, float f3, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v1 & 1) == 0 ? v : 0L), ((v1 & 2) == 0 ? f : 0.0f), ((v1 & 4) == 0 ? f1 : 0.0f), ((v1 & 8) == 0 ? f2 : 0.0f), ((v1 & 16) == 0 ? f3 : 0.0f), null);
    }

    public SignatureMetaData(long v, float f, float f1, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = v;
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
    }

    public final long component1-NH-jbRc() {
        return this.a;
    }

    public final float component2() {
        return this.b;
    }

    public final float component3() {
        return this.c;
    }

    public final float component4() {
        return this.d;
    }

    public final float component5() {
        return this.e;
    }

    @NotNull
    public final SignatureMetaData copy-_93gMUo(long v, float f, float f1, float f2, float f3) {
        return new SignatureMetaData(v, f, f1, f2, f3, null);
    }

    public static SignatureMetaData copy-_93gMUo$default(SignatureMetaData signatureMetaData0, long v, float f, float f1, float f2, float f3, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = signatureMetaData0.a;
        }
        if((v1 & 2) != 0) {
            f = signatureMetaData0.b;
        }
        if((v1 & 4) != 0) {
            f1 = signatureMetaData0.c;
        }
        if((v1 & 8) != 0) {
            f2 = signatureMetaData0.d;
        }
        if((v1 & 16) != 0) {
            f3 = signatureMetaData0.e;
        }
        return signatureMetaData0.copy-_93gMUo(v, f, f1, f2, f3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SignatureMetaData)) {
            return false;
        }
        if(!Size.equals-impl0(this.a, ((SignatureMetaData)object0).a)) {
            return false;
        }
        if(Float.compare(this.b, ((SignatureMetaData)object0).b) != 0) {
            return false;
        }
        if(Float.compare(this.c, ((SignatureMetaData)object0).c) != 0) {
            return false;
        }
        return Float.compare(this.d, ((SignatureMetaData)object0).d) == 0 ? Float.compare(this.e, ((SignatureMetaData)object0).e) == 0 : false;
    }

    public final float getHorizontalPaddingRatio() {
        return this.d;
    }

    public final long getOriginalSize-NH-jbRc() {
        return this.a;
    }

    public final float getRotate() {
        return this.c;
    }

    public final float getVerticalPaddingRatio() {
        return this.e;
    }

    public final float getWidthRatio() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.e) + a.b(this.d, a.b(this.c, a.b(this.b, Size.hashCode-impl(this.a) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = b.v("SignatureMetaData(originalSize=", Size.toString-impl(this.a), ", widthRatio=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", rotate=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", horizontalPaddingRatio=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", verticalPaddingRatio=");
        return androidx.room.a.h(this.e, ")", stringBuilder0);
    }

    @JvmStatic
    public static final void write$Self$kdphoto_release(SignatureMetaData signatureMetaData0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Size.equals-impl0(signatureMetaData0.a, 0L)) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 0, SignatureMetaData.f[0], Size.box-impl(signatureMetaData0.a));
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || Float.compare(signatureMetaData0.b, 0.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 1, signatureMetaData0.b);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || Float.compare(signatureMetaData0.c, 0.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 2, signatureMetaData0.c);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || Float.compare(signatureMetaData0.d, 0.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 3, signatureMetaData0.d);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || Float.compare(signatureMetaData0.e, 0.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 4, signatureMetaData0.e);
        }
    }
}

