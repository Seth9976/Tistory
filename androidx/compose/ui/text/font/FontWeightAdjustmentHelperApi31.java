package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@RequiresApi(0x1F)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/FontWeightAdjustmentHelperApi31;", "", "Landroid/content/Context;", "context", "", "fontWeightAdjustment", "(Landroid/content/Context;)I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FontWeightAdjustmentHelperApi31 {
    public static final int $stable;
    @NotNull
    public static final FontWeightAdjustmentHelperApi31 INSTANCE;

    static {
        FontWeightAdjustmentHelperApi31.INSTANCE = new FontWeightAdjustmentHelperApi31();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(0x1F)
    public final int fontWeightAdjustment(@NotNull Context context0) {
        return context0.getResources().getConfiguration().fontWeightAdjustment;
    }
}

