package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.design.ui.list.BlogTitleKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Best;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function3 {
    public final Best a;

    public g(Best homeSlotUiStateContent$Best0) {
        this.a = homeSlotUiStateContent$Best0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        boolean z = ((Boolean)object0).booleanValue();
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(z) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2049038013, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.BestContent.<anonymous> (Best.kt:58)");
        }
        BlogTitleKt.BlogTitleWithIndex(this.a.getRank(), this.a.getBlogTitle(), this.a.getOnClickBlog(), z, ((Composer)object1), v << 9 & 0x1C00, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

