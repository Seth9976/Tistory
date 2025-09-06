package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditingBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/text/input/internal/HandwritingGesture_androidKt$compoundEditCommand$1", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class HandwritingGesture_androidKt.compoundEditCommand.1 implements EditCommand {
    public final EditCommand[] a;

    public HandwritingGesture_androidKt.compoundEditCommand.1(EditCommand[] arr_editCommand) {
        this.a = arr_editCommand;
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer editingBuffer0) {
        EditCommand[] arr_editCommand = this.a;
        for(int v = 0; v < arr_editCommand.length; ++v) {
            arr_editCommand[v].applyTo(editingBuffer0);
        }
    }
}

