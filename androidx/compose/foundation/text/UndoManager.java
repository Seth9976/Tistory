package androidx.compose.foundation.text;

import a7.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000F\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\r\u0010\r\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u000F\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/UndoManager;", "", "", "maxStoredCharacters", "<init>", "(I)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "now", "", "snapshotIfNeeded", "(Landroidx/compose/ui/text/input/TextFieldValue;J)V", "forceNextSnapshot", "()V", "makeSnapshot", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "undo", "()Landroidx/compose/ui/text/input/TextFieldValue;", "redo", "a", "I", "getMaxStoredCharacters", "()I", "a7/b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class UndoManager {
    public static final int $stable = 8;
    public final int a;
    public b b;
    public b c;
    public int d;
    public Long e;
    public boolean f;

    public UndoManager() {
        this(0, 1, null);
    }

    public UndoManager(int v) {
        this.a = v;
    }

    public UndoManager(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 100000;
        }
        this(v);
    }

    public final void forceNextSnapshot() {
        this.f = true;
    }

    public final int getMaxStoredCharacters() {
        return this.a;
    }

    public final void makeSnapshot(@NotNull TextFieldValue textFieldValue0) {
        b b4;
        String s1;
        this.f = false;
        if(Intrinsics.areEqual(textFieldValue0, (this.b == null ? null : ((TextFieldValue)this.b.c)))) {
            return;
        }
        String s = textFieldValue0.getText();
        b b0 = this.b;
        if(b0 == null) {
            s1 = null;
        }
        else {
            TextFieldValue textFieldValue1 = (TextFieldValue)b0.c;
            s1 = textFieldValue1 == null ? null : textFieldValue1.getText();
        }
        if(Intrinsics.areEqual(s, s1)) {
            b b1 = this.b;
            if(b1 != null) {
                b1.c = textFieldValue0;
            }
            return;
        }
        this.b = new b(24, this.b, textFieldValue0);
        this.c = null;
        int v = textFieldValue0.getText().length() + this.d;
        this.d = v;
        if(v > this.a) {
            b b2 = this.b;
            if((b2 == null ? null : ((b)b2.b)) != null) {
                while(true) {
                    if(b2 == null) {
                        b4 = null;
                    }
                    else {
                        b b3 = (b)b2.b;
                        if(b3 != null) {
                            b4 = (b)b3.b;
                        }
                    }
                    if(b4 == null) {
                        break;
                    }
                    b2 = (b)b2.b;
                }
                if(b2 != null) {
                    b2.b = null;
                }
            }
        }
    }

    @Nullable
    public final TextFieldValue redo() {
        b b0 = this.c;
        if(b0 != null) {
            this.c = (b)b0.b;
            TextFieldValue textFieldValue0 = (TextFieldValue)b0.c;
            this.b = new b(24, this.b, textFieldValue0);
            this.d = textFieldValue0.getText().length() + this.d;
            return (TextFieldValue)b0.c;
        }
        return null;
    }

    public final void snapshotIfNeeded(@NotNull TextFieldValue textFieldValue0, long v) {
        if(this.f || v > (this.e == null ? 0L : ((long)this.e)) + 5000L) {
            this.e = v;
            this.makeSnapshot(textFieldValue0);
        }
    }

    public static void snapshotIfNeeded$default(UndoManager undoManager0, TextFieldValue textFieldValue0, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x1991C543CF5L;
        }
        undoManager0.snapshotIfNeeded(textFieldValue0, v);
    }

    @Nullable
    public final TextFieldValue undo() {
        b b0 = this.b;
        if(b0 != null) {
            b b1 = (b)b0.b;
            if(b1 != null) {
                this.b = b1;
                this.d -= ((TextFieldValue)b0.c).getText().length();
                this.c = new b(24, this.c, ((TextFieldValue)b0.c));
                return (TextFieldValue)b1.c;
            }
        }
        return null;
    }
}

