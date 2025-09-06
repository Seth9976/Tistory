package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public final RowScope a;
    public final String b;
    public final long c;
    public final TextStyle d;
    public final int e;

    public m(RowScope rowScope0, String s, long v, TextStyle textStyle0, int v1) {
        this.a = rowScope0;
        this.b = s;
        this.c = v;
        this.d = textStyle0;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainCategoryBottomSheetKt.a(this.a, this.b, this.c, this.d, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
        return Unit.INSTANCE;
    }
}

