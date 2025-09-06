package androidx.compose.ui.text.input;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000F\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001A\u0004\b\u001A\u0010\u0012¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "", "lengthBeforeCursor", "lengthAfterCursor", "<init>", "(II)V", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "getLengthBeforeCursor", "b", "getLengthAfterCursor", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n+ 2 MathUtils.kt\nandroidx/compose/ui/text/input/MathUtilsKt\n*L\n1#1,570:1\n23#2,3:571\n32#2,4:574\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/ui/text/input/DeleteSurroundingTextCommand\n*L\n268#1:571,3\n273#1:574,4\n*E\n"})
public final class DeleteSurroundingTextCommand implements EditCommand {
    public static final int $stable;
    public final int a;
    public final int b;

    public DeleteSurroundingTextCommand(int v, int v1) {
        this.a = v;
        this.b = v1;
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + v + " and " + v1 + " respectively.").toString());
        }
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer editingBuffer0) {
        int v = editingBuffer0.getSelectionEnd$ui_text_release();
        int v1 = v + this.b;
        editingBuffer0.delete$ui_text_release(editingBuffer0.getSelectionEnd$ui_text_release(), Math.min((((v ^ v1) & (this.b ^ v1)) >= 0 ? v + this.b : editingBuffer0.getLength$ui_text_release()), editingBuffer0.getLength$ui_text_release()));
        int v2 = editingBuffer0.getSelectionStart$ui_text_release();
        editingBuffer0.delete$ui_text_release(Math.max(0, (((v2 ^ v2 - this.a) & (this.a ^ v2)) >= 0 ? v2 - this.a : 0)), editingBuffer0.getSelectionStart$ui_text_release());
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        return this.a == ((DeleteSurroundingTextCommand)object0).a ? this.b == ((DeleteSurroundingTextCommand)object0).b : false;
    }

    public final int getLengthAfterCursor() {
        return this.b;
    }

    public final int getLengthBeforeCursor() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a * 0x1F + this.b;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", lengthAfterCursor=");
        return b.p(stringBuilder0, this.b, ')');
    }
}

