package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B!\b\u0000\u0012\u0016\u0010\t\u001A\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0005¢\u0006\u0004\b\n\u0010\u000BJ\u001B\u0010\u000F\u001A\u00060\u0007j\u0002`\b2\u0006\u0010\f\u001A\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000ER-\u0010\u0017\u001A\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001F\u001A\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER-\u0010#\u001A\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b \u0010\u0012\u001A\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R$\u0010\'\u001A\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b$\u0010\u001A\u001A\u0004\b%\u0010\u001C\"\u0004\b&\u0010\u001E\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/constraintlayout/compose/DimensionDescription;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/core/state/Dimension;", "Landroidx/constraintlayout/compose/SolverDimension;", "baseDimension", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "state", "toSolverDimension$compose_release", "(Landroidx/constraintlayout/compose/State;)Landroidx/constraintlayout/core/state/Dimension;", "toSolverDimension", "Landroidx/compose/ui/unit/Dp;", "b", "Landroidx/compose/ui/unit/Dp;", "getMin-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "setMin-YLDhkOg", "(Landroidx/compose/ui/unit/Dp;)V", "min", "", "c", "Ljava/lang/Object;", "getMinSymbol", "()Ljava/lang/Object;", "setMinSymbol", "(Ljava/lang/Object;)V", "minSymbol", "d", "getMax-lTKBWiU", "setMax-YLDhkOg", "max", "e", "getMaxSymbol", "setMaxSymbol", "maxSymbol", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DimensionDescription implements Coercible, MaxCoercible, MinCoercible, Dimension {
    public final Function1 a;
    public Dp b;
    public Object c;
    public Dp d;
    public Object e;

    public DimensionDescription(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "baseDimension");
        super();
        this.a = function10;
    }

    @Nullable
    public final Dp getMax-lTKBWiU() {
        return this.d;
    }

    @Nullable
    public final Object getMaxSymbol() {
        return this.e;
    }

    @Nullable
    public final Dp getMin-lTKBWiU() {
        return this.b;
    }

    @Nullable
    public final Object getMinSymbol() {
        return this.c;
    }

    public final void setMax-YLDhkOg(@Nullable Dp dp0) {
        this.d = dp0;
    }

    public final void setMaxSymbol(@Nullable Object object0) {
        this.e = object0;
    }

    public final void setMin-YLDhkOg(@Nullable Dp dp0) {
        this.b = dp0;
    }

    public final void setMinSymbol(@Nullable Object object0) {
        this.c = object0;
    }

    @NotNull
    public final androidx.constraintlayout.core.state.Dimension toSolverDimension$compose_release(@NotNull State state0) {
        Intrinsics.checkNotNullParameter(state0, "state");
        androidx.constraintlayout.core.state.Dimension dimension0 = (androidx.constraintlayout.core.state.Dimension)this.a.invoke(state0);
        if(this.getMinSymbol() != null) {
            dimension0.min(this.getMinSymbol());
        }
        else if(this.getMin-lTKBWiU() != null) {
            Dp dp0 = this.getMin-lTKBWiU();
            Intrinsics.checkNotNull(dp0);
            dimension0.min(state0.convertDimension(dp0));
        }
        if(this.getMaxSymbol() != null) {
            dimension0.max(this.getMaxSymbol());
            return dimension0;
        }
        if(this.getMax-lTKBWiU() != null) {
            Dp dp1 = this.getMax-lTKBWiU();
            Intrinsics.checkNotNull(dp1);
            dimension0.max(state0.convertDimension(dp1));
        }
        return dimension0;
    }
}

