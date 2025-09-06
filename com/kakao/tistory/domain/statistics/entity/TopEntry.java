package com.kakao.tistory.domain.statistics.entity;

import com.kakao.tistory.domain.blog.entity.a;
import com.kakao.tistory.domain.blog.entity.b;
import com.kakao.tistory.domain.common.Thumbnail;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonNames;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0019\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBA\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\t\u00A2\u0006\u0004\b\r\u0010\u000EB[\b\u0011\u0012\u0006\u0010\u000F\u001A\u00020\t\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u0012\b\b\u0001\u0010\f\u001A\u00020\t\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u00A2\u0006\u0004\b\r\u0010\u0012J(\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u0013\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0016H\u00C1\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0012\u0010 \u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010\u001FJ\u0010\u0010#\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010$J\u0010\u0010&\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b&\u0010$JX\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\tH\u00C6\u0001\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b)\u0010\u001FJ\u0010\u0010*\u001A\u00020\tH\u00D6\u0001\u00A2\u0006\u0004\b*\u0010$J\u001A\u0010-\u001A\u00020,2\b\u0010+\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u001DR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u001FR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010!R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b8\u00103\u001A\u0004\b9\u0010\u001FR\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010$R\u0017\u0010\u000B\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b=\u0010;\u001A\u0004\b>\u0010$R \u0010\f\u001A\u00020\t8\u0006X\u0087\u0004\u00A2\u0006\u0012\n\u0004\b?\u0010;\u0012\u0004\bA\u0010B\u001A\u0004\b@\u0010$\u00A8\u0006E"}, d2 = {"Lcom/kakao/tistory/domain/statistics/entity/TopEntry;", "", "", "id", "", "title", "Lcom/kakao/tistory/domain/common/Thumbnail;", "thumbnail", "permalink", "", "likeCount", "commentCount", "count", "<init>", "(JLjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;III)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/statistics/entity/TopEntry;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lcom/kakao/tistory/domain/common/Thumbnail;", "component4", "component5", "()I", "component6", "component7", "copy", "(JLjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;III)Lcom/kakao/tistory/domain/statistics/entity/TopEntry;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "b", "Ljava/lang/String;", "getTitle", "c", "Lcom/kakao/tistory/domain/common/Thumbnail;", "getThumbnail", "d", "getPermalink", "e", "I", "getLikeCount", "f", "getCommentCount", "g", "getCount", "getCount$annotations", "()V", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class TopEntry {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/statistics/entity/TopEntry.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/statistics/entity/TopEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/statistics/entity/TopEntry;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/statistics/entity/TopEntry;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer topEntry$$serializer0 = new .serializer();
            .serializer.INSTANCE = topEntry$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.statistics.entity.TopEntry", topEntry$$serializer0, 7);
            pluginGeneratedSerialDescriptor0.addElement("id", false);
            pluginGeneratedSerialDescriptor0.addElement("title", false);
            pluginGeneratedSerialDescriptor0.addElement("thumbnail", false);
            pluginGeneratedSerialDescriptor0.addElement("permalink", false);
            pluginGeneratedSerialDescriptor0.addElement("likeCount", false);
            pluginGeneratedSerialDescriptor0.addElement("commentCount", false);
            pluginGeneratedSerialDescriptor0.addElement("count", false);
            pluginGeneratedSerialDescriptor0.pushAnnotation(new TopEntry..serializer.annotationImpl.kotlinx_serialization_json_JsonNames.0(new String[]{"viewCount"}));
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE);
            return new KSerializer[]{LongSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer0, StringSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE};
        }

        @NotNull
        public TopEntry deserialize(@NotNull Decoder decoder0) {
            long v7;
            int v6;
            Thumbnail thumbnail1;
            int v5;
            String s3;
            int v4;
            int v3;
            String s2;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            if(compositeDecoder0.decodeSequentially()) {
                long v = compositeDecoder0.decodeLongElement(serialDescriptor0, 0);
                String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                Thumbnail thumbnail0 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                int v1 = compositeDecoder0.decodeIntElement(serialDescriptor0, 4);
                int v2 = compositeDecoder0.decodeIntElement(serialDescriptor0, 5);
                s2 = s;
                v3 = compositeDecoder0.decodeIntElement(serialDescriptor0, 6);
                v4 = v2;
                s3 = s1;
                v5 = v1;
                thumbnail1 = thumbnail0;
                v6 = 0x7F;
                v7 = v;
            }
            else {
                int v8 = 0;
                String s4 = null;
                Thumbnail thumbnail2 = null;
                String s5 = null;
                long v9 = 0L;
                int v10 = 0;
                int v11 = 0;
                int v12 = 0;
                boolean z = true;
                while(z) {
                    int v13 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v13) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            v9 = compositeDecoder0.decodeLongElement(serialDescriptor0, 0);
                            v12 |= 1;
                            break;
                        }
                        case 1: {
                            s4 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                            v12 |= 2;
                            break;
                        }
                        case 2: {
                            thumbnail2 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail2);
                            v12 |= 4;
                            break;
                        }
                        case 3: {
                            s5 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                            v12 |= 8;
                            break;
                        }
                        case 4: {
                            v11 = compositeDecoder0.decodeIntElement(serialDescriptor0, 4);
                            v12 |= 16;
                            break;
                        }
                        case 5: {
                            v10 = compositeDecoder0.decodeIntElement(serialDescriptor0, 5);
                            v12 |= 0x20;
                            break;
                        }
                        case 6: {
                            v8 = compositeDecoder0.decodeIntElement(serialDescriptor0, 6);
                            v12 |= 0x40;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v13);
                        }
                    }
                }
                v3 = v8;
                v4 = v10;
                v5 = v11;
                v6 = v12;
                s2 = s4;
                thumbnail1 = thumbnail2;
                s3 = s5;
                v7 = v9;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new TopEntry(v6, v7, s2, thumbnail1, s3, v5, v4, v3, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull TopEntry topEntry0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(topEntry0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            TopEntry.write$Self$domain_release(topEntry0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((TopEntry)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/statistics/entity/TopEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/statistics/entity/TopEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final Thumbnail c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;

    static {
        TopEntry.Companion = new Companion(null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public TopEntry(int v, long v1, String s, Thumbnail thumbnail0, String s1, int v2, int v3, @JsonNames(names = {"viewCount"}) int v4, SerializationConstructorMarker serializationConstructorMarker0) {
        if(0x7F != (v & 0x7F)) {
            PluginExceptionsKt.throwMissingFieldException(v, 0x7F, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = v1;
        this.b = s;
        this.c = thumbnail0;
        this.d = s1;
        this.e = v2;
        this.f = v3;
        this.g = v4;
    }

    public TopEntry(long v, @NotNull String s, @Nullable Thumbnail thumbnail0, @NotNull String s1, int v1, int v2, int v3) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "permalink");
        super();
        this.a = v;
        this.b = s;
        this.c = thumbnail0;
        this.d = s1;
        this.e = v1;
        this.f = v2;
        this.g = v3;
    }

    public final long component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @Nullable
    public final Thumbnail component3() {
        return this.c;
    }

    @NotNull
    public final String component4() {
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

    @NotNull
    public final TopEntry copy(long v, @NotNull String s, @Nullable Thumbnail thumbnail0, @NotNull String s1, int v1, int v2, int v3) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "permalink");
        return new TopEntry(v, s, thumbnail0, s1, v1, v2, v3);
    }

    public static TopEntry copy$default(TopEntry topEntry0, long v, String s, Thumbnail thumbnail0, String s1, int v1, int v2, int v3, int v4, Object object0) {
        long v5 = (v4 & 1) == 0 ? v : topEntry0.a;
        String s2 = (v4 & 2) == 0 ? s : topEntry0.b;
        Thumbnail thumbnail1 = (v4 & 4) == 0 ? thumbnail0 : topEntry0.c;
        String s3 = (v4 & 8) == 0 ? s1 : topEntry0.d;
        int v6 = (v4 & 16) == 0 ? v1 : topEntry0.e;
        int v7 = (v4 & 0x20) == 0 ? v2 : topEntry0.f;
        return (v4 & 0x40) == 0 ? topEntry0.copy(v5, s2, thumbnail1, s3, v6, v7, v3) : topEntry0.copy(v5, s2, thumbnail1, s3, v6, v7, topEntry0.g);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TopEntry)) {
            return false;
        }
        if(this.a != ((TopEntry)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((TopEntry)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((TopEntry)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((TopEntry)object0).d)) {
            return false;
        }
        if(this.e != ((TopEntry)object0).e) {
            return false;
        }
        return this.f == ((TopEntry)object0).f ? this.g == ((TopEntry)object0).g : false;
    }

    public final int getCommentCount() {
        return this.f;
    }

    public final int getCount() {
        return this.g;
    }

    @JsonNames(names = {"viewCount"})
    public static void getCount$annotations() {
    }

    public final long getId() {
        return this.a;
    }

    public final int getLikeCount() {
        return this.e;
    }

    @NotNull
    public final String getPermalink() {
        return this.d;
    }

    @Nullable
    public final Thumbnail getThumbnail() {
        return this.c;
    }

    @NotNull
    public final String getTitle() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = b.a(this.b, Long.hashCode(this.a) * 0x1F, 0x1F);
        return this.c == null ? this.g + a.a(this.f, a.a(this.e, b.a(this.d, v * 0x1F, 0x1F), 0x1F), 0x1F) : this.g + a.a(this.f, a.a(this.e, b.a(this.d, (v + this.c.hashCode()) * 0x1F, 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "TopEntry(id=" + this.a + ", title=" + this.b + ", thumbnail=" + this.c + ", permalink=" + this.d + ", likeCount=" + this.e + ", commentCount=" + this.f + ", count=" + this.g + ")";
    }

    @JvmStatic
    public static final void write$Self$domain_release(TopEntry topEntry0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        compositeEncoder0.encodeLongElement(serialDescriptor0, 0, topEntry0.a);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 1, topEntry0.b);
        compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, topEntry0.c);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 3, topEntry0.d);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 4, topEntry0.e);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 5, topEntry0.f);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 6, topEntry0.g);
    }
}

