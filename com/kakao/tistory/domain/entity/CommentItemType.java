package com.kakao.tistory.domain.entity;

import a5.b;
import com.kakao.tistory.domain.blog.entity.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/domain/entity/CommentItemType;", "", "()V", "CommentHeader", "CommentItem", "CommentReplyItem", "CommentReplyMoreItem", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentHeader;", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentReplyItem;", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentReplyMoreItem;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CommentItemType {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/kakao/tistory/domain/entity/CommentItemType$CommentHeader;", "Lcom/kakao/tistory/domain/entity/CommentItemType;", "()V", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CommentHeader extends CommentItemType {
        @NotNull
        public static final CommentHeader INSTANCE;

        static {
            CommentHeader.INSTANCE = new CommentHeader();
        }

        private CommentHeader() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002hiB\u00EB\u0001\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001A\u00020\b\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001A\u00020\u000E\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u000E\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u000E\u0012\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0018\u001A\u00020\u0019\u0012\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001B\u001A\u00020\u001C\u00A2\u0006\u0002\u0010\u001DJ\t\u0010L\u001A\u00020\u0003H\u00C6\u0003J\t\u0010M\u001A\u00020\u000EH\u00C6\u0003J\u000B\u0010N\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010O\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u0011\u0010P\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013H\u00C6\u0003J\t\u0010Q\u001A\u00020\u000EH\u00C6\u0003J\u000B\u0010R\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u0010\u0010S\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u00104J\u0010\u0010T\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u00104J\t\u0010U\u001A\u00020\u0019H\u00C6\u0003J\u0010\u0010V\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u00104J\u0010\u0010W\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u00104J\t\u0010X\u001A\u00020\u001CH\u00C6\u0003J\u000B\u0010Y\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\t\u0010Z\u001A\u00020\bH\u00C6\u0003J\u000B\u0010[\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010\\\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u000B\u0010]\u001A\u0004\u0018\u00010\u0006H\u00C6\u0003J\u0010\u0010^\u001A\u0004\u0018\u00010\u0003H\u00C6\u0003\u00A2\u0006\u0002\u00104J\t\u0010_\u001A\u00020\u000EH\u00C6\u0003J\u00F6\u0001\u0010`\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001A\u00020\b2\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u000E2\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001A\u00020\u00192\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001B\u001A\u00020\u001CH\u00C6\u0001\u00A2\u0006\u0002\u0010aJ\u0013\u0010b\u001A\u00020\u000E2\b\u0010c\u001A\u0004\u0018\u00010dH\u00D6\u0003J\t\u0010e\u001A\u00020fH\u00D6\u0001J\t\u0010g\u001A\u00020\u0006H\u00D6\u0001R\"\u0010\u0012\u001A\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R\u001C\u0010\u000B\u001A\u0004\u0018\u00010\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001C\u0010\t\u001A\u0004\u0018\u00010\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b&\u0010#\"\u0004\b\'\u0010%R\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010,\u001A\u00020\u000E8F\u00A2\u0006\u0006\u001A\u0004\b,\u0010-R\u001A\u0010\u0014\u001A\u00020\u000EX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010-\"\u0004\b.\u0010/R\u001A\u0010\u000F\u001A\u00020\u000EX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010-\"\u0004\b0\u0010/R\u001A\u0010\r\u001A\u00020\u000EX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010-\"\u0004\b1\u0010/R\u0011\u00102\u001A\u00020\u000E8F\u00A2\u0006\u0006\u001A\u0004\b2\u0010-R\u0015\u0010\u0016\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u00105\u001A\u0004\b3\u00104R\u0013\u0010\u0015\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b6\u0010#R\u0015\u0010\u001A\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u00105\u001A\u0004\b7\u00104R\u001E\u0010\f\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u0010\n\u0002\u00105\u001A\u0004\b8\u00104\"\u0004\b9\u0010:R\u001C\u0010\u0010\u001A\u0004\u0018\u00010\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b;\u0010#\"\u0004\b<\u0010%R\u001C\u0010\n\u001A\u0004\u0018\u00010\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b=\u0010#\"\u0004\b>\u0010%R\u0015\u0010\u0017\u001A\u0004\u0018\u00010\u0003\u00A2\u0006\n\n\u0002\u00105\u001A\u0004\b?\u00104R\u0011\u0010\u001B\u001A\u00020\u001C\u00A2\u0006\b\n\u0000\u001A\u0004\b@\u0010AR\u0011\u0010\u0018\u001A\u00020\u0019\u00A2\u0006\b\n\u0000\u001A\u0004\bB\u0010CR\u001E\u0010\u0004\u001A\u0004\u0018\u00010\u0003X\u0086\u000E\u00A2\u0006\u0010\n\u0002\u00105\u001A\u0004\bD\u00104\"\u0004\bE\u0010:R\u0011\u0010\u0007\u001A\u00020\b\u00A2\u0006\b\n\u0000\u001A\u0004\bF\u0010GR\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bH\u0010#\"\u0004\bI\u0010%R\u001C\u0010\u0011\u001A\u0004\u0018\u00010\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bJ\u0010#\"\u0004\bK\u0010%\u00A8\u0006j"}, d2 = {"Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "Lcom/kakao/tistory/domain/entity/CommentItemType;", "id", "", "userId", "writerName", "", "writer", "Lcom/kakao/tistory/domain/entity/WriterData;", "defaultBlogName", "profileImageUrl", "content", "parent", "isSecret", "", "isRestrict", "permalink", "written", "children", "", "isPinned", "mentionUserName", "mentionId", "supportId", "type", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem$CommentType;", "orderAmount", "supportStatus", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem$SupportStatusType;", "(JLjava/lang/Long;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/WriterData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem$CommentType;Ljava/lang/Long;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem$SupportStatusType;)V", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getDefaultBlogName", "setDefaultBlogName", "getId", "()J", "setId", "(J)V", "isDeletedSupport", "()Z", "setPinned", "(Z)V", "setRestrict", "setSecret", "isSupport", "getMentionId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMentionUserName", "getOrderAmount", "getParent", "setParent", "(Ljava/lang/Long;)V", "getPermalink", "setPermalink", "getProfileImageUrl", "setProfileImageUrl", "getSupportId", "getSupportStatus", "()Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem$SupportStatusType;", "getType", "()Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem$CommentType;", "getUserId", "setUserId", "getWriter", "()Lcom/kakao/tistory/domain/entity/WriterData;", "getWriterName", "setWriterName", "getWritten", "setWritten", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/Long;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/WriterData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem$CommentType;Ljava/lang/Long;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem$SupportStatusType;)Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "equals", "other", "", "hashCode", "", "toString", "CommentType", "SupportStatusType", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CommentItem extends CommentItemType {
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem$CommentType;", "", "(Ljava/lang/String;I)V", "NORMAL", "SUPPORT", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static enum CommentType {
            NORMAL,
            SUPPORT;

            private static final EnumEntries $ENTRIES;
            private static final CommentType[] $VALUES;

            private static final CommentType[] $values() [...] // Inlined contents

            static {
                CommentType.$VALUES = arr_commentItemType$CommentItem$CommentType;
                Intrinsics.checkNotNullParameter(arr_commentItemType$CommentItem$CommentType, "entries");
                CommentType.$ENTRIES = new a(arr_commentItemType$CommentItem$CommentType);
            }

            @NotNull
            public static EnumEntries getEntries() {
                return CommentType.$ENTRIES;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem$SupportStatusType;", "", "(Ljava/lang/String;I)V", "PUBLIC", "DELETED", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static enum SupportStatusType {
            PUBLIC,
            DELETED;

            private static final EnumEntries $ENTRIES;
            private static final SupportStatusType[] $VALUES;

            private static final SupportStatusType[] $values() [...] // Inlined contents

            static {
                SupportStatusType.$VALUES = arr_commentItemType$CommentItem$SupportStatusType;
                Intrinsics.checkNotNullParameter(arr_commentItemType$CommentItem$SupportStatusType, "entries");
                SupportStatusType.$ENTRIES = new a(arr_commentItemType$CommentItem$SupportStatusType);
            }

            @NotNull
            public static EnumEntries getEntries() {
                return SupportStatusType.$ENTRIES;
            }
        }

        @Nullable
        private List children;
        @Nullable
        private String content;
        @Nullable
        private String defaultBlogName;
        private long id;
        private boolean isPinned;
        private boolean isRestrict;
        private boolean isSecret;
        @Nullable
        private final Long mentionId;
        @Nullable
        private final String mentionUserName;
        @Nullable
        private final Long orderAmount;
        @Nullable
        private Long parent;
        @Nullable
        private String permalink;
        @Nullable
        private String profileImageUrl;
        @Nullable
        private final Long supportId;
        @NotNull
        private final SupportStatusType supportStatus;
        @NotNull
        private final CommentType type;
        @Nullable
        private Long userId;
        @NotNull
        private final WriterData writer;
        @Nullable
        private String writerName;
        @Nullable
        private String written;

        public CommentItem(long v, @Nullable Long long0, @Nullable String s, @NotNull WriterData writerData0, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable Long long1, boolean z, boolean z1, @Nullable String s4, @Nullable String s5, @Nullable List list0, boolean z2, @Nullable String s6, @Nullable Long long2, @Nullable Long long3, @NotNull CommentType commentItemType$CommentItem$CommentType0, @Nullable Long long4, @NotNull SupportStatusType commentItemType$CommentItem$SupportStatusType0) {
            Intrinsics.checkNotNullParameter(writerData0, "writer");
            Intrinsics.checkNotNullParameter(commentItemType$CommentItem$CommentType0, "type");
            Intrinsics.checkNotNullParameter(commentItemType$CommentItem$SupportStatusType0, "supportStatus");
            super(null);
            this.id = v;
            this.userId = long0;
            this.writerName = s;
            this.writer = writerData0;
            this.defaultBlogName = s1;
            this.profileImageUrl = s2;
            this.content = s3;
            this.parent = long1;
            this.isSecret = z;
            this.isRestrict = z1;
            this.permalink = s4;
            this.written = s5;
            this.children = list0;
            this.isPinned = z2;
            this.mentionUserName = s6;
            this.mentionId = long2;
            this.supportId = long3;
            this.type = commentItemType$CommentItem$CommentType0;
            this.orderAmount = long4;
            this.supportStatus = commentItemType$CommentItem$SupportStatusType0;
        }

        public CommentItem(long v, Long long0, String s, WriterData writerData0, String s1, String s2, String s3, Long long1, boolean z, boolean z1, String s4, String s5, List list0, boolean z2, String s6, Long long2, Long long3, CommentType commentItemType$CommentItem$CommentType0, Long long4, SupportStatusType commentItemType$CommentItem$SupportStatusType0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(v, ((v1 & 2) == 0 ? long0 : null), ((v1 & 4) == 0 ? s : null), ((v1 & 8) == 0 ? writerData0 : new WriterData(0L, null, null, null, 15, null)), ((v1 & 16) == 0 ? s1 : null), ((v1 & 0x20) == 0 ? s2 : null), ((v1 & 0x40) == 0 ? s3 : null), ((v1 & 0x80) == 0 ? long1 : null), ((v1 & 0x100) == 0 ? z : false), ((v1 & 0x200) == 0 ? z1 : false), ((v1 & 0x400) == 0 ? s4 : null), ((v1 & 0x800) == 0 ? s5 : null), ((v1 & 0x1000) == 0 ? list0 : null), ((v1 & 0x2000) == 0 ? z2 : false), ((v1 & 0x4000) == 0 ? s6 : null), ((0x8000 & v1) == 0 ? long2 : null), ((0x10000 & v1) == 0 ? long3 : null), ((0x20000 & v1) == 0 ? commentItemType$CommentItem$CommentType0 : CommentType.NORMAL), ((0x40000 & v1) == 0 ? long4 : null), ((v1 & 0x80000) == 0 ? commentItemType$CommentItem$SupportStatusType0 : SupportStatusType.PUBLIC));
        }

        public final long component1() {
            return this.id;
        }

        public final boolean component10() {
            return this.isRestrict;
        }

        @Nullable
        public final String component11() {
            return this.permalink;
        }

        @Nullable
        public final String component12() {
            return this.written;
        }

        @Nullable
        public final List component13() {
            return this.children;
        }

        public final boolean component14() {
            return this.isPinned;
        }

        @Nullable
        public final String component15() {
            return this.mentionUserName;
        }

        @Nullable
        public final Long component16() {
            return this.mentionId;
        }

        @Nullable
        public final Long component17() {
            return this.supportId;
        }

        @NotNull
        public final CommentType component18() {
            return this.type;
        }

        @Nullable
        public final Long component19() {
            return this.orderAmount;
        }

        @Nullable
        public final Long component2() {
            return this.userId;
        }

        @NotNull
        public final SupportStatusType component20() {
            return this.supportStatus;
        }

        @Nullable
        public final String component3() {
            return this.writerName;
        }

        @NotNull
        public final WriterData component4() {
            return this.writer;
        }

        @Nullable
        public final String component5() {
            return this.defaultBlogName;
        }

        @Nullable
        public final String component6() {
            return this.profileImageUrl;
        }

        @Nullable
        public final String component7() {
            return this.content;
        }

        @Nullable
        public final Long component8() {
            return this.parent;
        }

        public final boolean component9() {
            return this.isSecret;
        }

        @NotNull
        public final CommentItem copy(long v, @Nullable Long long0, @Nullable String s, @NotNull WriterData writerData0, @Nullable String s1, @Nullable String s2, @Nullable String s3, @Nullable Long long1, boolean z, boolean z1, @Nullable String s4, @Nullable String s5, @Nullable List list0, boolean z2, @Nullable String s6, @Nullable Long long2, @Nullable Long long3, @NotNull CommentType commentItemType$CommentItem$CommentType0, @Nullable Long long4, @NotNull SupportStatusType commentItemType$CommentItem$SupportStatusType0) {
            Intrinsics.checkNotNullParameter(writerData0, "writer");
            Intrinsics.checkNotNullParameter(commentItemType$CommentItem$CommentType0, "type");
            Intrinsics.checkNotNullParameter(commentItemType$CommentItem$SupportStatusType0, "supportStatus");
            return new CommentItem(v, long0, s, writerData0, s1, s2, s3, long1, z, z1, s4, s5, list0, z2, s6, long2, long3, commentItemType$CommentItem$CommentType0, long4, commentItemType$CommentItem$SupportStatusType0);
        }

        public static CommentItem copy$default(CommentItem commentItemType$CommentItem0, long v, Long long0, String s, WriterData writerData0, String s1, String s2, String s3, Long long1, boolean z, boolean z1, String s4, String s5, List list0, boolean z2, String s6, Long long2, Long long3, CommentType commentItemType$CommentItem$CommentType0, Long long4, SupportStatusType commentItemType$CommentItem$SupportStatusType0, int v1, Object object0) {
            long v2 = (v1 & 1) == 0 ? v : commentItemType$CommentItem0.id;
            Long long5 = (v1 & 2) == 0 ? long0 : commentItemType$CommentItem0.userId;
            String s7 = (v1 & 4) == 0 ? s : commentItemType$CommentItem0.writerName;
            WriterData writerData1 = (v1 & 8) == 0 ? writerData0 : commentItemType$CommentItem0.writer;
            String s8 = (v1 & 16) == 0 ? s1 : commentItemType$CommentItem0.defaultBlogName;
            String s9 = (v1 & 0x20) == 0 ? s2 : commentItemType$CommentItem0.profileImageUrl;
            String s10 = (v1 & 0x40) == 0 ? s3 : commentItemType$CommentItem0.content;
            Long long6 = (v1 & 0x80) == 0 ? long1 : commentItemType$CommentItem0.parent;
            boolean z3 = (v1 & 0x100) == 0 ? z : commentItemType$CommentItem0.isSecret;
            boolean z4 = (v1 & 0x200) == 0 ? z1 : commentItemType$CommentItem0.isRestrict;
            String s11 = (v1 & 0x400) == 0 ? s4 : commentItemType$CommentItem0.permalink;
            String s12 = (v1 & 0x800) == 0 ? s5 : commentItemType$CommentItem0.written;
            List list1 = (v1 & 0x1000) == 0 ? list0 : commentItemType$CommentItem0.children;
            boolean z5 = (v1 & 0x2000) == 0 ? z2 : commentItemType$CommentItem0.isPinned;
            String s13 = (v1 & 0x4000) == 0 ? s6 : commentItemType$CommentItem0.mentionUserName;
            Long long7 = (v1 & 0x8000) == 0 ? long2 : commentItemType$CommentItem0.mentionId;
            Long long8 = (v1 & 0x10000) == 0 ? long3 : commentItemType$CommentItem0.supportId;
            CommentType commentItemType$CommentItem$CommentType1 = (v1 & 0x20000) == 0 ? commentItemType$CommentItem$CommentType0 : commentItemType$CommentItem0.type;
            Long long9 = (v1 & 0x40000) == 0 ? long4 : commentItemType$CommentItem0.orderAmount;
            return (v1 & 0x80000) == 0 ? commentItemType$CommentItem0.copy(v2, long5, s7, writerData1, s8, s9, s10, long6, z3, z4, s11, s12, list1, z5, s13, long7, long8, commentItemType$CommentItem$CommentType1, long9, commentItemType$CommentItem$SupportStatusType0) : commentItemType$CommentItem0.copy(v2, long5, s7, writerData1, s8, s9, s10, long6, z3, z4, s11, s12, list1, z5, s13, long7, long8, commentItemType$CommentItem$CommentType1, long9, commentItemType$CommentItem0.supportStatus);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CommentItem)) {
                return false;
            }
            CommentItem commentItemType$CommentItem0 = (CommentItem)object0;
            if(this.id != commentItemType$CommentItem0.id) {
                return false;
            }
            if(!Intrinsics.areEqual(this.userId, commentItemType$CommentItem0.userId)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.writerName, commentItemType$CommentItem0.writerName)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.writer, commentItemType$CommentItem0.writer)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.defaultBlogName, commentItemType$CommentItem0.defaultBlogName)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.profileImageUrl, commentItemType$CommentItem0.profileImageUrl)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.content, commentItemType$CommentItem0.content)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.parent, commentItemType$CommentItem0.parent)) {
                return false;
            }
            if(this.isSecret != commentItemType$CommentItem0.isSecret) {
                return false;
            }
            if(this.isRestrict != commentItemType$CommentItem0.isRestrict) {
                return false;
            }
            if(!Intrinsics.areEqual(this.permalink, commentItemType$CommentItem0.permalink)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.written, commentItemType$CommentItem0.written)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.children, commentItemType$CommentItem0.children)) {
                return false;
            }
            if(this.isPinned != commentItemType$CommentItem0.isPinned) {
                return false;
            }
            if(!Intrinsics.areEqual(this.mentionUserName, commentItemType$CommentItem0.mentionUserName)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.mentionId, commentItemType$CommentItem0.mentionId)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.supportId, commentItemType$CommentItem0.supportId)) {
                return false;
            }
            if(this.type != commentItemType$CommentItem0.type) {
                return false;
            }
            return Intrinsics.areEqual(this.orderAmount, commentItemType$CommentItem0.orderAmount) ? this.supportStatus == commentItemType$CommentItem0.supportStatus : false;
        }

        @Nullable
        public final List getChildren() {
            return this.children;
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getDefaultBlogName() {
            return this.defaultBlogName;
        }

        public final long getId() {
            return this.id;
        }

        @Nullable
        public final Long getMentionId() {
            return this.mentionId;
        }

        @Nullable
        public final String getMentionUserName() {
            return this.mentionUserName;
        }

        @Nullable
        public final Long getOrderAmount() {
            return this.orderAmount;
        }

        @Nullable
        public final Long getParent() {
            return this.parent;
        }

        @Nullable
        public final String getPermalink() {
            return this.permalink;
        }

        @Nullable
        public final String getProfileImageUrl() {
            return this.profileImageUrl;
        }

        @Nullable
        public final Long getSupportId() {
            return this.supportId;
        }

        @NotNull
        public final SupportStatusType getSupportStatus() {
            return this.supportStatus;
        }

        @NotNull
        public final CommentType getType() {
            return this.type;
        }

        @Nullable
        public final Long getUserId() {
            return this.userId;
        }

        @NotNull
        public final WriterData getWriter() {
            return this.writer;
        }

        @Nullable
        public final String getWriterName() {
            return this.writerName;
        }

        @Nullable
        public final String getWritten() {
            return this.written;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = c.a(this.isPinned, (((c.a(this.isRestrict, c.a(this.isSecret, (((((this.writer.hashCode() + ((Long.hashCode(this.id) * 0x1F + (this.userId == null ? 0 : this.userId.hashCode())) * 0x1F + (this.writerName == null ? 0 : this.writerName.hashCode())) * 0x1F) * 0x1F + (this.defaultBlogName == null ? 0 : this.defaultBlogName.hashCode())) * 0x1F + (this.profileImageUrl == null ? 0 : this.profileImageUrl.hashCode())) * 0x1F + (this.content == null ? 0 : this.content.hashCode())) * 0x1F + (this.parent == null ? 0 : this.parent.hashCode())) * 0x1F, 0x1F), 0x1F) + (this.permalink == null ? 0 : this.permalink.hashCode())) * 0x1F + (this.written == null ? 0 : this.written.hashCode())) * 0x1F + (this.children == null ? 0 : this.children.hashCode())) * 0x1F, 0x1F);
            int v2 = this.mentionUserName == null ? 0 : this.mentionUserName.hashCode();
            int v3 = this.mentionId == null ? 0 : this.mentionId.hashCode();
            int v4 = this.supportId == null ? 0 : this.supportId.hashCode();
            int v5 = this.type.hashCode();
            Long long0 = this.orderAmount;
            if(long0 != null) {
                v = long0.hashCode();
            }
            return this.supportStatus.hashCode() + ((v5 + (((v1 + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F) * 0x1F + v) * 0x1F;
        }

        public final boolean isDeletedSupport() {
            return this.supportStatus == SupportStatusType.DELETED;
        }

        public final boolean isPinned() {
            return this.isPinned;
        }

        public final boolean isRestrict() {
            return this.isRestrict;
        }

        public final boolean isSecret() {
            return this.isSecret;
        }

        public final boolean isSupport() {
            return this.type == CommentType.SUPPORT;
        }

        public final void setChildren(@Nullable List list0) {
            this.children = list0;
        }

        public final void setContent(@Nullable String s) {
            this.content = s;
        }

        public final void setDefaultBlogName(@Nullable String s) {
            this.defaultBlogName = s;
        }

        public final void setId(long v) {
            this.id = v;
        }

        public final void setParent(@Nullable Long long0) {
            this.parent = long0;
        }

        public final void setPermalink(@Nullable String s) {
            this.permalink = s;
        }

        public final void setPinned(boolean z) {
            this.isPinned = z;
        }

        public final void setProfileImageUrl(@Nullable String s) {
            this.profileImageUrl = s;
        }

        public final void setRestrict(boolean z) {
            this.isRestrict = z;
        }

        public final void setSecret(boolean z) {
            this.isSecret = z;
        }

        public final void setUserId(@Nullable Long long0) {
            this.userId = long0;
        }

        public final void setWriterName(@Nullable String s) {
            this.writerName = s;
        }

        public final void setWritten(@Nullable String s) {
            this.written = s;
        }

        @Override
        @NotNull
        public String toString() {
            long v = this.id;
            Long long0 = this.userId;
            String s = this.writerName;
            String s1 = this.defaultBlogName;
            String s2 = this.profileImageUrl;
            String s3 = this.content;
            Long long1 = this.parent;
            boolean z = this.isSecret;
            boolean z1 = this.isRestrict;
            String s4 = this.permalink;
            String s5 = this.written;
            List list0 = this.children;
            boolean z2 = this.isPinned;
            StringBuilder stringBuilder0 = new StringBuilder("CommentItem(id=");
            stringBuilder0.append(v);
            stringBuilder0.append(", userId=");
            stringBuilder0.append(long0);
            stringBuilder0.append(", writerName=");
            stringBuilder0.append(s);
            stringBuilder0.append(", writer=");
            stringBuilder0.append(this.writer);
            androidx.room.a.w(stringBuilder0, ", defaultBlogName=", s1, ", profileImageUrl=", s2);
            stringBuilder0.append(", content=");
            stringBuilder0.append(s3);
            stringBuilder0.append(", parent=");
            stringBuilder0.append(long1);
            stringBuilder0.append(", isSecret=");
            stringBuilder0.append(z);
            stringBuilder0.append(", isRestrict=");
            stringBuilder0.append(z1);
            androidx.room.a.w(stringBuilder0, ", permalink=", s4, ", written=", s5);
            stringBuilder0.append(", children=");
            stringBuilder0.append(list0);
            stringBuilder0.append(", isPinned=");
            stringBuilder0.append(z2);
            stringBuilder0.append(", mentionUserName=");
            stringBuilder0.append(this.mentionUserName);
            stringBuilder0.append(", mentionId=");
            stringBuilder0.append(this.mentionId);
            stringBuilder0.append(", supportId=");
            stringBuilder0.append(this.supportId);
            stringBuilder0.append(", type=");
            stringBuilder0.append(this.type);
            stringBuilder0.append(", orderAmount=");
            stringBuilder0.append(this.orderAmount);
            stringBuilder0.append(", supportStatus=");
            stringBuilder0.append(this.supportStatus);
            stringBuilder0.append(")");
            return stringBuilder0.toString();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u001E\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0086\u000E¢\u0006\u0010\n\u0002\u0010\u000F\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000E¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/domain/entity/CommentItemType$CommentReplyItem;", "Lcom/kakao/tistory/domain/entity/CommentItemType;", "parentComment", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "commentItem", "parentUserId", "", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Ljava/lang/Long;)V", "getCommentItem", "()Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "getParentComment", "getParentUserId", "()Ljava/lang/Long;", "setParentUserId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Ljava/lang/Long;)Lcom/kakao/tistory/domain/entity/CommentItemType$CommentReplyItem;", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CommentReplyItem extends CommentItemType {
        @NotNull
        private final CommentItem commentItem;
        @NotNull
        private final CommentItem parentComment;
        @Nullable
        private Long parentUserId;

        public CommentReplyItem(@NotNull CommentItem commentItemType$CommentItem0, @NotNull CommentItem commentItemType$CommentItem1, @Nullable Long long0) {
            Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "parentComment");
            Intrinsics.checkNotNullParameter(commentItemType$CommentItem1, "commentItem");
            super(null);
            this.parentComment = commentItemType$CommentItem0;
            this.commentItem = commentItemType$CommentItem1;
            this.parentUserId = long0;
        }

        public CommentReplyItem(CommentItem commentItemType$CommentItem0, CommentItem commentItemType$CommentItem1, Long long0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 4) != 0) {
                long0 = null;
            }
            this(commentItemType$CommentItem0, commentItemType$CommentItem1, long0);
        }

        @NotNull
        public final CommentItem component1() {
            return this.parentComment;
        }

        @NotNull
        public final CommentItem component2() {
            return this.commentItem;
        }

        @Nullable
        public final Long component3() {
            return this.parentUserId;
        }

        @NotNull
        public final CommentReplyItem copy(@NotNull CommentItem commentItemType$CommentItem0, @NotNull CommentItem commentItemType$CommentItem1, @Nullable Long long0) {
            Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "parentComment");
            Intrinsics.checkNotNullParameter(commentItemType$CommentItem1, "commentItem");
            return new CommentReplyItem(commentItemType$CommentItem0, commentItemType$CommentItem1, long0);
        }

        public static CommentReplyItem copy$default(CommentReplyItem commentItemType$CommentReplyItem0, CommentItem commentItemType$CommentItem0, CommentItem commentItemType$CommentItem1, Long long0, int v, Object object0) {
            if((v & 1) != 0) {
                commentItemType$CommentItem0 = commentItemType$CommentReplyItem0.parentComment;
            }
            if((v & 2) != 0) {
                commentItemType$CommentItem1 = commentItemType$CommentReplyItem0.commentItem;
            }
            if((v & 4) != 0) {
                long0 = commentItemType$CommentReplyItem0.parentUserId;
            }
            return commentItemType$CommentReplyItem0.copy(commentItemType$CommentItem0, commentItemType$CommentItem1, long0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CommentReplyItem)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.parentComment, ((CommentReplyItem)object0).parentComment)) {
                return false;
            }
            return Intrinsics.areEqual(this.commentItem, ((CommentReplyItem)object0).commentItem) ? Intrinsics.areEqual(this.parentUserId, ((CommentReplyItem)object0).parentUserId) : false;
        }

        @NotNull
        public final CommentItem getCommentItem() {
            return this.commentItem;
        }

        @NotNull
        public final CommentItem getParentComment() {
            return this.parentComment;
        }

        @Nullable
        public final Long getParentUserId() {
            return this.parentUserId;
        }

        @Override
        public int hashCode() {
            int v = this.parentComment.hashCode();
            int v1 = this.commentItem.hashCode();
            return this.parentUserId == null ? (v1 + v * 0x1F) * 0x1F : (v1 + v * 0x1F) * 0x1F + this.parentUserId.hashCode();
        }

        public final void setParentUserId(@Nullable Long long0) {
            this.parentUserId = long0;
        }

        @Override
        @NotNull
        public String toString() {
            return "CommentReplyItem(parentComment=" + this.parentComment + ", commentItem=" + this.commentItem + ", parentUserId=" + this.parentUserId + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001R\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001A\u0010\u0004\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u0007\"\u0004\b\u000B\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/domain/entity/CommentItemType$CommentReplyMoreItem;", "Lcom/kakao/tistory/domain/entity/CommentItemType;", "parent", "", "replySize", "(JJ)V", "getParent", "()J", "setParent", "(J)V", "getReplySize", "setReplySize", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class CommentReplyMoreItem extends CommentItemType {
        private long parent;
        private long replySize;

        public CommentReplyMoreItem(long v, long v1) {
            super(null);
            this.parent = v;
            this.replySize = v1;
        }

        public CommentReplyMoreItem(long v, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v2 & 2) != 0) {
                v1 = 0L;
            }
            this(v, v1);
        }

        public final long component1() {
            return this.parent;
        }

        public final long component2() {
            return this.replySize;
        }

        @NotNull
        public final CommentReplyMoreItem copy(long v, long v1) {
            return new CommentReplyMoreItem(v, v1);
        }

        public static CommentReplyMoreItem copy$default(CommentReplyMoreItem commentItemType$CommentReplyMoreItem0, long v, long v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                v = commentItemType$CommentReplyMoreItem0.parent;
            }
            if((v2 & 2) != 0) {
                v1 = commentItemType$CommentReplyMoreItem0.replySize;
            }
            return commentItemType$CommentReplyMoreItem0.copy(v, v1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CommentReplyMoreItem)) {
                return false;
            }
            return this.parent == ((CommentReplyMoreItem)object0).parent ? this.replySize == ((CommentReplyMoreItem)object0).replySize : false;
        }

        public final long getParent() {
            return this.parent;
        }

        public final long getReplySize() {
            return this.replySize;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(this.replySize) + Long.hashCode(this.parent) * 0x1F;
        }

        public final void setParent(long v) {
            this.parent = v;
        }

        public final void setReplySize(long v) {
            this.replySize = v;
        }

        @Override
        @NotNull
        public String toString() {
            long v = this.parent;
            long v1 = this.replySize;
            StringBuilder stringBuilder0 = new StringBuilder("CommentReplyMoreItem(parent=");
            stringBuilder0.append(v);
            stringBuilder0.append(", replySize=");
            return b.g(v1, ")", stringBuilder0);
        }
    }

    private CommentItemType() {
    }

    public CommentItemType(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

