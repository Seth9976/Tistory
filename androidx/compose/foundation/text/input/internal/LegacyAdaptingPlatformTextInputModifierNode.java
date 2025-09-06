package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import m0.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001F\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J:\u0010 \u001A\u0004\u0018\u00010\u001F2\'\u0010\u001E\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0\u001A\u0012\u0006\u0012\u0004\u0018\u00010\u001C0\u0018¢\u0006\u0002\b\u001DH\u0016¢\u0006\u0004\b \u0010!R\"\u0010\t\u001A\u00020\b8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R\"\u0010\u000B\u001A\u00020\n8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R/\u00104\u001A\u0004\u0018\u00010\u00142\b\u0010.\u001A\u0004\u0018\u00010\u00148V@RX\u0096\u008E\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001A\u0004\b1\u00102\"\u0004\b3\u0010\u0017R\u0016\u00108\u001A\u0004\u0018\u0001058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b6\u00107R\u0014\u0010<\u001A\u0002098VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b:\u0010;¨\u0006="}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "serviceAdapter", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "<init>", "(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "", "setServiceAdapter", "(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;)V", "onAttach", "()V", "onDetach", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSession;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlinx/coroutines/Job;", "launchTextInputSession", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "o", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getLegacyTextFieldState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setLegacyTextFieldState", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "p", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getTextFieldSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "setTextFieldSelectionManager", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "<set-?>", "q", "Landroidx/compose/runtime/MutableState;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "layoutCoordinates", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLegacyAdaptingPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAdaptingPlatformTextInputModifierNode.kt\nandroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,139:1\n81#2:140\n107#2,2:141\n*S KotlinDebug\n*F\n+ 1 LegacyAdaptingPlatformTextInputModifierNode.kt\nandroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifierNode\n*L\n98#1:140\n98#1:141,2\n*E\n"})
public final class LegacyAdaptingPlatformTextInputModifierNode extends Node implements LegacyPlatformTextInputNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, PlatformTextInputModifierNode {
    public static final int $stable = 8;
    public LegacyPlatformTextInputServiceAdapter n;
    public LegacyTextFieldState o;
    public TextFieldSelectionManager p;
    public final MutableState q;

    public LegacyAdaptingPlatformTextInputModifierNode(@NotNull LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter0, @NotNull LegacyTextFieldState legacyTextFieldState0, @NotNull TextFieldSelectionManager textFieldSelectionManager0) {
        this.n = legacyPlatformTextInputServiceAdapter0;
        this.o = legacyTextFieldState0;
        this.p = textFieldSelectionManager0;
        this.q = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    @Override  // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode
    @Nullable
    public LayoutCoordinates getLayoutCoordinates() {
        return (LayoutCoordinates)this.q.getValue();
    }

    @Override  // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode
    @NotNull
    public LegacyTextFieldState getLegacyTextFieldState() {
        return this.o;
    }

    @Override  // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode
    @Nullable
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return (SoftwareKeyboardController)CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
    }

    @Override  // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode
    @NotNull
    public TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.p;
    }

    @Override  // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return (ViewConfiguration)CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration());
    }

    @Override  // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode
    @Nullable
    public Job launchTextInputSession(@NotNull Function2 function20) {
        if(!this.isAttached()) {
            return null;
        }
        CoroutineScope coroutineScope0 = this.getCoroutineScope();
        y y0 = new y(this, function20, null);
        return BuildersKt.launch$default(coroutineScope0, null, CoroutineStart.UNDISPATCHED, y0, 1, null);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        this.n.registerModifier(this);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        this.n.unregisterModifier(this);
    }

    @Override  // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates0) {
        this.q.setValue(layoutCoordinates0);
    }

    public void setLegacyTextFieldState(@NotNull LegacyTextFieldState legacyTextFieldState0) {
        this.o = legacyTextFieldState0;
    }

    public final void setServiceAdapter(@NotNull LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter0) {
        if(this.isAttached()) {
            this.n.stopInput();
            this.n.unregisterModifier(this);
        }
        this.n = legacyPlatformTextInputServiceAdapter0;
        if(this.isAttached()) {
            this.n.registerModifier(this);
        }
    }

    public void setTextFieldSelectionManager(@NotNull TextFieldSelectionManager textFieldSelectionManager0) {
        this.p = textFieldSelectionManager0;
    }
}

