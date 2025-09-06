package com.kakao.tistory.presentation.screen.blog.noticeList;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.common.tiara.TiaraExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\u000B\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u000E\u001A\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0012\u001A\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u000F\u001A\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/noticeList/BlogNoticeListTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "TrackPage", "(Landroidx/compose/runtime/Composer;I)V", "trackClickNoticeStatistics", "()V", "trackClickNoticeModify", "trackClickNoticeDelete", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "type", "trackClickNoticeVisibility", "(Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;)V", "", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogNoticeListTiara implements TiaraPage {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[EntryVisibilityType.values().length];
            try {
                arr_v[EntryVisibilityType.PUBLIC.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EntryVisibilityType.PROTECTED.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[EntryVisibilityType.PRIVATE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    @NotNull
    public static final BlogNoticeListTiara INSTANCE;

    static {
        BlogNoticeListTiara.INSTANCE = new BlogNoticeListTiara();
    }

    @Composable
    public final void TrackPage(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-932099100);
        int v1 = (v & 14) == 0 ? (composer1.changed(this) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-932099100, v1, -1, "com.kakao.tistory.presentation.screen.blog.noticeList.BlogNoticeListTiara.TrackPage (BlogNoticeListTiara.kt:12)");
            }
            TiaraExtensionKt.TrackPage("블로그", "블로그공지목록", null, null, null, composer1, 0, 28);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(this, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickNoticeDelete() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그공지목록", TistoryTiaraActionType.CLICK_DELETE, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickNoticeModify() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그공지목록", TistoryTiaraActionType.CLICK_MODIFY, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickNoticeStatistics() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그공지목록", TistoryTiaraActionType.CLICK_STATISTICS, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickNoticeVisibility(@NotNull EntryVisibilityType entryVisibilityType0) {
        TistoryTiaraActionType tistoryTiaraActionType0;
        Intrinsics.checkNotNullParameter(entryVisibilityType0, "type");
        TistoryTiara tistoryTiara0 = TistoryTiara.INSTANCE;
        switch(WhenMappings.$EnumSwitchMapping$0[entryVisibilityType0.ordinal()]) {
            case 1: {
                tistoryTiaraActionType0 = TistoryTiaraActionType.CLICK_VISIBILITY_PUBLIC;
                break;
            }
            case 2: {
                tistoryTiaraActionType0 = TistoryTiaraActionType.CLICK_VISIBILITY_PROTECTED;
                break;
            }
            case 3: {
                tistoryTiaraActionType0 = TistoryTiaraActionType.CLICK_VISIBILITY_PRIVATE;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        TistoryTiara.trackClick$default(tistoryTiara0, "블로그", "블로그공지목록", tistoryTiaraActionType0, null, null, null, null, null, 0xF8, null);
    }
}

