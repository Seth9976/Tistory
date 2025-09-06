package com.kakao.tistory.presentation.view.setting.secretLab;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function1 {
    public final List a;
    public final String b;
    public final Function1 c;

    public a0(List list0, String s, Function1 function10) {
        this.a = list0;
        this.b = s;
        this.c = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableSingletons.SeverHostScreenKt.INSTANCE.getLambda-1$presentation_prodRelease(), 3, null);
        SeverHostScreenKt.SeverHostScreen.1.invoke..inlined.items.default.3 severHostScreenKt$SeverHostScreen$1$invoke$$inlined$items$default$30 = new SeverHostScreenKt.SeverHostScreen.1.invoke..inlined.items.default.3(SeverHostScreenKt.SeverHostScreen.1.invoke..inlined.items.default.1.INSTANCE, this.a);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xDA480CDF, true, new SeverHostScreenKt.SeverHostScreen.1.invoke..inlined.items.default.4(this.a, this.b, this.c));
        ((LazyListScope)object0).items(this.a.size(), null, severHostScreenKt$SeverHostScreen$1$invoke$$inlined$items$default$30, composableLambda0);
        return Unit.INSTANCE;
    }
}

