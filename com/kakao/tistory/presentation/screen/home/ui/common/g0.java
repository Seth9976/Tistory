package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function2 {
    public final boolean a;
    public final Function0 b;
    public final Function0 c;
    public final ButtonColors d;
    public final ButtonColors e;
    public final Function1 f;
    public final int g;
    public final int h;

    public g0(boolean z, Function0 function00, Function0 function01, ButtonColors roundButtonDefaults$ButtonColors0, ButtonColors roundButtonDefaults$ButtonColors1, Function1 function10, int v, int v1) {
        this.a = z;
        this.b = function00;
        this.c = function01;
        this.d = roundButtonDefaults$ButtonColors0;
        this.e = roundButtonDefaults$ButtonColors1;
        this.f = function10;
        this.g = v;
        this.h = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SlotFollowButtonKt.SlotFollowButton(this.a, this.b, this.c, this.d, this.e, this.f, ((Composer)object0), (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
        return Unit.INSTANCE;
    }
}

