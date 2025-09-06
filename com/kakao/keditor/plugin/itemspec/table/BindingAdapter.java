package com.kakao.keditor.plugin.itemspec.table;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/BindingAdapter;", "", "()V", "setLayoutWidth", "", "view", "Landroid/view/View;", "width", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BindingAdapter {
    @NotNull
    public static final BindingAdapter INSTANCE;

    static {
        BindingAdapter.INSTANCE = new BindingAdapter();
    }

    @androidx.databinding.BindingAdapter({"layout_width"})
    @JvmStatic
    public static final void setLayoutWidth(@NotNull View view0, double f) {
        Intrinsics.checkNotNullParameter(view0, "view");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(viewGroup$LayoutParams0, "getLayoutParams(...)");
        viewGroup$LayoutParams0.width = (int)f;
        view0.setLayoutParams(viewGroup$LayoutParams0);
    }
}

