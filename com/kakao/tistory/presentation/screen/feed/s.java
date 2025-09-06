package com.kakao.tistory.presentation.screen.feed;

import android.content.Context;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public final Context a;

    public s(Context context0) {
        this.a = context0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        NavigatorExtensionKt.goToBlogTop(this.a, ((String)object0));
        return Unit.INSTANCE;
    }
}

