package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(29)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001J\'\u0010\u0007\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/Api29Impl;", "", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "", "originalTimeout", "uiContentFlags", "getRecommendedTimeoutMillis", "(Landroid/view/accessibility/AccessibilityManager;II)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Api29Impl {
    public static final int $stable;
    @NotNull
    public static final Api29Impl INSTANCE;

    static {
        Api29Impl.INSTANCE = new Api29Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    public final int getRecommendedTimeoutMillis(@NotNull AccessibilityManager accessibilityManager0, int v, int v1) {
        return accessibilityManager0.getRecommendedTimeoutMillis(v, v1);
    }
}

