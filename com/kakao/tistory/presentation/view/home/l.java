package com.kakao.tistory.presentation.view.home;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.widget.CommonTitleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function3 {
    public final RefererLogListActivity a;

    public l(RefererLogListActivity refererLogListActivity0) {
        this.a = refererLogListActivity0;
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
            ComposerKt.traceEventStart(0x517281A8, v, -1, "com.kakao.tistory.presentation.view.home.RefererLogListActivity.RefererLogList.<anonymous>.<anonymous> (RefererLogListActivity.kt:85)");
        }
        CommonTitleKt.TitleWithCategoryView(null, RefererLogListActivity.access$getTopViewModel(this.a), null, ((Composer)object1), 0x40, 5);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

