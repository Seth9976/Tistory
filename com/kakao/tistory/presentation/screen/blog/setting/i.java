package com.kakao.tistory.presentation.screen.blog.setting;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import com.kakao.tistory.presentation.screen.blog.setting.util.ImagePickLauncherKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public final ManagedActivityResultLauncher a;
    public final Context b;

    public i(ManagedActivityResultLauncher managedActivityResultLauncher0, Context context0) {
        this.a = managedActivityResultLauncher0;
        this.b = context0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ImagePickLauncherKt.launch(this.a, this.b, 1);
        return Unit.INSTANCE;
    }
}

