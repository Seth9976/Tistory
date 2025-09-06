package com.kakao.tistory.presentation.screen.blog.setting.ui;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function3 {
    public final Function0 a;
    public final Function0 b;
    public final Function0 c;

    public k(Function0 function00, Function0 function01, Function0 function02) {
        this.a = function00;
        this.b = function01;
        this.c = function02;
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
            ComposerKt.traceEventStart(-1524807073, v, -1, "com.kakao.tistory.presentation.screen.blog.setting.ui.ImageBottomSheet.<anonymous> (ImageBottomSheet.kt:13)");
        }
        String s = StringResources_androidKt.stringResource(string.label_blog_setting_bottom_dialog_gallery, ((Composer)object1), 0);
        ((Composer)object1).startReplaceGroup(-205347960);
        boolean z = ((Composer)object1).changed(this.a);
        boolean z1 = ((Composer)object1).changed(this.b);
        Function0 function00 = this.a;
        Function0 function01 = this.b;
        i i0 = ((Composer)object1).rememberedValue();
        if(z || z1 || i0 == Composer.Companion.getEmpty()) {
            i0 = new i(function00, function01);
            ((Composer)object1).updateRememberedValue(i0);
        }
        ((Composer)object1).endReplaceGroup();
        TistoryComposeBottomSheetKt.BottomSheetItem(null, s, null, false, i0, ((Composer)object1), 0, 13);
        String s1 = StringResources_androidKt.stringResource(string.label_blog_setting_bottom_dialog_delete_image, ((Composer)object1), 0);
        ((Composer)object1).startReplaceGroup(-205339545);
        boolean z2 = ((Composer)object1).changed(this.c);
        boolean z3 = ((Composer)object1).changed(this.b);
        Function0 function02 = this.c;
        Function0 function03 = this.b;
        j j0 = ((Composer)object1).rememberedValue();
        if(z2 || z3 || j0 == Composer.Companion.getEmpty()) {
            j0 = new j(function02, function03);
            ((Composer)object1).updateRememberedValue(j0);
        }
        ((Composer)object1).endReplaceGroup();
        TistoryComposeBottomSheetKt.BottomSheetItem(null, s1, null, false, j0, ((Composer)object1), 0xC00, 5);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

