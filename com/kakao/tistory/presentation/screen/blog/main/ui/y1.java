package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y1 extends Lambda implements Function3 {
    public final boolean a;
    public final boolean b;
    public final Function1 c;
    public final Function0 d;
    public final Function0 e;

    public y1(boolean z, boolean z1, Function1 function10, Function0 function00, Function0 function01) {
        this.a = z;
        this.b = z1;
        this.c = function10;
        this.d = function00;
        this.e = function01;
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
            ComposerKt.traceEventStart(0x6889D505, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainOthersMenuBottomSheet.<anonymous> (BlogMainOthersMenuBottomSheet.kt:21)");
        }
        String s = StringResources_androidKt.stringResource((this.a ? string.label_dialog_unblock : string.label_dialog_block), ((Composer)object1), 0);
        boolean z = this.b;
        ((Composer)object1).startReplaceGroup(661940627);
        boolean z1 = ((Composer)object1).changed(this.c);
        boolean z2 = ((Composer)object1).changed(this.a);
        boolean z3 = ((Composer)object1).changed(this.d);
        Function1 function10 = this.c;
        boolean z4 = this.a;
        Function0 function00 = this.d;
        w1 w10 = ((Composer)object1).rememberedValue();
        if((z1 | z2 | z3) != 0 || w10 == Composer.Companion.getEmpty()) {
            w10 = new w1(function10, z4, function00);
            ((Composer)object1).updateRememberedValue(w10);
        }
        ((Composer)object1).endReplaceGroup();
        TistoryComposeBottomSheetKt.BottomSheetItem(null, s, null, z, w10, ((Composer)object1), 0, 5);
        if(this.b) {
            String s1 = StringResources_androidKt.stringResource(string.label_blog_penalty, ((Composer)object1), 0);
            ((Composer)object1).startReplaceGroup(661950000);
            boolean z5 = ((Composer)object1).changed(this.e);
            boolean z6 = ((Composer)object1).changed(this.d);
            Function0 function01 = this.e;
            Function0 function02 = this.d;
            x1 x10 = ((Composer)object1).rememberedValue();
            if(z5 || z6 || x10 == Composer.Companion.getEmpty()) {
                x10 = new x1(function01, function02);
                ((Composer)object1).updateRememberedValue(x10);
            }
            ((Composer)object1).endReplaceGroup();
            TistoryComposeBottomSheetKt.BottomSheetItem(null, s1, null, false, x10, ((Composer)object1), 0xC00, 5);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

