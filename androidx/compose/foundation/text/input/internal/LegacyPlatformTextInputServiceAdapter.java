package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.PlatformTextInputService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000E\b \u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001A\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000B\u001A\u00020\u0006¢\u0006\u0004\b\u000B\u0010\u0003J\u000F\u0010\f\u001A\u00020\u0006H&¢\u0006\u0004\b\f\u0010\u0003R(\u0010\u0012\u001A\u0004\u0018\u00010\u00042\b\u0010\r\u001A\u0004\u0018\u00010\u00048\u0004@BX\u0084\u000E¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "node", "", "registerModifier", "(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;)V", "unregisterModifier", "showSoftwareKeyboard", "hideSoftwareKeyboard", "startStylusHandwriting", "<set-?>", "a", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "getTextInputModifierNode", "()Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "textInputModifierNode", "LegacyPlatformTextInputNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLegacyPlatformTextInputServiceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPlatformTextInputServiceAdapter.kt\nandroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
public abstract class LegacyPlatformTextInputServiceAdapter implements PlatformTextInputService {
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\u0016\u001A\u0004\u0018\u00010\u00172\'\u0010\u0018\u001A#\b\u0001\u0012\u0004\u0012\u00020\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001C0\u001B\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019¢\u0006\u0002\b\u001DH&¢\u0006\u0002\u0010\u001ER\u0014\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0014\u0010\n\u001A\u0004\u0018\u00010\u000BX¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0014\u0010\u000E\u001A\u0004\u0018\u00010\u000FX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001A\u00020\u0013X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001FÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "legacyTextFieldState", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getLegacyTextFieldState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "softwareKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "textFieldSelectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getTextFieldSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "launchTextInputSession", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSession;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface LegacyPlatformTextInputNode {
        @Nullable
        LayoutCoordinates getLayoutCoordinates();

        @Nullable
        LegacyTextFieldState getLegacyTextFieldState();

        @Nullable
        SoftwareKeyboardController getSoftwareKeyboardController();

        @Nullable
        TextFieldSelectionManager getTextFieldSelectionManager();

        @NotNull
        ViewConfiguration getViewConfiguration();

        @Nullable
        Job launchTextInputSession(@NotNull Function2 arg1);
    }

    public static final int $stable = 8;
    public LegacyPlatformTextInputNode a;

    @Nullable
    public final LegacyPlatformTextInputNode getTextInputModifierNode() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public final void hideSoftwareKeyboard() {
        LegacyPlatformTextInputNode legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0 = this.a;
        if(legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0 != null) {
            SoftwareKeyboardController softwareKeyboardController0 = legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0.getSoftwareKeyboardController();
            if(softwareKeyboardController0 != null) {
                softwareKeyboardController0.hide();
            }
        }
    }

    public final void registerModifier(@NotNull LegacyPlatformTextInputNode legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0) {
        if(this.a != null) {
            throw new IllegalStateException("Expected textInputModifierNode to be null");
        }
        this.a = legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0;
    }

    @Override  // androidx.compose.ui.text.input.PlatformTextInputService
    public final void showSoftwareKeyboard() {
        LegacyPlatformTextInputNode legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0 = this.a;
        if(legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0 != null) {
            SoftwareKeyboardController softwareKeyboardController0 = legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0.getSoftwareKeyboardController();
            if(softwareKeyboardController0 != null) {
                softwareKeyboardController0.show();
            }
        }
    }

    public abstract void startStylusHandwriting();

    public final void unregisterModifier(@NotNull LegacyPlatformTextInputNode legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0) {
        if(this.a != legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0) {
            throw new IllegalStateException(("Expected textInputModifierNode to be " + legacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode0 + " but was " + this.a).toString());
        }
        this.a = null;
    }
}

