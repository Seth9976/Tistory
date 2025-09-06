package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final Function0 a;
    public final ButtonColors b;
    public final String c;
    public final int d;

    public b(Function0 function00, ButtonColors roundButtonDefaults$ButtonColors0, String s, int v) {
        this.a = function00;
        this.b = roundButtonDefaults$ButtonColors0;
        this.c = s;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ChallengeSuccessDialogKt.access$Button(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

