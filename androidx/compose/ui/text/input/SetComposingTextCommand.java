package androidx.compose.ui.text.input;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000F\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\u0016R\u0011\u0010\t\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/input/SetComposingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "", "newCursorPosition", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;I)V", "", "text", "(Ljava/lang/String;I)V", "Landroidx/compose/ui/text/input/EditingBuffer;", "buffer", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "b", "I", "getNewCursorPosition", "getText", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SetComposingTextCommand implements EditCommand {
    public static final int $stable;
    public final AnnotatedString a;
    public final int b;

    public SetComposingTextCommand(@NotNull AnnotatedString annotatedString0, int v) {
        this.a = annotatedString0;
        this.b = v;
    }

    public SetComposingTextCommand(@NotNull String s, int v) {
        this(new AnnotatedString(s, null, null, 6, null), v);
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer editingBuffer0) {
        if(editingBuffer0.hasComposition$ui_text_release()) {
            int v = editingBuffer0.getCompositionStart$ui_text_release();
            editingBuffer0.replace$ui_text_release(editingBuffer0.getCompositionStart$ui_text_release(), editingBuffer0.getCompositionEnd$ui_text_release(), this.getText());
            if(this.getText().length() > 0) {
                editingBuffer0.setComposition$ui_text_release(v, this.getText().length() + v);
            }
        }
        else {
            int v1 = editingBuffer0.getSelectionStart$ui_text_release();
            editingBuffer0.replace$ui_text_release(editingBuffer0.getSelectionStart$ui_text_release(), editingBuffer0.getSelectionEnd$ui_text_release(), this.getText());
            if(this.getText().length() > 0) {
                editingBuffer0.setComposition$ui_text_release(v1, this.getText().length() + v1);
            }
        }
        int v2 = editingBuffer0.getCursor$ui_text_release();
        editingBuffer0.setCursor$ui_text_release(c.coerceIn((this.b <= 0 ? v2 + this.b - this.getText().length() : v2 + this.b - 1), 0, editingBuffer0.getLength$ui_text_release()));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SetComposingTextCommand)) {
            return false;
        }
        return Intrinsics.areEqual(this.getText(), ((SetComposingTextCommand)object0).getText()) ? this.b == ((SetComposingTextCommand)object0).b : false;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.a;
    }

    public final int getNewCursorPosition() {
        return this.b;
    }

    @NotNull
    public final String getText() {
        return this.a.getText();
    }

    @Override
    public int hashCode() {
        return this.getText().hashCode() * 0x1F + this.b;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SetComposingTextCommand(text=\'");
        stringBuilder0.append(this.getText());
        stringBuilder0.append("\', newCursorPosition=");
        return b.p(stringBuilder0, this.b, ')');
    }
}

