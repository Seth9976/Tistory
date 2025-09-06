package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function3 {
    public final NavHostController a;
    public final SecretLabActivity b;

    public j(NavHostController navHostController0, SecretLabActivity secretLabActivity0) {
        this.a = navHostController0;
        this.b = secretLabActivity0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((PaddingValues)object0), "innerPadding");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((PaddingValues)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE261DBF1, v, -1, "com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity.Content.<anonymous> (SecretLabActivity.kt:94)");
        }
        Modifier modifier0 = PaddingKt.padding(Modifier.Companion, ((PaddingValues)object0));
        i i0 = new i(this.b, this.a);
        NavHostKt.NavHost(this.a, "Main", modifier0, null, null, null, null, null, null, null, i0, ((Composer)object1), 56, 0, 0x3F8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

