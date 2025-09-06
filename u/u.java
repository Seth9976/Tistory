package u;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class u extends Node implements DrawModifierNode, ObserverModifierNode {
    public long n;
    public Brush o;
    public float p;
    public Shape q;
    public long r;
    public LayoutDirection s;
    public Outline t;
    public Shape u;

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope0) {
        if(this.q == RectangleShapeKt.getRectangleShape()) {
            if(!Color.equals-impl0(this.n, 0L)) {
                DrawScope.drawRect-n-J9OG0$default(contentDrawScope0, this.n, 0L, 0L, 0.0f, null, null, 0, 0x7E, null);
            }
            Brush brush0 = this.o;
            if(brush0 != null) {
                DrawScope.drawRect-AsUm42w$default(contentDrawScope0, brush0, 0L, 0L, this.p, null, null, 0, 0x76, null);
            }
        }
        else {
            ObjectRef ref$ObjectRef0 = new ObjectRef();
            if(!Size.equals-impl0(contentDrawScope0.getSize-NH-jbRc(), this.r) || contentDrawScope0.getLayoutDirection() != this.s || !Intrinsics.areEqual(this.u, this.q)) {
                ObserverModifierNodeKt.observeReads(this, new t(ref$ObjectRef0, this, contentDrawScope0));
            }
            else {
                Outline outline0 = this.t;
                Intrinsics.checkNotNull(outline0);
                ref$ObjectRef0.element = outline0;
            }
            this.t = (Outline)ref$ObjectRef0.element;
            this.r = contentDrawScope0.getSize-NH-jbRc();
            this.s = contentDrawScope0.getLayoutDirection();
            this.u = this.q;
            Object object0 = ref$ObjectRef0.element;
            Intrinsics.checkNotNull(object0);
            if(!Color.equals-impl0(this.n, 0L)) {
                OutlineKt.drawOutline-wDX37Ww$default(contentDrawScope0, ((Outline)object0), this.n, 0.0f, null, null, 0, 60, null);
            }
            Brush brush1 = this.o;
            if(brush1 != null) {
                OutlineKt.drawOutline-hn5TExg$default(contentDrawScope0, ((Outline)object0), brush1, this.p, null, null, 0, 56, null);
            }
        }
        contentDrawScope0.drawContent();
    }

    @Override  // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        this.r = 0x7FC000007FC00000L;
        this.s = null;
        this.t = null;
        this.u = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }
}

