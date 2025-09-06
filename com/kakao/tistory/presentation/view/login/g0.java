package com.kakao.tistory.presentation.view.login;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.TypeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function3 {
    public final boolean a;

    public g0(boolean z) {
        this.a = z;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$Button");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE20F2436, v, -1, "com.kakao.tistory.presentation.view.login.TistroyLoginActivity.LoginButton.<anonymous> (TistroyLoginActivity.kt:423)");
        }
        if(this.a) {
            ((Composer)object1).startReplaceGroup(-1430106403);
            long v1 = ColorResources_androidKt.colorResource(color.white, ((Composer)object1), 0);
            ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(SizeKt.size-3ABfNKs(Modifier.Companion, 22.0f), v1, 1.0f, 0L, 0, ((Composer)object1), 390, 24);
        }
        else {
            ((Composer)object1).startReplaceGroup(0xAAC5E5F7);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_login_ok, ((Composer)object1), 0), null, ColorResources_androidKt.colorResource(color.white, ((Composer)object1), 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getTypography().getButton(), ((Composer)object1), 0, 0, 0xFFFA);
        }
        ((Composer)object1).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

