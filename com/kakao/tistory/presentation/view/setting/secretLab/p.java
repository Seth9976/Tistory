package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.navigation.NavController;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.common.ListItemDividerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function3 {
    public final SecretLabActivity a;
    public final NavController b;

    public p(SecretLabActivity secretLabActivity0, NavController navController0) {
        this.a = secretLabActivity0;
        this.b = navController0;
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
            ComposerKt.traceEventStart(0x28C3A922, v, -1, "com.kakao.tistory.presentation.view.setting.secretLab.SecretLabActivity.MainContent.<anonymous>.<anonymous> (SecretLabActivity.kt:136)");
        }
        String s = StringResources_androidKt.stringResource(string.secret_lab_server_host, ((Composer)object1), 0);
        o o0 = new o(this.b);
        this.a.CommonItem(s, o0, ((Composer)object1), 0x200, 0);
        ListItemDividerKt.ListItemDivider-rAjV9yQ(false, 0.0f, ((Composer)object1), 0, 3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

