package com.kakao.tistory.presentation.view.signup;

import com.kakao.tistory.domain.entity.common.RecommendedBlogNameInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function0 {
    public final Function1 a;
    public final RecommendedBlogNameInfo b;

    public x(Function1 function10, RecommendedBlogNameInfo recommendedBlogNameInfo0) {
        this.a = function10;
        this.b = recommendedBlogNameInfo0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}

