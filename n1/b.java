package n1;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.draw.BuildDrawCacheParams;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import j0.t1;
import j2.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.a;

public final class b extends Node implements BuildDrawCacheParams, CacheDrawModifierNode, ObserverModifierNode {
    public final CacheDrawScope n;
    public boolean o;
    public h p;
    public Function1 q;

    public b(CacheDrawScope cacheDrawScope0, Function1 function10) {
        this.n = cacheDrawScope0;
        this.q = function10;
        cacheDrawScope0.setCacheParams$ui_release(this);
        cacheDrawScope0.setGraphicsContextProvider$ui_release(new j(this, 26));
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope0) {
        CacheDrawScope cacheDrawScope0 = this.n;
        if(!this.o) {
            cacheDrawScope0.setDrawResult$ui_release(null);
            cacheDrawScope0.setContentDrawScope$ui_release(contentDrawScope0);
            ObserverModifierNodeKt.observeReads(this, new t1(15, this, cacheDrawScope0));
            if(cacheDrawScope0.getDrawResult$ui_release() == null) {
                throw a.b("DrawResult not defined, did you forget to call onDraw?");
            }
            this.o = true;
        }
        DrawResult drawResult0 = cacheDrawScope0.getDrawResult$ui_release();
        Intrinsics.checkNotNull(drawResult0);
        drawResult0.getBlock$ui_release().invoke(contentDrawScope0);
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    public final Density getDensity() {
        return DelegatableNodeKt.requireDensity(this);
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    public final LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutDirection(this);
    }

    @Override  // androidx.compose.ui.draw.BuildDrawCacheParams
    public final long getSize-NH-jbRc() {
        return IntSizeKt.toSize-ozmzZPI(DelegatableNodeKt.requireCoordinator-64DMado(this, 0x80).getSize-YbymL2g());
    }

    @Override  // androidx.compose.ui.draw.CacheDrawModifierNode
    public final void invalidateDrawCache() {
        h h0 = this.p;
        if(h0 != null) {
            h0.a();
        }
        this.o = false;
        this.n.setDrawResult$ui_release(null);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final void onDetach() {
        super.onDetach();
        h h0 = this.p;
        if(h0 != null) {
            h0.a();
        }
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public final void onMeasureResultChanged() {
        this.invalidateDrawCache();
    }

    @Override  // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        this.invalidateDrawCache();
    }
}

