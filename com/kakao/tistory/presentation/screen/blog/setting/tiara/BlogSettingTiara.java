package com.kakao.tistory.presentation.screen.blog.setting.tiara;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.presentation.common.tiara.TiaraExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001A\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006R\u001A\u0010\f\u001A\u00020\u000B8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\u000B8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\r\u001A\u0004\b\u0011\u0010\u000F¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/setting/tiara/BlogSettingTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "TrackPage", "(Landroidx/compose/runtime/Composer;I)V", "trackClickComplete", "()V", "trackClickFinish", "trackClickImageSetting", "trackClickGallery", "trackClickImageDelete", "", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogSettingTiara implements TiaraPage {
    public static final int $stable;
    @NotNull
    public static final BlogSettingTiara INSTANCE;

    static {
        BlogSettingTiara.INSTANCE = new BlogSettingTiara();
    }

    @Composable
    public final void TrackPage(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD6700313);
        int v1 = (v & 14) == 0 ? (composer1.changed(this) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD6700313, v1, -1, "com.kakao.tistory.presentation.screen.blog.setting.tiara.BlogSettingTiara.TrackPage (BlogSettingTiara.kt:11)");
            }
            TiaraExtensionKt.TrackPage("블로그", "블로그설정", null, null, null, composer1, 0, 28);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(this, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickComplete() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그설정", TistoryTiaraActionType.CLICK_COMPLETE, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickFinish() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그설정", TistoryTiaraActionType.CLICK_CLOSE, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickGallery() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그설정", TistoryTiaraActionType.CLICK_GALLERY, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickImageDelete() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그설정", TistoryTiaraActionType.CLICK_IMAGE_DELETE, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickImageSetting() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그설정", TistoryTiaraActionType.CLICK_IMAGE_SETTING, null, null, null, null, null, 0xF8, null);
    }
}

