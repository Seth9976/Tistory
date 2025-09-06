package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategoryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final BlogMainCategoryItem a;
    public final int b;
    public final Function0 c;
    public final boolean d;
    public final int e;

    public k(BlogMainCategoryItem blogMainCategoryItem0, int v, Function0 function00, boolean z, int v1) {
        this.a = blogMainCategoryItem0;
        this.b = v;
        this.c = function00;
        this.d = z;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainCategoryBottomSheetKt.access$Category(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

