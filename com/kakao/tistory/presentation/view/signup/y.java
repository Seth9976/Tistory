package com.kakao.tistory.presentation.view.signup;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.domain.entity.common.RecommendedBlogNameInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function2 {
    public final Modifier a;
    public final RecommendedBlogNameInfo b;
    public final Function1 c;
    public final int d;
    public final int e;

    public y(Modifier modifier0, RecommendedBlogNameInfo recommendedBlogNameInfo0, Function1 function10, int v, int v1) {
        this.a = modifier0;
        this.b = recommendedBlogNameInfo0;
        this.c = function10;
        this.d = v;
        this.e = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        SignUpScreenKt.access$BlogNameSuggestion(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)), this.e);
        return Unit.INSTANCE;
    }
}

