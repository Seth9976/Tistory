package com.kakao.tistory.presentation.screen.blog.setting;

import androidx.activity.compose.ManagedActivityResultLauncher;
import com.kakao.tistory.presentation.common.utils.PermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function0 {
    public final ManagedActivityResultLauncher a;

    public h(ManagedActivityResultLauncher managedActivityResultLauncher0) {
        this.a = managedActivityResultLauncher0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String[] arr_s = PermissionUtils.getGalleryPermissions$default(PermissionUtils.INSTANCE, false, 1, null);
        this.a.launch(arr_s);
        return Unit.INSTANCE;
    }
}

