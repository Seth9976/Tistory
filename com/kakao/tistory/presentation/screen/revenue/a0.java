package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blog.BlogViewModel;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function2 {
    public final NavActions a;
    public final BlogViewModel b;
    public final RevenueViewModel c;
    public final int d;
    public final int e;

    public a0(NavActions navActions0, BlogViewModel blogViewModel0, RevenueViewModel revenueViewModel0, int v, int v1) {
        this.a = navActions0;
        this.b = blogViewModel0;
        this.c = revenueViewModel0;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        RevenueScreenKt.RevenueScreen(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

