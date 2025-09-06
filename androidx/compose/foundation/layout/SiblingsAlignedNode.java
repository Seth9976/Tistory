package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\b\tJ\u001F\u0010\u0006\u001A\u0004\u0018\u00010\u0004*\u00020\u00032\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedNode;", "Landroidx/compose/ui/node/ParentDataModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "WithAlignmentLineBlockNode", "WithAlignmentLineNode", "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineNode;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class SiblingsAlignedNode extends Node implements ParentDataModifierNode {
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\u000B\u001A\u00020\t*\u00020\b2\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000B\u0010\fR.\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineBlockNode;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "block", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "n", "Lkotlin/jvm/functions/Function1;", "getBlock", "()Lkotlin/jvm/functions/Function1;", "setBlock", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class WithAlignmentLineBlockNode extends SiblingsAlignedNode {
        public static final int $stable = 8;
        public Function1 n;

        public WithAlignmentLineBlockNode(@NotNull Function1 function10) {
            super(null);
            this.n = function10;
        }

        @NotNull
        public final Function1 getBlock() {
            return this.n;
        }

        @Override  // androidx.compose.foundation.layout.SiblingsAlignedNode
        @NotNull
        public Object modifyParentData(@NotNull Density density0, @Nullable Object object0) {
            RowColumnParentData rowColumnParentData0 = object0 instanceof RowColumnParentData ? ((RowColumnParentData)object0) : null;
            if(rowColumnParentData0 == null) {
                rowColumnParentData0 = new RowColumnParentData(0.0f, false, null, null, 15, null);
            }
            Block alignmentLineProvider$Block0 = new Block(this.n);
            rowColumnParentData0.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout_release(alignmentLineProvider$Block0));
            return rowColumnParentData0;
        }

        public final void setBlock(@NotNull Function1 function10) {
            this.n = function10;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001D\u0010\t\u001A\u00020\u0007*\u00020\u00062\b\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedNode$WithAlignmentLineNode;", "Landroidx/compose/foundation/layout/SiblingsAlignedNode;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "n", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "setAlignmentLine", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class WithAlignmentLineNode extends SiblingsAlignedNode {
        public static final int $stable = 8;
        public AlignmentLine n;

        public WithAlignmentLineNode(@NotNull AlignmentLine alignmentLine0) {
            super(null);
            this.n = alignmentLine0;
        }

        @NotNull
        public final AlignmentLine getAlignmentLine() {
            return this.n;
        }

        @Override  // androidx.compose.foundation.layout.SiblingsAlignedNode
        @NotNull
        public Object modifyParentData(@NotNull Density density0, @Nullable Object object0) {
            RowColumnParentData rowColumnParentData0 = object0 instanceof RowColumnParentData ? ((RowColumnParentData)object0) : null;
            if(rowColumnParentData0 == null) {
                rowColumnParentData0 = new RowColumnParentData(0.0f, false, null, null, 15, null);
            }
            Value alignmentLineProvider$Value0 = new Value(this.n);
            rowColumnParentData0.setCrossAxisAlignment(CrossAxisAlignment.Companion.Relative$foundation_layout_release(alignmentLineProvider$Value0));
            return rowColumnParentData0;
        }

        public final void setAlignmentLine(@NotNull AlignmentLine alignmentLine0) {
            this.n = alignmentLine0;
        }
    }

    public static final int $stable;

    public SiblingsAlignedNode(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Override  // androidx.compose.ui.node.ParentDataModifierNode
    @Nullable
    public abstract Object modifyParentData(@NotNull Density arg1, @Nullable Object arg2);
}

