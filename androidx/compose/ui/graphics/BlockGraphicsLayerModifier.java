package androidx.compose.ui.graphics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p1.f;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001A\u00020\u0005¢\u0006\u0004\b\n\u0010\u000BJ&\u0010\u0014\u001A\u00020\u0011*\u00020\f2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R3\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\tR\u0014\u0010 \u001A\u00020\u001D8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "layerBlock", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "invalidateLayerBlock", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "", "toString", "()Ljava/lang/String;", "n", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "setLayerBlock", "", "getShouldAutoInvalidate", "()Z", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/BlockGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,672:1\n76#2:673\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/BlockGraphicsLayerModifier\n*L\n568#1:673\n*E\n"})
public final class BlockGraphicsLayerModifier extends Node implements LayoutModifierNode {
    public static final int $stable = 8;
    public Function1 n;

    public BlockGraphicsLayerModifier(@NotNull Function1 function10) {
        this.n = function10;
    }

    @NotNull
    public final Function1 getLayerBlock() {
        return this.n;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void invalidateLayerBlock() {
        NodeCoordinator nodeCoordinator0 = DelegatableNodeKt.requireCoordinator-64DMado(this, 2).getWrapped$ui_release();
        if(nodeCoordinator0 != null) {
            nodeCoordinator0.updateLayerBlock(this.n, true);
        }
    }

    @Override  // androidx.compose.ui.node.LayoutModifierNode
    @NotNull
    public MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull Measurable measurable0, long v) {
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        return MeasureScope.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new f(placeable0, this), 4, null);
    }

    public final void setLayerBlock(@NotNull Function1 function10) {
        this.n = function10;
    }

    @Override
    @NotNull
    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.n + ')';
    }
}

