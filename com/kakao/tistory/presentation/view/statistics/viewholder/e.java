package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.data.model.StatisticsItem.Title;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final Title a;
    public final EntryItem b;
    public final Function0 c;

    public e(Title statisticsItem$Title0, EntryItem entryItem0, Function0 function00) {
        this.a = statisticsItem$Title0;
        this.b = entryItem0;
        this.c = function00;
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
            ComposerKt.traceEventStart(0xD66B93BE, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsItemHeaderViewHolder.setStatisticsItemHeader.<anonymous>.<anonymous> (StatisticsItemHeaderViewHolder.kt:39)");
        }
        StatisticsItemHeaderViewHolderKt.access$StatisticsItemHeader(this.a, this.b, this.c, ((Composer)object0), 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

