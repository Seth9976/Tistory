package com.kakao.tistory.domain.common;

import com.kakao.tistory.domain.blog.entity.b;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u001B\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0007\u0010\bBC\b\u0011\u0012\u0006\u0010\n\u001A\u00020\t\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B\u00A2\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u000E\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u00C1\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001BJ\u0010\u0010\u001D\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001BJ\u0010\u0010\u001E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001BJ8\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b!\u0010\u001BJ\u0010\u0010\"\u001A\u00020\tH\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010#J\u001A\u0010%\u001A\u00020\u00172\b\u0010$\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u001BR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b*\u0010(\u001A\u0004\b+\u0010\u001BR\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010(\u001A\u0004\b-\u0010\u001BR\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b.\u0010(\u001A\u0004\b/\u0010\u001B\u00A8\u00062"}, d2 = {"Lcom/kakao/tistory/domain/common/Thumbnail;", "", "", "origin", "small", "medium", "large", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/common/Thumbnail;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "isNotBlank", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/domain/common/Thumbnail;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOrigin", "b", "getSmall", "c", "getMedium", "d", "getLarge", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class Thumbnail {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/common/Thumbnail.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/common/Thumbnail;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/common/Thumbnail;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/common/Thumbnail;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer thumbnail$$serializer0 = new .serializer();
            .serializer.INSTANCE = thumbnail$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.common.Thumbnail", thumbnail$$serializer0, 4);
            pluginGeneratedSerialDescriptor0.addElement("origin", false);
            pluginGeneratedSerialDescriptor0.addElement("small", false);
            pluginGeneratedSerialDescriptor0.addElement("medium", false);
            pluginGeneratedSerialDescriptor0.addElement("large", false);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE};
        }

        @NotNull
        public Thumbnail deserialize(@NotNull Decoder decoder0) {
            int v;
            String s6;
            String s5;
            String s4;
            String s3;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            if(compositeDecoder0.decodeSequentially()) {
                String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                s3 = s;
                s4 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                s5 = s2;
                s6 = s1;
                v = 15;
            }
            else {
                String s7 = null;
                String s8 = null;
                String s9 = null;
                String s10 = null;
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
                            s7 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            s10 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            s9 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            s8 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                            v1 |= 8;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v2);
                        }
                    }
                }
                s3 = s7;
                s4 = s8;
                s5 = s9;
                s6 = s10;
                v = v1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new Thumbnail(v, s3, s6, s5, s4, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull Thumbnail thumbnail0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(thumbnail0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            Thumbnail.write$Self$domain_release(thumbnail0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((Thumbnail)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/domain/common/Thumbnail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/common/Thumbnail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Empty", "Lcom/kakao/tistory/domain/common/Thumbnail;", "getEmpty", "()Lcom/kakao/tistory/domain/common/Thumbnail;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Thumbnail getEmpty() {
            return Thumbnail.e;
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public static final Thumbnail e;

    static {
        Thumbnail.Companion = new Companion(null);
        Thumbnail.e = new Thumbnail("", "", "", "");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public Thumbnail(int v, String s, String s1, String s2, String s3, SerializationConstructorMarker serializationConstructorMarker0) {
        if(15 != (v & 15)) {
            PluginExceptionsKt.throwMissingFieldException(v, 15, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    public Thumbnail(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "origin");
        Intrinsics.checkNotNullParameter(s1, "small");
        Intrinsics.checkNotNullParameter(s2, "medium");
        Intrinsics.checkNotNullParameter(s3, "large");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
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
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
        return this.d;
    }

    @NotNull
    public final Thumbnail copy(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "origin");
        Intrinsics.checkNotNullParameter(s1, "small");
        Intrinsics.checkNotNullParameter(s2, "medium");
        Intrinsics.checkNotNullParameter(s3, "large");
        return new Thumbnail(s, s1, s2, s3);
    }

    public static Thumbnail copy$default(Thumbnail thumbnail0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = thumbnail0.a;
        }
        if((v & 2) != 0) {
            s1 = thumbnail0.b;
        }
        if((v & 4) != 0) {
            s2 = thumbnail0.c;
        }
        if((v & 8) != 0) {
            s3 = thumbnail0.d;
        }
        return thumbnail0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Thumbnail)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((Thumbnail)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((Thumbnail)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((Thumbnail)object0).c) ? Intrinsics.areEqual(this.d, ((Thumbnail)object0).d) : false;
    }

    @NotNull
    public final String getLarge() {
        return this.d;
    }

    @NotNull
    public final String getMedium() {
        return this.c;
    }

    @NotNull
    public final String getOrigin() {
        return this.a;
    }

    @NotNull
    public final String getSmall() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.d.hashCode() + b.a(this.c, b.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F);
    }

    // 去混淆评级： 低(40)
    public final boolean isNotBlank() {
        return !p.isBlank(this.a) && !p.isBlank(this.b) && !p.isBlank(this.c) && !p.isBlank(this.d);
    }

    @Override
    @NotNull
    public String toString() {
        return a5.b.r(a5.b.w("Thumbnail(origin=", this.a, ", small=", this.b, ", medium="), this.c, ", large=", this.d, ")");
    }

    @JvmStatic
    public static final void write$Self$domain_release(Thumbnail thumbnail0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        compositeEncoder0.encodeStringElement(serialDescriptor0, 0, thumbnail0.a);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 1, thumbnail0.b);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 2, thumbnail0.c);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 3, thumbnail0.d);
    }
}

