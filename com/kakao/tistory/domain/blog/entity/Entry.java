package com.kakao.tistory.domain.blog.entity;

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
import kotlinx.serialization.internal.BooleanSerializer;
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
import wb.a;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bI\b\u0087\b\u0018\u0000 k2\u00020\u0001:\u0002lkB\u009B\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0002\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\b\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0019\u0010\u001AB\u00A7\u0001\b\u0011\u0012\u0006\u0010\u001B\u001A\u00020\b\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\b\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001A\u00020\u0014\u0012\b\u0010\u0016\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001A\u00020\u0014\u0012\b\u0010\u0018\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u00A2\u0006\u0004\b\u0019\u0010\u001EJ(\u0010\'\u001A\u00020$2\u0006\u0010\u001F\u001A\u00020\u00002\u0006\u0010!\u001A\u00020 2\u0006\u0010#\u001A\u00020\"H\u00C1\u0001\u00A2\u0006\u0004\b%\u0010&J\u0010\u0010(\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010)J\u0010\u0010*\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010)J\u0012\u0010+\u001A\u0004\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b+\u0010,J\u0010\u0010-\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b-\u0010)J\u0010\u0010.\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u0010\u00100\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b0\u0010/J\u0010\u00101\u001A\u00020\u000BH\u00C6\u0003\u00A2\u0006\u0004\b1\u00102J\u0010\u00103\u001A\u00020\rH\u00C6\u0003\u00A2\u0006\u0004\b3\u00104J\u0012\u00105\u001A\u0004\u0018\u00010\u000FH\u00C6\u0003\u00A2\u0006\u0004\b5\u00106J\u0010\u00107\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b7\u00108J\u0010\u00109\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b9\u0010)J\u0010\u0010:\u001A\u00020\u0014H\u00C6\u0003\u00A2\u0006\u0004\b:\u0010;J\u0012\u0010<\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b<\u0010)J\u0010\u0010=\u001A\u00020\u0014H\u00C6\u0003\u00A2\u0006\u0004\b=\u0010;J\u0010\u0010>\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b>\u0010)J\u00AC\u0001\u0010?\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00022\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00022\b\b\u0002\u0010\u0015\u001A\u00020\u00142\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001A\u00020\u00142\b\b\u0002\u0010\u0018\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b?\u0010@J\u0010\u0010A\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\bA\u0010)J\u0010\u0010B\u001A\u00020\bH\u00D6\u0001\u00A2\u0006\u0004\bB\u0010/J\u001A\u0010D\u001A\u00020\u000B2\b\u0010C\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010)R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bI\u0010G\u001A\u0004\bJ\u0010)R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\bK\u0010L\u001A\u0004\bM\u0010,R\u0017\u0010\u0007\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bN\u0010G\u001A\u0004\bO\u0010)R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010/R\u0017\u0010\n\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bS\u0010Q\u001A\u0004\bT\u0010/R\u0017\u0010\f\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\b\f\u00102R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bW\u0010X\u001A\u0004\bY\u00104R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u000F8\u0006\u00A2\u0006\f\n\u0004\bZ\u0010[\u001A\u0004\b\\\u00106R\u0017\u0010\u0012\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b]\u0010^\u001A\u0004\b_\u00108R\u0017\u0010\u0013\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b`\u0010G\u001A\u0004\ba\u0010)R\u0017\u0010\u0015\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bb\u0010c\u001A\u0004\bd\u0010;R\u0019\u0010\u0016\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\be\u0010G\u001A\u0004\bf\u0010)R\u0017\u0010\u0017\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bg\u0010c\u001A\u0004\bh\u0010;R\u0017\u0010\u0018\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bi\u0010G\u001A\u0004\bj\u0010)\u00A8\u0006m"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/Entry;", "", "", "title", "summary", "Lcom/kakao/tistory/domain/common/Thumbnail;", "thumbnail", "published", "", "likeCount", "commentCount", "", "isChallenge", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "visibility", "Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;", "restrictType", "Lcom/kakao/tistory/domain/blog/entity/EntryScheduleStatusType;", "scheduleStatus", "blogName", "", "id", "password", "owner", "permalink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;IIZLcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;Lcom/kakao/tistory/domain/blog/entity/EntryScheduleStatusType;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;IIZLcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;Lcom/kakao/tistory/domain/blog/entity/EntryScheduleStatusType;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/blog/entity/Entry;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/kakao/tistory/domain/common/Thumbnail;", "component4", "component5", "()I", "component6", "component7", "()Z", "component8", "()Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "component9", "()Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;", "component10", "()Lcom/kakao/tistory/domain/blog/entity/EntryScheduleStatusType;", "component11", "component12", "()J", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/common/Thumbnail;Ljava/lang/String;IIZLcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;Lcom/kakao/tistory/domain/blog/entity/EntryScheduleStatusType;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;)Lcom/kakao/tistory/domain/blog/entity/Entry;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "getSummary", "c", "Lcom/kakao/tistory/domain/common/Thumbnail;", "getThumbnail", "d", "getPublished", "e", "I", "getLikeCount", "f", "getCommentCount", "g", "Z", "h", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "getVisibility", "i", "Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;", "getRestrictType", "j", "Lcom/kakao/tistory/domain/blog/entity/EntryScheduleStatusType;", "getScheduleStatus", "k", "getBlogName", "l", "J", "getId", "m", "getPassword", "n", "getOwner", "o", "getPermalink", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class Entry {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/blog/entity/Entry.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/blog/entity/Entry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/blog/entity/Entry;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/blog/entity/Entry;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer entry$$serializer0 = new .serializer();
            .serializer.INSTANCE = entry$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.blog.entity.Entry", entry$$serializer0, 15);
            pluginGeneratedSerialDescriptor0.addElement("title", false);
            pluginGeneratedSerialDescriptor0.addElement("summary", false);
            pluginGeneratedSerialDescriptor0.addElement("thumbnail", false);
            pluginGeneratedSerialDescriptor0.addElement("published", false);
            pluginGeneratedSerialDescriptor0.addElement("likeCount", true);
            pluginGeneratedSerialDescriptor0.addElement("commentCount", true);
            pluginGeneratedSerialDescriptor0.addElement("isChallenge", true);
            pluginGeneratedSerialDescriptor0.addElement("visibility", true);
            pluginGeneratedSerialDescriptor0.addElement("restrictType", true);
            pluginGeneratedSerialDescriptor0.addElement("scheduleStatus", true);
            pluginGeneratedSerialDescriptor0.addElement("blogName", true);
            pluginGeneratedSerialDescriptor0.addElement("id", true);
            pluginGeneratedSerialDescriptor0.addElement("password", true);
            pluginGeneratedSerialDescriptor0.addElement("owner", true);
            pluginGeneratedSerialDescriptor0.addElement("permalink", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer[] arr_kSerializer = Entry.p;
            KSerializer kSerializer0 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE);
            KSerializer kSerializer1 = arr_kSerializer[7];
            KSerializer kSerializer2 = BuiltinSerializersKt.getNullable(arr_kSerializer[8]);
            KSerializer kSerializer3 = arr_kSerializer[9];
            KSerializer kSerializer4 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
            return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer0, StringSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, kSerializer1, kSerializer2, kSerializer3, StringSerializer.INSTANCE, LongSerializer.INSTANCE, kSerializer4, LongSerializer.INSTANCE, StringSerializer.INSTANCE};
        }

        @NotNull
        public Entry deserialize(@NotNull Decoder decoder0) {
            String s10;
            EntryScheduleStatusType entryScheduleStatusType1;
            long v8;
            long v7;
            EntryVisibilityType entryVisibilityType1;
            int v6;
            String s9;
            int v5;
            boolean z1;
            String s8;
            int v4;
            Thumbnail thumbnail1;
            String s7;
            EntryRestrictType entryRestrictType1;
            String s6;
            String s5;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = Entry.p;
            if(compositeDecoder0.decodeSequentially()) {
                String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                Thumbnail thumbnail0 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 4);
                int v1 = compositeDecoder0.decodeIntElement(serialDescriptor0, 5);
                boolean z = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 6);
                EntryVisibilityType entryVisibilityType0 = (EntryVisibilityType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 7, arr_kSerializer[7], null);
                EntryRestrictType entryRestrictType0 = (EntryRestrictType)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 8, arr_kSerializer[8], null);
                EntryScheduleStatusType entryScheduleStatusType0 = (EntryScheduleStatusType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 9, arr_kSerializer[9], null);
                String s3 = compositeDecoder0.decodeStringElement(serialDescriptor0, 10);
                long v2 = compositeDecoder0.decodeLongElement(serialDescriptor0, 11);
                String s4 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 12, StringSerializer.INSTANCE, null);
                long v3 = compositeDecoder0.decodeLongElement(serialDescriptor0, 13);
                s5 = s4;
                s6 = compositeDecoder0.decodeStringElement(serialDescriptor0, 14);
                entryRestrictType1 = entryRestrictType0;
                s7 = s1;
                thumbnail1 = thumbnail0;
                v4 = 0x7FFF;
                s8 = s3;
                z1 = z;
                v5 = v1;
                s9 = s2;
                v6 = v;
                entryVisibilityType1 = entryVisibilityType0;
                v7 = v2;
                v8 = v3;
                entryScheduleStatusType1 = entryScheduleStatusType0;
                s10 = s;
            }
            else {
                boolean z2 = false;
                int v9 = 0;
                int v10 = 0;
                EntryVisibilityType entryVisibilityType2 = null;
                EntryScheduleStatusType entryScheduleStatusType2 = null;
                String s11 = null;
                EntryRestrictType entryRestrictType2 = null;
                String s12 = null;
                String s13 = null;
                String s14 = null;
                long v11 = 0L;
                long v12 = 0L;
                String s15 = null;
                String s16 = null;
                Thumbnail thumbnail2 = null;
                int v13 = 0;
                boolean z3 = true;
                while(z3) {
                    int v14 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v14) {
                        case -1: {
                            z3 = false;
                            break;
                        }
                        case 0: {
                            s15 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                            v13 |= 1;
                            break;
                        }
                        case 1: {
                            s16 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                            v13 |= 2;
                            break;
                        }
                        case 2: {
                            thumbnail2 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail2);
                            v13 |= 4;
                            break;
                        }
                        case 3: {
                            s12 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                            v13 |= 8;
                            break;
                        }
                        case 4: {
                            v10 = compositeDecoder0.decodeIntElement(serialDescriptor0, 4);
                            v13 |= 16;
                            break;
                        }
                        case 5: {
                            v9 = compositeDecoder0.decodeIntElement(serialDescriptor0, 5);
                            v13 |= 0x20;
                            break;
                        }
                        case 6: {
                            z2 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 6);
                            v13 |= 0x40;
                            break;
                        }
                        case 7: {
                            entryVisibilityType2 = (EntryVisibilityType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 7, arr_kSerializer[7], entryVisibilityType2);
                            v13 |= 0x80;
                            break;
                        }
                        case 8: {
                            entryRestrictType2 = (EntryRestrictType)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 8, arr_kSerializer[8], entryRestrictType2);
                            v13 |= 0x100;
                            break;
                        }
                        case 9: {
                            entryScheduleStatusType2 = (EntryScheduleStatusType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 9, arr_kSerializer[9], entryScheduleStatusType2);
                            v13 |= 0x200;
                            break;
                        }
                        case 10: {
                            s13 = compositeDecoder0.decodeStringElement(serialDescriptor0, 10);
                            v13 |= 0x400;
                            break;
                        }
                        case 11: {
                            v11 = compositeDecoder0.decodeLongElement(serialDescriptor0, 11);
                            v13 |= 0x800;
                            break;
                        }
                        case 12: {
                            s11 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 12, StringSerializer.INSTANCE, s11);
                            v13 |= 0x1000;
                            break;
                        }
                        case 13: {
                            v12 = compositeDecoder0.decodeLongElement(serialDescriptor0, 13);
                            v13 |= 0x2000;
                            break;
                        }
                        case 14: {
                            s14 = compositeDecoder0.decodeStringElement(serialDescriptor0, 14);
                            v13 |= 0x4000;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v14);
                        }
                    }
                }
                entryVisibilityType1 = entryVisibilityType2;
                thumbnail1 = thumbnail2;
                v4 = v13;
                entryScheduleStatusType1 = entryScheduleStatusType2;
                s5 = s11;
                entryRestrictType1 = entryRestrictType2;
                s10 = s15;
                s7 = s16;
                s9 = s12;
                s8 = s13;
                s6 = s14;
                z1 = z2;
                v5 = v9;
                v6 = v10;
                v7 = v11;
                v8 = v12;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new Entry(v4, s10, s7, thumbnail1, s9, v6, v5, z1, entryVisibilityType1, entryRestrictType1, entryScheduleStatusType1, s8, v7, s5, v8, s6, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull Entry entry0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(entry0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            Entry.write$Self$domain_release(entry0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((Entry)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/Entry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/blog/entity/Entry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final Thumbnail c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final EntryVisibilityType h;
    public final EntryRestrictType i;
    public final EntryScheduleStatusType j;
    public final String k;
    public final long l;
    public final String m;
    public final long n;
    public final String o;
    public static final KSerializer[] p;

    static {
        Entry.Companion = new Companion(null);
        Entry.p = new KSerializer[]{null, null, null, null, null, null, null, EntryVisibilityType.Companion.serializer(), EntryRestrictType.Companion.serializer(), EntryScheduleStatusType.Companion.serializer(), null, null, null, null, null};
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public Entry(int v, String s, String s1, Thumbnail thumbnail0, String s2, int v1, int v2, boolean z, EntryVisibilityType entryVisibilityType0, EntryRestrictType entryRestrictType0, EntryScheduleStatusType entryScheduleStatusType0, String s3, long v3, String s4, long v4, String s5, SerializationConstructorMarker serializationConstructorMarker0) {
        if(15 != (v & 15)) {
            PluginExceptionsKt.throwMissingFieldException(v, 15, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = s;
        this.b = s1;
        this.c = thumbnail0;
        this.d = s2;
        this.e = (v & 16) == 0 ? 0 : v1;
        this.f = (v & 0x20) == 0 ? 0 : v2;
        this.g = (v & 0x40) == 0 ? false : z;
        this.h = (v & 0x80) == 0 ? EntryVisibilityType.PUBLIC : entryVisibilityType0;
        this.i = (v & 0x100) == 0 ? null : entryRestrictType0;
        this.j = (v & 0x200) == 0 ? EntryScheduleStatusType.NOT_SCHEDULED : entryScheduleStatusType0;
        this.k = (v & 0x400) == 0 ? "" : s3;
        this.l = (v & 0x800) == 0 ? 0L : v3;
        this.m = (v & 0x1000) == 0 ? null : s4;
        this.n = (v & 0x2000) == 0 ? 0L : v4;
        if((v & 0x4000) == 0) {
            this.o = "";
            return;
        }
        this.o = s5;
    }

    public Entry(@NotNull String s, @NotNull String s1, @Nullable Thumbnail thumbnail0, @NotNull String s2, int v, int v1, boolean z, @NotNull EntryVisibilityType entryVisibilityType0, @Nullable EntryRestrictType entryRestrictType0, @NotNull EntryScheduleStatusType entryScheduleStatusType0, @NotNull String s3, long v2, @Nullable String s4, long v3, @NotNull String s5) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "summary");
        Intrinsics.checkNotNullParameter(s2, "published");
        Intrinsics.checkNotNullParameter(entryVisibilityType0, "visibility");
        Intrinsics.checkNotNullParameter(entryScheduleStatusType0, "scheduleStatus");
        Intrinsics.checkNotNullParameter(s3, "blogName");
        Intrinsics.checkNotNullParameter(s5, "permalink");
        super();
        this.a = s;
        this.b = s1;
        this.c = thumbnail0;
        this.d = s2;
        this.e = v;
        this.f = v1;
        this.g = z;
        this.h = entryVisibilityType0;
        this.i = entryRestrictType0;
        this.j = entryScheduleStatusType0;
        this.k = s3;
        this.l = v2;
        this.m = s4;
        this.n = v3;
        this.o = s5;
    }

    public Entry(String s, String s1, Thumbnail thumbnail0, String s2, int v, int v1, boolean z, EntryVisibilityType entryVisibilityType0, EntryRestrictType entryRestrictType0, EntryScheduleStatusType entryScheduleStatusType0, String s3, long v2, String s4, long v3, String s5, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, s1, thumbnail0, s2, ((v4 & 16) == 0 ? v : 0), ((v4 & 0x20) == 0 ? v1 : 0), ((v4 & 0x40) == 0 ? z : false), ((v4 & 0x80) == 0 ? entryVisibilityType0 : EntryVisibilityType.PUBLIC), ((v4 & 0x100) == 0 ? entryRestrictType0 : null), ((v4 & 0x200) == 0 ? entryScheduleStatusType0 : EntryScheduleStatusType.NOT_SCHEDULED), ((v4 & 0x400) == 0 ? s3 : ""), ((v4 & 0x800) == 0 ? v2 : 0L), ((v4 & 0x1000) == 0 ? s4 : null), ((v4 & 0x2000) == 0 ? v3 : 0L), ((v4 & 0x4000) == 0 ? s5 : ""));
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final EntryScheduleStatusType component10() {
        return this.j;
    }

    @NotNull
    public final String component11() {
        return this.k;
    }

    public final long component12() {
        return this.l;
    }

    @Nullable
    public final String component13() {
        return this.m;
    }

    public final long component14() {
        return this.n;
    }

    @NotNull
    public final String component15() {
        return this.o;
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

    public final boolean component7() {
        return this.g;
    }

    @NotNull
    public final EntryVisibilityType component8() {
        return this.h;
    }

    @Nullable
    public final EntryRestrictType component9() {
        return this.i;
    }

    @NotNull
    public final Entry copy(@NotNull String s, @NotNull String s1, @Nullable Thumbnail thumbnail0, @NotNull String s2, int v, int v1, boolean z, @NotNull EntryVisibilityType entryVisibilityType0, @Nullable EntryRestrictType entryRestrictType0, @NotNull EntryScheduleStatusType entryScheduleStatusType0, @NotNull String s3, long v2, @Nullable String s4, long v3, @NotNull String s5) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "summary");
        Intrinsics.checkNotNullParameter(s2, "published");
        Intrinsics.checkNotNullParameter(entryVisibilityType0, "visibility");
        Intrinsics.checkNotNullParameter(entryScheduleStatusType0, "scheduleStatus");
        Intrinsics.checkNotNullParameter(s3, "blogName");
        Intrinsics.checkNotNullParameter(s5, "permalink");
        return new Entry(s, s1, thumbnail0, s2, v, v1, z, entryVisibilityType0, entryRestrictType0, entryScheduleStatusType0, s3, v2, s4, v3, s5);
    }

    public static Entry copy$default(Entry entry0, String s, String s1, Thumbnail thumbnail0, String s2, int v, int v1, boolean z, EntryVisibilityType entryVisibilityType0, EntryRestrictType entryRestrictType0, EntryScheduleStatusType entryScheduleStatusType0, String s3, long v2, String s4, long v3, String s5, int v4, Object object0) {
        String s6 = (v4 & 1) == 0 ? s : entry0.a;
        String s7 = (v4 & 2) == 0 ? s1 : entry0.b;
        Thumbnail thumbnail1 = (v4 & 4) == 0 ? thumbnail0 : entry0.c;
        String s8 = (v4 & 8) == 0 ? s2 : entry0.d;
        int v5 = (v4 & 16) == 0 ? v : entry0.e;
        int v6 = (v4 & 0x20) == 0 ? v1 : entry0.f;
        boolean z1 = (v4 & 0x40) == 0 ? z : entry0.g;
        EntryVisibilityType entryVisibilityType1 = (v4 & 0x80) == 0 ? entryVisibilityType0 : entry0.h;
        EntryRestrictType entryRestrictType1 = (v4 & 0x100) == 0 ? entryRestrictType0 : entry0.i;
        EntryScheduleStatusType entryScheduleStatusType1 = (v4 & 0x200) == 0 ? entryScheduleStatusType0 : entry0.j;
        String s9 = (v4 & 0x400) == 0 ? s3 : entry0.k;
        long v7 = (v4 & 0x800) == 0 ? v2 : entry0.l;
        String s10 = (v4 & 0x1000) == 0 ? s4 : entry0.m;
        long v8 = (v4 & 0x2000) == 0 ? v3 : entry0.n;
        return (v4 & 0x4000) == 0 ? entry0.copy(s6, s7, thumbnail1, s8, v5, v6, z1, entryVisibilityType1, entryRestrictType1, entryScheduleStatusType1, s9, v7, s10, v8, s5) : entry0.copy(s6, s7, thumbnail1, s8, v5, v6, z1, entryVisibilityType1, entryRestrictType1, entryScheduleStatusType1, s9, v7, s10, v8, entry0.o);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Entry)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((Entry)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((Entry)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((Entry)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((Entry)object0).d)) {
            return false;
        }
        if(this.e != ((Entry)object0).e) {
            return false;
        }
        if(this.f != ((Entry)object0).f) {
            return false;
        }
        if(this.g != ((Entry)object0).g) {
            return false;
        }
        if(this.h != ((Entry)object0).h) {
            return false;
        }
        if(this.i != ((Entry)object0).i) {
            return false;
        }
        if(this.j != ((Entry)object0).j) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, ((Entry)object0).k)) {
            return false;
        }
        if(this.l != ((Entry)object0).l) {
            return false;
        }
        if(!Intrinsics.areEqual(this.m, ((Entry)object0).m)) {
            return false;
        }
        return this.n == ((Entry)object0).n ? Intrinsics.areEqual(this.o, ((Entry)object0).o) : false;
    }

    @NotNull
    public final String getBlogName() {
        return this.k;
    }

    public final int getCommentCount() {
        return this.f;
    }

    public final long getId() {
        return this.l;
    }

    public final int getLikeCount() {
        return this.e;
    }

    public final long getOwner() {
        return this.n;
    }

    @Nullable
    public final String getPassword() {
        return this.m;
    }

    @NotNull
    public final String getPermalink() {
        return this.o;
    }

    @NotNull
    public final String getPublished() {
        return this.d;
    }

    @Nullable
    public final EntryRestrictType getRestrictType() {
        return this.i;
    }

    @NotNull
    public final EntryScheduleStatusType getScheduleStatus() {
        return this.j;
    }

    @NotNull
    public final String getSummary() {
        return this.b;
    }

    @Nullable
    public final Thumbnail getThumbnail() {
        return this.c;
    }

    @NotNull
    public final String getTitle() {
        return this.a;
    }

    @NotNull
    public final EntryVisibilityType getVisibility() {
        return this.h;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.k(this.l, b.a(this.k, (this.j.hashCode() + ((this.h.hashCode() + c.a(this.g, com.kakao.tistory.domain.blog.entity.a.a(this.f, com.kakao.tistory.domain.blog.entity.a.a(this.e, b.a(this.d, (b.a(this.b, this.a.hashCode() * 0x1F, 0x1F) + (this.c == null ? 0 : this.c.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F)) * 0x1F + (this.i == null ? 0 : this.i.hashCode())) * 0x1F) * 0x1F, 0x1F), 0x1F);
        String s = this.m;
        if(s != null) {
            v = s.hashCode();
        }
        return this.o.hashCode() + a.k(this.n, (v1 + v) * 0x1F, 0x1F);
    }

    public final boolean isChallenge() {
        return this.g;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = a5.b.w("Entry(title=", this.a, ", summary=", this.b, ", thumbnail=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", published=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", likeCount=");
        r0.a.A(stringBuilder0, this.e, ", commentCount=", this.f, ", isChallenge=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", visibility=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", restrictType=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", scheduleStatus=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", blogName=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", id=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", password=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", owner=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(", permalink=");
        stringBuilder0.append(this.o);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @JvmStatic
    public static final void write$Self$domain_release(Entry entry0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        KSerializer[] arr_kSerializer = Entry.p;
        compositeEncoder0.encodeStringElement(serialDescriptor0, 0, entry0.a);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 1, entry0.b);
        compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 2, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, entry0.c);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 3, entry0.d);
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || entry0.e != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 4, entry0.e);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 5) || entry0.f != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 5, entry0.f);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6) || entry0.g) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 6, entry0.g);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 7) || entry0.h != EntryVisibilityType.PUBLIC) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 7, arr_kSerializer[7], entry0.h);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 8) || entry0.i != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 8, arr_kSerializer[8], entry0.i);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 9) || entry0.j != EntryScheduleStatusType.NOT_SCHEDULED) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 9, arr_kSerializer[9], entry0.j);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 10) || !Intrinsics.areEqual(entry0.k, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 10, entry0.k);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 11) || entry0.l != 0L) {
            compositeEncoder0.encodeLongElement(serialDescriptor0, 11, entry0.l);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 12) || entry0.m != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 12, StringSerializer.INSTANCE, entry0.m);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 13) || entry0.n != 0L) {
            compositeEncoder0.encodeLongElement(serialDescriptor0, 13, entry0.n);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 14) || !Intrinsics.areEqual(entry0.o, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 14, entry0.o);
        }
    }
}

