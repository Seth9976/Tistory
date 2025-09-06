package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o1.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J2\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u0014H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u0018\u001A\u00020\u0019H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001A\u0010\u001BJ*\u0010\u001C\u001A\u00020\u000F2\u0006\u0010\u0018\u001A\u00020\u00192\u000E\b\u0002\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u000F0\u001EH&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010!\u001A\u00020\u000F2\u0006\u0010\"\u001A\u00020#H&J:\u0010$\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\u0013\u001A\u00020\u00142\b\u0010%\u001A\u0004\u0018\u00010&2\u0012\u0010\'\u001A\u000E\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000F0(H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+J\n\u0010,\u001A\u0004\u0018\u00010&H&J\b\u0010-\u001A\u00020.H&J$\u0010/\u001A\u00020\u000F2\b\u0010\u0013\u001A\u0004\u0018\u00010\u00142\b\u00100\u001A\u0004\u0018\u00010&H&\u00F8\u0001\u0000\u00A2\u0006\u0002\b1J\u0010\u00102\u001A\u00020.2\u0006\u00103\u001A\u000204H&J\u0010\u00102\u001A\u00020.2\u0006\u00103\u001A\u000205H&J\u0010\u00102\u001A\u00020.2\u0006\u00103\u001A\u00020)H&J$\u00106\u001A\u00020\u000F2\u0006\u0010\u0013\u001A\u00020\u00142\b\u00100\u001A\u0004\u0018\u00010&H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b7\u00108R\u0012\u0010\u0002\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u000BX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\f\u0010\r\u00F8\u0001\u0001\u0082\u0002\r\n\u0005\b\u00A1\u001E0\u0001\n\u0004\b!0\u0001\u00A8\u00069\u00C0\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/FocusManager;", "focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootState", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "clearFocus", "", "force", "refreshFocusEvents", "clearOwnerFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "clearFocus-I7lrPNg", "(ZZZI)Z", "dispatchInterceptedSoftKeyboardEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "onFocusedItem", "Lkotlin/Function0;", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "dispatchRotaryEvent", "event", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "focusSearch", "focusedRect", "Landroidx/compose/ui/geometry/Rect;", "onFound", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "getFocusRect", "releaseFocus", "", "requestFocusForOwner", "previouslyFocusedRect", "requestFocusForOwner-7o62pno", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "takeFocus", "takeFocus-aToIllA", "(ILandroidx/compose/ui/geometry/Rect;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface FocusOwner extends FocusManager {
    boolean clearFocus-I7lrPNg(boolean arg1, boolean arg2, boolean arg3, int arg4);

    boolean dispatchInterceptedSoftKeyboardEvent-ZmokQxo(@NotNull KeyEvent arg1);

    boolean dispatchKeyEvent-YhN2O0w(@NotNull KeyEvent arg1, @NotNull Function0 arg2);

    static boolean dispatchKeyEvent-YhN2O0w$default(FocusOwner focusOwner0, KeyEvent keyEvent0, Function0 function00, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if((v & 2) != 0) {
            function00 = e.x;
        }
        return focusOwner0.dispatchKeyEvent-YhN2O0w(keyEvent0, function00);
    }

    boolean dispatchRotaryEvent(@NotNull RotaryScrollEvent arg1);

    @Nullable
    Boolean focusSearch-ULY8qGw(int arg1, @Nullable Rect arg2, @NotNull Function1 arg3);

    @Nullable
    Rect getFocusRect();

    @NotNull
    FocusTransactionManager getFocusTransactionManager();

    @NotNull
    Modifier getModifier();

    @NotNull
    FocusState getRootState();

    void releaseFocus();

    boolean requestFocusForOwner-7o62pno(@Nullable FocusDirection arg1, @Nullable Rect arg2);

    void scheduleInvalidation(@NotNull FocusEventModifierNode arg1);

    void scheduleInvalidation(@NotNull FocusPropertiesModifierNode arg1);

    void scheduleInvalidation(@NotNull FocusTargetNode arg1);

    boolean takeFocus-aToIllA(int arg1, @Nullable Rect arg2);
}

