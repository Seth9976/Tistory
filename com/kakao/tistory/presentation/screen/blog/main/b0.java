package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainTopAppBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function4 {
    public final boolean a;
    public final State b;
    public final State c;

    public b0(boolean z, State state0, State state1) {
        this.a = z;
        this.b = state0;
        this.c = state1;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        float f = ((Number)object0).floatValue();
        boolean z = ((Boolean)object1).booleanValue();
        int v = ((Number)object3).intValue();
        int v1 = (v & 14) == 0 ? (((Composer)object2).changed(f) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (((Composer)object2).changed(z) ? 0x20 : 16);
        }
        if((v1 & 731) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x28B022DF, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.BlogMainScreen.<anonymous> (BlogMainScreen.kt:81)");
        }
        BlogMainInfo blogMainInfo0 = BlogMainScreenKt.access$BlogMainScreen$lambda$1(this.c).getInfo();
        boolean z1 = this.a;
        ((Composer)object2).startReplaceGroup(0xB9CFB27A);
        boolean z2 = ((Composer)object2).changed(this.b);
        State state0 = this.b;
        a0 a00 = ((Composer)object2).rememberedValue();
        if(z2 || a00 == Composer.Companion.getEmpty()) {
            a00 = new a0(state0);
            ((Composer)object2).updateRememberedValue(a00);
        }
        ((Composer)object2).endReplaceGroup();
        BlogMainTopAppBarKt.BlogMainAppBar(blogMainInfo0, f, z, z1, a00, ((Composer)object2), v1 << 3 & 0x3F0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

