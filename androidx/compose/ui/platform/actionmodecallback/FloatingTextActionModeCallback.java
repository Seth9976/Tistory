package androidx.compose.ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode.Callback2;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(23)
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000B\u001A\u00020\n2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ#\u0010\u000F\u001A\u00020\n2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J#\u0010\u0011\u001A\u00020\n2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0013\u001A\u00020\u00122\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0019\u001A\u00020\u00122\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00152\b\u0010\u0018\u001A\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001A¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;", "Landroid/view/ActionMode$Callback2;", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "callback", "<init>", "(Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;)V", "Landroid/view/ActionMode;", "mode", "Landroid/view/MenuItem;", "item", "", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "Landroid/view/Menu;", "menu", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Landroid/view/View;", "view", "Landroid/graphics/Rect;", "outRect", "onGetContentRect", "(Landroid/view/ActionMode;Landroid/view/View;Landroid/graphics/Rect;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {
    public static final int $stable = 8;
    public final TextActionModeCallback a;

    public FloatingTextActionModeCallback(@NotNull TextActionModeCallback textActionModeCallback0) {
        this.a = textActionModeCallback0;
    }

    @Override  // android.view.ActionMode$Callback
    public boolean onActionItemClicked(@Nullable ActionMode actionMode0, @Nullable MenuItem menuItem0) {
        return this.a.onActionItemClicked(actionMode0, menuItem0);
    }

    @Override  // android.view.ActionMode$Callback
    public boolean onCreateActionMode(@Nullable ActionMode actionMode0, @Nullable Menu menu0) {
        return this.a.onCreateActionMode(actionMode0, menu0);
    }

    @Override  // android.view.ActionMode$Callback
    public void onDestroyActionMode(@Nullable ActionMode actionMode0) {
        this.a.onDestroyActionMode();
    }

    @Override  // android.view.ActionMode$Callback2
    public void onGetContentRect(@Nullable ActionMode actionMode0, @Nullable View view0, @Nullable Rect rect0) {
        androidx.compose.ui.geometry.Rect rect1 = this.a.getRect();
        if(rect0 != null) {
            rect0.set(((int)rect1.getLeft()), ((int)rect1.getTop()), ((int)rect1.getRight()), ((int)rect1.getBottom()));
        }
    }

    @Override  // android.view.ActionMode$Callback
    public boolean onPrepareActionMode(@Nullable ActionMode actionMode0, @Nullable Menu menu0) {
        return this.a.onPrepareActionMode(actionMode0, menu0);
    }
}

