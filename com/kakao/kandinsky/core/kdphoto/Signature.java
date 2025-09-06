package com.kakao.kandinsky.core.kdphoto;

import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00172\u00020\u0001:\u0003\u0017\u0018\u0019B\u001B\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000E\u001A\u00020\r2\u0006\u0010\b\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BHÇ\u0001¢\u0006\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0012\u001A\u00020\u00028&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001A\u00020\u00138&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015\u0082\u0001\u0002\u001A\u001B¨\u0006\u001C"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Signature;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Relative;", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/kakao/kandinsky/core/kdphoto/Signature;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getNo", "()I", "no", "Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "getMetaData", "()Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "metaData", "Companion", "Image", "Text", "Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;", "Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public abstract class Signature implements Relative {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Signature$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer)Signature.a.getValue();
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000F\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B-\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BB?\b\u0011\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\r\u00A2\u0006\u0004\b\n\u0010\u000FJ(\u0010\u0018\u001A\u00020\u00152\u0006\u0010\u0010\u001A\u00020\u00002\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u0013H\u00C1\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J8\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bH\u00C6\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b#\u0010\u001CJ\u0010\u0010$\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b$\u0010\u001AJ\u001A\u0010(\u001A\u00020\'2\b\u0010&\u001A\u0004\u0018\u00010%H\u00D6\u0003\u00A2\u0006\u0004\b(\u0010)R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010\u001AR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u001CR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001ER\u001A\u0010\t\u001A\u00020\b8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010 \u00A8\u00068"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "", "no", "", "uri", "", "alpha", "Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "metaData", "<init>", "(ILjava/lang/String;FLcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;FLcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kdphoto_release", "(Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()F", "component4", "()Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "copy", "(ILjava/lang/String;FLcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;)Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "getNo", "c", "Ljava/lang/String;", "getUri", "d", "F", "getAlpha", "e", "Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "getMetaData", "Companion", "$serializer", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class Image extends Signature {
        @StabilityInferred(parameters = 1)
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/core/kdphoto/Signature.Image.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class .serializer implements GeneratedSerializer {
            public static final int $stable;
            @NotNull
            public static final .serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                .serializer signature$Image$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
                .serializer.INSTANCE = signature$Image$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.core.kdphoto.Signature.Image", signature$Image$$serializer0, 4);
                pluginGeneratedSerialDescriptor0.addElement("no", true);
                pluginGeneratedSerialDescriptor0.addElement("uri", false);
                pluginGeneratedSerialDescriptor0.addElement("alpha", true);
                pluginGeneratedSerialDescriptor0.addElement("metaData", true);
                .serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                return new KSerializer[]{IntSerializer.INSTANCE, StringSerializer.INSTANCE, FloatSerializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.SignatureMetaData..serializer.INSTANCE};
            }

            @NotNull
            public Image deserialize(@NotNull Decoder decoder0) {
                int v2;
                String s1;
                float f1;
                SignatureMetaData signatureMetaData0;
                int v1;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                if(compositeDecoder0.decodeSequentially()) {
                    int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                    String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                    float f = compositeDecoder0.decodeFloatElement(serialDescriptor0, 2);
                    v1 = v;
                    signatureMetaData0 = (SignatureMetaData)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, com.kakao.kandinsky.core.kdphoto.SignatureMetaData..serializer.INSTANCE, null);
                    f1 = f;
                    s1 = s;
                    v2 = 15;
                }
                else {
                    int v3 = 0;
                    String s2 = null;
                    SignatureMetaData signatureMetaData1 = null;
                    float f2 = 0.0f;
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
                                v4 = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                                v3 |= 1;
                                break;
                            }
                            case 1: {
                                s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                                v3 |= 2;
                                break;
                            }
                            case 2: {
                                f2 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 2);
                                v3 |= 4;
                                break;
                            }
                            case 3: {
                                signatureMetaData1 = (SignatureMetaData)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, com.kakao.kandinsky.core.kdphoto.SignatureMetaData..serializer.INSTANCE, signatureMetaData1);
                                v3 |= 8;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v5);
                            }
                        }
                    }
                    v1 = v4;
                    f1 = f2;
                    v2 = v3;
                    s1 = s2;
                    signatureMetaData0 = signatureMetaData1;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Image(v2, v1, s1, f1, signatureMetaData0, null);
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

            public void serialize(@NotNull Encoder encoder0, @NotNull Image signature$Image0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(signature$Image0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Image.write$Self$kdphoto_release(signature$Image0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((Image)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Signature$Image$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Signature$Image;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.kandinsky.core.kdphoto.Signature.Image.Companion {
            public com.kakao.kandinsky.core.kdphoto.Signature.Image.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return .serializer.INSTANCE;
            }
        }

        public static final int $stable;
        @NotNull
        public static final com.kakao.kandinsky.core.kdphoto.Signature.Image.Companion Companion;
        public final int b;
        public final String c;
        public final float d;
        public final SignatureMetaData e;

        static {
            Image.Companion = new com.kakao.kandinsky.core.kdphoto.Signature.Image.Companion(null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Image(int v, int v1, String s, float f, SignatureMetaData signatureMetaData0, SerializationConstructorMarker serializationConstructorMarker0) {
            if(2 != (v & 2)) {
                PluginExceptionsKt.throwMissingFieldException(v, 2, .serializer.INSTANCE.getDescriptor());
            }
            super(v, serializationConstructorMarker0);
            if((v & 1) == 0) {
                v1 = 0;
            }
            this.b = v1;
            this.c = s;
            this.d = (v & 4) == 0 ? 100.0f : f;
            if((v & 8) == 0) {
                this.e = new SignatureMetaData(0L, 0.0f, 0.0f, 0.0f, 0.0f, 0x1F, null);
                return;
            }
            this.e = signatureMetaData0;
        }

        public Image(int v, @NotNull String s, float f, @NotNull SignatureMetaData signatureMetaData0) {
            Intrinsics.checkNotNullParameter(s, "uri");
            Intrinsics.checkNotNullParameter(signatureMetaData0, "metaData");
            super(null);
            this.b = v;
            this.c = s;
            this.d = f;
            this.e = signatureMetaData0;
        }

        public Image(int v, String s, float f, SignatureMetaData signatureMetaData0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = 0;
            }
            if((v1 & 4) != 0) {
                f = 100.0f;
            }
            if((v1 & 8) != 0) {
                signatureMetaData0 = new SignatureMetaData(0L, 0.0f, 0.0f, 0.0f, 0.0f, 0x1F, null);
            }
            this(v, s, f, signatureMetaData0);
        }

        public final int component1() {
            return this.b;
        }

        @NotNull
        public final String component2() {
            return this.c;
        }

        public final float component3() {
            return this.d;
        }

        @NotNull
        public final SignatureMetaData component4() {
            return this.e;
        }

        @NotNull
        public final Image copy(int v, @NotNull String s, float f, @NotNull SignatureMetaData signatureMetaData0) {
            Intrinsics.checkNotNullParameter(s, "uri");
            Intrinsics.checkNotNullParameter(signatureMetaData0, "metaData");
            return new Image(v, s, f, signatureMetaData0);
        }

        public static Image copy$default(Image signature$Image0, int v, String s, float f, SignatureMetaData signatureMetaData0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = signature$Image0.b;
            }
            if((v1 & 2) != 0) {
                s = signature$Image0.c;
            }
            if((v1 & 4) != 0) {
                f = signature$Image0.d;
            }
            if((v1 & 8) != 0) {
                signatureMetaData0 = signature$Image0.e;
            }
            return signature$Image0.copy(v, s, f, signatureMetaData0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Image)) {
                return false;
            }
            if(this.b != ((Image)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Image)object0).c)) {
                return false;
            }
            return Float.compare(this.d, ((Image)object0).d) == 0 ? Intrinsics.areEqual(this.e, ((Image)object0).e) : false;
        }

        public final float getAlpha() {
            return this.d;
        }

        @Override  // com.kakao.kandinsky.core.kdphoto.Signature
        @NotNull
        public SignatureMetaData getMetaData() {
            return this.e;
        }

        @Override  // com.kakao.kandinsky.core.kdphoto.Signature
        public int getNo() {
            return this.b;
        }

        @NotNull
        public final String getUri() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return this.e.hashCode() + a.b(this.d, q.c(this.b * 0x1F, 0x1F, this.c), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            return "Image(no=" + this.b + ", uri=" + this.c + ", alpha=" + this.d + ", metaData=" + this.e + ")";
        }

        @JvmStatic
        public static final void write$Self$kdphoto_release(Image signature$Image0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || signature$Image0.getNo() != 0) {
                compositeEncoder0.encodeIntElement(serialDescriptor0, 0, signature$Image0.getNo());
            }
            compositeEncoder0.encodeStringElement(serialDescriptor0, 1, signature$Image0.c);
            boolean z = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2);
            float f = signature$Image0.d;
            if(z || Float.compare(f, 100.0f) != 0) {
                compositeEncoder0.encodeFloatElement(serialDescriptor0, 2, f);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(signature$Image0.getMetaData(), new SignatureMetaData(0L, 0.0f, 0.0f, 0.0f, 0.0f, 0x1F, null))) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 3, com.kakao.kandinsky.core.kdphoto.SignatureMetaData..serializer.INSTANCE, signature$Image0.getMetaData());
            }
        }
    }

    @Immutable
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B+\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BBI\b\u0011\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u0011\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014H\u00C1\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001F\u001A\u00020\u001C2\u0006\u0010\u001B\u001A\u00020\u001A\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J8\u0010(\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\bH\u00C6\u0001\u00A2\u0006\u0004\b(\u0010)J\u0010\u0010+\u001A\u00020*H\u00D6\u0001\u00A2\u0006\u0004\b+\u0010,J\u0010\u0010-\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b-\u0010!J\u001A\u00100\u001A\u00020\u00062\b\u0010/\u001A\u0004\u0018\u00010.H\u00D6\u0003\u00A2\u0006\u0004\b0\u00101R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010!R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010#R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010%R\u001A\u0010\t\u001A\u00020\b8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010\'R\u0017\u0010\r\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b>\u00106\u001A\u0004\b?\u0010#\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006B"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "", "no", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "editTextData", "", "watermark", "Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "metaData", "<init>", "(ILcom/kakao/kandinsky/core/kdphoto/TextData;ZLcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;)V", "seen1", "textData", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILcom/kakao/kandinsky/core/kdphoto/TextData;ZLcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;Lcom/kakao/kandinsky/core/kdphoto/TextData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kdphoto_release", "(Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Landroidx/compose/ui/geometry/Size;", "size", "Lcom/kakao/kandinsky/core/kdphoto/Signature$Text$Companion$WatermarkDrawData;", "getWatermarkDrawData-uvyYCjk", "(J)Lcom/kakao/kandinsky/core/kdphoto/Signature$Text$Companion$WatermarkDrawData;", "getWatermarkDrawData", "component1", "()I", "component2", "()Lcom/kakao/kandinsky/core/kdphoto/TextData;", "component3", "()Z", "component4", "()Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "copy", "(ILcom/kakao/kandinsky/core/kdphoto/TextData;ZLcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;)Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "I", "getNo", "c", "Lcom/kakao/kandinsky/core/kdphoto/TextData;", "getEditTextData", "d", "Z", "getWatermark", "e", "Lcom/kakao/kandinsky/core/kdphoto/SignatureMetaData;", "getMetaData", "f", "getTextData", "Companion", "$serializer", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class Text extends Signature {
        @StabilityInferred(parameters = 1)
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/core/kdphoto/Signature.Text.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.kandinsky.core.kdphoto.Signature.Text..serializer implements GeneratedSerializer {
            public static final int $stable;
            @NotNull
            public static final com.kakao.kandinsky.core.kdphoto.Signature.Text..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.kandinsky.core.kdphoto.Signature.Text..serializer signature$Text$$serializer0 = new com.kakao.kandinsky.core.kdphoto.Signature.Text..serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
                com.kakao.kandinsky.core.kdphoto.Signature.Text..serializer.INSTANCE = signature$Text$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.core.kdphoto.Signature.Text", signature$Text$$serializer0, 5);
                pluginGeneratedSerialDescriptor0.addElement("no", true);
                pluginGeneratedSerialDescriptor0.addElement("editTextData", false);
                pluginGeneratedSerialDescriptor0.addElement("watermark", false);
                pluginGeneratedSerialDescriptor0.addElement("metaData", true);
                pluginGeneratedSerialDescriptor0.addElement("textData", true);
                com.kakao.kandinsky.core.kdphoto.Signature.Text..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                return new KSerializer[]{IntSerializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.TextData..serializer.INSTANCE, BooleanSerializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.SignatureMetaData..serializer.INSTANCE, com.kakao.kandinsky.core.kdphoto.TextData..serializer.INSTANCE};
            }

            @NotNull
            public Text deserialize(@NotNull Decoder decoder0) {
                int v2;
                TextData textData2;
                boolean z1;
                TextData textData1;
                SignatureMetaData signatureMetaData0;
                int v1;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                if(compositeDecoder0.decodeSequentially()) {
                    int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                    TextData textData0 = (TextData)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, com.kakao.kandinsky.core.kdphoto.TextData..serializer.INSTANCE, null);
                    boolean z = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 2);
                    v1 = v;
                    signatureMetaData0 = (SignatureMetaData)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, com.kakao.kandinsky.core.kdphoto.SignatureMetaData..serializer.INSTANCE, null);
                    textData1 = (TextData)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, com.kakao.kandinsky.core.kdphoto.TextData..serializer.INSTANCE, null);
                    z1 = z;
                    textData2 = textData0;
                    v2 = 0x1F;
                }
                else {
                    int v3 = 0;
                    int v4 = 0;
                    TextData textData3 = null;
                    SignatureMetaData signatureMetaData1 = null;
                    TextData textData4 = null;
                    boolean z2 = false;
                    boolean z3 = true;
                    while(z3) {
                        int v5 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                        switch(v5) {
                            case -1: {
                                z3 = false;
                                break;
                            }
                            case 0: {
                                v3 = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                                v4 |= 1;
                                break;
                            }
                            case 1: {
                                textData3 = (TextData)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, com.kakao.kandinsky.core.kdphoto.TextData..serializer.INSTANCE, textData3);
                                v4 |= 2;
                                break;
                            }
                            case 2: {
                                z2 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 2);
                                v4 |= 4;
                                break;
                            }
                            case 3: {
                                signatureMetaData1 = (SignatureMetaData)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, com.kakao.kandinsky.core.kdphoto.SignatureMetaData..serializer.INSTANCE, signatureMetaData1);
                                v4 |= 8;
                                break;
                            }
                            case 4: {
                                textData4 = (TextData)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, com.kakao.kandinsky.core.kdphoto.TextData..serializer.INSTANCE, textData4);
                                v4 |= 16;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v5);
                            }
                        }
                    }
                    v1 = v3;
                    z1 = z2;
                    v2 = v4;
                    textData2 = textData3;
                    signatureMetaData0 = signatureMetaData1;
                    textData1 = textData4;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Text(v2, v1, textData2, z1, signatureMetaData0, textData1, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.kandinsky.core.kdphoto.Signature.Text..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Text signature$Text0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(signature$Text0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Text.write$Self$kdphoto_release(signature$Text0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((Text)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nJ\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001A\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001A\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\u000B"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Signature$Text$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "HEIGHT_RATIO", "F", "PADDING_RATIO", "WatermarkDrawData", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.kandinsky.core.kdphoto.Signature.Text.Companion {
            @StabilityInferred(parameters = 1)
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000BJ\u0016\u0010\u000F\u001A\u00020\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u0011\u001A\u00020\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000EJ;\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0005HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001A\u0004\b#\u0010\u000BR\u001D\u0010\u0006\u001A\u00020\u00058\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u000ER\u001D\u0010\u0007\u001A\u00020\u00058\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\'\u0010%\u001A\u0004\b(\u0010\u000E\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006)"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Signature$Text$Companion$WatermarkDrawData;", "", "", "padding", "signScale", "Landroidx/compose/ui/geometry/Size;", "signSize", "boundsSize", "<init>", "(FFJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()F", "component2", "component3-NH-jbRc", "()J", "component3", "component4-NH-jbRc", "component4", "copy-1k2P0P4", "(FFJJ)Lcom/kakao/kandinsky/core/kdphoto/Signature$Text$Companion$WatermarkDrawData;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getPadding", "b", "getSignScale", "c", "J", "getSignSize-NH-jbRc", "d", "getBoundsSize-NH-jbRc", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
            public static final class WatermarkDrawData {
                public static final int $stable;
                public final float a;
                public final float b;
                public final long c;
                public final long d;

                public WatermarkDrawData(float f, float f1, long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
                    this.a = f;
                    this.b = f1;
                    this.c = v;
                    this.d = v1;
                }

                public final float component1() {
                    return this.a;
                }

                public final float component2() {
                    return this.b;
                }

                public final long component3-NH-jbRc() {
                    return this.c;
                }

                public final long component4-NH-jbRc() {
                    return this.d;
                }

                @NotNull
                public final WatermarkDrawData copy-1k2P0P4(float f, float f1, long v, long v1) {
                    return new WatermarkDrawData(f, f1, v, v1, null);
                }

                public static WatermarkDrawData copy-1k2P0P4$default(WatermarkDrawData signature$Text$Companion$WatermarkDrawData0, float f, float f1, long v, long v1, int v2, Object object0) {
                    if((v2 & 1) != 0) {
                        f = signature$Text$Companion$WatermarkDrawData0.a;
                    }
                    if((v2 & 2) != 0) {
                        f1 = signature$Text$Companion$WatermarkDrawData0.b;
                    }
                    if((v2 & 4) != 0) {
                        v = signature$Text$Companion$WatermarkDrawData0.c;
                    }
                    if((v2 & 8) != 0) {
                        v1 = signature$Text$Companion$WatermarkDrawData0.d;
                    }
                    return signature$Text$Companion$WatermarkDrawData0.copy-1k2P0P4(f, f1, v, v1);
                }

                @Override
                public boolean equals(@Nullable Object object0) {
                    if(this == object0) {
                        return true;
                    }
                    if(!(object0 instanceof WatermarkDrawData)) {
                        return false;
                    }
                    if(Float.compare(this.a, ((WatermarkDrawData)object0).a) != 0) {
                        return false;
                    }
                    if(Float.compare(this.b, ((WatermarkDrawData)object0).b) != 0) {
                        return false;
                    }
                    return Size.equals-impl0(this.c, ((WatermarkDrawData)object0).c) ? Size.equals-impl0(this.d, ((WatermarkDrawData)object0).d) : false;
                }

                public final long getBoundsSize-NH-jbRc() {
                    return this.d;
                }

                public final float getPadding() {
                    return this.a;
                }

                public final float getSignScale() {
                    return this.b;
                }

                public final long getSignSize-NH-jbRc() {
                    return this.c;
                }

                @Override
                public int hashCode() {
                    return Size.hashCode-impl(this.d) + (Size.hashCode-impl(this.c) + a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F)) * 0x1F;
                }

                @Override
                @NotNull
                public String toString() {
                    String s = Size.toString-impl(this.c);
                    String s1 = Size.toString-impl(this.d);
                    StringBuilder stringBuilder0 = new StringBuilder("WatermarkDrawData(padding=");
                    stringBuilder0.append(this.a);
                    stringBuilder0.append(", signScale=");
                    stringBuilder0.append(this.b);
                    stringBuilder0.append(", signSize=");
                    stringBuilder0.append(s);
                    stringBuilder0.append(", boundsSize=");
                    return a.o(stringBuilder0, s1, ")");
                }
            }

            public com.kakao.kandinsky.core.kdphoto.Signature.Text.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.kandinsky.core.kdphoto.Signature.Text..serializer.INSTANCE;
            }
        }

        public static final int $stable;
        @NotNull
        public static final com.kakao.kandinsky.core.kdphoto.Signature.Text.Companion Companion;
        public final int b;
        public final TextData c;
        public final boolean d;
        public final SignatureMetaData e;
        public final TextData f;

        static {
            Text.Companion = new com.kakao.kandinsky.core.kdphoto.Signature.Text.Companion(null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Text(int v, int v1, TextData textData0, boolean z, SignatureMetaData signatureMetaData0, TextData textData1, SerializationConstructorMarker serializationConstructorMarker0) {
            TextData textData2;
            if(6 != (v & 6)) {
                PluginExceptionsKt.throwMissingFieldException(v, 6, com.kakao.kandinsky.core.kdphoto.Signature.Text..serializer.INSTANCE.getDescriptor());
            }
            super(v, serializationConstructorMarker0);
            this.b = (v & 1) == 0 ? 0 : v1;
            this.c = textData0;
            this.d = z;
            this.e = (v & 8) == 0 ? new SignatureMetaData(0L, 0.0f, 0.0f, 0.0f, 0.0f, 0x1F, null) : signatureMetaData0;
            if((v & 16) == 0) {
                textData2 = z ? TextData.copy-A15cKkk$default(textData0, null, 0xFF99999900000000L, 30.0f, 0xFF00000000000000L, 0.0f, 0L, 0L, false, false, false, 3, null, 0.0f, 0.0f, 0x3061, null) : textData0;
            }
            else {
                textData2 = textData1;
            }
            this.f = textData2;
        }

        public Text(int v, @NotNull TextData textData0, boolean z, @NotNull SignatureMetaData signatureMetaData0) {
            TextData textData1 = textData0;
            Intrinsics.checkNotNullParameter(textData1, "editTextData");
            Intrinsics.checkNotNullParameter(signatureMetaData0, "metaData");
            super(null);
            this.b = v;
            this.c = textData1;
            this.d = z;
            this.e = signatureMetaData0;
            if(z) {
                textData1 = TextData.copy-A15cKkk$default(textData0, null, 0xFF99999900000000L, 30.0f, 0xFF00000000000000L, 0.0f, 0L, 0L, false, false, false, 3, null, 0.0f, 0.0f, 0x3061, null);
            }
            this.f = textData1;
        }

        public Text(int v, TextData textData0, boolean z, SignatureMetaData signatureMetaData0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = 0;
            }
            if((v1 & 8) != 0) {
                signatureMetaData0 = new SignatureMetaData(0L, 0.0f, 0.0f, 0.0f, 0.0f, 0x1F, null);
            }
            this(v, textData0, z, signatureMetaData0);
        }

        public final int component1() {
            return this.b;
        }

        @NotNull
        public final TextData component2() {
            return this.c;
        }

        public final boolean component3() {
            return this.d;
        }

        @NotNull
        public final SignatureMetaData component4() {
            return this.e;
        }

        @NotNull
        public final Text copy(int v, @NotNull TextData textData0, boolean z, @NotNull SignatureMetaData signatureMetaData0) {
            Intrinsics.checkNotNullParameter(textData0, "editTextData");
            Intrinsics.checkNotNullParameter(signatureMetaData0, "metaData");
            return new Text(v, textData0, z, signatureMetaData0);
        }

        public static Text copy$default(Text signature$Text0, int v, TextData textData0, boolean z, SignatureMetaData signatureMetaData0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = signature$Text0.b;
            }
            if((v1 & 2) != 0) {
                textData0 = signature$Text0.c;
            }
            if((v1 & 4) != 0) {
                z = signature$Text0.d;
            }
            if((v1 & 8) != 0) {
                signatureMetaData0 = signature$Text0.e;
            }
            return signature$Text0.copy(v, textData0, z, signatureMetaData0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Text)) {
                return false;
            }
            if(this.b != ((Text)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Text)object0).c)) {
                return false;
            }
            return this.d == ((Text)object0).d ? Intrinsics.areEqual(this.e, ((Text)object0).e) : false;
        }

        @NotNull
        public final TextData getEditTextData() {
            return this.c;
        }

        @Override  // com.kakao.kandinsky.core.kdphoto.Signature
        @NotNull
        public SignatureMetaData getMetaData() {
            return this.e;
        }

        @Override  // com.kakao.kandinsky.core.kdphoto.Signature
        public int getNo() {
            return this.b;
        }

        @NotNull
        public final TextData getTextData() {
            return this.f;
        }

        public final boolean getWatermark() {
            return this.d;
        }

        @NotNull
        public final WatermarkDrawData getWatermarkDrawData-uvyYCjk(long v) {
            float f = Size.getHeight-impl(v);
            float f1 = f * 0.04f / Size.getHeight-impl(this.f.getBoundsSize-NH-jbRc());
            float f2 = Size.getWidth-impl(this.f.getBoundsSize-NH-jbRc());
            float f3 = Size.getHeight-impl(v);
            RectF rectF0 = new RectF(0.0f, 0.0f, Size.getWidth-impl(v), Size.getHeight-impl(v));
            Matrix matrix0 = new Matrix();
            matrix0.postRotate(45.0f);
            matrix0.mapRect(rectF0);
            return new WatermarkDrawData(f3 * 0.1f, f1, SizeKt.Size(f2 * f1, f * 0.04f), SizeKt.Size(rectF0.width(), rectF0.height()), null);
        }

        @Override
        public int hashCode() {
            return this.e.hashCode() + a.e((this.c.hashCode() + this.b * 0x1F) * 0x1F, 0x1F, this.d);
        }

        @Override
        @NotNull
        public String toString() {
            return "Text(no=" + this.b + ", editTextData=" + this.c + ", watermark=" + this.d + ", metaData=" + this.e + ")";
        }

        @JvmStatic
        public static final void write$Self$kdphoto_release(Text signature$Text0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || signature$Text0.getNo() != 0) {
                compositeEncoder0.encodeIntElement(serialDescriptor0, 0, signature$Text0.getNo());
            }
            com.kakao.kandinsky.core.kdphoto.TextData..serializer textData$$serializer0 = com.kakao.kandinsky.core.kdphoto.TextData..serializer.INSTANCE;
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, textData$$serializer0, signature$Text0.c);
            boolean z = signature$Text0.d;
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 2, z);
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(signature$Text0.getMetaData(), new SignatureMetaData(0L, 0.0f, 0.0f, 0.0f, 0.0f, 0x1F, null))) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 3, com.kakao.kandinsky.core.kdphoto.SignatureMetaData..serializer.INSTANCE, signature$Text0.getMetaData());
            }
            boolean z1 = compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4);
            TextData textData0 = signature$Text0.f;
            if(z1 || !Intrinsics.areEqual(textData0, (z ? TextData.copy-A15cKkk$default(signature$Text0.c, null, 0xFF99999900000000L, 30.0f, 0xFF00000000000000L, 0.0f, 0L, 0L, false, false, false, 3, null, 0.0f, 0.0f, 0x3061, null) : signature$Text0.c))) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 4, textData$$serializer0, textData0);
            }
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public static final Lazy a;

    static {
        Signature.Companion = new Companion(null);
        Signature.a = c.lazy(LazyThreadSafetyMode.PUBLICATION, com.kakao.kandinsky.core.kdphoto.a.w);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public Signature(int v, SerializationConstructorMarker serializationConstructorMarker0) {
    }

    public Signature(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public abstract SignatureMetaData getMetaData();

    public abstract int getNo();

    @JvmStatic
    public static final void write$Self(Signature signature0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
    }
}

