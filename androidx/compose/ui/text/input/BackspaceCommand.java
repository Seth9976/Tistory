package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\u0013\u0010\u0007\u001A\u00020\b2\b\u0010\t\u001A\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000B\u001A\u00020\fH\u0016J\b\u0010\r\u001A\u00020\u000EH\u0016¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/text/input/BackspaceCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "()V", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BackspaceCommand implements EditCommand {
    public static final int $stable;

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer editingBuffer0) {
        if(editingBuffer0.hasComposition$ui_text_release()) {
            editingBuffer0.delete$ui_text_release(editingBuffer0.getCompositionStart$ui_text_release(), editingBuffer0.getCompositionEnd$ui_text_release());
            return;
        }
        switch(editingBuffer0.getCursor$ui_text_release()) {
            case -1: {
                editingBuffer0.setCursor$ui_text_release(editingBuffer0.getSelectionStart$ui_text_release());
                editingBuffer0.delete$ui_text_release(editingBuffer0.getSelectionStart$ui_text_release(), editingBuffer0.getSelectionEnd$ui_text_release());
                return;
            }
            case 0: {
                return;
            }
            default: {
                editingBuffer0.delete$ui_text_release(JvmCharHelpers_androidKt.findPrecedingBreak(editingBuffer0.toString(), editingBuffer0.getCursor$ui_text_release()), editingBuffer0.getCursor$ui_text_release());
            }
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof BackspaceCommand;
    }

    @Override
    public int hashCode() {
        return Reflection.getOrCreateKotlinClass(BackspaceCommand.class).hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "BackspaceCommand()";
    }
}

