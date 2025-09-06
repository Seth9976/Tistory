package com.kakao.kphotopicker.picker.item;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nb.e;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u001A\u001C\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0005¨\u0006\u0006"}, d2 = {"setWidthHeightByParent", "", "Landroid/view/View;", "parentView", "ratio", "", "kphotopicker_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class PickerAdapterKt {
    public static final void setWidthHeightByParent(@NotNull View view0, @NotNull View view1, float f) {
        Intrinsics.checkNotNullParameter(view0, "<this>");
        Intrinsics.checkNotNullParameter(view1, "parentView");
        if(f <= 0.0f) {
            return;
        }
        view1.post(new e(view1, view0, f));
    }

    public static void setWidthHeightByParent$default(View view0, View view1, float f, int v, Object object0) {
        if((v & 2) != 0) {
            f = 1.0f;
        }
        PickerAdapterKt.setWidthHeightByParent(view0, view1, f);
    }
}

