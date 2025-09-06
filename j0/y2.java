package j0;

import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.TextFieldKeyInput;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class y2 extends Lambda implements Function1 {
    public final KeyCommand w;
    public final TextFieldKeyInput x;
    public final BooleanRef y;

    public y2(KeyCommand keyCommand0, TextFieldKeyInput textFieldKeyInput0, BooleanRef ref$BooleanRef0) {
        this.w = keyCommand0;
        this.x = textFieldKeyInput0;
        this.y = ref$BooleanRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextFieldPreparedSelection textFieldPreparedSelection0 = (TextFieldPreparedSelection)object0;
        TextFieldKeyInput textFieldKeyInput0 = this.x;
        switch(this.w) {
            case 1: {
                textFieldKeyInput0.getSelectionManager().copy$foundation_release(false);
                return Unit.INSTANCE;
            }
            case 2: {
                textFieldKeyInput0.getSelectionManager().paste$foundation_release();
                return Unit.INSTANCE;
            }
            case 3: {
                textFieldKeyInput0.getSelectionManager().cut$foundation_release();
                return Unit.INSTANCE;
            }
            case 4: {
                textFieldPreparedSelection0.collapseLeftOr(o.C);
                return Unit.INSTANCE;
            }
            case 5: {
                textFieldPreparedSelection0.collapseRightOr(o.D);
                return Unit.INSTANCE;
            }
            case 6: {
                textFieldPreparedSelection0.moveCursorLeftByWord();
                return Unit.INSTANCE;
            }
            case 7: {
                textFieldPreparedSelection0.moveCursorRightByWord();
                return Unit.INSTANCE;
            }
            case 8: {
                textFieldPreparedSelection0.moveCursorPrevByParagraph();
                return Unit.INSTANCE;
            }
            case 9: {
                textFieldPreparedSelection0.moveCursorNextByParagraph();
                return Unit.INSTANCE;
            }
            case 10: {
                textFieldPreparedSelection0.moveCursorUpByLine();
                return Unit.INSTANCE;
            }
            case 11: {
                textFieldPreparedSelection0.moveCursorDownByLine();
                return Unit.INSTANCE;
            }
            case 12: {
                textFieldPreparedSelection0.moveCursorUpByPage();
                return Unit.INSTANCE;
            }
            case 13: {
                textFieldPreparedSelection0.moveCursorDownByPage();
                return Unit.INSTANCE;
            }
            case 14: {
                textFieldPreparedSelection0.moveCursorToLineStart();
                return Unit.INSTANCE;
            }
            case 15: {
                textFieldPreparedSelection0.moveCursorToLineEnd();
                return Unit.INSTANCE;
            }
            case 16: {
                textFieldPreparedSelection0.moveCursorToLineLeftSide();
                return Unit.INSTANCE;
            }
            case 17: {
                textFieldPreparedSelection0.moveCursorToLineRightSide();
                return Unit.INSTANCE;
            }
            case 18: {
                textFieldPreparedSelection0.moveCursorToHome();
                return Unit.INSTANCE;
            }
            case 19: {
                textFieldPreparedSelection0.moveCursorToEnd();
                return Unit.INSTANCE;
            }
            case 20: {
                List list0 = textFieldPreparedSelection0.deleteIfSelectedOr(o.E);
                if(list0 != null) {
                    TextFieldKeyInput.access$apply(textFieldKeyInput0, list0);
                    return Unit.INSTANCE;
                }
                break;
            }
            case 21: {
                List list1 = textFieldPreparedSelection0.deleteIfSelectedOr(o.F);
                if(list1 != null) {
                    TextFieldKeyInput.access$apply(textFieldKeyInput0, list1);
                    return Unit.INSTANCE;
                }
                break;
            }
            case 22: {
                List list2 = textFieldPreparedSelection0.deleteIfSelectedOr(o.G);
                if(list2 != null) {
                    TextFieldKeyInput.access$apply(textFieldKeyInput0, list2);
                    return Unit.INSTANCE;
                }
                break;
            }
            case 23: {
                List list3 = textFieldPreparedSelection0.deleteIfSelectedOr(o.H);
                if(list3 != null) {
                    TextFieldKeyInput.access$apply(textFieldKeyInput0, list3);
                    return Unit.INSTANCE;
                }
                break;
            }
            case 24: {
                List list4 = textFieldPreparedSelection0.deleteIfSelectedOr(o.I);
                if(list4 != null) {
                    TextFieldKeyInput.access$apply(textFieldKeyInput0, list4);
                    return Unit.INSTANCE;
                }
                break;
            }
            case 25: {
                List list5 = textFieldPreparedSelection0.deleteIfSelectedOr(o.J);
                if(list5 != null) {
                    TextFieldKeyInput.access$apply(textFieldKeyInput0, list5);
                    return Unit.INSTANCE;
                }
                break;
            }
            case 26: {
                if(!textFieldKeyInput0.getSingleLine()) {
                    TextFieldKeyInput.access$apply(textFieldKeyInput0, new CommitTextCommand("\n", 1));
                    return Unit.INSTANCE;
                }
                textFieldKeyInput0.getState().getOnImeActionPerformed().invoke(ImeAction.box-impl(textFieldKeyInput0.l));
                return Unit.INSTANCE;
            }
            case 27: {
                if(!textFieldKeyInput0.getSingleLine()) {
                    TextFieldKeyInput.access$apply(textFieldKeyInput0, new CommitTextCommand("\t", 1));
                    return Unit.INSTANCE;
                }
                this.y.element = false;
                return Unit.INSTANCE;
            }
            case 28: {
                textFieldPreparedSelection0.selectAll();
                return Unit.INSTANCE;
            }
            case 29: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorLeft()).selectMovement();
                return Unit.INSTANCE;
            }
            case 30: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorRight()).selectMovement();
                return Unit.INSTANCE;
            }
            case 0x1F: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorLeftByWord()).selectMovement();
                return Unit.INSTANCE;
            }
            case 0x20: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorRightByWord()).selectMovement();
                return Unit.INSTANCE;
            }
            case 33: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorPrevByParagraph()).selectMovement();
                return Unit.INSTANCE;
            }
            case 34: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorNextByParagraph()).selectMovement();
                return Unit.INSTANCE;
            }
            case 35: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorToLineStart()).selectMovement();
                return Unit.INSTANCE;
            }
            case 36: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorToLineEnd()).selectMovement();
                return Unit.INSTANCE;
            }
            case 37: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorToLineLeftSide()).selectMovement();
                return Unit.INSTANCE;
            }
            case 38: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorToLineRightSide()).selectMovement();
                return Unit.INSTANCE;
            }
            case 39: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorUpByLine()).selectMovement();
                return Unit.INSTANCE;
            }
            case 40: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorDownByLine()).selectMovement();
                return Unit.INSTANCE;
            }
            case 41: {
                textFieldPreparedSelection0.moveCursorUpByPage().selectMovement();
                return Unit.INSTANCE;
            }
            case 42: {
                textFieldPreparedSelection0.moveCursorDownByPage().selectMovement();
                return Unit.INSTANCE;
            }
            case 43: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorToHome()).selectMovement();
                return Unit.INSTANCE;
            }
            case 44: {
                ((TextFieldPreparedSelection)textFieldPreparedSelection0.moveCursorToEnd()).selectMovement();
                return Unit.INSTANCE;
            }
            case 45: {
                textFieldPreparedSelection0.deselect();
                return Unit.INSTANCE;
            }
            case 46: {
                UndoManager undoManager0 = textFieldKeyInput0.getUndoManager();
                if(undoManager0 != null) {
                    undoManager0.makeSnapshot(textFieldPreparedSelection0.getValue());
                }
                UndoManager undoManager1 = textFieldKeyInput0.getUndoManager();
                if(undoManager1 != null) {
                    TextFieldValue textFieldValue0 = undoManager1.undo();
                    if(textFieldValue0 != null) {
                        textFieldKeyInput0.k.invoke(textFieldValue0);
                        return Unit.INSTANCE;
                    }
                }
                break;
            }
            case 0x2F: {
                UndoManager undoManager2 = textFieldKeyInput0.getUndoManager();
                if(undoManager2 != null) {
                    TextFieldValue textFieldValue1 = undoManager2.redo();
                    if(textFieldValue1 != null) {
                        textFieldKeyInput0.k.invoke(textFieldValue1);
                        return Unit.INSTANCE;
                    }
                }
                break;
            }
            default: {
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}

