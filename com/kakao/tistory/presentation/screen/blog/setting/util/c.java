package com.kakao.tistory.presentation.screen.blog.setting.util;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final Context a;
    public final Function0 b;
    public final Function0 c;

    public c(Context context0, Function0 function00, Function0 function01) {
        this.a = context0;
        this.b = function00;
        this.c = function01;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Map)object0), "it");
        GalleryPermissionLauncherKt.galleryPermissionCheck(this.a, this.b, this.c);
        return Unit.INSTANCE;
    }
}

