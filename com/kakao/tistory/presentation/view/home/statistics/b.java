package com.kakao.tistory.presentation.view.home.statistics;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final LineGraphView a;

    public b(LineGraphView lineGraphView0) {
        this.a = lineGraphView0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$Canvas");
        this.a.u = 0.0f;
        float f = this.a.e;
        this.a.v = f;
        LineGraphView.access$drawBackground(this.a, ((DrawScope)object0));
        LineGraphView.access$drawDay(this.a, ((DrawScope)object0));
        LineGraphView.access$drawLineChart(this.a, ((DrawScope)object0));
        LineGraphView.access$drawCircle(this.a, ((DrawScope)object0));
        return Unit.INSTANCE;
    }
}

