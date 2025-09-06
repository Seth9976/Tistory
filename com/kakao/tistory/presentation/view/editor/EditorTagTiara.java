package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u000B\bÇ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\b\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u001A\u0010\u000B\u001A\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u001A\u0010\u000F\u001A\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u000F\u0010\f\u001A\u0004\b\u0010\u0010\u000E¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/view/editor/EditorTagTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "trackPage", "()V", "trackClickRecentTag", "", "tag", "trackAddTag", "(Ljava/lang/String;)V", "trackRemoveTag", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EditorTagTiara implements TiaraPage {
    public static final int $stable;
    @NotNull
    public static final EditorTagTiara INSTANCE;

    static {
        EditorTagTiara.INSTANCE = new EditorTagTiara();
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackAddTag(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "tag");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s, null, null, null, 0x3BF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "태그입력", "태그_추가", null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickRecentTag() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "태그입력", TistoryTiaraActionType.CLICK_RECENT_TAG, null, null, null, null, null, 0xF8, null);
    }

    public final void trackPage() {
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, "에디터", "태그입력", null, null, null, null, null, 0x7C, null);
    }

    public final void trackRemoveTag(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "tag");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s, null, null, null, 0x3BF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "태그입력", "태그_삭제", null, click0, null, null, null, 0xE8, null);
    }
}

