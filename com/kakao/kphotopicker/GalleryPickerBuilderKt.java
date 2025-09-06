package com.kakao.kphotopicker;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u001F\u0010\u0000\u001A\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"galleryPicker", "", "init", "Lkotlin/Function1;", "Lcom/kakao/kphotopicker/GalleryPickerBuilder;", "Lkotlin/ExtensionFunctionType;", "kphotopicker_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class GalleryPickerBuilderKt {
    public static final void galleryPicker(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "init");
        GalleryPickerBuilder galleryPickerBuilder0 = new GalleryPickerBuilder();
        function10.invoke(galleryPickerBuilder0);
        galleryPickerBuilder0.build();
    }
}

