package com.kakao.tistory.presentation.view.editor;

import com.kakao.kphotopicker.PhotoPickerConfig;
import com.kakao.kphotopicker.loader.GalleryType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x3 extends Lambda implements Function1 {
    public static final x3 a;

    static {
        x3.a = new x3();
    }

    public x3() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((PhotoPickerConfig)object0), "$this$newIntent");
        ((PhotoPickerConfig)object0).setPickerType(GalleryType.ImageOnly);
        ((PhotoPickerConfig)object0).setEnableImageGrid(false);
        return Unit.INSTANCE;
    }
}

