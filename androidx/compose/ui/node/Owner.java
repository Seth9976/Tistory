package androidx.compose.ui.node;

import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u00E0\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00BA\u00012\u00020\u0001:\u0004\u00BA\u0001\u00BB\u0001J\u001A\u0010y\u001A\u00020z2\u0006\u0010{\u001A\u00020zH&\u00F8\u0001\u0000\u00A2\u0006\u0004\b|\u0010}J\u001B\u0010~\u001A\u00020z2\u0006\u0010\u007F\u001A\u00020zH&\u00F8\u0001\u0000\u00A2\u0006\u0005\b\u0080\u0001\u0010}Jn\u0010\u0081\u0001\u001A\u00030\u0082\u00012C\u0010\u0083\u0001\u001A>\u0012\u0017\u0012\u00150\u0085\u0001\u00A2\u0006\u000F\b\u0086\u0001\u0012\n\b\u0087\u0001\u0012\u0005\b\b(\u0088\u0001\u0012\u0019\u0012\u0017\u0018\u00010\u0089\u0001\u00A2\u0006\u000F\b\u0086\u0001\u0012\n\b\u0087\u0001\u0012\u0005\b\b(\u008A\u0001\u0012\u0005\u0012\u00030\u008B\u00010\u0084\u00012\u000F\u0010\u008C\u0001\u001A\n\u0012\u0005\u0012\u00030\u008B\u00010\u008D\u00012\f\b\u0002\u0010\u008E\u0001\u001A\u0005\u0018\u00010\u0089\u0001H&J\u001E\u0010\u008F\u0001\u001A\u00030\u008B\u00012\u0007\u0010\u0090\u0001\u001A\u00020O2\t\b\u0002\u0010\u0091\u0001\u001A\u00020[H&J\"\u0010\u0092\u0001\u001A\u0005\u0018\u00010\u0093\u00012\b\u0010\u0094\u0001\u001A\u00030\u0095\u0001H&\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J)\u0010\u0098\u0001\u001A\u00030\u008B\u00012\u0007\u0010\u0090\u0001\u001A\u00020O2\b\u0010\u0099\u0001\u001A\u00030\u009A\u0001H&\u00F8\u0001\u0000\u00A2\u0006\u0006\b\u009B\u0001\u0010\u009C\u0001J\u0015\u0010\u0098\u0001\u001A\u00030\u008B\u00012\t\b\u0002\u0010\u009D\u0001\u001A\u00020[H&J\u0013\u0010\u009E\u0001\u001A\u00030\u008B\u00012\u0007\u0010\u009F\u0001\u001A\u00020OH&J\u0013\u0010\u00A0\u0001\u001A\u00030\u008B\u00012\u0007\u0010\u009F\u0001\u001A\u00020OH&J\n\u0010\u00A1\u0001\u001A\u00030\u008B\u0001H&J\u0019\u0010\u00A2\u0001\u001A\u00030\u008B\u00012\r\u0010\u00A3\u0001\u001A\b0\u00A4\u0001j\u0003`\u00A5\u0001H\'J\u0013\u0010\u00A6\u0001\u001A\u00030\u008B\u00012\u0007\u0010\u0090\u0001\u001A\u00020OH&J4\u0010\u00A7\u0001\u001A\u00030\u008B\u00012\u0007\u0010\u0090\u0001\u001A\u00020O2\t\b\u0002\u0010\u0091\u0001\u001A\u00020[2\t\b\u0002\u0010\u00A8\u0001\u001A\u00020[2\t\b\u0002\u0010\u00A9\u0001\u001A\u00020[H&J)\u0010\u00AA\u0001\u001A\u00030\u008B\u00012\u0007\u0010\u0090\u0001\u001A\u00020O2\t\b\u0002\u0010\u0091\u0001\u001A\u00020[2\t\b\u0002\u0010\u00A8\u0001\u001A\u00020[H&J\n\u0010\u00AB\u0001\u001A\u00030\u008B\u0001H&J\u001B\u0010\u00AC\u0001\u001A\u00030\u008B\u00012\u000F\u0010\u00AD\u0001\u001A\n\u0012\u0005\u0012\u00030\u008B\u00010\u008D\u0001H&J\u0014\u0010\u00AE\u0001\u001A\u00030\u008B\u00012\b\u0010\u00AD\u0001\u001A\u00030\u00AF\u0001H&J\t\u0010\u00B0\u0001\u001A\u00020[H&J\u0013\u0010\u00B1\u0001\u001A\u00030\u008B\u00012\u0007\u0010\u0090\u0001\u001A\u00020OH&JA\u0010\u00B2\u0001\u001A\u00030\u00B3\u00012.\u0010\u00B4\u0001\u001A)\b\u0001\u0012\u0005\u0012\u00030\u00B5\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u00B3\u00010\u00B6\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u00B7\u00010\u0084\u0001\u00A2\u0006\u0003\b\u00B8\u0001H\u00A6@\u00A2\u0006\u0003\u0010\u00B9\u0001R\u0012\u0010\u0002\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00078gX\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u00020\r8gX\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b\u000E\u0010\t\u001A\u0004\b\u000F\u0010\u0010R\u0012\u0010\u0011\u001A\u00020\u0012X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001A\u00020\u0016X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001A\u00020\u001AX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u0012\u0010\u001D\u001A\u00020\u001EX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010 R\u0012\u0010!\u001A\u00020\"X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010$R\u0012\u0010%\u001A\u00020&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\'\u0010(R\u001A\u0010)\u001A\u00020*8&X\u00A7\u0004\u00A2\u0006\f\u0012\u0004\b+\u0010\t\u001A\u0004\b,\u0010-R\u0012\u0010.\u001A\u00020/X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b0\u00101R\u0012\u00102\u001A\u000203X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b4\u00105R\u0012\u00106\u001A\u000207X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b8\u00109R\u0012\u0010:\u001A\u00020;X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b<\u0010=R\u0012\u0010>\u001A\u00020?X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b@\u0010AR\u0012\u0010B\u001A\u00020CX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bD\u0010ER\u0014\u0010F\u001A\u00020G8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bH\u0010IR\u0012\u0010J\u001A\u00020KX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bL\u0010MR\u0012\u0010N\u001A\u00020OX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bP\u0010QR\u0012\u0010R\u001A\u00020SX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bT\u0010UR\u0012\u0010V\u001A\u00020WX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bX\u0010YR\"\u0010\\\u001A\u00020[2\u0006\u0010Z\u001A\u00020[@gX\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0012\u0010a\u001A\u00020bX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bc\u0010dR\u0012\u0010e\u001A\u00020fX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bg\u0010hR\u0012\u0010i\u001A\u00020jX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bk\u0010lR\u0012\u0010m\u001A\u00020nX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bo\u0010pR\u0012\u0010q\u001A\u00020rX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bs\u0010tR\u0012\u0010u\u001A\u00020vX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bw\u0010x\u00F8\u0001\u0001\u0082\u0002\r\n\u0005\b\u00A1\u001E0\u0001\n\u0004\b!0\u0001\u00A8\u0006\u00BC\u0001\u00C0\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "accessibilityManager", "Landroidx/compose/ui/platform/AccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AccessibilityManager;", "autofill", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill$annotations", "()V", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree$annotations", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "dragAndDropManager", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "focusOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "measureIteration", "", "getMeasureIteration", "()J", "modifierLocalManager", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "placementScope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "<set-?>", "", "showLayoutBounds", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "softwareKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "calculateLocalPosition", "Landroidx/compose/ui/geometry/Offset;", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "(J)J", "calculatePositionInWindow", "localPosition", "calculatePositionInWindow-MK-Hz9U", "createLayer", "Landroidx/compose/ui/node/OwnedLayer;", "drawBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "", "invalidateParentLayer", "Lkotlin/Function0;", "explicitLayer", "forceMeasureTheSubtree", "layoutNode", "affectsLookahead", "getFocusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "measureAndLayout", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "sendPointerUpdate", "onAttach", "node", "onDetach", "onEndApplyChanges", "onInteropViewLayoutChange", "view", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "onLayoutChange", "onRequestMeasure", "forceRequest", "scheduleMeasureAndLayout", "onRequestRelayout", "onSemanticsChange", "registerOnEndApplyChangesListener", "listener", "registerOnLayoutCompletedListener", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "requestFocus", "requestOnPositionedCallback", "textInputSession", "", "session", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "OnLayoutCompletedListener", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Owner extends PositionCalculator {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\"\u0010\t\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/node/Owner$Companion;", "", "", "b", "Z", "getEnableExtraAssertions", "()Z", "setEnableExtraAssertions", "(Z)V", "enableExtraAssertions", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;
        public static boolean b;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        public final boolean getEnableExtraAssertions() [...] // 潜在的解密器

        public final void setEnableExtraAssertions(boolean z) {
            Companion.b = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "onLayoutComplete", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    @NotNull
    public static final Companion Companion;

    static {
        Owner.Companion = Companion.a;
    }

    long calculateLocalPosition-MK-Hz9U(long arg1);

    long calculatePositionInWindow-MK-Hz9U(long arg1);

    @NotNull
    OwnedLayer createLayer(@NotNull Function2 arg1, @NotNull Function0 arg2, @Nullable GraphicsLayer arg3);

    static OwnedLayer createLayer$default(Owner owner0, Function2 function20, Function0 function00, GraphicsLayer graphicsLayer0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if((v & 4) != 0) {
            graphicsLayer0 = null;
        }
        return owner0.createLayer(function20, function00, graphicsLayer0);
    }

    void forceMeasureTheSubtree(@NotNull LayoutNode arg1, boolean arg2);

    static void forceMeasureTheSubtree$default(Owner owner0, LayoutNode layoutNode0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if((v & 2) != 0) {
            z = false;
        }
        owner0.forceMeasureTheSubtree(layoutNode0, z);
    }

    @NotNull
    AccessibilityManager getAccessibilityManager();

    @ExperimentalComposeUiApi
    @Nullable
    Autofill getAutofill();

    @ExperimentalComposeUiApi
    static void getAutofill$annotations() {
    }

    @ExperimentalComposeUiApi
    @NotNull
    AutofillTree getAutofillTree();

    @ExperimentalComposeUiApi
    static void getAutofillTree$annotations() {
    }

    @NotNull
    ClipboardManager getClipboardManager();

    @NotNull
    CoroutineContext getCoroutineContext();

    @NotNull
    Density getDensity();

    @NotNull
    DragAndDropManager getDragAndDropManager();

    @Nullable
    FocusDirection getFocusDirection-P8AzH3I(@NotNull KeyEvent arg1);

    @NotNull
    FocusOwner getFocusOwner();

    @NotNull
    Resolver getFontFamilyResolver();

    @NotNull
    ResourceLoader getFontLoader();

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    static void getFontLoader$annotations() {
    }

    @NotNull
    GraphicsContext getGraphicsContext();

    @NotNull
    HapticFeedback getHapticFeedBack();

    @NotNull
    InputModeManager getInputModeManager();

    @NotNull
    LayoutDirection getLayoutDirection();

    long getMeasureIteration();

    @NotNull
    ModifierLocalManager getModifierLocalManager();

    @NotNull
    default PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @NotNull
    PointerIconService getPointerIconService();

    @NotNull
    LayoutNode getRoot();

    @NotNull
    RootForTest getRootForTest();

    @NotNull
    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    @NotNull
    OwnerSnapshotObserver getSnapshotObserver();

    @NotNull
    SoftwareKeyboardController getSoftwareKeyboardController();

    @NotNull
    TextInputService getTextInputService();

    @NotNull
    TextToolbar getTextToolbar();

    @NotNull
    ViewConfiguration getViewConfiguration();

    @NotNull
    WindowInfo getWindowInfo();

    void measureAndLayout(boolean arg1);

    static void measureAndLayout$default(Owner owner0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if((v & 1) != 0) {
            z = true;
        }
        owner0.measureAndLayout(z);
    }

    void measureAndLayout-0kLqBqw(@NotNull LayoutNode arg1, long arg2);

    void onAttach(@NotNull LayoutNode arg1);

    void onDetach(@NotNull LayoutNode arg1);

    void onEndApplyChanges();

    @InternalComposeUiApi
    void onInteropViewLayoutChange(@NotNull View arg1);

    void onLayoutChange(@NotNull LayoutNode arg1);

    void onRequestMeasure(@NotNull LayoutNode arg1, boolean arg2, boolean arg3, boolean arg4);

    static void onRequestMeasure$default(Owner owner0, LayoutNode layoutNode0, boolean z, boolean z1, boolean z2, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        if((v & 8) != 0) {
            z2 = true;
        }
        owner0.onRequestMeasure(layoutNode0, z, z1, z2);
    }

    void onRequestRelayout(@NotNull LayoutNode arg1, boolean arg2, boolean arg3);

    static void onRequestRelayout$default(Owner owner0, LayoutNode layoutNode0, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            z1 = false;
        }
        owner0.onRequestRelayout(layoutNode0, z, z1);
    }

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(@NotNull Function0 arg1);

    void registerOnLayoutCompletedListener(@NotNull OnLayoutCompletedListener arg1);

    boolean requestFocus();

    void requestOnPositionedCallback(@NotNull LayoutNode arg1);

    @RestrictTo({Scope.LIBRARY})
    @InternalCoreApi
    void setShowLayoutBounds(boolean arg1);

    @Nullable
    Object textInputSession(@NotNull Function2 arg1, @NotNull Continuation arg2);
}

