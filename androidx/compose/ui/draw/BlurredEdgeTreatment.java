package androidx.compose.ui.draw;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0012\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "", "Landroidx/compose/ui/graphics/Shape;", "shape", "constructor-impl", "(Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/graphics/Shape;", "", "toString-impl", "(Landroidx/compose/ui/graphics/Shape;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/compose/ui/graphics/Shape;)I", "hashCode", "other", "", "equals-impl", "(Landroidx/compose/ui/graphics/Shape;Ljava/lang/Object;)Z", "equals", "a", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class BlurredEdgeTreatment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001D\u0010\u0003\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u001D\u0010\u0007\u001A\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001A\u0004\b\b\u0010\u0006\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/draw/BlurredEdgeTreatment$Companion;", "", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "Rectangle", "Landroidx/compose/ui/graphics/Shape;", "getRectangle---Goahg", "()Landroidx/compose/ui/graphics/Shape;", "Unbounded", "getUnbounded---Goahg", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Shape getRectangle---Goahg() {
            return BlurredEdgeTreatment.b;
        }

        @NotNull
        public final Shape getUnbounded---Goahg() {
            return BlurredEdgeTreatment.c;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Shape a;
    public static final Shape b;
    public static final Shape c;

    static {
        BlurredEdgeTreatment.Companion = new Companion(null);
        BlurredEdgeTreatment.b = RectangleShapeKt.getRectangleShape();
        BlurredEdgeTreatment.c = null;
    }

    public BlurredEdgeTreatment(Shape shape0) {
        this.a = shape0;
    }

    public static final BlurredEdgeTreatment box-impl(Shape shape0) {
        return new BlurredEdgeTreatment(shape0);
    }

    @NotNull
    public static Shape constructor-impl(@Nullable Shape shape0) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return BlurredEdgeTreatment.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(Shape shape0, Object object0) {
        return object0 instanceof BlurredEdgeTreatment ? Intrinsics.areEqual(shape0, ((BlurredEdgeTreatment)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(Shape shape0, Shape shape1) {
        return Intrinsics.areEqual(shape0, shape1);
    }

    @Nullable
    public final Shape getShape() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return BlurredEdgeTreatment.hashCode-impl(this.a);
    }

    public static int hashCode-impl(Shape shape0) {
        return shape0 == null ? 0 : shape0.hashCode();
    }

    @Override
    public String toString() {
        return "BlurredEdgeTreatment(shape=" + this.a + ')';
    }

    public static String toString-impl(Shape shape0) [...] // Inlined contents

    public final Shape unbox-impl() {
        return this.a;
    }
}

