package com.kakao.tistory.presentation.view.comment.guestbook;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.usecase.UpdateGuestbookUseCase;
import com.kakao.tistory.presentation.view.comment.BaseCommentTiara;
import com.kakao.tistory.presentation.view.comment.CommentActivityResultType;
import com.kakao.tistory.presentation.view.comment.contract.CommentModifyEvent.SetActivityResult;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u0012\u001A\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookModifyViewModel;", "Lcom/kakao/tistory/presentation/view/comment/guestbook/GuestbookModifyViewModel;", "Lcom/kakao/tistory/domain/usecase/UpdateGuestbookUseCase;", "updateGuestbookUseCase", "<init>", "(Lcom/kakao/tistory/domain/usecase/UpdateGuestbookUseCase;)V", "Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;", "resultType", "", "isPinned", "", "sendActivityResultEvent", "(Lcom/kakao/tistory/presentation/view/comment/CommentActivityResultType;Z)V", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "p", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "getCommentTiara", "()Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "commentTiara", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PinGuestbookModifyViewModel extends GuestbookModifyViewModel {
    public static final int $stable = 8;
    public final PinGuestBookTiara p;

    @Inject
    public PinGuestbookModifyViewModel(@NotNull UpdateGuestbookUseCase updateGuestbookUseCase0) {
        Intrinsics.checkNotNullParameter(updateGuestbookUseCase0, "updateGuestbookUseCase");
        super(updateGuestbookUseCase0);
        this.p = PinGuestBookTiara.INSTANCE;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.GuestbookModifyViewModel
    @NotNull
    public BaseCommentTiara getCommentTiara() {
        return this.p;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentModifyViewModel
    public void sendActivityResultEvent(@NotNull CommentActivityResultType commentActivityResultType0, boolean z) {
        Intrinsics.checkNotNullParameter(commentActivityResultType0, "resultType");
        this.sendEvent(new SetActivityResult(commentActivityResultType0, z));
    }
}

