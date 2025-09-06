package com.kakao.tistory.presentation.screen.revenue;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class d extends Lambda implements Function1 {
    public final Context a;
    public final CoroutineScope b;
    public final Function1 c;
    public final LazyListState d;

    public d(Context context0, CoroutineScope coroutineScope0, Function1 function10, LazyListState lazyListState0) {
        this.a = context0;
        this.b = coroutineScope0;
        this.c = function10;
        this.d = lazyListState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphPeriodType)object0), "it");
        int v = ((GraphPeriodType)object0).getTitleRes();
        String s = this.a.getString(v);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        RevenueTiara.INSTANCE.trackClickPeriod(s);
        c c0 = new c(this.d, null);
        BuildersKt.launch$default(this.b, null, null, c0, 3, null);
        this.c.invoke(((GraphPeriodType)object0));
        return Unit.INSTANCE;
    }
}

