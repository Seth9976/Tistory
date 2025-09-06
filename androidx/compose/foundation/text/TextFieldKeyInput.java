package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import j0.o;
import j0.y2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.BooleanRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\b\u0000\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\b\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001A\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001A\u00020\u0018¢\u0006\u0004\b\u001A\u0010\u001BJ\u0018\u0010 \u001A\u00020\b2\u0006\u0010\u001D\u001A\u00020\u001Cø\u0001\u0000¢\u0006\u0004\b\u001E\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$R\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u0017\u0010\t\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u00100R\u0017\u0010\n\u001A\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001A\u0004\b2\u00100R\u0017\u0010\f\u001A\u00020\u000B8\u0006¢\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u00106R\u0017\u0010\u000E\u001A\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u000F8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006?"}, d2 = {"Landroidx/compose/foundation/text/TextFieldKeyInput;", "", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "state", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "selectionManager", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "", "editable", "singleLine", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "preparedSelectionState", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/UndoManager;", "undoManager", "Landroidx/compose/foundation/text/DeadKeyCombiner;", "keyCombiner", "Landroidx/compose/foundation/text/KeyMapping;", "keyMapping", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "<init>", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/text/input/TextFieldValue;ZZLandroidx/compose/foundation/text/selection/TextPreparedSelectionState;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/UndoManager;Landroidx/compose/foundation/text/DeadKeyCombiner;Landroidx/compose/foundation/text/KeyMapping;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/input/key/KeyEvent;", "event", "process-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "process", "a", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "b", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "c", "Landroidx/compose/ui/text/input/TextFieldValue;", "getValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "d", "Z", "getEditable", "()Z", "e", "getSingleLine", "f", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "getPreparedSelectionState", "()Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "g", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "h", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TextFieldKeyInput {
    public static final int $stable = 8;
    public final LegacyTextFieldState a;
    public final TextFieldSelectionManager b;
    public final TextFieldValue c;
    public final boolean d;
    public final boolean e;
    public final TextPreparedSelectionState f;
    public final OffsetMapping g;
    public final UndoManager h;
    public final DeadKeyCombiner i;
    public final KeyMapping j;
    public final Function1 k;
    public final int l;

    public TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState0, TextFieldSelectionManager textFieldSelectionManager0, TextFieldValue textFieldValue0, boolean z, boolean z1, TextPreparedSelectionState textPreparedSelectionState0, OffsetMapping offsetMapping0, UndoManager undoManager0, DeadKeyCombiner deadKeyCombiner0, KeyMapping keyMapping0, Function1 function10, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        TextFieldValue textFieldValue1 = (v1 & 4) == 0 ? textFieldValue0 : new TextFieldValue(null, 0L, null, 7, null);
        OffsetMapping offsetMapping1 = (v1 & 0x40) == 0 ? offsetMapping0 : OffsetMapping.Companion.getIdentity();
        KeyMapping keyMapping1 = (v1 & 0x200) == 0 ? keyMapping0 : KeyMapping_androidKt.getPlatformDefaultKeyMapping();
        Function1 function11 = (v1 & 0x400) == 0 ? function10 : o.B;
        this(legacyTextFieldState0, textFieldSelectionManager0, textFieldValue1, ((v1 & 8) == 0 ? z : true), ((v1 & 16) == 0 ? z1 : false), textPreparedSelectionState0, offsetMapping1, ((v1 & 0x80) == 0 ? undoManager0 : null), deadKeyCombiner0, keyMapping1, function11, v, null);
    }

    public TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState0, TextFieldSelectionManager textFieldSelectionManager0, TextFieldValue textFieldValue0, boolean z, boolean z1, TextPreparedSelectionState textPreparedSelectionState0, OffsetMapping offsetMapping0, UndoManager undoManager0, DeadKeyCombiner deadKeyCombiner0, KeyMapping keyMapping0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = legacyTextFieldState0;
        this.b = textFieldSelectionManager0;
        this.c = textFieldValue0;
        this.d = z;
        this.e = z1;
        this.f = textPreparedSelectionState0;
        this.g = offsetMapping0;
        this.h = undoManager0;
        this.i = deadKeyCombiner0;
        this.j = keyMapping0;
        this.k = function10;
        this.l = v;
    }

    public static final void access$apply(TextFieldKeyInput textFieldKeyInput0, EditCommand editCommand0) {
        textFieldKeyInput0.getClass();
        List list0 = CollectionsKt___CollectionsKt.toMutableList(k.listOf(editCommand0));
        list0.add(0, new FinishComposingTextCommand());
        TextFieldValue textFieldValue0 = textFieldKeyInput0.a.getProcessor().apply(list0);
        textFieldKeyInput0.k.invoke(textFieldValue0);
    }

    public static final void access$apply(TextFieldKeyInput textFieldKeyInput0, List list0) {
        List list1 = CollectionsKt___CollectionsKt.toMutableList(list0);
        list1.add(0, new FinishComposingTextCommand());
        TextFieldValue textFieldValue0 = textFieldKeyInput0.a.getProcessor().apply(list1);
        textFieldKeyInput0.k.invoke(textFieldValue0);
    }

    public final boolean getEditable() {
        return this.d;
    }

    @NotNull
    public final OffsetMapping getOffsetMapping() {
        return this.g;
    }

    @NotNull
    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.f;
    }

    @NotNull
    public final TextFieldSelectionManager getSelectionManager() {
        return this.b;
    }

    public final boolean getSingleLine() {
        return this.e;
    }

    @NotNull
    public final LegacyTextFieldState getState() {
        return this.a;
    }

    @Nullable
    public final UndoManager getUndoManager() {
        return this.h;
    }

    @NotNull
    public final TextFieldValue getValue() {
        return this.c;
    }

    public final boolean process-ZmokQxo(@NotNull KeyEvent keyEvent0) {
        CommitTextCommand commitTextCommand0 = null;
        if(TextFieldKeyInput_androidKt.isTypedEvent-ZmokQxo(keyEvent0)) {
            Integer integer0 = this.i.consume-ZmokQxo(keyEvent0);
            if(integer0 != null) {
                commitTextCommand0 = new CommitTextCommand(StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), ((int)integer0)).toString(), 1);
            }
        }
        Function1 function10 = this.k;
        LegacyTextFieldState legacyTextFieldState0 = this.a;
        TextPreparedSelectionState textPreparedSelectionState0 = this.f;
        boolean z = this.d;
        if(commitTextCommand0 != null) {
            if(z) {
                List list0 = CollectionsKt___CollectionsKt.toMutableList(k.listOf(commitTextCommand0));
                list0.add(0, new FinishComposingTextCommand());
                function10.invoke(legacyTextFieldState0.getProcessor().apply(list0));
                textPreparedSelectionState0.resetCachedX();
                return true;
            }
            return false;
        }
        if(!KeyEventType.equals-impl0(KeyEvent_androidKt.getType-ZmokQxo(keyEvent0), 2)) {
            return false;
        }
        KeyCommand keyCommand0 = this.j.map-ZmokQxo(keyEvent0);
        if(keyCommand0 != null && (!keyCommand0.getEditsText() || z)) {
            BooleanRef ref$BooleanRef0 = new BooleanRef();
            ref$BooleanRef0.element = true;
            y2 y20 = new y2(keyCommand0, this, ref$BooleanRef0);
            TextLayoutResultProxy textLayoutResultProxy0 = legacyTextFieldState0.getLayoutResult();
            TextFieldPreparedSelection textFieldPreparedSelection0 = new TextFieldPreparedSelection(this.c, this.g, textLayoutResultProxy0, textPreparedSelectionState0);
            y20.invoke(textFieldPreparedSelection0);
            if(!TextRange.equals-impl0(textFieldPreparedSelection0.getSelection-d9O1mEE(), this.c.getSelection-d9O1mEE()) || !Intrinsics.areEqual(textFieldPreparedSelection0.getAnnotatedString(), this.c.getAnnotatedString())) {
                function10.invoke(textFieldPreparedSelection0.getValue());
            }
            UndoManager undoManager0 = this.h;
            if(undoManager0 != null) {
                undoManager0.forceNextSnapshot();
            }
            return ref$BooleanRef0.element;
        }
        return false;
    }
}

