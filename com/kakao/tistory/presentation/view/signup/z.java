package com.kakao.tistory.presentation.view.signup;

import com.kakao.tistory.domain.entity.common.RecommendedBlogNameInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function1 {
    public static final z a;

    static {
        z.a = new z();
    }

    public z() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((RecommendedBlogNameInfo)object0), "it");
        return Unit.INSTANCE;
    }
}

