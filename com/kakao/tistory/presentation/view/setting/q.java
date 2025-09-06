package com.kakao.tistory.presentation.view.setting;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function3 {
    public final SettingDefaultBlogActivity a;

    public q(SettingDefaultBlogActivity settingDefaultBlogActivity0) {
        this.a = settingDefaultBlogActivity0;
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
            ComposerKt.traceEventStart(-1503075033, v, -1, "com.kakao.tistory.presentation.view.setting.SettingDefaultBlogActivity.Content.<anonymous>.<anonymous>.<anonymous> (SettingDefaultBlogActivity.kt:99)");
        }
        String s = StringResources_androidKt.stringResource(string.label_blog_switch_owner, ((Composer)object1), 0);
        this.a.TitleItem(s, false, ((Composer)object1), 560);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

