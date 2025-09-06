package androidx.compose.ui.platform;

import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(26)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/WrapperRenderNodeLayerHelperMethods;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "", "onDescendantInvalidated", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WrapperRenderNodeLayerHelperMethods {
    public static final int $stable;
    @NotNull
    public static final WrapperRenderNodeLayerHelperMethods INSTANCE;

    static {
        WrapperRenderNodeLayerHelperMethods.INSTANCE = new WrapperRenderNodeLayerHelperMethods();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final void onDescendantInvalidated(@NotNull AndroidComposeView androidComposeView0) {
        ViewParent viewParent0 = androidComposeView0.getParent();
        if(viewParent0 != null) {
            viewParent0.onDescendantInvalidated(androidComposeView0, androidComposeView0);
        }
    }
}

