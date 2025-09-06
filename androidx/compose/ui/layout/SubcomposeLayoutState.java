package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z1.q;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0011\b\u0017\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\u0004\u0010\tJ*\u0010\u0010\u001A\u00020\u000F2\b\u0010\n\u001A\u0004\u0018\u00010\u00012\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\f0\u000B¢\u0006\u0002\b\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0006R1\u0010\u001B\u001A\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR1\u0010\u001F\u001A\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001D\u0010\u0018\u001A\u0004\b\u001E\u0010\u001ARH\u0010%\u001A0\u0012\u0004\u0012\u00020\u0015\u0012\u001B\u0012\u0019\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u0014¢\u0006\u0002\b\u0016\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\b\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0018\u001A\u0004\b$\u0010\u001A¨\u0006\'"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "()V", "", "maxSlotsToRetainForReuse", "(I)V", "slotId", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "forceRecomposeChildren$ui_release", "forceRecomposeChildren", "Lkotlin/Function2;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/ExtensionFunctionType;", "c", "Lkotlin/jvm/functions/Function2;", "getSetRoot$ui_release", "()Lkotlin/jvm/functions/Function2;", "setRoot", "Landroidx/compose/runtime/CompositionContext;", "d", "getSetCompositionContext$ui_release", "setCompositionContext", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "e", "getSetMeasurePolicy$ui_release", "setMeasurePolicy", "PrecomposedSlotHandle", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class SubcomposeLayoutState {
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001A\u00020\u0007H&J\"\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u000BH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000E\u001A\u00020\u00072\b\u0010\u000F\u001A\u0004\u0018\u00010\u00012\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016R\u0014\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001E0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "", "placeablesCount", "", "getPlaceablesCount", "()I", "dispose", "", "premeasure", "index", "constraints", "Landroidx/compose/ui/unit/Constraints;", "premeasure-0kLqBqw", "(IJ)V", "traverseDescendants", "key", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface PrecomposedSlotHandle {
        void dispose();

        default int getPlaceablesCount() {
            return 0;
        }

        default void premeasure-0kLqBqw(int v, long v1) {
        }

        default void traverseDescendants(@Nullable Object object0, @NotNull Function1 function10) {
        }
    }

    public static final int $stable = 8;
    public final SubcomposeSlotReusePolicy a;
    public LayoutNodeSubcompositionsState b;
    public final q c;
    public final q d;
    public final q e;

    public SubcomposeLayoutState() {
        this(i.a);
    }

    @Deprecated(message = "This constructor is deprecated", replaceWith = @ReplaceWith(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    public SubcomposeLayoutState(int v) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(v));
    }

    public SubcomposeLayoutState(@NotNull SubcomposeSlotReusePolicy subcomposeSlotReusePolicy0) {
        this.a = subcomposeSlotReusePolicy0;
        this.c = new q(this, 2);
        this.d = new q(this, 0);
        this.e = new q(this, 1);
    }

    public static final LayoutNodeSubcompositionsState access$getState(SubcomposeLayoutState subcomposeLayoutState0) {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = subcomposeLayoutState0.b;
        if(layoutNodeSubcompositionsState0 == null) {
            throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
        }
        return layoutNodeSubcompositionsState0;
    }

    public final void forceRecomposeChildren$ui_release() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = this.b;
        if(layoutNodeSubcompositionsState0 == null) {
            throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
        }
        layoutNodeSubcompositionsState0.forceRecomposeChildren();
    }

    @NotNull
    public final Function2 getSetCompositionContext$ui_release() {
        return this.d;
    }

    @NotNull
    public final Function2 getSetMeasurePolicy$ui_release() {
        return this.e;
    }

    @NotNull
    public final Function2 getSetRoot$ui_release() {
        return this.c;
    }

    @NotNull
    public final PrecomposedSlotHandle precompose(@Nullable Object object0, @NotNull Function2 function20) {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState0 = this.b;
        if(layoutNodeSubcompositionsState0 == null) {
            throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
        }
        return layoutNodeSubcompositionsState0.precompose(object0, function20);
    }
}

