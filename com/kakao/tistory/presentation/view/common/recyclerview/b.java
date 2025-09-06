package com.kakao.tistory.presentation.view.common.recyclerview;

import android.graphics.DashPathEffect;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final SimpleDividerItemDecoration a;

    public b(SimpleDividerItemDecoration simpleDividerItemDecoration0) {
        this.a = simpleDividerItemDecoration0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Paint paint0 = new Paint(1);
        paint0.setColor(this.a.getDashColor());
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeWidth(this.a.getDashSize());
        paint0.setPathEffect(new DashPathEffect(new float[]{this.a.getDashWidth(), this.a.getDashGap()}, 0.0f));
        return paint0;
    }
}

