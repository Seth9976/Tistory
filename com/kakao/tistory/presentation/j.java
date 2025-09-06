package com.kakao.tistory.presentation;

import com.kakao.kphotopicker.GalleryPickerBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function1 {
    public final Function0 a;

    public j(Function0 function00) {
        this.a = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GalleryPickerBuilder)object0), "$this$galleryPicker");
        ((GalleryPickerBuilder)object0).photoEditor(new i(this.a));
        return Unit.INSTANCE;
    }
}

