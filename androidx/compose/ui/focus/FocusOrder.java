package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Use FocusProperties instead")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001B\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006R$\u0010\b\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00078F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR$\u0010\r\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u00078F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u000E\u0010\n\"\u0004\b\u000F\u0010\fR$\u0010\u0010\u001A\u00020\u00072\u0006\u0010\u0010\u001A\u00020\u00078F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR$\u0010\u0013\u001A\u00020\u00072\u0006\u0010\u0013\u001A\u00020\u00078F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR$\u0010\u0016\u001A\u00020\u00072\u0006\u0010\u0016\u001A\u00020\u00078F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR$\u0010\u0019\u001A\u00020\u00072\u0006\u0010\u0019\u001A\u00020\u00078F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u001A\u0010\n\"\u0004\b\u001B\u0010\fR$\u0010\u001C\u001A\u00020\u00072\u0006\u0010\u001C\u001A\u00020\u00078F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b\u001D\u0010\n\"\u0004\b\u001E\u0010\fR$\u0010\u001F\u001A\u00020\u00072\u0006\u0010\u001F\u001A\u00020\u00078F@FX\u0086\u000E¢\u0006\f\u001A\u0004\b \u0010\n\"\u0004\b!\u0010\f¨\u0006\""}, d2 = {"Landroidx/compose/ui/focus/FocusOrder;", "", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "<init>", "(Landroidx/compose/ui/focus/FocusProperties;)V", "()V", "Landroidx/compose/ui/focus/FocusRequester;", "next", "getNext", "()Landroidx/compose/ui/focus/FocusRequester;", "setNext", "(Landroidx/compose/ui/focus/FocusRequester;)V", "previous", "getPrevious", "setPrevious", "up", "getUp", "setUp", "down", "getDown", "setDown", "left", "getLeft", "setLeft", "right", "getRight", "setRight", "start", "getStart", "setStart", "end", "getEnd", "setEnd", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FocusOrder {
    public static final int $stable = 8;
    public final FocusProperties a;

    public FocusOrder() {
        this(new FocusPropertiesImpl());
    }

    public FocusOrder(@NotNull FocusProperties focusProperties0) {
        this.a = focusProperties0;
    }

    @NotNull
    public final FocusRequester getDown() {
        return this.a.getDown();
    }

    @NotNull
    public final FocusRequester getEnd() {
        return this.a.getEnd();
    }

    @NotNull
    public final FocusRequester getLeft() {
        return this.a.getLeft();
    }

    @NotNull
    public final FocusRequester getNext() {
        return this.a.getNext();
    }

    @NotNull
    public final FocusRequester getPrevious() {
        return this.a.getPrevious();
    }

    @NotNull
    public final FocusRequester getRight() {
        return this.a.getRight();
    }

    @NotNull
    public final FocusRequester getStart() {
        return this.a.getStart();
    }

    @NotNull
    public final FocusRequester getUp() {
        return this.a.getUp();
    }

    public final void setDown(@NotNull FocusRequester focusRequester0) {
        this.a.setDown(focusRequester0);
    }

    public final void setEnd(@NotNull FocusRequester focusRequester0) {
        this.a.setEnd(focusRequester0);
    }

    public final void setLeft(@NotNull FocusRequester focusRequester0) {
        this.a.setLeft(focusRequester0);
    }

    public final void setNext(@NotNull FocusRequester focusRequester0) {
        this.a.setNext(focusRequester0);
    }

    public final void setPrevious(@NotNull FocusRequester focusRequester0) {
        this.a.setPrevious(focusRequester0);
    }

    public final void setRight(@NotNull FocusRequester focusRequester0) {
        this.a.setRight(focusRequester0);
    }

    public final void setStart(@NotNull FocusRequester focusRequester0) {
        this.a.setStart(focusRequester0);
    }

    public final void setUp(@NotNull FocusRequester focusRequester0) {
        this.a.setUp(focusRequester0);
    }
}

