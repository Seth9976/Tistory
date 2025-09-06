package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.domain.entity.Blog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final Blog a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;

    public g(Blog blog0, Function0 function00, Function0 function01, Function0 function02) {
        this.a = blog0;
        this.b = function00;
        this.c = function01;
        this.d = function02;
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
            ComposerKt.traceEventStart(0xB3D52E21, v, -1, "com.kakao.tistory.presentation.widget.dialog.DefaultBlogDialog.<anonymous>.<anonymous> (BlogDialog.kt:39)");
        }
        Blog blog0 = this.a;
        ((Composer)object0).startReplaceGroup(0xB071E8AA);
        boolean z = ((Composer)object0).changed(this.b);
        boolean z1 = ((Composer)object0).changed(this.c);
        Function0 function00 = this.b;
        Function0 function01 = this.c;
        e e0 = ((Composer)object0).rememberedValue();
        if(z || z1 || e0 == Composer.Companion.getEmpty()) {
            e0 = new e(function00, function01);
            ((Composer)object0).updateRememberedValue(e0);
        }
        ((Composer)object0).endReplaceGroup();
        ((Composer)object0).startReplaceGroup(0xB071F246);
        boolean z2 = ((Composer)object0).changed(this.d);
        boolean z3 = ((Composer)object0).changed(this.c);
        Function0 function02 = this.d;
        Function0 function03 = this.c;
        f f0 = ((Composer)object0).rememberedValue();
        if(z2 || z3 || f0 == Composer.Companion.getEmpty()) {
            f0 = new f(function02, function03);
            ((Composer)object0).updateRememberedValue(f0);
        }
        ((Composer)object0).endReplaceGroup();
        BlogDialogKt.DefaultBlogConfirmView(blog0, e0, f0, ((Composer)object0), 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

