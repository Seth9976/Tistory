package com.kakao.tistory.presentation.view.comment.guestbook;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.usecase.UpdateGuestbookUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.comment.BaseCommentTiara;
import com.kakao.tistory.presentation.view.comment.CommentModifyViewModel;
import com.kakao.tistory.presentation.view.entry.widget.CommentCompletion;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0014¢\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u0012\u001A\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001A\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/guestbook/GuestbookModifyViewModel;", "Lcom/kakao/tistory/presentation/view/comment/CommentModifyViewModel;", "Lcom/kakao/tistory/domain/usecase/UpdateGuestbookUseCase;", "updateGuestbookUseCase", "<init>", "(Lcom/kakao/tistory/domain/usecase/UpdateGuestbookUseCase;)V", "", "isPinned", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "commentCompletion", "", "modifyComment", "(ZLcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)V", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "o", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "getCommentTiara", "()Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "commentTiara", "", "getModifyPageTitleResId", "()I", "modifyPageTitleResId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class GuestbookModifyViewModel extends CommentModifyViewModel {
    public static final int $stable = 8;
    public final UpdateGuestbookUseCase n;
    public final GuestBookTiara o;

    @Inject
    public GuestbookModifyViewModel(@NotNull UpdateGuestbookUseCase updateGuestbookUseCase0) {
        Intrinsics.checkNotNullParameter(updateGuestbookUseCase0, "updateGuestbookUseCase");
        super();
        this.n = updateGuestbookUseCase0;
        this.o = GuestBookTiara.INSTANCE;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentModifyViewModel
    @NotNull
    public BaseCommentTiara getCommentTiara() {
        return this.o;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentModifyViewModel
    public int getModifyPageTitleResId() {
        return string.label_guestbook_modify_title;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentModifyViewModel
    public void modifyComment(boolean z, @NotNull CommentCompletion commentCompletion0) {
        Intrinsics.checkNotNullParameter(commentCompletion0, "commentCompletion");
        String s = this.getBlogName();
        if(s == null) {
            return;
        }
        Long long0 = commentCompletion0.getCommentId();
        if(long0 != null) {
            long v = (long)long0;
            Long long1 = commentCompletion0.getMentionId();
            boolean z1 = commentCompletion0.isSecret();
            String s1 = commentCompletion0.getText();
            if(s1.length() == 0) {
                return;
            }
            String s2 = StringsKt__StringsKt.trim(s1).toString();
            this.isShowProgress().postValue(Boolean.TRUE);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(this, s, v, s2, long1, z1, z, null), 3, null);
        }
    }
}

