package com.kakao.tistory.presentation;

import com.kakao.kphotopicker.GalleryPickerBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public final String a;

    public q(String s) {
        this.a = s;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GalleryPickerBuilder)object0), "$this$galleryPicker");
        ((GalleryPickerBuilder)object0).photoEditor(new p(this.a));
        return Unit.INSTANCE;
    }
}

