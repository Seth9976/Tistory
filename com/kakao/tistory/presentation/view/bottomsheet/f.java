package com.kakao.tistory.presentation.view.bottomsheet;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import com.kakao.tistory.domain.entity.CategoryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final CategoryItem a;
    public final TextStyle b;
    public final boolean c;
    public final Function0 d;
    public final Function3 e;
    public final int f;
    public final int g;

    public f(CategoryItem categoryItem0, TextStyle textStyle0, boolean z, Function0 function00, Function3 function30, int v, int v1) {
        this.a = categoryItem0;
        this.b = textStyle0;
        this.c = z;
        this.d = function00;
        this.e = function30;
        this.f = v;
        this.g = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogCategoryDialogAdapterKt.access$Category(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

