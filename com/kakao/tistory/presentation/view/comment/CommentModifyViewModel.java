package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyEvent.BackToList;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyEvent.SetActivityResult;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyEvent.ShowDialog;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyIntent.Clear;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyIntent.Init;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyIntent.RemoveReply;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyIntent.WriteComplete;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyIntent;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyModel;
import com.kakao.tistory.presentation.view.common.dialog.DialogUIModel;
import com.kakao.tistory.presentation.view.entry.widget.CommentCompletion;
import com.kakao.tistory.presentation.view.entry.widget.ReplyType;
import com.kakao.tistory.presentation.viewmodel.base.BaseMviViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000B\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u0000 22\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\rH$¢\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0014\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u001D\u001A\u0004\u0018\u00010\u00168\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR$\u0010%\u001A\u0004\u0018\u00010\u001E8\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010)\u001A\u0004\u0018\u00010\u00168\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b&\u0010\u0018\u001A\u0004\b\'\u0010\u001A\"\u0004\b(\u0010\u001CR\u0014\u0010-\u001A\u00020*8&X¦\u0004¢\u0006\u0006\u001A\u0004\b+\u0010,R\u0014\u00101\u001A\u00020.8&X¦\u0004¢\u0006\u0006\u001A\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/CommentModifyViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/BaseMviViewModel;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyEvent;", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyModel;", "<init>", "()V", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyModel;Lcom/kakao/tistory/presentation/view/comment/contract/CommentModifyIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isPinned", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "commentCompletion", "", "modifyComment", "(ZLcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)V", "Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;", "resultType", "sendActivityResultEvent", "(Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;Z)V", "", "k", "Ljava/lang/String;", "getBlogName", "()Ljava/lang/String;", "setBlogName", "(Ljava/lang/String;)V", "blogName", "", "l", "Ljava/lang/Long;", "getEntryId", "()Ljava/lang/Long;", "setEntryId", "(Ljava/lang/Long;)V", "entryId", "m", "getGuestPassword", "setGuestPassword", "guestPassword", "", "getModifyPageTitleResId", "()I", "modifyPageTitleResId", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "getCommentTiara", "()Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "commentTiara", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CommentModifyViewModel extends BaseMviViewModel {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/CommentModifyViewModel$Companion;", "", "", "COMMENT_MAX_LENGTH", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[ReplyType.values().length];
            try {
                arr_v[ReplyType.Mention.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public String k;
    public Long l;
    public String m;

    static {
        CommentModifyViewModel.Companion = new Companion(null);
        CommentModifyViewModel.$stable = 8;
    }

    public CommentModifyViewModel() {
        super(new CommentModifyModel(0, null, false, null, null, null, null, null, null, 0x1FF, null));
    }

    public static final boolean access$isReachCommentMaxLength(CommentModifyViewModel commentModifyViewModel0, String s) {
        commentModifyViewModel0.getClass();
        if(s.length() <= 1000) {
            return false;
        }
        commentModifyViewModel0.sendEvent(new ShowDialog(new DialogUIModel(string.label_reach_limit_comment_length, null, null, string.label_dialog_ok, false, null, null, 0x76, null)));
        return true;
    }

    public static final void access$onClickComplete(CommentModifyViewModel commentModifyViewModel0, boolean z, CommentCompletion commentCompletion0) {
        commentModifyViewModel0.getClass();
        if(!z) {
            commentModifyViewModel0.sendIntent(new WriteComplete(false, commentCompletion0));
            return;
        }
        commentModifyViewModel0.sendEvent(new ShowDialog(new DialogUIModel(string.label_dialog_pin_comment_write_alert_title, null, string.label_dialog_cancel, string.label_dialog_ok, true, null, new c2(commentModifyViewModel0, commentCompletion0), 34, null)));
    }

    public static final void access$onClickWriteModifyCloseButton(CommentModifyViewModel commentModifyViewModel0, boolean z) {
        commentModifyViewModel0.getClass();
        if(!z) {
            commentModifyViewModel0.sendEvent(new BackToList(null, 1, null));
            return;
        }
        commentModifyViewModel0.sendEvent(new ShowDialog(new DialogUIModel(string.label_dialog_comment_cancel_modification, string.label_dialog_comment_cancel_modification_message, string.label_dialog_no, string.label_dialog_confirm_cancel, true, null, new d2(commentModifyViewModel0), 0x20, null)));
    }

    @Nullable
    public final String getBlogName() {
        return this.k;
    }

    @NotNull
    public abstract BaseCommentTiara getCommentTiara();

    @Nullable
    public final Long getEntryId() {
        return this.l;
    }

    @Nullable
    public final String getGuestPassword() {
        return this.m;
    }

    public abstract int getModifyPageTitleResId();

    @Nullable
    public Object handleIntent(@NotNull CommentModifyModel commentModifyModel0, @NotNull CommentModifyIntent commentModifyIntent0, @NotNull Continuation continuation0) {
        if(Intrinsics.areEqual(commentModifyIntent0, Clear.INSTANCE)) {
            return new CommentModifyModel(0, null, false, null, null, null, null, null, null, 0x1FF, null);
        }
        if(commentModifyIntent0 instanceof Init) {
            int v = ((Init)commentModifyIntent0).getCommentItem().getParent() == null ? this.getModifyPageTitleResId() : string.label_reply_modify_title;
            this.k = ((Init)commentModifyIntent0).getBlogName();
            this.l = ((Init)commentModifyIntent0).getEntryId();
            this.m = ((Init)commentModifyIntent0).getGuestPassword();
            String s = ((Init)commentModifyIntent0).getCommentItem().getContent();
            if(s == null) {
                s = "";
            }
            boolean z = ((Init)commentModifyIntent0).getCommentItem().isSupport();
            CommentItem commentItemType$CommentItem0 = ((Init)commentModifyIntent0).getCommentItem();
            Long long0 = ((Init)commentModifyIntent0).getCommentItem().getMentionId();
            CommentItem commentItemType$CommentItem1 = long0 == null ? null : new CommentItem(long0.longValue(), null, ((Init)commentModifyIntent0).getCommentItem().getMentionUserName(), null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, 0xFFFFA, null);
            y1 y10 = new y1(this);
            z1 z10 = new z1(this);
            return new CommentModifyModel(v, s, !z, commentItemType$CommentItem0, commentItemType$CommentItem1, new a2(this), new b2(this), y10, z10);
        }
        if(commentModifyIntent0 instanceof WriteComplete) {
            this.modifyComment(((WriteComplete)commentModifyIntent0).isPinned(), ((WriteComplete)commentModifyIntent0).getCommentCompletion());
            return commentModifyModel0;
        }
        if(!(commentModifyIntent0 instanceof RemoveReply)) {
            throw new NoWhenBranchMatchedException();
        }
        return WhenMappings.$EnumSwitchMapping$0[((RemoveReply)commentModifyIntent0).getReplyType().ordinal()] == 1 ? CommentModifyModel.copy$default(commentModifyModel0, 0, null, false, null, null, null, null, null, null, 0x1EF, null) : commentModifyModel0;
    }

    @Override  // com.kakao.tistory.presentation.viewmodel.base.BaseMviViewModel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((CommentModifyModel)object0), ((CommentModifyIntent)object1), continuation0);
    }

    public abstract void modifyComment(boolean arg1, @NotNull CommentCompletion arg2);

    public void sendActivityResultEvent(@NotNull CommentActivityResultType commentActivityResultType0, boolean z) {
        Intrinsics.checkNotNullParameter(commentActivityResultType0, "resultType");
        this.sendEvent(new SetActivityResult(commentActivityResultType0, false));
    }

    public final void setBlogName(@Nullable String s) {
        this.k = s;
    }

    public final void setEntryId(@Nullable Long long0) {
        this.l = long0;
    }

    public final void setGuestPassword(@Nullable String s) {
        this.m = s;
    }
}

