package com.kakao.tistory.presentation.screen.notification.ui;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function3 {
    public final Function0 a;
    public final Function0 b;

    public e(Function0 function00, Function0 function01) {
        this.a = function00;
        this.b = function01;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$TistoryComposeBottomSheet");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3B703D4, v, -1, "com.kakao.tistory.presentation.screen.notification.ui.DeleteBottomSheet.<anonymous> (DeleteBottomSheet.kt:14)");
        }
        Integer integer0 = drawable.ic_menu_delete;
        String s = StringResources_androidKt.stringResource(string.label_notification_delete, ((Composer)object1), 0);
        ((Composer)object1).startReplaceGroup(0x733B6AA8);
        boolean z = ((Composer)object1).changed(this.a);
        boolean z1 = ((Composer)object1).changed(this.b);
        Function0 function00 = this.a;
        Function0 function01 = this.b;
        d d0 = ((Composer)object1).rememberedValue();
        if(z || z1 || d0 == Composer.Companion.getEmpty()) {
            d0 = new d(function00, function01);
            ((Composer)object1).updateRememberedValue(d0);
        }
        ((Composer)object1).endReplaceGroup();
        TistoryComposeBottomSheetKt.BottomSheetItem(integer0, s, null, false, d0, ((Composer)object1), 0xC00, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

