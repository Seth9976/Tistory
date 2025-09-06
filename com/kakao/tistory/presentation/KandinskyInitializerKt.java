package com.kakao.tistory.presentation;

import android.app.Application;
import com.kakao.kandinsky.launcher.KandinskyBuilderKt;
import com.kakao.kphotopicker.GalleryPickerBuilderKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\u001A\u001A\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u000E\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¨\u0006\u0006"}, d2 = {"initKandinsky", "", "Landroid/app/Application;", "getBlogName", "Lkotlin/Function0;", "", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class KandinskyInitializerKt {
    public static final void initKandinsky(@NotNull Application application0, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(application0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "getBlogName");
        GalleryPickerBuilderKt.galleryPicker(new j(function00));
        KandinskyBuilderKt.kandinsky(application0, n.a);
    }
}

