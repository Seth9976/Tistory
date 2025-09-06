package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R0\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00048W@VX\u0096\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\u0012\u0004\b\n\u0010\u0003\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\r\u001A\u00020\f2\u0006\u0010\u0005\u001A\u00020\f8V@VX\u0096\u000E¢\u0006\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/WindowInfoImpl;", "Landroidx/compose/ui/platform/WindowInfo;", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "value", "getKeyboardModifiers-k7X9c1A", "()I", "setKeyboardModifiers-5xRPYO0", "(I)V", "getKeyboardModifiers-k7X9c1A$annotations", "keyboardModifiers", "", "isWindowFocused", "()Z", "setWindowFocused", "(Z)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class WindowInfoImpl implements WindowInfo {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/WindowInfoImpl$Companion;", "", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "GlobalKeyboardModifiers", "Landroidx/compose/runtime/MutableState;", "getGlobalKeyboardModifiers$ui_release", "()Landroidx/compose/runtime/MutableState;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final MutableState getGlobalKeyboardModifiers$ui_release() {
            return WindowInfoImpl.b;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final MutableState a;
    public static final MutableState b;

    static {
        WindowInfoImpl.Companion = new Companion(null);
        WindowInfoImpl.b = SnapshotStateKt.mutableStateOf$default(PointerKeyboardModifiers.box-impl(0), null, 2, null);
    }

    public WindowInfoImpl() {
        this.a = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @Override  // androidx.compose.ui.platform.WindowInfo
    @ExperimentalComposeUiApi
    public int getKeyboardModifiers-k7X9c1A() {
        return ((PointerKeyboardModifiers)WindowInfoImpl.b.getValue()).unbox-impl();
    }

    @Override  // androidx.compose.ui.platform.WindowInfo
    public static void getKeyboardModifiers-k7X9c1A$annotations() {
    }

    @Override  // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean)this.a.getValue()).booleanValue();
    }

    public void setKeyboardModifiers-5xRPYO0(int v) {
        PointerKeyboardModifiers pointerKeyboardModifiers0 = PointerKeyboardModifiers.box-impl(v);
        WindowInfoImpl.b.setValue(pointerKeyboardModifiers0);
    }

    public void setWindowFocused(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }
}

