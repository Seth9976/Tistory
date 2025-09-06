package com.kakao.tistory.presentation.screen.notification.tiara;

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
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u000F\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\f\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001D\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\u0007¢\u0006\u0004\b\u000F\u0010\rR\u001A\u0010\u0010\u001A\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0014\u001A\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001A\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/screen/notification/tiara/NotificationTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "trackPage", "(Landroidx/compose/runtime/Composer;I)V", "trackClickNotificationSort", "()V", "", "title", "trackClickNotificationSortItem", "(Ljava/lang/String;)V", "sortItem", "trackClickNotificationItem", "(Ljava/lang/String;Ljava/lang/String;)V", "id", "trackClickNotificationDelete", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class NotificationTiara implements TiaraPage {
    public static final int $stable;
    @NotNull
    public static final NotificationTiara INSTANCE;

    static {
        NotificationTiara.INSTANCE = new NotificationTiara();
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickNotificationDelete(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "id");
        Intrinsics.checkNotNullParameter(s1, "sortItem");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "챌린지 알림", "개별 알림", null, null, null, null, null, null, null, null, 1020, null);
        Map map0 = x.mapOf(new Pair[]{TuplesKt.to("id", s), TuplesKt.to("type", s1)});
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "알림", "알림", TistoryTiaraActionType.CLICK_NOTIFICATION_ITEM_DELETE, null, click0, null, map0, null, 0xA8, null);
    }

    public final void trackClickNotificationItem(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(s1, "sortItem");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s, null, null, null, 0x3BF, null);
        Map map0 = w.mapOf(TuplesKt.to("type", s1));
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "알림", "알림", TistoryTiaraActionType.CLICK_NOTIFICATION_ITEM, ActionKind.ClickContent, click0, null, map0, null, 0xA0, null);
    }

    public final void trackClickNotificationSort() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "알림", "알림", TistoryTiaraActionType.CLICK_SORT, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickNotificationSortItem(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "title");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s, null, null, null, 0x3BF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "알림", "알림", TistoryTiaraActionType.CLICK_SORT_ITEM, null, click0, null, null, null, 0xE8, null);
    }

    @Composable
    public final void trackPage(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xF68951A8);
        int v1 = (v & 14) == 0 ? (composer1.changed(this) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF68951A8, v1, -1, "com.kakao.tistory.presentation.screen.notification.tiara.NotificationTiara.trackPage (NotificationTiara.kt:11)");
            }
            TiaraExtensionKt.TrackPage("알림", "알림", null, ActionKind.ViewContentList, null, composer1, 0xC00, 20);
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
}

