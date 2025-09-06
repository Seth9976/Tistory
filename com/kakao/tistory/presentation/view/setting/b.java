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
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$item");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x54743A10, v, -1, "com.kakao.tistory.presentation.view.setting.ComposableSingletons$SettingListActivityKt.lambda-1.<anonymous> (SettingListActivity.kt:93)");
        }
        ListTitleHeaderKt.ListTitleHeader(string.label_setting, PaddingKt.PaddingValues-a9UjIt4(21.0f, 16.5f, 20.0f, 13.5f), ((Composer)object1), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

