package com.kakao.tistory.presentation.view.leave;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004R\u001A\u0010\b\u001A\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\t\u001A\u0004\b\r\u0010\u000B¨\u0006\u000E"}, d2 = {"Lcom/kakao/tistory/presentation/view/leave/LeaveTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "trackPage", "()V", "trackClickAgreement", "trackClickLeave", "", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LeaveTiara implements TiaraPage {
    public static final int $stable;
    @NotNull
    public static final LeaveTiara INSTANCE;

    static {
        LeaveTiara.INSTANCE = new LeaveTiara();
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickAgreement() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "설정", "탈퇴하기", TistoryTiaraActionType.CLICK_SETTING_LEAVE_AGREEMENT, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickLeave() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "설정", "탈퇴하기", TistoryTiaraActionType.CLICK_SETTING_LEAVE_BUTTON, null, null, null, null, null, 0xF8, null);
    }

    public final void trackPage() {
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, "설정", "탈퇴하기", null, null, null, null, null, 0x7C, null);
    }
}

