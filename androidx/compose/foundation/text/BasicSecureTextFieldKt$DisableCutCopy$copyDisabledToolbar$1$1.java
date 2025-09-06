package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004JW\u0010\f\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00052\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u000E\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u000E\u0010\n\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u000E\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001A\u00020\u000E8\u0016X\u0096\u0005¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/compose/foundation/text/BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1", "Landroidx/compose/ui/platform/TextToolbar;", "", "hide", "()V", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/Function0;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "showMenu", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "status", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BasicSecureTextFieldKt.DisableCutCopy.copyDisabledToolbar.1.1 implements TextToolbar {
    public final TextToolbar a;
    public final TextToolbar b;

    public BasicSecureTextFieldKt.DisableCutCopy.copyDisabledToolbar.1.1(TextToolbar textToolbar0) {
        this.b = textToolbar0;
        this.a = textToolbar0;
    }

    @Override  // androidx.compose.ui.platform.TextToolbar
    @NotNull
    public TextToolbarStatus getStatus() {
        return this.a.getStatus();
    }

    @Override  // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.a.hide();
    }

    @Override  // androidx.compose.ui.platform.TextToolbar
    public void showMenu(@NotNull Rect rect0, @Nullable Function0 function00, @Nullable Function0 function01, @Nullable Function0 function02, @Nullable Function0 function03) {
        this.b.showMenu(rect0, null, function01, null, function03);
    }
}

