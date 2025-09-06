package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(0x1F)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewTranslationCallbackS;", "", "Landroid/view/View;", "view", "", "setViewTranslationCallback", "(Landroid/view/View;)V", "clearViewTranslationCallback", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidComposeViewTranslationCallbackS {
    public static final int $stable;
    @NotNull
    public static final AndroidComposeViewTranslationCallbackS INSTANCE;

    static {
        AndroidComposeViewTranslationCallbackS.INSTANCE = new AndroidComposeViewTranslationCallbackS();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(0x1F)
    public final void clearViewTranslationCallback(@NotNull View view0) {
        a.A(view0);
    }

    @DoNotInline
    @RequiresApi(0x1F)
    public final void setViewTranslationCallback(@NotNull View view0) {
        a.B(view0, e0.a);
    }
}

