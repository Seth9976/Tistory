package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainChallenge.ParticipationStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function2 {
    public final String a;
    public final ParticipationStatus b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public j0(String s, ParticipationStatus blogMainChallenge$ParticipationStatus0, String s1, String s2, int v, int v1) {
        this.a = s;
        this.b = blogMainChallenge$ParticipationStatus0;
        this.c = s1;
        this.d = s2;
        this.e = v;
        this.f = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainChallengeKt.a(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
        return Unit.INSTANCE;
    }
}

