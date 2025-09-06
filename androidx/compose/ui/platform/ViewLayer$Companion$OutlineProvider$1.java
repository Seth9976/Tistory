package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/ViewLayer$Companion$OutlineProvider$1", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ViewLayer.Companion.OutlineProvider.1 extends ViewOutlineProvider {
    @Override  // android.view.ViewOutlineProvider
    public void getOutline(@NotNull View view0, @NotNull Outline outline0) {
        Intrinsics.checkNotNull(view0, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
        Outline outline1 = ViewLayer.access$getOutlineResolver$p(((ViewLayer)view0)).getAndroidOutline();
        Intrinsics.checkNotNull(outline1);
        outline0.set(outline1);
    }
}

