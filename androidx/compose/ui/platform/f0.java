package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import androidx.compose.ui.input.pointer.PointerIcon;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class f0 {
    public static final f0 a;

    static {
        f0.a = new f0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(24)
    public final void a(@NotNull View view0, @Nullable PointerIcon pointerIcon0) {
        android.view.PointerIcon pointerIcon1;
        if(pointerIcon0 instanceof AndroidPointerIcon) {
            pointerIcon1 = ((AndroidPointerIcon)pointerIcon0).getPointerIcon();
        }
        else {
            pointerIcon1 = pointerIcon0 instanceof AndroidPointerIconType ? android.view.PointerIcon.getSystemIcon(view0.getContext(), ((AndroidPointerIconType)pointerIcon0).getType()) : android.view.PointerIcon.getSystemIcon(view0.getContext(), 1000);
        }
        if(!Intrinsics.areEqual(view0.getPointerIcon(), pointerIcon1)) {
            view0.setPointerIcon(pointerIcon1);
        }
    }
}

