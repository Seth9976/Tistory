package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainStatistics;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f2 extends Lambda implements Function4 {
    public final List a;
    public final BlogMainStatistics b;

    public f2(List list0, BlogMainStatistics blogMainStatistics0) {
        this.a = list0;
        this.b = blogMainStatistics0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((PagerScope)object0), "$this$HorizontalPager");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x37C68B04, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainStatistics.<anonymous>.<anonymous>.<anonymous> (BlogMainStatistics.kt:305)");
        }
        switch(((StatisticsType)this.a.get(v))) {
            case 1: {
                ((Composer)object2).startReplaceGroup(-1466537001);
                BlogMainStatisticsKt.access$Trend(this.b.getTrend(), ((Composer)object2), 0);
                ((Composer)object2).endReplaceGroup();
                break;
            }
            case 2: {
                ((Composer)object2).startReplaceGroup(0xA8967619);
                BlogMainStatisticsKt.access$RefererLog(this.b.getRefererLog(), ((Composer)object2), 0);
                ((Composer)object2).endReplaceGroup();
                break;
            }
            case 3: {
                ((Composer)object2).startReplaceGroup(0xA8968121);
                BlogMainStatisticsKt.access$RefererKeyword(this.b.getRefererKeyword(), ((Composer)object2), 0);
                ((Composer)object2).endReplaceGroup();
                break;
            }
            case 4: {
                ((Composer)object2).startReplaceGroup(0xA8968C13);
                BlogMainStatisticsKt.access$Revenue(this.b.getRevenue(), ((Composer)object2), 0);
                ((Composer)object2).endReplaceGroup();
                break;
            }
            default: {
                ((Composer)object2).startReplaceGroup(0x6A3BA16A);
                ((Composer)object2).endReplaceGroup();
            }
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

