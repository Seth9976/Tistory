package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u009C\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00C0\u0002\u0018\u00002\u00020\u0001R\'\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001A\u0004\b\u0004\u0010\u0005R\'\u0010\f\u001A\b\u0012\u0004\u0012\u00020\t0\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b\u000B\u0010\u0007\u001A\u0004\b\n\u0010\u0005R\'\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\r0\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b\u000F\u0010\u0007\u001A\u0004\b\u000E\u0010\u0005R\'\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00110\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b\u0013\u0010\u0007\u001A\u0004\b\u0012\u0010\u0005R\'\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00150\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b\u0017\u0010\u0007\u001A\u0004\b\u0016\u0010\u0005R\'\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00190\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b\u001B\u0010\u0007\u001A\u0004\b\u001A\u0010\u0005R\'\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001D0\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b\u001F\u0010\u0007\u001A\u0004\b\u001E\u0010\u0005R\'\u0010$\u001A\b\u0012\u0004\u0012\u00020!0\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b#\u0010\u0007\u001A\u0004\b\"\u0010\u0005R\'\u0010(\u001A\b\u0012\u0004\u0012\u00020%0\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b\'\u0010\u0007\u001A\u0004\b&\u0010\u0005R\'\u0010,\u001A\b\u0012\u0004\u0012\u00020)0\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b+\u0010\u0007\u001A\u0004\b*\u0010\u0005R\'\u00100\u001A\b\u0012\u0004\u0012\u00020-0\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b/\u0010\u0007\u001A\u0004\b.\u0010\u0005R\'\u00104\u001A\b\u0012\u0004\u0012\u0002010\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b3\u0010\u0007\u001A\u0004\b2\u0010\u0005R\'\u00108\u001A\b\u0012\u0004\u0012\u0002050\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b7\u0010\u0007\u001A\u0004\b6\u0010\u0005R\'\u0010<\u001A\b\u0012\u0004\u0012\u0002090\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b;\u0010\u0007\u001A\u0004\b:\u0010\u0005R\'\u0010@\u001A\b\u0012\u0004\u0012\u00020=0\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\b?\u0010\u0007\u001A\u0004\b>\u0010\u0005R\'\u0010D\u001A\b\u0012\u0004\u0012\u00020A0\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\bC\u0010\u0007\u001A\u0004\bB\u0010\u0005R\'\u0010H\u001A\b\u0012\u0004\u0012\u00020E0\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\bG\u0010\u0007\u001A\u0004\bF\u0010\u0005R\'\u0010L\u001A\b\u0012\u0004\u0012\u00020I0\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u0012\u0004\bK\u0010\u0007\u001A\u0004\bJ\u0010\u0005\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006M"}, d2 = {"Landroidx/compose/ui/node/Nodes;", "", "Landroidx/compose/ui/node/NodeKind;", "Landroidx/compose/ui/Modifier$Node;", "getAny-OLwlOKw", "()I", "getAny-OLwlOKw$annotations", "()V", "Any", "Landroidx/compose/ui/node/LayoutModifierNode;", "getLayout-OLwlOKw", "getLayout-OLwlOKw$annotations", "Layout", "Landroidx/compose/ui/node/DrawModifierNode;", "getDraw-OLwlOKw", "getDraw-OLwlOKw$annotations", "Draw", "Landroidx/compose/ui/node/SemanticsModifierNode;", "getSemantics-OLwlOKw", "getSemantics-OLwlOKw$annotations", "Semantics", "Landroidx/compose/ui/node/PointerInputModifierNode;", "getPointerInput-OLwlOKw", "getPointerInput-OLwlOKw$annotations", "PointerInput", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "getLocals-OLwlOKw", "getLocals-OLwlOKw$annotations", "Locals", "Landroidx/compose/ui/node/ParentDataModifierNode;", "getParentData-OLwlOKw", "getParentData-OLwlOKw$annotations", "ParentData", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "getLayoutAware-OLwlOKw", "getLayoutAware-OLwlOKw$annotations", "LayoutAware", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "getGlobalPositionAware-OLwlOKw", "getGlobalPositionAware-OLwlOKw$annotations", "GlobalPositionAware", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "getApproachMeasure-OLwlOKw", "getApproachMeasure-OLwlOKw$annotations", "ApproachMeasure", "Landroidx/compose/ui/focus/FocusTargetNode;", "getFocusTarget-OLwlOKw", "getFocusTarget-OLwlOKw$annotations", "FocusTarget", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "getFocusProperties-OLwlOKw", "getFocusProperties-OLwlOKw$annotations", "FocusProperties", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "getFocusEvent-OLwlOKw", "getFocusEvent-OLwlOKw$annotations", "FocusEvent", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "getKeyInput-OLwlOKw", "getKeyInput-OLwlOKw$annotations", "KeyInput", "Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;", "getRotaryInput-OLwlOKw", "getRotaryInput-OLwlOKw$annotations", "RotaryInput", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "getCompositionLocalConsumer-OLwlOKw", "getCompositionLocalConsumer-OLwlOKw$annotations", "CompositionLocalConsumer", "Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;", "getSoftKeyboardKeyInput-OLwlOKw", "getSoftKeyboardKeyInput-OLwlOKw$annotations", "SoftKeyboardKeyInput", "Landroidx/compose/ui/node/TraversableNode;", "getTraversable-OLwlOKw", "getTraversable-OLwlOKw$annotations", "Traversable", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Nodes {
    public static final int $stable;
    @NotNull
    public static final Nodes INSTANCE;

    static {
        Nodes.INSTANCE = new Nodes();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static final int getAny-OLwlOKw() {
        return 1;
    }

    @JvmStatic
    public static void getAny-OLwlOKw$annotations() {
    }

    public static final int getApproachMeasure-OLwlOKw() {
        return 0x200;
    }

    @JvmStatic
    public static void getApproachMeasure-OLwlOKw$annotations() {
    }

    public static final int getCompositionLocalConsumer-OLwlOKw() {
        return 0x8000;
    }

    @JvmStatic
    public static void getCompositionLocalConsumer-OLwlOKw$annotations() {
    }

    public static final int getDraw-OLwlOKw() {
        return 4;
    }

    @JvmStatic
    public static void getDraw-OLwlOKw$annotations() {
    }

    public static final int getFocusEvent-OLwlOKw() {
        return 0x1000;
    }

    @JvmStatic
    public static void getFocusEvent-OLwlOKw$annotations() {
    }

    public static final int getFocusProperties-OLwlOKw() {
        return 0x800;
    }

    @JvmStatic
    public static void getFocusProperties-OLwlOKw$annotations() {
    }

    public static final int getFocusTarget-OLwlOKw() {
        return 0x400;
    }

    @JvmStatic
    public static void getFocusTarget-OLwlOKw$annotations() {
    }

    public static final int getGlobalPositionAware-OLwlOKw() {
        return 0x100;
    }

    @JvmStatic
    public static void getGlobalPositionAware-OLwlOKw$annotations() {
    }

    public static final int getKeyInput-OLwlOKw() {
        return 0x2000;
    }

    @JvmStatic
    public static void getKeyInput-OLwlOKw$annotations() {
    }

    public static final int getLayout-OLwlOKw() {
        return 2;
    }

    @JvmStatic
    public static void getLayout-OLwlOKw$annotations() {
    }

    public static final int getLayoutAware-OLwlOKw() {
        return 0x80;
    }

    @JvmStatic
    public static void getLayoutAware-OLwlOKw$annotations() {
    }

    public static final int getLocals-OLwlOKw() {
        return 0x20;
    }

    @JvmStatic
    public static void getLocals-OLwlOKw$annotations() {
    }

    public static final int getParentData-OLwlOKw() {
        return 0x40;
    }

    @JvmStatic
    public static void getParentData-OLwlOKw$annotations() {
    }

    public static final int getPointerInput-OLwlOKw() {
        return 16;
    }

    @JvmStatic
    public static void getPointerInput-OLwlOKw$annotations() {
    }

    public static final int getRotaryInput-OLwlOKw() {
        return 0x4000;
    }

    @JvmStatic
    public static void getRotaryInput-OLwlOKw$annotations() {
    }

    public static final int getSemantics-OLwlOKw() {
        return 8;
    }

    @JvmStatic
    public static void getSemantics-OLwlOKw$annotations() {
    }

    public static final int getSoftKeyboardKeyInput-OLwlOKw() {
        return 0x20000;
    }

    @JvmStatic
    public static void getSoftKeyboardKeyInput-OLwlOKw$annotations() {
    }

    public static final int getTraversable-OLwlOKw() {
        return 0x40000;
    }

    @JvmStatic
    public static void getTraversable-OLwlOKw$annotations() {
    }
}

