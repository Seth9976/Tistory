package com.kakao.tistory.presentation.view.login;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.ColorKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function3 {
    public static final b a;

    static {
        b.a = new b();
    }

    public b() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$OutlinedButton");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD335AAFE, v, -1, "com.kakao.tistory.presentation.view.login.ComposableSingletons$KakaoLoginActivityKt.lambda-2.<anonymous> (KakaoLoginActivity.kt:217)");
        }
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_login_with_account, ((Composer)object1), 0), null, ColorKt.getGray1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getButton(), ((Composer)object1), 0x180, 0, 0x1FFFA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

