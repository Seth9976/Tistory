package com.kakao.tistory.presentation.common.extension.ke;

import com.kakao.kphotopicker.PhotoPickerConfig;
import com.kakao.kphotopicker.loader.GalleryType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public static final d a;

    static {
        d.a = new d();
    }

    public d() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((PhotoPickerConfig)object0), "$this$newIntent");
        ((PhotoPickerConfig)object0).setPickerType(GalleryType.VideoOnly);
        ((PhotoPickerConfig)object0).setLimitVideoFileSize(0x100000000L);
        return Unit.INSTANCE;
    }
}

