package com.kakao.tistory.domain.blog.entity;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0011\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B;\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b\u00A2\u0006\u0004\b\n\u0010\u000BBG\b\u0011\u0012\u0006\u0010\f\u001A\u00020\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\u000E\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\r\u00A2\u0006\u0004\b\n\u0010\u000FJ(\u0010\u0018\u001A\u00020\u00152\u0006\u0010\u0010\u001A\u00020\u00002\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u0013H\u00C1\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0012\u0010\u001B\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0012\u0010\u001D\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0018\u0010\u001F\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bH\u00C6\u0003\u00A2\u0006\u0004\b\u001F\u0010 JD\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bH\u00C6\u0001\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\b#\u0010\u001CJ\u0010\u0010$\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b$\u0010\u001AJ\u001A\u0010\'\u001A\u00020&2\b\u0010%\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\'\u0010(R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u001AR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u001CR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u001ER\u001F\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u0010 \u00A8\u00067"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/Category;", "", "", "id", "", "name", "", "countOfEntries", "", "subCategories", "<init>", "(ILjava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/Long;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/blog/entity/Category;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Long;", "component4", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/kakao/tistory/domain/blog/entity/Category;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getId", "b", "Ljava/lang/String;", "getName", "c", "Ljava/lang/Long;", "getCountOfEntries", "d", "Ljava/util/List;", "getSubCategories", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class Category {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/blog/entity/Category.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/blog/entity/Category;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/blog/entity/Category;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/blog/entity/Category;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer category$$serializer0 = new .serializer();
            .serializer.INSTANCE = category$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.blog.entity.Category", category$$serializer0, 4);
            pluginGeneratedSerialDescriptor0.addElement("id", true);
            pluginGeneratedSerialDescriptor0.addElement("name", true);
            pluginGeneratedSerialDescriptor0.addElement("countOfEntries", true);
            pluginGeneratedSerialDescriptor0.addElement("subCategories", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
            KSerializer kSerializer1 = BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE);
            KSerializer kSerializer2 = BuiltinSerializersKt.getNullable(new ArrayListSerializer(.serializer.INSTANCE));
            return new KSerializer[]{IntSerializer.INSTANCE, kSerializer0, kSerializer1, kSerializer2};
        }

        @NotNull
        public Category deserialize(@NotNull Decoder decoder0) {
            int v2;
            String s1;
            Long long1;
            List list0;
            int v1;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            if(compositeDecoder0.decodeSequentially()) {
                int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                String s = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 1, StringSerializer.INSTANCE, null);
                Long long0 = (Long)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, LongSerializer.INSTANCE, null);
                v1 = v;
                list0 = (List)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 3, new ArrayListSerializer(.serializer.INSTANCE), null);
                long1 = long0;
                s1 = s;
                v2 = 15;
            }
            else {
                int v3 = 0;
                String s2 = null;
                Long long2 = null;
                List list1 = null;
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
                            v3 = compositeDecoder0.decodeIntElement(serialDescriptor0, 0);
                            v4 |= 1;
                            break;
                        }
                        case 1: {
                            s2 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 1, StringSerializer.INSTANCE, s2);
                            v4 |= 2;
                            break;
                        }
                        case 2: {
                            long2 = (Long)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, LongSerializer.INSTANCE, long2);
                            v4 |= 4;
                            break;
                        }
                        case 3: {
                            list1 = (List)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 3, new ArrayListSerializer(.serializer.INSTANCE), list1);
                            v4 |= 8;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v5);
                        }
                    }
                }
                v1 = v3;
                v2 = v4;
                s1 = s2;
                long1 = long2;
                list0 = list1;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new Category(v2, v1, s1, long1, list0, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull Category category0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(category0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            Category.write$Self$domain_release(category0, compositeEncoder0, serialDescriptor0);
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

    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/Category$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/blog/entity/Category;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "NOT_SELECTED_CATEGORY", "I", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final KSerializer serializer() {
            return .serializer.INSTANCE;
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int NOT_SELECTED_CATEGORY = -3;
    public final int a;
    public final String b;
    public final Long c;
    public final List d;

    static {
        Category.Companion = new Companion(null);
    }

    public Category() {
        this(0, null, null, null, 15, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public Category(int v, int v1, String s, Long long0, List list0, SerializationConstructorMarker serializationConstructorMarker0) {
        if((v & 1) == 0) {
            v1 = -3;
        }
        this.a = v1;
        this.b = (v & 2) == 0 ? null : s;
        this.c = (v & 4) == 0 ? null : long0;
        if((v & 8) == 0) {
            this.d = null;
            return;
        }
        this.d = list0;
    }

    public Category(int v, @Nullable String s, @Nullable Long long0, @Nullable List list0) {
        this.a = v;
        this.b = s;
        this.c = long0;
        this.d = list0;
    }

    public Category(int v, String s, Long long0, List list0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = -3;
        }
        if((v1 & 2) != 0) {
            s = null;
        }
        if((v1 & 4) != 0) {
            long0 = null;
        }
        if((v1 & 8) != 0) {
            list0 = null;
        }
        this(v, s, long0, list0);
    }

    public final int component1() {
        return this.a;
    }

    @Nullable
    public final String component2() {
        return this.b;
    }

    @Nullable
    public final Long component3() {
        return this.c;
    }

    @Nullable
    public final List component4() {
        return this.d;
    }

    @NotNull
    public final Category copy(int v, @Nullable String s, @Nullable Long long0, @Nullable List list0) {
        return new Category(v, s, long0, list0);
    }

    public static Category copy$default(Category category0, int v, String s, Long long0, List list0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = category0.a;
        }
        if((v1 & 2) != 0) {
            s = category0.b;
        }
        if((v1 & 4) != 0) {
            long0 = category0.c;
        }
        if((v1 & 8) != 0) {
            list0 = category0.d;
        }
        return category0.copy(v, s, long0, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Category)) {
            return false;
        }
        if(this.a != ((Category)object0).a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((Category)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((Category)object0).c) ? Intrinsics.areEqual(this.d, ((Category)object0).d) : false;
    }

    @Nullable
    public final Long getCountOfEntries() {
        return this.c;
    }

    public final int getId() {
        return this.a;
    }

    @Nullable
    public final String getName() {
        return this.b;
    }

    @Nullable
    public final List getSubCategories() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = this.a;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        List list0 = this.d;
        if(list0 != null) {
            v1 = list0.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    @NotNull
    public String toString() {
        return "Category(id=" + this.a + ", name=" + this.b + ", countOfEntries=" + this.c + ", subCategories=" + this.d + ")";
    }

    @JvmStatic
    public static final void write$Self$domain_release(Category category0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 0) || category0.a != -3) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 0, category0.a);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 1) || category0.b != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 1, StringSerializer.INSTANCE, category0.b);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 2) || category0.c != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 2, LongSerializer.INSTANCE, category0.c);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || category0.d != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 3, new ArrayListSerializer(.serializer.INSTANCE), category0.d);
        }
    }
}

