package com.kakao.kandinsky.core.kdphoto;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
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
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0018\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCB_\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0001\u0010\b\u001A\u00020\u0002\u0012\b\b\u0001\u0010\t\u001A\u00020\u0002\u0012\b\b\u0001\u0010\n\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u000B\u001A\u00020\u0002\u00A2\u0006\u0004\b\f\u0010\rBc\b\u0011\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\u0002\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u00A2\u0006\u0004\b\f\u0010\u0011J(\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u0015H\u00C1\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001CJ\u0010\u0010\u001E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001CJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001CJ\u0010\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001CJ\u0010\u0010!\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001CJ\u0010\u0010\"\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010\u001CJ\u0010\u0010#\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\u001CJ\u0010\u0010$\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010\u001CJj\u0010%\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0003\u0010\u0004\u001A\u00020\u00022\b\b\u0003\u0010\u0005\u001A\u00020\u00022\b\b\u0003\u0010\u0006\u001A\u00020\u00022\b\b\u0003\u0010\u0007\u001A\u00020\u00022\b\b\u0003\u0010\b\u001A\u00020\u00022\b\b\u0003\u0010\t\u001A\u00020\u00022\b\b\u0003\u0010\n\u001A\u00020\u00022\b\b\u0003\u0010\u000B\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010(\u001A\u00020\'H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010)J\u0010\u0010*\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b*\u0010\u001CJ\u001A\u0010.\u001A\u00020-2\b\u0010,\u001A\u0004\u0018\u00010+H\u00D6\u0003\u00A2\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001CR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b3\u00101\u001A\u0004\b4\u0010\u001CR\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u00101\u001A\u0004\b6\u0010\u001CR\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b7\u00101\u001A\u0004\b8\u0010\u001CR\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b9\u00101\u001A\u0004\b:\u0010\u001CR\u0017\u0010\b\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b;\u00101\u001A\u0004\b<\u0010\u001CR\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b=\u00101\u001A\u0004\b>\u0010\u001CR\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b?\u00101\u001A\u0004\b@\u0010\u001CR\u0017\u0010\u000B\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bA\u00101\u001A\u0004\bB\u0010\u001C\u00A8\u0006E"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Border;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Relative;", "", "index", "iconLeftTop", "iconTop", "iconRightTop", "iconLeft", "iconRight", "iconLeftBottom", "iconBottom", "iconRightBottom", "<init>", "(IIIIIIIII)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIIIIIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kdphoto_release", "(Lcom/kakao/kandinsky/core/kdphoto/Border;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IIIIIIIII)Lcom/kakao/kandinsky/core/kdphoto/Border;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getIndex", "b", "getIconLeftTop", "c", "getIconTop", "d", "getIconRightTop", "e", "getIconLeft", "f", "getIconRight", "g", "getIconLeftBottom", "h", "getIconBottom", "i", "getIconRightBottom", "Companion", "$serializer", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class Border implements Relative {
    @StabilityInferred(parameters = 1)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/core/kdphoto/Border.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Border;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/core/kdphoto/Border;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/core/kdphoto/Border;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public static final int $stable;
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer border$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
            .serializer.INSTANCE = border$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.core.kdphoto.Border", border$$serializer0, 9);
            pluginGeneratedSerialDescriptor0.addElement("index", false);
            pluginGeneratedSerialDescriptor0.addElement("iconLeftTop", false);
            pluginGeneratedSerialDescriptor0.addElement("iconTop", false);
            pluginGeneratedSerialDescriptor0.addElement("iconRightTop", false);
            pluginGeneratedSerialDescriptor0.addElement("iconLeft", false);
            pluginGeneratedSerialDescriptor0.addElement("iconRight", false);
            pluginGeneratedSerialDescriptor0.addElement("iconLeftBottom", false);
            pluginGeneratedSerialDescriptor0.addElement("iconBottom", false);
            pluginGeneratedSerialDescriptor0.addElement("iconRightBottom", false);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE};
        }

        @NotNull
        public Border deserialize(@NotNull Decoder decoder0) {
            int v17;
            int v16;
            int v15;
            int v14;
            int v13;
            int v12;
            int v11;
            int v10;
            int v9;
            int v8;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            int v = 0;
            if(compositeDecoder0.decodeSequentially()) {
                int v1 = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                int v2 = compositeDecoder0.decodeIntElement(serialDescriptor0, 1);
                int v3 = compositeDecoder0.decodeIntElement(serialDescriptor0, 2);
                int v4 = compositeDecoder0.decodeIntElement(serialDescriptor0, 3);
                int v5 = compositeDecoder0.decodeIntElement(serialDescriptor0, 4);
                int v6 = compositeDecoder0.decodeIntElement(serialDescriptor0, 5);
                int v7 = compositeDecoder0.decodeIntElement(serialDescriptor0, 6);
                v8 = v1;
                v9 = compositeDecoder0.decodeIntElement(serialDescriptor0, 7);
                v10 = v7;
                v11 = v6;
                v12 = v4;
                v13 = compositeDecoder0.decodeIntElement(serialDescriptor0, 8);
                v14 = v5;
                v15 = v3;
                v16 = v2;
                v17 = 0x1FF;
            }
            else {
                int v18 = 0;
                int v19 = 0;
                int v20 = 0;
                int v21 = 0;
                int v22 = 0;
                int v23 = 0;
                int v24 = 0;
                int v25 = 0;
                int v26 = 0;
                boolean z = true;
                while(z) {
                    int v27 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v27) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            v |= 1;
                            v18 = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                            break;
                        }
                        case 1: {
                            v26 = compositeDecoder0.decodeIntElement(serialDescriptor0, 1);
                            v |= 2;
                            break;
                        }
                        case 2: {
                            v25 = compositeDecoder0.decodeIntElement(serialDescriptor0, 2);
                            v |= 4;
                            break;
                        }
                        case 3: {
                            v22 = compositeDecoder0.decodeIntElement(serialDescriptor0, 3);
                            v |= 8;
                            break;
                        }
                        case 4: {
                            v24 = compositeDecoder0.decodeIntElement(serialDescriptor0, 4);
                            v |= 16;
                            break;
                        }
                        case 5: {
                            v21 = compositeDecoder0.decodeIntElement(serialDescriptor0, 5);
                            v |= 0x20;
                            break;
                        }
                        case 6: {
                            v20 = compositeDecoder0.decodeIntElement(serialDescriptor0, 6);
                            v |= 0x40;
                            break;
                        }
                        case 7: {
                            v19 = compositeDecoder0.decodeIntElement(serialDescriptor0, 7);
                            v |= 0x80;
                            break;
                        }
                        case 8: {
                            v23 = compositeDecoder0.decodeIntElement(serialDescriptor0, 8);
                            v |= 0x100;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v27);
                        }
                    }
                }
                v8 = v18;
                v17 = v;
                v9 = v19;
                v10 = v20;
                v11 = v21;
                v12 = v22;
                v13 = v23;
                v14 = v24;
                v15 = v25;
                v16 = v26;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new Border(v17, v8, v16, v15, v12, v14, v11, v10, v9, v13, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull Border border0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(border0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            Border.write$Self$kdphoto_release(border0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((Border)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\tR\u0014\u0010\u000B\u001A\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Border$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Border;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ORIGIN", "Lcom/kakao/kandinsky/core/kdphoto/Border;", "getORIGIN", "()Lcom/kakao/kandinsky/core/kdphoto/Border;", "", "PROPORTION", "F", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Border getORIGIN() {
            return Border.j;
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final float PROPORTION = 5.0f;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public static final Border j;

    static {
        Border.Companion = new Companion(null);
        Border.j = new Border(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public Border(int v, @DrawableRes int v1, @DrawableRes int v2, @DrawableRes int v3, @DrawableRes int v4, @DrawableRes int v5, @DrawableRes int v6, @DrawableRes int v7, @DrawableRes int v8) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = v8;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public Border(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, SerializationConstructorMarker serializationConstructorMarker0) {
        if(0x1FF != (v & 0x1FF)) {
            PluginExceptionsKt.throwMissingFieldException(v, 0x1FF, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = v1;
        this.b = v2;
        this.c = v3;
        this.d = v4;
        this.e = v5;
        this.f = v6;
        this.g = v7;
        this.h = v8;
        this.i = v9;
    }

    public final int component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    public final int component4() {
        return this.d;
    }

    public final int component5() {
        return this.e;
    }

    public final int component6() {
        return this.f;
    }

    public final int component7() {
        return this.g;
    }

    public final int component8() {
        return this.h;
    }

    public final int component9() {
        return this.i;
    }

    @NotNull
    public final Border copy(int v, @DrawableRes int v1, @DrawableRes int v2, @DrawableRes int v3, @DrawableRes int v4, @DrawableRes int v5, @DrawableRes int v6, @DrawableRes int v7, @DrawableRes int v8) {
        return new Border(v, v1, v2, v3, v4, v5, v6, v7, v8);
    }

    public static Border copy$default(Border border0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, Object object0) {
        int v10 = (v9 & 1) == 0 ? v : border0.a;
        int v11 = (v9 & 2) == 0 ? v1 : border0.b;
        int v12 = (v9 & 4) == 0 ? v2 : border0.c;
        int v13 = (v9 & 8) == 0 ? v3 : border0.d;
        int v14 = (v9 & 16) == 0 ? v4 : border0.e;
        int v15 = (v9 & 0x20) == 0 ? v5 : border0.f;
        int v16 = (v9 & 0x40) == 0 ? v6 : border0.g;
        int v17 = (v9 & 0x80) == 0 ? v7 : border0.h;
        return (v9 & 0x100) == 0 ? border0.copy(v10, v11, v12, v13, v14, v15, v16, v17, v8) : border0.copy(v10, v11, v12, v13, v14, v15, v16, v17, border0.i);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Border)) {
            return false;
        }
        if(this.a != ((Border)object0).a) {
            return false;
        }
        if(this.b != ((Border)object0).b) {
            return false;
        }
        if(this.c != ((Border)object0).c) {
            return false;
        }
        if(this.d != ((Border)object0).d) {
            return false;
        }
        if(this.e != ((Border)object0).e) {
            return false;
        }
        if(this.f != ((Border)object0).f) {
            return false;
        }
        if(this.g != ((Border)object0).g) {
            return false;
        }
        return this.h == ((Border)object0).h ? this.i == ((Border)object0).i : false;
    }

    public final int getIconBottom() {
        return this.h;
    }

    public final int getIconLeft() {
        return this.e;
    }

    public final int getIconLeftBottom() {
        return this.g;
    }

    public final int getIconLeftTop() {
        return this.b;
    }

    public final int getIconRight() {
        return this.f;
    }

    public final int getIconRightBottom() {
        return this.i;
    }

    public final int getIconRightTop() {
        return this.d;
    }

    public final int getIconTop() {
        return this.c;
    }

    public final int getIndex() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.i + a.c(this.h, a.c(this.g, a.c(this.f, a.c(this.e, a.c(this.d, a.c(this.c, a.c(this.b, this.a * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Border(index=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", iconLeftTop=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", iconTop=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", iconRightTop=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", iconLeft=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", iconRight=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", iconLeftBottom=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", iconBottom=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", iconRightBottom=");
        return wb.a.c(this.i, ")", stringBuilder0);
    }

    @JvmStatic
    public static final void write$Self$kdphoto_release(Border border0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        compositeEncoder0.encodeIntElement(serialDescriptor0, 0, border0.a);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 1, border0.b);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 2, border0.c);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 3, border0.d);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 4, border0.e);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 5, border0.f);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 6, border0.g);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 7, border0.h);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 8, border0.i);
    }
}

