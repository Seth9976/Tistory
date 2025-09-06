package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.domain.entity.entry.ChallengeResult;
import com.kakao.tistory.presentation.widget.dialog.DialogFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final DialogFactory a;
    public final ChallengeResult b;
    public final Function0 c;
    public final Function0 d;
    public final int e;
    public final int f;

    public d(DialogFactory dialogFactory0, ChallengeResult challengeResult0, Function0 function00, Function0 function01, int v, int v1) {
        this.a = dialogFactory0;
        this.b = challengeResult0;
        this.c = function00;
        this.d = function01;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        ChallengeSuccessDialogKt.ChallengeSuccessDialog(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)), this.f);
        return Unit.INSTANCE;
    }
}

