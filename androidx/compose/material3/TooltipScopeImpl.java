package androidx.compose.material3;

import aa.o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\r\u001A\u00020\u0007*\u00020\u00072\u001F\u0010\f\u001A\u001B\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000ER\u001F\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/TooltipScopeImpl;", "Landroidx/compose/material3/TooltipScope;", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getAnchorBounds", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/Modifier;", "Lkotlin/Function2;", "Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "Lkotlin/ExtensionFunctionType;", "draw", "drawCaret", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "a", "Lkotlin/jvm/functions/Function0;", "getGetAnchorBounds", "()Lkotlin/jvm/functions/Function0;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TooltipScopeImpl implements TooltipScope {
    public static final int $stable;
    public final Function0 a;

    public TooltipScopeImpl(@NotNull Function0 function00) {
        this.a = function00;
    }

    @Override  // androidx.compose.material3.TooltipScope
    @NotNull
    public Modifier drawCaret(@NotNull Modifier modifier0, @NotNull Function2 function20) {
        return DrawModifierKt.drawWithCache(modifier0, new o(9, function20, this));
    }

    @NotNull
    public final Function0 getGetAnchorBounds() {
        return this.a;
    }
}

