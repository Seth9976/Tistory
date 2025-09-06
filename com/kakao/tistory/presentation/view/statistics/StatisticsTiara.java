package com.kakao.tistory.presentation.view.statistics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click;
import com.kakao.tiara.data.Meta;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel.StatisticsSortType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001C\bÇ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u0004¢\u0006\u0004\b\u000E\u0010\bJ\u0015\u0010\u000F\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u0004¢\u0006\u0004\b\u000F\u0010\u0010J)\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\u0010\u0011\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0014\u0010\fJ\r\u0010\u0015\u001A\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nJ\r\u0010\u0016\u001A\u00020\u0006¢\u0006\u0004\b\u0016\u0010\nJ\u001F\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u00042\b\u0010\u0018\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001AJ\r\u0010\u001B\u001A\u00020\u0006¢\u0006\u0004\b\u001B\u0010\nR\u001A\u0010\u001C\u001A\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u001A\u0010 \u001A\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010\u001D\u001A\u0004\b!\u0010\u001F¨\u0006\""}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/StatisticsTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "", "isBlog", "", "period", "", "trackPage", "(ZLjava/lang/String;)V", "trackClickMetric", "()V", "trackClickPeriod", "(Z)V", "title", "trackClickPeriodItem", "trackClickMetricItem", "(Ljava/lang/String;)V", "metric", "trackClickGraphItem", "(ZLjava/lang/String;Ljava/lang/String;)V", "trackClickRefererEtc", "trackClickTopPost", "trackClickTopPostSeeAll", "entryId", "blogName", "trackClickEntryView", "(Ljava/lang/String;Ljava/lang/String;)V", "trackClickRefererKeyword", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class StatisticsTiara implements TiaraPage {
    public static final int $stable;
    @NotNull
    public static final StatisticsTiara INSTANCE;

    static {
        StatisticsTiara.INSTANCE = new StatisticsTiara();
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickEntryView(@NotNull String s, @Nullable String s1) {
        Intrinsics.checkNotNullParameter(s, "entryId");
        Meta meta0 = TistoryTiara.createMeta$default(TistoryTiara.INSTANCE, s, null, null, null, null, s1, null, null, null, null, null, null, null, null, null, 0x7FDE, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", "글통계", TistoryTiaraActionType.CLICK_SEE_ENTRY_VIEW, ActionKind.ClickContent, null, meta0, null, null, 0xD0, null);
    }

    public final void trackClickGraphItem(boolean z, @Nullable String s, @Nullable String s1) {
        Click click0;
        if(s != null && s1 != null) {
            if(z) {
                String s2 = StatisticsSortType.Companion.capitalize(s);
                String s3 = s1.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(s3, "toUpperCase(...)");
                click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, s2, s3, null, null, null, null, null, null, null, null, 1020, null);
            }
            else {
                String s4 = StatisticsSortType.Companion.capitalize(s);
                click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, s4, null, null, null, null, null, null, null, null, null, 0x3FE, null);
            }
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", (z ? "블로그통계" : "글통계"), TistoryTiaraActionType.CLICK_STATISTICS_GRAPH_ITEM, null, click0, null, null, null, 0xE8, null);
        }
    }

    public final void trackClickMetric() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", "블로그통계", TistoryTiaraActionType.CLICK_STATISTICS_METRIC, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickMetricItem(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "title");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s, null, null, null, 0x3BF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", "블로그통계", TistoryTiaraActionType.CLICK_METRIC_SORT_ITEM, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickPeriod(boolean z) {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", (z ? "블로그통계" : "글통계"), TistoryTiaraActionType.CLICK_PERIOD_SORT, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickPeriodItem(boolean z, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "title");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s, null, null, null, 0x3BF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", (z ? "블로그통계" : "글통계"), TistoryTiaraActionType.CLICK_PERIOD_SORT_ITEM, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickRefererEtc(boolean z) {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", (z ? "블로그통계" : "글통계"), TistoryTiaraActionType.CLICK_REFERER_ETC, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickRefererKeyword() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", "글통계", TistoryTiaraActionType.CLICK_REFERER_KEYWORD, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickTopPost() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", "블로그통계", TistoryTiaraActionType.CLICK_TOP_ENTRY, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickTopPostSeeAll() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", "블로그통계", TistoryTiaraActionType.CLICK_TOP_ENTRY_ALL, null, null, null, null, null, 0xF8, null);
    }

    public final void trackPage(boolean z, @NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "period");
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, "통계", (z ? "블로그통계" : "글통계"), null, null, null, null, null, 0x7C, null);
    }
}

