package com.kakao.tistory.presentation.view.comment.guestbook;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.view.comment.CommentTiara;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001R\u001A\u0010\u0007\u001A\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001A\u0010\n\u001A\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/guestbook/GuestBookTiara;", "Lcom/kakao/tistory/presentation/view/comment/CommentTiara;", "", "a", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "section", "b", "getPage", "page", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GuestBookTiara extends CommentTiara {
    public static final int $stable;
    @NotNull
    public static final GuestBookTiara INSTANCE;
    public static final String a;
    public static final String b;

    static {
        GuestBookTiara.INSTANCE = new GuestBookTiara();
        GuestBookTiara.a = "방명록";
        GuestBookTiara.b = "방명록목록";
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.tistory.presentation.view.comment.CommentTiara
    @NotNull
    public String getPage() {
        return "방명록목록";
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.tistory.presentation.view.comment.CommentTiara
    @NotNull
    public String getSection() {
        return "방명록";
    }
}

