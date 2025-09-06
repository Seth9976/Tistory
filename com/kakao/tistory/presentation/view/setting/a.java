package com.kakao.tistory.presentation.view.setting;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.ListTitleHeaderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function3 {
    public static final a a;

    static {
        a.a = new a();
    }

    public a() {
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
            ComposerKt.traceEventStart(0x4F2D9A0C, v, -1, "com.kakao.tistory.presentation.view.setting.ComposableSingletons$SettingDefaultBlogActivityKt.lambda-1.<anonymous> (SettingDefaultBlogActivity.kt:86)");
        }
        ListTitleHeaderKt.ListTitleHeader(string.label_setting_default_blog, PaddingKt.PaddingValues-a9UjIt4(21.0f, 16.5f, 20.0f, 21.5f), ((Composer)object1), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

