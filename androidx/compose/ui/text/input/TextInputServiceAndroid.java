package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.activity.h;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import j2.c;
import j2.i;
import j2.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001:\u0001DB)\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\n\u0010\u000BB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0004\u00A2\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u000F\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001A\u00020\u0013\u00A2\u0006\u0004\b\u0014\u0010\u0015JM\u0010!\u001A\u00020\u001D2\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0019\u001A\u00020\u00182\u0018\u0010\u001E\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001C0\u001B\u0012\u0004\u0012\u00020\u001D0\u001A2\u0012\u0010 \u001A\u000E\u0012\u0004\u0012\u00020\u001F\u0012\u0004\u0012\u00020\u001D0\u001AH\u0016\u00A2\u0006\u0004\b!\u0010\"J\u000F\u0010!\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b!\u0010#J\u000F\u0010$\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b$\u0010#J\u000F\u0010%\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b%\u0010#J\u000F\u0010&\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b&\u0010#J!\u0010)\u001A\u00020\u001D2\b\u0010\'\u001A\u0004\u0018\u00010\u00162\u0006\u0010(\u001A\u00020\u0016H\u0016\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010-\u001A\u00020\u001D2\u0006\u0010,\u001A\u00020+H\u0017\u00A2\u0006\u0004\b-\u0010.JK\u00108\u001A\u00020\u001D2\u0006\u0010/\u001A\u00020\u00162\u0006\u00101\u001A\u0002002\u0006\u00103\u001A\u0002022\u0012\u00105\u001A\u000E\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u001D0\u001A2\u0006\u00106\u001A\u00020+2\u0006\u00107\u001A\u00020+H\u0016\u00A2\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R$\u0010C\u001A\u00020\u00162\u0006\u0010>\u001A\u00020\u00168\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010B\u00A8\u0006E"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Landroid/view/View;", "view", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "rootPositionCalculator", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/PositionCalculator;Landroidx/compose/ui/text/input/InputMethodManager;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/PositionCalculator;)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "", "isEditorFocused", "()Z", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "startInput", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "()V", "stopInput", "showSoftwareKeyboard", "hideSoftwareKeyboard", "oldValue", "newValue", "updateState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "notifyFocusedRect", "(Landroidx/compose/ui/geometry/Rect;)V", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/graphics/Matrix;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "<set-?>", "g", "Landroidx/compose/ui/text/input/TextFieldValue;", "getState$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "state", "j2/i", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,573:1\n1208#2:574\n1187#2,2:575\n728#3,2:577\n460#3,11:580\n1#4:579\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n116#1:574\n116#1:575,2\n260#1:577,2\n324#1:580,11\n*E\n"})
public final class TextInputServiceAndroid implements PlatformTextInputService {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[i.values().length];
            try {
                arr_v[0] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[1] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[2] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[3] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final View a;
    public final InputMethodManager b;
    public final Executor c;
    public boolean d;
    public Function1 e;
    public Function1 f;
    public TextFieldValue g;
    public ImeOptions h;
    public final ArrayList i;
    public final Lazy j;
    public Rect k;
    public final CursorAnchorInfoController l;
    public final MutableVector m;
    public h n;

    public TextInputServiceAndroid(@NotNull View view0, @NotNull PositionCalculator positionCalculator0) {
        this(view0, positionCalculator0, new InputMethodManagerImpl(view0), null, 8, null);
    }

    public TextInputServiceAndroid(@NotNull View view0, @NotNull PositionCalculator positionCalculator0, @NotNull InputMethodManager inputMethodManager0, @NotNull Executor executor0) {
        this.a = view0;
        this.b = inputMethodManager0;
        this.c = executor0;
        this.e = c.z;
        this.f = c.A;
        this.g = new TextFieldValue("", 0L, null, 4, null);
        this.h = ImeOptions.Companion.getDefault();
        this.i = new ArrayList();
        j j0 = new j(this, 0);
        this.j = md.c.lazy(LazyThreadSafetyMode.NONE, j0);
        this.l = new CursorAnchorInfoController(positionCalculator0, inputMethodManager0);
        this.m = new MutableVector(new i[16], 0);
    }

    public TextInputServiceAndroid(View view0, PositionCalculator positionCalculator0, InputMethodManager inputMethodManager0, Executor executor0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            executor0 = TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance());
        }
        this(view0, positionCalculator0, inputMethodManager0, executor0);
    }

    public final void a(i i0) {
        this.m.add(i0);
        if(this.n == null) {
            h h0 = new h(this, 22);
            this.c.execute(h0);
            this.n = h0;
        }
    }

    public static final BaseInputConnection access$getBaseInputConnection(TextInputServiceAndroid textInputServiceAndroid0) {
        return (BaseInputConnection)textInputServiceAndroid0.j.getValue();
    }

    @Nullable
    public final InputConnection createInputConnection(@NotNull EditorInfo editorInfo0) {
        if(!this.d) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(editorInfo0, this.h, this.g);
        TextInputServiceAndroid_androidKt.access$updateWithEmojiCompat(editorInfo0);
        TextFieldValue textFieldValue0 = this.g;
        boolean z = this.h.getAutoCorrect();
        InputConnection inputConnection0 = new RecordingInputConnection(textFieldValue0, new InputEventCallback2() {
            public final TextInputServiceAndroid a;

            {
                this.a = textInputServiceAndroid0;
            }

            @Override  // androidx.compose.ui.text.input.InputEventCallback2
            public void onConnectionClosed(@NotNull RecordingInputConnection recordingInputConnection0) {
                TextInputServiceAndroid textInputServiceAndroid0 = this.a;
                int v = textInputServiceAndroid0.i.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(Intrinsics.areEqual(((WeakReference)textInputServiceAndroid0.i.get(v1)).get(), recordingInputConnection0)) {
                        textInputServiceAndroid0.i.remove(v1);
                        return;
                    }
                }
            }

            @Override  // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(@NotNull List list0) {
                this.a.e.invoke(list0);
            }

            @Override  // androidx.compose.ui.text.input.InputEventCallback2
            public void onImeAction-KlQnJC8(int v) {
                this.a.f.invoke(ImeAction.box-impl(v));
            }

            @Override  // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(@NotNull KeyEvent keyEvent0) {
                TextInputServiceAndroid.access$getBaseInputConnection(this.a).sendKeyEvent(keyEvent0);
            }

            @Override  // androidx.compose.ui.text.input.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
                this.a.l.requestUpdate(z, z1, z2, z3, z4, z5);
            }
        }, z);
        WeakReference weakReference0 = new WeakReference(inputConnection0);
        this.i.add(weakReference0);
        return inputConnection0;
    }

    @NotNull
    public final TextFieldValue getState$ui_release() {
        return this.g;
    }

    @NotNull
    public final View getView() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        this.a(i.d);
    }

    public final boolean isEditorFocused() {
        return this.d;
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    @Deprecated(message = "This method should not be called, used BringIntoViewRequester instead.")
    public void notifyFocusedRect(@NotNull androidx.compose.ui.geometry.Rect rect0) {
        this.k = new Rect(zd.c.roundToInt(rect0.getLeft()), zd.c.roundToInt(rect0.getTop()), zd.c.roundToInt(rect0.getRight()), zd.c.roundToInt(rect0.getBottom()));
        if(this.i.isEmpty()) {
            Rect rect1 = this.k;
            if(rect1 != null) {
                Rect rect2 = new Rect(rect1);
                this.a.requestRectangleOnScreen(rect2);
            }
        }
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        this.a(i.c);
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        this.a(i.a);
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(@NotNull TextFieldValue textFieldValue0, @NotNull ImeOptions imeOptions0, @NotNull Function1 function10, @NotNull Function1 function11) {
        this.d = true;
        this.g = textFieldValue0;
        this.h = imeOptions0;
        this.e = function10;
        this.f = function11;
        this.a(i.a);
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.d = false;
        this.e = c.B;
        this.f = c.C;
        this.k = null;
        this.a(i.b);
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(@Nullable TextFieldValue textFieldValue0, @NotNull TextFieldValue textFieldValue1) {
        boolean z = !TextRange.equals-impl0(this.g.getSelection-d9O1mEE(), textFieldValue1.getSelection-d9O1mEE()) || !Intrinsics.areEqual(this.g.getComposition-MzsxiRA(), textFieldValue1.getComposition-MzsxiRA());
        this.g = textFieldValue1;
        ArrayList arrayList0 = this.i;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            RecordingInputConnection recordingInputConnection0 = (RecordingInputConnection)((WeakReference)arrayList0.get(v2)).get();
            if(recordingInputConnection0 != null) {
                recordingInputConnection0.setMTextFieldValue$ui_release(textFieldValue1);
            }
        }
        this.l.invalidate();
        boolean z1 = Intrinsics.areEqual(textFieldValue0, textFieldValue1);
        InputMethodManager inputMethodManager0 = this.b;
        if(z1) {
            if(z) {
                int v3 = TextRange.getMin-impl(textFieldValue1.getSelection-d9O1mEE());
                int v4 = TextRange.getMax-impl(textFieldValue1.getSelection-d9O1mEE());
                TextRange textRange0 = this.g.getComposition-MzsxiRA();
                int v5 = -1;
                int v6 = textRange0 == null ? -1 : TextRange.getMin-impl(textRange0.unbox-impl());
                TextRange textRange1 = this.g.getComposition-MzsxiRA();
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
                recordingInputConnection1.updateInputState(this.g, inputMethodManager0);
            }
        }
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(@NotNull TextFieldValue textFieldValue0, @NotNull OffsetMapping offsetMapping0, @NotNull TextLayoutResult textLayoutResult0, @NotNull Function1 function10, @NotNull androidx.compose.ui.geometry.Rect rect0, @NotNull androidx.compose.ui.geometry.Rect rect1) {
        this.l.updateTextLayoutResult(textFieldValue0, offsetMapping0, textLayoutResult0, function10, rect0, rect1);
    }
}

