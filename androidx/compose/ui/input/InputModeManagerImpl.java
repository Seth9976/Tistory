package androidx.compose.ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u000F\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\f\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000BR1\u0010\t\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u00028V@VX\u0096\u008E\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/InputModeManagerImpl;", "Landroidx/compose/ui/input/InputModeManager;", "Landroidx/compose/ui/input/InputMode;", "initialInputMode", "Lkotlin/Function1;", "", "onRequestInputModeChange", "<init>", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "inputMode", "requestInputMode-iuPiT84", "(I)Z", "requestInputMode", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getInputMode-aOaMEAU", "()I", "setInputMode-iuPiT84", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,77:1\n81#2:78\n107#2,2:79\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n72#1:78\n72#1:79,2\n*E\n"})
public final class InputModeManagerImpl implements InputModeManager {
    public static final int $stable;
    public final Function1 a;
    public final MutableState b;

    public InputModeManagerImpl(int v, Function1 function10, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = function10;
        this.b = SnapshotStateKt.mutableStateOf$default(InputMode.box-impl(v), null, 2, null);
    }

    @Override  // androidx.compose.ui.input.InputModeManager
    public int getInputMode-aOaMEAU() {
        return ((InputMode)this.b.getValue()).unbox-impl();
    }

    @Override  // androidx.compose.ui.input.InputModeManager
    @ExperimentalComposeUiApi
    public boolean requestInputMode-iuPiT84(int v) {
        InputMode inputMode0 = InputMode.box-impl(v);
        return ((Boolean)this.a.invoke(inputMode0)).booleanValue();
    }

    public void setInputMode-iuPiT84(int v) {
        InputMode inputMode0 = InputMode.box-impl(v);
        this.b.setValue(inputMode0);
    }
}

