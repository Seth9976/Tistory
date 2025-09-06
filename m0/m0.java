package m0;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function1 {
    public final int w;
    public final TextFieldDecoratorModifierNode x;

    public m0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0, int v) {
        this.w = v;
        this.x = textFieldDecoratorModifierNode0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                TextLayoutResult textLayoutResult0 = this.x.getTextLayoutState().getLayoutResult();
                return textLayoutResult0 == null ? false : Boolean.valueOf(((List)object0).add(textLayoutResult0));
            }
            case 1: {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode0 = this.x;
                if(!textFieldDecoratorModifierNode0.d()) {
                    return false;
                }
                textFieldDecoratorModifierNode0.getTextFieldState().replaceAll(((AnnotatedString)object0));
                return true;
            }
            case 2: {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode1 = this.x;
                if(!textFieldDecoratorModifierNode1.d()) {
                    return false;
                }
                TransformedTextFieldState.replaceSelectedText$default(textFieldDecoratorModifierNode1.getTextFieldState(), ((AnnotatedString)object0), true, null, 4, null);
                return true;
            }
            case 3: {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode2 = this.x;
                if(ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode2) != null) {
                    DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(textFieldDecoratorModifierNode2, ((DragAndDropEvent)object0));
                }
                return Unit.INSTANCE;
            }
            case 4: {
                long v = TextLayoutStateKt.fromWindowToDecoration-Uv8p0NA(this.x.getTextLayoutState(), ((Offset)object0).unbox-impl());
                int v1 = TextLayoutState.getOffsetForPosition-3MmeM6k$default(this.x.getTextLayoutState(), v, false, 2, null);
                this.x.getTextFieldState().selectCharsIn-5zc-tL8(TextRangeKt.TextRange(v1));
                this.x.getTextFieldSelectionState().updateHandleDragging-Uv8p0NA(Handle.Cursor, v);
                return Unit.INSTANCE;
            }
            case 5: {
                DragAndDropEvent dragAndDropEvent1 = (DragAndDropEvent)object0;
                TextFieldDecoratorModifierNode.access$emitDragExitEvent(this.x);
                this.x.getTextFieldSelectionState().clearHandleDragging();
                ReceiveContentConfiguration receiveContentConfiguration0 = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.x);
                if(receiveContentConfiguration0 != null) {
                    ReceiveContentListener receiveContentListener0 = receiveContentConfiguration0.getReceiveContentListener();
                    if(receiveContentListener0 != null) {
                        receiveContentListener0.onDragExit();
                    }
                }
                return Unit.INSTANCE;
            }
            default: {
                DragAndDropEvent dragAndDropEvent0 = (DragAndDropEvent)object0;
                TextFieldDecoratorModifierNode.access$emitDragExitEvent(this.x);
                return Unit.INSTANCE;
            }
        }
    }
}

