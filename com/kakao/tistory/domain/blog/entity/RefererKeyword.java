package com.kakao.tistory.domain.blog.entity;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u000B\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0011\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001C\u0010\u0019J\u0010\u0010\u001D\u001A\u00020\bHÖ\u0001¢\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010!\u001A\u00020 2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "", "", "count", "", "keyword", "<init>", "(JLjava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getCount", "b", "Ljava/lang/String;", "getKeyword", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class RefererKeyword {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/blog/entity/RefererKeyword.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer refererKeyword$$serializer0 = new .serializer();
            .serializer.INSTANCE = refererKeyword$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.blog.entity.RefererKeyword", refererKeyword$$serializer0, 2);
            pluginGeneratedSerialDescriptor0.addElement("count", true);
            pluginGeneratedSerialDescriptor0.addElement("keyword", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            return new KSerializer[]{LongSerializer.INSTANCE, StringSerializer.INSTANCE};
        }

        @NotNull
        public RefererKeyword deserialize(@NotNull Decoder decoder0) {
            long v2;
            int v1;
            String s;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            if(compositeDecoder0.decodeSequentially()) {
                long v = compositeDecoder0.decodeLongElement(serialDescriptor0, 0);
                s = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                v1 = 3;
                v2 = v;
            }
            else {
                String s1 = null;
                long v3 = 0L;
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
                            v3 = compositeDecoder0.decodeLongElement(serialDescriptor0, 0);
                            v4 |= 1;
                            break;
                        }
                        case 1: {
                            s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                            v4 |= 2;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v5);
                        }
                    }
                }
                s = s1;
                v1 = v4;
                v2 = v3;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new RefererKeyword(v1, v2, s, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull RefererKeyword refererKeyword0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(refererKeyword0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            RefererKeyword.write$Self$domain_release(refererKeyword0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((RefererKeyword)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/RefererKeyword$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/blog/entity/RefererKeyword;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final long a;
    public final String b;

    static {
        RefererKeyword.Companion = new Companion(null);
    }

    public RefererKeyword() {
        this(0L, null, 3, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public RefererKeyword(int v, long v1, String s, SerializationConstructorMarker serializationConstructorMarker0) {
        if((v & 1) == 0) {
            v1 = 0L;
        }
        this.a = v1;
        if((v & 2) == 0) {
            this.b = "";
            return;
        }
        this.b = s;
    }

    public RefererKeyword(long v, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "keyword");
        super();
        this.a = v;
        this.b = s;
    }

    public RefererKeyword(long v, String s, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0L;
        }
        if((v1 & 2) != 0) {
            s = "";
        }
        this(v, s);
    }

    public final long component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final RefererKeyword copy(long v, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "keyword");
        return new RefererKeyword(v, s);
    }

    public static RefererKeyword copy$default(RefererKeyword refererKeyword0, long v, String s, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = refererKeyword0.a;
        }
        if((v1 & 2) != 0) {
            s = refererKeyword0.b;
        }
        return refererKeyword0.copy(v, s);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RefererKeyword)) {
            return false;
        }
        return this.a == ((RefererKeyword)object0).a ? Intrinsics.areEqual(this.b, ((RefererKeyword)object0).b) : false;
    }

    public final long getCount() {
        return this.a;
    }

    @NotNull
    public final String getKeyword() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return this.b.hashCode() + Long.hashCode(this.a) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "RefererKeyword(count=" + this.a + ", keyword=" + this.b + ")";
    }

    @JvmStatic
    public static final void write$Self$domain_release(RefererKeyword refererKeyword0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || refererKeyword0.a != 0L) {
            compositeEncoder0.encodeLongElement(serialDescriptor0, 0, refererKeyword0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || !Intrinsics.areEqual(refererKeyword0.b, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 1, refererKeyword0.b);
        }
    }
}

