package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001E\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\t8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER$\u0010\u000F\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\t8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000ERB\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128W@WX\u0097\u000E\u00A2\u0006\u0012\u0012\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001ARB\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00122\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\u00128W@WX\u0097\u000E\u00A2\u0006\u0012\u0012\u0004\b\u001C\u0010\u0016\u001A\u0004\b\u001D\u0010\u0018\"\u0004\b\u001E\u0010\u001AR$\u0010\u001F\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\t8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b \u0010\f\"\u0004\b!\u0010\u000ER$\u0010\"\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\t8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b#\u0010\f\"\u0004\b$\u0010\u000ER$\u0010%\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\t8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b&\u0010\f\"\u0004\b\'\u0010\u000ER$\u0010(\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\t8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b)\u0010\f\"\u0004\b*\u0010\u000ER$\u0010+\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\t8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b,\u0010\f\"\u0004\b-\u0010\u000ER$\u0010.\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\t8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b/\u0010\f\"\u0004\b0\u0010\u000E\u00F8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00A8\u00061\u00C0\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/FocusProperties;", "", "canFocus", "", "getCanFocus", "()Z", "setCanFocus", "(Z)V", "<anonymous parameter 0>", "Landroidx/compose/ui/focus/FocusRequester;", "down", "getDown", "()Landroidx/compose/ui/focus/FocusRequester;", "setDown", "(Landroidx/compose/ui/focus/FocusRequester;)V", "end", "getEnd", "setEnd", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusDirection;", "enter", "getEnter$annotations", "()V", "getEnter", "()Lkotlin/jvm/functions/Function1;", "setEnter", "(Lkotlin/jvm/functions/Function1;)V", "exit", "getExit$annotations", "getExit", "setExit", "left", "getLeft", "setLeft", "next", "getNext", "setNext", "previous", "getPrevious", "setPrevious", "right", "getRight", "setRight", "start", "getStart", "setStart", "up", "getUp", "setUp", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface FocusProperties {
    boolean getCanFocus();

    @NotNull
    default FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    @ExperimentalComposeUiApi
    @NotNull
    default Function1 getEnter() {
        return a.w;
    }

    @ExperimentalComposeUiApi
    static void getEnter$annotations() {
    }

    @ExperimentalComposeUiApi
    @NotNull
    default Function1 getExit() {
        return b.w;
    }

    @ExperimentalComposeUiApi
    static void getExit$annotations() {
    }

    @NotNull
    default FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    @NotNull
    default FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    void setCanFocus(boolean arg1);

    default void setDown(@NotNull FocusRequester focusRequester0) {
    }

    default void setEnd(@NotNull FocusRequester focusRequester0) {
    }

    @ExperimentalComposeUiApi
    default void setEnter(@NotNull Function1 function10) {
    }

    @ExperimentalComposeUiApi
    default void setExit(@NotNull Function1 function10) {
    }

    default void setLeft(@NotNull FocusRequester focusRequester0) {
    }

    default void setNext(@NotNull FocusRequester focusRequester0) {
    }

    default void setPrevious(@NotNull FocusRequester focusRequester0) {
    }

    default void setRight(@NotNull FocusRequester focusRequester0) {
    }

    default void setStart(@NotNull FocusRequester focusRequester0) {
    }

    default void setUp(@NotNull FocusRequester focusRequester0) {
    }
}

