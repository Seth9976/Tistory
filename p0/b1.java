package p0;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.FabPlacement;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class b1 implements Shape {
    public final Shape a;
    public final FabPlacement b;

    public b1(Shape shape0, FabPlacement fabPlacement0) {
        this.a = shape0;
        this.b = fabPlacement0;
    }

    @Override  // androidx.compose.ui.graphics.Shape
    public final Outline createOutline-Pq9zytI(long v, LayoutDirection layoutDirection0, Density density0) {
        Path path0 = AndroidPath_androidKt.Path();
        path0.addRect(new Rect(0.0f, 0.0f, Size.getWidth-impl(v), Size.getHeight-impl(v)));
        Path path1 = AndroidPath_androidKt.Path();
        float f = density0.toPx-0680j_4(0.0f);
        long v1 = SizeKt.Size(((float)this.b.getWidth()) + 2.0f * f, ((float)this.b.getHeight()) + 2.0f * f);
        float f1 = ((float)this.b.getLeft()) - f;
        float f2 = Size.getWidth-impl(v1) + f1;
        float f3 = Size.getHeight-impl(v1);
        OutlineKt.addOutline(path1, this.a.createOutline-Pq9zytI(v1, layoutDirection0, density0));
        path1.translate-k-4lQ0M(OffsetKt.Offset(f1, -(f3 / 2.0f)));
        if(Intrinsics.areEqual(this.a, RoundedCornerShapeKt.getCircleShape())) {
            float f4 = density0.toPx-0680j_4(0.0f);
            float f5 = -((float)Math.sqrt(f3 / 2.0f * (f3 / 2.0f) - 0.0f));
            float f6 = f3 / 2.0f + f5;
            float f7 = f1 + f6;
            Pair pair0 = AppBarKt.calculateRoundedEdgeIntercept(f5 - 1.0f, 0.0f, f3 / 2.0f);
            float f8 = ((Number)pair0.component2()).floatValue();
            float f9 = ((Number)pair0.component1()).floatValue() + f3 / 2.0f;
            path1.moveTo(f7 - f4, 0.0f);
            path1.quadraticBezierTo(f7 - 1.0f, 0.0f, f1 + f9, f8 - 0.0f);
            path1.lineTo(f2 - f9, f8 - 0.0f);
            path1.quadraticBezierTo(f2 - f6 + 1.0f, 0.0f, f4 + (f2 - f6), 0.0f);
            path1.close();
        }
        path1.op-N5in7k0(path0, path1, 0);
        return new Generic(path1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b1)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((b1)object0).a) ? Intrinsics.areEqual(this.b, ((b1)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.a + ", fabPlacement=" + this.b + ')';
    }
}

