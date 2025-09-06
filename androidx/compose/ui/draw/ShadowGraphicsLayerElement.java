package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m0.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001A\u00020\u0011*\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001A\u001A\u00020\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0016\u0010 \u001A\u00020\tH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0016\u0010\"\u001A\u00020\tH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010\u001FJE\u0010%\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\tH\u00C6\u0001\u00F8\u0001\u0001\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010\'\u001A\u00020&H\u00D6\u0001\u00A2\u0006\u0004\b\'\u0010(J\u0010\u0010*\u001A\u00020)H\u00D6\u0001\u00A2\u0006\u0004\b*\u0010+J\u001A\u0010.\u001A\u00020\u00072\b\u0010-\u001A\u0004\u0018\u00010,H\u00D6\u0003\u00A2\u0006\u0004\b.\u0010/R\u001D\u0010\u0004\u001A\u00020\u00038\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u0010\u0018R\u0017\u0010\u0006\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u0010\u001BR\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u0010\u001DR\u001D\u0010\n\u001A\u00020\t8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b9\u0010:\u001A\u0004\b;\u0010\u001FR\u001D\u0010\u000B\u001A\u00020\t8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b<\u0010:\u001A\u0004\b=\u0010\u001F\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006>"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "Landroidx/compose/ui/unit/Dp;", "elevation", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/Color;", "ambientColor", "spotColor", "<init>", "(FLandroidx/compose/ui/graphics/Shape;ZJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "node", "", "update", "(Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "component1-D9Ej5fM", "()F", "component1", "component2", "()Landroidx/compose/ui/graphics/Shape;", "component3", "()Z", "component4-0d7_KjU", "()J", "component4", "component5-0d7_KjU", "component5", "copy-gNMxBKI", "(FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getElevation-D9Ej5fM", "c", "Landroidx/compose/ui/graphics/Shape;", "getShape", "d", "Z", "getClip", "e", "J", "getAmbientColor-0d7_KjU", "f", "getSpotColor-0d7_KjU", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ShadowGraphicsLayerElement extends ModifierNodeElement {
    public static final int $stable;
    public final float b;
    public final Shape c;
    public final boolean d;
    public final long e;
    public final long f;

    public ShadowGraphicsLayerElement(float f, Shape shape0, boolean z, long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this.b = f;
        this.c = shape0;
        this.d = z;
        this.e = v;
        this.f = v1;
    }

    public final float component1-D9Ej5fM() {
        return this.b;
    }

    @NotNull
    public final Shape component2() {
        return this.c;
    }

    public final boolean component3() {
        return this.d;
    }

    public final long component4-0d7_KjU() {
        return this.e;
    }

    public final long component5-0d7_KjU() {
        return this.f;
    }

    @NotNull
    public final ShadowGraphicsLayerElement copy-gNMxBKI(float f, @NotNull Shape shape0, boolean z, long v, long v1) {
        return new ShadowGraphicsLayerElement(f, shape0, z, v, v1, null);
    }

    public static ShadowGraphicsLayerElement copy-gNMxBKI$default(ShadowGraphicsLayerElement shadowGraphicsLayerElement0, float f, Shape shape0, boolean z, long v, long v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            f = shadowGraphicsLayerElement0.b;
        }
        if((v2 & 2) != 0) {
            shape0 = shadowGraphicsLayerElement0.c;
        }
        if((v2 & 4) != 0) {
            z = shadowGraphicsLayerElement0.d;
        }
        if((v2 & 8) != 0) {
            v = shadowGraphicsLayerElement0.e;
        }
        if((v2 & 16) != 0) {
            v1 = shadowGraphicsLayerElement0.f;
        }
        return shadowGraphicsLayerElement0.copy-gNMxBKI(f, shape0, z, v, v1);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @NotNull
    public BlockGraphicsLayerModifier create() {
        return new BlockGraphicsLayerModifier(new b0(this, 3));
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        if(!Dp.equals-impl0(this.b, ((ShadowGraphicsLayerElement)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((ShadowGraphicsLayerElement)object0).c)) {
            return false;
        }
        if(this.d != ((ShadowGraphicsLayerElement)object0).d) {
            return false;
        }
        return Color.equals-impl0(this.e, ((ShadowGraphicsLayerElement)object0).e) ? Color.equals-impl0(this.f, ((ShadowGraphicsLayerElement)object0).f) : false;
    }

    public final long getAmbientColor-0d7_KjU() {
        return this.e;
    }

    public final boolean getClip() {
        return this.d;
    }

    public final float getElevation-D9Ej5fM() {
        return this.b;
    }

    @NotNull
    public final Shape getShape() {
        return this.c;
    }

    public final long getSpotColor-0d7_KjU() {
        return this.f;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Color.hashCode-impl(this.f) + a.a(this.e, r0.a.e((this.c.hashCode() + Dp.hashCode-impl(this.b) * 0x1F) * 0x1F, 0x1F, this.d), 0x1F);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("shadow");
        r0.a.j(this.b, inspectorInfo0.getProperties(), "elevation", inspectorInfo0).set("shape", this.c);
        r0.a.k(this.d, inspectorInfo0.getProperties(), "clip", inspectorInfo0).set("ambientColor", Color.box-impl(this.e));
        inspectorInfo0.getProperties().set("spotColor", Color.box-impl(this.f));
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        r0.a.u(this.b, ", shape=", stringBuilder0);
        stringBuilder0.append(this.c);
        stringBuilder0.append(", clip=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", ambientColor=");
        r0.a.x(this.e, ", spotColor=", stringBuilder0);
        stringBuilder0.append(Color.toString-impl(this.f));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((BlockGraphicsLayerModifier)modifier$Node0));
    }

    public void update(@NotNull BlockGraphicsLayerModifier blockGraphicsLayerModifier0) {
        blockGraphicsLayerModifier0.setLayerBlock(new b0(this, 3));
        blockGraphicsLayerModifier0.invalidateLayerBlock();
    }
}

