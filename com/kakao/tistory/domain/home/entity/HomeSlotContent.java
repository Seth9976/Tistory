package com.kakao.tistory.domain.home.entity;

import com.kakao.tistory.domain.blog.entity.b;
import com.kakao.tistory.domain.blog.entity.c;
import com.kakao.tistory.domain.common.Thumbnail;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000B\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000B\f\u0082\u0001\b\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent;", "", "Banner", "Best", "Category", "Creator", "CreatorEntry", "Focus", "Subscription", "SubscriptionEntry", "Tip", "Today", "TodayType", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Best;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Category;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Creator;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Focus;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Subscription;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Tip;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Today;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface HomeSlotContent {
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\'\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0011\u0012\u0006\u0010\t\u001A\u00020\b\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001A\u00020\u00122\u0006\u0010\r\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001C\u0010\u0017J\u0010\u0010\u001D\u001A\u00020\bHÖ\u0001¢\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010\"\u001A\u00020!2\b\u0010 \u001A\u0004\u0018\u00010\u001FHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\u0017R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\'\u0010%\u001A\u0004\b(\u0010\u0017R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001A\u0004\b*\u0010\u0017¨\u0006-"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent;", "", "image", "url", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getImage", "b", "getUrl", "c", "getColor", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class Banner implements HomeSlotContent {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlotContent.Banner.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class .serializer implements GeneratedSerializer {
            @NotNull
            public static final .serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                .serializer homeSlotContent$Banner$$serializer0 = new .serializer();
                .serializer.INSTANCE = homeSlotContent$Banner$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner", homeSlotContent$Banner$$serializer0, 3);
                pluginGeneratedSerialDescriptor0.addElement("image", true);
                pluginGeneratedSerialDescriptor0.addElement("url", true);
                pluginGeneratedSerialDescriptor0.addElement("color", true);
                .serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer0};
            }

            @NotNull
            public Banner deserialize(@NotNull Decoder decoder0) {
                int v;
                String s5;
                String s4;
                String s3;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                String s = null;
                if(compositeDecoder0.decodeSequentially()) {
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                    s3 = s1;
                    s4 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, StringSerializer.INSTANCE, null);
                    s5 = s2;
                    v = 7;
                }
                else {
                    int v1 = 0;
                    String s6 = null;
                    String s7 = null;
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
                                s6 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                s7 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, StringSerializer.INSTANCE, s7);
                                v1 |= 4;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v2);
                            }
                        }
                    }
                    v = v1;
                    s3 = s;
                    s5 = s6;
                    s4 = s7;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Banner(v, s3, s5, s4, null);
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

            public void serialize(@NotNull Encoder encoder0, @NotNull Banner homeSlotContent$Banner0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlotContent$Banner0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Banner.write$Self$domain_release(homeSlotContent$Banner0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((Banner)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
        public final String a;
        public final String b;
        public final String c;

        static {
            Banner.Companion = new Companion(null);
        }

        public Banner() {
            this(null, null, null, 7, null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Banner(int v, String s, String s1, String s2, SerializationConstructorMarker serializationConstructorMarker0) {
            this.a = (v & 1) == 0 ? "" : s;
            this.b = (v & 2) == 0 ? "" : s1;
            if((v & 4) == 0) {
                this.c = null;
                return;
            }
            this.c = s2;
        }

        public Banner(@NotNull String s, @NotNull String s1, @Nullable String s2) {
            Intrinsics.checkNotNullParameter(s, "image");
            Intrinsics.checkNotNullParameter(s1, "url");
            super();
            this.a = s;
            this.b = s1;
            this.c = s2;
        }

        public Banner(String s, String s1, String s2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "";
            }
            if((v & 2) != 0) {
                s1 = "";
            }
            if((v & 4) != 0) {
                s2 = null;
            }
            this(s, s1, s2);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final String component2() {
            return this.b;
        }

        @Nullable
        public final String component3() {
            return this.c;
        }

        @NotNull
        public final Banner copy(@NotNull String s, @NotNull String s1, @Nullable String s2) {
            Intrinsics.checkNotNullParameter(s, "image");
            Intrinsics.checkNotNullParameter(s1, "url");
            return new Banner(s, s1, s2);
        }

        public static Banner copy$default(Banner homeSlotContent$Banner0, String s, String s1, String s2, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlotContent$Banner0.a;
            }
            if((v & 2) != 0) {
                s1 = homeSlotContent$Banner0.b;
            }
            if((v & 4) != 0) {
                s2 = homeSlotContent$Banner0.c;
            }
            return homeSlotContent$Banner0.copy(s, s1, s2);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Banner)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Banner)object0).a)) {
                return false;
            }
            return Intrinsics.areEqual(this.b, ((Banner)object0).b) ? Intrinsics.areEqual(this.c, ((Banner)object0).c) : false;
        }

        @Nullable
        public final String getColor() {
            return this.c;
        }

        @NotNull
        public final String getImage() [...] // 潜在的解密器

        @NotNull
        public final String getUrl() [...] // 潜在的解密器

        @Override
        public int hashCode() {
            int v = b.a(this.b, this.a.hashCode() * 0x1F, 0x1F);
            return this.c == null ? v : v + this.c.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return a.o(a5.b.w("Banner(image=", this.a, ", url=", this.b, ", color="), this.c, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(Banner homeSlotContent$Banner0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(homeSlotContent$Banner0.a, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlotContent$Banner0.a);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || !Intrinsics.areEqual(homeSlotContent$Banner0.b, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 1, homeSlotContent$Banner0.b);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || homeSlotContent$Banner0.c != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 2, StringSerializer.INSTANCE, homeSlotContent$Banner0.c);
            }
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b#\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002[ZB\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0004\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0004\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u000E\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b\u0013\u0010\u0014B\u0095\u0001\b\u0011\u0012\u0006\u0010\u0015\u001A\u00020\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001A\u00020\t\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001A\u00020\u0002\u0012\u0006\u0010\u000E\u001A\u00020\u0002\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0018J(\u0010!\u001A\u00020\u001E2\u0006\u0010\u0019\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u001D\u001A\u00020\u001CH\u00C1\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010\"\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0012\u0010&\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010%J\u0010\u0010)\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b)\u0010*J\u0010\u0010+\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b+\u0010%J\u0012\u0010,\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010\'J\u0010\u0010-\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010#J\u0010\u0010.\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010#J\u0010\u0010/\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b/\u0010%J\u0012\u00100\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b0\u0010%J\u0012\u00101\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b1\u0010%J\u0012\u00102\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b2\u0010%J\u009C\u0001\u00103\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\u00042\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001A\u00020\u00022\b\b\u0002\u0010\u000E\u001A\u00020\u00022\b\b\u0002\u0010\u000F\u001A\u00020\u00042\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0004H\u00C6\u0001\u00A2\u0006\u0004\b3\u00104J\u0010\u00105\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b5\u0010%J\u0010\u00106\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b6\u0010#J\u001A\u0010:\u001A\u0002092\b\u00108\u001A\u0004\u0018\u000107H\u00D6\u0003\u00A2\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010#R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010%R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010\'R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bE\u0010@\u001A\u0004\bF\u0010%R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010*R\u0017\u0010\u000B\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bJ\u0010@\u001A\u0004\bK\u0010%R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bL\u0010C\u001A\u0004\bM\u0010\'R\u0017\u0010\r\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bN\u0010=\u001A\u0004\bO\u0010#R\u0017\u0010\u000E\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bP\u0010=\u001A\u0004\bQ\u0010#R\u0017\u0010\u000F\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bR\u0010@\u001A\u0004\bS\u0010%R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bT\u0010@\u001A\u0004\bU\u0010%R\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bV\u0010@\u001A\u0004\bW\u0010%R\u0019\u0010\u0012\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bX\u0010@\u001A\u0004\bY\u0010%\u00A8\u0006\\"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Best;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent;", "", "rank", "", "blogName", "Lcom/kakao/tistory/domain/common/Thumbnail;", "blogImage", "blogTitle", "", "id", "title", "thumbnail", "likeCount", "commentCount", "publishedDate", "categoryLabel", "categoryId", "mobileLink", "<init>", "(ILjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;JLjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;JLjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Best;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lcom/kakao/tistory/domain/common/Thumbnail;", "component4", "component5", "()J", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(ILjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;JLjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Best;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getRank", "b", "Ljava/lang/String;", "getBlogName", "c", "Lcom/kakao/tistory/domain/common/Thumbnail;", "getBlogImage", "d", "getBlogTitle", "e", "J", "getId", "f", "getTitle", "g", "getThumbnail", "h", "getLikeCount", "i", "getCommentCount", "j", "getPublishedDate", "k", "getCategoryLabel", "l", "getCategoryId", "m", "getMobileLink", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class Best implements HomeSlotContent {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlotContent.Best.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Best;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Best;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Best;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Best..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Best..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Best..serializer homeSlotContent$Best$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Best..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Best..serializer.INSTANCE = homeSlotContent$Best$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.home.entity.HomeSlotContent.Best", homeSlotContent$Best$$serializer0, 13);
                pluginGeneratedSerialDescriptor0.addElement("rank", true);
                pluginGeneratedSerialDescriptor0.addElement("blogName", true);
                pluginGeneratedSerialDescriptor0.addElement("blogImage", true);
                pluginGeneratedSerialDescriptor0.addElement("blogTitle", true);
                pluginGeneratedSerialDescriptor0.addElement("id", true);
                pluginGeneratedSerialDescriptor0.addElement("title", true);
                pluginGeneratedSerialDescriptor0.addElement("thumbnail", true);
                pluginGeneratedSerialDescriptor0.addElement("likeCount", true);
                pluginGeneratedSerialDescriptor0.addElement("commentCount", true);
                pluginGeneratedSerialDescriptor0.addElement("publishedDate", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryLabel", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryId", true);
                pluginGeneratedSerialDescriptor0.addElement("mobileLink", true);
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Best..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE);
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE);
                KSerializer kSerializer2 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer3 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer4 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{IntSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer0, StringSerializer.INSTANCE, LongSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer1, IntSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer2, kSerializer3, kSerializer4};
            }

            @NotNull
            public Best deserialize(@NotNull Decoder decoder0) {
                long v8;
                String s13;
                Thumbnail thumbnail3;
                int v7;
                int v6;
                String s12;
                String s11;
                Thumbnail thumbnail2;
                int v5;
                String s10;
                String s9;
                String s8;
                String s7;
                int v4;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                String s = null;
                if(compositeDecoder0.decodeSequentially()) {
                    int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                    Thumbnail thumbnail0 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                    String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                    long v1 = compositeDecoder0.decodeLongElement(serialDescriptor0, 4);
                    String s3 = compositeDecoder0.decodeStringElement(serialDescriptor0, 5);
                    Thumbnail thumbnail1 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                    int v2 = compositeDecoder0.decodeIntElement(serialDescriptor0, 7);
                    int v3 = compositeDecoder0.decodeIntElement(serialDescriptor0, 8);
                    String s4 = compositeDecoder0.decodeStringElement(serialDescriptor0, 9);
                    String s5 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 10, StringSerializer.INSTANCE, null);
                    String s6 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 11, StringSerializer.INSTANCE, null);
                    v4 = v;
                    s7 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 12, StringSerializer.INSTANCE, null);
                    s8 = s6;
                    s9 = s5;
                    s10 = s4;
                    v5 = v2;
                    thumbnail2 = thumbnail1;
                    s11 = s3;
                    s12 = s2;
                    v6 = v3;
                    v7 = 0x1FFF;
                    thumbnail3 = thumbnail0;
                    s13 = s1;
                    v8 = v1;
                }
                else {
                    String s14 = null;
                    String s15 = null;
                    String s16 = null;
                    String s17 = null;
                    String s18 = null;
                    int v9 = 0;
                    int v10 = 0;
                    int v11 = 0;
                    int v12 = 0;
                    long v13 = 0L;
                    Thumbnail thumbnail4 = null;
                    Thumbnail thumbnail5 = null;
                    String s19 = null;
                    boolean z = true;
                    while(z) {
                        int v14 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                        switch(v14) {
                            case -1: {
                                z = false;
                                break;
                            }
                            case 0: {
                                v10 |= 1;
                                v9 = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                                break;
                            }
                            case 1: {
                                s = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                                v10 |= 2;
                                break;
                            }
                            case 2: {
                                thumbnail5 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail5);
                                v10 |= 4;
                                break;
                            }
                            case 3: {
                                s19 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                                v10 |= 8;
                                break;
                            }
                            case 4: {
                                v13 = compositeDecoder0.decodeLongElement(serialDescriptor0, 4);
                                v10 |= 16;
                                break;
                            }
                            case 5: {
                                s17 = compositeDecoder0.decodeStringElement(serialDescriptor0, 5);
                                v10 |= 0x20;
                                break;
                            }
                            case 6: {
                                thumbnail4 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail4);
                                v10 |= 0x40;
                                break;
                            }
                            case 7: {
                                v11 = compositeDecoder0.decodeIntElement(serialDescriptor0, 7);
                                v10 |= 0x80;
                                break;
                            }
                            case 8: {
                                v12 = compositeDecoder0.decodeIntElement(serialDescriptor0, 8);
                                v10 |= 0x100;
                                break;
                            }
                            case 9: {
                                s18 = compositeDecoder0.decodeStringElement(serialDescriptor0, 9);
                                v10 |= 0x200;
                                break;
                            }
                            case 10: {
                                s16 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 10, StringSerializer.INSTANCE, s16);
                                v10 |= 0x400;
                                break;
                            }
                            case 11: {
                                s14 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 11, StringSerializer.INSTANCE, s14);
                                v10 |= 0x800;
                                break;
                            }
                            case 12: {
                                s15 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 12, StringSerializer.INSTANCE, s15);
                                v10 |= 0x1000;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v14);
                            }
                        }
                    }
                    v4 = v9;
                    s13 = s;
                    v7 = v10;
                    s8 = s14;
                    s7 = s15;
                    s9 = s16;
                    thumbnail2 = thumbnail4;
                    thumbnail3 = thumbnail5;
                    s12 = s19;
                    s11 = s17;
                    s10 = s18;
                    v5 = v11;
                    v6 = v12;
                    v8 = v13;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Best(v7, v4, s13, thumbnail3, s12, v8, s11, thumbnail2, v5, v6, s10, s9, s8, s7, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Best..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Best homeSlotContent$Best0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlotContent$Best0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Best.write$Self$domain_release(homeSlotContent$Best0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((Best)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Best$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Best;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Best.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlotContent.Best.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Best..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Best.Companion Companion;
        public final int a;
        public final String b;
        public final Thumbnail c;
        public final String d;
        public final long e;
        public final String f;
        public final Thumbnail g;
        public final int h;
        public final int i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;

        static {
            Best.Companion = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Best.Companion(null);
        }

        public Best() {
            this(0, null, null, null, 0L, null, null, 0, 0, null, null, null, null, 0x1FFF, null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Best(int v, int v1, String s, Thumbnail thumbnail0, String s1, long v2, String s2, Thumbnail thumbnail1, int v3, int v4, String s3, String s4, String s5, String s6, SerializationConstructorMarker serializationConstructorMarker0) {
            this.a = (v & 1) == 0 ? 0 : v1;
            this.b = (v & 2) == 0 ? "" : s;
            this.c = (v & 4) == 0 ? null : thumbnail0;
            this.d = (v & 8) == 0 ? "" : s1;
            this.e = (v & 16) == 0 ? 0L : v2;
            this.f = (v & 0x20) == 0 ? "" : s2;
            this.g = (v & 0x40) == 0 ? null : thumbnail1;
            this.h = (v & 0x80) == 0 ? 0 : v3;
            this.i = (v & 0x100) == 0 ? 0 : v4;
            this.j = (v & 0x200) == 0 ? "" : s3;
            this.k = (v & 0x400) == 0 ? null : s4;
            this.l = (v & 0x800) == 0 ? null : s5;
            if((v & 0x1000) == 0) {
                this.m = null;
                return;
            }
            this.m = s6;
        }

        public Best(int v, @NotNull String s, @Nullable Thumbnail thumbnail0, @NotNull String s1, long v1, @NotNull String s2, @Nullable Thumbnail thumbnail1, int v2, int v3, @NotNull String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(s3, "publishedDate");
            super();
            this.a = v;
            this.b = s;
            this.c = thumbnail0;
            this.d = s1;
            this.e = v1;
            this.f = s2;
            this.g = thumbnail1;
            this.h = v2;
            this.i = v3;
            this.j = s3;
            this.k = s4;
            this.l = s5;
            this.m = s6;
        }

        public Best(int v, String s, Thumbnail thumbnail0, String s1, long v1, String s2, Thumbnail thumbnail1, int v2, int v3, String s3, String s4, String s5, String s6, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
            int v5 = 0;
            String s7 = "";
            String s8 = null;
            if((v4 & 0x100) == 0) {
                v5 = v3;
            }
            if((v4 & 0x200) == 0) {
                s7 = s3;
            }
            if((v4 & 0x1000) == 0) {
                s8 = s6;
            }
            this(((v4 & 1) == 0 ? v : 0), ((v4 & 2) == 0 ? s : ""), ((v4 & 4) == 0 ? thumbnail0 : null), ((v4 & 8) == 0 ? s1 : ""), ((v4 & 16) == 0 ? v1 : 0L), ((v4 & 0x20) == 0 ? s2 : ""), ((v4 & 0x40) == 0 ? thumbnail1 : null), ((v4 & 0x80) == 0 ? v2 : 0), v5, s7, ((v4 & 0x400) == 0 ? s4 : null), ((v4 & 0x800) == 0 ? s5 : null), s8);
        }

        public final int component1() {
            return this.a;
        }

        @NotNull
        public final String component10() {
            return this.j;
        }

        @Nullable
        public final String component11() {
            return this.k;
        }

        @Nullable
        public final String component12() {
            return this.l;
        }

        @Nullable
        public final String component13() {
            return this.m;
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

        public final long component5() {
            return this.e;
        }

        @NotNull
        public final String component6() {
            return this.f;
        }

        @Nullable
        public final Thumbnail component7() {
            return this.g;
        }

        public final int component8() {
            return this.h;
        }

        public final int component9() {
            return this.i;
        }

        @NotNull
        public final Best copy(int v, @NotNull String s, @Nullable Thumbnail thumbnail0, @NotNull String s1, long v1, @NotNull String s2, @Nullable Thumbnail thumbnail1, int v2, int v3, @NotNull String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(s3, "publishedDate");
            return new Best(v, s, thumbnail0, s1, v1, s2, thumbnail1, v2, v3, s3, s4, s5, s6);
        }

        public static Best copy$default(Best homeSlotContent$Best0, int v, String s, Thumbnail thumbnail0, String s1, long v1, String s2, Thumbnail thumbnail1, int v2, int v3, String s3, String s4, String s5, String s6, int v4, Object object0) {
            int v5 = (v4 & 1) == 0 ? v : homeSlotContent$Best0.a;
            String s7 = (v4 & 2) == 0 ? s : homeSlotContent$Best0.b;
            Thumbnail thumbnail2 = (v4 & 4) == 0 ? thumbnail0 : homeSlotContent$Best0.c;
            String s8 = (v4 & 8) == 0 ? s1 : homeSlotContent$Best0.d;
            long v6 = (v4 & 16) == 0 ? v1 : homeSlotContent$Best0.e;
            String s9 = (v4 & 0x20) == 0 ? s2 : homeSlotContent$Best0.f;
            Thumbnail thumbnail3 = (v4 & 0x40) == 0 ? thumbnail1 : homeSlotContent$Best0.g;
            int v7 = (v4 & 0x80) == 0 ? v2 : homeSlotContent$Best0.h;
            int v8 = (v4 & 0x100) == 0 ? v3 : homeSlotContent$Best0.i;
            String s10 = (v4 & 0x200) == 0 ? s3 : homeSlotContent$Best0.j;
            String s11 = (v4 & 0x400) == 0 ? s4 : homeSlotContent$Best0.k;
            String s12 = (v4 & 0x800) == 0 ? s5 : homeSlotContent$Best0.l;
            return (v4 & 0x1000) == 0 ? homeSlotContent$Best0.copy(v5, s7, thumbnail2, s8, v6, s9, thumbnail3, v7, v8, s10, s11, s12, s6) : homeSlotContent$Best0.copy(v5, s7, thumbnail2, s8, v6, s9, thumbnail3, v7, v8, s10, s11, s12, homeSlotContent$Best0.m);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Best)) {
                return false;
            }
            if(this.a != ((Best)object0).a) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Best)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Best)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Best)object0).d)) {
                return false;
            }
            if(this.e != ((Best)object0).e) {
                return false;
            }
            if(!Intrinsics.areEqual(this.f, ((Best)object0).f)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((Best)object0).g)) {
                return false;
            }
            if(this.h != ((Best)object0).h) {
                return false;
            }
            if(this.i != ((Best)object0).i) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((Best)object0).j)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.k, ((Best)object0).k)) {
                return false;
            }
            return Intrinsics.areEqual(this.l, ((Best)object0).l) ? Intrinsics.areEqual(this.m, ((Best)object0).m) : false;
        }

        @Nullable
        public final Thumbnail getBlogImage() {
            return this.c;
        }

        @NotNull
        public final String getBlogName() [...] // 潜在的解密器

        @NotNull
        public final String getBlogTitle() [...] // 潜在的解密器

        @Nullable
        public final String getCategoryId() {
            return this.l;
        }

        @Nullable
        public final String getCategoryLabel() {
            return this.k;
        }

        public final int getCommentCount() {
            return this.i;
        }

        public final long getId() {
            return this.e;
        }

        public final int getLikeCount() {
            return this.h;
        }

        @Nullable
        public final String getMobileLink() {
            return this.m;
        }

        @NotNull
        public final String getPublishedDate() [...] // 潜在的解密器

        public final int getRank() {
            return this.a;
        }

        @Nullable
        public final Thumbnail getThumbnail() {
            return this.g;
        }

        @NotNull
        public final String getTitle() [...] // 潜在的解密器

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = b.a(this.j, com.kakao.tistory.domain.blog.entity.a.a(this.i, com.kakao.tistory.domain.blog.entity.a.a(this.h, (b.a(this.f, wb.a.k(this.e, b.a(this.d, (b.a(this.b, this.a * 0x1F, 0x1F) + (this.c == null ? 0 : this.c.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F) + (this.g == null ? 0 : this.g.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F);
            int v2 = this.k == null ? 0 : this.k.hashCode();
            int v3 = this.l == null ? 0 : this.l.hashCode();
            String s = this.m;
            if(s != null) {
                v = s.hashCode();
            }
            return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Best(rank=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", blogName=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", blogImage=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", blogTitle=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", id=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", title=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", thumbnail=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", likeCount=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", commentCount=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", publishedDate=");
            stringBuilder0.append(this.j);
            androidx.room.a.w(stringBuilder0, ", categoryLabel=", this.k, ", categoryId=", this.l);
            return a5.b.q(stringBuilder0, ", mobileLink=", this.m, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(Best homeSlotContent$Best0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || homeSlotContent$Best0.a != 0) {
                compositeEncoder0.encodeIntElement(serialDescriptor0, 0, homeSlotContent$Best0.a);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || !Intrinsics.areEqual(homeSlotContent$Best0.b, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 1, homeSlotContent$Best0.b);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || homeSlotContent$Best0.c != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$Best0.c);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(homeSlotContent$Best0.d, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 3, homeSlotContent$Best0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || homeSlotContent$Best0.e != 0L) {
                compositeEncoder0.encodeLongElement(serialDescriptor0, 4, homeSlotContent$Best0.e);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || !Intrinsics.areEqual(homeSlotContent$Best0.f, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 5, homeSlotContent$Best0.f);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6) || homeSlotContent$Best0.g != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$Best0.g);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 7) || homeSlotContent$Best0.h != 0) {
                compositeEncoder0.encodeIntElement(serialDescriptor0, 7, homeSlotContent$Best0.h);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 8) || homeSlotContent$Best0.i != 0) {
                compositeEncoder0.encodeIntElement(serialDescriptor0, 8, homeSlotContent$Best0.i);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 9) || !Intrinsics.areEqual(homeSlotContent$Best0.j, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 9, homeSlotContent$Best0.j);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 10) || homeSlotContent$Best0.k != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 10, StringSerializer.INSTANCE, homeSlotContent$Best0.k);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 11) || homeSlotContent$Best0.l != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 11, StringSerializer.INSTANCE, homeSlotContent$Best0.l);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 12) || homeSlotContent$Best0.m != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 12, StringSerializer.INSTANCE, homeSlotContent$Best0.m);
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b#\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002[ZB\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\t\u001A\u00020\u0002\u0012\b\b\u0002\u0010\n\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u000B\u001A\u00020\u0004\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000E\u001A\u00020\f\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u0013\u0010\u0014B\u0097\u0001\b\u0011\u0012\u0006\u0010\u0015\u001A\u00020\f\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\f\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0018J(\u0010!\u001A\u00020\u001E2\u0006\u0010\u0019\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u001D\u001A\u00020\u001CH\u00C1\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010\"\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010#J\u0010\u0010\'\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010#J\u0010\u0010*\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010#J\u0010\u0010+\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b+\u0010%J\u0010\u0010,\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b,\u0010-J\u0010\u0010.\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b.\u0010-J\u0010\u0010/\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b/\u0010#J\u0012\u00100\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b0\u0010#J\u0012\u00101\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b1\u0010#J\u0012\u00102\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b2\u0010#J\u009A\u0001\u00103\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u00042\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u00022\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b3\u00104J\u0010\u00105\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b5\u0010#J\u0010\u00106\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\b6\u0010-J\u001A\u0010:\u001A\u0002092\b\u00108\u001A\u0004\u0018\u000107H\u00D6\u0003\u00A2\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b<\u0010=\u001A\u0004\b>\u0010#R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010%R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bB\u0010=\u001A\u0004\bC\u0010#R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010(R\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bG\u0010=\u001A\u0004\bH\u0010#R\u0017\u0010\n\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bI\u0010=\u001A\u0004\bJ\u0010#R\u0017\u0010\u000B\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bK\u0010@\u001A\u0004\bL\u0010%R\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010-R\u0017\u0010\u000E\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\bP\u0010N\u001A\u0004\bQ\u0010-R\u0017\u0010\u000F\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bR\u0010=\u001A\u0004\bS\u0010#R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bT\u0010=\u001A\u0004\bU\u0010#R\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bV\u0010=\u001A\u0004\bW\u0010#R\u0019\u0010\u0012\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bX\u0010=\u001A\u0004\bY\u0010#\u00A8\u0006\\"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Category;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent;", "", "blogName", "Lcom/kakao/tistory/domain/common/Thumbnail;", "blogImage", "blogTitle", "", "id", "title", "summary", "thumbnail", "", "likeCount", "commentCount", "publishedDate", "categoryLabel", "categoryId", "mobileLink", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Category;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/common/Thumbnail;", "component3", "component4", "()J", "component5", "component6", "component7", "component8", "()I", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Category;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "Lcom/kakao/tistory/domain/common/Thumbnail;", "getBlogImage", "c", "getBlogTitle", "d", "J", "getId", "e", "getTitle", "f", "getSummary", "g", "getThumbnail", "h", "I", "getLikeCount", "i", "getCommentCount", "j", "getPublishedDate", "k", "getCategoryLabel", "l", "getCategoryId", "m", "getMobileLink", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class Category implements HomeSlotContent {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlotContent.Category.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Category;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Category;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Category;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Category..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Category..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Category..serializer homeSlotContent$Category$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Category..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Category..serializer.INSTANCE = homeSlotContent$Category$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.home.entity.HomeSlotContent.Category", homeSlotContent$Category$$serializer0, 13);
                pluginGeneratedSerialDescriptor0.addElement("blogName", true);
                pluginGeneratedSerialDescriptor0.addElement("blogImage", true);
                pluginGeneratedSerialDescriptor0.addElement("blogTitle", true);
                pluginGeneratedSerialDescriptor0.addElement("id", true);
                pluginGeneratedSerialDescriptor0.addElement("title", true);
                pluginGeneratedSerialDescriptor0.addElement("summary", true);
                pluginGeneratedSerialDescriptor0.addElement("thumbnail", true);
                pluginGeneratedSerialDescriptor0.addElement("likeCount", true);
                pluginGeneratedSerialDescriptor0.addElement("commentCount", true);
                pluginGeneratedSerialDescriptor0.addElement("publishedDate", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryLabel", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryId", true);
                pluginGeneratedSerialDescriptor0.addElement("mobileLink", true);
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Category..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE);
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer2 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer3 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{StringSerializer.INSTANCE, kSerializer0, StringSerializer.INSTANCE, LongSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer1, kSerializer2, kSerializer3};
            }

            @NotNull
            public Category deserialize(@NotNull Decoder decoder0) {
                long v6;
                Thumbnail thumbnail3;
                String s15;
                int v5;
                int v4;
                String s14;
                String s13;
                Thumbnail thumbnail2;
                int v3;
                String s12;
                String s11;
                String s10;
                String s9;
                String s8;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                String s = null;
                if(compositeDecoder0.decodeSequentially()) {
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    Thumbnail thumbnail0 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                    String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                    long v = compositeDecoder0.decodeLongElement(serialDescriptor0, 3);
                    String s3 = compositeDecoder0.decodeStringElement(serialDescriptor0, 4);
                    String s4 = compositeDecoder0.decodeStringElement(serialDescriptor0, 5);
                    Thumbnail thumbnail1 = (Thumbnail)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                    int v1 = compositeDecoder0.decodeIntElement(serialDescriptor0, 7);
                    int v2 = compositeDecoder0.decodeIntElement(serialDescriptor0, 8);
                    String s5 = compositeDecoder0.decodeStringElement(serialDescriptor0, 9);
                    String s6 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 10, StringSerializer.INSTANCE, null);
                    String s7 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 11, StringSerializer.INSTANCE, null);
                    s8 = s1;
                    s9 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 12, StringSerializer.INSTANCE, null);
                    s10 = s7;
                    s11 = s6;
                    s12 = s5;
                    v3 = v1;
                    thumbnail2 = thumbnail1;
                    s13 = s4;
                    s14 = s3;
                    v4 = v2;
                    v5 = 0x1FFF;
                    s15 = s2;
                    thumbnail3 = thumbnail0;
                    v6 = v;
                }
                else {
                    Thumbnail thumbnail4 = null;
                    String s16 = null;
                    String s17 = null;
                    String s18 = null;
                    String s19 = null;
                    int v7 = 0;
                    int v8 = 0;
                    int v9 = 0;
                    long v10 = 0L;
                    String s20 = null;
                    Thumbnail thumbnail5 = null;
                    String s21 = null;
                    String s22 = null;
                    boolean z = true;
                    while(z) {
                        int v11 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                        switch(v11) {
                            case -1: {
                                z = false;
                                break;
                            }
                            case 0: {
                                s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                                v7 |= 1;
                                break;
                            }
                            case 1: {
                                thumbnail4 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail4);
                                v7 |= 2;
                                break;
                            }
                            case 2: {
                                s21 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                                v7 |= 4;
                                break;
                            }
                            case 3: {
                                v10 = compositeDecoder0.decodeLongElement(serialDescriptor0, 3);
                                v7 |= 8;
                                break;
                            }
                            case 4: {
                                s22 = compositeDecoder0.decodeStringElement(serialDescriptor0, 4);
                                v7 |= 16;
                                break;
                            }
                            case 5: {
                                s18 = compositeDecoder0.decodeStringElement(serialDescriptor0, 5);
                                v7 |= 0x20;
                                break;
                            }
                            case 6: {
                                thumbnail5 = (Thumbnail)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail5);
                                v7 |= 0x40;
                                break;
                            }
                            case 7: {
                                v8 = compositeDecoder0.decodeIntElement(serialDescriptor0, 7);
                                v7 |= 0x80;
                                break;
                            }
                            case 8: {
                                v9 = compositeDecoder0.decodeIntElement(serialDescriptor0, 8);
                                v7 |= 0x100;
                                break;
                            }
                            case 9: {
                                s19 = compositeDecoder0.decodeStringElement(serialDescriptor0, 9);
                                v7 |= 0x200;
                                break;
                            }
                            case 10: {
                                s20 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 10, StringSerializer.INSTANCE, s20);
                                v7 |= 0x400;
                                break;
                            }
                            case 11: {
                                s17 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 11, StringSerializer.INSTANCE, s17);
                                v7 |= 0x800;
                                break;
                            }
                            case 12: {
                                s16 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 12, StringSerializer.INSTANCE, s16);
                                v7 |= 0x1000;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v11);
                            }
                        }
                    }
                    thumbnail3 = thumbnail4;
                    s8 = s;
                    s9 = s16;
                    v5 = v7;
                    s10 = s17;
                    s11 = s20;
                    thumbnail2 = thumbnail5;
                    s15 = s21;
                    s14 = s22;
                    s13 = s18;
                    s12 = s19;
                    v3 = v8;
                    v4 = v9;
                    v6 = v10;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Category(v5, s8, thumbnail3, s15, v6, s14, s13, thumbnail2, v3, v4, s12, s11, s10, s9, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Category..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Category homeSlotContent$Category0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlotContent$Category0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Category.write$Self$domain_release(homeSlotContent$Category0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((Category)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Category$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Category;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Category.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlotContent.Category.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Category..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Category.Companion Companion;
        public final String a;
        public final Thumbnail b;
        public final String c;
        public final long d;
        public final String e;
        public final String f;
        public final Thumbnail g;
        public final int h;
        public final int i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;

        static {
            Category.Companion = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Category.Companion(null);
        }

        public Category() {
            this(null, null, null, 0L, null, null, null, 0, 0, null, null, null, null, 0x1FFF, null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Category(int v, String s, Thumbnail thumbnail0, String s1, long v1, String s2, String s3, Thumbnail thumbnail1, int v2, int v3, String s4, String s5, String s6, String s7, SerializationConstructorMarker serializationConstructorMarker0) {
            this.a = (v & 1) == 0 ? "" : s;
            this.b = (v & 2) == 0 ? null : thumbnail0;
            this.c = (v & 4) == 0 ? "" : s1;
            this.d = (v & 8) == 0 ? 0L : v1;
            this.e = (v & 16) == 0 ? "" : s2;
            this.f = (v & 0x20) == 0 ? "" : s3;
            this.g = (v & 0x40) == 0 ? Thumbnail.Companion.getEmpty() : thumbnail1;
            this.h = (v & 0x80) == 0 ? 0 : v2;
            this.i = (v & 0x100) == 0 ? 0 : v3;
            this.j = (v & 0x200) == 0 ? "" : s4;
            this.k = (v & 0x400) == 0 ? null : s5;
            this.l = (v & 0x800) == 0 ? null : s6;
            if((v & 0x1000) == 0) {
                this.m = null;
                return;
            }
            this.m = s7;
        }

        public Category(@NotNull String s, @Nullable Thumbnail thumbnail0, @NotNull String s1, long v, @NotNull String s2, @NotNull String s3, @NotNull Thumbnail thumbnail1, int v1, int v2, @NotNull String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(s3, "summary");
            Intrinsics.checkNotNullParameter(thumbnail1, "thumbnail");
            Intrinsics.checkNotNullParameter(s4, "publishedDate");
            super();
            this.a = s;
            this.b = thumbnail0;
            this.c = s1;
            this.d = v;
            this.e = s2;
            this.f = s3;
            this.g = thumbnail1;
            this.h = v1;
            this.i = v2;
            this.j = s4;
            this.k = s5;
            this.l = s6;
            this.m = s7;
        }

        public Category(String s, Thumbnail thumbnail0, String s1, long v, String s2, String s3, Thumbnail thumbnail1, int v1, int v2, String s4, String s5, String s6, String s7, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
            String s8 = "";
            String s9 = null;
            Thumbnail thumbnail2 = (v3 & 0x40) == 0 ? thumbnail1 : Thumbnail.Companion.getEmpty();
            if((v3 & 0x200) == 0) {
                s8 = s4;
            }
            if((v3 & 0x1000) == 0) {
                s9 = s7;
            }
            this(((v3 & 1) == 0 ? s : ""), ((v3 & 2) == 0 ? thumbnail0 : null), ((v3 & 4) == 0 ? s1 : ""), ((v3 & 8) == 0 ? v : 0L), ((v3 & 16) == 0 ? s2 : ""), ((v3 & 0x20) == 0 ? s3 : ""), thumbnail2, ((v3 & 0x80) == 0 ? v1 : 0), ((v3 & 0x100) == 0 ? v2 : 0), s8, ((v3 & 0x400) == 0 ? s5 : null), ((v3 & 0x800) == 0 ? s6 : null), s9);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final String component10() {
            return this.j;
        }

        @Nullable
        public final String component11() {
            return this.k;
        }

        @Nullable
        public final String component12() {
            return this.l;
        }

        @Nullable
        public final String component13() {
            return this.m;
        }

        @Nullable
        public final Thumbnail component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        public final long component4() {
            return this.d;
        }

        @NotNull
        public final String component5() {
            return this.e;
        }

        @NotNull
        public final String component6() {
            return this.f;
        }

        @NotNull
        public final Thumbnail component7() {
            return this.g;
        }

        public final int component8() {
            return this.h;
        }

        public final int component9() {
            return this.i;
        }

        @NotNull
        public final Category copy(@NotNull String s, @Nullable Thumbnail thumbnail0, @NotNull String s1, long v, @NotNull String s2, @NotNull String s3, @NotNull Thumbnail thumbnail1, int v1, int v2, @NotNull String s4, @Nullable String s5, @Nullable String s6, @Nullable String s7) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(s3, "summary");
            Intrinsics.checkNotNullParameter(thumbnail1, "thumbnail");
            Intrinsics.checkNotNullParameter(s4, "publishedDate");
            return new Category(s, thumbnail0, s1, v, s2, s3, thumbnail1, v1, v2, s4, s5, s6, s7);
        }

        public static Category copy$default(Category homeSlotContent$Category0, String s, Thumbnail thumbnail0, String s1, long v, String s2, String s3, Thumbnail thumbnail1, int v1, int v2, String s4, String s5, String s6, String s7, int v3, Object object0) {
            String s8 = (v3 & 1) == 0 ? s : homeSlotContent$Category0.a;
            Thumbnail thumbnail2 = (v3 & 2) == 0 ? thumbnail0 : homeSlotContent$Category0.b;
            String s9 = (v3 & 4) == 0 ? s1 : homeSlotContent$Category0.c;
            long v4 = (v3 & 8) == 0 ? v : homeSlotContent$Category0.d;
            String s10 = (v3 & 16) == 0 ? s2 : homeSlotContent$Category0.e;
            String s11 = (v3 & 0x20) == 0 ? s3 : homeSlotContent$Category0.f;
            Thumbnail thumbnail3 = (v3 & 0x40) == 0 ? thumbnail1 : homeSlotContent$Category0.g;
            int v5 = (v3 & 0x80) == 0 ? v1 : homeSlotContent$Category0.h;
            int v6 = (v3 & 0x100) == 0 ? v2 : homeSlotContent$Category0.i;
            String s12 = (v3 & 0x200) == 0 ? s4 : homeSlotContent$Category0.j;
            String s13 = (v3 & 0x400) == 0 ? s5 : homeSlotContent$Category0.k;
            String s14 = (v3 & 0x800) == 0 ? s6 : homeSlotContent$Category0.l;
            return (v3 & 0x1000) == 0 ? homeSlotContent$Category0.copy(s8, thumbnail2, s9, v4, s10, s11, thumbnail3, v5, v6, s12, s13, s14, s7) : homeSlotContent$Category0.copy(s8, thumbnail2, s9, v4, s10, s11, thumbnail3, v5, v6, s12, s13, s14, homeSlotContent$Category0.m);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Category)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Category)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Category)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Category)object0).c)) {
                return false;
            }
            if(this.d != ((Category)object0).d) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((Category)object0).e)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.f, ((Category)object0).f)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((Category)object0).g)) {
                return false;
            }
            if(this.h != ((Category)object0).h) {
                return false;
            }
            if(this.i != ((Category)object0).i) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((Category)object0).j)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.k, ((Category)object0).k)) {
                return false;
            }
            return Intrinsics.areEqual(this.l, ((Category)object0).l) ? Intrinsics.areEqual(this.m, ((Category)object0).m) : false;
        }

        @Nullable
        public final Thumbnail getBlogImage() {
            return this.b;
        }

        @NotNull
        public final String getBlogName() [...] // 潜在的解密器

        @NotNull
        public final String getBlogTitle() [...] // 潜在的解密器

        @Nullable
        public final String getCategoryId() {
            return this.l;
        }

        @Nullable
        public final String getCategoryLabel() {
            return this.k;
        }

        public final int getCommentCount() {
            return this.i;
        }

        public final long getId() {
            return this.d;
        }

        public final int getLikeCount() {
            return this.h;
        }

        @Nullable
        public final String getMobileLink() {
            return this.m;
        }

        @NotNull
        public final String getPublishedDate() [...] // 潜在的解密器

        @NotNull
        public final String getSummary() [...] // 潜在的解密器

        @NotNull
        public final Thumbnail getThumbnail() {
            return this.g;
        }

        @NotNull
        public final String getTitle() [...] // 潜在的解密器

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = b.a(this.j, com.kakao.tistory.domain.blog.entity.a.a(this.i, com.kakao.tistory.domain.blog.entity.a.a(this.h, (this.g.hashCode() + b.a(this.f, b.a(this.e, wb.a.k(this.d, b.a(this.c, (this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F)) * 0x1F, 0x1F), 0x1F), 0x1F);
            int v2 = this.k == null ? 0 : this.k.hashCode();
            int v3 = this.l == null ? 0 : this.l.hashCode();
            String s = this.m;
            if(s != null) {
                v = s.hashCode();
            }
            return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Category(blogName=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", blogImage=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", blogTitle=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", id=");
            stringBuilder0.append(this.d);
            androidx.room.a.w(stringBuilder0, ", title=", this.e, ", summary=", this.f);
            stringBuilder0.append(", thumbnail=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", likeCount=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(", commentCount=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", publishedDate=");
            stringBuilder0.append(this.j);
            androidx.room.a.w(stringBuilder0, ", categoryLabel=", this.k, ", categoryId=", this.l);
            return a5.b.q(stringBuilder0, ", mobileLink=", this.m, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(Category homeSlotContent$Category0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(homeSlotContent$Category0.a, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlotContent$Category0.a);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || homeSlotContent$Category0.b != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$Category0.b);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(homeSlotContent$Category0.c, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 2, homeSlotContent$Category0.c);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || homeSlotContent$Category0.d != 0L) {
                compositeEncoder0.encodeLongElement(serialDescriptor0, 3, homeSlotContent$Category0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || !Intrinsics.areEqual(homeSlotContent$Category0.e, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 4, homeSlotContent$Category0.e);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || !Intrinsics.areEqual(homeSlotContent$Category0.f, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 5, homeSlotContent$Category0.f);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$Category0.g);
            }
            else {
                Thumbnail thumbnail0 = Thumbnail.Companion.getEmpty();
                if(!Intrinsics.areEqual(homeSlotContent$Category0.g, thumbnail0)) {
                    compositeEncoder0.encodeSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$Category0.g);
                }
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 7) || homeSlotContent$Category0.h != 0) {
                compositeEncoder0.encodeIntElement(serialDescriptor0, 7, homeSlotContent$Category0.h);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 8) || homeSlotContent$Category0.i != 0) {
                compositeEncoder0.encodeIntElement(serialDescriptor0, 8, homeSlotContent$Category0.i);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 9) || !Intrinsics.areEqual(homeSlotContent$Category0.j, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 9, homeSlotContent$Category0.j);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 10) || homeSlotContent$Category0.k != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 10, StringSerializer.INSTANCE, homeSlotContent$Category0.k);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 11) || homeSlotContent$Category0.l != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 11, StringSerializer.INSTANCE, homeSlotContent$Category0.l);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 12) || homeSlotContent$Category0.m != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 12, StringSerializer.INSTANCE, homeSlotContent$Category0.m);
            }
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BI\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n\u00A2\u0006\u0004\b\r\u0010\u000EBY\b\u0011\u0012\u0006\u0010\u000F\u001A\u00020\u0006\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u00A2\u0006\u0004\b\r\u0010\u0012J(\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u0013\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0016H\u00C1\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001C\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001DJ\u0010\u0010 \u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0003\u00A2\u0006\u0004\b$\u0010%JR\u0010&\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u000E\b\u0002\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u00C6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b(\u0010\u001DJ\u0010\u0010)\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b)\u0010!J\u001A\u0010,\u001A\u00020\b2\b\u0010+\u001A\u0004\u0018\u00010*H\u00D6\u0003\u00A2\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\u001DR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b1\u0010/\u001A\u0004\b2\u0010\u001DR\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b3\u0010/\u001A\u0004\b4\u0010\u001DR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010!R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b\t\u0010#R\u001D\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n8\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010%\u00A8\u0006?"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Creator;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent;", "", "blogName", "blogTitle", "storyCreatorLabel", "", "followerCount", "", "isFollowing", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$CreatorEntry;", "list", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Creator;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "()Z", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Creator;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "getBlogTitle", "c", "getStoryCreatorLabel", "d", "I", "getFollowerCount", "e", "Z", "f", "Ljava/util/List;", "getList", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class Creator implements HomeSlotContent {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlotContent.Creator.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Creator;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Creator;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Creator;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator..serializer homeSlotContent$Creator$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator..serializer.INSTANCE = homeSlotContent$Creator$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator", homeSlotContent$Creator$$serializer0, 6);
                pluginGeneratedSerialDescriptor0.addElement("blogName", true);
                pluginGeneratedSerialDescriptor0.addElement("blogTitle", true);
                pluginGeneratedSerialDescriptor0.addElement("storyCreatorLabel", true);
                pluginGeneratedSerialDescriptor0.addElement("followerCount", true);
                pluginGeneratedSerialDescriptor0.addElement("isFollowing", true);
                pluginGeneratedSerialDescriptor0.addElement("list", true);
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer kSerializer0 = Creator.g[5];
                return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, kSerializer0};
            }

            @NotNull
            public Creator deserialize(@NotNull Decoder decoder0) {
                String s5;
                int v2;
                String s4;
                boolean z1;
                int v1;
                String s3;
                List list0;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                KSerializer[] arr_kSerializer = Creator.g;
                if(compositeDecoder0.decodeSequentially()) {
                    String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                    String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                    int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 3);
                    boolean z = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 4);
                    list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], null);
                    s3 = s;
                    v1 = v;
                    z1 = z;
                    s4 = s2;
                    v2 = 0x3F;
                    s5 = s1;
                }
                else {
                    int v3 = 0;
                    int v4 = 0;
                    String s6 = null;
                    String s7 = null;
                    String s8 = null;
                    List list1 = null;
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
                                s6 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                                v4 |= 1;
                                break;
                            }
                            case 1: {
                                s7 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                                v4 |= 2;
                                break;
                            }
                            case 2: {
                                s8 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                                v4 |= 4;
                                break;
                            }
                            case 3: {
                                v3 = compositeDecoder0.decodeIntElement(serialDescriptor0, 3);
                                v4 |= 8;
                                break;
                            }
                            case 4: {
                                z2 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 4);
                                v4 |= 16;
                                break;
                            }
                            case 5: {
                                list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], list1);
                                v4 |= 0x20;
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
                    s3 = s6;
                    s5 = s7;
                    s4 = s8;
                    list0 = list1;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Creator(v2, s3, s5, s4, v1, z1, list0, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Creator homeSlotContent$Creator0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlotContent$Creator0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Creator.write$Self$domain_release(homeSlotContent$Creator0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((Creator)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Creator$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Creator;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator.Companion Companion;
        public final String a;
        public final String b;
        public final String c;
        public final int d;
        public final boolean e;
        public final List f;
        public static final KSerializer[] g;

        static {
            Creator.Companion = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator.Companion(null);
            Creator.g = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry..serializer.INSTANCE)};
        }

        public Creator() {
            this(null, null, null, 0, false, null, 0x3F, null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Creator(int v, String s, String s1, String s2, int v1, boolean z, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
            this.a = (v & 1) == 0 ? "" : s;
            this.b = (v & 2) == 0 ? "" : s1;
            this.c = (v & 4) == 0 ? "" : s2;
            this.d = (v & 8) == 0 ? 0 : v1;
            this.e = (v & 16) == 0 ? false : z;
            if((v & 0x20) == 0) {
                this.f = CollectionsKt__CollectionsKt.emptyList();
                return;
            }
            this.f = list0;
        }

        public Creator(@NotNull String s, @NotNull String s1, @NotNull String s2, int v, boolean z, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(s2, "storyCreatorLabel");
            Intrinsics.checkNotNullParameter(list0, "list");
            super();
            this.a = s;
            this.b = s1;
            this.c = s2;
            this.d = v;
            this.e = z;
            this.f = list0;
        }

        public Creator(String s, String s1, String s2, int v, boolean z, List list0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 0x20) != 0) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            this(((v1 & 1) == 0 ? s : ""), ((v1 & 2) == 0 ? s1 : ""), ((v1 & 4) == 0 ? s2 : ""), ((v1 & 8) == 0 ? v : 0), ((v1 & 16) == 0 ? z : false), list0);
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

        public final int component4() {
            return this.d;
        }

        public final boolean component5() {
            return this.e;
        }

        @NotNull
        public final List component6() {
            return this.f;
        }

        @NotNull
        public final Creator copy(@NotNull String s, @NotNull String s1, @NotNull String s2, int v, boolean z, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(s2, "storyCreatorLabel");
            Intrinsics.checkNotNullParameter(list0, "list");
            return new Creator(s, s1, s2, v, z, list0);
        }

        public static Creator copy$default(Creator homeSlotContent$Creator0, String s, String s1, String s2, int v, boolean z, List list0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                s = homeSlotContent$Creator0.a;
            }
            if((v1 & 2) != 0) {
                s1 = homeSlotContent$Creator0.b;
            }
            if((v1 & 4) != 0) {
                s2 = homeSlotContent$Creator0.c;
            }
            if((v1 & 8) != 0) {
                v = homeSlotContent$Creator0.d;
            }
            if((v1 & 16) != 0) {
                z = homeSlotContent$Creator0.e;
            }
            if((v1 & 0x20) != 0) {
                list0 = homeSlotContent$Creator0.f;
            }
            return homeSlotContent$Creator0.copy(s, s1, s2, v, z, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Creator)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Creator)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Creator)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Creator)object0).c)) {
                return false;
            }
            if(this.d != ((Creator)object0).d) {
                return false;
            }
            return this.e == ((Creator)object0).e ? Intrinsics.areEqual(this.f, ((Creator)object0).f) : false;
        }

        @NotNull
        public final String getBlogName() [...] // 潜在的解密器

        @NotNull
        public final String getBlogTitle() [...] // 潜在的解密器

        public final int getFollowerCount() {
            return this.d;
        }

        @NotNull
        public final List getList() {
            return this.f;
        }

        @NotNull
        public final String getStoryCreatorLabel() [...] // 潜在的解密器

        @Override
        public int hashCode() {
            return this.f.hashCode() + c.a(this.e, com.kakao.tistory.domain.blog.entity.a.a(this.d, b.a(this.c, b.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
        }

        public final boolean isFollowing() {
            return this.e;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = a5.b.w("Creator(blogName=", this.a, ", blogTitle=", this.b, ", storyCreatorLabel=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", followerCount=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", isFollowing=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", list=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }

        @JvmStatic
        public static final void write$Self$domain_release(Creator homeSlotContent$Creator0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            KSerializer[] arr_kSerializer = Creator.g;
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(homeSlotContent$Creator0.a, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlotContent$Creator0.a);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || !Intrinsics.areEqual(homeSlotContent$Creator0.b, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 1, homeSlotContent$Creator0.b);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(homeSlotContent$Creator0.c, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 2, homeSlotContent$Creator0.c);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || homeSlotContent$Creator0.d != 0) {
                compositeEncoder0.encodeIntElement(serialDescriptor0, 3, homeSlotContent$Creator0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || homeSlotContent$Creator0.e) {
                compositeEncoder0.encodeBooleanElement(serialDescriptor0, 4, homeSlotContent$Creator0.e);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || !Intrinsics.areEqual(homeSlotContent$Creator0.f, CollectionsKt__CollectionsKt.emptyList())) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], homeSlotContent$Creator0.f);
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABS\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\r\u0010\u000EB]\b\u0011\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u00A2\u0006\u0004\b\r\u0010\u0013J(\u0010\u001C\u001A\u00020\u00192\u0006\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u00C1\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001D\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0012\u0010%\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010\u001EJ\u0012\u0010&\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\u001EJ\u0012\u0010\'\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010\u001EJ\\\u0010(\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b(\u0010)J\u0010\u0010*\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b*\u0010\u001EJ\u0010\u0010+\u001A\u00020\u000FH\u00D6\u0001\u00A2\u0006\u0004\b+\u0010,J\u001A\u0010.\u001A\u00020\b2\b\u0010-\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010 R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u0010\"R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b\t\u0010$R\u0019\u0010\n\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b;\u00101\u001A\u0004\b<\u0010\u001ER\u0019\u0010\u000B\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b=\u00101\u001A\u0004\b>\u0010\u001ER\u0019\u0010\f\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b?\u00101\u001A\u0004\b@\u0010\u001E\u00A8\u0006C"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$CreatorEntry;", "", "", "title", "Lcom/kakao/tistory/domain/common/Thumbnail;", "thumbnail", "", "id", "", "isNew", "categoryLabel", "categoryId", "mobileLink", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$CreatorEntry;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/common/Thumbnail;", "component3", "()J", "component4", "()Z", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$CreatorEntry;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "Lcom/kakao/tistory/domain/common/Thumbnail;", "getThumbnail", "c", "J", "getId", "d", "Z", "e", "getCategoryLabel", "f", "getCategoryId", "g", "getMobileLink", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class CreatorEntry {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlotContent.CreatorEntry.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$CreatorEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$CreatorEntry;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$CreatorEntry;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry..serializer homeSlotContent$CreatorEntry$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry..serializer.INSTANCE = homeSlotContent$CreatorEntry$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry", homeSlotContent$CreatorEntry$$serializer0, 7);
                pluginGeneratedSerialDescriptor0.addElement("title", true);
                pluginGeneratedSerialDescriptor0.addElement("thumbnail", true);
                pluginGeneratedSerialDescriptor0.addElement("id", true);
                pluginGeneratedSerialDescriptor0.addElement("isNew", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryLabel", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryId", true);
                pluginGeneratedSerialDescriptor0.addElement("mobileLink", true);
                com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer2 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{StringSerializer.INSTANCE, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, LongSerializer.INSTANCE, BooleanSerializer.INSTANCE, kSerializer0, kSerializer1, kSerializer2};
            }

            @NotNull
            public CreatorEntry deserialize(@NotNull Decoder decoder0) {
                long v2;
                Thumbnail thumbnail1;
                int v1;
                String s6;
                boolean z1;
                String s5;
                String s4;
                String s3;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                if(compositeDecoder0.decodeSequentially()) {
                    String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    Thumbnail thumbnail0 = (Thumbnail)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                    long v = compositeDecoder0.decodeLongElement(serialDescriptor0, 2);
                    boolean z = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 3);
                    String s1 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 4, StringSerializer.INSTANCE, null);
                    String s2 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 5, StringSerializer.INSTANCE, null);
                    s3 = s;
                    s4 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 6, StringSerializer.INSTANCE, null);
                    s5 = s2;
                    z1 = z;
                    s6 = s1;
                    v1 = 0x7F;
                    thumbnail1 = thumbnail0;
                    v2 = v;
                }
                else {
                    boolean z2 = false;
                    String s7 = null;
                    String s8 = null;
                    String s9 = null;
                    long v3 = 0L;
                    String s10 = null;
                    Thumbnail thumbnail2 = null;
                    int v4 = 0;
                    boolean z3 = true;
                    while(z3) {
                        int v5 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                        switch(v5) {
                            case -1: {
                                z3 = false;
                                break;
                            }
                            case 0: {
                                s10 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                                v4 |= 1;
                                break;
                            }
                            case 1: {
                                thumbnail2 = (Thumbnail)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail2);
                                v4 |= 2;
                                break;
                            }
                            case 2: {
                                v3 = compositeDecoder0.decodeLongElement(serialDescriptor0, 2);
                                v4 |= 4;
                                break;
                            }
                            case 3: {
                                z2 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 3);
                                v4 |= 8;
                                break;
                            }
                            case 4: {
                                s7 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 4, StringSerializer.INSTANCE, s7);
                                v4 |= 16;
                                break;
                            }
                            case 5: {
                                s8 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 5, StringSerializer.INSTANCE, s8);
                                v4 |= 0x20;
                                break;
                            }
                            case 6: {
                                s9 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 6, StringSerializer.INSTANCE, s9);
                                v4 |= 0x40;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v5);
                            }
                        }
                    }
                    z1 = z2;
                    v1 = v4;
                    s3 = s10;
                    thumbnail1 = thumbnail2;
                    s6 = s7;
                    s5 = s8;
                    s4 = s9;
                    v2 = v3;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new CreatorEntry(v1, s3, thumbnail1, v2, z1, s6, s5, s4, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull CreatorEntry homeSlotContent$CreatorEntry0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlotContent$CreatorEntry0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                CreatorEntry.write$Self$domain_release(homeSlotContent$CreatorEntry0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((CreatorEntry)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$CreatorEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$CreatorEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry.Companion Companion;
        public final String a;
        public final Thumbnail b;
        public final long c;
        public final boolean d;
        public final String e;
        public final String f;
        public final String g;

        static {
            CreatorEntry.Companion = new com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry.Companion(null);
        }

        public CreatorEntry() {
            this(null, null, 0L, false, null, null, null, 0x7F, null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public CreatorEntry(int v, String s, Thumbnail thumbnail0, long v1, boolean z, String s1, String s2, String s3, SerializationConstructorMarker serializationConstructorMarker0) {
            if((v & 1) == 0) {
                s = "";
            }
            this.a = s;
            this.b = (v & 2) == 0 ? Thumbnail.Companion.getEmpty() : thumbnail0;
            this.c = (v & 4) == 0 ? 0L : v1;
            this.d = (v & 8) == 0 ? false : z;
            this.e = (v & 16) == 0 ? null : s1;
            this.f = (v & 0x20) == 0 ? null : s2;
            if((v & 0x40) == 0) {
                this.g = null;
                return;
            }
            this.g = s3;
        }

        public CreatorEntry(@NotNull String s, @NotNull Thumbnail thumbnail0, long v, boolean z, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(thumbnail0, "thumbnail");
            super();
            this.a = s;
            this.b = thumbnail0;
            this.c = v;
            this.d = z;
            this.e = s1;
            this.f = s2;
            this.g = s3;
        }

        public CreatorEntry(String s, Thumbnail thumbnail0, long v, boolean z, String s1, String s2, String s3, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(((v1 & 1) == 0 ? s : ""), ((v1 & 2) == 0 ? thumbnail0 : Thumbnail.Companion.getEmpty()), ((v1 & 4) == 0 ? v : 0L), ((v1 & 8) == 0 ? z : false), ((v1 & 16) == 0 ? s1 : null), ((v1 & 0x20) == 0 ? s2 : null), ((v1 & 0x40) == 0 ? s3 : null));
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Thumbnail component2() {
            return this.b;
        }

        public final long component3() {
            return this.c;
        }

        public final boolean component4() {
            return this.d;
        }

        @Nullable
        public final String component5() {
            return this.e;
        }

        @Nullable
        public final String component6() {
            return this.f;
        }

        @Nullable
        public final String component7() {
            return this.g;
        }

        @NotNull
        public final CreatorEntry copy(@NotNull String s, @NotNull Thumbnail thumbnail0, long v, boolean z, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(thumbnail0, "thumbnail");
            return new CreatorEntry(s, thumbnail0, v, z, s1, s2, s3);
        }

        public static CreatorEntry copy$default(CreatorEntry homeSlotContent$CreatorEntry0, String s, Thumbnail thumbnail0, long v, boolean z, String s1, String s2, String s3, int v1, Object object0) {
            String s4 = (v1 & 1) == 0 ? s : homeSlotContent$CreatorEntry0.a;
            Thumbnail thumbnail1 = (v1 & 2) == 0 ? thumbnail0 : homeSlotContent$CreatorEntry0.b;
            long v2 = (v1 & 4) == 0 ? v : homeSlotContent$CreatorEntry0.c;
            boolean z1 = (v1 & 8) == 0 ? z : homeSlotContent$CreatorEntry0.d;
            String s5 = (v1 & 16) == 0 ? s1 : homeSlotContent$CreatorEntry0.e;
            String s6 = (v1 & 0x20) == 0 ? s2 : homeSlotContent$CreatorEntry0.f;
            return (v1 & 0x40) == 0 ? homeSlotContent$CreatorEntry0.copy(s4, thumbnail1, v2, z1, s5, s6, s3) : homeSlotContent$CreatorEntry0.copy(s4, thumbnail1, v2, z1, s5, s6, homeSlotContent$CreatorEntry0.g);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CreatorEntry)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((CreatorEntry)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((CreatorEntry)object0).b)) {
                return false;
            }
            if(this.c != ((CreatorEntry)object0).c) {
                return false;
            }
            if(this.d != ((CreatorEntry)object0).d) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((CreatorEntry)object0).e)) {
                return false;
            }
            return Intrinsics.areEqual(this.f, ((CreatorEntry)object0).f) ? Intrinsics.areEqual(this.g, ((CreatorEntry)object0).g) : false;
        }

        @Nullable
        public final String getCategoryId() {
            return this.f;
        }

        @Nullable
        public final String getCategoryLabel() {
            return this.e;
        }

        public final long getId() {
            return this.c;
        }

        @Nullable
        public final String getMobileLink() {
            return this.g;
        }

        @NotNull
        public final Thumbnail getThumbnail() {
            return this.b;
        }

        @NotNull
        public final String getTitle() [...] // 潜在的解密器

        @Override
        public int hashCode() {
            int v = c.a(this.d, wb.a.k(this.c, (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F), 0x1F);
            int v1 = 0;
            int v2 = this.e == null ? 0 : this.e.hashCode();
            int v3 = this.f == null ? 0 : this.f.hashCode();
            String s = this.g;
            if(s != null) {
                v1 = s.hashCode();
            }
            return ((v + v2) * 0x1F + v3) * 0x1F + v1;
        }

        public final boolean isNew() {
            return this.d;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("CreatorEntry(title=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", thumbnail=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", id=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", isNew=");
            stringBuilder0.append(this.d);
            androidx.room.a.w(stringBuilder0, ", categoryLabel=", this.e, ", categoryId=", this.f);
            return a5.b.q(stringBuilder0, ", mobileLink=", this.g, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(CreatorEntry homeSlotContent$CreatorEntry0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(homeSlotContent$CreatorEntry0.a, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlotContent$CreatorEntry0.a);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$CreatorEntry0.b);
            }
            else {
                Thumbnail thumbnail0 = Thumbnail.Companion.getEmpty();
                if(!Intrinsics.areEqual(homeSlotContent$CreatorEntry0.b, thumbnail0)) {
                    compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$CreatorEntry0.b);
                }
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || homeSlotContent$CreatorEntry0.c != 0L) {
                compositeEncoder0.encodeLongElement(serialDescriptor0, 2, homeSlotContent$CreatorEntry0.c);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || homeSlotContent$CreatorEntry0.d) {
                compositeEncoder0.encodeBooleanElement(serialDescriptor0, 3, homeSlotContent$CreatorEntry0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || homeSlotContent$CreatorEntry0.e != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 4, StringSerializer.INSTANCE, homeSlotContent$CreatorEntry0.e);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || homeSlotContent$CreatorEntry0.f != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 5, StringSerializer.INSTANCE, homeSlotContent$CreatorEntry0.f);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6) || homeSlotContent$CreatorEntry0.g != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 6, StringSerializer.INSTANCE, homeSlotContent$CreatorEntry0.g);
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b!\b\u0087\b\u0018\u0000 V2\u00020\u0001:\u0002WVB\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\r\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0002\u00A2\u0006\u0004\b\u0012\u0010\u0013B\u008D\u0001\b\u0011\u0012\u0006\u0010\u0014\u001A\u00020\u000B\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001A\u00020\b\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\r\u001A\u00020\u000B\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015\u00A2\u0006\u0004\b\u0012\u0010\u0017J(\u0010 \u001A\u00020\u001D2\u0006\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001C\u001A\u00020\u001BH\u00C1\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010!\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\"J\u0010\u0010\'\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0012\u0010)\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010$J\u0010\u0010*\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b,\u0010+J\u0010\u0010-\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010\"J\u0012\u0010.\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010\"J\u0012\u0010/\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b/\u0010\"J\u0012\u00100\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b0\u0010\"J\u0092\u0001\u00101\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\u00022\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0002H\u00C6\u0001\u00A2\u0006\u0004\b1\u00102J\u0010\u00103\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b3\u0010\"J\u0010\u00104\u001A\u00020\u000BH\u00D6\u0001\u00A2\u0006\u0004\b4\u0010+J\u001A\u00108\u001A\u0002072\b\u00106\u001A\u0004\u0018\u000105H\u00D6\u0003\u00A2\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010\"R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010$R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b@\u0010;\u001A\u0004\bA\u0010\"R\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bB\u0010;\u001A\u0004\bC\u0010\"R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010(R\u0019\u0010\n\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bG\u0010>\u001A\u0004\bH\u0010$R\u0017\u0010\f\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bI\u0010J\u001A\u0004\bK\u0010+R\u0017\u0010\r\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bL\u0010J\u001A\u0004\bM\u0010+R\u0017\u0010\u000E\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bN\u0010;\u001A\u0004\bO\u0010\"R\u0019\u0010\u000F\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bP\u0010;\u001A\u0004\bQ\u0010\"R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bR\u0010;\u001A\u0004\bS\u0010\"R\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\bT\u0010;\u001A\u0004\bU\u0010\"\u00A8\u0006X"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Focus;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent;", "", "blogName", "Lcom/kakao/tistory/domain/common/Thumbnail;", "blogImage", "blogTitle", "title", "", "id", "thumbnail", "", "likeCount", "commentCount", "publishedDate", "categoryLabel", "categoryId", "mobileLink", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;Ljava/lang/String;JLcom/kakao/tistory/domain/common/Thumbnail;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;Ljava/lang/String;JLcom/kakao/tistory/domain/common/Thumbnail;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Focus;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/common/Thumbnail;", "component3", "component4", "component5", "()J", "component6", "component7", "()I", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;Ljava/lang/String;JLcom/kakao/tistory/domain/common/Thumbnail;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Focus;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "Lcom/kakao/tistory/domain/common/Thumbnail;", "getBlogImage", "c", "getBlogTitle", "d", "getTitle", "e", "J", "getId", "f", "getThumbnail", "g", "I", "getLikeCount", "h", "getCommentCount", "i", "getPublishedDate", "j", "getCategoryLabel", "k", "getCategoryId", "l", "getMobileLink", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class Focus implements HomeSlotContent {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlotContent.Focus.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Focus;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Focus;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Focus;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus..serializer homeSlotContent$Focus$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus..serializer.INSTANCE = homeSlotContent$Focus$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus", homeSlotContent$Focus$$serializer0, 12);
                pluginGeneratedSerialDescriptor0.addElement("blogName", true);
                pluginGeneratedSerialDescriptor0.addElement("blogImage", true);
                pluginGeneratedSerialDescriptor0.addElement("blogTitle", true);
                pluginGeneratedSerialDescriptor0.addElement("title", true);
                pluginGeneratedSerialDescriptor0.addElement("id", true);
                pluginGeneratedSerialDescriptor0.addElement("thumbnail", true);
                pluginGeneratedSerialDescriptor0.addElement("likeCount", true);
                pluginGeneratedSerialDescriptor0.addElement("commentCount", true);
                pluginGeneratedSerialDescriptor0.addElement("publishedDate", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryLabel", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryId", true);
                pluginGeneratedSerialDescriptor0.addElement("mobileLink", true);
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE);
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE);
                KSerializer kSerializer2 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer3 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer4 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{StringSerializer.INSTANCE, kSerializer0, StringSerializer.INSTANCE, StringSerializer.INSTANCE, LongSerializer.INSTANCE, kSerializer1, IntSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer2, kSerializer3, kSerializer4};
            }

            @NotNull
            public Focus deserialize(@NotNull Decoder decoder0) {
                long v7;
                Thumbnail thumbnail3;
                String s12;
                int v6;
                String s11;
                String s10;
                Thumbnail thumbnail2;
                int v5;
                int v4;
                String s9;
                String s8;
                String s7;
                String s6;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                int v = 0;
                if(compositeDecoder0.decodeSequentially()) {
                    String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    Thumbnail thumbnail0 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                    String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                    long v1 = compositeDecoder0.decodeLongElement(serialDescriptor0, 4);
                    Thumbnail thumbnail1 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 5, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                    int v2 = compositeDecoder0.decodeIntElement(serialDescriptor0, 6);
                    int v3 = compositeDecoder0.decodeIntElement(serialDescriptor0, 7);
                    String s3 = compositeDecoder0.decodeStringElement(serialDescriptor0, 8);
                    String s4 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 9, StringSerializer.INSTANCE, null);
                    String s5 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 10, StringSerializer.INSTANCE, null);
                    s6 = s;
                    s7 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 11, StringSerializer.INSTANCE, null);
                    s8 = s5;
                    s9 = s4;
                    v4 = v3;
                    v5 = v2;
                    thumbnail2 = thumbnail1;
                    s10 = s2;
                    s11 = s3;
                    v6 = 0xFFF;
                    s12 = s1;
                    thumbnail3 = thumbnail0;
                    v7 = v1;
                }
                else {
                    int v8 = 0;
                    String s13 = null;
                    String s14 = null;
                    String s15 = null;
                    Thumbnail thumbnail4 = null;
                    Thumbnail thumbnail5 = null;
                    String s16 = null;
                    String s17 = null;
                    long v9 = 0L;
                    String s18 = null;
                    String s19 = null;
                    int v10 = 0;
                    boolean z = true;
                    while(z) {
                        int v11 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                        switch(v11) {
                            case -1: {
                                z = false;
                                break;
                            }
                            case 0: {
                                s18 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                                v |= 1;
                                break;
                            }
                            case 1: {
                                v |= 2;
                                thumbnail5 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail5);
                                break;
                            }
                            case 2: {
                                s19 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                                v |= 4;
                                break;
                            }
                            case 3: {
                                s16 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                                v |= 8;
                                break;
                            }
                            case 4: {
                                v9 = compositeDecoder0.decodeLongElement(serialDescriptor0, 4);
                                v |= 16;
                                break;
                            }
                            case 5: {
                                thumbnail4 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 5, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail4);
                                v |= 0x20;
                                break;
                            }
                            case 6: {
                                v10 = compositeDecoder0.decodeIntElement(serialDescriptor0, 6);
                                v |= 0x40;
                                break;
                            }
                            case 7: {
                                v8 = compositeDecoder0.decodeIntElement(serialDescriptor0, 7);
                                v |= 0x80;
                                break;
                            }
                            case 8: {
                                s17 = compositeDecoder0.decodeStringElement(serialDescriptor0, 8);
                                v |= 0x100;
                                break;
                            }
                            case 9: {
                                s15 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 9, StringSerializer.INSTANCE, s15);
                                v |= 0x200;
                                break;
                            }
                            case 10: {
                                s13 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 10, StringSerializer.INSTANCE, s13);
                                v |= 0x400;
                                break;
                            }
                            case 11: {
                                s14 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 11, StringSerializer.INSTANCE, s14);
                                v |= 0x800;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v11);
                            }
                        }
                    }
                    v4 = v8;
                    thumbnail3 = thumbnail5;
                    s8 = s13;
                    s7 = s14;
                    s9 = s15;
                    thumbnail2 = thumbnail4;
                    v6 = v;
                    v5 = v10;
                    s6 = s18;
                    s12 = s19;
                    s10 = s16;
                    s11 = s17;
                    v7 = v9;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Focus(v6, s6, thumbnail3, s12, s10, v7, thumbnail2, v5, v4, s11, s9, s8, s7, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Focus homeSlotContent$Focus0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlotContent$Focus0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Focus.write$Self$domain_release(homeSlotContent$Focus0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((Focus)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Focus$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Focus;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus.Companion Companion;
        public final String a;
        public final Thumbnail b;
        public final String c;
        public final String d;
        public final long e;
        public final Thumbnail f;
        public final int g;
        public final int h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;

        static {
            Focus.Companion = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus.Companion(null);
        }

        public Focus() {
            this(null, null, null, null, 0L, null, 0, 0, null, null, null, null, 0xFFF, null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Focus(int v, String s, Thumbnail thumbnail0, String s1, String s2, long v1, Thumbnail thumbnail1, int v2, int v3, String s3, String s4, String s5, String s6, SerializationConstructorMarker serializationConstructorMarker0) {
            this.a = (v & 1) == 0 ? "" : s;
            this.b = (v & 2) == 0 ? null : thumbnail0;
            this.c = (v & 4) == 0 ? "" : s1;
            this.d = (v & 8) == 0 ? "" : s2;
            this.e = (v & 16) == 0 ? 0L : v1;
            this.f = (v & 0x20) == 0 ? null : thumbnail1;
            this.g = (v & 0x40) == 0 ? 0 : v2;
            this.h = (v & 0x80) == 0 ? 0 : v3;
            this.i = (v & 0x100) == 0 ? "" : s3;
            this.j = (v & 0x200) == 0 ? null : s4;
            this.k = (v & 0x400) == 0 ? null : s5;
            if((v & 0x800) == 0) {
                this.l = null;
                return;
            }
            this.l = s6;
        }

        public Focus(@NotNull String s, @Nullable Thumbnail thumbnail0, @NotNull String s1, @NotNull String s2, long v, @Nullable Thumbnail thumbnail1, int v1, int v2, @NotNull String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(s3, "publishedDate");
            super();
            this.a = s;
            this.b = thumbnail0;
            this.c = s1;
            this.d = s2;
            this.e = v;
            this.f = thumbnail1;
            this.g = v1;
            this.h = v2;
            this.i = s3;
            this.j = s4;
            this.k = s5;
            this.l = s6;
        }

        public Focus(String s, Thumbnail thumbnail0, String s1, String s2, long v, Thumbnail thumbnail1, int v1, int v2, String s3, String s4, String s5, String s6, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
            String s7 = "";
            String s8 = null;
            if((v3 & 0x100) == 0) {
                s7 = s3;
            }
            if((v3 & 0x800) == 0) {
                s8 = s6;
            }
            this(((v3 & 1) == 0 ? s : ""), ((v3 & 2) == 0 ? thumbnail0 : null), ((v3 & 4) == 0 ? s1 : ""), ((v3 & 8) == 0 ? s2 : ""), ((v3 & 16) == 0 ? v : 0L), ((v3 & 0x20) == 0 ? thumbnail1 : null), ((v3 & 0x40) == 0 ? v1 : 0), ((v3 & 0x80) == 0 ? v2 : 0), s7, ((v3 & 0x200) == 0 ? s4 : null), ((v3 & 0x400) == 0 ? s5 : null), s8);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @Nullable
        public final String component10() {
            return this.j;
        }

        @Nullable
        public final String component11() {
            return this.k;
        }

        @Nullable
        public final String component12() {
            return this.l;
        }

        @Nullable
        public final Thumbnail component2() {
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

        public final long component5() {
            return this.e;
        }

        @Nullable
        public final Thumbnail component6() {
            return this.f;
        }

        public final int component7() {
            return this.g;
        }

        public final int component8() {
            return this.h;
        }

        @NotNull
        public final String component9() {
            return this.i;
        }

        @NotNull
        public final Focus copy(@NotNull String s, @Nullable Thumbnail thumbnail0, @NotNull String s1, @NotNull String s2, long v, @Nullable Thumbnail thumbnail1, int v1, int v2, @NotNull String s3, @Nullable String s4, @Nullable String s5, @Nullable String s6) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(s1, "blogTitle");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(s3, "publishedDate");
            return new Focus(s, thumbnail0, s1, s2, v, thumbnail1, v1, v2, s3, s4, s5, s6);
        }

        public static Focus copy$default(Focus homeSlotContent$Focus0, String s, Thumbnail thumbnail0, String s1, String s2, long v, Thumbnail thumbnail1, int v1, int v2, String s3, String s4, String s5, String s6, int v3, Object object0) {
            String s7 = (v3 & 1) == 0 ? s : homeSlotContent$Focus0.a;
            Thumbnail thumbnail2 = (v3 & 2) == 0 ? thumbnail0 : homeSlotContent$Focus0.b;
            String s8 = (v3 & 4) == 0 ? s1 : homeSlotContent$Focus0.c;
            String s9 = (v3 & 8) == 0 ? s2 : homeSlotContent$Focus0.d;
            long v4 = (v3 & 16) == 0 ? v : homeSlotContent$Focus0.e;
            Thumbnail thumbnail3 = (v3 & 0x20) == 0 ? thumbnail1 : homeSlotContent$Focus0.f;
            int v5 = (v3 & 0x40) == 0 ? v1 : homeSlotContent$Focus0.g;
            int v6 = (v3 & 0x80) == 0 ? v2 : homeSlotContent$Focus0.h;
            String s10 = (v3 & 0x100) == 0 ? s3 : homeSlotContent$Focus0.i;
            String s11 = (v3 & 0x200) == 0 ? s4 : homeSlotContent$Focus0.j;
            String s12 = (v3 & 0x400) == 0 ? s5 : homeSlotContent$Focus0.k;
            return (v3 & 0x800) == 0 ? homeSlotContent$Focus0.copy(s7, thumbnail2, s8, s9, v4, thumbnail3, v5, v6, s10, s11, s12, s6) : homeSlotContent$Focus0.copy(s7, thumbnail2, s8, s9, v4, thumbnail3, v5, v6, s10, s11, s12, homeSlotContent$Focus0.l);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Focus)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Focus)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Focus)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Focus)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Focus)object0).d)) {
                return false;
            }
            if(this.e != ((Focus)object0).e) {
                return false;
            }
            if(!Intrinsics.areEqual(this.f, ((Focus)object0).f)) {
                return false;
            }
            if(this.g != ((Focus)object0).g) {
                return false;
            }
            if(this.h != ((Focus)object0).h) {
                return false;
            }
            if(!Intrinsics.areEqual(this.i, ((Focus)object0).i)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((Focus)object0).j)) {
                return false;
            }
            return Intrinsics.areEqual(this.k, ((Focus)object0).k) ? Intrinsics.areEqual(this.l, ((Focus)object0).l) : false;
        }

        @Nullable
        public final Thumbnail getBlogImage() {
            return this.b;
        }

        @NotNull
        public final String getBlogName() [...] // 潜在的解密器

        @NotNull
        public final String getBlogTitle() [...] // 潜在的解密器

        @Nullable
        public final String getCategoryId() {
            return this.k;
        }

        @Nullable
        public final String getCategoryLabel() {
            return this.j;
        }

        public final int getCommentCount() {
            return this.h;
        }

        public final long getId() {
            return this.e;
        }

        public final int getLikeCount() {
            return this.g;
        }

        @Nullable
        public final String getMobileLink() {
            return this.l;
        }

        @NotNull
        public final String getPublishedDate() [...] // 潜在的解密器

        @Nullable
        public final Thumbnail getThumbnail() {
            return this.f;
        }

        @NotNull
        public final String getTitle() [...] // 潜在的解密器

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = b.a(this.i, com.kakao.tistory.domain.blog.entity.a.a(this.h, com.kakao.tistory.domain.blog.entity.a.a(this.g, (wb.a.k(this.e, b.a(this.d, b.a(this.c, (this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F) + (this.f == null ? 0 : this.f.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F);
            int v2 = this.j == null ? 0 : this.j.hashCode();
            int v3 = this.k == null ? 0 : this.k.hashCode();
            String s = this.l;
            if(s != null) {
                v = s.hashCode();
            }
            return ((v1 + v2) * 0x1F + v3) * 0x1F + v;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Focus(blogName=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", blogImage=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", blogTitle=");
            androidx.room.a.w(stringBuilder0, this.c, ", title=", this.d, ", id=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", thumbnail=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", likeCount=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", commentCount=");
            stringBuilder0.append(this.h);
            androidx.room.a.w(stringBuilder0, ", publishedDate=", this.i, ", categoryLabel=", this.j);
            androidx.room.a.w(stringBuilder0, ", categoryId=", this.k, ", mobileLink=", this.l);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }

        @JvmStatic
        public static final void write$Self$domain_release(Focus homeSlotContent$Focus0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(homeSlotContent$Focus0.a, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlotContent$Focus0.a);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || homeSlotContent$Focus0.b != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 1, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$Focus0.b);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(homeSlotContent$Focus0.c, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 2, homeSlotContent$Focus0.c);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(homeSlotContent$Focus0.d, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 3, homeSlotContent$Focus0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || homeSlotContent$Focus0.e != 0L) {
                compositeEncoder0.encodeLongElement(serialDescriptor0, 4, homeSlotContent$Focus0.e);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || homeSlotContent$Focus0.f != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 5, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$Focus0.f);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6) || homeSlotContent$Focus0.g != 0) {
                compositeEncoder0.encodeIntElement(serialDescriptor0, 6, homeSlotContent$Focus0.g);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 7) || homeSlotContent$Focus0.h != 0) {
                compositeEncoder0.encodeIntElement(serialDescriptor0, 7, homeSlotContent$Focus0.h);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 8) || !Intrinsics.areEqual(homeSlotContent$Focus0.i, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 8, homeSlotContent$Focus0.i);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 9) || homeSlotContent$Focus0.j != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 9, StringSerializer.INSTANCE, homeSlotContent$Focus0.j);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 10) || homeSlotContent$Focus0.k != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 10, StringSerializer.INSTANCE, homeSlotContent$Focus0.k);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 11) || homeSlotContent$Focus0.l != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 11, StringSerializer.INSTANCE, homeSlotContent$Focus0.l);
            }
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0019\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB]\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u0012\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\u0004\b\u000F\u0010\u0010Bm\b\u0011\u0012\u0006\u0010\u0011\u001A\u00020\t\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u0012\u000E\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\u0004\b\u000F\u0010\u0014J(\u0010\u001D\u001A\u00020\u001A2\u0006\u0010\u0015\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0019\u001A\u00020\u0018H\u00C1\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001FJ\u0012\u0010!\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\u001FJ\u0012\u0010$\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010\u001FJ\u0010\u0010%\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010\'\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010&J\u0016\u0010(\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0003\u00A2\u0006\u0004\b(\u0010)Jj\u0010*\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00022\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\t2\u000E\b\u0002\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\fH\u00C6\u0001\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b,\u0010\u001FJ\u0010\u0010-\u001A\u00020\tH\u00D6\u0001\u00A2\u0006\u0004\b-\u0010&J\u001A\u00101\u001A\u0002002\b\u0010/\u001A\u0004\u0018\u00010.H\u00D6\u0003\u00A2\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010\u001FR\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b6\u00104\u001A\u0004\b7\u0010\u001FR\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010\"R\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b;\u00104\u001A\u0004\b<\u0010\u001FR\u0019\u0010\b\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b=\u00104\u001A\u0004\b>\u0010\u001FR\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010&R\u0017\u0010\u000B\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bB\u0010@\u001A\u0004\bC\u0010&R\u001D\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\f8\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010)\u00A8\u0006I"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Subscription;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent;", "", "blogTitle", "blogName", "Lcom/kakao/tistory/domain/common/Thumbnail;", "blogImage", "blogDescription", "storyCreatorLabel", "", "followerCount", "followerIncreaseCount", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$SubscriptionEntry;", "list", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Subscription;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/kakao/tistory/domain/common/Thumbnail;", "component4", "component5", "component6", "()I", "component7", "component8", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Subscription;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogTitle", "b", "getBlogName", "c", "Lcom/kakao/tistory/domain/common/Thumbnail;", "getBlogImage", "d", "getBlogDescription", "e", "getStoryCreatorLabel", "f", "I", "getFollowerCount", "g", "getFollowerIncreaseCount", "h", "Ljava/util/List;", "getList", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class Subscription implements HomeSlotContent {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlotContent.Subscription.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Subscription;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Subscription;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Subscription;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription..serializer homeSlotContent$Subscription$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription..serializer.INSTANCE = homeSlotContent$Subscription$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription", homeSlotContent$Subscription$$serializer0, 8);
                pluginGeneratedSerialDescriptor0.addElement("blogTitle", true);
                pluginGeneratedSerialDescriptor0.addElement("blogName", true);
                pluginGeneratedSerialDescriptor0.addElement("blogImage", true);
                pluginGeneratedSerialDescriptor0.addElement("blogDescription", true);
                pluginGeneratedSerialDescriptor0.addElement("storyCreatorLabel", true);
                pluginGeneratedSerialDescriptor0.addElement("followerCount", false);
                pluginGeneratedSerialDescriptor0.addElement("followerIncreaseCount", false);
                pluginGeneratedSerialDescriptor0.addElement("list", true);
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer[] arr_kSerializer = Subscription.i;
                KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE);
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer0, StringSerializer.INSTANCE, kSerializer1, IntSerializer.INSTANCE, IntSerializer.INSTANCE, arr_kSerializer[7]};
            }

            @NotNull
            public Subscription deserialize(@NotNull Decoder decoder0) {
                String s7;
                int v4;
                Thumbnail thumbnail1;
                String s6;
                String s5;
                int v3;
                int v2;
                String s4;
                List list0;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                KSerializer[] arr_kSerializer = Subscription.i;
                if(compositeDecoder0.decodeSequentially()) {
                    String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                    Thumbnail thumbnail0 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                    String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                    String s3 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 4, StringSerializer.INSTANCE, null);
                    int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 5);
                    int v1 = compositeDecoder0.decodeIntElement(serialDescriptor0, 6);
                    list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 7, arr_kSerializer[7], null);
                    s4 = s;
                    v2 = v1;
                    v3 = v;
                    s5 = s2;
                    s6 = s3;
                    thumbnail1 = thumbnail0;
                    v4 = 0xFF;
                    s7 = s1;
                }
                else {
                    int v5 = 0;
                    int v6 = 0;
                    List list1 = null;
                    String s8 = null;
                    String s9 = null;
                    String s10 = null;
                    String s11 = null;
                    Thumbnail thumbnail2 = null;
                    int v7 = 0;
                    boolean z = true;
                    while(z) {
                        int v8 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                        switch(v8) {
                            case -1: {
                                z = false;
                                break;
                            }
                            case 0: {
                                v6 |= 1;
                                s9 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                                break;
                            }
                            case 1: {
                                s10 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                                v6 |= 2;
                                break;
                            }
                            case 2: {
                                thumbnail2 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail2);
                                v6 |= 4;
                                break;
                            }
                            case 3: {
                                s11 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                                v6 |= 8;
                                break;
                            }
                            case 4: {
                                s8 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 4, StringSerializer.INSTANCE, s8);
                                v6 |= 16;
                                break;
                            }
                            case 5: {
                                v7 = compositeDecoder0.decodeIntElement(serialDescriptor0, 5);
                                v6 |= 0x20;
                                break;
                            }
                            case 6: {
                                v5 = compositeDecoder0.decodeIntElement(serialDescriptor0, 6);
                                v6 |= 0x40;
                                break;
                            }
                            case 7: {
                                list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 7, arr_kSerializer[7], list1);
                                v6 |= 0x80;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v8);
                            }
                        }
                    }
                    v2 = v5;
                    list0 = list1;
                    s6 = s8;
                    thumbnail1 = thumbnail2;
                    v3 = v7;
                    v4 = v6;
                    s4 = s9;
                    s7 = s10;
                    s5 = s11;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Subscription(v4, s4, s7, thumbnail1, s5, s6, v3, v2, list0, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Subscription homeSlotContent$Subscription0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlotContent$Subscription0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Subscription.write$Self$domain_release(homeSlotContent$Subscription0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((Subscription)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Subscription$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Subscription;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription.Companion Companion;
        public final String a;
        public final String b;
        public final Thumbnail c;
        public final String d;
        public final String e;
        public final int f;
        public final int g;
        public final List h;
        public static final KSerializer[] i;

        static {
            Subscription.Companion = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription.Companion(null);
            Subscription.i = new KSerializer[]{null, null, null, null, null, null, null, new ArrayListSerializer(com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry..serializer.INSTANCE)};
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Subscription(int v, String s, String s1, Thumbnail thumbnail0, String s2, String s3, int v1, int v2, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
            if(0x60 != (v & 0x60)) {
                PluginExceptionsKt.throwMissingFieldException(v, 0x60, com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription..serializer.INSTANCE.getDescriptor());
            }
            super();
            this.a = (v & 1) == 0 ? "" : s;
            this.b = (v & 2) == 0 ? "" : s1;
            this.c = (v & 4) == 0 ? null : thumbnail0;
            this.d = (v & 8) == 0 ? "" : s2;
            this.e = (v & 16) == 0 ? null : s3;
            this.f = v1;
            this.g = v2;
            if((v & 0x80) == 0) {
                this.h = CollectionsKt__CollectionsKt.emptyList();
                return;
            }
            this.h = list0;
        }

        public Subscription(@NotNull String s, @NotNull String s1, @Nullable Thumbnail thumbnail0, @NotNull String s2, @Nullable String s3, int v, int v1, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "blogTitle");
            Intrinsics.checkNotNullParameter(s1, "blogName");
            Intrinsics.checkNotNullParameter(s2, "blogDescription");
            Intrinsics.checkNotNullParameter(list0, "list");
            super();
            this.a = s;
            this.b = s1;
            this.c = thumbnail0;
            this.d = s2;
            this.e = s3;
            this.f = v;
            this.g = v1;
            this.h = list0;
        }

        public Subscription(String s, String s1, Thumbnail thumbnail0, String s2, String s3, int v, int v1, List list0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            this(((v2 & 1) == 0 ? s : ""), ((v2 & 2) == 0 ? s1 : ""), ((v2 & 4) == 0 ? thumbnail0 : null), ((v2 & 8) == 0 ? s2 : ""), ((v2 & 16) == 0 ? s3 : null), v, v1, ((v2 & 0x80) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()));
        }

        @NotNull
        public final String component1() {
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

        @Nullable
        public final String component5() {
            return this.e;
        }

        public final int component6() {
            return this.f;
        }

        public final int component7() {
            return this.g;
        }

        @NotNull
        public final List component8() {
            return this.h;
        }

        @NotNull
        public final Subscription copy(@NotNull String s, @NotNull String s1, @Nullable Thumbnail thumbnail0, @NotNull String s2, @Nullable String s3, int v, int v1, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "blogTitle");
            Intrinsics.checkNotNullParameter(s1, "blogName");
            Intrinsics.checkNotNullParameter(s2, "blogDescription");
            Intrinsics.checkNotNullParameter(list0, "list");
            return new Subscription(s, s1, thumbnail0, s2, s3, v, v1, list0);
        }

        public static Subscription copy$default(Subscription homeSlotContent$Subscription0, String s, String s1, Thumbnail thumbnail0, String s2, String s3, int v, int v1, List list0, int v2, Object object0) {
            String s4 = (v2 & 1) == 0 ? s : homeSlotContent$Subscription0.a;
            String s5 = (v2 & 2) == 0 ? s1 : homeSlotContent$Subscription0.b;
            Thumbnail thumbnail1 = (v2 & 4) == 0 ? thumbnail0 : homeSlotContent$Subscription0.c;
            String s6 = (v2 & 8) == 0 ? s2 : homeSlotContent$Subscription0.d;
            String s7 = (v2 & 16) == 0 ? s3 : homeSlotContent$Subscription0.e;
            int v3 = (v2 & 0x20) == 0 ? v : homeSlotContent$Subscription0.f;
            int v4 = (v2 & 0x40) == 0 ? v1 : homeSlotContent$Subscription0.g;
            return (v2 & 0x80) == 0 ? homeSlotContent$Subscription0.copy(s4, s5, thumbnail1, s6, s7, v3, v4, list0) : homeSlotContent$Subscription0.copy(s4, s5, thumbnail1, s6, s7, v3, v4, homeSlotContent$Subscription0.h);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Subscription)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Subscription)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Subscription)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Subscription)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Subscription)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((Subscription)object0).e)) {
                return false;
            }
            if(this.f != ((Subscription)object0).f) {
                return false;
            }
            return this.g == ((Subscription)object0).g ? Intrinsics.areEqual(this.h, ((Subscription)object0).h) : false;
        }

        @NotNull
        public final String getBlogDescription() {
            return this.d;
        }

        @Nullable
        public final Thumbnail getBlogImage() {
            return this.c;
        }

        @NotNull
        public final String getBlogName() {
            return this.b;
        }

        @NotNull
        public final String getBlogTitle() {
            return this.a;
        }

        public final int getFollowerCount() {
            return this.f;
        }

        public final int getFollowerIncreaseCount() {
            return this.g;
        }

        @NotNull
        public final List getList() {
            return this.h;
        }

        @Nullable
        public final String getStoryCreatorLabel() {
            return this.e;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = b.a(this.d, (b.a(this.b, this.a.hashCode() * 0x1F, 0x1F) + (this.c == null ? 0 : this.c.hashCode())) * 0x1F, 0x1F);
            String s = this.e;
            if(s != null) {
                v = s.hashCode();
            }
            return this.h.hashCode() + com.kakao.tistory.domain.blog.entity.a.a(this.g, com.kakao.tistory.domain.blog.entity.a.a(this.f, (v1 + v) * 0x1F, 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = a5.b.w("Subscription(blogTitle=", this.a, ", blogName=", this.b, ", blogImage=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", blogDescription=");
            stringBuilder0.append(this.d);
            stringBuilder0.append(", storyCreatorLabel=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", followerCount=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", followerIncreaseCount=");
            stringBuilder0.append(this.g);
            stringBuilder0.append(", list=");
            stringBuilder0.append(this.h);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }

        @JvmStatic
        public static final void write$Self$domain_release(Subscription homeSlotContent$Subscription0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            KSerializer[] arr_kSerializer = Subscription.i;
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(homeSlotContent$Subscription0.a, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlotContent$Subscription0.a);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || !Intrinsics.areEqual(homeSlotContent$Subscription0.b, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 1, homeSlotContent$Subscription0.b);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || homeSlotContent$Subscription0.c != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$Subscription0.c);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(homeSlotContent$Subscription0.d, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 3, homeSlotContent$Subscription0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || homeSlotContent$Subscription0.e != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 4, StringSerializer.INSTANCE, homeSlotContent$Subscription0.e);
            }
            compositeEncoder0.encodeIntElement(serialDescriptor0, 5, homeSlotContent$Subscription0.f);
            compositeEncoder0.encodeIntElement(serialDescriptor0, 6, homeSlotContent$Subscription0.g);
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 7) || !Intrinsics.areEqual(homeSlotContent$Subscription0.h, CollectionsKt__CollectionsKt.emptyList())) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 7, arr_kSerializer[7], homeSlotContent$Subscription0.h);
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABS\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0004\u00A2\u0006\u0004\b\r\u0010\u000EB]\b\u0011\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u00A2\u0006\u0004\b\r\u0010\u0013J(\u0010\u001C\u001A\u00020\u00192\u0006\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u00C1\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001D\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0012\u0010%\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010 J\u0012\u0010&\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010 J\u0012\u0010\'\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010 J\\\u0010(\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0004H\u00C6\u0001\u00A2\u0006\u0004\b(\u0010)J\u0010\u0010*\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b*\u0010 J\u0010\u0010+\u001A\u00020\u000FH\u00D6\u0001\u00A2\u0006\u0004\b+\u0010,J\u001A\u0010.\u001A\u00020\b2\b\u0010-\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010 R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u0010\"R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b\t\u0010$R\u0019\u0010\n\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b;\u00104\u001A\u0004\b<\u0010 R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b=\u00104\u001A\u0004\b>\u0010 R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b?\u00104\u001A\u0004\b@\u0010 \u00A8\u0006C"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$SubscriptionEntry;", "", "", "id", "", "title", "Lcom/kakao/tistory/domain/common/Thumbnail;", "thumbnail", "", "isNew", "categoryLabel", "categoryId", "mobileLink", "<init>", "(JLjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$SubscriptionEntry;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lcom/kakao/tistory/domain/common/Thumbnail;", "component4", "()Z", "component5", "component6", "component7", "copy", "(JLjava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$SubscriptionEntry;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "b", "Ljava/lang/String;", "getTitle", "c", "Lcom/kakao/tistory/domain/common/Thumbnail;", "getThumbnail", "d", "Z", "e", "getCategoryLabel", "f", "getCategoryId", "g", "getMobileLink", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class SubscriptionEntry {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlotContent.SubscriptionEntry.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$SubscriptionEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$SubscriptionEntry;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$SubscriptionEntry;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry..serializer homeSlotContent$SubscriptionEntry$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry..serializer.INSTANCE = homeSlotContent$SubscriptionEntry$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry", homeSlotContent$SubscriptionEntry$$serializer0, 7);
                pluginGeneratedSerialDescriptor0.addElement("id", true);
                pluginGeneratedSerialDescriptor0.addElement("title", true);
                pluginGeneratedSerialDescriptor0.addElement("thumbnail", true);
                pluginGeneratedSerialDescriptor0.addElement("isNew", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryLabel", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryId", true);
                pluginGeneratedSerialDescriptor0.addElement("mobileLink", true);
                com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer2 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{LongSerializer.INSTANCE, StringSerializer.INSTANCE, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, BooleanSerializer.INSTANCE, kSerializer0, kSerializer1, kSerializer2};
            }

            @NotNull
            public SubscriptionEntry deserialize(@NotNull Decoder decoder0) {
                long v2;
                int v1;
                Thumbnail thumbnail1;
                String s6;
                boolean z1;
                String s5;
                String s4;
                String s3;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                if(compositeDecoder0.decodeSequentially()) {
                    long v = compositeDecoder0.decodeLongElement(serialDescriptor0, 0);
                    String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                    Thumbnail thumbnail0 = (Thumbnail)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                    boolean z = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 3);
                    String s1 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 4, StringSerializer.INSTANCE, null);
                    String s2 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 5, StringSerializer.INSTANCE, null);
                    s3 = s;
                    s4 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 6, StringSerializer.INSTANCE, null);
                    s5 = s2;
                    z1 = z;
                    s6 = s1;
                    thumbnail1 = thumbnail0;
                    v1 = 0x7F;
                    v2 = v;
                }
                else {
                    boolean z2 = false;
                    String s7 = null;
                    String s8 = null;
                    String s9 = null;
                    long v3 = 0L;
                    String s10 = null;
                    Thumbnail thumbnail2 = null;
                    int v4 = 0;
                    boolean z3 = true;
                    while(z3) {
                        int v5 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                        switch(v5) {
                            case -1: {
                                z3 = false;
                                break;
                            }
                            case 0: {
                                v3 = compositeDecoder0.decodeLongElement(serialDescriptor0, 0);
                                v4 |= 1;
                                break;
                            }
                            case 1: {
                                s10 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                                v4 |= 2;
                                break;
                            }
                            case 2: {
                                thumbnail2 = (Thumbnail)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail2);
                                v4 |= 4;
                                break;
                            }
                            case 3: {
                                z2 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 3);
                                v4 |= 8;
                                break;
                            }
                            case 4: {
                                s7 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 4, StringSerializer.INSTANCE, s7);
                                v4 |= 16;
                                break;
                            }
                            case 5: {
                                s8 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 5, StringSerializer.INSTANCE, s8);
                                v4 |= 0x20;
                                break;
                            }
                            case 6: {
                                s9 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 6, StringSerializer.INSTANCE, s9);
                                v4 |= 0x40;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v5);
                            }
                        }
                    }
                    z1 = z2;
                    v1 = v4;
                    s3 = s10;
                    thumbnail1 = thumbnail2;
                    s6 = s7;
                    s5 = s8;
                    s4 = s9;
                    v2 = v3;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new SubscriptionEntry(v1, v2, s3, thumbnail1, z1, s6, s5, s4, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull SubscriptionEntry homeSlotContent$SubscriptionEntry0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlotContent$SubscriptionEntry0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                SubscriptionEntry.write$Self$domain_release(homeSlotContent$SubscriptionEntry0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((SubscriptionEntry)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$SubscriptionEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$SubscriptionEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry.Companion Companion;
        public final long a;
        public final String b;
        public final Thumbnail c;
        public final boolean d;
        public final String e;
        public final String f;
        public final String g;

        static {
            SubscriptionEntry.Companion = new com.kakao.tistory.domain.home.entity.HomeSlotContent.SubscriptionEntry.Companion(null);
        }

        public SubscriptionEntry() {
            this(0L, null, null, false, null, null, null, 0x7F, null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public SubscriptionEntry(int v, long v1, String s, Thumbnail thumbnail0, boolean z, String s1, String s2, String s3, SerializationConstructorMarker serializationConstructorMarker0) {
            if((v & 1) == 0) {
                v1 = 0L;
            }
            this.a = v1;
            this.b = (v & 2) == 0 ? "" : s;
            this.c = (v & 4) == 0 ? Thumbnail.Companion.getEmpty() : thumbnail0;
            this.d = (v & 8) == 0 ? false : z;
            this.e = (v & 16) == 0 ? null : s1;
            this.f = (v & 0x20) == 0 ? null : s2;
            if((v & 0x40) == 0) {
                this.g = null;
                return;
            }
            this.g = s3;
        }

        public SubscriptionEntry(long v, @NotNull String s, @NotNull Thumbnail thumbnail0, boolean z, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(thumbnail0, "thumbnail");
            super();
            this.a = v;
            this.b = s;
            this.c = thumbnail0;
            this.d = z;
            this.e = s1;
            this.f = s2;
            this.g = s3;
        }

        public SubscriptionEntry(long v, String s, Thumbnail thumbnail0, boolean z, String s1, String s2, String s3, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(((v1 & 1) == 0 ? v : 0L), ((v1 & 2) == 0 ? s : ""), ((v1 & 4) == 0 ? thumbnail0 : Thumbnail.Companion.getEmpty()), ((v1 & 8) == 0 ? z : false), ((v1 & 16) == 0 ? s1 : null), ((v1 & 0x20) == 0 ? s2 : null), ((v1 & 0x40) == 0 ? s3 : null));
        }

        public final long component1() {
            return this.a;
        }

        @NotNull
        public final String component2() {
            return this.b;
        }

        @NotNull
        public final Thumbnail component3() {
            return this.c;
        }

        public final boolean component4() {
            return this.d;
        }

        @Nullable
        public final String component5() {
            return this.e;
        }

        @Nullable
        public final String component6() {
            return this.f;
        }

        @Nullable
        public final String component7() {
            return this.g;
        }

        @NotNull
        public final SubscriptionEntry copy(long v, @NotNull String s, @NotNull Thumbnail thumbnail0, boolean z, @Nullable String s1, @Nullable String s2, @Nullable String s3) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(thumbnail0, "thumbnail");
            return new SubscriptionEntry(v, s, thumbnail0, z, s1, s2, s3);
        }

        public static SubscriptionEntry copy$default(SubscriptionEntry homeSlotContent$SubscriptionEntry0, long v, String s, Thumbnail thumbnail0, boolean z, String s1, String s2, String s3, int v1, Object object0) {
            long v2 = (v1 & 1) == 0 ? v : homeSlotContent$SubscriptionEntry0.a;
            String s4 = (v1 & 2) == 0 ? s : homeSlotContent$SubscriptionEntry0.b;
            Thumbnail thumbnail1 = (v1 & 4) == 0 ? thumbnail0 : homeSlotContent$SubscriptionEntry0.c;
            boolean z1 = (v1 & 8) == 0 ? z : homeSlotContent$SubscriptionEntry0.d;
            String s5 = (v1 & 16) == 0 ? s1 : homeSlotContent$SubscriptionEntry0.e;
            String s6 = (v1 & 0x20) == 0 ? s2 : homeSlotContent$SubscriptionEntry0.f;
            return (v1 & 0x40) == 0 ? homeSlotContent$SubscriptionEntry0.copy(v2, s4, thumbnail1, z1, s5, s6, s3) : homeSlotContent$SubscriptionEntry0.copy(v2, s4, thumbnail1, z1, s5, s6, homeSlotContent$SubscriptionEntry0.g);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SubscriptionEntry)) {
                return false;
            }
            if(this.a != ((SubscriptionEntry)object0).a) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((SubscriptionEntry)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((SubscriptionEntry)object0).c)) {
                return false;
            }
            if(this.d != ((SubscriptionEntry)object0).d) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((SubscriptionEntry)object0).e)) {
                return false;
            }
            return Intrinsics.areEqual(this.f, ((SubscriptionEntry)object0).f) ? Intrinsics.areEqual(this.g, ((SubscriptionEntry)object0).g) : false;
        }

        @Nullable
        public final String getCategoryId() {
            return this.f;
        }

        @Nullable
        public final String getCategoryLabel() {
            return this.e;
        }

        public final long getId() {
            return this.a;
        }

        @Nullable
        public final String getMobileLink() {
            return this.g;
        }

        @NotNull
        public final Thumbnail getThumbnail() {
            return this.c;
        }

        @NotNull
        public final String getTitle() [...] // 潜在的解密器

        @Override
        public int hashCode() {
            int v = c.a(this.d, (this.c.hashCode() + b.a(this.b, Long.hashCode(this.a) * 0x1F, 0x1F)) * 0x1F, 0x1F);
            int v1 = 0;
            int v2 = this.e == null ? 0 : this.e.hashCode();
            int v3 = this.f == null ? 0 : this.f.hashCode();
            String s = this.g;
            if(s != null) {
                v1 = s.hashCode();
            }
            return ((v + v2) * 0x1F + v3) * 0x1F + v1;
        }

        public final boolean isNew() {
            return this.d;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("SubscriptionEntry(id=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", title=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", thumbnail=");
            stringBuilder0.append(this.c);
            stringBuilder0.append(", isNew=");
            stringBuilder0.append(this.d);
            androidx.room.a.w(stringBuilder0, ", categoryLabel=", this.e, ", categoryId=", this.f);
            return a5.b.q(stringBuilder0, ", mobileLink=", this.g, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(SubscriptionEntry homeSlotContent$SubscriptionEntry0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || homeSlotContent$SubscriptionEntry0.a != 0L) {
                compositeEncoder0.encodeLongElement(serialDescriptor0, 0, homeSlotContent$SubscriptionEntry0.a);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || !Intrinsics.areEqual(homeSlotContent$SubscriptionEntry0.b, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 1, homeSlotContent$SubscriptionEntry0.b);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$SubscriptionEntry0.c);
            }
            else {
                Thumbnail thumbnail0 = Thumbnail.Companion.getEmpty();
                if(!Intrinsics.areEqual(homeSlotContent$SubscriptionEntry0.c, thumbnail0)) {
                    compositeEncoder0.encodeSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$SubscriptionEntry0.c);
                }
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || homeSlotContent$SubscriptionEntry0.d) {
                compositeEncoder0.encodeBooleanElement(serialDescriptor0, 3, homeSlotContent$SubscriptionEntry0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || homeSlotContent$SubscriptionEntry0.e != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 4, StringSerializer.INSTANCE, homeSlotContent$SubscriptionEntry0.e);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || homeSlotContent$SubscriptionEntry0.f != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 5, StringSerializer.INSTANCE, homeSlotContent$SubscriptionEntry0.f);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6) || homeSlotContent$SubscriptionEntry0.g != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 6, StringSerializer.INSTANCE, homeSlotContent$SubscriptionEntry0.g);
            }
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0013\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BC\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0004\u0012\b\b\u0002\u0010\t\u001A\u00020\u0004\u00A2\u0006\u0004\b\n\u0010\u000BBU\b\u0011\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u00A2\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001A\u00020\u00162\u0006\u0010\u0011\u001A\u00020\u00002\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0014H\u00C1\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001DJ\u0010\u0010\u001F\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001DJ\u0010\u0010 \u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001DJ\u0010\u0010!\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001DJL\u0010\"\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\u0004H\u00C6\u0001\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b$\u0010\u001DJ\u0010\u0010%\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\b%\u0010&J\u001A\u0010*\u001A\u00020)2\b\u0010(\u001A\u0004\u0018\u00010\'H\u00D6\u0003\u00A2\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u001BR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u001DR\u0017\u0010\u0006\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b2\u00100\u001A\u0004\b3\u0010\u001DR\u0017\u0010\u0007\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b4\u00100\u001A\u0004\b5\u0010\u001DR\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b6\u00100\u001A\u0004\b7\u0010\u001DR\u0017\u0010\t\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b8\u00100\u001A\u0004\b9\u0010\u001D\u00A8\u0006<"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Tip;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent;", "", "id", "", "title", "thumbnail", "blogName", "blogTitle", "mobileLink", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Tip;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Tip;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "b", "Ljava/lang/String;", "getTitle", "c", "getThumbnail", "d", "getBlogName", "e", "getBlogTitle", "f", "getMobileLink", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class Tip implements HomeSlotContent {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlotContent.Tip.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Tip;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Tip;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Tip;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip..serializer homeSlotContent$Tip$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip..serializer.INSTANCE = homeSlotContent$Tip$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip", homeSlotContent$Tip$$serializer0, 6);
                pluginGeneratedSerialDescriptor0.addElement("id", true);
                pluginGeneratedSerialDescriptor0.addElement("title", true);
                pluginGeneratedSerialDescriptor0.addElement("thumbnail", true);
                pluginGeneratedSerialDescriptor0.addElement("blogName", true);
                pluginGeneratedSerialDescriptor0.addElement("blogTitle", true);
                pluginGeneratedSerialDescriptor0.addElement("mobileLink", true);
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                return new KSerializer[]{LongSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE};
            }

            @NotNull
            public Tip deserialize(@NotNull Decoder decoder0) {
                long v2;
                int v1;
                String s8;
                String s7;
                String s6;
                String s5;
                String s4;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                if(compositeDecoder0.decodeSequentially()) {
                    long v = compositeDecoder0.decodeLongElement(serialDescriptor0, 0);
                    String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                    String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                    String s3 = compositeDecoder0.decodeStringElement(serialDescriptor0, 4);
                    s4 = s;
                    s5 = compositeDecoder0.decodeStringElement(serialDescriptor0, 5);
                    s6 = s2;
                    s7 = s3;
                    s8 = s1;
                    v1 = 0x3F;
                    v2 = v;
                }
                else {
                    String s9 = null;
                    String s10 = null;
                    String s11 = null;
                    int v3 = 0;
                    long v4 = 0L;
                    String s12 = null;
                    String s13 = null;
                    boolean z = true;
                    while(z) {
                        int v5 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                        switch(v5) {
                            case -1: {
                                z = false;
                                break;
                            }
                            case 0: {
                                v4 = compositeDecoder0.decodeLongElement(serialDescriptor0, 0);
                                v3 |= 1;
                                break;
                            }
                            case 1: {
                                s9 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                                v3 |= 2;
                                break;
                            }
                            case 2: {
                                s11 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                                v3 |= 4;
                                break;
                            }
                            case 3: {
                                s13 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                                v3 |= 8;
                                break;
                            }
                            case 4: {
                                s10 = compositeDecoder0.decodeStringElement(serialDescriptor0, 4);
                                v3 |= 16;
                                break;
                            }
                            case 5: {
                                s12 = compositeDecoder0.decodeStringElement(serialDescriptor0, 5);
                                v3 |= 0x20;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v5);
                            }
                        }
                    }
                    s4 = s9;
                    s5 = s12;
                    s6 = s13;
                    s7 = s10;
                    s8 = s11;
                    v1 = v3;
                    v2 = v4;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Tip(v1, v2, s4, s8, s6, s7, s5, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Tip homeSlotContent$Tip0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlotContent$Tip0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Tip.write$Self$domain_release(homeSlotContent$Tip0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((Tip)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Tip$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Tip;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip.Companion Companion;
        public final long a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        static {
            Tip.Companion = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip.Companion(null);
        }

        public Tip() {
            this(0L, null, null, null, null, null, 0x3F, null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Tip(int v, long v1, String s, String s1, String s2, String s3, String s4, SerializationConstructorMarker serializationConstructorMarker0) {
            if((v & 1) == 0) {
                v1 = 0L;
            }
            this.a = v1;
            this.b = (v & 2) == 0 ? "" : s;
            this.c = (v & 4) == 0 ? "" : s1;
            this.d = (v & 8) == 0 ? "" : s2;
            this.e = (v & 16) == 0 ? "" : s3;
            if((v & 0x20) == 0) {
                this.f = "";
                return;
            }
            this.f = s4;
        }

        public Tip(long v, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(s1, "thumbnail");
            Intrinsics.checkNotNullParameter(s2, "blogName");
            Intrinsics.checkNotNullParameter(s3, "blogTitle");
            Intrinsics.checkNotNullParameter(s4, "mobileLink");
            super();
            this.a = v;
            this.b = s;
            this.c = s1;
            this.d = s2;
            this.e = s3;
            this.f = s4;
        }

        public Tip(long v, String s, String s1, String s2, String s3, String s4, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(((v1 & 1) == 0 ? v : 0L), ((v1 & 2) == 0 ? s : ""), ((v1 & 4) == 0 ? s1 : ""), ((v1 & 8) == 0 ? s2 : ""), ((v1 & 16) == 0 ? s3 : ""), ((v1 & 0x20) == 0 ? s4 : ""));
        }

        public final long component1() {
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
        public final String component5() {
            return this.e;
        }

        @NotNull
        public final String component6() {
            return this.f;
        }

        @NotNull
        public final Tip copy(long v, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4) {
            Intrinsics.checkNotNullParameter(s, "title");
            Intrinsics.checkNotNullParameter(s1, "thumbnail");
            Intrinsics.checkNotNullParameter(s2, "blogName");
            Intrinsics.checkNotNullParameter(s3, "blogTitle");
            Intrinsics.checkNotNullParameter(s4, "mobileLink");
            return new Tip(v, s, s1, s2, s3, s4);
        }

        public static Tip copy$default(Tip homeSlotContent$Tip0, long v, String s, String s1, String s2, String s3, String s4, int v1, Object object0) {
            long v2 = (v1 & 1) == 0 ? v : homeSlotContent$Tip0.a;
            String s5 = (v1 & 2) == 0 ? s : homeSlotContent$Tip0.b;
            String s6 = (v1 & 4) == 0 ? s1 : homeSlotContent$Tip0.c;
            String s7 = (v1 & 8) == 0 ? s2 : homeSlotContent$Tip0.d;
            String s8 = (v1 & 16) == 0 ? s3 : homeSlotContent$Tip0.e;
            return (v1 & 0x20) == 0 ? homeSlotContent$Tip0.copy(v2, s5, s6, s7, s8, s4) : homeSlotContent$Tip0.copy(v2, s5, s6, s7, s8, homeSlotContent$Tip0.f);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Tip)) {
                return false;
            }
            if(this.a != ((Tip)object0).a) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Tip)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Tip)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Tip)object0).d)) {
                return false;
            }
            return Intrinsics.areEqual(this.e, ((Tip)object0).e) ? Intrinsics.areEqual(this.f, ((Tip)object0).f) : false;
        }

        @NotNull
        public final String getBlogName() [...] // 潜在的解密器

        @NotNull
        public final String getBlogTitle() [...] // 潜在的解密器

        public final long getId() {
            return this.a;
        }

        @NotNull
        public final String getMobileLink() [...] // 潜在的解密器

        @NotNull
        public final String getThumbnail() [...] // 潜在的解密器

        @NotNull
        public final String getTitle() [...] // 潜在的解密器

        @Override
        public int hashCode() {
            return this.f.hashCode() + b.a(this.e, b.a(this.d, b.a(this.c, b.a(this.b, Long.hashCode(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Tip(id=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", title=");
            stringBuilder0.append(this.b);
            androidx.room.a.w(stringBuilder0, ", thumbnail=", this.c, ", blogName=", this.d);
            androidx.room.a.w(stringBuilder0, ", blogTitle=", this.e, ", mobileLink=", this.f);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }

        @JvmStatic
        public static final void write$Self$domain_release(Tip homeSlotContent$Tip0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || homeSlotContent$Tip0.a != 0L) {
                compositeEncoder0.encodeLongElement(serialDescriptor0, 0, homeSlotContent$Tip0.a);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || !Intrinsics.areEqual(homeSlotContent$Tip0.b, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 1, homeSlotContent$Tip0.b);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(homeSlotContent$Tip0.c, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 2, homeSlotContent$Tip0.c);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(homeSlotContent$Tip0.d, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 3, homeSlotContent$Tip0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || !Intrinsics.areEqual(homeSlotContent$Tip0.e, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 4, homeSlotContent$Tip0.e);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || !Intrinsics.areEqual(homeSlotContent$Tip0.f, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 5, homeSlotContent$Tip0.f);
            }
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002[ZB\u0099\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0006\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\u0013\u0010\u0014B\u009B\u0001\b\u0011\u0012\u0006\u0010\u0016\u001A\u00020\u0015\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017\u00A2\u0006\u0004\b\u0013\u0010\u0019J(\u0010\"\u001A\u00020\u001F2\u0006\u0010\u001A\u001A\u00020\u00002\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001E\u001A\u00020\u001DH\u00C1\u0001\u00A2\u0006\u0004\b \u0010!J\u0010\u0010#\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010\'\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010)\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010(J\u0010\u0010*\u001A\u00020\tH\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0012\u0010,\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b,\u0010(J\u0012\u0010-\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010(J\u0012\u0010.\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010(J\u0012\u0010/\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b/\u0010(J\u0012\u00100\u001A\u0004\u0018\u00010\tH\u00C6\u0003\u00A2\u0006\u0004\b0\u0010+J\u0012\u00101\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b1\u0010(J\u0012\u00102\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b2\u0010(J\u0012\u00103\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b3\u0010(J\u00A2\u0001\u00104\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\b\u001A\u00020\u00062\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0006H\u00C6\u0001\u00A2\u0006\u0004\b4\u00105J\u0010\u00106\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b6\u0010(J\u0010\u00107\u001A\u00020\u0015H\u00D6\u0001\u00A2\u0006\u0004\b7\u00108J\u001A\u0010;\u001A\u00020\u00042\b\u0010:\u001A\u0004\u0018\u000109H\u00D6\u0003\u00A2\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010$R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\b\u0005\u0010&R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010(R\u0017\u0010\b\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bE\u0010C\u001A\u0004\bF\u0010(R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bG\u0010H\u001A\u0004\bI\u0010+R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bJ\u0010C\u001A\u0004\bK\u0010(R\u0019\u0010\f\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bL\u0010C\u001A\u0004\bM\u0010(R\u0019\u0010\r\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bN\u0010C\u001A\u0004\bO\u0010(R\u0019\u0010\u000E\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bP\u0010C\u001A\u0004\bQ\u0010(R\u0019\u0010\u000F\u001A\u0004\u0018\u00010\t8\u0006\u00A2\u0006\f\n\u0004\bR\u0010H\u001A\u0004\bS\u0010+R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bT\u0010C\u001A\u0004\bU\u0010(R\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bV\u0010C\u001A\u0004\bW\u0010(R\u0019\u0010\u0012\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\bX\u0010C\u001A\u0004\bY\u0010(\u00A8\u0006\\"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Today;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$TodayType;", "type", "", "isLight", "", "mobileLink", "pcLink", "Lcom/kakao/tistory/domain/common/Thumbnail;", "image", "boxTitle", "title", "subTitle", "blogName", "blogImage", "blogTitle", "categoryLabel", "categoryId", "<init>", "(Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$TodayType;ZLjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/kakao/tistory/domain/home/entity/HomeSlotContent$TodayType;ZLjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Today;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$TodayType;", "component2", "()Z", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/kakao/tistory/domain/common/Thumbnail;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$TodayType;ZLjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Today;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$TodayType;", "getType", "b", "Z", "c", "Ljava/lang/String;", "getMobileLink", "d", "getPcLink", "e", "Lcom/kakao/tistory/domain/common/Thumbnail;", "getImage", "f", "getBoxTitle", "g", "getTitle", "h", "getSubTitle", "i", "getBlogName", "j", "getBlogImage", "k", "getBlogTitle", "l", "getCategoryLabel", "m", "getCategoryId", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class Today implements HomeSlotContent {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlotContent.Today.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Today;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Today;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Today;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Today..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Today..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Today..serializer homeSlotContent$Today$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Today..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Today..serializer.INSTANCE = homeSlotContent$Today$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.home.entity.HomeSlotContent.Today", homeSlotContent$Today$$serializer0, 13);
                pluginGeneratedSerialDescriptor0.addElement("type", true);
                pluginGeneratedSerialDescriptor0.addElement("isLight", true);
                pluginGeneratedSerialDescriptor0.addElement("mobileLink", true);
                pluginGeneratedSerialDescriptor0.addElement("pcLink", true);
                pluginGeneratedSerialDescriptor0.addElement("image", true);
                pluginGeneratedSerialDescriptor0.addElement("boxTitle", true);
                pluginGeneratedSerialDescriptor0.addElement("title", true);
                pluginGeneratedSerialDescriptor0.addElement("subTitle", true);
                pluginGeneratedSerialDescriptor0.addElement("blogName", true);
                pluginGeneratedSerialDescriptor0.addElement("blogImage", true);
                pluginGeneratedSerialDescriptor0.addElement("blogTitle", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryLabel", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryId", true);
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Today..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer kSerializer0 = Today.n[0];
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer2 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer3 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer4 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer5 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE);
                KSerializer kSerializer6 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer7 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                KSerializer kSerializer8 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{kSerializer0, BooleanSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, kSerializer1, kSerializer2, kSerializer3, kSerializer4, kSerializer5, kSerializer6, kSerializer7, kSerializer8};
            }

            @NotNull
            public Today deserialize(@NotNull Decoder decoder0) {
                TodayType homeSlotContent$TodayType1;
                String s16;
                Thumbnail thumbnail3;
                String s15;
                String s14;
                String s13;
                String s12;
                String s11;
                Thumbnail thumbnail2;
                String s10;
                int v;
                String s9;
                boolean z1;
                String s8;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                KSerializer[] arr_kSerializer = Today.n;
                if(compositeDecoder0.decodeSequentially()) {
                    TodayType homeSlotContent$TodayType0 = (TodayType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 0, arr_kSerializer[0], null);
                    boolean z = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 1);
                    String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                    Thumbnail thumbnail0 = (Thumbnail)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                    String s2 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 5, StringSerializer.INSTANCE, null);
                    String s3 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 6, StringSerializer.INSTANCE, null);
                    String s4 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 7, StringSerializer.INSTANCE, null);
                    String s5 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 8, StringSerializer.INSTANCE, null);
                    Thumbnail thumbnail1 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 9, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                    String s6 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 10, StringSerializer.INSTANCE, null);
                    String s7 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 11, StringSerializer.INSTANCE, null);
                    s8 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 12, StringSerializer.INSTANCE, null);
                    z1 = z;
                    s9 = s;
                    v = 0x1FFF;
                    s10 = s6;
                    thumbnail2 = thumbnail1;
                    s11 = s4;
                    s12 = s3;
                    s13 = s2;
                    s14 = s1;
                    s15 = s5;
                    thumbnail3 = thumbnail0;
                    s16 = s7;
                    homeSlotContent$TodayType1 = homeSlotContent$TodayType0;
                }
                else {
                    boolean z2 = false;
                    String s17 = null;
                    String s18 = null;
                    Thumbnail thumbnail4 = null;
                    String s19 = null;
                    String s20 = null;
                    String s21 = null;
                    String s22 = null;
                    TodayType homeSlotContent$TodayType2 = null;
                    String s23 = null;
                    String s24 = null;
                    Thumbnail thumbnail5 = null;
                    String s25 = null;
                    int v1 = 0;
                    boolean z3 = true;
                    while(z3) {
                        int v2 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                        switch(v2) {
                            case -1: {
                                z3 = false;
                                break;
                            }
                            case 0: {
                                homeSlotContent$TodayType2 = (TodayType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 0, arr_kSerializer[0], homeSlotContent$TodayType2);
                                v1 |= 1;
                                break;
                            }
                            case 1: {
                                v1 |= 2;
                                z2 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 1);
                                break;
                            }
                            case 2: {
                                s23 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                                v1 |= 4;
                                break;
                            }
                            case 3: {
                                s24 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                                v1 |= 8;
                                break;
                            }
                            case 4: {
                                thumbnail5 = (Thumbnail)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail5);
                                v1 |= 16;
                                break;
                            }
                            case 5: {
                                s25 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 5, StringSerializer.INSTANCE, s25);
                                v1 |= 0x20;
                                break;
                            }
                            case 6: {
                                s22 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 6, StringSerializer.INSTANCE, s22);
                                v1 |= 0x40;
                                break;
                            }
                            case 7: {
                                s19 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 7, StringSerializer.INSTANCE, s19);
                                v1 |= 0x80;
                                break;
                            }
                            case 8: {
                                s21 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 8, StringSerializer.INSTANCE, s21);
                                v1 |= 0x100;
                                break;
                            }
                            case 9: {
                                thumbnail4 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 9, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail4);
                                v1 |= 0x200;
                                break;
                            }
                            case 10: {
                                s18 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 10, StringSerializer.INSTANCE, s18);
                                v1 |= 0x400;
                                break;
                            }
                            case 11: {
                                s17 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 11, StringSerializer.INSTANCE, s17);
                                v1 |= 0x800;
                                break;
                            }
                            case 12: {
                                s20 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 12, StringSerializer.INSTANCE, s20);
                                v1 |= 0x1000;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v2);
                            }
                        }
                    }
                    homeSlotContent$TodayType1 = homeSlotContent$TodayType2;
                    z1 = z2;
                    thumbnail3 = thumbnail5;
                    v = v1;
                    s16 = s17;
                    s10 = s18;
                    thumbnail2 = thumbnail4;
                    s11 = s19;
                    s8 = s20;
                    s15 = s21;
                    s12 = s22;
                    s13 = s25;
                    s9 = s23;
                    s14 = s24;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Today(v, homeSlotContent$TodayType1, z1, s9, s14, thumbnail3, s13, s12, s11, s15, thumbnail2, s10, s16, s8, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Today..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Today homeSlotContent$Today0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlotContent$Today0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Today.write$Self$domain_release(homeSlotContent$Today0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((Today)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Today$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Today;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlotContent.Today.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlotContent.Today.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlotContent.Today..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlotContent.Today.Companion Companion;
        public final TodayType a;
        public final boolean b;
        public final String c;
        public final String d;
        public final Thumbnail e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final Thumbnail j;
        public final String k;
        public final String l;
        public final String m;
        public static final KSerializer[] n;

        static {
            Today.Companion = new com.kakao.tistory.domain.home.entity.HomeSlotContent.Today.Companion(null);
            Today.n = new KSerializer[]{EnumsKt.createSimpleEnumSerializer("com.kakao.tistory.domain.home.entity.HomeSlotContent.TodayType", TodayType.values()), null, null, null, null, null, null, null, null, null, null, null, null};
        }

        public Today() {
            this(null, false, null, null, null, null, null, null, null, null, null, null, null, 0x1FFF, null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Today(int v, TodayType homeSlotContent$TodayType0, boolean z, String s, String s1, Thumbnail thumbnail0, String s2, String s3, String s4, String s5, Thumbnail thumbnail1, String s6, String s7, String s8, SerializationConstructorMarker serializationConstructorMarker0) {
            if((v & 1) == 0) {
                homeSlotContent$TodayType0 = TodayType.UNKNOWN;
            }
            this.a = homeSlotContent$TodayType0;
            this.b = (v & 2) == 0 ? true : z;
            this.c = (v & 4) == 0 ? "" : s;
            this.d = (v & 8) == 0 ? "" : s1;
            this.e = (v & 16) == 0 ? Thumbnail.Companion.getEmpty() : thumbnail0;
            this.f = (v & 0x20) == 0 ? null : s2;
            this.g = (v & 0x40) == 0 ? null : s3;
            this.h = (v & 0x80) == 0 ? null : s4;
            this.i = (v & 0x100) == 0 ? null : s5;
            this.j = (v & 0x200) == 0 ? null : thumbnail1;
            this.k = (v & 0x400) == 0 ? null : s6;
            this.l = (v & 0x800) == 0 ? null : s7;
            if((v & 0x1000) == 0) {
                this.m = null;
                return;
            }
            this.m = s8;
        }

        public Today(@NotNull TodayType homeSlotContent$TodayType0, boolean z, @NotNull String s, @NotNull String s1, @NotNull Thumbnail thumbnail0, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable Thumbnail thumbnail1, @Nullable String s6, @Nullable String s7, @Nullable String s8) {
            Intrinsics.checkNotNullParameter(homeSlotContent$TodayType0, "type");
            Intrinsics.checkNotNullParameter(s, "mobileLink");
            Intrinsics.checkNotNullParameter(s1, "pcLink");
            Intrinsics.checkNotNullParameter(thumbnail0, "image");
            super();
            this.a = homeSlotContent$TodayType0;
            this.b = z;
            this.c = s;
            this.d = s1;
            this.e = thumbnail0;
            this.f = s2;
            this.g = s3;
            this.h = s4;
            this.i = s5;
            this.j = thumbnail1;
            this.k = s6;
            this.l = s7;
            this.m = s8;
        }

        public Today(TodayType homeSlotContent$TodayType0, boolean z, String s, String s1, Thumbnail thumbnail0, String s2, String s3, String s4, String s5, Thumbnail thumbnail1, String s6, String s7, String s8, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            this(((v & 1) == 0 ? homeSlotContent$TodayType0 : TodayType.UNKNOWN), ((v & 2) == 0 ? z : true), ((v & 4) == 0 ? s : ""), ((v & 8) == 0 ? s1 : ""), ((v & 16) == 0 ? thumbnail0 : Thumbnail.Companion.getEmpty()), ((v & 0x20) == 0 ? s2 : null), ((v & 0x40) == 0 ? s3 : null), ((v & 0x80) == 0 ? s4 : null), ((v & 0x100) == 0 ? s5 : null), ((v & 0x200) == 0 ? thumbnail1 : null), ((v & 0x400) == 0 ? s6 : null), ((v & 0x800) == 0 ? s7 : null), ((v & 0x1000) == 0 ? s8 : null));
        }

        @NotNull
        public final TodayType component1() {
            return this.a;
        }

        @Nullable
        public final Thumbnail component10() {
            return this.j;
        }

        @Nullable
        public final String component11() {
            return this.k;
        }

        @Nullable
        public final String component12() {
            return this.l;
        }

        @Nullable
        public final String component13() {
            return this.m;
        }

        public final boolean component2() {
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
        public final Thumbnail component5() {
            return this.e;
        }

        @Nullable
        public final String component6() {
            return this.f;
        }

        @Nullable
        public final String component7() {
            return this.g;
        }

        @Nullable
        public final String component8() {
            return this.h;
        }

        @Nullable
        public final String component9() {
            return this.i;
        }

        @NotNull
        public final Today copy(@NotNull TodayType homeSlotContent$TodayType0, boolean z, @NotNull String s, @NotNull String s1, @NotNull Thumbnail thumbnail0, @Nullable String s2, @Nullable String s3, @Nullable String s4, @Nullable String s5, @Nullable Thumbnail thumbnail1, @Nullable String s6, @Nullable String s7, @Nullable String s8) {
            Intrinsics.checkNotNullParameter(homeSlotContent$TodayType0, "type");
            Intrinsics.checkNotNullParameter(s, "mobileLink");
            Intrinsics.checkNotNullParameter(s1, "pcLink");
            Intrinsics.checkNotNullParameter(thumbnail0, "image");
            return new Today(homeSlotContent$TodayType0, z, s, s1, thumbnail0, s2, s3, s4, s5, thumbnail1, s6, s7, s8);
        }

        public static Today copy$default(Today homeSlotContent$Today0, TodayType homeSlotContent$TodayType0, boolean z, String s, String s1, Thumbnail thumbnail0, String s2, String s3, String s4, String s5, Thumbnail thumbnail1, String s6, String s7, String s8, int v, Object object0) {
            TodayType homeSlotContent$TodayType1 = (v & 1) == 0 ? homeSlotContent$TodayType0 : homeSlotContent$Today0.a;
            boolean z1 = (v & 2) == 0 ? z : homeSlotContent$Today0.b;
            String s9 = (v & 4) == 0 ? s : homeSlotContent$Today0.c;
            String s10 = (v & 8) == 0 ? s1 : homeSlotContent$Today0.d;
            Thumbnail thumbnail2 = (v & 16) == 0 ? thumbnail0 : homeSlotContent$Today0.e;
            String s11 = (v & 0x20) == 0 ? s2 : homeSlotContent$Today0.f;
            String s12 = (v & 0x40) == 0 ? s3 : homeSlotContent$Today0.g;
            String s13 = (v & 0x80) == 0 ? s4 : homeSlotContent$Today0.h;
            String s14 = (v & 0x100) == 0 ? s5 : homeSlotContent$Today0.i;
            Thumbnail thumbnail3 = (v & 0x200) == 0 ? thumbnail1 : homeSlotContent$Today0.j;
            String s15 = (v & 0x400) == 0 ? s6 : homeSlotContent$Today0.k;
            String s16 = (v & 0x800) == 0 ? s7 : homeSlotContent$Today0.l;
            return (v & 0x1000) == 0 ? homeSlotContent$Today0.copy(homeSlotContent$TodayType1, z1, s9, s10, thumbnail2, s11, s12, s13, s14, thumbnail3, s15, s16, s8) : homeSlotContent$Today0.copy(homeSlotContent$TodayType1, z1, s9, s10, thumbnail2, s11, s12, s13, s14, thumbnail3, s15, s16, homeSlotContent$Today0.m);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Today)) {
                return false;
            }
            if(this.a != ((Today)object0).a) {
                return false;
            }
            if(this.b != ((Today)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Today)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Today)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((Today)object0).e)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.f, ((Today)object0).f)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.g, ((Today)object0).g)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.h, ((Today)object0).h)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.i, ((Today)object0).i)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.j, ((Today)object0).j)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.k, ((Today)object0).k)) {
                return false;
            }
            return Intrinsics.areEqual(this.l, ((Today)object0).l) ? Intrinsics.areEqual(this.m, ((Today)object0).m) : false;
        }

        @Nullable
        public final Thumbnail getBlogImage() {
            return this.j;
        }

        @Nullable
        public final String getBlogName() {
            return this.i;
        }

        @Nullable
        public final String getBlogTitle() {
            return this.k;
        }

        @Nullable
        public final String getBoxTitle() {
            return this.f;
        }

        @Nullable
        public final String getCategoryId() {
            return this.m;
        }

        @Nullable
        public final String getCategoryLabel() {
            return this.l;
        }

        @NotNull
        public final Thumbnail getImage() {
            return this.e;
        }

        @NotNull
        public final String getMobileLink() [...] // 潜在的解密器

        @NotNull
        public final String getPcLink() {
            return this.d;
        }

        @Nullable
        public final String getSubTitle() {
            return this.h;
        }

        @Nullable
        public final String getTitle() {
            return this.g;
        }

        @NotNull
        public final TodayType getType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            int v = b.a(this.d, b.a(this.c, c.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F), 0x1F);
            int v1 = this.e.hashCode();
            int v2 = 0;
            int v3 = this.f == null ? 0 : this.f.hashCode();
            int v4 = this.g == null ? 0 : this.g.hashCode();
            int v5 = this.h == null ? 0 : this.h.hashCode();
            int v6 = this.i == null ? 0 : this.i.hashCode();
            int v7 = this.j == null ? 0 : this.j.hashCode();
            int v8 = this.k == null ? 0 : this.k.hashCode();
            int v9 = this.l == null ? 0 : this.l.hashCode();
            String s = this.m;
            if(s != null) {
                v2 = s.hashCode();
            }
            return ((((((((v1 + v) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v2;
        }

        public final boolean isLight() {
            return this.b;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Today(type=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", isLight=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", mobileLink=");
            androidx.room.a.w(stringBuilder0, this.c, ", pcLink=", this.d, ", image=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", boxTitle=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", title=");
            androidx.room.a.w(stringBuilder0, this.g, ", subTitle=", this.h, ", blogName=");
            stringBuilder0.append(this.i);
            stringBuilder0.append(", blogImage=");
            stringBuilder0.append(this.j);
            stringBuilder0.append(", blogTitle=");
            androidx.room.a.w(stringBuilder0, this.k, ", categoryLabel=", this.l, ", categoryId=");
            return a.o(stringBuilder0, this.m, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(Today homeSlotContent$Today0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            KSerializer[] arr_kSerializer = Today.n;
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || homeSlotContent$Today0.a != TodayType.UNKNOWN) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 0, arr_kSerializer[0], homeSlotContent$Today0.a);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || !homeSlotContent$Today0.b) {
                compositeEncoder0.encodeBooleanElement(serialDescriptor0, 1, homeSlotContent$Today0.b);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(homeSlotContent$Today0.c, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 2, homeSlotContent$Today0.c);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(homeSlotContent$Today0.d, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 3, homeSlotContent$Today0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4)) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 4, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$Today0.e);
            }
            else {
                Thumbnail thumbnail0 = Thumbnail.Companion.getEmpty();
                if(!Intrinsics.areEqual(homeSlotContent$Today0.e, thumbnail0)) {
                    compositeEncoder0.encodeSerializableElement(serialDescriptor0, 4, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$Today0.e);
                }
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || homeSlotContent$Today0.f != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 5, StringSerializer.INSTANCE, homeSlotContent$Today0.f);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6) || homeSlotContent$Today0.g != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 6, StringSerializer.INSTANCE, homeSlotContent$Today0.g);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 7) || homeSlotContent$Today0.h != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 7, StringSerializer.INSTANCE, homeSlotContent$Today0.h);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 8) || homeSlotContent$Today0.i != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 8, StringSerializer.INSTANCE, homeSlotContent$Today0.i);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 9) || homeSlotContent$Today0.j != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 9, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, homeSlotContent$Today0.j);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 10) || homeSlotContent$Today0.k != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 10, StringSerializer.INSTANCE, homeSlotContent$Today0.k);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 11) || homeSlotContent$Today0.l != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 11, StringSerializer.INSTANCE, homeSlotContent$Today0.l);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 12) || homeSlotContent$Today0.m != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 12, StringSerializer.INSTANCE, homeSlotContent$Today0.m);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$TodayType;", "", "NOTIFICATION", "ENTRY", "EVENT", "UNKNOWN", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum TodayType {
        NOTIFICATION,
        ENTRY,
        EVENT,
        UNKNOWN;

        public static final TodayType[] a;
        public static final EnumEntries b;

        static {
            TodayType.a = arr_homeSlotContent$TodayType;
            Intrinsics.checkNotNullParameter(arr_homeSlotContent$TodayType, "entries");
            TodayType.b = new sd.a(arr_homeSlotContent$TodayType);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return TodayType.b;
        }
    }

}

