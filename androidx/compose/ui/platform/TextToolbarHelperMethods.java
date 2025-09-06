package androidx.compose.ui.platform;

import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(23)
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J)\u0010\t\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/platform/TextToolbarHelperMethods;", "", "Landroid/view/View;", "view", "Landroid/view/ActionMode$Callback;", "actionModeCallback", "", "type", "Landroid/view/ActionMode;", "startActionMode", "(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;", "actionMode", "", "invalidateContentRect", "(Landroid/view/ActionMode;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextToolbarHelperMethods {
    public static final int $stable;
    @NotNull
    public static final TextToolbarHelperMethods INSTANCE;

    static {
        TextToolbarHelperMethods.INSTANCE = new TextToolbarHelperMethods();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @RequiresApi(23)
    public final void invalidateContentRect(@NotNull ActionMode actionMode0) {
        actionMode0.invalidateContentRect();
    }

    @DoNotInline
    @RequiresApi(23)
    @Nullable
    public final ActionMode startActionMode(@NotNull View view0, @NotNull ActionMode.Callback actionMode$Callback0, int v) {
        return view0.startActionMode(actionMode$Callback0, v);
    }
}

