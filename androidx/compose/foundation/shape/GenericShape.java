package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BJ\u0012A\u0010\f\u001A=\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0002\b\u000B¢\u0006\u0004\b\r\u0010\u000EJ*\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001C\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/shape/GenericShape;", "Landroidx/compose/ui/graphics/Shape;", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/geometry/Size;", "Lkotlin/ParameterName;", "name", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "Lkotlin/ExtensionFunctionType;", "builder", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class GenericShape implements Shape {
    public static final int $stable;
    public final Function3 a;

    public GenericShape(@NotNull Function3 function30) {
        this.a = function30;
    }

    @Override  // androidx.compose.ui.graphics.Shape
    @NotNull
    public Outline createOutline-Pq9zytI(long v, @NotNull LayoutDirection layoutDirection0, @NotNull Density density0) {
        Path path0 = AndroidPath_androidKt.Path();
        Size size0 = Size.box-impl(v);
        this.a.invoke(path0, size0, layoutDirection0);
        path0.close();
        return new Generic(path0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        Function3 function30 = null;
        if(this == object0) {
            return true;
        }
        GenericShape genericShape0 = object0 instanceof GenericShape ? ((GenericShape)object0) : null;
        if(genericShape0 != null) {
            function30 = genericShape0.a;
        }
        return function30 == this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}

