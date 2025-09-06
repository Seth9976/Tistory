package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k4 extends Lambda implements Function2 {
    public static final k4 a;

    static {
        k4.a = new k4();
    }

    public k4() {
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
            ComposerKt.traceEventStart(0xDD04E46A, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ComposableSingletons$BlogMainStatisticsRefererKeywordKt.lambda-1.<anonymous> (BlogMainStatisticsRefererKeyword.kt:26)");
        }
        j4 j40 = j4.a;
        ArrayList arrayList0 = new ArrayList(4);
        for(int v1 = 0; v1 < 4; ++v1) {
            arrayList0.add(new Data("keyword ", v1));
        }
        BlogMainStatisticsRefererKeywordKt.BlogMainStatisticsRefererKeyword(new RefererKeyword(j40, arrayList0), ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

