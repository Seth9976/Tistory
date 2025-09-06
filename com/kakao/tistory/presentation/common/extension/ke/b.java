package com.kakao.tistory.presentation.common.extension.ke;

import android.app.Activity;
import com.kakao.tistory.presentation.TistoryPhotoEditor;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final TistoryPhotoEditor a;
    public final Activity b;

    public b(TistoryPhotoEditor tistoryPhotoEditor0, Activity activity0) {
        this.a = tistoryPhotoEditor0;
        this.b = activity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((File)object0) != null) {
            String s = ((File)object0).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(s, "getAbsolutePath(...)");
            KeImagePluginExtensionKt.open(this.a, this.b, s);
        }
        return Unit.INSTANCE;
    }
}

