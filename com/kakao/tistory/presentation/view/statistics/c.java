package com.kakao.tistory.presentation.view.statistics;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.CommonTitleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function3 {
    public final RefererEtcListFragment a;

    public c(RefererEtcListFragment refererEtcListFragment0) {
        this.a = refererEtcListFragment0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$item");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x805E1747, v, -1, "com.kakao.tistory.presentation.view.statistics.RefererEtcListFragment.Content.<anonymous>.<anonymous> (RefererEtcListFragment.kt:68)");
        }
        String s = this.a.getString(string.label_statistics_referer_etc);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        CommonTitleKt.CommonTitleView(null, s, StringResources_androidKt.stringResource(string.label_top_rank, new Object[]{20}, ((Composer)object1), 0x40), null, null, ((Composer)object1), 0, 25);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

