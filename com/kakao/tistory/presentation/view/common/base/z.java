package com.kakao.tistory.presentation.view.common.base;

import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.view.bottomsheet.BlogSwitchBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final TistoryToolbarActivity a;

    public z(TistoryToolbarActivity tistoryToolbarActivity0) {
        this.a = tistoryToolbarActivity0;
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
            ComposerKt.traceEventStart(-49007538, v, -1, "com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity.initAppBar.<anonymous>.<anonymous> (TistoryToolbarActivity.kt:98)");
        }
        Window window0 = this.a.getWindow();
        String s = this.a.getSection();
        if(s == null) {
            s = "";
        }
        BlogSwitchBottomSheetKt.BlogSwitchBottomSheetModal(window0, s, this.a.getPage(), TistoryToolbarActivity.access$getBlogSwitchViewModel(this.a), ((Composer)object0), 0x1008, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

