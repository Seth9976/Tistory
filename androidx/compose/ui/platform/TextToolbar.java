package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001A\u00020\u0007H&JX\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\n2\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0010\b\u0002\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/TextToolbar;", "", "status", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "hide", "", "showMenu", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "Lkotlin/Function0;", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface TextToolbar {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void showMenu$default(TextToolbar textToolbar0, Rect rect0, Function0 function00, Function0 function01, Function0 function02, Function0 function03, int v, Object object0) {
            TextToolbar.showMenu$default(textToolbar0, rect0, function00, function01, function02, function03, v, object0);
        }
    }

    @NotNull
    TextToolbarStatus getStatus();

    void hide();

    void showMenu(@NotNull Rect arg1, @Nullable Function0 arg2, @Nullable Function0 arg3, @Nullable Function0 arg4, @Nullable Function0 arg5);

    static void showMenu$default(TextToolbar textToolbar0, Rect rect0, Function0 function00, Function0 function01, Function0 function02, Function0 function03, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        textToolbar0.showMenu(rect0, ((v & 2) == 0 ? function00 : null), ((v & 4) == 0 ? function01 : null), ((v & 8) == 0 ? function02 : null), ((v & 16) == 0 ? function03 : null));
    }
}

