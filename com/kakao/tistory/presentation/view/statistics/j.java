package com.kakao.tistory.presentation.view.statistics;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final EntryItem a;
    public final StatisticsActivity b;

    public j(EntryItem entryItem0, StatisticsActivity statisticsActivity0) {
        this.a = entryItem0;
        this.b = statisticsActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s1;
        StatisticsTiara statisticsTiara0 = StatisticsTiara.INSTANCE;
        String s = String.valueOf(this.a.getId());
        Blog blog0 = this.a.getBlog();
        if(blog0 == null) {
            s1 = null;
        }
        else {
            Long long0 = blog0.getId();
            s1 = long0 == null ? null : long0.toString();
        }
        statisticsTiara0.trackClickEntryView(s, s1);
        NavigatorExtensionKt.goToEntryView(this.b, this.a, true, 0x24000000);
        return Unit.INSTANCE;
    }
}

