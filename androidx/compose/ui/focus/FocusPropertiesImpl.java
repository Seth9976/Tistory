package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000B\u001A\u00020\u00048\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0013\u001A\u00020\f8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001A\u00020\f8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u0014\u0010\u000E\u001A\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001B\u001A\u00020\f8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u000E\u001A\u0004\b\u0019\u0010\u0010\"\u0004\b\u001A\u0010\u0012R\"\u0010\u001F\u001A\u00020\f8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\u000E\u001A\u0004\b\u001D\u0010\u0010\"\u0004\b\u001E\u0010\u0012R\"\u0010#\u001A\u00020\f8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b \u0010\u000E\u001A\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010\'\u001A\u00020\f8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b$\u0010\u000E\u001A\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012R\"\u0010+\u001A\u00020\f8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b(\u0010\u000E\u001A\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R\"\u0010/\u001A\u00020\f8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b,\u0010\u000E\u001A\u0004\b-\u0010\u0010\"\u0004\b.\u0010\u0012R4\u00109\u001A\u000E\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\f008\u0016@\u0016X\u0096\u000E¢\u0006\u0018\n\u0004\b2\u00103\u0012\u0004\b8\u0010\u0003\u001A\u0004\b4\u00105\"\u0004\b6\u00107R4\u0010>\u001A\u000E\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\f008\u0016@\u0016X\u0096\u000E¢\u0006\u0018\n\u0004\b:\u00103\u0012\u0004\b=\u0010\u0003\u001A\u0004\b;\u00105\"\u0004\b<\u00107¨\u0006?"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesImpl;", "Landroidx/compose/ui/focus/FocusProperties;", "<init>", "()V", "", "a", "Z", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "canFocus", "Landroidx/compose/ui/focus/FocusRequester;", "b", "Landroidx/compose/ui/focus/FocusRequester;", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "next", "c", "getPrevious", "setPrevious", "previous", "d", "getUp", "setUp", "up", "e", "getDown", "setDown", "down", "f", "getLeft", "setLeft", "left", "g", "getRight", "setRight", "right", "h", "getStart", "setStart", "start", "i", "getEnd", "setEnd", "end", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "j", "Lkotlin/jvm/functions/Function1;", "getEnter", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "getEnter$annotations", "enter", "k", "getExit", "setExit", "getExit$annotations", "exit", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FocusPropertiesImpl implements FocusProperties {
    public static final int $stable = 8;
    public boolean a;
    public FocusRequester b;
    public FocusRequester c;
    public FocusRequester d;
    public FocusRequester e;
    public FocusRequester f;
    public FocusRequester g;
    public FocusRequester h;
    public FocusRequester i;
    public Function1 j;
    public Function1 k;

    public FocusPropertiesImpl() {
        this.a = true;
        this.b = FocusRequester.Companion.getDefault();
        this.c = FocusRequester.Companion.getDefault();
        this.d = FocusRequester.Companion.getDefault();
        this.e = FocusRequester.Companion.getDefault();
        this.f = FocusRequester.Companion.getDefault();
        this.g = FocusRequester.Companion.getDefault();
        this.h = FocusRequester.Companion.getDefault();
        this.i = FocusRequester.Companion.getDefault();
        this.j = c.w;
        this.k = d.w;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        return this.a;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getDown() {
        return this.e;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getEnd() {
        return this.i;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public Function1 getEnter() {
        return this.j;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public static void getEnter$annotations() {
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public Function1 getExit() {
        return this.k;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public static void getExit$annotations() {
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getLeft() {
        return this.f;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getNext() {
        return this.b;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getPrevious() {
        return this.c;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getRight() {
        return this.g;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getStart() {
        return this.h;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    @NotNull
    public FocusRequester getUp() {
        return this.d;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z) {
        this.a = z;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void setDown(@NotNull FocusRequester focusRequester0) {
        this.e = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void setEnd(@NotNull FocusRequester focusRequester0) {
        this.i = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void setEnter(@NotNull Function1 function10) {
        this.j = function10;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void setExit(@NotNull Function1 function10) {
        this.k = function10;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void setLeft(@NotNull FocusRequester focusRequester0) {
        this.f = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void setNext(@NotNull FocusRequester focusRequester0) {
        this.b = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void setPrevious(@NotNull FocusRequester focusRequester0) {
        this.c = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void setRight(@NotNull FocusRequester focusRequester0) {
        this.g = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void setStart(@NotNull FocusRequester focusRequester0) {
        this.h = focusRequester0;
    }

    @Override  // androidx.compose.ui.focus.FocusProperties
    public void setUp(@NotNull FocusRequester focusRequester0) {
        this.d = focusRequester0;
    }
}

