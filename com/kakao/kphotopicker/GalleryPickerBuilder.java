package com.kakao.kphotopicker;

import jb.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001B\u0010\b\u001A\u00020\u00072\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u0003¨\u0006\u000B"}, d2 = {"Lcom/kakao/kphotopicker/GalleryPickerBuilder;", "", "<init>", "()V", "Lkotlin/Function0;", "Lcom/kakao/kphotopicker/PhotoEditor;", "block", "", "photoEditor", "(Lkotlin/jvm/functions/Function0;)V", "build", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class GalleryPickerBuilder {
    public Function0 a;

    public GalleryPickerBuilder() {
        this.a = b.x;
    }

    public final void build() {
        PhotoEditor photoEditor0 = (PhotoEditor)this.a.invoke();
        GalleryPicker.INSTANCE.initialize(photoEditor0);
    }

    public final void photoEditor(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        this.a = function00;
    }
}

