package com.kakao.tistory.domain.home.entity;

import com.kakao.tistory.domain.blog.entity.b;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonClassDiscriminator;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00102\u00020\u0001:\f\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0016\u0010\n\u001A\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\t\u0082\u0001\t\u0018\u0019\u001A\u001B\u001C\u001D\u001E\u001F ¨\u0006!"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "", "position", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "slotType", "", "getSlotType", "()Ljava/lang/String;", "title", "getTitle", "Banner", "Best", "Category", "CategoryGroup", "Companion", "Creator", "Focus", "Position", "Subscription", "Tip", "Today", "Unknown", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Banner;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Best;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Creator;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Focus;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Subscription;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Tip;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Today;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Unknown;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
@JsonClassDiscriminator(discriminator = "slotType")
public interface HomeSlot {
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000E\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B%\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0011\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000EJ(\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u000F\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001A\u0010\u001BJ\u0012\u0010\u001C\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001C\u0010\u001DJ0\u0010\u001E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001A\u0010&\u001A\u00020%2\b\u0010$\u001A\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010\'R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\u0019R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010\u001BR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u0010\u001D¨\u00063"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Banner;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;", "contents", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlot$Banner;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "()Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Banner;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Banner;", "getContents", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SerialName("BANNER")
    @Serializable
    public static final class Banner implements HomeSlot {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlot.Banner.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Banner;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Banner;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Banner;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class .serializer implements GeneratedSerializer {
            @NotNull
            public static final .serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                .serializer homeSlot$Banner$$serializer0 = new .serializer();
                .serializer.INSTANCE = homeSlot$Banner$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("BANNER", homeSlot$Banner$$serializer0, 3);
                pluginGeneratedSerialDescriptor0.addElement("slotType", false);
                pluginGeneratedSerialDescriptor0.addElement("position", true);
                pluginGeneratedSerialDescriptor0.addElement("contents", true);
                pluginGeneratedSerialDescriptor0.pushClassAnnotation(new HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0("slotType"));
                .serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer kSerializer0 = Banner.d[1];
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner..serializer.INSTANCE);
                return new KSerializer[]{StringSerializer.INSTANCE, kSerializer0, kSerializer1};
            }

            @NotNull
            public Banner deserialize(@NotNull Decoder decoder0) {
                int v;
                com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner homeSlotContent$Banner0;
                String s2;
                Position homeSlot$Position0;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                KSerializer[] arr_kSerializer = Banner.d;
                String s = null;
                if(compositeDecoder0.decodeSequentially()) {
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    homeSlot$Position0 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                    s2 = s1;
                    homeSlotContent$Banner0 = (com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner..serializer.INSTANCE, null);
                    v = 7;
                }
                else {
                    int v1 = 0;
                    Position homeSlot$Position1 = null;
                    com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner homeSlotContent$Banner1 = null;
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
                                homeSlot$Position1 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Position1);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                homeSlotContent$Banner1 = (com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner..serializer.INSTANCE, homeSlotContent$Banner1);
                                v1 |= 4;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v2);
                            }
                        }
                    }
                    v = v1;
                    s2 = s;
                    homeSlot$Position0 = homeSlot$Position1;
                    homeSlotContent$Banner0 = homeSlotContent$Banner1;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Banner(v, s2, homeSlot$Position0, homeSlotContent$Banner0, null);
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

            public void serialize(@NotNull Encoder encoder0, @NotNull Banner homeSlot$Banner0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlot$Banner0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Banner.write$Self$domain_release(homeSlot$Banner0, compositeEncoder0, serialDescriptor0);
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Banner$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Banner;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
        public final Position b;
        public final com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner c;
        public static final KSerializer[] d;

        static {
            Banner.Companion = new Companion(null);
            Banner.d = new KSerializer[]{null, EnumsKt.createSimpleEnumSerializer("com.kakao.tistory.domain.home.entity.HomeSlot.Position", Position.values()), null};
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Banner(int v, String s, Position homeSlot$Position0, com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner homeSlotContent$Banner0, SerializationConstructorMarker serializationConstructorMarker0) {
            if(1 != (v & 1)) {
                PluginExceptionsKt.throwMissingFieldException(v, 1, .serializer.INSTANCE.getDescriptor());
            }
            super();
            this.a = s;
            this.b = (v & 2) == 0 ? Position.LEFT : homeSlot$Position0;
            if((v & 4) == 0) {
                this.c = null;
                return;
            }
            this.c = homeSlotContent$Banner0;
        }

        public Banner(@NotNull String s, @NotNull Position homeSlot$Position0, @Nullable com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner homeSlotContent$Banner0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = homeSlotContent$Banner0;
        }

        public Banner(String s, Position homeSlot$Position0, com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner homeSlotContent$Banner0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                homeSlot$Position0 = Position.LEFT;
            }
            if((v & 4) != 0) {
                homeSlotContent$Banner0 = null;
            }
            this(s, homeSlot$Position0, homeSlotContent$Banner0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
            return this.b;
        }

        @Nullable
        public final com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner component3() {
            return this.c;
        }

        @NotNull
        public final Banner copy(@NotNull String s, @NotNull Position homeSlot$Position0, @Nullable com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner homeSlotContent$Banner0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            return new Banner(s, homeSlot$Position0, homeSlotContent$Banner0);
        }

        public static Banner copy$default(Banner homeSlot$Banner0, String s, Position homeSlot$Position0, com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner homeSlotContent$Banner0, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlot$Banner0.a;
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = homeSlot$Banner0.b;
            }
            if((v & 4) != 0) {
                homeSlotContent$Banner0 = homeSlot$Banner0.c;
            }
            return homeSlot$Banner0.copy(s, homeSlot$Position0, homeSlotContent$Banner0);
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
            return this.b == ((Banner)object0).b ? Intrinsics.areEqual(this.c, ((Banner)object0).c) : false;
        }

        @Nullable
        public final com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner getContents() {
            return this.c;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @Nullable
        public String getTitle() {
            return null;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            int v1 = this.b.hashCode();
            return this.c == null ? (v1 + v * 0x1F) * 0x1F : (v1 + v * 0x1F) * 0x1F + this.c.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Banner(slotType=" + this.a + ", position=" + this.b + ", contents=" + this.c + ")";
        }

        @JvmStatic
        public static final void write$Self$domain_release(Banner homeSlot$Banner0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            KSerializer[] arr_kSerializer = Banner.d;
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlot$Banner0.getSlotType());
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || homeSlot$Banner0.getPosition() != Position.LEFT) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Banner0.getPosition());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || homeSlot$Banner0.c != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.home.entity.HomeSlotContent.Banner..serializer.INSTANCE, homeSlot$Banner0.c);
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000E\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u00A2\u0006\u0004\b\t\u0010\nB?\b\u0011\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\r\u00A2\u0006\u0004\b\t\u0010\u000FJ(\u0010\u0018\u001A\u00020\u00152\u0006\u0010\u0010\u001A\u00020\u00002\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u0013H\u00C1\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0016\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ4\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00C6\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b!\u0010\u001AJ\u0010\u0010\"\u001A\u00020\u000BH\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010#J\u001A\u0010\'\u001A\u00020&2\b\u0010%\u001A\u0004\u0018\u00010$H\u00D6\u0003\u00A2\u0006\u0004\b\'\u0010(R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u001AR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u001CR\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u001E\u00A8\u00064"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Best;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Best;", "contents", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlot$Best;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/util/List;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Best;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "Ljava/util/List;", "getContents", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SerialName("BEST")
    @Serializable
    public static final class Best implements HomeSlot {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlot.Best.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Best;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Best;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Best;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Best..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlot.Best..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlot.Best..serializer homeSlot$Best$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlot.Best..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlot.Best..serializer.INSTANCE = homeSlot$Best$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("BEST", homeSlot$Best$$serializer0, 3);
                pluginGeneratedSerialDescriptor0.addElement("slotType", false);
                pluginGeneratedSerialDescriptor0.addElement("position", true);
                pluginGeneratedSerialDescriptor0.addElement("contents", true);
                pluginGeneratedSerialDescriptor0.pushClassAnnotation(new HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0("slotType"));
                com.kakao.tistory.domain.home.entity.HomeSlot.Best..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer[] arr_kSerializer = Best.d;
                return new KSerializer[]{StringSerializer.INSTANCE, arr_kSerializer[1], arr_kSerializer[2]};
            }

            @NotNull
            public Best deserialize(@NotNull Decoder decoder0) {
                Position homeSlot$Position1;
                int v;
                String s2;
                List list0;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                KSerializer[] arr_kSerializer = Best.d;
                String s = null;
                if(compositeDecoder0.decodeSequentially()) {
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    Position homeSlot$Position0 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                    list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], null);
                    s2 = s1;
                    v = 7;
                    homeSlot$Position1 = homeSlot$Position0;
                }
                else {
                    int v1 = 0;
                    Position homeSlot$Position2 = null;
                    List list1 = null;
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
                                homeSlot$Position2 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Position2);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], list1);
                                v1 |= 4;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v2);
                            }
                        }
                    }
                    v = v1;
                    s2 = s;
                    homeSlot$Position1 = homeSlot$Position2;
                    list0 = list1;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Best(v, s2, homeSlot$Position1, list0, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Best..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Best homeSlot$Best0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlot$Best0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Best.write$Self$domain_release(homeSlot$Best0, compositeEncoder0, serialDescriptor0);
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Best$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Best;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Best.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlot.Best.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Best..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlot.Best.Companion Companion;
        public final String a;
        public final Position b;
        public final List c;
        public static final KSerializer[] d;

        static {
            Best.Companion = new com.kakao.tistory.domain.home.entity.HomeSlot.Best.Companion(null);
            Best.d = new KSerializer[]{null, EnumsKt.createSimpleEnumSerializer("com.kakao.tistory.domain.home.entity.HomeSlot.Position", Position.values()), new ArrayListSerializer(com.kakao.tistory.domain.home.entity.HomeSlotContent.Best..serializer.INSTANCE)};
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Best(int v, String s, Position homeSlot$Position0, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
            if(1 != (v & 1)) {
                PluginExceptionsKt.throwMissingFieldException(v, 1, com.kakao.tistory.domain.home.entity.HomeSlot.Best..serializer.INSTANCE.getDescriptor());
            }
            super();
            this.a = s;
            this.b = (v & 2) == 0 ? Position.LEFT : homeSlot$Position0;
            if((v & 4) == 0) {
                this.c = CollectionsKt__CollectionsKt.emptyList();
                return;
            }
            this.c = list0;
        }

        public Best(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(list0, "contents");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = list0;
        }

        public Best(String s, Position homeSlot$Position0, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                homeSlot$Position0 = Position.LEFT;
            }
            if((v & 4) != 0) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            this(s, homeSlot$Position0, list0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
            return this.b;
        }

        @NotNull
        public final List component3() {
            return this.c;
        }

        @NotNull
        public final Best copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(list0, "contents");
            return new Best(s, homeSlot$Position0, list0);
        }

        public static Best copy$default(Best homeSlot$Best0, String s, Position homeSlot$Position0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlot$Best0.a;
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = homeSlot$Best0.b;
            }
            if((v & 4) != 0) {
                list0 = homeSlot$Best0.c;
            }
            return homeSlot$Best0.copy(s, homeSlot$Position0, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Best)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Best)object0).a)) {
                return false;
            }
            return this.b == ((Best)object0).b ? Intrinsics.areEqual(this.c, ((Best)object0).c) : false;
        }

        @NotNull
        public final List getContents() {
            return this.c;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @Nullable
        public String getTitle() {
            return null;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Best(slotType=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", contents=");
            return a.e(stringBuilder0, this.c, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(Best homeSlot$Best0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            KSerializer[] arr_kSerializer = Best.d;
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlot$Best0.getSlotType());
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || homeSlot$Best0.getPosition() != Position.LEFT) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Best0.getPosition());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(homeSlot$Best0.c, CollectionsKt__CollectionsKt.emptyList())) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], homeSlot$Best0.c);
            }
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0016\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBY\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0002\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u0002\u0012\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\t\u00A2\u0006\u0004\b\u000E\u0010\u000FBm\b\u0011\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0002\u0012\u000E\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000E\u0010\r\u001A\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012\u00A2\u0006\u0004\b\u000E\u0010\u0014J(\u0010\u001D\u001A\u00020\u001A2\u0006\u0010\u0015\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0019\u001A\u00020\u0018H\u00C1\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001E\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b \u0010!J\u0010\u0010\"\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\"\u0010\u001FJ\u0010\u0010#\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b#\u0010\u001FJ\u0012\u0010$\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b$\u0010\u001FJ\u0016\u0010%\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u00C6\u0003\u00A2\u0006\u0004\b%\u0010&J\u0016\u0010\'\u001A\b\u0012\u0004\u0012\u00020\f0\tH\u00C6\u0003\u00A2\u0006\u0004\b\'\u0010&Jd\u0010(\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00022\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\u00022\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t2\u000E\b\u0002\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\tH\u00C6\u0001\u00A2\u0006\u0004\b(\u0010)J\u0010\u0010*\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b*\u0010\u001FJ\u0010\u0010+\u001A\u00020\u0010H\u00D6\u0001\u00A2\u0006\u0004\b+\u0010,J\u001A\u00100\u001A\u00020/2\b\u0010.\u001A\u0004\u0018\u00010-H\u00D6\u0003\u00A2\u0006\u0004\b0\u00101R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010\u001FR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010!R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b8\u00103\u001A\u0004\b9\u0010\u001FR\u001A\u0010\u0007\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b:\u00103\u001A\u0004\b;\u0010\u001FR\u0019\u0010\b\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b<\u00103\u001A\u0004\b=\u0010\u001FR\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0006\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b@\u0010&R\u001D\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\t8\u0006\u00A2\u0006\f\n\u0004\bA\u0010?\u001A\u0004\bB\u0010&\u00A8\u0006E"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "activeCategoryGroup", "title", "emojiUrl", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Category;", "contents", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$CategoryGroup;", "categoryGroups", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "getActiveCategoryGroup", "d", "getTitle", "e", "getEmojiUrl", "f", "Ljava/util/List;", "getContents", "g", "getCategoryGroups", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SerialName("CATEGORY")
    @Serializable
    public static final class Category implements HomeSlot {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlot.Category.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Category..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlot.Category..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlot.Category..serializer homeSlot$Category$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlot.Category..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlot.Category..serializer.INSTANCE = homeSlot$Category$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("CATEGORY", homeSlot$Category$$serializer0, 7);
                pluginGeneratedSerialDescriptor0.addElement("slotType", false);
                pluginGeneratedSerialDescriptor0.addElement("position", true);
                pluginGeneratedSerialDescriptor0.addElement("activeCategoryGroup", true);
                pluginGeneratedSerialDescriptor0.addElement("title", true);
                pluginGeneratedSerialDescriptor0.addElement("emojiUrl", true);
                pluginGeneratedSerialDescriptor0.addElement("contents", true);
                pluginGeneratedSerialDescriptor0.addElement("categoryGroups", true);
                pluginGeneratedSerialDescriptor0.pushClassAnnotation(new HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0("slotType"));
                com.kakao.tistory.domain.home.entity.HomeSlot.Category..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer[] arr_kSerializer = Category.h;
                KSerializer kSerializer0 = arr_kSerializer[1];
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{StringSerializer.INSTANCE, kSerializer0, StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer1, arr_kSerializer[5], arr_kSerializer[6]};
            }

            @NotNull
            public Category deserialize(@NotNull Decoder decoder0) {
                Position homeSlot$Position1;
                List list2;
                int v;
                String s8;
                String s7;
                String s6;
                String s5;
                List list1;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                KSerializer[] arr_kSerializer = Category.h;
                String s = null;
                if(compositeDecoder0.decodeSequentially()) {
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    Position homeSlot$Position0 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                    String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                    String s3 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                    String s4 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 4, StringSerializer.INSTANCE, null);
                    List list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], null);
                    list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], null);
                    s5 = s1;
                    s6 = s3;
                    s7 = s4;
                    s8 = s2;
                    v = 0x7F;
                    list2 = list0;
                    homeSlot$Position1 = homeSlot$Position0;
                }
                else {
                    int v1 = 0;
                    List list3 = null;
                    List list4 = null;
                    Position homeSlot$Position2 = null;
                    String s9 = null;
                    String s10 = null;
                    String s11 = null;
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
                                homeSlot$Position2 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Position2);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                s9 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                                v1 |= 4;
                                break;
                            }
                            case 3: {
                                s10 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                                v1 |= 8;
                                break;
                            }
                            case 4: {
                                s11 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 4, StringSerializer.INSTANCE, s11);
                                v1 |= 16;
                                break;
                            }
                            case 5: {
                                list4 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], list4);
                                v1 |= 0x20;
                                break;
                            }
                            case 6: {
                                list3 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], list3);
                                v1 |= 0x40;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v2);
                            }
                        }
                    }
                    v = v1;
                    list1 = list3;
                    list2 = list4;
                    s5 = s;
                    homeSlot$Position1 = homeSlot$Position2;
                    s8 = s9;
                    s6 = s10;
                    s7 = s11;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Category(v, s5, homeSlot$Position1, s8, s6, s7, list2, list1, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Category..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Category homeSlot$Category0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlot$Category0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Category.write$Self$domain_release(homeSlot$Category0, compositeEncoder0, serialDescriptor0);
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Category;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Category.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlot.Category.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Category..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlot.Category.Companion Companion;
        public final String a;
        public final Position b;
        public final String c;
        public final String d;
        public final String e;
        public final List f;
        public final List g;
        public static final KSerializer[] h;

        static {
            Category.Companion = new com.kakao.tistory.domain.home.entity.HomeSlot.Category.Companion(null);
            Category.h = new KSerializer[]{null, EnumsKt.createSimpleEnumSerializer("com.kakao.tistory.domain.home.entity.HomeSlot.Position", Position.values()), null, null, null, new ArrayListSerializer(com.kakao.tistory.domain.home.entity.HomeSlotContent.Category..serializer.INSTANCE), new ArrayListSerializer(com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup..serializer.INSTANCE)};
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Category(int v, String s, Position homeSlot$Position0, String s1, String s2, String s3, List list0, List list1, SerializationConstructorMarker serializationConstructorMarker0) {
            if(1 != (v & 1)) {
                PluginExceptionsKt.throwMissingFieldException(v, 1, com.kakao.tistory.domain.home.entity.HomeSlot.Category..serializer.INSTANCE.getDescriptor());
            }
            super();
            this.a = s;
            this.b = (v & 2) == 0 ? Position.LEFT : homeSlot$Position0;
            this.c = (v & 4) == 0 ? "" : s1;
            this.d = (v & 8) == 0 ? "" : s2;
            this.e = (v & 16) == 0 ? null : s3;
            this.f = (v & 0x20) == 0 ? CollectionsKt__CollectionsKt.emptyList() : list0;
            if((v & 0x40) == 0) {
                this.g = CollectionsKt__CollectionsKt.emptyList();
                return;
            }
            this.g = list1;
        }

        public Category(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @NotNull String s2, @Nullable String s3, @NotNull List list0, @NotNull List list1) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "activeCategoryGroup");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            Intrinsics.checkNotNullParameter(list1, "categoryGroups");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = s1;
            this.d = s2;
            this.e = s3;
            this.f = list0;
            this.g = list1;
        }

        public Category(String s, Position homeSlot$Position0, String s1, String s2, String s3, List list0, List list1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            this(s, ((v & 2) == 0 ? homeSlot$Position0 : Position.LEFT), ((v & 4) == 0 ? s1 : ""), ((v & 8) == 0 ? s2 : ""), ((v & 16) == 0 ? s3 : null), ((v & 0x20) == 0 ? list0 : CollectionsKt__CollectionsKt.emptyList()), ((v & 0x40) == 0 ? list1 : CollectionsKt__CollectionsKt.emptyList()));
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
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

        @Nullable
        public final String component5() {
            return this.e;
        }

        @NotNull
        public final List component6() {
            return this.f;
        }

        @NotNull
        public final List component7() {
            return this.g;
        }

        @NotNull
        public final Category copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @NotNull String s2, @Nullable String s3, @NotNull List list0, @NotNull List list1) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "activeCategoryGroup");
            Intrinsics.checkNotNullParameter(s2, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            Intrinsics.checkNotNullParameter(list1, "categoryGroups");
            return new Category(s, homeSlot$Position0, s1, s2, s3, list0, list1);
        }

        public static Category copy$default(Category homeSlot$Category0, String s, Position homeSlot$Position0, String s1, String s2, String s3, List list0, List list1, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlot$Category0.a;
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = homeSlot$Category0.b;
            }
            if((v & 4) != 0) {
                s1 = homeSlot$Category0.c;
            }
            if((v & 8) != 0) {
                s2 = homeSlot$Category0.d;
            }
            if((v & 16) != 0) {
                s3 = homeSlot$Category0.e;
            }
            if((v & 0x20) != 0) {
                list0 = homeSlot$Category0.f;
            }
            if((v & 0x40) != 0) {
                list1 = homeSlot$Category0.g;
            }
            return homeSlot$Category0.copy(s, homeSlot$Position0, s1, s2, s3, list0, list1);
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
            if(this.b != ((Category)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Category)object0).c)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Category)object0).d)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.e, ((Category)object0).e)) {
                return false;
            }
            return Intrinsics.areEqual(this.f, ((Category)object0).f) ? Intrinsics.areEqual(this.g, ((Category)object0).g) : false;
        }

        @NotNull
        public final String getActiveCategoryGroup() {
            return this.c;
        }

        @NotNull
        public final List getCategoryGroups() {
            return this.g;
        }

        @NotNull
        public final List getContents() {
            return this.f;
        }

        @Nullable
        public final String getEmojiUrl() {
            return this.e;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getTitle() {
            return this.d;
        }

        @Override
        public int hashCode() {
            int v = b.a(this.d, b.a(this.c, (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F), 0x1F);
            return this.e == null ? this.g.hashCode() + a5.b.c(this.f, v * 0x1F, 0x1F) : this.g.hashCode() + a5.b.c(this.f, (v + this.e.hashCode()) * 0x1F, 0x1F);
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Category(slotType=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", activeCategoryGroup=");
            androidx.room.a.w(stringBuilder0, this.c, ", title=", this.d, ", emojiUrl=");
            stringBuilder0.append(this.e);
            stringBuilder0.append(", contents=");
            stringBuilder0.append(this.f);
            stringBuilder0.append(", categoryGroups=");
            return a.e(stringBuilder0, this.g, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(Category homeSlot$Category0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            KSerializer[] arr_kSerializer = Category.h;
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlot$Category0.getSlotType());
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || homeSlot$Category0.getPosition() != Position.LEFT) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Category0.getPosition());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(homeSlot$Category0.c, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 2, homeSlot$Category0.c);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(homeSlot$Category0.getTitle(), "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 3, homeSlot$Category0.getTitle());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || homeSlot$Category0.e != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 4, StringSerializer.INSTANCE, homeSlot$Category0.e);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || !Intrinsics.areEqual(homeSlot$Category0.f, CollectionsKt__CollectionsKt.emptyList())) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], homeSlot$Category0.f);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6) || !Intrinsics.areEqual(homeSlot$Category0.g, CollectionsKt__CollectionsKt.emptyList())) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], homeSlot$Category0.g);
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002\'&B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000BJ(\u0010\u0014\u001A\u00020\u00112\u0006\u0010\f\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000FHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001A\u0010\u0016J\u0010\u0010\u001B\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010\u001F\u001A\u00020\u001E2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001F\u0010 R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001A\u0004\b%\u0010\u0016¨\u0006("}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$CategoryGroup;", "", "", "id", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlot$CategoryGroup;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$CategoryGroup;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getLabel", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class CategoryGroup {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlot.CategoryGroup.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$CategoryGroup;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$CategoryGroup;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlot$CategoryGroup;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup..serializer homeSlot$CategoryGroup$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup..serializer.INSTANCE = homeSlot$CategoryGroup$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup", homeSlot$CategoryGroup$$serializer0, 2);
                pluginGeneratedSerialDescriptor0.addElement("id", true);
                pluginGeneratedSerialDescriptor0.addElement("label", true);
                com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE};
            }

            @NotNull
            public CategoryGroup deserialize(@NotNull Decoder decoder0) {
                int v;
                String s1;
                String s;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                if(compositeDecoder0.decodeSequentially()) {
                    s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                    v = 3;
                }
                else {
                    int v1 = 0;
                    s = null;
                    String s2 = null;
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
                                s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                                v1 |= 2;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v2);
                            }
                        }
                    }
                    s1 = s2;
                    v = v1;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new CategoryGroup(v, s, s1, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull CategoryGroup homeSlot$CategoryGroup0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlot$CategoryGroup0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                CategoryGroup.write$Self$domain_release(homeSlot$CategoryGroup0, compositeEncoder0, serialDescriptor0);
                compositeEncoder0.endStructure(serialDescriptor0);
            }

            @Override  // kotlinx.serialization.SerializationStrategy
            public void serialize(Encoder encoder0, Object object0) {
                this.serialize(encoder0, ((CategoryGroup)object0));
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] typeParametersSerializers() {
                return DefaultImpls.typeParametersSerializers(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$CategoryGroup$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$CategoryGroup;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup.Companion Companion;
        public final String a;
        public final String b;

        static {
            CategoryGroup.Companion = new com.kakao.tistory.domain.home.entity.HomeSlot.CategoryGroup.Companion(null);
        }

        public CategoryGroup() {
            this(null, null, 3, null);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public CategoryGroup(int v, String s, String s1, SerializationConstructorMarker serializationConstructorMarker0) {
            this.a = (v & 1) == 0 ? "" : s;
            if((v & 2) == 0) {
                this.b = "";
                return;
            }
            this.b = s1;
        }

        public CategoryGroup(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "id");
            Intrinsics.checkNotNullParameter(s1, "label");
            super();
            this.a = s;
            this.b = s1;
        }

        public CategoryGroup(String s, String s1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = "";
            }
            if((v & 2) != 0) {
                s1 = "";
            }
            this(s, s1);
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
        public final CategoryGroup copy(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "id");
            Intrinsics.checkNotNullParameter(s1, "label");
            return new CategoryGroup(s, s1);
        }

        public static CategoryGroup copy$default(CategoryGroup homeSlot$CategoryGroup0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlot$CategoryGroup0.a;
            }
            if((v & 2) != 0) {
                s1 = homeSlot$CategoryGroup0.b;
            }
            return homeSlot$CategoryGroup0.copy(s, s1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CategoryGroup)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((CategoryGroup)object0).a) ? Intrinsics.areEqual(this.b, ((CategoryGroup)object0).b) : false;
        }

        @NotNull
        public final String getId() [...] // 潜在的解密器

        @NotNull
        public final String getLabel() [...] // 潜在的解密器

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "CategoryGroup(id=" + this.a + ", label=" + this.b + ")";
        }

        @JvmStatic
        public static final void write$Self$domain_release(CategoryGroup homeSlot$CategoryGroup0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || !Intrinsics.areEqual(homeSlot$CategoryGroup0.a, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlot$CategoryGroup0.a);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || !Intrinsics.areEqual(homeSlot$CategoryGroup0.b, "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 1, homeSlot$CategoryGroup0.b);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Companion {
        public static final com.kakao.tistory.domain.home.entity.HomeSlot.Companion a;

        static {
            com.kakao.tistory.domain.home.entity.HomeSlot.Companion.a = new com.kakao.tistory.domain.home.entity.HomeSlot.Companion();
        }

        @NotNull
        public final KSerializer serializer() {
            KClass kClass0 = Reflection.getOrCreateKotlinClass(HomeSlot.class);
            KClass[] arr_kClass = {Reflection.getOrCreateKotlinClass(Banner.class), Reflection.getOrCreateKotlinClass(Best.class), Reflection.getOrCreateKotlinClass(Category.class), Reflection.getOrCreateKotlinClass(Creator.class), Reflection.getOrCreateKotlinClass(Focus.class), Reflection.getOrCreateKotlinClass(Subscription.class), Reflection.getOrCreateKotlinClass(Tip.class), Reflection.getOrCreateKotlinClass(Today.class), Reflection.getOrCreateKotlinClass(Unknown.class)};
            Annotation[] arr_annotation = {new HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0("slotType")};
            ObjectSerializer objectSerializer0 = new ObjectSerializer("com.kakao.tistory.domain.home.entity.HomeSlot.Unknown", Unknown.INSTANCE, arr_annotation);
            Annotation[] arr_annotation1 = {new HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0("slotType")};
            return new SealedClassSerializer("com.kakao.tistory.domain.home.entity.HomeSlot", kClass0, arr_kClass, new KSerializer[]{.serializer.INSTANCE, com.kakao.tistory.domain.home.entity.HomeSlot.Best..serializer.INSTANCE, com.kakao.tistory.domain.home.entity.HomeSlot.Category..serializer.INSTANCE, com.kakao.tistory.domain.home.entity.HomeSlot.Creator..serializer.INSTANCE, com.kakao.tistory.domain.home.entity.HomeSlot.Focus..serializer.INSTANCE, com.kakao.tistory.domain.home.entity.HomeSlot.Subscription..serializer.INSTANCE, com.kakao.tistory.domain.home.entity.HomeSlot.Tip..serializer.INSTANCE, com.kakao.tistory.domain.home.entity.HomeSlot.Today..serializer.INSTANCE, objectSerializer0}, arr_annotation1);
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0012\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0004\b\u000B\u0010\fBS\b\u0011\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\u000E\u0010\n\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u00A2\u0006\u0004\b\u000B\u0010\u0011J(\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u0015H\u00C1\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001CJ\u0012\u0010 \u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001CJ\u0016\u0010!\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"JJ\u0010#\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00022\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0001\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010\u001CJ\u0010\u0010&\u001A\u00020\rH\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u001A\u0010+\u001A\u00020*2\b\u0010)\u001A\u0004\u0018\u00010(H\u00D6\u0003\u00A2\u0006\u0004\b+\u0010,R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u001CR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001ER\u001A\u0010\u0006\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b3\u0010.\u001A\u0004\b4\u0010\u001CR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u0010.\u001A\u0004\b6\u0010\u001CR\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\"\u00A8\u0006<"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Creator;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "title", "emojiUrl", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Creator;", "contents", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlot$Creator;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Creator;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "getTitle", "d", "getEmojiUrl", "e", "Ljava/util/List;", "getContents", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SerialName("CREATOR")
    @Serializable
    public static final class Creator implements HomeSlot {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlot.Creator.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Creator;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Creator;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Creator;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Creator..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlot.Creator..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlot.Creator..serializer homeSlot$Creator$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlot.Creator..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlot.Creator..serializer.INSTANCE = homeSlot$Creator$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("CREATOR", homeSlot$Creator$$serializer0, 5);
                pluginGeneratedSerialDescriptor0.addElement("slotType", false);
                pluginGeneratedSerialDescriptor0.addElement("position", true);
                pluginGeneratedSerialDescriptor0.addElement("title", true);
                pluginGeneratedSerialDescriptor0.addElement("emojiUrl", true);
                pluginGeneratedSerialDescriptor0.addElement("contents", true);
                pluginGeneratedSerialDescriptor0.pushClassAnnotation(new HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0("slotType"));
                com.kakao.tistory.domain.home.entity.HomeSlot.Creator..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer[] arr_kSerializer = Creator.f;
                KSerializer kSerializer0 = arr_kSerializer[1];
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{StringSerializer.INSTANCE, kSerializer0, StringSerializer.INSTANCE, kSerializer1, arr_kSerializer[4]};
            }

            @NotNull
            public Creator deserialize(@NotNull Decoder decoder0) {
                Position homeSlot$Position1;
                int v;
                String s6;
                String s5;
                String s4;
                List list0;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                KSerializer[] arr_kSerializer = Creator.f;
                String s = null;
                if(compositeDecoder0.decodeSequentially()) {
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    Position homeSlot$Position0 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                    String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                    String s3 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 3, StringSerializer.INSTANCE, null);
                    list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], null);
                    s4 = s1;
                    s5 = s3;
                    s6 = s2;
                    v = 0x1F;
                    homeSlot$Position1 = homeSlot$Position0;
                }
                else {
                    int v1 = 0;
                    Position homeSlot$Position2 = null;
                    String s7 = null;
                    String s8 = null;
                    List list1 = null;
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
                                homeSlot$Position2 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Position2);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                s7 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                                v1 |= 4;
                                break;
                            }
                            case 3: {
                                s8 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 3, StringSerializer.INSTANCE, s8);
                                v1 |= 8;
                                break;
                            }
                            case 4: {
                                list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], list1);
                                v1 |= 16;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v2);
                            }
                        }
                    }
                    v = v1;
                    s4 = s;
                    homeSlot$Position1 = homeSlot$Position2;
                    s6 = s7;
                    s5 = s8;
                    list0 = list1;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Creator(v, s4, homeSlot$Position1, s6, s5, list0, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Creator..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Creator homeSlot$Creator0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlot$Creator0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Creator.write$Self$domain_release(homeSlot$Creator0, compositeEncoder0, serialDescriptor0);
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Creator$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Creator;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Creator.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlot.Creator.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Creator..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlot.Creator.Companion Companion;
        public final String a;
        public final Position b;
        public final String c;
        public final String d;
        public final List e;
        public static final KSerializer[] f;

        static {
            Creator.Companion = new com.kakao.tistory.domain.home.entity.HomeSlot.Creator.Companion(null);
            Creator.f = new KSerializer[]{null, EnumsKt.createSimpleEnumSerializer("com.kakao.tistory.domain.home.entity.HomeSlot.Position", Position.values()), null, null, new ArrayListSerializer(com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator..serializer.INSTANCE)};
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Creator(int v, String s, Position homeSlot$Position0, String s1, String s2, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
            if(1 != (v & 1)) {
                PluginExceptionsKt.throwMissingFieldException(v, 1, com.kakao.tistory.domain.home.entity.HomeSlot.Creator..serializer.INSTANCE.getDescriptor());
            }
            super();
            this.a = s;
            this.b = (v & 2) == 0 ? Position.LEFT : homeSlot$Position0;
            this.c = (v & 4) == 0 ? "" : s1;
            this.d = (v & 8) == 0 ? null : s2;
            if((v & 16) == 0) {
                this.e = CollectionsKt__CollectionsKt.emptyList();
                return;
            }
            this.e = list0;
        }

        public Creator(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = s1;
            this.d = s2;
            this.e = list0;
        }

        public Creator(String s, Position homeSlot$Position0, String s1, String s2, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                homeSlot$Position0 = Position.LEFT;
            }
            if((v & 4) != 0) {
                s1 = "";
            }
            if((v & 8) != 0) {
                s2 = null;
            }
            if((v & 16) != 0) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            this(s, homeSlot$Position0, s1, s2, list0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final List component5() {
            return this.e;
        }

        @NotNull
        public final Creator copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            return new Creator(s, homeSlot$Position0, s1, s2, list0);
        }

        public static Creator copy$default(Creator homeSlot$Creator0, String s, Position homeSlot$Position0, String s1, String s2, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlot$Creator0.a;
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = homeSlot$Creator0.b;
            }
            if((v & 4) != 0) {
                s1 = homeSlot$Creator0.c;
            }
            if((v & 8) != 0) {
                s2 = homeSlot$Creator0.d;
            }
            if((v & 16) != 0) {
                list0 = homeSlot$Creator0.e;
            }
            return homeSlot$Creator0.copy(s, homeSlot$Position0, s1, s2, list0);
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
            if(this.b != ((Creator)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Creator)object0).c)) {
                return false;
            }
            return Intrinsics.areEqual(this.d, ((Creator)object0).d) ? Intrinsics.areEqual(this.e, ((Creator)object0).e) : false;
        }

        @NotNull
        public final List getContents() {
            return this.e;
        }

        @Nullable
        public final String getEmojiUrl() {
            return this.d;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getTitle() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = b.a(this.c, (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F);
            return this.d == null ? this.e.hashCode() + v * 0x1F : this.e.hashCode() + (v + this.d.hashCode()) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Creator(slotType=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", title=");
            androidx.room.a.w(stringBuilder0, this.c, ", emojiUrl=", this.d, ", contents=");
            return a.e(stringBuilder0, this.e, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(Creator homeSlot$Creator0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            KSerializer[] arr_kSerializer = Creator.f;
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlot$Creator0.getSlotType());
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || homeSlot$Creator0.getPosition() != Position.LEFT) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Creator0.getPosition());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(homeSlot$Creator0.getTitle(), "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 2, homeSlot$Creator0.getTitle());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || homeSlot$Creator0.d != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 3, StringSerializer.INSTANCE, homeSlot$Creator0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || !Intrinsics.areEqual(homeSlot$Creator0.e, CollectionsKt__CollectionsKt.emptyList())) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], homeSlot$Creator0.e);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class com.kakao.tistory.domain.home.entity.HomeSlot.DefaultImpls {
        @Nullable
        public static String getTitle(@NotNull HomeSlot homeSlot0) [...] // Inlined contents
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0012\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0004\b\u000B\u0010\fBS\b\u0011\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\u000E\u0010\n\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u00A2\u0006\u0004\b\u000B\u0010\u0011J(\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u0015H\u00C1\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001CJ\u0012\u0010 \u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001CJ\u0016\u0010!\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"JJ\u0010#\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00022\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0001\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010\u001CJ\u0010\u0010&\u001A\u00020\rH\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u001A\u0010+\u001A\u00020*2\b\u0010)\u001A\u0004\u0018\u00010(H\u00D6\u0003\u00A2\u0006\u0004\b+\u0010,R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u001CR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001ER\u001A\u0010\u0006\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b3\u0010.\u001A\u0004\b4\u0010\u001CR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u0010.\u001A\u0004\b6\u0010\u001CR\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\"\u00A8\u0006<"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Focus;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "title", "description", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Focus;", "contents", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlot$Focus;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Focus;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "getTitle", "d", "getDescription", "e", "Ljava/util/List;", "getContents", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SerialName("FOCUS")
    @Serializable
    public static final class Focus implements HomeSlot {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlot.Focus.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Focus;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Focus;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Focus;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Focus..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlot.Focus..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlot.Focus..serializer homeSlot$Focus$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlot.Focus..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlot.Focus..serializer.INSTANCE = homeSlot$Focus$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("FOCUS", homeSlot$Focus$$serializer0, 5);
                pluginGeneratedSerialDescriptor0.addElement("slotType", false);
                pluginGeneratedSerialDescriptor0.addElement("position", true);
                pluginGeneratedSerialDescriptor0.addElement("title", true);
                pluginGeneratedSerialDescriptor0.addElement("description", true);
                pluginGeneratedSerialDescriptor0.addElement("contents", true);
                pluginGeneratedSerialDescriptor0.pushClassAnnotation(new HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0("slotType"));
                com.kakao.tistory.domain.home.entity.HomeSlot.Focus..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer[] arr_kSerializer = Focus.f;
                KSerializer kSerializer0 = arr_kSerializer[1];
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{StringSerializer.INSTANCE, kSerializer0, StringSerializer.INSTANCE, kSerializer1, arr_kSerializer[4]};
            }

            @NotNull
            public Focus deserialize(@NotNull Decoder decoder0) {
                Position homeSlot$Position1;
                int v;
                String s6;
                String s5;
                String s4;
                List list0;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                KSerializer[] arr_kSerializer = Focus.f;
                String s = null;
                if(compositeDecoder0.decodeSequentially()) {
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    Position homeSlot$Position0 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                    String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                    String s3 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 3, StringSerializer.INSTANCE, null);
                    list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], null);
                    s4 = s1;
                    s5 = s3;
                    s6 = s2;
                    v = 0x1F;
                    homeSlot$Position1 = homeSlot$Position0;
                }
                else {
                    int v1 = 0;
                    Position homeSlot$Position2 = null;
                    String s7 = null;
                    String s8 = null;
                    List list1 = null;
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
                                homeSlot$Position2 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Position2);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                s7 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                                v1 |= 4;
                                break;
                            }
                            case 3: {
                                s8 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 3, StringSerializer.INSTANCE, s8);
                                v1 |= 8;
                                break;
                            }
                            case 4: {
                                list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], list1);
                                v1 |= 16;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v2);
                            }
                        }
                    }
                    v = v1;
                    s4 = s;
                    homeSlot$Position1 = homeSlot$Position2;
                    s6 = s7;
                    s5 = s8;
                    list0 = list1;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Focus(v, s4, homeSlot$Position1, s6, s5, list0, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Focus..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Focus homeSlot$Focus0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlot$Focus0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Focus.write$Self$domain_release(homeSlot$Focus0, compositeEncoder0, serialDescriptor0);
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Focus$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Focus;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Focus.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlot.Focus.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Focus..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlot.Focus.Companion Companion;
        public final String a;
        public final Position b;
        public final String c;
        public final String d;
        public final List e;
        public static final KSerializer[] f;

        static {
            Focus.Companion = new com.kakao.tistory.domain.home.entity.HomeSlot.Focus.Companion(null);
            Focus.f = new KSerializer[]{null, EnumsKt.createSimpleEnumSerializer("com.kakao.tistory.domain.home.entity.HomeSlot.Position", Position.values()), null, null, new ArrayListSerializer(com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus..serializer.INSTANCE)};
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Focus(int v, String s, Position homeSlot$Position0, String s1, String s2, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
            if(1 != (v & 1)) {
                PluginExceptionsKt.throwMissingFieldException(v, 1, com.kakao.tistory.domain.home.entity.HomeSlot.Focus..serializer.INSTANCE.getDescriptor());
            }
            super();
            this.a = s;
            this.b = (v & 2) == 0 ? Position.RIGHT : homeSlot$Position0;
            this.c = (v & 4) == 0 ? "" : s1;
            this.d = (v & 8) == 0 ? null : s2;
            if((v & 16) == 0) {
                this.e = CollectionsKt__CollectionsKt.emptyList();
                return;
            }
            this.e = list0;
        }

        public Focus(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = s1;
            this.d = s2;
            this.e = list0;
        }

        public Focus(String s, Position homeSlot$Position0, String s1, String s2, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                homeSlot$Position0 = Position.RIGHT;
            }
            if((v & 4) != 0) {
                s1 = "";
            }
            if((v & 8) != 0) {
                s2 = null;
            }
            if((v & 16) != 0) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            this(s, homeSlot$Position0, s1, s2, list0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final List component5() {
            return this.e;
        }

        @NotNull
        public final Focus copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            return new Focus(s, homeSlot$Position0, s1, s2, list0);
        }

        public static Focus copy$default(Focus homeSlot$Focus0, String s, Position homeSlot$Position0, String s1, String s2, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlot$Focus0.a;
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = homeSlot$Focus0.b;
            }
            if((v & 4) != 0) {
                s1 = homeSlot$Focus0.c;
            }
            if((v & 8) != 0) {
                s2 = homeSlot$Focus0.d;
            }
            if((v & 16) != 0) {
                list0 = homeSlot$Focus0.e;
            }
            return homeSlot$Focus0.copy(s, homeSlot$Position0, s1, s2, list0);
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
            if(this.b != ((Focus)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Focus)object0).c)) {
                return false;
            }
            return Intrinsics.areEqual(this.d, ((Focus)object0).d) ? Intrinsics.areEqual(this.e, ((Focus)object0).e) : false;
        }

        @NotNull
        public final List getContents() {
            return this.e;
        }

        @Nullable
        public final String getDescription() {
            return this.d;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getTitle() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = b.a(this.c, (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F);
            return this.d == null ? this.e.hashCode() + v * 0x1F : this.e.hashCode() + (v + this.d.hashCode()) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Focus(slotType=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", title=");
            androidx.room.a.w(stringBuilder0, this.c, ", description=", this.d, ", contents=");
            return a.e(stringBuilder0, this.e, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(Focus homeSlot$Focus0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            KSerializer[] arr_kSerializer = Focus.f;
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlot$Focus0.getSlotType());
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || homeSlot$Focus0.getPosition() != Position.RIGHT) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Focus0.getPosition());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(homeSlot$Focus0.getTitle(), "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 2, homeSlot$Focus0.getTitle());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || homeSlot$Focus0.d != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 3, StringSerializer.INSTANCE, homeSlot$Focus0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || !Intrinsics.areEqual(homeSlot$Focus0.e, CollectionsKt__CollectionsKt.emptyList())) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], homeSlot$Focus0.e);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "", "LEFT", "RIGHT", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum Position {
        LEFT,
        RIGHT;

        public static final Position[] a;
        public static final EnumEntries b;

        static {
            Position.a = arr_homeSlot$Position;
            Intrinsics.checkNotNullParameter(arr_homeSlot$Position, "entries");
            Position.b = new sd.a(arr_homeSlot$Position);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return Position.b;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0012\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0004\b\u000B\u0010\fBS\b\u0011\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\u000E\u0010\n\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u00A2\u0006\u0004\b\u000B\u0010\u0011J(\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u0015H\u00C1\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001CJ\u0012\u0010 \u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001CJ\u0016\u0010!\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"JJ\u0010#\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00022\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0001\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010\u001CJ\u0010\u0010&\u001A\u00020\rH\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u001A\u0010+\u001A\u00020*2\b\u0010)\u001A\u0004\u0018\u00010(H\u00D6\u0003\u00A2\u0006\u0004\b+\u0010,R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u001CR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001ER\u001A\u0010\u0006\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b3\u0010.\u001A\u0004\b4\u0010\u001CR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u0010.\u001A\u0004\b6\u0010\u001CR\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\"\u00A8\u0006<"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Subscription;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "title", "emojiUrl", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Subscription;", "contents", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlot$Subscription;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Subscription;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "getTitle", "d", "getEmojiUrl", "e", "Ljava/util/List;", "getContents", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SerialName("SUBSCRIPTION")
    @Serializable
    public static final class Subscription implements HomeSlot {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlot.Subscription.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Subscription;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Subscription;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Subscription;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Subscription..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlot.Subscription..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlot.Subscription..serializer homeSlot$Subscription$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlot.Subscription..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlot.Subscription..serializer.INSTANCE = homeSlot$Subscription$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("SUBSCRIPTION", homeSlot$Subscription$$serializer0, 5);
                pluginGeneratedSerialDescriptor0.addElement("slotType", false);
                pluginGeneratedSerialDescriptor0.addElement("position", true);
                pluginGeneratedSerialDescriptor0.addElement("title", true);
                pluginGeneratedSerialDescriptor0.addElement("emojiUrl", true);
                pluginGeneratedSerialDescriptor0.addElement("contents", true);
                pluginGeneratedSerialDescriptor0.pushClassAnnotation(new HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0("slotType"));
                com.kakao.tistory.domain.home.entity.HomeSlot.Subscription..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer[] arr_kSerializer = Subscription.f;
                KSerializer kSerializer0 = arr_kSerializer[1];
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{StringSerializer.INSTANCE, kSerializer0, StringSerializer.INSTANCE, kSerializer1, arr_kSerializer[4]};
            }

            @NotNull
            public Subscription deserialize(@NotNull Decoder decoder0) {
                Position homeSlot$Position1;
                int v;
                String s6;
                String s5;
                String s4;
                List list0;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                KSerializer[] arr_kSerializer = Subscription.f;
                String s = null;
                if(compositeDecoder0.decodeSequentially()) {
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    Position homeSlot$Position0 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                    String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                    String s3 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 3, StringSerializer.INSTANCE, null);
                    list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], null);
                    s4 = s1;
                    s5 = s3;
                    s6 = s2;
                    v = 0x1F;
                    homeSlot$Position1 = homeSlot$Position0;
                }
                else {
                    int v1 = 0;
                    Position homeSlot$Position2 = null;
                    String s7 = null;
                    String s8 = null;
                    List list1 = null;
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
                                homeSlot$Position2 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Position2);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                s7 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                                v1 |= 4;
                                break;
                            }
                            case 3: {
                                s8 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 3, StringSerializer.INSTANCE, s8);
                                v1 |= 8;
                                break;
                            }
                            case 4: {
                                list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], list1);
                                v1 |= 16;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v2);
                            }
                        }
                    }
                    v = v1;
                    s4 = s;
                    homeSlot$Position1 = homeSlot$Position2;
                    s6 = s7;
                    s5 = s8;
                    list0 = list1;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Subscription(v, s4, homeSlot$Position1, s6, s5, list0, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Subscription..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Subscription homeSlot$Subscription0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlot$Subscription0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Subscription.write$Self$domain_release(homeSlot$Subscription0, compositeEncoder0, serialDescriptor0);
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Subscription$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Subscription;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Subscription.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlot.Subscription.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Subscription..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlot.Subscription.Companion Companion;
        public final String a;
        public final Position b;
        public final String c;
        public final String d;
        public final List e;
        public static final KSerializer[] f;

        static {
            Subscription.Companion = new com.kakao.tistory.domain.home.entity.HomeSlot.Subscription.Companion(null);
            Subscription.f = new KSerializer[]{null, EnumsKt.createSimpleEnumSerializer("com.kakao.tistory.domain.home.entity.HomeSlot.Position", Position.values()), null, null, new ArrayListSerializer(com.kakao.tistory.domain.home.entity.HomeSlotContent.Subscription..serializer.INSTANCE)};
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Subscription(int v, String s, Position homeSlot$Position0, String s1, String s2, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
            if(1 != (v & 1)) {
                PluginExceptionsKt.throwMissingFieldException(v, 1, com.kakao.tistory.domain.home.entity.HomeSlot.Subscription..serializer.INSTANCE.getDescriptor());
            }
            super();
            this.a = s;
            this.b = (v & 2) == 0 ? Position.RIGHT : homeSlot$Position0;
            this.c = (v & 4) == 0 ? "" : s1;
            this.d = (v & 8) == 0 ? null : s2;
            if((v & 16) == 0) {
                this.e = CollectionsKt__CollectionsKt.emptyList();
                return;
            }
            this.e = list0;
        }

        public Subscription(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = s1;
            this.d = s2;
            this.e = list0;
        }

        public Subscription(String s, Position homeSlot$Position0, String s1, String s2, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                homeSlot$Position0 = Position.RIGHT;
            }
            if((v & 4) != 0) {
                s1 = "";
            }
            if((v & 8) != 0) {
                s2 = null;
            }
            if((v & 16) != 0) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            this(s, homeSlot$Position0, s1, s2, list0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final List component5() {
            return this.e;
        }

        @NotNull
        public final Subscription copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            return new Subscription(s, homeSlot$Position0, s1, s2, list0);
        }

        public static Subscription copy$default(Subscription homeSlot$Subscription0, String s, Position homeSlot$Position0, String s1, String s2, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlot$Subscription0.a;
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = homeSlot$Subscription0.b;
            }
            if((v & 4) != 0) {
                s1 = homeSlot$Subscription0.c;
            }
            if((v & 8) != 0) {
                s2 = homeSlot$Subscription0.d;
            }
            if((v & 16) != 0) {
                list0 = homeSlot$Subscription0.e;
            }
            return homeSlot$Subscription0.copy(s, homeSlot$Position0, s1, s2, list0);
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
            if(this.b != ((Subscription)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Subscription)object0).c)) {
                return false;
            }
            return Intrinsics.areEqual(this.d, ((Subscription)object0).d) ? Intrinsics.areEqual(this.e, ((Subscription)object0).e) : false;
        }

        @NotNull
        public final List getContents() {
            return this.e;
        }

        @Nullable
        public final String getEmojiUrl() {
            return this.d;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getTitle() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = b.a(this.c, (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F);
            return this.d == null ? this.e.hashCode() + v * 0x1F : this.e.hashCode() + (v + this.d.hashCode()) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Subscription(slotType=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", title=");
            androidx.room.a.w(stringBuilder0, this.c, ", emojiUrl=", this.d, ", contents=");
            return a.e(stringBuilder0, this.e, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(Subscription homeSlot$Subscription0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            KSerializer[] arr_kSerializer = Subscription.f;
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlot$Subscription0.getSlotType());
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || homeSlot$Subscription0.getPosition() != Position.RIGHT) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Subscription0.getPosition());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(homeSlot$Subscription0.getTitle(), "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 2, homeSlot$Subscription0.getTitle());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || homeSlot$Subscription0.d != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 3, StringSerializer.INSTANCE, homeSlot$Subscription0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || !Intrinsics.areEqual(homeSlot$Subscription0.e, CollectionsKt__CollectionsKt.emptyList())) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], homeSlot$Subscription0.e);
            }
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0012\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b\u00A2\u0006\u0004\b\u000B\u0010\fBS\b\u0011\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\u000E\u0010\n\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u00A2\u0006\u0004\b\u000B\u0010\u0011J(\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u0015H\u00C1\u0001\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010\u001CJ\u0012\u0010 \u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001CJ\u0016\u0010!\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\"JJ\u0010#\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00022\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u00C6\u0001\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010\u001CJ\u0010\u0010&\u001A\u00020\rH\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\'J\u001A\u0010+\u001A\u00020*2\b\u0010)\u001A\u0004\u0018\u00010(H\u00D6\u0003\u00A2\u0006\u0004\b+\u0010,R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u001CR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u001ER\u001A\u0010\u0006\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b3\u0010.\u001A\u0004\b4\u0010\u001CR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b5\u0010.\u001A\u0004\b6\u0010\u001CR\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b8\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010\"\u00A8\u0006<"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Tip;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "title", "emojiUrl", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Tip;", "contents", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlot$Tip;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Tip;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "getTitle", "d", "getEmojiUrl", "e", "Ljava/util/List;", "getContents", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SerialName("TIP")
    @Serializable
    public static final class Tip implements HomeSlot {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlot.Tip.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Tip;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Tip;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Tip;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Tip..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlot.Tip..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlot.Tip..serializer homeSlot$Tip$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlot.Tip..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlot.Tip..serializer.INSTANCE = homeSlot$Tip$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("TIP", homeSlot$Tip$$serializer0, 5);
                pluginGeneratedSerialDescriptor0.addElement("slotType", false);
                pluginGeneratedSerialDescriptor0.addElement("position", true);
                pluginGeneratedSerialDescriptor0.addElement("title", true);
                pluginGeneratedSerialDescriptor0.addElement("emojiUrl", true);
                pluginGeneratedSerialDescriptor0.addElement("contents", true);
                pluginGeneratedSerialDescriptor0.pushClassAnnotation(new HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0("slotType"));
                com.kakao.tistory.domain.home.entity.HomeSlot.Tip..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer[] arr_kSerializer = Tip.f;
                KSerializer kSerializer0 = arr_kSerializer[1];
                KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
                return new KSerializer[]{StringSerializer.INSTANCE, kSerializer0, StringSerializer.INSTANCE, kSerializer1, arr_kSerializer[4]};
            }

            @NotNull
            public Tip deserialize(@NotNull Decoder decoder0) {
                Position homeSlot$Position1;
                int v;
                String s6;
                String s5;
                String s4;
                List list0;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                KSerializer[] arr_kSerializer = Tip.f;
                String s = null;
                if(compositeDecoder0.decodeSequentially()) {
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    Position homeSlot$Position0 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                    String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                    String s3 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 3, StringSerializer.INSTANCE, null);
                    list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], null);
                    s4 = s1;
                    s5 = s3;
                    s6 = s2;
                    v = 0x1F;
                    homeSlot$Position1 = homeSlot$Position0;
                }
                else {
                    int v1 = 0;
                    Position homeSlot$Position2 = null;
                    String s7 = null;
                    String s8 = null;
                    List list1 = null;
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
                                homeSlot$Position2 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Position2);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                s7 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                                v1 |= 4;
                                break;
                            }
                            case 3: {
                                s8 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 3, StringSerializer.INSTANCE, s8);
                                v1 |= 8;
                                break;
                            }
                            case 4: {
                                list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], list1);
                                v1 |= 16;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v2);
                            }
                        }
                    }
                    v = v1;
                    s4 = s;
                    homeSlot$Position1 = homeSlot$Position2;
                    s6 = s7;
                    s5 = s8;
                    list0 = list1;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Tip(v, s4, homeSlot$Position1, s6, s5, list0, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Tip..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Tip homeSlot$Tip0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlot$Tip0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Tip.write$Self$domain_release(homeSlot$Tip0, compositeEncoder0, serialDescriptor0);
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Tip$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Tip;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Tip.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlot.Tip.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Tip..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlot.Tip.Companion Companion;
        public final String a;
        public final Position b;
        public final String c;
        public final String d;
        public final List e;
        public static final KSerializer[] f;

        static {
            Tip.Companion = new com.kakao.tistory.domain.home.entity.HomeSlot.Tip.Companion(null);
            Tip.f = new KSerializer[]{null, EnumsKt.createSimpleEnumSerializer("com.kakao.tistory.domain.home.entity.HomeSlot.Position", Position.values()), null, null, new ArrayListSerializer(com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip..serializer.INSTANCE)};
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Tip(int v, String s, Position homeSlot$Position0, String s1, String s2, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
            if(1 != (v & 1)) {
                PluginExceptionsKt.throwMissingFieldException(v, 1, com.kakao.tistory.domain.home.entity.HomeSlot.Tip..serializer.INSTANCE.getDescriptor());
            }
            super();
            this.a = s;
            this.b = (v & 2) == 0 ? Position.RIGHT : homeSlot$Position0;
            this.c = (v & 4) == 0 ? "" : s1;
            this.d = (v & 8) == 0 ? null : s2;
            if((v & 16) == 0) {
                this.e = CollectionsKt__CollectionsKt.emptyList();
                return;
            }
            this.e = list0;
        }

        public Tip(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = s1;
            this.d = s2;
            this.e = list0;
        }

        public Tip(String s, Position homeSlot$Position0, String s1, String s2, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                homeSlot$Position0 = Position.RIGHT;
            }
            if((v & 4) != 0) {
                s1 = "";
            }
            if((v & 8) != 0) {
                s2 = null;
            }
            if((v & 16) != 0) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            this(s, homeSlot$Position0, s1, s2, list0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
            return this.b;
        }

        @NotNull
        public final String component3() {
            return this.c;
        }

        @Nullable
        public final String component4() {
            return this.d;
        }

        @NotNull
        public final List component5() {
            return this.e;
        }

        @NotNull
        public final Tip copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull String s1, @Nullable String s2, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(s1, "title");
            Intrinsics.checkNotNullParameter(list0, "contents");
            return new Tip(s, homeSlot$Position0, s1, s2, list0);
        }

        public static Tip copy$default(Tip homeSlot$Tip0, String s, Position homeSlot$Position0, String s1, String s2, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlot$Tip0.a;
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = homeSlot$Tip0.b;
            }
            if((v & 4) != 0) {
                s1 = homeSlot$Tip0.c;
            }
            if((v & 8) != 0) {
                s2 = homeSlot$Tip0.d;
            }
            if((v & 16) != 0) {
                list0 = homeSlot$Tip0.e;
            }
            return homeSlot$Tip0.copy(s, homeSlot$Position0, s1, s2, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Tip)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Tip)object0).a)) {
                return false;
            }
            if(this.b != ((Tip)object0).b) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Tip)object0).c)) {
                return false;
            }
            return Intrinsics.areEqual(this.d, ((Tip)object0).d) ? Intrinsics.areEqual(this.e, ((Tip)object0).e) : false;
        }

        @NotNull
        public final List getContents() {
            return this.e;
        }

        @Nullable
        public final String getEmojiUrl() {
            return this.d;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getTitle() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = b.a(this.c, (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F);
            return this.d == null ? this.e.hashCode() + v * 0x1F : this.e.hashCode() + (v + this.d.hashCode()) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Tip(slotType=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", title=");
            androidx.room.a.w(stringBuilder0, this.c, ", emojiUrl=", this.d, ", contents=");
            return a.e(stringBuilder0, this.e, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(Tip homeSlot$Tip0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            KSerializer[] arr_kSerializer = Tip.f;
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlot$Tip0.getSlotType());
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || homeSlot$Tip0.getPosition() != Position.RIGHT) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Tip0.getPosition());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(homeSlot$Tip0.getTitle(), "")) {
                compositeEncoder0.encodeStringElement(serialDescriptor0, 2, homeSlot$Tip0.getTitle());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || homeSlot$Tip0.d != null) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 3, StringSerializer.INSTANCE, homeSlot$Tip0.d);
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || !Intrinsics.areEqual(homeSlot$Tip0.e, CollectionsKt__CollectionsKt.emptyList())) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], homeSlot$Tip0.e);
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000E\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u00A2\u0006\u0004\b\t\u0010\nB?\b\u0011\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\r\u00A2\u0006\u0004\b\t\u0010\u000FJ(\u0010\u0018\u001A\u00020\u00152\u0006\u0010\u0010\u001A\u00020\u00002\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u0013H\u00C1\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0016\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ4\u0010\u001F\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00C6\u0001\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b!\u0010\u001AJ\u0010\u0010\"\u001A\u00020\u000BH\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010#J\u001A\u0010\'\u001A\u00020&2\b\u0010%\u001A\u0004\u0018\u00010$H\u00D6\u0003\u00A2\u0006\u0004\b\'\u0010(R\u001A\u0010\u0003\u001A\u00020\u00028\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u001AR\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u001CR\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u001E\u00A8\u00064"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Today;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "", "slotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "", "Lcom/kakao/tistory/domain/home/entity/HomeSlotContent$Today;", "contents", "<init>", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/home/entity/HomeSlot$Today;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;Ljava/util/List;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Today;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSlotType", "b", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "c", "Ljava/util/List;", "getContents", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SerialName("TODAY")
    @Serializable
    public static final class Today implements HomeSlot {
        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/home/entity/HomeSlot.Today.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Today;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/home/entity/HomeSlot$Today;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/home/entity/HomeSlot$Today;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Today..serializer implements GeneratedSerializer {
            @NotNull
            public static final com.kakao.tistory.domain.home.entity.HomeSlot.Today..serializer INSTANCE;
            public static final PluginGeneratedSerialDescriptor a;

            static {
                com.kakao.tistory.domain.home.entity.HomeSlot.Today..serializer homeSlot$Today$$serializer0 = new com.kakao.tistory.domain.home.entity.HomeSlot.Today..serializer();
                com.kakao.tistory.domain.home.entity.HomeSlot.Today..serializer.INSTANCE = homeSlot$Today$$serializer0;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("TODAY", homeSlot$Today$$serializer0, 3);
                pluginGeneratedSerialDescriptor0.addElement("slotType", false);
                pluginGeneratedSerialDescriptor0.addElement("position", true);
                pluginGeneratedSerialDescriptor0.addElement("contents", true);
                pluginGeneratedSerialDescriptor0.pushClassAnnotation(new HomeSlot.Today..serializer.annotationImpl.kotlinx_serialization_json_JsonClassDiscriminator.0("slotType"));
                com.kakao.tistory.domain.home.entity.HomeSlot.Today..serializer.a = pluginGeneratedSerialDescriptor0;
            }

            @Override  // kotlinx.serialization.internal.GeneratedSerializer
            @NotNull
            public KSerializer[] childSerializers() {
                KSerializer[] arr_kSerializer = Today.d;
                return new KSerializer[]{StringSerializer.INSTANCE, arr_kSerializer[1], arr_kSerializer[2]};
            }

            @NotNull
            public Today deserialize(@NotNull Decoder decoder0) {
                Position homeSlot$Position1;
                int v;
                String s2;
                List list0;
                Intrinsics.checkNotNullParameter(decoder0, "decoder");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
                KSerializer[] arr_kSerializer = Today.d;
                String s = null;
                if(compositeDecoder0.decodeSequentially()) {
                    String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                    Position homeSlot$Position0 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], null);
                    list0 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], null);
                    s2 = s1;
                    v = 7;
                    homeSlot$Position1 = homeSlot$Position0;
                }
                else {
                    int v1 = 0;
                    Position homeSlot$Position2 = null;
                    List list1 = null;
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
                                homeSlot$Position2 = (Position)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Position2);
                                v1 |= 2;
                                break;
                            }
                            case 2: {
                                list1 = (List)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], list1);
                                v1 |= 4;
                                break;
                            }
                            default: {
                                throw new UnknownFieldException(v2);
                            }
                        }
                    }
                    v = v1;
                    s2 = s;
                    homeSlot$Position1 = homeSlot$Position2;
                    list0 = list1;
                }
                compositeDecoder0.endStructure(serialDescriptor0);
                return new Today(v, s2, homeSlot$Position1, list0, null);
            }

            @Override  // kotlinx.serialization.DeserializationStrategy
            public Object deserialize(Decoder decoder0) {
                return this.deserialize(decoder0);
            }

            @Override  // kotlinx.serialization.KSerializer
            @NotNull
            public SerialDescriptor getDescriptor() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Today..serializer.a;
            }

            public void serialize(@NotNull Encoder encoder0, @NotNull Today homeSlot$Today0) {
                Intrinsics.checkNotNullParameter(encoder0, "encoder");
                Intrinsics.checkNotNullParameter(homeSlot$Today0, "value");
                SerialDescriptor serialDescriptor0 = this.getDescriptor();
                CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
                Today.write$Self$domain_release(homeSlot$Today0, compositeEncoder0, serialDescriptor0);
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Today$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Today;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.domain.home.entity.HomeSlot.Today.Companion {
            public com.kakao.tistory.domain.home.entity.HomeSlot.Today.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @NotNull
            public final KSerializer serializer() {
                return com.kakao.tistory.domain.home.entity.HomeSlot.Today..serializer.INSTANCE;
            }
        }

        @NotNull
        public static final com.kakao.tistory.domain.home.entity.HomeSlot.Today.Companion Companion;
        public final String a;
        public final Position b;
        public final List c;
        public static final KSerializer[] d;

        static {
            Today.Companion = new com.kakao.tistory.domain.home.entity.HomeSlot.Today.Companion(null);
            Today.d = new KSerializer[]{null, EnumsKt.createSimpleEnumSerializer("com.kakao.tistory.domain.home.entity.HomeSlot.Position", Position.values()), new ArrayListSerializer(com.kakao.tistory.domain.home.entity.HomeSlotContent.Today..serializer.INSTANCE)};
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public Today(int v, String s, Position homeSlot$Position0, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
            if(1 != (v & 1)) {
                PluginExceptionsKt.throwMissingFieldException(v, 1, com.kakao.tistory.domain.home.entity.HomeSlot.Today..serializer.INSTANCE.getDescriptor());
            }
            super();
            this.a = s;
            this.b = (v & 2) == 0 ? Position.LEFT : homeSlot$Position0;
            if((v & 4) == 0) {
                this.c = CollectionsKt__CollectionsKt.emptyList();
                return;
            }
            this.c = list0;
        }

        public Today(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(list0, "contents");
            super();
            this.a = s;
            this.b = homeSlot$Position0;
            this.c = list0;
        }

        public Today(String s, Position homeSlot$Position0, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                homeSlot$Position0 = Position.LEFT;
            }
            if((v & 4) != 0) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            this(s, homeSlot$Position0, list0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final Position component2() {
            return this.b;
        }

        @NotNull
        public final List component3() {
            return this.c;
        }

        @NotNull
        public final Today copy(@NotNull String s, @NotNull Position homeSlot$Position0, @NotNull List list0) {
            Intrinsics.checkNotNullParameter(s, "slotType");
            Intrinsics.checkNotNullParameter(homeSlot$Position0, "position");
            Intrinsics.checkNotNullParameter(list0, "contents");
            return new Today(s, homeSlot$Position0, list0);
        }

        public static Today copy$default(Today homeSlot$Today0, String s, Position homeSlot$Position0, List list0, int v, Object object0) {
            if((v & 1) != 0) {
                s = homeSlot$Today0.a;
            }
            if((v & 2) != 0) {
                homeSlot$Position0 = homeSlot$Today0.b;
            }
            if((v & 4) != 0) {
                list0 = homeSlot$Today0.c;
            }
            return homeSlot$Today0.copy(s, homeSlot$Position0, list0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Today)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Today)object0).a)) {
                return false;
            }
            return this.b == ((Today)object0).b ? Intrinsics.areEqual(this.c, ((Today)object0).c) : false;
        }

        @NotNull
        public final List getContents() {
            return this.c;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public Position getPosition() {
            return this.b;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getSlotType() {
            return this.a;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @Nullable
        public String getTitle() {
            return null;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("Today(slotType=");
            stringBuilder0.append(this.a);
            stringBuilder0.append(", position=");
            stringBuilder0.append(this.b);
            stringBuilder0.append(", contents=");
            return a.e(stringBuilder0, this.c, ")");
        }

        @JvmStatic
        public static final void write$Self$domain_release(Today homeSlot$Today0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
            KSerializer[] arr_kSerializer = Today.d;
            compositeEncoder0.encodeStringElement(serialDescriptor0, 0, homeSlot$Today0.getSlotType());
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || homeSlot$Today0.getPosition() != Position.LEFT) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 1, arr_kSerializer[1], homeSlot$Today0.getPosition());
            }
            if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || !Intrinsics.areEqual(homeSlot$Today0.c, CollectionsKt__CollectionsKt.emptyList())) {
                compositeEncoder0.encodeSerializableElement(serialDescriptor0, 2, arr_kSerializer[2], homeSlot$Today0.c);
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0016\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00000\rHÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0016\u001A\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/domain/home/entity/HomeSlot$Unknown;", "Lcom/kakao/tistory/domain/home/entity/HomeSlot;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "slotType", "Ljava/lang/String;", "getSlotType", "Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "getPosition", "()Lcom/kakao/tistory/domain/home/entity/HomeSlot$Position;", "position", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Serializable
    public static final class Unknown implements HomeSlot {
        @NotNull
        public static final Unknown INSTANCE;
        public static final Lazy a;

        static {
            Unknown.INSTANCE = new Unknown();
            Unknown.a = c.lazy(LazyThreadSafetyMode.PUBLICATION, com.kakao.tistory.domain.home.entity.a.a);
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof Unknown;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public Position getPosition() {
            return Position.RIGHT;
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @NotNull
        public String getSlotType() {
            return "UNKNOWN";
        }

        @Override  // com.kakao.tistory.domain.home.entity.HomeSlot
        @Nullable
        public String getTitle() {
            return null;
        }

        @Override
        public int hashCode() {
            return 0x93988339;
        }

        @NotNull
        public final KSerializer serializer() {
            return (KSerializer)Unknown.a.getValue();
        }

        @Override
        @NotNull
        public String toString() {
            return "Unknown";
        }
    }

    @NotNull
    public static final com.kakao.tistory.domain.home.entity.HomeSlot.Companion Companion;

    static {
        HomeSlot.Companion = com.kakao.tistory.domain.home.entity.HomeSlot.Companion.a;
    }

    @NotNull
    Position getPosition();

    @NotNull
    String getSlotType();

    @Nullable
    String getTitle();
}

