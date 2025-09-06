package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallenge.Participant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function2 {
    public final Participant a;
    public final int b;

    public g0(Participant blogMainChallenge$Participant0, int v) {
        this.a = blogMainChallenge$Participant0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainChallengeKt.access$ChallengeCardParticipant(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)));
        return Unit.INSTANCE;
    }
}

