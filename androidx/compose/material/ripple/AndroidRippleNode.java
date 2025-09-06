package androidx.compose.material.ripple;

import android.view.View;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import u0.a;
import zd.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B¢\u0006\u0004\b\u000E\u0010\u000FJ\u0013\u0010\u0012\u001A\u00020\u0011*\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u001C\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0019\u001A\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001A\u0010\u001BJ\u0017\u0010\u001D\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010\u001F\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u001F\u0010 J\u000F\u0010!\u001A\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/material/ripple/AndroidRippleNode;", "Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/material/ripple/RippleHostKey;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "drawRipples", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Landroidx/compose/ui/geometry/Size;", "size", "", "targetRadius", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "addRipple", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "onDetach", "()V", "onResetRippleHostView", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleNode\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,381:1\n246#2:382\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleNode\n*L\n130#1:382\n*E\n"})
public final class AndroidRippleNode extends RippleNode implements RippleHostKey {
    public static final int $stable = 8;
    public RippleContainer x;
    public RippleHostView y;

    public AndroidRippleNode(InteractionSource interactionSource0, boolean z, float f, ColorProducer colorProducer0, Function0 function00, DefaultConstructorMarker defaultConstructorMarker0) {
        super(interactionSource0, z, f, colorProducer0, function00, null);
    }

    @Override  // androidx.compose.material.ripple.RippleNode
    public void addRipple-12SF9DM(@NotNull Press pressInteraction$Press0, long v, float f) {
        RippleContainer rippleContainer0 = this.x;
        if(rippleContainer0 == null) {
            rippleContainer0 = Ripple_androidKt.access$createAndAttachRippleContainerIfNeeded(Ripple_androidKt.access$findNearestViewGroup(((View)CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView()))));
            this.x = rippleContainer0;
        }
        Intrinsics.checkNotNull(rippleContainer0);
        RippleHostView rippleHostView0 = rippleContainer0.getRippleHostView(this);
        rippleHostView0.addRipple-KOepWvA(pressInteraction$Press0, this.getBounded(), v, c.roundToInt(f), this.getRippleColor-0d7_KjU(), ((RippleAlpha)this.getRippleAlpha().invoke()).getPressedAlpha(), new a(this));
        this.y = rippleHostView0;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override  // androidx.compose.material.ripple.RippleNode
    public void drawRipples(@NotNull DrawScope drawScope0) {
        Canvas canvas0 = drawScope0.getDrawContext().getCanvas();
        RippleHostView rippleHostView0 = this.y;
        if(rippleHostView0 != null) {
            rippleHostView0.setRippleProperties-07v42R4(this.getRippleSize-NH-jbRc(), this.getRippleColor-0d7_KjU(), ((RippleAlpha)this.getRippleAlpha().invoke()).getPressedAlpha());
            rippleHostView0.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas0));
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        RippleContainer rippleContainer0 = this.x;
        if(rippleContainer0 != null) {
            rippleContainer0.disposeRippleIfNeeded(this);
        }
    }

    @Override  // androidx.compose.material.ripple.RippleHostKey
    public void onResetRippleHostView() {
        this.y = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override  // androidx.compose.material.ripple.RippleNode
    public void removeRipple(@NotNull Press pressInteraction$Press0) {
        RippleHostView rippleHostView0 = this.y;
        if(rippleHostView0 != null) {
            rippleHostView0.removeRipple();
        }
    }
}

