package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function2 {
    public final TopViewModel a;
    public final StatisticsViewModel b;

    public f0(TopViewModel topViewModel0, StatisticsViewModel statisticsViewModel0) {
        this.a = topViewModel0;
        this.b = statisticsViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF70F7B37, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTopHeaderViewHolder.setStatisticsTopHeader.<anonymous>.<anonymous> (StatisticsTopHeaderViewHolder.kt:44)");
        }
        EntryItem entryItem0 = (EntryItem)this.b.getEntryItem().getValue();
        StatisticsTopHeaderViewHolderKt.access$StatisticsTopHeader(this.a, entryItem0, ((Composer)object0), 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

