package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyEventHelpers_androidKt;
import androidx.compose.foundation.text.KeyMapping;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.a;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010JP\u0010\u001B\u001A\u00020\u000E2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000E2\f\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001A\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "onPreKeyEvent", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "editable", "singleLine", "Lkotlin/Function0;", "", "onSubmit", "onKeyEvent-6ptp14s", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZZLkotlin/jvm/functions/Function0;)Z", "onKeyEvent", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextFieldKeyEventHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n237#1,10:284\n247#1,5:435\n318#2,2:266\n323#2:283\n314#2,6:391\n323#2:412\n314#2,6:413\n323#2:434\n261#3,15:268\n261#3,15:397\n261#3,15:419\n115#4,8:294\n123#4,8:303\n115#4,16:311\n115#4,16:327\n115#4,16:343\n115#4,16:359\n115#4,16:375\n1#5:302\n*S KotlinDebug\n*F\n+ 1 TextFieldKeyEventHandler.kt\nandroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler\n*L\n112#1:284,10\n112#1:435,5\n93#1:266,2\n93#1:283\n177#1:391,6\n177#1:412\n188#1:413,6\n188#1:434\n93#1:268,15\n177#1:397,15\n188#1:419,15\n134#1:294,8\n134#1:303,8\n144#1:311,16\n152#1:327,16\n158#1:343,16\n164#1:359,16\n170#1:375,16\n*E\n"})
public abstract class TextFieldKeyEventHandler {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[KeyCommand.values().length];
            try {
                arr_v[KeyCommand.COPY.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.PASTE.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.CUT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.LEFT_WORD.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.UP.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.DOWN.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.PAGE_UP.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.LINE_START.ordinal()] = 14;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.LINE_END.ordinal()] = 15;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.LINE_LEFT.ordinal()] = 16;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.HOME.ordinal()] = 18;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.END.ordinal()] = 19;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.NEW_LINE.ordinal()] = 26;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.TAB.ordinal()] = 27;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_ALL.ordinal()] = 28;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 0x1F;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 0x20;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_UP.ordinal()] = 39;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_HOME.ordinal()] = 43;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.SELECT_END.ordinal()] = 44;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.DESELECT.ordinal()] = 45;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.UNDO.ordinal()] = 46;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.REDO.ordinal()] = 0x2F;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[KeyCommand.CHARACTER_PALETTE.ordinal()] = 0x30;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final TextFieldPreparedSelectionState a;
    public final DeadKeyCombiner b;
    public final KeyMapping c;

    public TextFieldKeyEventHandler() {
        this.a = new TextFieldPreparedSelectionState();
        this.b = new DeadKeyCombiner();
        this.c = KeyMapping_androidKt.getPlatformDefaultKeyMapping();
    }

    public boolean onKeyEvent-6ptp14s(@NotNull KeyEvent keyEvent0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextLayoutState textLayoutState0, @NotNull TextFieldSelectionState textFieldSelectionState0, boolean z, boolean z1, @NotNull Function0 function00) {
        float f;
        Rect rect0;
        boolean z2 = false;
        if(!KeyEventType.equals-impl0(KeyEvent_androidKt.getType-ZmokQxo(keyEvent0), 2)) {
            return false;
        }
        if(TextFieldKeyInput_androidKt.isTypedEvent-ZmokQxo(keyEvent0)) {
            Integer integer0 = this.b.consume-ZmokQxo(keyEvent0);
            if(integer0 != null) {
                String s = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(2), ((int)integer0)).toString();
                if(z) {
                    boolean z3 = TextFieldKeyEventHandler_androidKt.isFromSoftKeyboard-ZmokQxo(keyEvent0);
                    TextFieldState textFieldState0 = transformedTextFieldState0.a;
                    textFieldState0.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                    EditingBuffer editingBuffer0 = textFieldState0.getMainBuffer$foundation_release();
                    editingBuffer0.commitComposition();
                    EditCommandKt.commitText(editingBuffer0, s, 1);
                    TextFieldState.access$commitEditAsUser(textFieldState0, transformedTextFieldState0.b, !z3, TextFieldEditUndoBehavior.MergeIfPossible);
                    this.a.resetCachedX();
                    return true;
                }
                return false;
            }
        }
        KeyCommand keyCommand0 = this.c.map-ZmokQxo(keyEvent0);
        if(keyCommand0 != null && (!keyCommand0.getEditsText() || z)) {
            boolean z4 = TextFieldKeyEventHandler_androidKt.isFromSoftKeyboard-ZmokQxo(keyEvent0);
            TextLayoutResult textLayoutResult0 = textLayoutState0.getLayoutResult();
            LayoutCoordinates layoutCoordinates0 = textLayoutState0.getTextLayoutNodeCoordinates();
            TextRange textRange0 = null;
            if(layoutCoordinates0 == null) {
                f = NaNf;
            }
            else {
                if(!layoutCoordinates0.isAttached()) {
                    layoutCoordinates0 = null;
                }
                if(layoutCoordinates0 == null) {
                    f = NaNf;
                }
                else {
                    LayoutCoordinates layoutCoordinates1 = textLayoutState0.getDecoratorNodeCoordinates();
                    if(layoutCoordinates1 == null) {
                        rect0 = null;
                    }
                    else {
                        if(!layoutCoordinates1.isAttached()) {
                            layoutCoordinates1 = null;
                        }
                        rect0 = layoutCoordinates1 == null ? null : LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates1, layoutCoordinates0, false, 2, null);
                    }
                    f = rect0 == null ? NaNf : Size.getHeight-impl(rect0.getSize-NH-jbRc());
                }
            }
            TextFieldPreparedSelection textFieldPreparedSelection0 = new TextFieldPreparedSelection(transformedTextFieldState0, textLayoutResult0, z4, f, this.a);
            switch(WhenMappings.$EnumSwitchMapping$0[keyCommand0.ordinal()]) {
                case 1: {
                    textFieldSelectionState0.copy(false);
                    z2 = true;
                    break;
                }
                case 2: {
                    textFieldSelectionState0.paste();
                    z2 = true;
                    break;
                }
                case 3: {
                    textFieldSelectionState0.cut();
                    z2 = true;
                    break;
                }
                case 4: {
                    textFieldPreparedSelection0.collapseLeftOr(a.D);
                    z2 = true;
                    break;
                }
                case 5: {
                    textFieldPreparedSelection0.collapseRightOr(a.E);
                    z2 = true;
                    break;
                }
                case 6: {
                    textFieldPreparedSelection0.moveCursorLeftByWord();
                    z2 = true;
                    break;
                }
                case 7: {
                    textFieldPreparedSelection0.moveCursorRightByWord();
                    z2 = true;
                    break;
                }
                case 8: {
                    textFieldPreparedSelection0.moveCursorPrevByParagraph();
                    z2 = true;
                    break;
                }
                case 9: {
                    textFieldPreparedSelection0.moveCursorNextByParagraph();
                    z2 = true;
                    break;
                }
                case 10: {
                    textFieldPreparedSelection0.moveCursorUpByLine();
                    z2 = true;
                    break;
                }
                case 11: {
                    textFieldPreparedSelection0.moveCursorDownByLine();
                    z2 = true;
                    break;
                }
                case 12: {
                    textFieldPreparedSelection0.moveCursorUpByPage();
                    z2 = true;
                    break;
                }
                case 13: {
                    textFieldPreparedSelection0.moveCursorDownByPage();
                    z2 = true;
                    break;
                }
                case 14: {
                    textFieldPreparedSelection0.moveCursorToLineStart();
                    z2 = true;
                    break;
                }
                case 15: {
                    textFieldPreparedSelection0.moveCursorToLineEnd();
                    z2 = true;
                    break;
                }
                case 16: {
                    textFieldPreparedSelection0.moveCursorToLineLeftSide();
                    z2 = true;
                    break;
                }
                case 17: {
                    textFieldPreparedSelection0.moveCursorToLineRightSide();
                    z2 = true;
                    break;
                }
                case 18: {
                    textFieldPreparedSelection0.moveCursorToHome();
                    z2 = true;
                    break;
                }
                case 19: {
                    textFieldPreparedSelection0.moveCursorToEnd();
                    z2 = true;
                    break;
                }
                case 20: {
                    if(TextRange.getCollapsed-impl(textFieldPreparedSelection0.getSelection-d9O1mEE())) {
                        Integer integer1 = textFieldPreparedSelection0.getPrecedingCharacterIndex();
                        if(integer1.intValue() == -1) {
                            integer1 = null;
                        }
                        if(integer1 != null) {
                            textRange0 = TextRange.box-impl(TextRangeKt.TextRange(integer1.intValue(), TextRange.getEnd-impl(textFieldPreparedSelection0.getSelection-d9O1mEE())));
                        }
                        if(textRange0 != null) {
                            TransformedTextFieldState.replaceText-M8tDOmk$default(textFieldPreparedSelection0.a, "", textRange0.unbox-impl(), null, !textFieldPreparedSelection0.c, 4, null);
                        }
                    }
                    else {
                        TransformedTextFieldState.replaceText-M8tDOmk$default(textFieldPreparedSelection0.a, "", textFieldPreparedSelection0.getSelection-d9O1mEE(), null, !textFieldPreparedSelection0.c, 4, null);
                    }
                    z2 = true;
                    break;
                }
                case 21: {
                    if(TextRange.getCollapsed-impl(textFieldPreparedSelection0.getSelection-d9O1mEE())) {
                        Integer integer2 = textFieldPreparedSelection0.getNextCharacterIndex();
                        if(integer2.intValue() == -1) {
                            integer2 = null;
                        }
                        if(integer2 != null) {
                            textRange0 = TextRange.box-impl(TextRangeKt.TextRange(TextRange.getStart-impl(textFieldPreparedSelection0.getSelection-d9O1mEE()), integer2.intValue()));
                        }
                        if(textRange0 != null) {
                            TransformedTextFieldState.replaceText-M8tDOmk$default(textFieldPreparedSelection0.a, "", textRange0.unbox-impl(), null, !textFieldPreparedSelection0.c, 4, null);
                        }
                    }
                    else {
                        TransformedTextFieldState.replaceText-M8tDOmk$default(textFieldPreparedSelection0.a, "", textFieldPreparedSelection0.getSelection-d9O1mEE(), null, !textFieldPreparedSelection0.c, 4, null);
                    }
                    z2 = true;
                    break;
                }
                case 22: {
                    if(TextRange.getCollapsed-impl(textFieldPreparedSelection0.getSelection-d9O1mEE())) {
                        TransformedTextFieldState.replaceText-M8tDOmk$default(textFieldPreparedSelection0.a, "", TextRangeKt.TextRange(textFieldPreparedSelection0.getPreviousWordOffset(), TextRange.getEnd-impl(textFieldPreparedSelection0.getSelection-d9O1mEE())), null, !textFieldPreparedSelection0.c, 4, null);
                    }
                    else {
                        TransformedTextFieldState.replaceText-M8tDOmk$default(textFieldPreparedSelection0.a, "", textFieldPreparedSelection0.getSelection-d9O1mEE(), null, !textFieldPreparedSelection0.c, 4, null);
                    }
                    z2 = true;
                    break;
                }
                case 23: {
                    if(TextRange.getCollapsed-impl(textFieldPreparedSelection0.getSelection-d9O1mEE())) {
                        TransformedTextFieldState.replaceText-M8tDOmk$default(textFieldPreparedSelection0.a, "", TextRangeKt.TextRange(TextRange.getStart-impl(textFieldPreparedSelection0.getSelection-d9O1mEE()), textFieldPreparedSelection0.getNextWordOffset()), null, !textFieldPreparedSelection0.c, 4, null);
                    }
                    else {
                        TransformedTextFieldState.replaceText-M8tDOmk$default(textFieldPreparedSelection0.a, "", textFieldPreparedSelection0.getSelection-d9O1mEE(), null, !textFieldPreparedSelection0.c, 4, null);
                    }
                    z2 = true;
                    break;
                }
                case 24: {
                    if(TextRange.getCollapsed-impl(textFieldPreparedSelection0.getSelection-d9O1mEE())) {
                        TransformedTextFieldState.replaceText-M8tDOmk$default(textFieldPreparedSelection0.a, "", TextRangeKt.TextRange(textFieldPreparedSelection0.getLineStartByOffset(), TextRange.getEnd-impl(textFieldPreparedSelection0.getSelection-d9O1mEE())), null, !textFieldPreparedSelection0.c, 4, null);
                    }
                    else {
                        TransformedTextFieldState.replaceText-M8tDOmk$default(textFieldPreparedSelection0.a, "", textFieldPreparedSelection0.getSelection-d9O1mEE(), null, !textFieldPreparedSelection0.c, 4, null);
                    }
                    z2 = true;
                    break;
                }
                case 25: {
                    if(TextRange.getCollapsed-impl(textFieldPreparedSelection0.getSelection-d9O1mEE())) {
                        TransformedTextFieldState.replaceText-M8tDOmk$default(textFieldPreparedSelection0.a, "", TextRangeKt.TextRange(TextRange.getStart-impl(textFieldPreparedSelection0.getSelection-d9O1mEE()), textFieldPreparedSelection0.getLineEndByOffset()), null, !textFieldPreparedSelection0.c, 4, null);
                    }
                    else {
                        TransformedTextFieldState.replaceText-M8tDOmk$default(textFieldPreparedSelection0.a, "", textFieldPreparedSelection0.getSelection-d9O1mEE(), null, !textFieldPreparedSelection0.c, 4, null);
                    }
                    z2 = true;
                    break;
                }
                case 26: {
                    if(z1) {
                        function00.invoke();
                    }
                    else {
                        TextFieldState textFieldState1 = transformedTextFieldState0.a;
                        textFieldState1.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                        EditingBuffer editingBuffer1 = textFieldState1.getMainBuffer$foundation_release();
                        editingBuffer1.commitComposition();
                        EditCommandKt.commitText(editingBuffer1, "\n", 1);
                        TextFieldState.access$commitEditAsUser(textFieldState1, transformedTextFieldState0.b, true, TextFieldEditUndoBehavior.MergeIfPossible);
                    }
                    z2 = true;
                    break;
                }
                case 27: {
                    if(!z1) {
                        TextFieldState textFieldState2 = transformedTextFieldState0.a;
                        textFieldState2.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
                        EditingBuffer editingBuffer2 = textFieldState2.getMainBuffer$foundation_release();
                        editingBuffer2.commitComposition();
                        EditCommandKt.commitText(editingBuffer2, "\t", 1);
                        TextFieldState.access$commitEditAsUser(textFieldState2, transformedTextFieldState0.b, true, TextFieldEditUndoBehavior.MergeIfPossible);
                        z2 = true;
                        break;
                    }
                    break;
                }
                case 28: {
                    textFieldPreparedSelection0.selectAll();
                    z2 = true;
                    break;
                }
                case 29: {
                    textFieldPreparedSelection0.moveCursorLeft().selectMovement();
                    z2 = true;
                    break;
                }
                case 30: {
                    textFieldPreparedSelection0.moveCursorRight().selectMovement();
                    z2 = true;
                    break;
                }
                case 0x1F: {
                    textFieldPreparedSelection0.moveCursorLeftByWord().selectMovement();
                    z2 = true;
                    break;
                }
                case 0x20: {
                    textFieldPreparedSelection0.moveCursorRightByWord().selectMovement();
                    z2 = true;
                    break;
                }
                case 33: {
                    textFieldPreparedSelection0.moveCursorPrevByParagraph().selectMovement();
                    z2 = true;
                    break;
                }
                case 34: {
                    textFieldPreparedSelection0.moveCursorNextByParagraph().selectMovement();
                    z2 = true;
                    break;
                }
                case 35: {
                    textFieldPreparedSelection0.moveCursorToLineStart().selectMovement();
                    z2 = true;
                    break;
                }
                case 36: {
                    textFieldPreparedSelection0.moveCursorToLineEnd().selectMovement();
                    z2 = true;
                    break;
                }
                case 37: {
                    textFieldPreparedSelection0.moveCursorToLineLeftSide().selectMovement();
                    z2 = true;
                    break;
                }
                case 38: {
                    textFieldPreparedSelection0.moveCursorToLineRightSide().selectMovement();
                    z2 = true;
                    break;
                }
                case 39: {
                    textFieldPreparedSelection0.moveCursorUpByLine().selectMovement();
                    z2 = true;
                    break;
                }
                case 40: {
                    textFieldPreparedSelection0.moveCursorDownByLine().selectMovement();
                    z2 = true;
                    break;
                }
                case 41: {
                    textFieldPreparedSelection0.moveCursorUpByPage().selectMovement();
                    z2 = true;
                    break;
                }
                case 42: {
                    textFieldPreparedSelection0.moveCursorDownByPage().selectMovement();
                    z2 = true;
                    break;
                }
                case 43: {
                    textFieldPreparedSelection0.moveCursorToHome().selectMovement();
                    z2 = true;
                    break;
                }
                case 44: {
                    textFieldPreparedSelection0.moveCursorToEnd().selectMovement();
                    z2 = true;
                    break;
                }
                case 45: {
                    textFieldPreparedSelection0.deselect();
                    z2 = true;
                    break;
                }
                case 46: {
                    transformedTextFieldState0.undo();
                    z2 = true;
                    break;
                }
                case 0x2F: {
                    transformedTextFieldState0.redo();
                    z2 = true;
                    break;
                }
                default: {
                    z2 = true;
                    break;
                }
            }
            if(!TextRange.equals-impl0(textFieldPreparedSelection0.getSelection-d9O1mEE(), textFieldPreparedSelection0.getInitialValue().getSelection-d9O1mEE())) {
                transformedTextFieldState0.selectCharsIn-5zc-tL8(textFieldPreparedSelection0.getSelection-d9O1mEE());
            }
        }
        return z2;
    }

    public boolean onPreKeyEvent-MyFupTE(@NotNull KeyEvent keyEvent0, @NotNull TransformedTextFieldState transformedTextFieldState0, @NotNull TextFieldSelectionState textFieldSelectionState0, @NotNull FocusManager focusManager0, @NotNull SoftwareKeyboardController softwareKeyboardController0) {
        if(!TextRange.getCollapsed-impl(transformedTextFieldState0.getVisualText().getSelection-d9O1mEE()) && KeyEventHelpers_androidKt.cancelsTextSelection-ZmokQxo(keyEvent0)) {
            textFieldSelectionState0.deselect();
            return true;
        }
        return false;
    }
}

