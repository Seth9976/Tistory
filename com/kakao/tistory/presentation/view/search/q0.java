package com.kakao.tistory.presentation.view.search;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.tistory.domain.entity.SearchItem.Keyword;
import com.kakao.tistory.presentation.R.drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function2 {
    public final Keyword a;

    public q0(Keyword searchItem$Keyword0) {
        this.a = searchItem$Keyword0;
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
            ComposerKt.traceEventStart(0xD3C6AF57, v, -1, "com.kakao.tistory.presentation.view.search.SearchItemIconButton.<anonymous> (SearchKeywordFragment.kt:182)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource((this.a.isRecentKeyword() ? drawable.ic_bar_close : drawable.ic_bar_suggest), ((Composer)object0), 0), null, AlphaKt.alpha(Modifier.Companion, 0.4f), 0L, ((Composer)object0), 440, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

