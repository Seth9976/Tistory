package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click;
import com.kakao.tiara.data.Meta;
import com.kakao.tistory.domain.blog.entity.BlogRoleType;
import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.common.tiara.TiaraExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import com.kakao.tistory.presentation.screen.blog.main.contract.RestrictType;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsType;
import com.kakao.tistory.presentation.screen.blog.navigation.FromRefer;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u00C7\u0002\u0018\u00002\u00020\u0001J\'\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b\t\u0010\nJ\u001F\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u000F\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\r\u00A2\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\b\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0014\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001A\u00020\b2\u0006\u0010\u0017\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001A\u001A\u00020\b\u00A2\u0006\u0004\b\u001A\u0010\u0012J\r\u0010\u001B\u001A\u00020\b\u00A2\u0006\u0004\b\u001B\u0010\u0012J\r\u0010\u001C\u001A\u00020\b\u00A2\u0006\u0004\b\u001C\u0010\u0012J\r\u0010\u001D\u001A\u00020\b\u00A2\u0006\u0004\b\u001D\u0010\u0012J\r\u0010\u001E\u001A\u00020\b\u00A2\u0006\u0004\b\u001E\u0010\u0012J\r\u0010\u001F\u001A\u00020\b\u00A2\u0006\u0004\b\u001F\u0010\u0012J\r\u0010 \u001A\u00020\b\u00A2\u0006\u0004\b \u0010\u0012J\r\u0010!\u001A\u00020\b\u00A2\u0006\u0004\b!\u0010\u0012J\r\u0010\"\u001A\u00020\b\u00A2\u0006\u0004\b\"\u0010\u0012J\r\u0010#\u001A\u00020\b\u00A2\u0006\u0004\b#\u0010\u0012J\r\u0010$\u001A\u00020\b\u00A2\u0006\u0004\b$\u0010\u0012J\u001D\u0010(\u001A\u00020\b2\u0006\u0010&\u001A\u00020%2\u0006\u0010\'\u001A\u00020%\u00A2\u0006\u0004\b(\u0010)J\u001D\u0010,\u001A\u00020\b2\u0006\u0010*\u001A\u00020\u00022\u0006\u0010+\u001A\u00020\r\u00A2\u0006\u0004\b,\u0010-J\u0015\u0010.\u001A\u00020\b2\u0006\u0010*\u001A\u00020\u0002\u00A2\u0006\u0004\b.\u0010\u0019J?\u00106\u001A\u00020\b2\u0006\u0010/\u001A\u00020\u00022\b\u00100\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001A\u00020\u00022\u0006\u00102\u001A\u0002012\u0006\u00104\u001A\u0002032\u0006\u00105\u001A\u00020\u0002\u00A2\u0006\u0004\b6\u00107J\r\u00108\u001A\u00020\b\u00A2\u0006\u0004\b8\u0010\u0012J\r\u00109\u001A\u00020\b\u00A2\u0006\u0004\b9\u0010\u0012J-\u0010<\u001A\u00020\b2\u0006\u0010:\u001A\u0002032\u0006\u00105\u001A\u00020\u00022\u0006\u0010;\u001A\u00020\u00022\u0006\u0010*\u001A\u00020\u0002\u00A2\u0006\u0004\b<\u0010=J\r\u0010>\u001A\u00020\b\u00A2\u0006\u0004\b>\u0010\u0012J\u0015\u0010?\u001A\u00020\b2\u0006\u00102\u001A\u000201\u00A2\u0006\u0004\b?\u0010@JA\u0010D\u001A\u00020\b2\u0006\u00105\u001A\u00020\u00022\u0006\u0010:\u001A\u0002032\u0006\u0010*\u001A\u00020\u00022\u0006\u0010;\u001A\u00020\u00022\b\u0010A\u001A\u0004\u0018\u00010\u00022\b\u0010C\u001A\u0004\u0018\u00010B\u00A2\u0006\u0004\bD\u0010EJ\r\u0010F\u001A\u00020\b\u00A2\u0006\u0004\bF\u0010\u0012J\r\u0010G\u001A\u00020\b\u00A2\u0006\u0004\bG\u0010\u0012J\r\u0010H\u001A\u00020\b\u00A2\u0006\u0004\bH\u0010\u0012J\r\u0010I\u001A\u00020\b\u00A2\u0006\u0004\bI\u0010\u0012J\r\u0010J\u001A\u00020\b\u00A2\u0006\u0004\bJ\u0010\u0012J\u0015\u0010M\u001A\u00020\b2\u0006\u0010L\u001A\u00020K\u00A2\u0006\u0004\bM\u0010NJ\r\u0010O\u001A\u00020\b\u00A2\u0006\u0004\bO\u0010\u0012R\u001A\u0010P\u001A\u00020\u00028\u0016X\u0096D\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010SR\u001A\u0010T\u001A\u00020\u00028\u0016X\u0096D\u00A2\u0006\f\n\u0004\bT\u0010Q\u001A\u0004\bU\u0010S\u00A8\u0006V"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/BlogMainTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "key", "Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;", "role", "Lcom/kakao/tistory/presentation/screen/blog/navigation/FromRefer;", "fromRefer", "", "TrackPage", "(Ljava/lang/String;Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;Lcom/kakao/tistory/presentation/screen/blog/navigation/FromRefer;Landroidx/compose/runtime/Composer;I)V", "TrackUsage", "(Ljava/lang/String;Lcom/kakao/tistory/domain/blog/entity/BlogRoleType;Landroidx/compose/runtime/Composer;I)V", "", "needBlock", "trackClickBlock", "(Z)V", "trackClickReport", "()V", "link", "label", "trackClickTopCategory", "(Ljava/lang/String;Ljava/lang/String;)V", "url", "trackClickShareUrl", "(Ljava/lang/String;)V", "trackClickDescriptionReadMore", "trackClickFollowerCount", "trackClickFollowingCount", "trackClickBlogSetting", "trackClickUnFollow", "trackClickFollow", "trackClickGuestBook", "trackClickStatisticsState", "trackClickStatisticsLog", "trackClickStatisticsKeyword", "trackClickStatisticsRevenue", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsType;", "from", "to", "trackClickStatisticsSwipe", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsType;Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsType;)V", "title", "isPreview", "trackClickChallengeBanner", "(Ljava/lang/String;Z)V", "trackClickChallengeAuth", "entryTitle", "image", "", "orderNum", "", "entryId", "blogName", "trackClickTopEntry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;)V", "trackClickTopEntryAll", "trackClickNoticeSeeAll", "id", "pLink", "trackClickNoticeItem", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "trackClickCategory", "trackClickCategoryItem", "(I)V", "thumbnail", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;", "restrictType", "trackClickEntryItem", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/blog/main/contract/RestrictType;)V", "trackLongClickEntryItem", "trackClickEntryModify", "trackClickEntryStatistics", "trackClickEntryDelete", "trackClickEntryVisibilityMenu", "Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;", "type", "trackClickEntryVisibility", "(Lcom/kakao/tistory/domain/blog/entity/EntryVisibilityType;)V", "trackClickPassword", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainTiara implements TiaraPage {
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
    public static final BlogMainTiara INSTANCE;

    static {
        BlogMainTiara.INSTANCE = new BlogMainTiara();
    }

    @Composable
    public final void TrackPage(@NotNull String s, @NotNull BlogRoleType blogRoleType0, @NotNull FromRefer fromRefer0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(blogRoleType0, "role");
        Intrinsics.checkNotNullParameter(fromRefer0, "fromRefer");
        Composer composer1 = composer0.startRestartGroup(0x3341EE48);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(blogRoleType0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(fromRefer0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(this) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3341EE48, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.BlogMainTiara.TrackPage (BlogMainTiara.kt:16)");
            }
            Locale locale0 = Locale.ROOT;
            String s1 = blogRoleType0.name().toLowerCase(locale0);
            Intrinsics.checkNotNullExpressionValue(s1, "toLowerCase(...)");
            Pair pair0 = TuplesKt.to("role", s1);
            String s2 = fromRefer0.name().toLowerCase(locale0);
            Intrinsics.checkNotNullExpressionValue(s2, "toLowerCase(...)");
            TiaraExtensionKt.TrackPage("블로그", "블로그탑", s, null, x.mapOf(new Pair[]{pair0, TuplesKt.to("refer", s2)}), composer1, v1 << 6 & 0x380, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g0(this, s, blogRoleType0, fromRefer0, v));
        }
    }

    @Composable
    public final void TrackUsage(@NotNull String s, @NotNull BlogRoleType blogRoleType0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(blogRoleType0, "role");
        Composer composer1 = composer0.startRestartGroup(-2099233350);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(blogRoleType0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(this) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2099233350, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.BlogMainTiara.TrackUsage (BlogMainTiara.kt:29)");
            }
            TiaraExtensionKt.TrackUsage("블로그", "블로그탑", "블로그탑 완독률", s, w.mapOf(TuplesKt.to("role", (blogRoleType0.getHasBlogRole() ? "owner" : "user"))), composer1, v1 << 9 & 0x1C00 | 0x180, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(this, s, blogRoleType0, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickBlock(boolean z) {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", (z ? TistoryTiaraActionType.CLICK_BLOG_TOP_BLOCK : TistoryTiaraActionType.CLICK_BLOG_TOP_UNBLOCK), null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickBlogSetting() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_TOP_SETTING, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickCategory() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_CATEGORY, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickCategoryItem(int v) {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, String.valueOf(v), null, null, null, null, 0x3DF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_CATEGORY_ITEM, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickChallengeAuth(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "title");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "챌린지", "카카오계정 본인인증", null, null, null, null, s, null, null, null, 956, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_TOP_CHALLENGE_AUTH, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickChallengeBanner(@NotNull String s, boolean z) {
        Intrinsics.checkNotNullParameter(s, "title");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "챌린지", "자세히 보기", null, null, null, null, s, null, null, null, 956, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_TOP_CHALLENGE_BANNER, null, click0, null, w.mapOf(TuplesKt.to("challengeActivity", (z ? "참여전" : "참여중"))), null, 0xA8, null);
    }

    public final void trackClickDescriptionReadMore() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_TOP_DESCRIPTION_READ_MORE, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickEntryDelete() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_DELETE, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickEntryItem(@NotNull String s, long v, @NotNull String s1, @NotNull String s2, @Nullable String s3, @Nullable RestrictType restrictType0) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "title");
        Intrinsics.checkNotNullParameter(s2, "pLink");
        Meta meta0 = TistoryTiara.createMeta$default(TistoryTiara.INSTANCE, String.valueOf(v), null, null, null, null, s, null, null, null, null, null, null, null, null, null, 0x7FDE, null);
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, s2, null, null, s1, s3, null, null, 823, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_ENTRY_ITEM, ActionKind.ClickContent, click0, meta0, w.mapOf(TuplesKt.to("isRestricted", (restrictType0 == null ? "no" : "restricted"))), null, 0x80, null);
    }

    public final void trackClickEntryModify() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_MODIFY, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickEntryStatistics() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_STATISTICS, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickEntryVisibility(@NotNull EntryVisibilityType entryVisibilityType0) {
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
        TistoryTiara.trackClick$default(tistoryTiara0, "블로그", "블로그탑", tistoryTiaraActionType0, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickEntryVisibilityMenu() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_VISIBILITY_MENU, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickFollow() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_FOLLOW, ActionKind.Follow, null, null, null, null, 0xF0, null);
    }

    public final void trackClickFollowerCount() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_TOP_FOLLOWER_COUNT, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickFollowingCount() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_TOP_FOLLOWING_COUNT, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickGuestBook() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_TOP_GUEST_BOOK, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickNoticeItem(long v, @NotNull String s, @NotNull String s1, @NotNull String s2) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(s1, "pLink");
        Intrinsics.checkNotNullParameter(s2, "title");
        Meta meta0 = TistoryTiara.createMeta$default(TistoryTiara.INSTANCE, String.valueOf(v), null, null, null, null, s, null, null, null, null, null, null, null, null, null, 0x7FDE, null);
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, s1, null, null, s2, null, null, null, 951, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_NOTICE_ITEM, ActionKind.ClickContent, click0, meta0, null, null, 0xC0, null);
    }

    public final void trackClickNoticeSeeAll() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_NOTICE_SEE_ALL, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickPassword() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_VISIBILITY_PROTECTED_PASSWORD, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickReport() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_TOP_REPORT, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickShareUrl(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, s, null, null, null, null, null, null, 0x3F7, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_TOP_SHARE_URL, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickStatisticsKeyword() {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "statistics", "keyword", null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_STATISTICS_KEYWORD, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickStatisticsLog() {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "statistics", "ref_log", null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_STATISTICS_LOG, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickStatisticsRevenue() {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "statistics", "revenue", null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_STATISTICS_REVENUE, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickStatisticsState() {
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "statistics", "blogstat", null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_STATISTICS_STAT, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickStatisticsSwipe(@NotNull StatisticsType statisticsType0, @NotNull StatisticsType statisticsType1) {
        Intrinsics.checkNotNullParameter(statisticsType0, "from");
        Intrinsics.checkNotNullParameter(statisticsType1, "to");
        Map map0 = x.mapOf(new Pair[]{TuplesKt.to("from", statisticsType0.getValue()), TuplesKt.to("to", statisticsType1.getValue())});
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_STATISTICS_SWIPE, null, null, null, map0, null, 0xB8, null);
    }

    public final void trackClickTopCategory(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "link");
        Intrinsics.checkNotNullParameter(s1, "label");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "blog_top", "story_creator_open", null, s, null, null, s1, null, null, null, 948, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_BLOG_TOP_CATEGORY, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickTopEntry(@NotNull String s, @Nullable String s1, @NotNull String s2, int v, long v1, @NotNull String s3) {
        Intrinsics.checkNotNullParameter(s, "entryTitle");
        Intrinsics.checkNotNullParameter(s2, "url");
        Intrinsics.checkNotNullParameter(s3, "blogName");
        Meta meta0 = TistoryTiara.createMeta$default(TistoryTiara.INSTANCE, String.valueOf(v1), null, null, null, null, s3, null, null, null, null, null, null, null, null, null, 0x7FDE, null);
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, s2, null, String.valueOf(v), s, s1, null, null, 791, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_TOP_ENTRY, ActionKind.ClickContent, click0, meta0, null, null, 0xC0, null);
    }

    public final void trackClickTopEntryAll() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_TOP_ENTRY_ALL, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickUnFollow() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.CLICK_FOLLOW_CANCEL, null, null, null, null, null, 0xF8, null);
    }

    public final void trackLongClickEntryItem() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "블로그", "블로그탑", TistoryTiaraActionType.LONG_CLICK_ENTRY_ITEM, null, null, null, null, null, 0xF8, null);
    }
}

