package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\bJ\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider;", "", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "calculateAlignmentLinePosition", "(Landroidx/compose/ui/layout/Placeable;)I", "Block", "Value", "Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;", "Landroidx/compose/foundation/layout/AlignmentLineProvider$Value;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class AlignmentLineProvider {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001C\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000E\u001A\u00020\u00002\u0014\b\u0002\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0011\u001A\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\r¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "lineProviderBlock", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/Placeable;", "placeable", "calculateAlignmentLinePosition", "(Landroidx/compose/ui/layout/Placeable;)I", "component1", "()Lkotlin/jvm/functions/Function1;", "copy", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/layout/AlignmentLineProvider$Block;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function1;", "getLineProviderBlock", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Block extends AlignmentLineProvider {
        public static final int $stable;
        public final Function1 a;

        public Block(@NotNull Function1 function10) {
            super(null);
            this.a = function10;
        }

        @Override  // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(@NotNull Placeable placeable0) {
            return ((Number)this.a.invoke(placeable0)).intValue();
        }

        @NotNull
        public final Function1 component1() {
            return this.a;
        }

        @NotNull
        public final Block copy(@NotNull Function1 function10) {
            return new Block(function10);
        }

        public static Block copy$default(Block alignmentLineProvider$Block0, Function1 function10, int v, Object object0) {
            if((v & 1) != 0) {
                function10 = alignmentLineProvider$Block0.a;
            }
            return alignmentLineProvider$Block0.copy(function10);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Block ? Intrinsics.areEqual(this.a, ((Block)object0).a) : false;
        }

        @NotNull
        public final Function1 getLineProviderBlock() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Block(lineProviderBlock=" + this.a + ')';
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001A\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\f¨\u0006\u001C"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineProvider$Value;", "Landroidx/compose/foundation/layout/AlignmentLineProvider;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;)V", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "calculateAlignmentLinePosition", "(Landroidx/compose/ui/layout/Placeable;)I", "component1", "()Landroidx/compose/ui/layout/AlignmentLine;", "copy", "(Landroidx/compose/ui/layout/AlignmentLine;)Landroidx/compose/foundation/layout/AlignmentLineProvider$Value;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Value extends AlignmentLineProvider {
        public static final int $stable;
        public final AlignmentLine a;

        public Value(@NotNull AlignmentLine alignmentLine0) {
            super(null);
            this.a = alignmentLine0;
        }

        @Override  // androidx.compose.foundation.layout.AlignmentLineProvider
        public int calculateAlignmentLinePosition(@NotNull Placeable placeable0) {
            return placeable0.get(this.a);
        }

        @NotNull
        public final AlignmentLine component1() {
            return this.a;
        }

        @NotNull
        public final Value copy(@NotNull AlignmentLine alignmentLine0) {
            return new Value(alignmentLine0);
        }

        public static Value copy$default(Value alignmentLineProvider$Value0, AlignmentLine alignmentLine0, int v, Object object0) {
            if((v & 1) != 0) {
                alignmentLine0 = alignmentLineProvider$Value0.a;
            }
            return alignmentLineProvider$Value0.copy(alignmentLine0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Value ? Intrinsics.areEqual(this.a, ((Value)object0).a) : false;
        }

        @NotNull
        public final AlignmentLine getAlignmentLine() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "Value(alignmentLine=" + this.a + ')';
        }
    }

    public static final int $stable;

    public AlignmentLineProvider(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract int calculateAlignmentLinePosition(@NotNull Placeable arg1);
}

