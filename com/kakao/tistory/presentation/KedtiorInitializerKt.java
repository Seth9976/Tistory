package com.kakao.tistory.presentation;

import androidx.appcompat.app.AppCompatActivity;
import com.kakao.keditor.KeditorBuilderKt;
import com.kakao.keditor.plugin.itemspec.opengraph.loader.Loader;
import com.kakao.keditor.plugin.pluginspec.grammarcheck.GrammarChecker;
import com.kakao.kphotopicker.GalleryPickerBuilderKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A2\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\b\u0010\n\u001A\u0004\u0018\u00010\u0005¨\u0006\u000B"}, d2 = {"initKeditor", "", "Landroidx/appcompat/app/AppCompatActivity;", "additinalEmoticons", "", "", "openGraphLoader", "Lcom/kakao/keditor/plugin/itemspec/opengraph/loader/Loader;", "grammarChecker", "Lcom/kakao/keditor/plugin/pluginspec/grammarcheck/GrammarChecker;", "defaultSignature", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class KedtiorInitializerKt {
    public static final void initKeditor(@NotNull AppCompatActivity appCompatActivity0, @NotNull List list0, @NotNull Loader loader0, @NotNull GrammarChecker grammarChecker0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(appCompatActivity0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "additinalEmoticons");
        Intrinsics.checkNotNullParameter(loader0, "openGraphLoader");
        Intrinsics.checkNotNullParameter(grammarChecker0, "grammarChecker");
        GalleryPickerBuilderKt.galleryPicker(new q(s));
        KeditorBuilderKt.keditor(appCompatActivity0, new u(loader0, list0, s, grammarChecker0));
    }
}

