package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.TTextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function3 {
    public static final a a;

    static {
        a.a = new a();
    }

    public a() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$RoundButton");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9D361619, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.ComposableSingletons$StatisticsRefererRankViewHolderKt.lambda-1.<anonymous> (StatisticsRefererRankViewHolder.kt:121)");
        }
        TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_statistics_referer_rank_see_detail, ((Composer)object1), 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), ((Composer)object1), 0, 0x180000, 0xFFFE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

