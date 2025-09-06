package coil.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\b\u0010\f\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001A\u00020\u0012*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000BHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001B\u001A\u00020\u001AHÖ\u0001¢\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001E\u001A\u00020\u001DHÖ\u0001¢\u0006\u0004\b\u001E\u0010\u001FJ\u001A\u0010#\u001A\u00020\"2\b\u0010!\u001A\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcoil/compose/ContentPainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcoil/compose/ContentPainterNode;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "create", "()Lcoil/compose/ContentPainterNode;", "node", "", "update", "(Lcoil/compose/ContentPainterNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)Lcoil/compose/ContentPainterElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ContentPainterElement extends ModifierNodeElement {
    public static final int $stable;
    public final Painter b;
    public final Alignment c;
    public final ContentScale d;
    public final float e;
    public final ColorFilter f;

    public ContentPainterElement(@NotNull Painter painter0, @NotNull Alignment alignment0, @NotNull ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0) {
        this.b = painter0;
        this.c = alignment0;
        this.d = contentScale0;
        this.e = f;
        this.f = colorFilter0;
    }

    @NotNull
    public final ContentPainterElement copy(@NotNull Painter painter0, @NotNull Alignment alignment0, @NotNull ContentScale contentScale0, float f, @Nullable ColorFilter colorFilter0) {
        return new ContentPainterElement(painter0, alignment0, contentScale0, f, colorFilter0);
    }

    public static ContentPainterElement copy$default(ContentPainterElement contentPainterElement0, Painter painter0, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, int v, Object object0) {
        if((v & 1) != 0) {
            painter0 = contentPainterElement0.b;
        }
        if((v & 2) != 0) {
            alignment0 = contentPainterElement0.c;
        }
        if((v & 4) != 0) {
            contentScale0 = contentPainterElement0.d;
        }
        if((v & 8) != 0) {
            f = contentPainterElement0.e;
        }
        if((v & 16) != 0) {
            colorFilter0 = contentPainterElement0.f;
        }
        return contentPainterElement0.copy(painter0, alignment0, contentScale0, f, colorFilter0);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node create() {
        return this.create();
    }

    @NotNull
    public ContentPainterNode create() {
        return new ContentPainterNode(this.b, this.c, this.d, this.e, this.f);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ContentPainterElement)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((ContentPainterElement)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((ContentPainterElement)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((ContentPainterElement)object0).d)) {
            return false;
        }
        return Float.compare(this.e, ((ContentPainterElement)object0).e) == 0 ? Intrinsics.areEqual(this.f, ((ContentPainterElement)object0).f) : false;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = a.b(this.e, (this.d.hashCode() + (this.c.hashCode() + this.b.hashCode() * 0x1F) * 0x1F) * 0x1F, 0x1F);
        return this.f == null ? v : v + this.f.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo0) {
        inspectorInfo0.setName("content");
        inspectorInfo0.getProperties().set("painter", this.b);
        inspectorInfo0.getProperties().set("alignment", this.c);
        inspectorInfo0.getProperties().set("contentScale", this.d);
        inspectorInfo0.getProperties().set("alpha", this.e);
        inspectorInfo0.getProperties().set("colorFilter", this.f);
    }

    @Override
    @NotNull
    public String toString() {
        return "ContentPainterElement(painter=" + this.b + ", alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.e + ", colorFilter=" + this.f + ')';
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void update(Node modifier$Node0) {
        this.update(((ContentPainterNode)modifier$Node0));
    }

    public void update(@NotNull ContentPainterNode contentPainterNode0) {
        boolean z = Size.equals-impl0(contentPainterNode0.getPainter().getIntrinsicSize-NH-jbRc(), this.b.getIntrinsicSize-NH-jbRc());
        contentPainterNode0.setPainter(this.b);
        contentPainterNode0.setAlignment(this.c);
        contentPainterNode0.setContentScale(this.d);
        contentPainterNode0.setAlpha(this.e);
        contentPainterNode0.setColorFilter(this.f);
        if(!z) {
            LayoutModifierNodeKt.invalidateMeasurement(contentPainterNode0);
        }
        DrawModifierNodeKt.invalidateDraw(contentPainterNode0);
    }
}

