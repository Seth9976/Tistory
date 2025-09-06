package com.kakao.tistory.presentation.common.coil;

import android.app.Application;
import coil.Coil;
import coil.ImageLoader.Builder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"initCoil", "", "Landroid/app/Application;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class CoilExtensionKt {
    public static final void initCoil(@NotNull Application application0) {
        Intrinsics.checkNotNullParameter(application0, "<this>");
        Coil.setImageLoader(new Builder(application0).build());
    }
}

