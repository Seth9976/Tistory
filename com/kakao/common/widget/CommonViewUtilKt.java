package com.kakao.common.widget;

import android.widget.ImageView;
import com.kakao.keditor.plugin.itemspec.poll.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004¨\u0006\u0005"}, d2 = {"convertRoundedDrawable", "", "Landroid/widget/ImageView;", "radius", "", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class CommonViewUtilKt {
    public static final void convertRoundedDrawable(@NotNull ImageView imageView0, float f) {
        Intrinsics.checkNotNullParameter(imageView0, "<this>");
        imageView0.post(new a(imageView0, f, 1));
    }
}

