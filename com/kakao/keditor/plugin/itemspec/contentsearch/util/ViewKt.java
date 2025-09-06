package com.kakao.keditor.plugin.itemspec.contentsearch.util;

import android.view.View;
import androidx.core.content.ContextCompat;
import com.kakao.keditor.R.color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u001A\u0014\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"setKePrimaryBackgroundColorBy", "", "Landroid/view/View;", "isNightMode", "", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class ViewKt {
    public static final void setKePrimaryBackgroundColorBy(@NotNull View view0, boolean z) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        int v = z ? color.ke_color_primary_background_night : color.ke_color_primary_background_default;
        view0.setBackgroundColor(ContextCompat.getColor(view0.getContext(), v));
    }
}

