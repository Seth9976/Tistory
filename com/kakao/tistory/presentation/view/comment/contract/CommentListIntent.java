package com.kakao.tistory.presentation.view.comment.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.presentation.view.entry.widget.CommentCompletion;
import com.kakao.tistory.presentation.view.entry.widget.ReplyType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000B\f\r\u000E\u000F\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent;", "", "ClickReply", "FinishInitLoading", "LoadedCommentList", "LoadedPinCommentList", "RefreshCommentList", "RemoveReply", "UpdateCommentCountList", "WriteComplete", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$ClickReply;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$FinishInitLoading;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$LoadedCommentList;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$LoadedPinCommentList;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$RefreshCommentList;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$RemoveReply;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$UpdateCommentCountList;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$WriteComplete;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CommentListIntent {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\r\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0015\u001A\u00020\u00142\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\bR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0018\u001A\u0004\b\u001B\u0010\b¨\u0006\u001C"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$ClickReply;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent;", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "parent", "mention", "<init>", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)V", "component1", "()Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "component2", "copy", "(Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$ClickReply;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "getParent", "b", "getMention", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ClickReply extends CommentListIntent {
        public static final int $stable = 8;
        public final CommentItem a;
        public final CommentItem b;

        public ClickReply() {
            this(null, null, 3, null);
        }

        public ClickReply(@Nullable CommentItem commentItemType$CommentItem0, @Nullable CommentItem commentItemType$CommentItem1) {
            super(null);
            this.a = commentItemType$CommentItem0;
            this.b = commentItemType$CommentItem1;
        }

        public ClickReply(CommentItem commentItemType$CommentItem0, CommentItem commentItemType$CommentItem1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                commentItemType$CommentItem0 = null;
            }
            if((v & 2) != 0) {
                commentItemType$CommentItem1 = null;
            }
            this(commentItemType$CommentItem0, commentItemType$CommentItem1);
        }

        @Nullable
        public final CommentItem component1() {
            return this.a;
        }

        @Nullable
        public final CommentItem component2() {
            return this.b;
        }

        @NotNull
        public final ClickReply copy(@Nullable CommentItem commentItemType$CommentItem0, @Nullable CommentItem commentItemType$CommentItem1) {
            return new ClickReply(commentItemType$CommentItem0, commentItemType$CommentItem1);
        }

        public static ClickReply copy$default(ClickReply commentListIntent$ClickReply0, CommentItem commentItemType$CommentItem0, CommentItem commentItemType$CommentItem1, int v, Object object0) {
            if((v & 1) != 0) {
                commentItemType$CommentItem0 = commentListIntent$ClickReply0.a;
            }
            if((v & 2) != 0) {
                commentItemType$CommentItem1 = commentListIntent$ClickReply0.b;
            }
            return commentListIntent$ClickReply0.copy(commentItemType$CommentItem0, commentItemType$CommentItem1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ClickReply)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((ClickReply)object0).a) ? Intrinsics.areEqual(this.b, ((ClickReply)object0).b) : false;
        }

        @Nullable
        public final CommentItem getMention() {
            return this.b;
        }

        @Nullable
        public final CommentItem getParent() {
            return this.a;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            CommentItem commentItemType$CommentItem0 = this.b;
            if(commentItemType$CommentItem0 != null) {
                v = commentItemType$CommentItem0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @NotNull
        public String toString() {
            return "ClickReply(parent=" + this.a + ", mention=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0012\u001A\u00020\u00022\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0003\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$FinishInitLoading;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent;", "", "isEmpty", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$FinishInitLoading;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class FinishInitLoading extends CommentListIntent {
        public static final int $stable;
        public final boolean a;

        public FinishInitLoading(boolean z) {
            super(null);
            this.a = z;
        }

        public final boolean component1() {
            return this.a;
        }

        @NotNull
        public final FinishInitLoading copy(boolean z) {
            return new FinishInitLoading(z);
        }

        public static FinishInitLoading copy$default(FinishInitLoading commentListIntent$FinishInitLoading0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                z = commentListIntent$FinishInitLoading0.a;
            }
            return commentListIntent$FinishInitLoading0.copy(z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof FinishInitLoading ? this.a == ((FinishInitLoading)object0).a : false;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final boolean isEmpty() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            return "FinishInitLoading(isEmpty=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u0012\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001C\u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ\u0012\u0010\f\u001A\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000E\u001A\u00020\u00002\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001A\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001AR#\u0010\u0005\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000BR\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010\r¨\u0006!"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$LoadedCommentList;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel;", "comments", "", "scrollTargetCommentId", "<init>", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Long;)V", "component1", "()Lkotlinx/coroutines/flow/Flow;", "component2", "()Ljava/lang/Long;", "copy", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Long;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$LoadedCommentList;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlinx/coroutines/flow/Flow;", "getComments", "b", "Ljava/lang/Long;", "getScrollTargetCommentId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LoadedCommentList extends CommentListIntent {
        public static final int $stable = 8;
        public final Flow a;
        public final Long b;

        public LoadedCommentList(@NotNull Flow flow0, @Nullable Long long0) {
            Intrinsics.checkNotNullParameter(flow0, "comments");
            super(null);
            this.a = flow0;
            this.b = long0;
        }

        public LoadedCommentList(Flow flow0, Long long0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                long0 = null;
            }
            this(flow0, long0);
        }

        @NotNull
        public final Flow component1() {
            return this.a;
        }

        @Nullable
        public final Long component2() {
            return this.b;
        }

        @NotNull
        public final LoadedCommentList copy(@NotNull Flow flow0, @Nullable Long long0) {
            Intrinsics.checkNotNullParameter(flow0, "comments");
            return new LoadedCommentList(flow0, long0);
        }

        public static LoadedCommentList copy$default(LoadedCommentList commentListIntent$LoadedCommentList0, Flow flow0, Long long0, int v, Object object0) {
            if((v & 1) != 0) {
                flow0 = commentListIntent$LoadedCommentList0.a;
            }
            if((v & 2) != 0) {
                long0 = commentListIntent$LoadedCommentList0.b;
            }
            return commentListIntent$LoadedCommentList0.copy(flow0, long0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LoadedCommentList)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((LoadedCommentList)object0).a) ? Intrinsics.areEqual(this.b, ((LoadedCommentList)object0).b) : false;
        }

        @NotNull
        public final Flow getComments() {
            return this.a;
        }

        @Nullable
        public final Long getScrollTargetCommentId() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "LoadedCommentList(comments=" + this.a + ", scrollTargetCommentId=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$LoadedPinCommentList;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;", "pinedComment", "<init>", "(Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;)V", "component1", "()Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;", "copy", "(Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$LoadedPinCommentList;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;", "getPinedComment", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class LoadedPinCommentList extends CommentListIntent {
        public static final int $stable;
        public final Pin a;

        public LoadedPinCommentList() {
            this(null, 1, null);
        }

        public LoadedPinCommentList(@Nullable Pin commentItemUIModel$Pin0) {
            super(null);
            this.a = commentItemUIModel$Pin0;
        }

        public LoadedPinCommentList(Pin commentItemUIModel$Pin0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                commentItemUIModel$Pin0 = null;
            }
            this(commentItemUIModel$Pin0);
        }

        @Nullable
        public final Pin component1() {
            return this.a;
        }

        @NotNull
        public final LoadedPinCommentList copy(@Nullable Pin commentItemUIModel$Pin0) {
            return new LoadedPinCommentList(commentItemUIModel$Pin0);
        }

        public static LoadedPinCommentList copy$default(LoadedPinCommentList commentListIntent$LoadedPinCommentList0, Pin commentItemUIModel$Pin0, int v, Object object0) {
            if((v & 1) != 0) {
                commentItemUIModel$Pin0 = commentListIntent$LoadedPinCommentList0.a;
            }
            return commentListIntent$LoadedPinCommentList0.copy(commentItemUIModel$Pin0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof LoadedPinCommentList ? Intrinsics.areEqual(this.a, ((LoadedPinCommentList)object0).a) : false;
        }

        @Nullable
        public final Pin getPinedComment() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "LoadedPinCommentList(pinedComment=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001D\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ&\u0010\f\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00042\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$RefreshCommentList;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent;", "", "commentId", "", "keepScrollPosition", "<init>", "(Ljava/lang/Long;Z)V", "component1", "()Ljava/lang/Long;", "component2", "()Z", "copy", "(Ljava/lang/Long;Z)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$RefreshCommentList;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "getCommentId", "b", "Z", "getKeepScrollPosition", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RefreshCommentList extends CommentListIntent {
        public static final int $stable;
        public final Long a;
        public final boolean b;

        public RefreshCommentList() {
            this(null, false, 3, null);
        }

        public RefreshCommentList(@Nullable Long long0, boolean z) {
            super(null);
            this.a = long0;
            this.b = z;
        }

        public RefreshCommentList(Long long0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                long0 = null;
            }
            if((v & 2) != 0) {
                z = false;
            }
            this(long0, z);
        }

        @Nullable
        public final Long component1() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        @NotNull
        public final RefreshCommentList copy(@Nullable Long long0, boolean z) {
            return new RefreshCommentList(long0, z);
        }

        public static RefreshCommentList copy$default(RefreshCommentList commentListIntent$RefreshCommentList0, Long long0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                long0 = commentListIntent$RefreshCommentList0.a;
            }
            if((v & 2) != 0) {
                z = commentListIntent$RefreshCommentList0.b;
            }
            return commentListIntent$RefreshCommentList0.copy(long0, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RefreshCommentList)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((RefreshCommentList)object0).a) ? this.b == ((RefreshCommentList)object0).b : false;
        }

        @Nullable
        public final Long getCommentId() {
            return this.a;
        }

        public final boolean getKeepScrollPosition() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.a == null ? Boolean.hashCode(this.b) : Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "RefreshCommentList(commentId=" + this.a + ", keepScrollPosition=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$RemoveReply;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent;", "Lcom/kakao/tistory/presentation/view/entry/widget/ReplyType;", "replyType", "<init>", "(Lcom/kakao/tistory/presentation/view/entry/widget/ReplyType;)V", "component1", "()Lcom/kakao/tistory/presentation/view/entry/widget/ReplyType;", "copy", "(Lcom/kakao/tistory/presentation/view/entry/widget/ReplyType;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$RemoveReply;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/view/entry/widget/ReplyType;", "getReplyType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class RemoveReply extends CommentListIntent {
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

        public static RemoveReply copy$default(RemoveReply commentListIntent$RemoveReply0, ReplyType replyType0, int v, Object object0) {
            if((v & 1) != 0) {
                replyType0 = commentListIntent$RemoveReply0.a;
            }
            return commentListIntent$RemoveReply0.copy(replyType0);
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$UpdateCommentCountList;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent;", "", "count", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$UpdateCommentCountList;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "getCount", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class UpdateCommentCountList extends CommentListIntent {
        public static final int $stable;
        public final long a;

        public UpdateCommentCountList(long v) {
            super(null);
            this.a = v;
        }

        public final long component1() {
            return this.a;
        }

        @NotNull
        public final UpdateCommentCountList copy(long v) {
            return new UpdateCommentCountList(v);
        }

        public static UpdateCommentCountList copy$default(UpdateCommentCountList commentListIntent$UpdateCommentCountList0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = commentListIntent$UpdateCommentCountList0.a;
            }
            return commentListIntent$UpdateCommentCountList0.copy(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof UpdateCommentCountList ? this.a == ((UpdateCommentCountList)object0).a : false;
        }

        public final long getCount() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(this.a);
        }

        @Override
        @NotNull
        public String toString() {
            return "UpdateCommentCountList(count=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$WriteComplete;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent;", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "commentCompletion", "<init>", "(Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)V", "component1", "()Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "copy", "(Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListIntent$WriteComplete;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "getCommentCompletion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class WriteComplete extends CommentListIntent {
        public static final int $stable;
        public final CommentCompletion a;

        public WriteComplete(@NotNull CommentCompletion commentCompletion0) {
            Intrinsics.checkNotNullParameter(commentCompletion0, "commentCompletion");
            super(null);
            this.a = commentCompletion0;
        }

        @NotNull
        public final CommentCompletion component1() {
            return this.a;
        }

        @NotNull
        public final WriteComplete copy(@NotNull CommentCompletion commentCompletion0) {
            Intrinsics.checkNotNullParameter(commentCompletion0, "commentCompletion");
            return new WriteComplete(commentCompletion0);
        }

        public static WriteComplete copy$default(WriteComplete commentListIntent$WriteComplete0, CommentCompletion commentCompletion0, int v, Object object0) {
            if((v & 1) != 0) {
                commentCompletion0 = commentListIntent$WriteComplete0.a;
            }
            return commentListIntent$WriteComplete0.copy(commentCompletion0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof WriteComplete ? Intrinsics.areEqual(this.a, ((WriteComplete)object0).a) : false;
        }

        @NotNull
        public final CommentCompletion getCommentCompletion() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "WriteComplete(commentCompletion=" + this.a + ")";
        }
    }

    public static final int $stable;

    public CommentListIntent(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

