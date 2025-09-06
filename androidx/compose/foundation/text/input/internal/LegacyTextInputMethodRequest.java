package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import j2.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.a;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJU\u0010\u0017\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\u0018\u0010\u0014\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001A\u001A\u00020\u0019H\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u001F\u0010 \u001A\u00020\u00062\b\u0010\u001E\u001A\u0004\u0018\u00010\f2\u0006\u0010\u001F\u001A\u00020\f¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\"¢\u0006\u0004\b$\u0010%J5\u0010-\u001A\u00020\u00062\u0006\u0010&\u001A\u00020\f2\u0006\u0010(\u001A\u00020\'2\u0006\u0010*\u001A\u00020)2\u0006\u0010+\u001A\u00020\"2\u0006\u0010,\u001A\u00020\"¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u00102R$\u00108\u001A\u00020\f2\u0006\u00103\u001A\u00020\f8\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107R$\u0010@\u001A\u0004\u0018\u0001098\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyTextInputMethodRequest;", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "", "localToScreen", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "inputMethodManager", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/input/internal/InputMethodManager;)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "textInputNode", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "", "Landroidx/compose/ui/text/input/EditCommand;", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttributes", "Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "createInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "oldValue", "newValue", "updateState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "(Landroidx/compose/ui/geometry/Rect;)V", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "<set-?>", "h", "Landroidx/compose/ui/text/input/TextFieldValue;", "getState", "()Landroidx/compose/ui/text/input/TextFieldValue;", "state", "Landroid/graphics/Rect;", "l", "Landroid/graphics/Rect;", "getFocusedRect$foundation_release", "()Landroid/graphics/Rect;", "setFocusedRect$foundation_release", "(Landroid/graphics/Rect;)V", "focusedRect", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {
    public static final int $stable = 8;
    public final View a;
    public final InputMethodManager b;
    public Function1 c;
    public Function1 d;
    public LegacyTextFieldState e;
    public TextFieldSelectionManager f;
    public ViewConfiguration g;
    public TextFieldValue h;
    public ImeOptions i;
    public final ArrayList j;
    public final Lazy k;
    public Rect l;
    public final LegacyCursorAnchorInfoController m;

    public LegacyTextInputMethodRequest(@NotNull View view0, @NotNull Function1 function10, @NotNull InputMethodManager inputMethodManager0) {
        this.a = view0;
        this.b = inputMethodManager0;
        this.c = a.A;
        this.d = a.B;
        this.h = new TextFieldValue("", 0L, null, 4, null);
        this.i = ImeOptions.Companion.getDefault();
        this.j = new ArrayList();
        j j0 = new j(this, 23);
        this.k = c.lazy(LazyThreadSafetyMode.NONE, j0);
        this.m = new LegacyCursorAnchorInfoController(function10, inputMethodManager0);
    }

    public static final BaseInputConnection access$getBaseInputConnection(LegacyTextInputMethodRequest legacyTextInputMethodRequest0) {
        return (BaseInputConnection)legacyTextInputMethodRequest0.k.getValue();
    }

    @Override  // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public InputConnection createInputConnection(EditorInfo editorInfo0) {
        return this.createInputConnection(editorInfo0);
    }

    @NotNull
    public RecordingInputConnection createInputConnection(@NotNull EditorInfo editorInfo0) {
        EditorInfo_androidKt.update-pLxbY9I$default(editorInfo0, this.h.getText(), this.h.getSelection-d9O1mEE(), this.i, null, 8, null);
        LegacyPlatformTextInputServiceAdapter_androidKt.access$updateWithEmojiCompat(editorInfo0);
        TextFieldValue textFieldValue0 = this.h;
        boolean z = this.i.getAutoCorrect();
        RecordingInputConnection recordingInputConnection0 = new RecordingInputConnection(textFieldValue0, new InputEventCallback2() {
            public final LegacyTextInputMethodRequest a;

            {
                this.a = legacyTextInputMethodRequest0;
            }

            @Override  // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onConnectionClosed(@NotNull RecordingInputConnection recordingInputConnection0) {
                LegacyTextInputMethodRequest legacyTextInputMethodRequest0 = this.a;
                int v = legacyTextInputMethodRequest0.j.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(Intrinsics.areEqual(((WeakReference)legacyTextInputMethodRequest0.j.get(v1)).get(), recordingInputConnection0)) {
                        legacyTextInputMethodRequest0.j.remove(v1);
                        return;
                    }
                }
            }

            @Override  // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onEditCommands(@NotNull List list0) {
                this.a.c.invoke(list0);
            }

            @Override  // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onImeAction-KlQnJC8(int v) {
                this.a.d.invoke(ImeAction.box-impl(v));
            }

            @Override  // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onKeyEvent(@NotNull KeyEvent keyEvent0) {
                LegacyTextInputMethodRequest.access$getBaseInputConnection(this.a).sendKeyEvent(keyEvent0);
            }

            @Override  // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
                this.a.m.requestUpdate(z, z1, z2, z3, z4, z5);
            }
        }, z, this.e, this.f, this.g);
        WeakReference weakReference0 = new WeakReference(recordingInputConnection0);
        this.j.add(weakReference0);
        return recordingInputConnection0;
    }

    @Nullable
    public final Rect getFocusedRect$foundation_release() {
        return this.l;
    }

    @NotNull
    public final TextFieldValue getState() {
        return this.h;
    }

    @NotNull
    public final View getView() {
        return this.a;
    }

    public final void notifyFocusedRect(@NotNull androidx.compose.ui.geometry.Rect rect0) {
        this.l = new Rect(zd.c.roundToInt(rect0.getLeft()), zd.c.roundToInt(rect0.getTop()), zd.c.roundToInt(rect0.getRight()), zd.c.roundToInt(rect0.getBottom()));
        if(this.j.isEmpty()) {
            Rect rect1 = this.l;
            if(rect1 != null) {
                Rect rect2 = new Rect(rect1);
                this.a.requestRectangleOnScreen(rect2);
            }
        }
    }

    public final void setFocusedRect$foundation_release(@Nullable Rect rect0) {
        this.l = rect0;
    }

    public final void startInput(@NotNull TextFieldValue textFieldValue0, @Nullable LegacyPlatformTextInputNode legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0, @NotNull ImeOptions imeOptions0, @NotNull Function1 function10, @NotNull Function1 function11) {
        this.h = textFieldValue0;
        this.i = imeOptions0;
        this.c = function10;
        this.d = function11;
        ViewConfiguration viewConfiguration0 = null;
        this.e = legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0 == null ? null : legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0.getLegacyTextFieldState();
        this.f = legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0 == null ? null : legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0.getTextFieldSelectionManager();
        if(legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0 != null) {
            viewConfiguration0 = legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0.getViewConfiguration();
        }
        this.g = viewConfiguration0;
    }

    public final void updateState(@Nullable TextFieldValue textFieldValue0, @NotNull TextFieldValue textFieldValue1) {
        boolean z = !TextRange.equals-impl0(this.h.getSelection-d9O1mEE(), textFieldValue1.getSelection-d9O1mEE()) || !Intrinsics.areEqual(this.h.getComposition-MzsxiRA(), textFieldValue1.getComposition-MzsxiRA());
        this.h = textFieldValue1;
        ArrayList arrayList0 = this.j;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            RecordingInputConnection recordingInputConnection0 = (RecordingInputConnection)((WeakReference)arrayList0.get(v2)).get();
            if(recordingInputConnection0 != null) {
                recordingInputConnection0.setTextFieldValue$foundation_release(textFieldValue1);
            }
        }
        this.m.invalidate();
        boolean z1 = Intrinsics.areEqual(textFieldValue0, textFieldValue1);
        InputMethodManager inputMethodManager0 = this.b;
        if(z1) {
            if(z) {
                int v3 = TextRange.getMin-impl(textFieldValue1.getSelection-d9O1mEE());
                int v4 = TextRange.getMax-impl(textFieldValue1.getSelection-d9O1mEE());
                TextRange textRange0 = this.h.getComposition-MzsxiRA();
                int v5 = -1;
                int v6 = textRange0 == null ? -1 : TextRange.getMin-impl(textRange0.unbox-impl());
                TextRange textRange1 = this.h.getComposition-MzsxiRA();
                if(textRange1 != null) {
                    v5 = TextRange.getMax-impl(textRange1.unbox-impl());
                }
                inputMethodManager0.updateSelection(v3, v4, v6, v5);
            }
            return;
        }
        if(textFieldValue0 != null && (!Intrinsics.areEqual(textFieldValue0.getText(), textFieldValue1.getText()) || TextRange.equals-impl0(textFieldValue0.getSelection-d9O1mEE(), textFieldValue1.getSelection-d9O1mEE()) && !Intrinsics.areEqual(textFieldValue0.getComposition-MzsxiRA(), textFieldValue1.getComposition-MzsxiRA()))) {
            inputMethodManager0.restartInput();
            return;
        }
        int v7 = arrayList0.size();
        for(int v = 0; v < v7; ++v) {
            RecordingInputConnection recordingInputConnection1 = (RecordingInputConnection)((WeakReference)arrayList0.get(v)).get();
            if(recordingInputConnection1 != null) {
                recordingInputConnection1.updateInputState(this.h, inputMethodManager0);
            }
        }
    }

    public final void updateTextLayoutResult(@NotNull TextFieldValue textFieldValue0, @NotNull OffsetMapping offsetMapping0, @NotNull TextLayoutResult textLayoutResult0, @NotNull androidx.compose.ui.geometry.Rect rect0, @NotNull androidx.compose.ui.geometry.Rect rect1) {
        this.m.updateTextLayoutResult(textFieldValue0, offsetMapping0, textLayoutResult0, rect0, rect1);
    }
}

