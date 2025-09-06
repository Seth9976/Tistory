package com.kakao.tistory.presentation.view.home;

import a5.b;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.widget.CommonTitleKt;
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
            ComposerKt.traceEventStart(-1766073022, v, -1, "com.kakao.tistory.presentation.view.home.ComposableSingletons$RefererKeywordListActivityKt.lambda-1.<anonymous> (RefererKeywordListActivity.kt:72)");
        }
        CommonTitleKt.CommonTitleView(null, StringResources_androidKt.stringResource(string.label_home_statistics_referer_keyword, ((Composer)object1), 0), b.f(1, StringResources_androidKt.stringResource(string.label_latest_days, ((Composer)object1), 0), "format(...)", new Object[]{7}), null, null, ((Composer)object1), 0, 25);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

