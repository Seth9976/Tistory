package androidx.compose.ui.hapticfeedback;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "hapticFeedbackType", "", "performHapticFeedback-CdsT49E", "(I)V", "performHapticFeedback", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PlatformHapticFeedback implements HapticFeedback {
    public static final int $stable = 8;
    public final View a;

    public PlatformHapticFeedback(@NotNull View view0) {
        this.a = view0;
    }

    @Override  // androidx.compose.ui.hapticfeedback.HapticFeedback
    public void performHapticFeedback-CdsT49E(int v) {
        Companion hapticFeedbackType$Companion0 = HapticFeedbackType.Companion;
        View view0 = this.a;
        if(HapticFeedbackType.equals-impl0(v, hapticFeedbackType$Companion0.getLongPress-5zf0vsI())) {
            view0.performHapticFeedback(0);
            return;
        }
        if(HapticFeedbackType.equals-impl0(v, hapticFeedbackType$Companion0.getTextHandleMove-5zf0vsI())) {
            view0.performHapticFeedback(9);
        }
    }
}

