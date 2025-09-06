package com.kakao.tistory.presentation.screen.feed.tiara;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000F\bÇ\u0002\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0005\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J[\u0010\u0014\u001A\u00020\u00022\b\u0010\n\u001A\u0004\u0018\u00010\t2\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\u0010\r\u001A\u0004\u0018\u00010\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\t2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000B2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\u0012\u001A\u00020\u00112\b\u0010\u0013\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001A\u00020\u00022\b\u0010\u0016\u001A\u0004\u0018\u00010\u000B2\b\u0010\u0017\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001A\u001A\u00020\u000B8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u001A\u0010\u001E\u001A\u00020\u000B8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001E\u0010\u001B\u001A\u0004\b\u001F\u0010\u001D¨\u0006 "}, d2 = {"Lcom/kakao/tistory/presentation/screen/feed/tiara/FeedTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "TrackPage", "(Landroidx/compose/runtime/Composer;I)V", "TrackUsage", "trackClickFollowing", "()V", "trackClickFollower", "", "id", "", "title", "imageUrl", "categoryId", "categoryLabel", "provider", "", "orderNum", "clickUrl", "trackClickEntry", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "blogName", "blogUrl", "trackClickBlog", "(Ljava/lang/String;Ljava/lang/String;)V", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FeedTiara implements TiaraPage {
    public static final int $stable;
    @NotNull
    public static final FeedTiara INSTANCE;

    static {
        FeedTiara.INSTANCE = new FeedTiara();
    }

    @Composable
    public final void TrackPage(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x18B8661);
        int v1 = (v & 14) == 0 ? (composer1.changed(this) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x18B8661, v1, -1, "com.kakao.tistory.presentation.screen.feed.tiara.FeedTiara.TrackPage (FeedTiara.kt:11)");
            }
            TiaraExtensionKt.TrackPage("피드", "피드", ActionKind.ViewContentList, null, null, composer1, 0x180, 24);
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

    @Composable
    public final void TrackUsage(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x4D170A9);
        int v1 = (v & 14) == 0 ? (composer1.changed(this) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4D170A9, v1, -1, "com.kakao.tistory.presentation.screen.feed.tiara.FeedTiara.TrackUsage (FeedTiara.kt:16)");
            }
            TiaraExtensionKt.TrackUsage("피드", "피드", "피드 완독률", null, null, composer1, 0x180, 24);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(this, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickBlog(@Nullable String s, @Nullable String s1) {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, s1, null, null, s, null, null, null, 951, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "피드", "피드", TistoryTiaraActionType.CLICK_BLOG_OF_ENTRY, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickEntry(@Nullable Long long0, @Nullable String s, @Nullable String s1, @Nullable Long long1, @Nullable String s2, @Nullable String s3, int v, @Nullable String s4) {
        TistoryTiara tistoryTiara0 = TistoryTiara.INSTANCE;
        TistoryTiaraActionType tistoryTiaraActionType0 = TistoryTiaraActionType.CLICK_ENTRY_ITEM;
        ActionKind actionKind0 = ActionKind.ClickContent;
        Click click0 = TistoryTiara.createClick$default(tistoryTiara0, null, null, null, s4, null, String.valueOf(v), s, s1, null, null, 791, null);
        String s5 = null;
        String s6 = long0 == null ? null : long0.toString();
        if(long1 != null) {
            s5 = long1.toString();
        }
        TistoryTiara.trackClick$default(tistoryTiara0, "피드", "피드", tistoryTiaraActionType0, actionKind0, click0, TistoryTiara.createMeta$default(tistoryTiara0, s6, null, s, s2, s5, s3, null, null, null, null, null, null, null, s4, null, 0x5FC2, null), null, null, 0xC0, null);
    }

    public final void trackClickFollower() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "피드", "피드", TistoryTiaraActionType.CLICK_FOLLOWER, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickFollowing() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "피드", "피드", TistoryTiaraActionType.CLICK_FOLLOWING, null, null, null, null, null, 0xF8, null);
    }
}

