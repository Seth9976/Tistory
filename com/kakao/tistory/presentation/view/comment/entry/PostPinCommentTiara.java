package com.kakao.tistory.presentation.view.comment.entry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.view.comment.CommentTiara;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001R\u001A\u0010\u0007\u001A\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001A\u0010\n\u001A\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/entry/PostPinCommentTiara;", "Lcom/kakao/tistory/presentation/view/comment/CommentTiara;", "", "a", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "section", "b", "getPage", "page", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PostPinCommentTiara extends CommentTiara {
    public static final int $stable;
    @NotNull
    public static final PostPinCommentTiara INSTANCE;
    public static final String a;
    public static final String b;

    static {
        PostPinCommentTiara.INSTANCE = new PostPinCommentTiara();
        PostPinCommentTiara.a = "댓글";
        PostPinCommentTiara.b = "고정댓글_별도";
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.tistory.presentation.view.comment.CommentTiara
    @NotNull
    public String getPage() {
        return "고정댓글_별도";
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.tistory.presentation.view.comment.CommentTiara
    @NotNull
    public String getSection() {
        return "댓글";
    }
}

