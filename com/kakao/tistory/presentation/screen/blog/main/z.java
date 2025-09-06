package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blog.BlogViewModel;
import com.kakao.tistory.presentation.screen.blog.navigation.BlogNestedNavActions;
import com.kakao.tistory.presentation.screen.blog.navigation.FromRefer;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final String a;
    public final FromRefer b;
    public final boolean c;
    public final NavActions d;
    public final BlogNestedNavActions e;
    public final BlogViewModel f;
    public final BlogMainViewModel g;
    public final int h;

    public z(String s, FromRefer fromRefer0, boolean z, NavActions navActions0, BlogNestedNavActions blogNestedNavActions0, BlogViewModel blogViewModel0, BlogMainViewModel blogMainViewModel0, int v) {
        this.a = s;
        this.b = fromRefer0;
        this.c = z;
        this.d = navActions0;
        this.e = blogNestedNavActions0;
        this.f = blogViewModel0;
        this.g = blogMainViewModel0;
        this.h = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainScreenKt.BlogMainScreen(this.a, this.b, this.c, this.d, this.e, this.f, this.g, ((Composer)object0), (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
        return Unit.INSTANCE;
    }
}

