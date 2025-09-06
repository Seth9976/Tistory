package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import com.kakao.tistory.presentation.screen.blog.navigation.BlogNestedNavActions;
import com.kakao.tistory.presentation.screen.blog.navigation.NavActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function2 {
    public final BlogMainViewModel a;
    public final BlogMainUiState b;
    public final NavActions c;
    public final BlogNestedNavActions d;
    public final int e;

    public e0(BlogMainViewModel blogMainViewModel0, BlogMainUiState blogMainUiState0, NavActions navActions0, BlogNestedNavActions blogNestedNavActions0, int v) {
        this.a = blogMainViewModel0;
        this.b = blogMainUiState0;
        this.c = navActions0;
        this.d = blogNestedNavActions0;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainScreenKt.a(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

