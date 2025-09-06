package com.kakao.keditor.plugin.pluginspec.emoticon;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.kakao.keditor.plugin.itemspec.emoticon.EmoticonItem;
import com.kakao.kemoticon.Emoticon;
import com.kakao.kemoticon.EmoticonView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0007J\u0018\u0010\t\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0007J\u0018\u0010\r\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\fH\u0007¨\u0006\u000F"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/emoticon/BindingAdapter;", "", "()V", "setEmoticon", "", "view", "Lcom/kakao/kemoticon/EmoticonView;", "emoticonItem", "Lcom/kakao/keditor/plugin/itemspec/emoticon/EmoticonItem;", "setLayoutHeight", "Landroid/view/View;", "height", "", "setLayoutWidth", "width", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BindingAdapter {
    @NotNull
    public static final BindingAdapter INSTANCE;

    static {
        BindingAdapter.INSTANCE = new BindingAdapter();
    }

    @androidx.databinding.BindingAdapter({"emoticon"})
    @JvmStatic
    public static final void setEmoticon(@NotNull EmoticonView emoticonView0, @NotNull EmoticonItem emoticonItem0) {
        Intrinsics.checkNotNullParameter(emoticonView0, "view");
        Intrinsics.checkNotNullParameter(emoticonItem0, "emoticonItem");
        emoticonView0.setEmoticon(new Emoticon(emoticonItem0.getPackId(), emoticonItem0.getId(), emoticonItem0.getSrc()));
    }

    @androidx.databinding.BindingAdapter({"layout_height"})
    @JvmStatic
    public static final void setLayoutHeight(@NotNull View view0, float f) {
        Intrinsics.checkNotNullParameter(view0, "view");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(viewGroup$LayoutParams0, "getLayoutParams(...)");
        viewGroup$LayoutParams0.height = (int)f;
        view0.setLayoutParams(viewGroup$LayoutParams0);
    }

    @androidx.databinding.BindingAdapter({"layout_width"})
    @JvmStatic
    public static final void setLayoutWidth(@NotNull View view0, float f) {
        Intrinsics.checkNotNullParameter(view0, "view");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(viewGroup$LayoutParams0, "getLayoutParams(...)");
        viewGroup$LayoutParams0.width = (int)f;
        view0.setLayoutParams(viewGroup$LayoutParams0);
    }
}

