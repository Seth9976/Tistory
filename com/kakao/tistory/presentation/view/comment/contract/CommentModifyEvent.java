package com.kakao.tistory.presentation.view.comment.contract;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.view.comment.CommentActivityResultType;
import com.kakao.tistory.presentation.view.common.dialog.DialogUIModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent;", "", "BackToList", "SetActivityResult", "ShowDialog", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent$BackToList;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent$SetActivityResult;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent$ShowDialog;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CommentModifyEvent {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent$BackToList;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent;", "", "commentId", "<init>", "(Ljava/lang/Long;)V", "component1", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Long;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent$BackToList;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "getCommentId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class BackToList extends CommentModifyEvent {
        public static final int $stable;
        public final Long a;

        public BackToList() {
            this(null, 1, null);
        }

        public BackToList(@Nullable Long long0) {
            super(null);
            this.a = long0;
        }

        public BackToList(Long long0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                long0 = null;
            }
            this(long0);
        }

        @Nullable
        public final Long component1() {
            return this.a;
        }

        @NotNull
        public final BackToList copy(@Nullable Long long0) {
            return new BackToList(long0);
        }

        public static BackToList copy$default(BackToList commentModifyEvent$BackToList0, Long long0, int v, Object object0) {
            if((v & 1) != 0) {
                long0 = commentModifyEvent$BackToList0.a;
            }
            return commentModifyEvent$BackToList0.copy(long0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof BackToList ? Intrinsics.areEqual(this.a, ((BackToList)object0).a) : false;
        }

        @Nullable
        public final Long getCommentId() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "BackToList(commentId=" + this.a + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00042\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent$SetActivityResult;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent;", "Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;", "resultType", "", "finish", "<init>", "(Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;Z)V", "component1", "()Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;", "component2", "()Z", "copy", "(Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;Z)Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent$SetActivityResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;", "getResultType", "b", "Z", "getFinish", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SetActivityResult extends CommentModifyEvent {
        public static final int $stable;
        public final CommentActivityResultType a;
        public final boolean b;

        public SetActivityResult(@NotNull CommentActivityResultType commentActivityResultType0, boolean z) {
            Intrinsics.checkNotNullParameter(commentActivityResultType0, "resultType");
            super(null);
            this.a = commentActivityResultType0;
            this.b = z;
        }

        public SetActivityResult(CommentActivityResultType commentActivityResultType0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 2) != 0) {
                z = false;
            }
            this(commentActivityResultType0, z);
        }

        @NotNull
        public final CommentActivityResultType component1() {
            return this.a;
        }

        public final boolean component2() {
            return this.b;
        }

        @NotNull
        public final SetActivityResult copy(@NotNull CommentActivityResultType commentActivityResultType0, boolean z) {
            Intrinsics.checkNotNullParameter(commentActivityResultType0, "resultType");
            return new SetActivityResult(commentActivityResultType0, z);
        }

        public static SetActivityResult copy$default(SetActivityResult commentModifyEvent$SetActivityResult0, CommentActivityResultType commentActivityResultType0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                commentActivityResultType0 = commentModifyEvent$SetActivityResult0.a;
            }
            if((v & 2) != 0) {
                z = commentModifyEvent$SetActivityResult0.b;
            }
            return commentModifyEvent$SetActivityResult0.copy(commentActivityResultType0, z);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SetActivityResult)) {
                return false;
            }
            return this.a == ((SetActivityResult)object0).a ? this.b == ((SetActivityResult)object0).b : false;
        }

        public final boolean getFinish() {
            return this.b;
        }

        @NotNull
        public final CommentActivityResultType getResultType() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return Boolean.hashCode(this.b) + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "SetActivityResult(resultType=" + this.a + ", finish=" + this.b + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent$ShowDialog;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent;", "Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;", "dialogUIModel", "<init>", "(Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;)V", "component1", "()Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;", "copy", "(Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent$ShowDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;", "getDialogUIModel", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowDialog extends CommentModifyEvent {
        public static final int $stable;
        public final DialogUIModel a;

        public ShowDialog(@NotNull DialogUIModel dialogUIModel0) {
            Intrinsics.checkNotNullParameter(dialogUIModel0, "dialogUIModel");
            super(null);
            this.a = dialogUIModel0;
        }

        @NotNull
        public final DialogUIModel component1() {
            return this.a;
        }

        @NotNull
        public final ShowDialog copy(@NotNull DialogUIModel dialogUIModel0) {
            Intrinsics.checkNotNullParameter(dialogUIModel0, "dialogUIModel");
            return new ShowDialog(dialogUIModel0);
        }

        public static ShowDialog copy$default(ShowDialog commentModifyEvent$ShowDialog0, DialogUIModel dialogUIModel0, int v, Object object0) {
            if((v & 1) != 0) {
                dialogUIModel0 = commentModifyEvent$ShowDialog0.a;
            }
            return commentModifyEvent$ShowDialog0.copy(dialogUIModel0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowDialog ? Intrinsics.areEqual(this.a, ((ShowDialog)object0).a) : false;
        }

        @NotNull
        public final DialogUIModel getDialogUIModel() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowDialog(dialogUIModel=" + this.a + ")";
        }
    }

    public static final int $stable;

    public CommentModifyEvent(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

