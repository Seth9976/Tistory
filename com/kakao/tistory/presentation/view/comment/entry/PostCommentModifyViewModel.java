package com.kakao.tistory.presentation.view.comment.entry;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.usecase.PutCommentUseCase;
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
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0014¢\u0006\u0004\b\u000B\u0010\fR$\u0010\u0014\u001A\u0004\u0018\u00010\r8\u0004@\u0004X\u0084\u000E¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001A\u0010\u001A\u001A\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001E\u001A\u00020\u001B8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u001D¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentModifyViewModel;", "Lcom/kakao/tistory/presentation/view/comment/CommentModifyViewModel;", "Lcom/kakao/tistory/domain/usecase/PutCommentUseCase;", "putCommentUseCase", "<init>", "(Lcom/kakao/tistory/domain/usecase/PutCommentUseCase;)V", "", "isPinned", "Lcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;", "commentCompletion", "", "modifyComment", "(ZLcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)V", "", "o", "Ljava/lang/Long;", "getBlogId", "()Ljava/lang/Long;", "setBlogId", "(Ljava/lang/Long;)V", "blogId", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "p", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "getCommentTiara", "()Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "commentTiara", "", "getModifyPageTitleResId", "()I", "modifyPageTitleResId", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class PostCommentModifyViewModel extends CommentModifyViewModel {
    public static final int $stable = 8;
    public final PutCommentUseCase n;
    public Long o;
    public final PostCommentTiara p;

    @Inject
    public PostCommentModifyViewModel(@NotNull PutCommentUseCase putCommentUseCase0) {
        Intrinsics.checkNotNullParameter(putCommentUseCase0, "putCommentUseCase");
        super();
        this.n = putCommentUseCase0;
        this.p = PostCommentTiara.INSTANCE;
    }

    @Nullable
    public final Long getBlogId() {
        return this.o;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentModifyViewModel
    @NotNull
    public BaseCommentTiara getCommentTiara() {
        return this.p;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentModifyViewModel
    public int getModifyPageTitleResId() {
        return string.label_comment_modify_title;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentModifyViewModel
    public void modifyComment(boolean z, @NotNull CommentCompletion commentCompletion0) {
        Intrinsics.checkNotNullParameter(commentCompletion0, "commentCompletion");
        String s = this.getBlogName();
        if(s == null) {
            return;
        }
        Long long0 = this.getEntryId();
        if(long0 != null) {
            long v = (long)long0;
            Long long1 = commentCompletion0.getCommentId();
            if(long1 != null) {
                long v1 = (long)long1;
                Long long2 = commentCompletion0.getMentionId();
                String s1 = commentCompletion0.getText();
                boolean z1 = commentCompletion0.isSecret();
                if(s1.length() == 0) {
                    return;
                }
                this.getCommentTiara().trackClickModifyComplete(z1);
                String s2 = StringsKt__StringsKt.trim(s1).toString();
                this.isShowProgress().postValue(Boolean.TRUE);
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e(this, s, v, v1, s2, long2, z1, z, null), 3, null);
            }
        }
    }

    public final void setBlogId(@Nullable Long long0) {
        this.o = long0;
    }
}

