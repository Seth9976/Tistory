package androidx.compose.ui.platform;

import a2.b;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u000E\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u000E\u0010\n\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000E\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000E\u0010\f\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000E\u0010\r\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00128\u0016@RX\u0096\u000E¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/Function0;", "", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "showMenu", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "hide", "()V", "Landroidx/compose/ui/platform/TextToolbarStatus;", "<set-?>", "d", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "status", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidTextToolbar implements TextToolbar {
    public static final int $stable = 8;
    public final View a;
    public ActionMode b;
    public final TextActionModeCallback c;
    public TextToolbarStatus d;

    public AndroidTextToolbar(@NotNull View view0) {
        this.a = view0;
        this.c = new TextActionModeCallback(new b(this, 15), null, null, null, null, null, 62, null);
        this.d = TextToolbarStatus.Hidden;
    }

    @Override  // androidx.compose.ui.platform.TextToolbar
    @NotNull
    public TextToolbarStatus getStatus() {
        return this.d;
    }

    @Override  // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.d = TextToolbarStatus.Hidden;
        ActionMode actionMode0 = this.b;
        if(actionMode0 != null) {
            actionMode0.finish();
        }
        this.b = null;
    }

    @Override  // androidx.compose.ui.platform.TextToolbar
    public void showMenu(@NotNull Rect rect0, @Nullable Function0 function00, @Nullable Function0 function01, @Nullable Function0 function02, @Nullable Function0 function03) {
        TextActionModeCallback textActionModeCallback0 = this.c;
        textActionModeCallback0.setRect(rect0);
        textActionModeCallback0.setOnCopyRequested(function00);
        textActionModeCallback0.setOnCutRequested(function02);
        textActionModeCallback0.setOnPasteRequested(function01);
        textActionModeCallback0.setOnSelectAllRequested(function03);
        ActionMode actionMode0 = this.b;
        if(actionMode0 == null) {
            this.d = TextToolbarStatus.Shown;
            FloatingTextActionModeCallback floatingTextActionModeCallback0 = new FloatingTextActionModeCallback(textActionModeCallback0);
            this.b = TextToolbarHelperMethods.INSTANCE.startActionMode(this.a, floatingTextActionModeCallback0, 1);
            return;
        }
        if(actionMode0 != null) {
            actionMode0.invalidate();
        }
    }
}

