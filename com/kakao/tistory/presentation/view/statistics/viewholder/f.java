package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.data.model.StatisticsItem.Title;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final Title a;
    public final EntryItem b;
    public final Function0 c;

    public f(Title statisticsItem$Title0, EntryItem entryItem0, Function0 function00) {
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
            ComposerKt.traceEventStart(-1456790475, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsItemHeaderViewHolder.setStatisticsItemHeader.<anonymous> (StatisticsItemHeaderViewHolder.kt:38)");
        }
        TistoryThemeKt.TistoryTheme(false, ComposableLambdaKt.rememberComposableLambda(0xD66B93BE, true, new e(this.a, this.b, this.c), ((Composer)object0), 54), ((Composer)object0), 0x30, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

