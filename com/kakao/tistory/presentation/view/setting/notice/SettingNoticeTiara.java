package com.kakao.tistory.presentation.view.setting.notice;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.tiara.TiaraExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001A\u0010\t\u001A\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\r\u001A\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\n\u001A\u0004\b\u000E\u0010\f¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/notice/SettingNoticeTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "TrackPage", "(Landroidx/compose/runtime/Composer;I)V", "", "title", "onClickNotice", "(Ljava/lang/String;)V", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SettingNoticeTiara implements TiaraPage {
    public static final int $stable;
    @NotNull
    public static final SettingNoticeTiara INSTANCE;

    static {
        SettingNoticeTiara.INSTANCE = new SettingNoticeTiara();
    }

    @Composable
    public final void TrackPage(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xA05BFF47);
        int v1 = (v & 14) == 0 ? (composer1.changed(this) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA05BFF47, v1, -1, "com.kakao.tistory.presentation.view.setting.notice.SettingNoticeTiara.TrackPage (SettingNoticeTiara.kt:11)");
            }
            TiaraExtensionKt.TrackPage("설정", "서비스공지", null, null, null, composer1, 0, 28);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(this, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void onClickNotice(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "title");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s, null, null, null, 0x3BF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "설정", "서비스공지", TistoryTiaraActionType.CLICK_ENTRY_ITEM, ActionKind.ClickContent, click0, null, null, null, 0xE0, null);
    }
}

