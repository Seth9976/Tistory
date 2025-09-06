package j0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public static final o A;
    public static final o B;
    public static final o C;
    public static final o D;
    public static final o E;
    public static final o F;
    public static final o G;
    public static final o H;
    public static final o I;
    public static final o J;
    public static final o K;
    public static final o L;
    public final int w;
    public static final o x;
    public static final o y;
    public static final o z;

    static {
        o.x = new o(1, 0);
        o.y = new o(1, 1);
        o.z = new o(1, 2);
        o.A = new o(1, 3);
        o.B = new o(1, 4);
        o.C = new o(1, 5);
        o.D = new o(1, 6);
        o.E = new o(1, 7);
        o.F = new o(1, 8);
        o.G = new o(1, 9);
        o.H = new o(1, 10);
        o.I = new o(1, 11);
        o.J = new o(1, 12);
        o.K = new o(1, 13);
        o.L = new o(1, 14);
    }

    public o(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                SemanticsPropertiesKt.password(((SemanticsPropertyReceiver)object0));
                SemanticsPropertiesKt.copyText$default(((SemanticsPropertyReceiver)object0), null, n.x, 1, null);
                SemanticsPropertiesKt.cutText$default(((SemanticsPropertyReceiver)object0), null, n.y, 1, null);
                return Unit.INSTANCE;
            }
            case 1: {
                KeyCommand keyCommand0 = KeyMapping_androidKt.getPlatformDefaultKeyMapping().map-ZmokQxo(((KeyEvent)object0).unbox-impl());
                return keyCommand0 == KeyCommand.COPY || keyCommand0 == KeyCommand.CUT;
            }
            case 2: {
                return ((Number)object0).longValue();
            }
            case 3: {
                TextFieldValue textFieldValue0 = (TextFieldValue)object0;
                return Unit.INSTANCE;
            }
            case 4: {
                TextFieldValue textFieldValue1 = (TextFieldValue)object0;
                return Unit.INSTANCE;
            }
            case 5: {
                ((TextFieldPreparedSelection)object0).moveCursorLeft();
                return Unit.INSTANCE;
            }
            case 6: {
                ((TextFieldPreparedSelection)object0).moveCursorRight();
                return Unit.INSTANCE;
            }
            case 7: {
                return new DeleteSurroundingTextCommand(TextRange.getEnd-impl(((TextFieldPreparedSelection)object0).getSelection-d9O1mEE()) - ((TextFieldPreparedSelection)object0).getPrecedingCharacterIndex(), 0);
            }
            case 8: {
                int v = ((TextFieldPreparedSelection)object0).getNextCharacterIndex();
                return v != -1 ? new DeleteSurroundingTextCommand(0, v - TextRange.getEnd-impl(((TextFieldPreparedSelection)object0).getSelection-d9O1mEE())) : null;
            }
            case 9: {
                Integer integer0 = ((TextFieldPreparedSelection)object0).getPreviousWordOffset();
                return integer0 != null ? new DeleteSurroundingTextCommand(TextRange.getEnd-impl(((TextFieldPreparedSelection)object0).getSelection-d9O1mEE()) - integer0.intValue(), 0) : null;
            }
            case 10: {
                Integer integer1 = ((TextFieldPreparedSelection)object0).getNextWordOffset();
                return integer1 != null ? new DeleteSurroundingTextCommand(0, integer1.intValue() - TextRange.getEnd-impl(((TextFieldPreparedSelection)object0).getSelection-d9O1mEE())) : null;
            }
            case 11: {
                Integer integer2 = ((TextFieldPreparedSelection)object0).getLineStartByOffset();
                return integer2 != null ? new DeleteSurroundingTextCommand(TextRange.getEnd-impl(((TextFieldPreparedSelection)object0).getSelection-d9O1mEE()) - integer2.intValue(), 0) : null;
            }
            case 12: {
                Integer integer3 = ((TextFieldPreparedSelection)object0).getLineEndByOffset();
                return integer3 != null ? new DeleteSurroundingTextCommand(0, integer3.intValue() - TextRange.getEnd-impl(((TextFieldPreparedSelection)object0).getSelection-d9O1mEE())) : null;
            }
            case 13: {
                TextFieldValue textFieldValue2 = (TextFieldValue)object0;
                return Unit.INSTANCE;
            }
            default: {
                Object object1 = ((List)object0).get(1);
                Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.Boolean");
                Object object2 = ((List)object0).get(0);
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.Float");
                return new TextFieldScrollerPosition((((Boolean)object1).booleanValue() ? Orientation.Vertical : Orientation.Horizontal), ((float)(((Float)object2))));
            }
        }
    }
}

