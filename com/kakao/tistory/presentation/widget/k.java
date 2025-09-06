package com.kakao.tistory.presentation.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final Modifier a;
    public final TopViewModel b;
    public final Function0 c;
    public final int d;
    public final int e;

    public k(Modifier modifier0, TopViewModel topViewModel0, Function0 function00, int v, int v1) {
        this.a = modifier0;
        this.b = topViewModel0;
        this.c = function00;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CommonTitleKt.TitleWithCategoryView(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

