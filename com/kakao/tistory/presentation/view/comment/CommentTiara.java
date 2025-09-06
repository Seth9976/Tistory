package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\b\'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\bR\u001A\u0010\t\u001A\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001A\u0004\b\n\u0010\b¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/CommentTiara;", "Lcom/kakao/tistory/presentation/view/comment/BaseCommentTiara;", "<init>", "()V", "", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CommentTiara implements BaseCommentTiara {
    public static final int $stable;

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() {
        return "댓글목록";
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() {
        return "댓글";
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackCLickDelete() {
        DefaultImpls.trackCLickDelete(this);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackCLickModify() {
        DefaultImpls.trackCLickModify(this);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackClickLoadMore() {
        DefaultImpls.trackClickLoadMore(this);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackClickModifyComplete(boolean z) {
        DefaultImpls.trackClickModifyComplete(this, z);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackClickPin() {
        DefaultImpls.trackClickPin(this);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackClickProfile() {
        DefaultImpls.trackClickProfile(this);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackClickReply() {
        DefaultImpls.trackClickReply(this);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackClickReport() {
        DefaultImpls.trackClickReport(this);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackClickReportComplete(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3) {
        DefaultImpls.trackClickReportComplete(this, s, s1, s2, s3);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackClickUnPin() {
        DefaultImpls.trackClickUnPin(this);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackClickUserName() {
        DefaultImpls.trackClickUserName(this);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackClickWriteComplete(@NotNull String s, @NotNull String s1, @NotNull String s2, @NotNull String s3, @NotNull String s4, @Nullable String s5, @Nullable Long long0, boolean z) {
        DefaultImpls.trackClickWriteComplete(this, s, s1, s2, s3, s4, s5, long0, z);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.BaseCommentTiara
    public void trackPage() {
        DefaultImpls.trackPage(this);
    }
}

