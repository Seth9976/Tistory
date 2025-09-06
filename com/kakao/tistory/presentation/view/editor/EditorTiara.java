package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.x;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001A\u0010\n\u001A\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u001A\u0010\u000E\u001A\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000E\u0010\u000B\u001A\u0004\b\u000F\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/presentation/view/editor/EditorTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "entryId", "", "trackPage", "(J)V", "trackClickComplete", "()V", "", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EditorTiara implements TiaraPage {
    public static final int $stable;
    @NotNull
    public static final EditorTiara INSTANCE;

    static {
        EditorTiara.INSTANCE = new EditorTiara();
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickComplete() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "에디터", "에디터", TistoryTiaraActionType.CLICK_COMPLETE, null, null, null, null, null, 0xF8, null);
    }

    public final void trackPage(long v) {
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, "에디터", "에디터", null, null, null, x.mapOf(new Pair[]{TuplesKt.to("editType", (v == 0L ? "new" : "edit")), TuplesKt.to("entryType", "post")}), null, 92, null);
    }
}

