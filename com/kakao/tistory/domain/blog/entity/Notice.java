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

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001D\n\u0002\u0010\u000B\n\u0002\b(\b\u0087\b\u0018\u0000 f2\u00020\u0001:\u0002gfB}\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0010\u001A\u00020\u000E\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0013\u001A\u00020\u0002\u0012\u0006\u0010\u0014\u001A\u00020\u0011\u0012\u0006\u0010\u0015\u001A\u00020\u0011\u0012\u0006\u0010\u0016\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0017\u0010\u0018B\u009D\u0001\b\u0011\u0012\u0006\u0010\u0019\u001A\u00020\u000E\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0010\u001A\u00020\u000E\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\b\u0010\u0013\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001A\u00020\u0011\u0012\u0006\u0010\u0015\u001A\u00020\u0011\u0012\b\u0010\u0016\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u001B\u001A\u0004\u0018\u00010\u001A\u00A2\u0006\u0004\b\u0017\u0010\u001CJ(\u0010%\u001A\u00020\"2\u0006\u0010\u001D\u001A\u00020\u00002\u0006\u0010\u001F\u001A\u00020\u001E2\u0006\u0010!\u001A\u00020 H\u00C1\u0001\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010&\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b&\u0010\'J\u0010\u0010(\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b(\u0010\'J\u0010\u0010)\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b)\u0010\'J\u0010\u0010*\u001A\u00020\u0006H\u00C6\u0003\u00A2\u0006\u0004\b*\u0010+J\u0010\u0010,\u001A\u00020\bH\u00C6\u0003\u00A2\u0006\u0004\b,\u0010-J\u0012\u0010.\u001A\u0004\u0018\u00010\nH\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u0012\u00100\u001A\u0004\u0018\u00010\fH\u00C6\u0003\u00A2\u0006\u0004\b0\u00101J\u0010\u00102\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b2\u00103J\u0010\u00104\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b4\u00103J\u0010\u00105\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b5\u00106J\u0010\u00107\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b7\u0010\'J\u0010\u00108\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b8\u00106J\u0010\u00109\u001A\u00020\u0011H\u00C6\u0003\u00A2\u0006\u0004\b9\u00106J\u0010\u0010:\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b:\u0010\'J\u00A0\u0001\u0010;\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\u000E2\b\b\u0002\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0013\u001A\u00020\u00022\b\b\u0002\u0010\u0014\u001A\u00020\u00112\b\b\u0002\u0010\u0015\u001A\u00020\u00112\b\b\u0002\u0010\u0016\u001A\u00020\u0002H\u00C6\u0001\u00A2\u0006\u0004\b;\u0010<J\u0010\u0010=\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b=\u0010\'J\u0010\u0010>\u001A\u00020\u000EH\u00D6\u0001\u00A2\u0006\u0004\b>\u00103J\u001A\u0010A\u001A\u00020@2\b\u0010?\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010\'R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bF\u0010D\u001A\u0004\bG\u0010\'R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bH\u0010D\u001A\u0004\bI\u0010\'R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010+R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010-R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0006\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010/R\u0019\u0010\r\u001A\u0004\u0018\u00010\f8\u0006\u00A2\u0006\f\n\u0004\bS\u0010T\u001A\u0004\bU\u00101R\u0017\u0010\u000F\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bV\u0010W\u001A\u0004\bX\u00103R\u0017\u0010\u0010\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bY\u0010W\u001A\u0004\bZ\u00103R\u0017\u0010\u0012\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b[\u0010\\\u001A\u0004\b]\u00106R\u0017\u0010\u0013\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b^\u0010D\u001A\u0004\b_\u0010\'R\u0017\u0010\u0014\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\b`\u0010\\\u001A\u0004\ba\u00106R\u0017\u0010\u0015\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\bb\u0010\\\u001A\u0004\bc\u00106R\u0017\u0010\u0016\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bd\u0010D\u001A\u0004\be\u0010\'\u00A8\u0006h"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/Notice;", "", "", "title", "summary", "published", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "visibility", "Lcom/kakao/tistory/domain/blog/entity/EntryScheduleStatusType;", "scheduleStatus", "Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;", "restrictType", "Lcom/kakao/tistory/domain/common/Thumbnail;", "thumbnail", "", "likeCount", "commentCount", "", "id", "blogName", "author", "owner", "permalink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Lcom/kakao/tistory/domain/blog/entity/EntryScheduleStatusType;Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;Lcom/kakao/tistory/domain/common/Thumbnail;IIJLjava/lang/String;JJLjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Lcom/kakao/tistory/domain/blog/entity/EntryScheduleStatusType;Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;Lcom/kakao/tistory/domain/common/Thumbnail;IIJLjava/lang/String;JJLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/blog/entity/Notice;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "component5", "()Lcom/kakao/tistory/domain/blog/entity/EntryScheduleStatusType;", "component6", "()Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;", "component7", "()Lcom/kakao/tistory/domain/common/Thumbnail;", "component8", "()I", "component9", "component10", "()J", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;Lcom/kakao/tistory/domain/blog/entity/EntryScheduleStatusType;Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;Lcom/kakao/tistory/domain/common/Thumbnail;IIJLjava/lang/String;JJLjava/lang/String;)Lcom/kakao/tistory/domain/blog/entity/Notice;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "getSummary", "c", "getPublished", "d", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "getVisibility", "e", "Lcom/kakao/tistory/domain/blog/entity/EntryScheduleStatusType;", "getScheduleStatus", "f", "Lcom/kakao/tistory/domain/blog/entity/EntryRestrictType;", "getRestrictType", "g", "Lcom/kakao/tistory/domain/common/Thumbnail;", "getThumbnail", "h", "I", "getLikeCount", "i", "getCommentCount", "j", "J", "getId", "k", "getBlogName", "l", "getAuthor", "m", "getOwner", "n", "getPermalink", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class Notice {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/blog/entity/Notice.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/blog/entity/Notice;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/blog/entity/Notice;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/blog/entity/Notice;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer notice$$serializer0 = new .serializer();
            .serializer.INSTANCE = notice$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.blog.entity.Notice", notice$$serializer0, 14);
            pluginGeneratedSerialDescriptor0.addElement("title", false);
            pluginGeneratedSerialDescriptor0.addElement("summary", false);
            pluginGeneratedSerialDescriptor0.addElement("published", false);
            pluginGeneratedSerialDescriptor0.addElement("visibility", false);
            pluginGeneratedSerialDescriptor0.addElement("scheduleStatus", true);
            pluginGeneratedSerialDescriptor0.addElement("restrictType", false);
            pluginGeneratedSerialDescriptor0.addElement("thumbnail", false);
            pluginGeneratedSerialDescriptor0.addElement("likeCount", false);
            pluginGeneratedSerialDescriptor0.addElement("commentCount", false);
            pluginGeneratedSerialDescriptor0.addElement("id", false);
            pluginGeneratedSerialDescriptor0.addElement("blogName", false);
            pluginGeneratedSerialDescriptor0.addElement("author", false);
            pluginGeneratedSerialDescriptor0.addElement("owner", false);
            pluginGeneratedSerialDescriptor0.addElement("permalink", false);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer[] arr_kSerializer = Notice.o;
            KSerializer kSerializer0 = arr_kSerializer[3];
            KSerializer kSerializer1 = arr_kSerializer[4];
            KSerializer kSerializer2 = BuiltinSerializersKt.getNullable(arr_kSerializer[5]);
            KSerializer kSerializer3 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE);
            return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializer0, kSerializer1, kSerializer2, kSerializer3, IntSerializer.INSTANCE, IntSerializer.INSTANCE, LongSerializer.INSTANCE, StringSerializer.INSTANCE, LongSerializer.INSTANCE, LongSerializer.INSTANCE, StringSerializer.INSTANCE};
        }

        @NotNull
        public Notice deserialize(@NotNull Decoder decoder0) {
            long v10;
            long v9;
            long v8;
            EntryScheduleStatusType entryScheduleStatusType1;
            EntryVisibilityType entryVisibilityType1;
            int v7;
            int v6;
            int v5;
            String s9;
            String s8;
            Thumbnail thumbnail1;
            String s7;
            String s6;
            String s5;
            EntryRestrictType entryRestrictType1;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = Notice.o;
            String s = null;
            if(compositeDecoder0.decodeSequentially()) {
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                String s3 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                EntryVisibilityType entryVisibilityType0 = (EntryVisibilityType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, arr_kSerializer[3], null);
                EntryScheduleStatusType entryScheduleStatusType0 = (EntryScheduleStatusType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], null);
                EntryRestrictType entryRestrictType0 = (EntryRestrictType)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], null);
                Thumbnail thumbnail0 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, null);
                int v = compositeDecoder0.decodeIntElement(serialDescriptor0, 7);
                int v1 = compositeDecoder0.decodeIntElement(serialDescriptor0, 8);
                long v2 = compositeDecoder0.decodeLongElement(serialDescriptor0, 9);
                String s4 = compositeDecoder0.decodeStringElement(serialDescriptor0, 10);
                long v3 = compositeDecoder0.decodeLongElement(serialDescriptor0, 11);
                long v4 = compositeDecoder0.decodeLongElement(serialDescriptor0, 12);
                entryRestrictType1 = entryRestrictType0;
                s5 = s1;
                s6 = s2;
                s7 = s3;
                thumbnail1 = thumbnail0;
                s8 = s4;
                s9 = compositeDecoder0.decodeStringElement(serialDescriptor0, 13);
                v5 = v;
                v6 = v1;
                v7 = 0x3FFF;
                entryVisibilityType1 = entryVisibilityType0;
                entryScheduleStatusType1 = entryScheduleStatusType0;
                v8 = v4;
                v9 = v2;
                v10 = v3;
            }
            else {
                int v11 = 0;
                int v12 = 0;
                int v13 = 0;
                EntryScheduleStatusType entryScheduleStatusType2 = null;
                EntryVisibilityType entryVisibilityType2 = null;
                EntryRestrictType entryRestrictType2 = null;
                Thumbnail thumbnail2 = null;
                String s10 = null;
                String s11 = null;
                long v14 = 0L;
                long v15 = 0L;
                long v16 = 0L;
                String s12 = null;
                String s13 = null;
                boolean z = true;
                while(z) {
                    int v17 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v17) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            v11 |= 1;
                            s = compositeDecoder0.decodeStringElement(serialDescriptor0, 0);
                            break;
                        }
                        case 1: {
                            s12 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                            v11 |= 2;
                            break;
                        }
                        case 2: {
                            s13 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                            v11 |= 4;
                            break;
                        }
                        case 3: {
                            entryVisibilityType2 = (EntryVisibilityType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 3, arr_kSerializer[3], entryVisibilityType2);
                            v11 |= 8;
                            break;
                        }
                        case 4: {
                            entryScheduleStatusType2 = (EntryScheduleStatusType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], entryScheduleStatusType2);
                            v11 |= 16;
                            break;
                        }
                        case 5: {
                            entryRestrictType2 = (EntryRestrictType)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], entryRestrictType2);
                            v11 |= 0x20;
                            break;
                        }
                        case 6: {
                            thumbnail2 = (Thumbnail)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, thumbnail2);
                            v11 |= 0x40;
                            break;
                        }
                        case 7: {
                            v12 = compositeDecoder0.decodeIntElement(serialDescriptor0, 7);
                            v11 |= 0x80;
                            break;
                        }
                        case 8: {
                            v13 = compositeDecoder0.decodeIntElement(serialDescriptor0, 8);
                            v11 |= 0x100;
                            break;
                        }
                        case 9: {
                            v15 = compositeDecoder0.decodeLongElement(serialDescriptor0, 9);
                            v11 |= 0x200;
                            break;
                        }
                        case 10: {
                            s10 = compositeDecoder0.decodeStringElement(serialDescriptor0, 10);
                            v11 |= 0x400;
                            break;
                        }
                        case 11: {
                            v16 = compositeDecoder0.decodeLongElement(serialDescriptor0, 11);
                            v11 |= 0x800;
                            break;
                        }
                        case 12: {
                            v14 = compositeDecoder0.decodeLongElement(serialDescriptor0, 12);
                            v11 |= 0x1000;
                            break;
                        }
                        case 13: {
                            s11 = compositeDecoder0.decodeStringElement(serialDescriptor0, 13);
                            v11 |= 0x2000;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v17);
                        }
                    }
                }
                entryScheduleStatusType1 = entryScheduleStatusType2;
                entryVisibilityType1 = entryVisibilityType2;
                s5 = s;
                entryRestrictType1 = entryRestrictType2;
                thumbnail1 = thumbnail2;
                v7 = v11;
                s6 = s12;
                s7 = s13;
                s8 = s10;
                s9 = s11;
                v5 = v12;
                v6 = v13;
                v8 = v14;
                v9 = v15;
                v10 = v16;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new Notice(v7, s5, s6, s7, entryVisibilityType1, entryScheduleStatusType1, entryRestrictType1, thumbnail1, v5, v6, v9, s8, v10, v8, s9, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull Notice notice0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(notice0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            Notice.write$Self$domain_release(notice0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((Notice)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/Notice$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/blog/entity/Notice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final EntryVisibilityType d;
    public final EntryScheduleStatusType e;
    public final EntryRestrictType f;
    public final Thumbnail g;
    public final int h;
    public final int i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;
    public final String n;
    public static final KSerializer[] o;

    static {
        Notice.Companion = new Companion(null);
        Notice.o = new KSerializer[]{null, null, null, EntryVisibilityType.Companion.serializer(), EntryScheduleStatusType.Companion.serializer(), EntryRestrictType.Companion.serializer(), null, null, null, null, null, null, null, null};
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public Notice(int v, String s, String s1, String s2, EntryVisibilityType entryVisibilityType0, EntryScheduleStatusType entryScheduleStatusType0, EntryRestrictType entryRestrictType0, Thumbnail thumbnail0, int v1, int v2, long v3, String s3, long v4, long v5, String s4, SerializationConstructorMarker serializationConstructorMarker0) {
        if(0x3FEF != (v & 0x3FEF)) {
            PluginExceptionsKt.throwMissingFieldException(v, 0x3FEF, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = entryVisibilityType0;
        this.e = (v & 16) == 0 ? EntryScheduleStatusType.NOT_SCHEDULED : entryScheduleStatusType0;
        this.f = entryRestrictType0;
        this.g = thumbnail0;
        this.h = v1;
        this.i = v2;
        this.j = v3;
        this.k = s3;
        this.l = v4;
        this.m = v5;
        this.n = s4;
    }

    public Notice(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull EntryVisibilityType entryVisibilityType0, @NotNull EntryScheduleStatusType entryScheduleStatusType0, @Nullable EntryRestrictType entryRestrictType0, @Nullable Thumbnail thumbnail0, int v, int v1, long v2, @NotNull String s3, long v3, long v4, @NotNull String s4) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "summary");
        Intrinsics.checkNotNullParameter(s2, "published");
        Intrinsics.checkNotNullParameter(entryVisibilityType0, "visibility");
        Intrinsics.checkNotNullParameter(entryScheduleStatusType0, "scheduleStatus");
        Intrinsics.checkNotNullParameter(s3, "blogName");
        Intrinsics.checkNotNullParameter(s4, "permalink");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = entryVisibilityType0;
        this.e = entryScheduleStatusType0;
        this.f = entryRestrictType0;
        this.g = thumbnail0;
        this.h = v;
        this.i = v1;
        this.j = v2;
        this.k = s3;
        this.l = v3;
        this.m = v4;
        this.n = s4;
    }

    public Notice(String s, String s1, String s2, EntryVisibilityType entryVisibilityType0, EntryScheduleStatusType entryScheduleStatusType0, EntryRestrictType entryRestrictType0, Thumbnail thumbnail0, int v, int v1, long v2, String s3, long v3, long v4, String s4, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, s1, s2, entryVisibilityType0, ((v5 & 16) == 0 ? entryScheduleStatusType0 : EntryScheduleStatusType.NOT_SCHEDULED), entryRestrictType0, thumbnail0, v, v1, v2, s3, v3, v4, s4);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    public final long component10() {
        return this.j;
    }

    @NotNull
    public final String component11() {
        return this.k;
    }

    public final long component12() {
        return this.l;
    }

    public final long component13() {
        return this.m;
    }

    @NotNull
    public final String component14() {
        return this.n;
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
    public final EntryVisibilityType component4() {
        return this.d;
    }

    @NotNull
    public final EntryScheduleStatusType component5() {
        return this.e;
    }

    @Nullable
    public final EntryRestrictType component6() {
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
    public final Notice copy(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull EntryVisibilityType entryVisibilityType0, @NotNull EntryScheduleStatusType entryScheduleStatusType0, @Nullable EntryRestrictType entryRestrictType0, @Nullable Thumbnail thumbnail0, int v, int v1, long v2, @NotNull String s3, long v3, long v4, @NotNull String s4) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "summary");
        Intrinsics.checkNotNullParameter(s2, "published");
        Intrinsics.checkNotNullParameter(entryVisibilityType0, "visibility");
        Intrinsics.checkNotNullParameter(entryScheduleStatusType0, "scheduleStatus");
        Intrinsics.checkNotNullParameter(s3, "blogName");
        Intrinsics.checkNotNullParameter(s4, "permalink");
        return new Notice(s, s1, s2, entryVisibilityType0, entryScheduleStatusType0, entryRestrictType0, thumbnail0, v, v1, v2, s3, v3, v4, s4);
    }

    public static Notice copy$default(Notice notice0, String s, String s1, String s2, EntryVisibilityType entryVisibilityType0, EntryScheduleStatusType entryScheduleStatusType0, EntryRestrictType entryRestrictType0, Thumbnail thumbnail0, int v, int v1, long v2, String s3, long v3, long v4, String s4, int v5, Object object0) {
        String s5 = (v5 & 1) == 0 ? s : notice0.a;
        String s6 = (v5 & 2) == 0 ? s1 : notice0.b;
        String s7 = (v5 & 4) == 0 ? s2 : notice0.c;
        EntryVisibilityType entryVisibilityType1 = (v5 & 8) == 0 ? entryVisibilityType0 : notice0.d;
        EntryScheduleStatusType entryScheduleStatusType1 = (v5 & 16) == 0 ? entryScheduleStatusType0 : notice0.e;
        EntryRestrictType entryRestrictType1 = (v5 & 0x20) == 0 ? entryRestrictType0 : notice0.f;
        Thumbnail thumbnail1 = (v5 & 0x40) == 0 ? thumbnail0 : notice0.g;
        int v6 = (v5 & 0x80) == 0 ? v : notice0.h;
        int v7 = (v5 & 0x100) == 0 ? v1 : notice0.i;
        long v8 = (v5 & 0x200) == 0 ? v2 : notice0.j;
        String s8 = (v5 & 0x400) == 0 ? s3 : notice0.k;
        long v9 = (v5 & 0x800) == 0 ? v3 : notice0.l;
        long v10 = (v5 & 0x1000) == 0 ? v4 : notice0.m;
        return (v5 & 0x2000) == 0 ? notice0.copy(s5, s6, s7, entryVisibilityType1, entryScheduleStatusType1, entryRestrictType1, thumbnail1, v6, v7, v8, s8, v9, v10, s4) : notice0.copy(s5, s6, s7, entryVisibilityType1, entryScheduleStatusType1, entryRestrictType1, thumbnail1, v6, v7, v8, s8, v9, v10, notice0.n);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Notice)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((Notice)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((Notice)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((Notice)object0).c)) {
            return false;
        }
        if(this.d != ((Notice)object0).d) {
            return false;
        }
        if(this.e != ((Notice)object0).e) {
            return false;
        }
        if(this.f != ((Notice)object0).f) {
            return false;
        }
        if(!Intrinsics.areEqual(this.g, ((Notice)object0).g)) {
            return false;
        }
        if(this.h != ((Notice)object0).h) {
            return false;
        }
        if(this.i != ((Notice)object0).i) {
            return false;
        }
        if(this.j != ((Notice)object0).j) {
            return false;
        }
        if(!Intrinsics.areEqual(this.k, ((Notice)object0).k)) {
            return false;
        }
        if(this.l != ((Notice)object0).l) {
            return false;
        }
        return this.m == ((Notice)object0).m ? Intrinsics.areEqual(this.n, ((Notice)object0).n) : false;
    }

    public final long getAuthor() {
        return this.l;
    }

    @NotNull
    public final String getBlogName() {
        return this.k;
    }

    public final int getCommentCount() {
        return this.i;
    }

    public final long getId() {
        return this.j;
    }

    public final int getLikeCount() {
        return this.h;
    }

    public final long getOwner() {
        return this.m;
    }

    @NotNull
    public final String getPermalink() {
        return this.n;
    }

    @NotNull
    public final String getPublished() {
        return this.c;
    }

    @Nullable
    public final EntryRestrictType getRestrictType() {
        return this.f;
    }

    @NotNull
    public final EntryScheduleStatusType getScheduleStatus() {
        return this.e;
    }

    @NotNull
    public final String getSummary() {
        return this.b;
    }

    @Nullable
    public final Thumbnail getThumbnail() {
        return this.g;
    }

    @NotNull
    public final String getTitle() {
        return this.a;
    }

    @NotNull
    public final EntryVisibilityType getVisibility() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = b.a(this.c, b.a(this.b, this.a.hashCode() * 0x1F, 0x1F), 0x1F);
        int v1 = this.d.hashCode();
        int v2 = this.e.hashCode();
        int v3 = 0;
        int v4 = this.f == null ? 0 : this.f.hashCode();
        Thumbnail thumbnail0 = this.g;
        if(thumbnail0 != null) {
            v3 = thumbnail0.hashCode();
        }
        return this.n.hashCode() + a.k(this.m, a.k(this.l, b.a(this.k, a.k(this.j, com.kakao.tistory.domain.blog.entity.a.a(this.i, com.kakao.tistory.domain.blog.entity.a.a(this.h, (((v2 + (v1 + v) * 0x1F) * 0x1F + v4) * 0x1F + v3) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = a5.b.w("Notice(title=", this.a, ", summary=", this.b, ", published=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", visibility=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", scheduleStatus=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", restrictType=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", thumbnail=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", likeCount=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", commentCount=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", id=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", blogName=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", author=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", owner=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", permalink=");
        return r0.a.o(stringBuilder0, this.n, ")");
    }

    @JvmStatic
    public static final void write$Self$domain_release(Notice notice0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        KSerializer[] arr_kSerializer = Notice.o;
        compositeEncoder0.encodeStringElement(serialDescriptor0, 0, notice0.a);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 1, notice0.b);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 2, notice0.c);
        compositeEncoder0.encodeSerializableElement(serialDescriptor0, 3, arr_kSerializer[3], notice0.d);
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || notice0.e != EntryScheduleStatusType.NOT_SCHEDULED) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 4, arr_kSerializer[4], notice0.e);
        }
        compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 5, arr_kSerializer[5], notice0.f);
        compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 6, com.kakao.tistory.domain.common.Thumbnail..serializer.INSTANCE, notice0.g);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 7, notice0.h);
        compositeEncoder0.encodeIntElement(serialDescriptor0, 8, notice0.i);
        compositeEncoder0.encodeLongElement(serialDescriptor0, 9, notice0.j);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 10, notice0.k);
        compositeEncoder0.encodeLongElement(serialDescriptor0, 11, notice0.l);
        compositeEncoder0.encodeLongElement(serialDescriptor0, 12, notice0.m);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 13, notice0.n);
    }
}

