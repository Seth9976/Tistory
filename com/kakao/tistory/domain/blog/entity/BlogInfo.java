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

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bX\b\u0087\b\u0018\u0000 \u0080\u00012\u00020\u0001:\u0004\u0081\u0001\u0080\u0001B\u00CD\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0004\u0012\b\b\u0002\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u000E\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001A\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u0012\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u0015\u0012\b\b\u0002\u0010\u0019\u001A\u00020\u0015\u0012\b\b\u0002\u0010\u001A\u001A\u00020\u0012\u0012\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u0012\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001E\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001F\u0010 B\u00D1\u0001\b\u0011\u0012\u0006\u0010!\u001A\u00020\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001A\u00020\u0002\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\b\u0010\r\u001A\u0004\u0018\u00010\f\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001A\u00020\u0012\u0012\u0006\u0010\u0014\u001A\u00020\u0012\u0012\u0006\u0010\u0016\u001A\u00020\u0015\u0012\u0006\u0010\u0017\u001A\u00020\u0012\u0012\u0006\u0010\u0018\u001A\u00020\u0015\u0012\u0006\u0010\u0019\u001A\u00020\u0015\u0012\u0006\u0010\u001A\u001A\u00020\u0012\u0012\b\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u0012\b\u0010\u001D\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u001E\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010#\u001A\u0004\u0018\u00010\"\u00A2\u0006\u0004\b\u001F\u0010$J(\u0010-\u001A\u00020*2\u0006\u0010%\u001A\u00020\u00002\u0006\u0010\'\u001A\u00020&2\u0006\u0010)\u001A\u00020(H\u00C1\u0001\u00A2\u0006\u0004\b+\u0010,J\u0010\u0010.\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b.\u0010/J\u0010\u00100\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b0\u00101J\u0010\u00102\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b2\u00101J\u0010\u00103\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b3\u00101J\u0010\u00104\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\b4\u00101J\u0010\u00105\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b5\u0010/J\u0010\u00106\u001A\u00020\nH\u00C6\u0003\u00A2\u0006\u0004\b6\u00107J\u0010\u00108\u001A\u00020\fH\u00C6\u0003\u00A2\u0006\u0004\b8\u00109J\u0010\u0010:\u001A\u00020\u000EH\u00C6\u0003\u00A2\u0006\u0004\b:\u0010;J\u0012\u0010<\u001A\u0004\u0018\u00010\u0010H\u00C6\u0003\u00A2\u0006\u0004\b<\u0010=J\u0010\u0010>\u001A\u00020\u0012H\u00C6\u0003\u00A2\u0006\u0004\b>\u0010?J\u0010\u0010@\u001A\u00020\u0012H\u00C6\u0003\u00A2\u0006\u0004\b@\u0010?J\u0010\u0010A\u001A\u00020\u0015H\u00C6\u0003\u00A2\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001A\u00020\u0012H\u00C6\u0003\u00A2\u0006\u0004\bC\u0010?J\u0010\u0010D\u001A\u00020\u0015H\u00C6\u0003\u00A2\u0006\u0004\bD\u0010BJ\u0010\u0010E\u001A\u00020\u0015H\u00C6\u0003\u00A2\u0006\u0004\bE\u0010BJ\u0010\u0010F\u001A\u00020\u0012H\u00C6\u0003\u00A2\u0006\u0004\bF\u0010?J\u0012\u0010G\u001A\u0004\u0018\u00010\u001BH\u00C6\u0003\u00A2\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\bI\u00101J\u0010\u0010J\u001A\u00020\u0004H\u00C6\u0003\u00A2\u0006\u0004\bJ\u00101J\u00DE\u0001\u0010K\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0006\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\b\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0014\u001A\u00020\u00122\b\b\u0002\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0017\u001A\u00020\u00122\b\b\u0002\u0010\u0018\u001A\u00020\u00152\b\b\u0002\u0010\u0019\u001A\u00020\u00152\b\b\u0002\u0010\u001A\u001A\u00020\u00122\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001E\u001A\u00020\u0004H\u00C6\u0001\u00A2\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001A\u00020\u0004H\u00D6\u0001\u00A2\u0006\u0004\bM\u00101J\u0010\u0010N\u001A\u00020\u0015H\u00D6\u0001\u00A2\u0006\u0004\bN\u0010BJ\u001A\u0010P\u001A\u00020\u00122\b\u0010O\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bR\u0010S\u001A\u0004\bT\u0010/R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\bW\u00101R\u0017\u0010\u0006\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bX\u0010V\u001A\u0004\bY\u00101R\u0017\u0010\u0007\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bZ\u0010V\u001A\u0004\b[\u00101R\u0017\u0010\b\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b\\\u0010V\u001A\u0004\b]\u00101R\u0017\u0010\t\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b^\u0010S\u001A\u0004\b_\u0010/R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b`\u0010a\u001A\u0004\bb\u00107R\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\bc\u0010d\u001A\u0004\be\u00109R\u0017\u0010\u000F\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bf\u0010g\u001A\u0004\bh\u0010;R\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00108\u0006\u00A2\u0006\f\n\u0004\bi\u0010j\u001A\u0004\bk\u0010=R\u0017\u0010\u0013\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\bl\u0010m\u001A\u0004\b\u0013\u0010?R\u0017\u0010\u0014\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\bn\u0010m\u001A\u0004\b\u0014\u0010?R\u0017\u0010\u0016\u001A\u00020\u00158\u0006\u00A2\u0006\f\n\u0004\bo\u0010p\u001A\u0004\bq\u0010BR\u0017\u0010\u0017\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\br\u0010m\u001A\u0004\bs\u0010?R\u0017\u0010\u0018\u001A\u00020\u00158\u0006\u00A2\u0006\f\n\u0004\bt\u0010p\u001A\u0004\bu\u0010BR\u0017\u0010\u0019\u001A\u00020\u00158\u0006\u00A2\u0006\f\n\u0004\bv\u0010p\u001A\u0004\bw\u0010BR\u0017\u0010\u001A\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\bx\u0010m\u001A\u0004\b\u001A\u0010?R\u0019\u0010\u001C\u001A\u0004\u0018\u00010\u001B8\u0006\u00A2\u0006\f\n\u0004\by\u0010z\u001A\u0004\b{\u0010HR\u0019\u0010\u001D\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b|\u0010V\u001A\u0004\b}\u00101R\u0017\u0010\u001E\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b~\u0010V\u001A\u0004\b\u007F\u00101\u00A8\u0006\u0082\u0001"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "", "", "id", "", "name", "defaultDomain", "title", "description", "userId", "Lcom/kakao/tistory/domain/blog/entity/BlogStatusType;", "status", "Lcom/kakao/tistory/domain/blog/entity/BlogProfileStatus;", "profileStatus", "Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "role", "Lcom/kakao/tistory/domain/blog/entity/StoryCreator;", "storyCreator", "", "isBlocked", "isBlocking", "", "guestbookCommentCount", "allowWriteOnGuestbook", "followerCount", "followingCount", "isFollowing", "Lcom/kakao/tistory/domain/blog/entity/LogoGradation;", "logoGradation", "logoImageUrl", "nickname", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/kakao/tistory/domain/blog/entity/BlogStatusType;Lcom/kakao/tistory/domain/blog/entity/BlogProfileStatus;Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;Lcom/kakao/tistory/domain/blog/entity/StoryCreator;ZZIZIIZLcom/kakao/tistory/domain/blog/entity/LogoGradation;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/kakao/tistory/domain/blog/entity/BlogStatusType;Lcom/kakao/tistory/domain/blog/entity/BlogProfileStatus;Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;Lcom/kakao/tistory/domain/blog/entity/StoryCreator;ZZIZIIZLcom/kakao/tistory/domain/blog/entity/LogoGradation;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$domain_release", "(Lcom/kakao/tistory/domain/blog/entity/BlogInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Lcom/kakao/tistory/domain/blog/entity/BlogStatusType;", "component8", "()Lcom/kakao/tistory/domain/blog/entity/BlogProfileStatus;", "component9", "()Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "component10", "()Lcom/kakao/tistory/domain/blog/entity/StoryCreator;", "component11", "()Z", "component12", "component13", "()I", "component14", "component15", "component16", "component17", "component18", "()Lcom/kakao/tistory/domain/blog/entity/LogoGradation;", "component19", "component20", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/kakao/tistory/domain/blog/entity/BlogStatusType;Lcom/kakao/tistory/domain/blog/entity/BlogProfileStatus;Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;Lcom/kakao/tistory/domain/blog/entity/StoryCreator;ZZIZIIZLcom/kakao/tistory/domain/blog/entity/LogoGradation;Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getId", "b", "Ljava/lang/String;", "getName", "c", "getDefaultDomain", "d", "getTitle", "e", "getDescription", "f", "getUserId", "g", "Lcom/kakao/tistory/domain/blog/entity/BlogStatusType;", "getStatus", "h", "Lcom/kakao/tistory/domain/blog/entity/BlogProfileStatus;", "getProfileStatus", "i", "Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "getRole", "j", "Lcom/kakao/tistory/domain/blog/entity/StoryCreator;", "getStoryCreator", "k", "Z", "l", "m", "I", "getGuestbookCommentCount", "n", "getAllowWriteOnGuestbook", "o", "getFollowerCount", "p", "getFollowingCount", "q", "r", "Lcom/kakao/tistory/domain/blog/entity/LogoGradation;", "getLogoGradation", "s", "getLogoImageUrl", "t", "getNickname", "Companion", "$serializer", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@Serializable
public final class BlogInfo {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0005\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000F\u001A\u00020\u000E2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0014\u001A\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/kakao/tistory/domain/blog/entity/BlogInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kakao/tistory/domain/blog/entity/BlogInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class .serializer implements GeneratedSerializer {
        @NotNull
        public static final .serializer INSTANCE;
        public static final PluginGeneratedSerialDescriptor a;

        static {
            .serializer blogInfo$$serializer0 = new .serializer();
            .serializer.INSTANCE = blogInfo$$serializer0;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor0 = new PluginGeneratedSerialDescriptor("com.kakao.tistory.domain.blog.entity.BlogInfo", blogInfo$$serializer0, 20);
            pluginGeneratedSerialDescriptor0.addElement("id", false);
            pluginGeneratedSerialDescriptor0.addElement("name", false);
            pluginGeneratedSerialDescriptor0.addElement("defaultDomain", false);
            pluginGeneratedSerialDescriptor0.addElement("title", true);
            pluginGeneratedSerialDescriptor0.addElement("description", true);
            pluginGeneratedSerialDescriptor0.addElement("userId", false);
            pluginGeneratedSerialDescriptor0.addElement("status", true);
            pluginGeneratedSerialDescriptor0.addElement("profileStatus", true);
            pluginGeneratedSerialDescriptor0.addElement("role", true);
            pluginGeneratedSerialDescriptor0.addElement("storyCreator", true);
            pluginGeneratedSerialDescriptor0.addElement("isBlocked", true);
            pluginGeneratedSerialDescriptor0.addElement("isBlocking", true);
            pluginGeneratedSerialDescriptor0.addElement("guestbookCommentCount", true);
            pluginGeneratedSerialDescriptor0.addElement("allowWriteOnGuestbook", true);
            pluginGeneratedSerialDescriptor0.addElement("followerCount", true);
            pluginGeneratedSerialDescriptor0.addElement("followingCount", true);
            pluginGeneratedSerialDescriptor0.addElement("isFollowing", true);
            pluginGeneratedSerialDescriptor0.addElement("logoGradation", true);
            pluginGeneratedSerialDescriptor0.addElement("logoImageUrl", true);
            pluginGeneratedSerialDescriptor0.addElement("nickname", true);
            .serializer.a = pluginGeneratedSerialDescriptor0;
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] childSerializers() {
            KSerializer[] arr_kSerializer = BlogInfo.u;
            KSerializer kSerializer0 = arr_kSerializer[6];
            KSerializer kSerializer1 = arr_kSerializer[7];
            KSerializer kSerializer2 = arr_kSerializer[8];
            KSerializer kSerializer3 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.blog.entity.StoryCreator..serializer.INSTANCE);
            KSerializer kSerializer4 = BuiltinSerializersKt.getNullable(com.kakao.tistory.domain.blog.entity.LogoGradation..serializer.INSTANCE);
            KSerializer kSerializer5 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
            return new KSerializer[]{LongSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, LongSerializer.INSTANCE, kSerializer0, kSerializer1, kSerializer2, kSerializer3, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, BooleanSerializer.INSTANCE, kSerializer4, kSerializer5, StringSerializer.INSTANCE};
        }

        @NotNull
        public BlogInfo deserialize(@NotNull Decoder decoder0) {
            int v18;
            long v10;
            LogoGradation logoGradation1;
            String s9;
            BlogRoleType blogRoleType1;
            int v9;
            int v8;
            boolean z7;
            boolean z6;
            long v7;
            int v6;
            boolean z5;
            boolean z4;
            int v5;
            String s8;
            StoryCreator storyCreator1;
            BlogStatusType blogStatusType1;
            String s7;
            String s6;
            BlogProfileStatus blogProfileStatus1;
            String s5;
            String s4;
            Intrinsics.checkNotNullParameter(decoder0, "decoder");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeDecoder compositeDecoder0 = decoder0.beginStructure(serialDescriptor0);
            KSerializer[] arr_kSerializer = BlogInfo.u;
            if(compositeDecoder0.decodeSequentially()) {
                long v = compositeDecoder0.decodeLongElement(serialDescriptor0, 0);
                String s = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                String s1 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                String s2 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                String s3 = compositeDecoder0.decodeStringElement(serialDescriptor0, 4);
                long v1 = compositeDecoder0.decodeLongElement(serialDescriptor0, 5);
                BlogStatusType blogStatusType0 = (BlogStatusType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], null);
                BlogProfileStatus blogProfileStatus0 = (BlogProfileStatus)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 7, arr_kSerializer[7], null);
                BlogRoleType blogRoleType0 = (BlogRoleType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 8, arr_kSerializer[8], null);
                StoryCreator storyCreator0 = (StoryCreator)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 9, com.kakao.tistory.domain.blog.entity.StoryCreator..serializer.INSTANCE, null);
                boolean z = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 10);
                boolean z1 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 11);
                int v2 = compositeDecoder0.decodeIntElement(serialDescriptor0, 12);
                boolean z2 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 13);
                int v3 = compositeDecoder0.decodeIntElement(serialDescriptor0, 14);
                int v4 = compositeDecoder0.decodeIntElement(serialDescriptor0, 15);
                boolean z3 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 16);
                LogoGradation logoGradation0 = (LogoGradation)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 17, com.kakao.tistory.domain.blog.entity.LogoGradation..serializer.INSTANCE, null);
                s4 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 18, StringSerializer.INSTANCE, null);
                s5 = compositeDecoder0.decodeStringElement(serialDescriptor0, 19);
                blogProfileStatus1 = blogProfileStatus0;
                s6 = s3;
                s7 = s1;
                blogStatusType1 = blogStatusType0;
                storyCreator1 = storyCreator0;
                s8 = s2;
                v5 = 0xFFFFF;
                z4 = z2;
                z5 = z1;
                v6 = v2;
                v7 = v1;
                z6 = z;
                z7 = z3;
                v8 = v4;
                v9 = v3;
                blogRoleType1 = blogRoleType0;
                s9 = s;
                logoGradation1 = logoGradation0;
                v10 = v;
            }
            else {
                int v11 = 0;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                int v12 = 0;
                LogoGradation logoGradation2 = null;
                BlogRoleType blogRoleType2 = null;
                BlogProfileStatus blogProfileStatus2 = null;
                String s10 = null;
                StoryCreator storyCreator2 = null;
                String s11 = null;
                String s12 = null;
                String s13 = null;
                String s14 = null;
                String s15 = null;
                long v13 = 0L;
                long v14 = 0L;
                boolean z11 = false;
                int v15 = 0;
                BlogStatusType blogStatusType2 = null;
                int v16 = 0;
                boolean z12 = true;
                while(z12) {
                    int v17 = compositeDecoder0.decodeElementIndex(serialDescriptor0);
                    switch(v17) {
                        case -1: {
                            z12 = false;
                            continue;
                        }
                        case 0: {
                            v14 = compositeDecoder0.decodeLongElement(serialDescriptor0, 0);
                            v18 = 1;
                            break;
                        }
                        case 1: {
                            s11 = compositeDecoder0.decodeStringElement(serialDescriptor0, 1);
                            v18 = 2;
                            break;
                        }
                        case 2: {
                            s12 = compositeDecoder0.decodeStringElement(serialDescriptor0, 2);
                            v18 = 4;
                            break;
                        }
                        case 3: {
                            s13 = compositeDecoder0.decodeStringElement(serialDescriptor0, 3);
                            v18 = 8;
                            break;
                        }
                        case 4: {
                            s14 = compositeDecoder0.decodeStringElement(serialDescriptor0, 4);
                            v18 = 16;
                            break;
                        }
                        case 5: {
                            v13 = compositeDecoder0.decodeLongElement(serialDescriptor0, 5);
                            v18 = 0x20;
                            break;
                        }
                        case 6: {
                            blogStatusType2 = (BlogStatusType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], blogStatusType2);
                            v18 = 0x40;
                            break;
                        }
                        case 7: {
                            v18 = 0x80;
                            blogProfileStatus2 = (BlogProfileStatus)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 7, arr_kSerializer[7], blogProfileStatus2);
                            break;
                        }
                        case 8: {
                            v18 = 0x100;
                            blogRoleType2 = (BlogRoleType)compositeDecoder0.decodeSerializableElement(serialDescriptor0, 8, arr_kSerializer[8], blogRoleType2);
                            break;
                        }
                        case 9: {
                            v18 = 0x200;
                            storyCreator2 = (StoryCreator)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 9, com.kakao.tistory.domain.blog.entity.StoryCreator..serializer.INSTANCE, storyCreator2);
                            break;
                        }
                        case 10: {
                            z8 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 10);
                            v18 = 0x400;
                            break;
                        }
                        case 11: {
                            z10 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 11);
                            v18 = 0x800;
                            break;
                        }
                        case 12: {
                            v12 = compositeDecoder0.decodeIntElement(serialDescriptor0, 12);
                            v18 = 0x1000;
                            break;
                        }
                        case 13: {
                            z9 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 13);
                            v18 = 0x2000;
                            break;
                        }
                        case 14: {
                            v18 = 0x4000;
                            v16 = compositeDecoder0.decodeIntElement(serialDescriptor0, 14);
                            break;
                        }
                        case 15: {
                            v18 = 0x8000;
                            v11 = compositeDecoder0.decodeIntElement(serialDescriptor0, 15);
                            break;
                        }
                        case 16: {
                            z11 = compositeDecoder0.decodeBooleanElement(serialDescriptor0, 16);
                            v18 = 0x10000;
                            break;
                        }
                        case 17: {
                            logoGradation2 = (LogoGradation)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 17, com.kakao.tistory.domain.blog.entity.LogoGradation..serializer.INSTANCE, logoGradation2);
                            v18 = 0x20000;
                            break;
                        }
                        case 18: {
                            v18 = 0x40000;
                            s10 = (String)compositeDecoder0.decodeNullableSerializableElement(serialDescriptor0, 18, StringSerializer.INSTANCE, s10);
                            break;
                        }
                        case 19: {
                            s15 = compositeDecoder0.decodeStringElement(serialDescriptor0, 19);
                            v18 = 0x80000;
                            break;
                        }
                        default: {
                            throw new UnknownFieldException(v17);
                        }
                    }
                    v15 |= v18;
                }
                blogStatusType1 = blogStatusType2;
                logoGradation1 = logoGradation2;
                blogRoleType1 = blogRoleType2;
                blogProfileStatus1 = blogProfileStatus2;
                v9 = v16;
                v8 = v11;
                s4 = s10;
                storyCreator1 = storyCreator2;
                z7 = z11;
                v5 = v15;
                z6 = z8;
                s9 = s11;
                s7 = s12;
                s8 = s13;
                s6 = s14;
                z4 = z9;
                s5 = s15;
                z5 = z10;
                v6 = v12;
                v7 = v13;
                v10 = v14;
            }
            compositeDecoder0.endStructure(serialDescriptor0);
            return new BlogInfo(v5, v10, s9, s7, s8, s6, v7, blogStatusType1, blogProfileStatus1, blogRoleType1, storyCreator1, z6, z5, v6, z4, v9, v8, z7, logoGradation1, s4, s5, null);
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

        public void serialize(@NotNull Encoder encoder0, @NotNull BlogInfo blogInfo0) {
            Intrinsics.checkNotNullParameter(encoder0, "encoder");
            Intrinsics.checkNotNullParameter(blogInfo0, "value");
            SerialDescriptor serialDescriptor0 = this.getDescriptor();
            CompositeEncoder compositeEncoder0 = encoder0.beginStructure(serialDescriptor0);
            BlogInfo.write$Self$domain_release(blogInfo0, compositeEncoder0, serialDescriptor0);
            compositeEncoder0.endStructure(serialDescriptor0);
        }

        @Override  // kotlinx.serialization.SerializationStrategy
        public void serialize(Encoder encoder0, Object object0) {
            this.serialize(encoder0, ((BlogInfo)object0));
        }

        @Override  // kotlinx.serialization.internal.GeneratedSerializer
        @NotNull
        public KSerializer[] typeParametersSerializers() {
            return DefaultImpls.typeParametersSerializers(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/domain/blog/entity/BlogInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kakao/tistory/domain/blog/entity/BlogInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
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
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final BlogStatusType g;
    public final BlogProfileStatus h;
    public final BlogRoleType i;
    public final StoryCreator j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final int o;
    public final int p;
    public final boolean q;
    public final LogoGradation r;
    public final String s;
    public final String t;
    public static final KSerializer[] u;

    static {
        BlogInfo.Companion = new Companion(null);
        BlogInfo.u = new KSerializer[]{null, null, null, null, null, null, BlogStatusType.Companion.serializer(), BlogProfileStatus.Companion.serializer(), BlogRoleType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null};
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public BlogInfo(int v, long v1, String s, String s1, String s2, String s3, long v2, BlogStatusType blogStatusType0, BlogProfileStatus blogProfileStatus0, BlogRoleType blogRoleType0, StoryCreator storyCreator0, boolean z, boolean z1, int v3, boolean z2, int v4, int v5, boolean z3, LogoGradation logoGradation0, String s4, String s5, SerializationConstructorMarker serializationConstructorMarker0) {
        if(39 != (v & 39)) {
            PluginExceptionsKt.throwMissingFieldException(v, 39, .serializer.INSTANCE.getDescriptor());
        }
        super();
        this.a = v1;
        this.b = s;
        this.c = s1;
        this.d = (v & 8) == 0 ? "" : s2;
        this.e = (v & 16) == 0 ? "" : s3;
        this.f = v2;
        this.g = (v & 0x40) == 0 ? BlogStatusType.OPEN : blogStatusType0;
        this.h = (v & 0x80) == 0 ? BlogProfileStatus.NORMAL : blogProfileStatus0;
        this.i = (v & 0x100) == 0 ? BlogRoleType.GUEST : blogRoleType0;
        this.j = (v & 0x200) == 0 ? null : storyCreator0;
        this.k = (v & 0x400) == 0 ? false : z;
        this.l = (v & 0x800) == 0 ? false : z1;
        this.m = (v & 0x1000) == 0 ? 0 : v3;
        this.n = (v & 0x2000) == 0 ? false : z2;
        this.o = (v & 0x4000) == 0 ? 0 : v4;
        this.p = (0x8000 & v) == 0 ? 0 : v5;
        this.q = (0x10000 & v) == 0 ? false : z3;
        this.r = (0x20000 & v) == 0 ? new LogoGradation("#000000", "#000000") : logoGradation0;
        this.s = (0x40000 & v) == 0 ? null : s4;
        if((v & 0x80000) == 0) {
            this.t = "";
            return;
        }
        this.t = s5;
    }

    public BlogInfo(long v, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, long v1, @NotNull BlogStatusType blogStatusType0, @NotNull BlogProfileStatus blogProfileStatus0, @NotNull BlogRoleType blogRoleType0, @Nullable StoryCreator storyCreator0, boolean z, boolean z1, int v2, boolean z2, int v3, int v4, boolean z3, @Nullable LogoGradation logoGradation0, @Nullable String s4, @NotNull String s5) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "defaultDomain");
        Intrinsics.checkNotNullParameter(s2, "title");
        Intrinsics.checkNotNullParameter(s3, "description");
        Intrinsics.checkNotNullParameter(blogStatusType0, "status");
        Intrinsics.checkNotNullParameter(blogProfileStatus0, "profileStatus");
        Intrinsics.checkNotNullParameter(blogRoleType0, "role");
        Intrinsics.checkNotNullParameter(s5, "nickname");
        super();
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = s3;
        this.f = v1;
        this.g = blogStatusType0;
        this.h = blogProfileStatus0;
        this.i = blogRoleType0;
        this.j = storyCreator0;
        this.k = z;
        this.l = z1;
        this.m = v2;
        this.n = z2;
        this.o = v3;
        this.p = v4;
        this.q = z3;
        this.r = logoGradation0;
        this.s = s4;
        this.t = s5;
    }

    public BlogInfo(long v, String s, String s1, String s2, String s3, long v1, BlogStatusType blogStatusType0, BlogProfileStatus blogProfileStatus0, BlogRoleType blogRoleType0, StoryCreator storyCreator0, boolean z, boolean z1, int v2, boolean z2, int v3, int v4, boolean z3, LogoGradation logoGradation0, String s4, String s5, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        LogoGradation logoGradation1 = (0x20000 & v5) == 0 ? logoGradation0 : new LogoGradation("#000000", "#000000");
        this(v, s, s1, ((v5 & 8) == 0 ? s2 : ""), ((v5 & 16) == 0 ? s3 : ""), v1, ((v5 & 0x40) == 0 ? blogStatusType0 : BlogStatusType.OPEN), ((v5 & 0x80) == 0 ? blogProfileStatus0 : BlogProfileStatus.NORMAL), ((v5 & 0x100) == 0 ? blogRoleType0 : BlogRoleType.GUEST), ((v5 & 0x200) == 0 ? storyCreator0 : null), ((v5 & 0x400) == 0 ? z : false), ((v5 & 0x800) == 0 ? z1 : false), ((v5 & 0x1000) == 0 ? v2 : 0), ((v5 & 0x2000) == 0 ? z2 : false), ((v5 & 0x4000) == 0 ? v3 : 0), ((0x8000 & v5) == 0 ? v4 : 0), ((0x10000 & v5) == 0 ? z3 : false), logoGradation1, ((0x40000 & v5) == 0 ? s4 : null), ((v5 & 0x80000) == 0 ? s5 : ""));
    }

    public final long component1() {
        return this.a;
    }

    @Nullable
    public final StoryCreator component10() {
        return this.j;
    }

    public final boolean component11() {
        return this.k;
    }

    public final boolean component12() {
        return this.l;
    }

    public final int component13() {
        return this.m;
    }

    public final boolean component14() {
        return this.n;
    }

    public final int component15() {
        return this.o;
    }

    public final int component16() {
        return this.p;
    }

    public final boolean component17() {
        return this.q;
    }

    @Nullable
    public final LogoGradation component18() {
        return this.r;
    }

    @Nullable
    public final String component19() {
        return this.s;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final String component20() {
        return this.t;
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

    public final long component6() {
        return this.f;
    }

    @NotNull
    public final BlogStatusType component7() {
        return this.g;
    }

    @NotNull
    public final BlogProfileStatus component8() {
        return this.h;
    }

    @NotNull
    public final BlogRoleType component9() {
        return this.i;
    }

    @NotNull
    public final BlogInfo copy(long v, @NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, long v1, @NotNull BlogStatusType blogStatusType0, @NotNull BlogProfileStatus blogProfileStatus0, @NotNull BlogRoleType blogRoleType0, @Nullable StoryCreator storyCreator0, boolean z, boolean z1, int v2, boolean z2, int v3, int v4, boolean z3, @Nullable LogoGradation logoGradation0, @Nullable String s4, @NotNull String s5) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(s1, "defaultDomain");
        Intrinsics.checkNotNullParameter(s2, "title");
        Intrinsics.checkNotNullParameter(s3, "description");
        Intrinsics.checkNotNullParameter(blogStatusType0, "status");
        Intrinsics.checkNotNullParameter(blogProfileStatus0, "profileStatus");
        Intrinsics.checkNotNullParameter(blogRoleType0, "role");
        Intrinsics.checkNotNullParameter(s5, "nickname");
        return new BlogInfo(v, s, s1, s2, s3, v1, blogStatusType0, blogProfileStatus0, blogRoleType0, storyCreator0, z, z1, v2, z2, v3, v4, z3, logoGradation0, s4, s5);
    }

    public static BlogInfo copy$default(BlogInfo blogInfo0, long v, String s, String s1, String s2, String s3, long v1, BlogStatusType blogStatusType0, BlogProfileStatus blogProfileStatus0, BlogRoleType blogRoleType0, StoryCreator storyCreator0, boolean z, boolean z1, int v2, boolean z2, int v3, int v4, boolean z3, LogoGradation logoGradation0, String s4, String s5, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : blogInfo0.a;
        String s6 = (v5 & 2) == 0 ? s : blogInfo0.b;
        String s7 = (v5 & 4) == 0 ? s1 : blogInfo0.c;
        String s8 = (v5 & 8) == 0 ? s2 : blogInfo0.d;
        String s9 = (v5 & 16) == 0 ? s3 : blogInfo0.e;
        long v7 = (v5 & 0x20) == 0 ? v1 : blogInfo0.f;
        BlogStatusType blogStatusType1 = (v5 & 0x40) == 0 ? blogStatusType0 : blogInfo0.g;
        BlogProfileStatus blogProfileStatus1 = (v5 & 0x80) == 0 ? blogProfileStatus0 : blogInfo0.h;
        BlogRoleType blogRoleType1 = (v5 & 0x100) == 0 ? blogRoleType0 : blogInfo0.i;
        StoryCreator storyCreator1 = (v5 & 0x200) == 0 ? storyCreator0 : blogInfo0.j;
        boolean z4 = (v5 & 0x400) == 0 ? z : blogInfo0.k;
        boolean z5 = (v5 & 0x800) == 0 ? z1 : blogInfo0.l;
        int v8 = (v5 & 0x1000) == 0 ? v2 : blogInfo0.m;
        boolean z6 = (v5 & 0x2000) == 0 ? z2 : blogInfo0.n;
        int v9 = (v5 & 0x4000) == 0 ? v3 : blogInfo0.o;
        int v10 = (v5 & 0x8000) == 0 ? v4 : blogInfo0.p;
        boolean z7 = (v5 & 0x10000) == 0 ? z3 : blogInfo0.q;
        LogoGradation logoGradation1 = (v5 & 0x20000) == 0 ? logoGradation0 : blogInfo0.r;
        String s10 = (v5 & 0x40000) == 0 ? s4 : blogInfo0.s;
        return (v5 & 0x80000) == 0 ? blogInfo0.copy(v6, s6, s7, s8, s9, v7, blogStatusType1, blogProfileStatus1, blogRoleType1, storyCreator1, z4, z5, v8, z6, v9, v10, z7, logoGradation1, s10, s5) : blogInfo0.copy(v6, s6, s7, s8, s9, v7, blogStatusType1, blogProfileStatus1, blogRoleType1, storyCreator1, z4, z5, v8, z6, v9, v10, z7, logoGradation1, s10, blogInfo0.t);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BlogInfo)) {
            return false;
        }
        BlogInfo blogInfo0 = (BlogInfo)object0;
        if(this.a != blogInfo0.a) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, blogInfo0.b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, blogInfo0.c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, blogInfo0.d)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.e, blogInfo0.e)) {
            return false;
        }
        if(this.f != blogInfo0.f) {
            return false;
        }
        if(this.g != blogInfo0.g) {
            return false;
        }
        if(this.h != blogInfo0.h) {
            return false;
        }
        if(this.i != blogInfo0.i) {
            return false;
        }
        if(!Intrinsics.areEqual(this.j, blogInfo0.j)) {
            return false;
        }
        if(this.k != blogInfo0.k) {
            return false;
        }
        if(this.l != blogInfo0.l) {
            return false;
        }
        if(this.m != blogInfo0.m) {
            return false;
        }
        if(this.n != blogInfo0.n) {
            return false;
        }
        if(this.o != blogInfo0.o) {
            return false;
        }
        if(this.p != blogInfo0.p) {
            return false;
        }
        if(this.q != blogInfo0.q) {
            return false;
        }
        if(!Intrinsics.areEqual(this.r, blogInfo0.r)) {
            return false;
        }
        return Intrinsics.areEqual(this.s, blogInfo0.s) ? Intrinsics.areEqual(this.t, blogInfo0.t) : false;
    }

    public final boolean getAllowWriteOnGuestbook() {
        return this.n;
    }

    @NotNull
    public final String getDefaultDomain() {
        return this.c;
    }

    @NotNull
    public final String getDescription() {
        return this.e;
    }

    public final int getFollowerCount() {
        return this.o;
    }

    public final int getFollowingCount() {
        return this.p;
    }

    public final int getGuestbookCommentCount() {
        return this.m;
    }

    public final long getId() {
        return this.a;
    }

    @Nullable
    public final LogoGradation getLogoGradation() {
        return this.r;
    }

    @Nullable
    public final String getLogoImageUrl() {
        return this.s;
    }

    @NotNull
    public final String getName() {
        return this.b;
    }

    @NotNull
    public final String getNickname() {
        return this.t;
    }

    @NotNull
    public final BlogProfileStatus getProfileStatus() {
        return this.h;
    }

    @NotNull
    public final BlogRoleType getRole() {
        return this.i;
    }

    @NotNull
    public final BlogStatusType getStatus() {
        return this.g;
    }

    @Nullable
    public final StoryCreator getStoryCreator() {
        return this.j;
    }

    @NotNull
    public final String getTitle() {
        return this.d;
    }

    public final long getUserId() {
        return this.f;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = c.a(this.q, a.a(this.p, a.a(this.o, c.a(this.n, a.a(this.m, c.a(this.l, c.a(this.k, ((this.i.hashCode() + (this.h.hashCode() + (this.g.hashCode() + wb.a.k(this.f, b.a(this.e, b.a(this.d, b.a(this.c, b.a(this.b, Long.hashCode(this.a) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F)) * 0x1F) * 0x1F) * 0x1F + (this.j == null ? 0 : this.j.hashCode())) * 0x1F, 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F), 0x1F);
        int v2 = this.r == null ? 0 : this.r.hashCode();
        String s = this.s;
        if(s != null) {
            v = s.hashCode();
        }
        return this.t.hashCode() + ((v1 + v2) * 0x1F + v) * 0x1F;
    }

    public final boolean isBlocked() {
        return this.k;
    }

    public final boolean isBlocking() {
        return this.l;
    }

    public final boolean isFollowing() {
        return this.q;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BlogInfo(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", name=");
        stringBuilder0.append(this.b);
        androidx.room.a.w(stringBuilder0, ", defaultDomain=", this.c, ", title=", this.d);
        stringBuilder0.append(", description=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", userId=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", status=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", profileStatus=");
        stringBuilder0.append(this.h);
        stringBuilder0.append(", role=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", storyCreator=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", isBlocked=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", isBlocking=");
        stringBuilder0.append(this.l);
        stringBuilder0.append(", guestbookCommentCount=");
        stringBuilder0.append(this.m);
        stringBuilder0.append(", allowWriteOnGuestbook=");
        stringBuilder0.append(this.n);
        stringBuilder0.append(", followerCount=");
        stringBuilder0.append(this.o);
        stringBuilder0.append(", followingCount=");
        stringBuilder0.append(this.p);
        stringBuilder0.append(", isFollowing=");
        stringBuilder0.append(this.q);
        stringBuilder0.append(", logoGradation=");
        stringBuilder0.append(this.r);
        stringBuilder0.append(", logoImageUrl=");
        stringBuilder0.append(this.s);
        return a5.b.q(stringBuilder0, ", nickname=", this.t, ")");
    }

    @JvmStatic
    public static final void write$Self$domain_release(BlogInfo blogInfo0, CompositeEncoder compositeEncoder0, SerialDescriptor serialDescriptor0) {
        KSerializer[] arr_kSerializer = BlogInfo.u;
        compositeEncoder0.encodeLongElement(serialDescriptor0, 0, blogInfo0.a);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 1, blogInfo0.b);
        compositeEncoder0.encodeStringElement(serialDescriptor0, 2, blogInfo0.c);
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 3) || !Intrinsics.areEqual(blogInfo0.d, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 3, blogInfo0.d);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 4) || !Intrinsics.areEqual(blogInfo0.e, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 4, blogInfo0.e);
        }
        compositeEncoder0.encodeLongElement(serialDescriptor0, 5, blogInfo0.f);
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 6) || blogInfo0.g != BlogStatusType.OPEN) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 6, arr_kSerializer[6], blogInfo0.g);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 7) || blogInfo0.h != BlogProfileStatus.NORMAL) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 7, arr_kSerializer[7], blogInfo0.h);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 8) || blogInfo0.i != BlogRoleType.GUEST) {
            compositeEncoder0.encodeSerializableElement(serialDescriptor0, 8, arr_kSerializer[8], blogInfo0.i);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 9) || blogInfo0.j != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 9, com.kakao.tistory.domain.blog.entity.StoryCreator..serializer.INSTANCE, blogInfo0.j);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 10) || blogInfo0.k) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 10, blogInfo0.k);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 11) || blogInfo0.l) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 11, blogInfo0.l);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 12) || blogInfo0.m != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 12, blogInfo0.m);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 13) || blogInfo0.n) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 13, blogInfo0.n);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 14) || blogInfo0.o != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 14, blogInfo0.o);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 15) || blogInfo0.p != 0) {
            compositeEncoder0.encodeIntElement(serialDescriptor0, 15, blogInfo0.p);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 16) || blogInfo0.q) {
            compositeEncoder0.encodeBooleanElement(serialDescriptor0, 16, blogInfo0.q);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 17)) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 17, com.kakao.tistory.domain.blog.entity.LogoGradation..serializer.INSTANCE, blogInfo0.r);
        }
        else {
            LogoGradation logoGradation0 = new LogoGradation("#000000", "#000000");
            if(!Intrinsics.areEqual(blogInfo0.r, logoGradation0)) {
                compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 17, com.kakao.tistory.domain.blog.entity.LogoGradation..serializer.INSTANCE, blogInfo0.r);
            }
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 18) || blogInfo0.s != null) {
            compositeEncoder0.encodeNullableSerializableElement(serialDescriptor0, 18, StringSerializer.INSTANCE, blogInfo0.s);
        }
        if(compositeEncoder0.shouldEncodeElementDefault(serialDescriptor0, 19) || !Intrinsics.areEqual(blogInfo0.t, "")) {
            compositeEncoder0.encodeStringElement(serialDescriptor0, 19, blogInfo0.t);
        }
    }
}

