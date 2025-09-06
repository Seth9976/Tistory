package com.kakao.tistory.presentation.view.comment.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.presentation.view.entry.widget.CommentCompletion;
import com.kakao.tistory.presentation.view.entry.widget.ReplyType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent;", "", "Clear", "Init", "RemoveReply", "WriteComplete", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent$Clear;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent$Init;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent$RemoveReply;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent$WriteComplete;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CommentModifyIntent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent$Clear;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Clear extends CommentModifyIntent {
        public static final int $stable;
        @NotNull
        public static final Clear INSTANCE;

        static {
            Clear.INSTANCE = new Clear();
        }

        public Clear() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0012\u0010\r\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0012\u0010\u000F\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\fJ\u0010\u0010\u0010\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001B\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\fR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u000ER\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001E\u001A\u0004\b$\u0010\fR\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0011¨\u0006("}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent$Init;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent;", "", "blogName", "", "entryId", "guestPassword", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "commentItem", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "component4", "()Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent$Init;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "Ljava/lang/Long;", "getEntryId", "c", "getGuestPassword", "d", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "getCommentItem", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Init extends CommentModifyIntent {
        public static final int $stable = 8;
        public final String a;
        public final Long b;
        public final String c;
        public final CommentItem d;

        public Init(@NotNull String s, @Nullable Long long0, @Nullable String s1, @NotNull CommentItem commentItemType$CommentItem0) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
            super(null);
            this.a = s;
            this.b = long0;
            this.c = s1;
            this.d = commentItemType$CommentItem0;
        }

        public Init(String s, Long long0, String s1, CommentItem commentItemType$CommentItem0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                long0 = null;
            }
            if((v & 4) != 0) {
                s1 = null;
            }
            this(s, long0, s1, commentItemType$CommentItem0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @Nullable
        public final Long component2() {
            return this.b;
        }

        @Nullable
        public final String component3() {
            return this.c;
        }

        @NotNull
        public final CommentItem component4() {
            return this.d;
        }

        @NotNull
        public final Init copy(@NotNull String s, @Nullable Long long0, @Nullable String s1, @NotNull CommentItem commentItemType$CommentItem0) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
            return new Init(s, long0, s1, commentItemType$CommentItem0);
        }

        public static Init copy$default(Init commentModifyIntent$Init0, String s, Long long0, String s1, CommentItem commentItemType$CommentItem0, int v, Object object0) {
            if((v & 1) != 0) {
                s = commentModifyIntent$Init0.a;
            }
            if((v & 2) != 0) {
                long0 = commentModifyIntent$Init0.b;
            }
            if((v & 4) != 0) {
                s1 = commentModifyIntent$Init0.c;
            }
            if((v & 8) != 0) {
                commentItemType$CommentItem0 = commentModifyIntent$Init0.d;
            }
            return commentModifyIntent$Init0.copy(s, long0, s1, commentItemType$CommentItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Init)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Init)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Init)object0).b)) {
                return false;
            }
            return Intrinsics.areEqual(this.c, ((Init)object0).c) ? Intrinsics.areEqual(this.d, ((Init)object0).d) : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @NotNull
        public final CommentItem getCommentItem() {
            return this.d;
        }

        @Nullable
        public final Long getEntryId() {
            return this.b;
        }

        @Nullable
        public final String getGuestPassword() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            int v1 = 0;
            int v2 = this.b == null ? 0 : this.b.hashCode();
            String s = this.c;
            if(s != null) {
                v1 = s.hashCode();
            }
            return this.d.hashCode() + ((v * 0x1F + v2) * 0x1F + v1) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "Init(blogName=" + this.a + ", entryId=" + this.b + ", guestPassword=" + this.c + ", commentItem=" + this.d + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent$RemoveReply;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent;", "Lcom/kakao/tistory/presentation/view/entry/widget/ReplyType;", "replyType", "<init>", "(Lcom/kakao/tistory/presentation/view/entry/widget/ReplyType;)V", "component1", "()Lcom/kakao/tistory/presentation/view/entry/widget/ReplyType;", "copy", "(Lcom/kakao/tistory/presentation/view/entry/widget/ReplyType;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent$RemoveReply;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/view/entry/widget/ReplyType;", "getReplyType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RemoveReply extends CommentModifyIntent {
        public static final int $stable;
        public final ReplyType a;

        public RemoveReply(@NotNull ReplyType replyType0) {
            Intrinsics.checkNotNullParameter(replyType0, "replyType");
            super(null);
            this.a = replyType0;
        }

        @NotNull
        public final ReplyType component1() {
            return this.a;
        }

        @NotNull
        public final RemoveReply copy(@NotNull ReplyType replyType0) {
            Intrinsics.checkNotNullParameter(replyType0, "replyType");
            return new RemoveReply(replyType0);
        }

        public static RemoveReply copy$default(RemoveReply commentModifyIntent$RemoveReply0, ReplyType replyType0, int v, Object object0) {
            if((v & 1) != 0) {
                replyType0 = commentModifyIntent$RemoveReply0.a;
            }
            return commentModifyIntent$RemoveReply0.copy(replyType0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RemoveReply ? this.a == ((RemoveReply)object0).a : false;
        }

        @NotNull
        public final ReplyType getReplyType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "RemoveReply(replyType=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00022\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u0003\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u000B¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent$WriteComplete;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent;", "", "isPinned", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "commentCompletion", "<init>", "(ZLcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)V", "component1", "()Z", "component2", "()Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "copy", "(ZLcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent$WriteComplete;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "getCommentCompletion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class WriteComplete extends CommentModifyIntent {
        public static final int $stable;
        public final boolean a;
        public final CommentCompletion b;

        public WriteComplete(boolean z, @NotNull CommentCompletion commentCompletion0) {
            Intrinsics.checkNotNullParameter(commentCompletion0, "commentCompletion");
            super(null);
            this.a = z;
            this.b = commentCompletion0;
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final CommentCompletion component2() {
            return this.b;
        }

        @NotNull
        public final WriteComplete copy(boolean z, @NotNull CommentCompletion commentCompletion0) {
            Intrinsics.checkNotNullParameter(commentCompletion0, "commentCompletion");
            return new WriteComplete(z, commentCompletion0);
        }

        public static WriteComplete copy$default(WriteComplete commentModifyIntent$WriteComplete0, boolean z, CommentCompletion commentCompletion0, int v, Object object0) {
            if((v & 1) != 0) {
                z = commentModifyIntent$WriteComplete0.a;
            }
            if((v & 2) != 0) {
                commentCompletion0 = commentModifyIntent$WriteComplete0.b;
            }
            return commentModifyIntent$WriteComplete0.copy(z, commentCompletion0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof WriteComplete)) {
                return false;
            }
            return this.a == ((WriteComplete)object0).a ? Intrinsics.areEqual(this.b, ((WriteComplete)object0).b) : false;
        }

        @NotNull
        public final CommentCompletion getCommentCompletion() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + Boolean.hashCode(this.a) * 0x1F;
        }

        public final boolean isPinned() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            return "WriteComplete(isPinned=" + this.a + ", commentCompletion=" + this.b + ")";
        }
    }

    public static final int $stable;

    public CommentModifyIntent(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

