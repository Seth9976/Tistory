package com.kakao.kandinsky.delegate;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import ba.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001F\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/kakao/kandinsky/delegate/ImageLibrary;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalImageLibrary", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalImageLibrary", "delegate_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ImageLibraryKt {
    public static final ProvidableCompositionLocal a;

    static {
        ImageLibraryKt.a = CompositionLocalKt.compositionLocalOf$default(null, a.w, 1, null);
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalImageLibrary() {
        return ImageLibraryKt.a;
    }
}

