package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/TextContextMenuItems;", "", "", "resolvedString", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Cut", "Copy", "Paste", "SelectAll", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public enum TextContextMenuItems {
    Cut(0x1040003),
    Copy(0x1040001),
    Paste(0x104000B),
    SelectAll(0x104000D);

    public final int a;

    public TextContextMenuItems(int v1) {
        this.a = v1;
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    public final String resolvedString(@Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-309609081, v, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:89)");
        }
        String s = StringResources_androidKt.stringResource(this.a, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return s;
    }
}

