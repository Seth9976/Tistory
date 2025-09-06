package androidx.compose.foundation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001F\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0013\u0010\u0012\u001A\u00020\u000E*\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0016\u001A\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001A\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001AJ1\u0010\u001D\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u0007HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001F\u001A\u00020\u001EHÖ\u0001¢\u0006\u0004\b\u001F\u0010 J\u0010\u0010\"\u001A\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001A\u0010\'\u001A\u00020&2\b\u0010%\u001A\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b\'\u0010(R\u001D\u0010\u0004\u001A\u00020\u00038\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010\u0015R\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010\u0018R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u0010\u001A\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u00062"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/unit/Dp;", "width", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/graphics/Shape;", "shape", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/foundation/BorderModifierNode;", "node", "", "update", "(Landroidx/compose/foundation/BorderModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1-D9Ej5fM", "()F", "component1", "component2", "()Landroidx/compose/ui/graphics/Brush;", "component3", "()Landroidx/compose/ui/graphics/Shape;", "copy-8Feqmps", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/foundation/BorderModifierNodeElement;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getWidth-D9Ej5fM", "c", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "d", "Landroidx/compose/ui/graphics/Shape;", "getShape", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BorderModifierNodeElement extends ModifierNodeElement {
    public static final int $stable;
    public final float b;
    public final Brush c;
    public final Shape d;

    public BorderModifierNodeElement(float f, Brush brush0, Shape shape0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.b = f;
        this.c = brush0;
        this.d = shape0;
    }

    public final float component1-D9Ej5fM() {
        return this.b;
    }

    @NotNull
    public final Brush component2() {
        return this.c;
    }

    @NotNull
    public final Shape component3() {
        return this.d;
    }

    @NotNull
    public final BorderModifierNodeElement copy-8Feqmps(float f, @NotNull Brush brush0, @NotNull Shape shape0) {
        return new BorderModifierNodeElement(f, brush0, shape0, null);
    }

    public static BorderModifierNodeElement copy-8Feqmps$default(BorderModifierNodeElement borderModifierNodeElement0, float f, Brush brush0, Shape shape0, int v, Object object0) {
        if((v & 1) != 0) {
            f = borderModifierNodeElement0.b;
        }
        if((v & 2) != 0) {
            brush0 = borderModifierNodeElement0.c;
        }
        if((v & 4) != 0) {
            shape0 = borderModifierNodeElement0.d;
        }
        return borderModifierNodeElement0.copy-8Feqmps(f, brush0, shape0);
    }

    @NotNull
    public BorderModifierNode create() {
        return new BorderModifierNode(this.b, this.c, this.d, null);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BorderModifierNodeElement)) {
            return false;
        }
        if(!Dp.equals-impl0(this.b, ((BorderModifierNodeElement)object0).b)) {
            return false;
        }
        return Intrinsics.areEqual(this.c, ((BorderModifierNodeElement)object0).c) ? Intrinsics.areEqual(this.d, ((BorderModifierNodeElement)object0).d) : false;
    }

    @NotNull
    public final Brush getBrush() {
        return this.c;
    }

    @NotNull
    public final Shape getShape() {
        return this.d;
    }

    public final float getWidth-D9Ej5fM() {
        return this.b;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + Dp.hashCode-impl(this.b) * 0x1F) * 0x1F;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("border");
        inspectorInfo0.getProperties().set("width", Dp.box-impl(this.b));
        Brush brush0 = this.c;
        if(brush0 instanceof SolidColor) {
            inspectorInfo0.getProperties().set("color", Color.box-impl(((SolidColor)brush0).getValue-0d7_KjU()));
            inspectorInfo0.setValue(Color.box-impl(((SolidColor)brush0).getValue-0d7_KjU()));
        }
        else {
            inspectorInfo0.getProperties().set("brush", brush0);
        }
        inspectorInfo0.getProperties().set("shape", this.d);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("BorderModifierNodeElement(width=");
        a.u(this.b, ", brush=", stringBuilder0);
        stringBuilder0.append(this.c);
        stringBuilder0.append(", shape=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }

    public void update(@NotNull BorderModifierNode borderModifierNode0) {
        borderModifierNode0.setWidth-0680j_4(this.b);
        borderModifierNode0.setBrush(this.c);
        borderModifierNode0.setShape(this.d);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((BorderModifierNode)modifier$Node0));
    }
}

