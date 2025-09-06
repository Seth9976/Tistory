package com.kakao.tistory.presentation.view.comment.contract;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.presentation.view.comment.CommentActivityResultType;
import com.kakao.tistory.presentation.view.common.dialog.DialogUIModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent;", "", "GoModify", "SetActivityResult", "ShowDialog", "ShowToast", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent$GoModify;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent$SetActivityResult;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent$ShowDialog;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent$ShowToast;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CommentListEvent {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0012\u0010\r\u001A\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0012\u0010\u000F\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000F\u0010\fJ\u0010\u0010\u0010\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001A\u0010\u001B\u001A\u00020\u001A2\b\u0010\u0019\u001A\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\fR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010\u000ER\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001E\u001A\u0004\b$\u0010\fR\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0011¨\u0006("}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent$GoModify;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent;", "", "blogName", "", "entryId", "guestPassword", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "commentItem", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "component4", "()Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent$GoModify;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "Ljava/lang/Long;", "getEntryId", "c", "getGuestPassword", "d", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "getCommentItem", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class GoModify extends CommentListEvent {
        public static final int $stable = 8;
        public final String a;
        public final Long b;
        public final String c;
        public final CommentItem d;

        public GoModify(@NotNull String s, @Nullable Long long0, @Nullable String s1, @NotNull CommentItem commentItemType$CommentItem0) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
            super(null);
            this.a = s;
            this.b = long0;
            this.c = s1;
            this.d = commentItemType$CommentItem0;
        }

        public GoModify(String s, Long long0, String s1, CommentItem commentItemType$CommentItem0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
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
        public final GoModify copy(@NotNull String s, @Nullable Long long0, @Nullable String s1, @NotNull CommentItem commentItemType$CommentItem0) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
            return new GoModify(s, long0, s1, commentItemType$CommentItem0);
        }

        public static GoModify copy$default(GoModify commentListEvent$GoModify0, String s, Long long0, String s1, CommentItem commentItemType$CommentItem0, int v, Object object0) {
            if((v & 1) != 0) {
                s = commentListEvent$GoModify0.a;
            }
            if((v & 2) != 0) {
                long0 = commentListEvent$GoModify0.b;
            }
            if((v & 4) != 0) {
                s1 = commentListEvent$GoModify0.c;
            }
            if((v & 8) != 0) {
                commentItemType$CommentItem0 = commentListEvent$GoModify0.d;
            }
            return commentListEvent$GoModify0.copy(s, long0, s1, commentItemType$CommentItem0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof GoModify)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((GoModify)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((GoModify)object0).b)) {
                return false;
            }
            return Intrinsics.areEqual(this.c, ((GoModify)object0).c) ? Intrinsics.areEqual(this.d, ((GoModify)object0).d) : false;
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
            return "GoModify(blogName=" + this.a + ", entryId=" + this.b + ", guestPassword=" + this.c + ", commentItem=" + this.d + ")";
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000BJ$\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000F\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0012\u001A\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0016\u001A\u00020\u00042\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\tR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u000B¨\u0006\u001E"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent$SetActivityResult;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent;", "Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;", "resultType", "", "finish", "<init>", "(Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;Z)V", "component1", "()Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;", "component2", "()Z", "copy", "(Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;Z)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent$SetActivityResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;", "getResultType", "b", "Z", "getFinish", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class SetActivityResult extends CommentListEvent {
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

        public static SetActivityResult copy$default(SetActivityResult commentListEvent$SetActivityResult0, CommentActivityResultType commentActivityResultType0, boolean z, int v, Object object0) {
            if((v & 1) != 0) {
                commentActivityResultType0 = commentListEvent$SetActivityResult0.a;
            }
            if((v & 2) != 0) {
                z = commentListEvent$SetActivityResult0.b;
            }
            return commentListEvent$SetActivityResult0.copy(commentActivityResultType0, z);
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
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent$ShowDialog;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent;", "Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;", "dialogUIModel", "<init>", "(Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;)V", "component1", "()Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;", "copy", "(Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent$ShowDialog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/kakao/tistory/presentation/view/common/dialog/DialogUIModel;", "getDialogUIModel", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowDialog extends CommentListEvent {
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

        public static ShowDialog copy$default(ShowDialog commentListEvent$ShowDialog0, DialogUIModel dialogUIModel0, int v, Object object0) {
            if((v & 1) != 0) {
                dialogUIModel0 = commentListEvent$ShowDialog0.a;
            }
            return commentListEvent$ShowDialog0.copy(dialogUIModel0);
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

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0003\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000B\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent$ShowToast;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent;", "", "messageResId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/kakao/tistory/presentation/view/comment/contract/CommentListEvent$ShowToast;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getMessageResId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class ShowToast extends CommentListEvent {
        public static final int $stable;
        public final int a;

        public ShowToast(@StringRes int v) {
            super(null);
            this.a = v;
        }

        public final int component1() {
            return this.a;
        }

        @NotNull
        public final ShowToast copy(@StringRes int v) {
            return new ShowToast(v);
        }

        public static ShowToast copy$default(ShowToast commentListEvent$ShowToast0, int v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = commentListEvent$ShowToast0.a;
            }
            return commentListEvent$ShowToast0.copy(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowToast ? this.a == ((ShowToast)object0).a : false;
        }

        public final int getMessageResId() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a;
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowToast(messageResId=" + this.a + ")";
        }
    }

    public static final int $stable;

    public CommentListEvent(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

