package androidx.compose.material.ripple;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import u0.n;
import u0.r;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u0012H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0018\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001B\u001A\u00020\u0014*\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0013\u0010\u001E\u001A\u00020\u0014*\u00020\u001DH&\u00A2\u0006\u0004\b\u001E\u0010\u001FJ*\u0010\'\u001A\u00020\u00142\u0006\u0010!\u001A\u00020 2\u0006\u0010\u0013\u001A\u00020\"2\u0006\u0010$\u001A\u00020#H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010&J\u0017\u0010(\u001A\u00020\u00142\u0006\u0010!\u001A\u00020 H&\u00A2\u0006\u0004\b(\u0010)R\u001A\u0010\b\u001A\u00020\u00078\u0004X\u0084\u0004\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R \u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r8\u0004X\u0084\u0004\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R*\u00107\u001A\u00020\"2\u0006\u00102\u001A\u00020\"8\u0004@BX\u0084\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u00106R\u001A\u00108\u001A\u00020\u00078\u0006X\u0086D\u00A2\u0006\f\n\u0004\b8\u0010+\u001A\u0004\b9\u0010-R\u0017\u0010<\u001A\u00020:8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b;\u00106\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006="}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "onAttach", "()V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawRipples", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Landroidx/compose/ui/geometry/Size;", "", "targetRadius", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "addRipple", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "o", "Z", "getBounded", "()Z", "r", "Lkotlin/jvm/functions/Function0;", "getRippleAlpha", "()Lkotlin/jvm/functions/Function0;", "<set-?>", "u", "J", "getRippleSize-NH-jbRc", "()J", "rippleSize", "shouldAutoInvalidate", "getShouldAutoInvalidate", "Landroidx/compose/ui/graphics/Color;", "getRippleColor-0d7_KjU", "rippleColor", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode\n+ 2 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,556:1\n1580#2:557\n137#3:558\n305#4,6:559\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleNode\n*L\n353#1:557\n360#1:558\n370#1:559,6\n*E\n"})
public abstract class RippleNode extends Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    public final InteractionSource n;
    public final boolean o;
    public final float p;
    public final ColorProducer q;
    public final Function0 r;
    public r s;
    public float t;
    public long u;
    public boolean v;
    public final MutableObjectList w;

    public RippleNode(InteractionSource interactionSource0, boolean z, float f, ColorProducer colorProducer0, Function0 function00, DefaultConstructorMarker defaultConstructorMarker0) {
        this.n = interactionSource0;
        this.o = z;
        this.p = f;
        this.q = colorProducer0;
        this.r = function00;
        this.u = 0L;
        this.w = new MutableObjectList(0, 1, null);
    }

    public static final boolean access$getHasValidSize$p(RippleNode rippleNode0) {
        return rippleNode0.v;
    }

    public static final MutableObjectList access$getPendingInteractions$p(RippleNode rippleNode0) {
        return rippleNode0.w;
    }

    public static final void access$handlePressInteraction(RippleNode rippleNode0, PressInteraction pressInteraction0) {
        rippleNode0.b(pressInteraction0);
    }

    public static final void access$updateStateLayer(RippleNode rippleNode0, Interaction interaction0, CoroutineScope coroutineScope0) {
        r r0 = rippleNode0.s;
        if(r0 == null) {
            r0 = new r(rippleNode0.o, rippleNode0.r);
            DrawModifierNodeKt.invalidateDraw(rippleNode0);
            rippleNode0.s = r0;
        }
        r0.b(interaction0, coroutineScope0);
    }

    public abstract void addRipple-12SF9DM(@NotNull Press arg1, long arg2, float arg3);

    public final void b(PressInteraction pressInteraction0) {
        if(pressInteraction0 instanceof Press) {
            this.addRipple-12SF9DM(((Press)pressInteraction0), this.u, this.t);
            return;
        }
        if(pressInteraction0 instanceof Release) {
            this.removeRipple(((Release)pressInteraction0).getPress());
            return;
        }
        if(pressInteraction0 instanceof Cancel) {
            this.removeRipple(((Cancel)pressInteraction0).getPress());
        }
    }

    @Override  // androidx.compose.ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope0) {
        contentDrawScope0.drawContent();
        r r0 = this.s;
        if(r0 != null) {
            r0.a(contentDrawScope0, this.t, this.getRippleColor-0d7_KjU());
        }
        this.drawRipples(contentDrawScope0);
    }

    public abstract void drawRipples(@NotNull DrawScope arg1);

    public final boolean getBounded() {
        return this.o;
    }

    @NotNull
    public final Function0 getRippleAlpha() {
        return this.r;
    }

    public final long getRippleColor-0d7_KjU() {
        return this.q.invoke-0d7_KjU();
    }

    public final long getRippleSize-NH-jbRc() {
        return this.u;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onAttach() {
        BuildersKt.launch$default(this.getCoroutineScope(), null, null, new n(this, null), 3, null);
    }

    @Override  // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onRemeasured-ozmzZPI(long v) {
        this.v = true;
        Density density0 = DelegatableNodeKt.requireDensity(this);
        this.u = IntSizeKt.toSize-ozmzZPI(v);
        this.t = Float.isNaN(this.p) ? RippleAnimationKt.getRippleEndRadius-cSwnlzA(density0, this.o, this.u) : density0.toPx-0680j_4(this.p);
        MutableObjectList mutableObjectList0 = this.w;
        Object[] arr_object = mutableObjectList0.content;
        int v1 = mutableObjectList0._size;
        for(int v2 = 0; v2 < v1; ++v2) {
            this.b(((PressInteraction)arr_object[v2]));
        }
        mutableObjectList0.clear();
    }

    public abstract void removeRipple(@NotNull Press arg1);
}

