package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.common.tiara.TiaraPage;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodType;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel.StatisticsSortType;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000B\bÇ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\r\u0010\fJ\u001D\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001A\u00020\u0004¢\u0006\u0004\b\u0012\u0010\bR\u001A\u0010\u0013\u001A\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0017\u001A\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/screen/revenue/RevenueTiara;", "Lcom/kakao/tistory/presentation/common/tiara/TiaraPage;", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "vendor", "", "trackPage", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;)V", "trackClickVendorMenu", "()V", "", "title", "trackClickVendor", "(Ljava/lang/String;)V", "trackClickPeriod", "Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "period", "trackClickGraph", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;)V", "trackClickCreator", "section", "Ljava/lang/String;", "getSection", "()Ljava/lang/String;", "page", "getPage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class RevenueTiara implements TiaraPage {
    public static final int $stable;
    @NotNull
    public static final RevenueTiara INSTANCE;

    static {
        RevenueTiara.INSTANCE = new RevenueTiara();
    }

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getPage() [...] // Inlined contents

    @Override  // com.kakao.tistory.presentation.common.tiara.TiaraPage
    @NotNull
    public String getSection() [...] // Inlined contents

    public final void trackClickCreator() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", "수익통계", TistoryTiaraActionType.CLICK_REVENUE_CREATOR, null, null, null, null, null, 0xF8, null);
    }

    public final void trackClickGraph(@NotNull String s, @NotNull GraphPeriodType graphPeriodType0) {
        Intrinsics.checkNotNullParameter(s, "vendor");
        Intrinsics.checkNotNullParameter(graphPeriodType0, "period");
        String s1 = graphPeriodType0.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s1, "toLowerCase(...)");
        String s2 = StatisticsSortType.Companion.capitalize(s1);
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, s, s2, null, null, null, null, null, null, null, null, 1020, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", "수익통계", TistoryTiaraActionType.CLICK_REVENUE_GRAPH, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickPeriod(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "title");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s, null, null, null, 0x3BF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", "수익통계", TistoryTiaraActionType.CLICK_REVENUE_PERIOD, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickVendor(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "title");
        Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, null, null, null, null, null, null, s, null, null, null, 0x3BF, null);
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", "수익통계", TistoryTiaraActionType.CLICK_REVENUE_VENDOR_SELECT_ITEM, null, click0, null, null, null, 0xE8, null);
    }

    public final void trackClickVendorMenu() {
        TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, "통계", "수익통계", TistoryTiaraActionType.CLICK_REVENUE_VENDOR_SELECT_MENU, null, null, null, null, null, 0xF8, null);
    }

    public final void trackPage(@NotNull Vendor vendor0) {
        Intrinsics.checkNotNullParameter(vendor0, "vendor");
        String s = vendor0.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
        Map map0 = w.mapOf(TuplesKt.to("adType", s));
        TistoryTiara.trackPage$default(TistoryTiara.INSTANCE, "통계", "수익통계", null, null, null, map0, null, 92, null);
    }
}

