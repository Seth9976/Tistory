package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/FontWeightAdjustmentHelper;", "", "Landroid/content/Context;", "context", "", "getFontWeightAdjustment", "(Landroid/content/Context;)I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FontWeightAdjustmentHelper {
    public static final int $stable;
    @NotNull
    public static final FontWeightAdjustmentHelper INSTANCE;

    static {
        FontWeightAdjustmentHelper.INSTANCE = new FontWeightAdjustmentHelper();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final int getFontWeightAdjustment(@NotNull Context context0) {
        return Build.VERSION.SDK_INT < 0x1F ? 0 : FontWeightAdjustmentHelperApi31.INSTANCE.fontWeightAdjustment(context0);
    }
}

