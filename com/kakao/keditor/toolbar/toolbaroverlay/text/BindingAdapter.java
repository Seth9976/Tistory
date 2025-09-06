package com.kakao.keditor.toolbar.toolbaroverlay.text;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001A\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0007J\u0014\u0010\u0003\u001A\u00020\u0004*\u00020\b2\u0006\u0010\u0006\u001A\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/toolbar/toolbaroverlay/text/BindingAdapter;", "", "()V", "setColor", "", "Lcom/kakao/keditor/toolbar/toolbaroverlay/text/TextBackgroundColorMenuBtnView;", "color", "", "Lcom/kakao/keditor/toolbar/toolbaroverlay/text/TextColorMenuBtnView;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BindingAdapter {
    @NotNull
    public static final BindingAdapter INSTANCE;

    static {
        BindingAdapter.INSTANCE = new BindingAdapter();
    }

    @androidx.databinding.BindingAdapter({"menu_background_color"})
    @JvmStatic
    public static final void setColor(@NotNull TextBackgroundColorMenuBtnView textBackgroundColorMenuBtnView0, int v) {
        Intrinsics.checkNotNullParameter(textBackgroundColorMenuBtnView0, "<this>");
        textBackgroundColorMenuBtnView0.setColor(v);
    }

    @androidx.databinding.BindingAdapter({"menu_foreground_color"})
    @JvmStatic
    public static final void setColor(@NotNull TextColorMenuBtnView textColorMenuBtnView0, int v) {
        Intrinsics.checkNotNullParameter(textColorMenuBtnView0, "<this>");
        textColorMenuBtnView0.setColor(v);
    }
}

