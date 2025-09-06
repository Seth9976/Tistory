package androidx.compose.ui.text.input;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\u000E\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/input/MoveCursorCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "", "amount", "<init>", "(I)V", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getAmount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MoveCursorCommand implements EditCommand {
    public static final int $stable;
    public final int a;

    public MoveCursorCommand(int v) {
        this.a = v;
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer editingBuffer0) {
        if(editingBuffer0.getCursor$ui_text_release() == -1) {
            editingBuffer0.setCursor$ui_text_release(editingBuffer0.getSelectionStart$ui_text_release());
        }
        int v = editingBuffer0.getSelectionStart$ui_text_release();
        String s = editingBuffer0.toString();
        int v1 = 0;
        int v2 = this.a;
        if(v2 > 0) {
            while(v1 < v2) {
                int v3 = JvmCharHelpers_androidKt.findFollowingBreak(s, v);
                if(v3 == -1) {
                    break;
                }
                ++v1;
                v = v3;
            }
        }
        else {
            while(v1 < -v2) {
                int v4 = JvmCharHelpers_androidKt.findPrecedingBreak(s, v);
                if(v4 == -1) {
                    break;
                }
                ++v1;
                v = v4;
            }
        }
        editingBuffer0.setCursor$ui_text_release(v);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof MoveCursorCommand ? this.a == ((MoveCursorCommand)object0).a : false;
    }

    public final int getAmount() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override
    @NotNull
    public String toString() {
        return b.p(new StringBuilder("MoveCursorCommand(amount="), this.a, ')');
    }
}

