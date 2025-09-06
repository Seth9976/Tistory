package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001A\u00020\u0002*\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007R0\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0010@\u0010X\u0090\u000E¢\u0006\u0012\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000E\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/vector/VNode;", "", "", "invalidate", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "getInvalidateListener$ui_release", "()Lkotlin/jvm/functions/Function1;", "setInvalidateListener$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "invalidateListener", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class VNode {
    public static final int $stable = 8;
    public Function1 a;

    public VNode(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract void draw(@NotNull DrawScope arg1);

    @Nullable
    public Function1 getInvalidateListener$ui_release() {
        return this.a;
    }

    public final void invalidate() {
        Function1 function10 = this.getInvalidateListener$ui_release();
        if(function10 != null) {
            function10.invoke(this);
        }
    }

    public void setInvalidateListener$ui_release(@Nullable Function1 function10) {
        this.a = function10;
    }
}

