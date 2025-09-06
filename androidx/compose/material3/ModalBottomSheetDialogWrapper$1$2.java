package androidx.compose.material3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/material3/ModalBottomSheetDialogWrapper$1$2", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ModalBottomSheetDialogWrapper.1.2 extends ViewOutlineProvider {
    @Override  // android.view.ViewOutlineProvider
    public void getOutline(@NotNull View view0, @NotNull Outline outline0) {
        outline0.setRect(0, 0, view0.getWidth(), view0.getHeight());
        outline0.setAlpha(0.0f);
    }
}

