package com.kakao.tistory.presentation.screen.blog.setting.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function4 {
    public static final h a;

    static {
        h.a = new h();
    }

    public h() {
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        ((Number)object1).floatValue();
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$TistoryTopAppBar");
        if((v & 641) == 0x80 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xED1E8F64, v, -1, "com.kakao.tistory.presentation.screen.blog.setting.ui.ComposableSingletons$BlogSettingTopAppBarKt.lambda-1.<anonymous> (BlogSettingTopAppBar.kt:28)");
        }
        TistoryTopAppBarKt.TistoryTopAppBarCenterTitle(StringResources_androidKt.stringResource(string.label_blog_setting, ((Composer)object2), 0), null, ((Composer)object2), 0, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

