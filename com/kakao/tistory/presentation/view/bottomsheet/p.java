package com.kakao.tistory.presentation.view.bottomsheet;

import android.view.Window;
import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.viewmodel.BlogSwitchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function2 {
    public final Window a;
    public final String b;
    public final String c;
    public final BlogSwitchViewModel d;
    public final int e;
    public final int f;

    public p(Window window0, String s, String s1, BlogSwitchViewModel blogSwitchViewModel0, int v, int v1) {
        this.a = window0;
        this.b = s;
        this.c = s1;
        this.d = blogSwitchViewModel0;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogSwitchBottomSheetKt.BlogSwitchBottomSheetModal(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

