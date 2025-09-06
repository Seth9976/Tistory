package com.kakao.kandinsky.core.kdphoto;

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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Immutable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0010\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B9\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u00A2\u0006\u0004\b\b\u0010\tBC\b\u0011\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u00A2\u0006\u0004\b\b\u0010\u000EJ(\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u00C1\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u0019J\u0010\u0010\u001C\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u0019J\u0010\u0010\u001D\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u0019JB\u0010\u001E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010!\u001A\u00020 H\u00D6\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\nH\u00D6\u0001\u00A2\u0006\u0004\b#\u0010$J\u001A\u0010\'\u001A\u00020&2\b\u0010%\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\'\u0010(R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u0019R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010*\u001A\u0004\b-\u0010\u0019R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b.\u0010*\u001A\u0004\b/\u0010\u0019R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b0\u0010*\u001A\u0004\b1\u0010\u0019R\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b2\u0010*\u001A\u0004\b3\u0010\u0019\u00A8\u00066"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Effect;", "", "", "brightness", "contrast", "saturation", "temperature", "vignette", "<init>", "(FFFFF)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFFFFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$kdphoto_release", "(Lcom/kakao/kandinsky/core/kdphoto/Effect;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()F", "component2", "component3", "component4", "component5", "copy", "(FFFFF)Lcom/kakao/kandinsky/core/kdphoto/Effect;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getBrightness", "b", "getContrast", "c", "getSaturation", "d", "getTemperature", "e", "getVignette", "Companion", "$serializer", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class Effect {
    @StabilityInferred(parameters = 1)
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/kandinsky/core/kdphoto/Effect.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/kandinsky/core/kdphoto/Effect;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/kandinsky/core/kdphoto/Effect;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        public static final int $stable;
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer effect$$serializer0 = new .serializer();  // 初始化器: Ljava/lang/Object;-><init>()V
            .serializer.INSTANCE = effect$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.kandinsky.core.kdphoto.Effect", effect$$serializer0, 5);
            pluginGeneratedSerialDescriptor0.addElement("brightness", true);
            pluginGeneratedSerialDescriptor0.addElement("contrast", true);
            pluginGeneratedSerialDescriptor0.addElement("saturation", true);
            pluginGeneratedSerialDescriptor0.addElement("temperature", true);
            pluginGeneratedSerialDescriptor0.addElement("vignette", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE, FloatSerializer.INSTANCE};
        }

        @NotNull
        public Effect deserialize(@NotNull Decoder decoder0) {
            int v;
            float f7;
            float f6;
            float f5;
            float f4;
            float f3;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            if(compositeDecoder0.decodeSequentially()) {
                float f = compositeDecoder0.decodeFloatElement(serialDescriptor0, 0);
                float f1 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 1);
                float f2 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 2);
                f3 = f;
                f4 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 3);
                f5 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 4);
                f6 = f2;
                f7 = f1;
                v = 0x1F;
            }
            else {
                float f8 = 0.0f;
                float f9 = 0.0f;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                int v1 = 0;
                boolean z = true;
                while(z) {
                    int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            f8 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            f12 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 1);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            f11 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 2);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            f9 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 3);
                            v1 |= 8;
                            break;
                        }
                        case 4: {
                            f10 = compositeDecoder0.decodeFloatElement(serialDescriptor0, 4);
                            v1 |= 16;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                f3 = f8;
                f4 = f9;
                f5 = f10;
                f6 = f11;
                f7 = f12;
                v = v1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new Effect(v, f3, f7, f6, f4, f5, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull Effect effect0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(effect0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            Effect.write$Self$kdphoto_release(effect0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((Effect)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/kandinsky/core/kdphoto/Effect$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "serializer", "()Lkotlinx/serialization/KSerializer;", "default", "Lcom/kakao/kandinsky/core/kdphoto/Effect;", "getDefault", "()Lcom/kakao/kandinsky/core/kdphoto/Effect;", "kdphoto_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Effect getDefault() {
            return Effect.f;
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public static final Effect f;

    static {
        Effect.Companion = new Companion(null);
        Effect.f = new Effect(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0x1F, null);
    }

    public Effect() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0x1F, null);
    }

    public Effect(float f, float f1, float f2, float f3, float f4) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public Effect(float f, float f1, float f2, float f3, float f4, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v & 1) == 0 ? f : 0.0f), ((v & 2) == 0 ? f1 : 0.0f), ((v & 4) == 0 ? f2 : 0.0f), ((v & 8) == 0 ? f3 : 0.0f), ((v & 16) == 0 ? f4 : 0.0f));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public Effect(int v, float f, float f1, float f2, float f3, float f4, SerializationConstructorMarker serializationConstructorMarker0) {
        this.a = (v & 1) == 0 ? 0.0f : f;
        this.b = (v & 2) == 0 ? 0.0f : f1;
        this.c = (v & 4) == 0 ? 0.0f : f2;
        this.d = (v & 8) == 0 ? 0.0f : f3;
        if((v & 16) == 0) {
            this.e = 0.0f;
            return;
        }
        this.e = f4;
    }

    public final float component1() {
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
    public final Effect copy(float f, float f1, float f2, float f3, float f4) {
        return new Effect(f, f1, f2, f3, f4);
    }

    public static Effect copy$default(Effect effect0, float f, float f1, float f2, float f3, float f4, int v, Object object0) {
        if((v & 1) != 0) {
            f = effect0.a;
        }
        if((v & 2) != 0) {
            f1 = effect0.b;
        }
        if((v & 4) != 0) {
            f2 = effect0.c;
        }
        if((v & 8) != 0) {
            f3 = effect0.d;
        }
        if((v & 16) != 0) {
            f4 = effect0.e;
        }
        return effect0.copy(f, f1, f2, f3, f4);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Effect)) {
            return false;
        }
        if(Float.compare(this.a, ((Effect)object0).a) != 0) {
            return false;
        }
        if(Float.compare(this.b, ((Effect)object0).b) != 0) {
            return false;
        }
        if(Float.compare(this.c, ((Effect)object0).c) != 0) {
            return false;
        }
        return Float.compare(this.d, ((Effect)object0).d) == 0 ? Float.compare(this.e, ((Effect)object0).e) == 0 : false;
    }

    public final float getBrightness() {
        return this.a;
    }

    public final float getContrast() {
        return this.b;
    }

    public final float getSaturation() {
        return this.c;
    }

    public final float getTemperature() {
        return this.d;
    }

    public final float getVignette() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.e) + a.b(this.d, a.b(this.c, a.b(this.b, Float.hashCode(this.a) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Effect(brightness=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", contrast=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", saturation=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", temperature=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", vignette=");
        return androidx.room.a.h(this.e, ")", stringBuilder0);
    }

    @JvmStatic
    public static final void write$Self$kdphoto_release(Effect effect0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || Float.compare(effect0.a, 0.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 0, effect0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || Float.compare(effect0.b, 0.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 1, effect0.b);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || Float.compare(effect0.c, 0.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 2, effect0.c);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || Float.compare(effect0.d, 0.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 3, effect0.d);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || Float.compare(effect0.e, 0.0f) != 0) {
            compositeEncoder0.encodeFloatElement(serialDescriptor0, 4, effect0.e);
        }
    }
}

