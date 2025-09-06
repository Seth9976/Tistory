package u0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.interaction.DragInteraction.Cancel;
import androidx.compose.foundation.interaction.DragInteraction.Start;
import androidx.compose.foundation.interaction.DragInteraction.Stop;
import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.FocusInteraction.Unfocus;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.HoverInteraction.Exit;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import r0.a;

public final class r {
    public final boolean a;
    public final Function0 b;
    public final Animatable c;
    public final ArrayList d;
    public Interaction e;

    public r(boolean z, Function0 function00) {
        this.a = z;
        this.b = function00;
        this.c = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.d = new ArrayList();
    }

    public final void a(DrawScope drawScope0, float f, long v) {
        float f1 = ((Number)this.c.getValue()).floatValue();
        if(f1 > 0.0f) {
            long v1 = Color.copy-wmQWz5c$default(v, f1, 0.0f, 0.0f, 0.0f, 14, null);
            if(this.a) {
                float f2 = Size.getWidth-impl(drawScope0.getSize-NH-jbRc());
                float f3 = Size.getHeight-impl(drawScope0.getSize-NH-jbRc());
                DrawContext drawContext0 = drawScope0.getDrawContext();
                long v2 = drawContext0.getSize-NH-jbRc();
                drawContext0.getCanvas().save();
                drawContext0.getTransform().clipRect-N_I0leg(0.0f, 0.0f, f2, f3, 1);
                DrawScope.drawCircle-VaOC9Bg$default(drawScope0, v1, f, 0L, 0.0f, null, null, 0, 0x7C, null);
                a.y(drawContext0, v2);
                return;
            }
            DrawScope.drawCircle-VaOC9Bg$default(drawScope0, v1, f, 0L, 0.0f, null, null, 0, 0x7C, null);
        }
    }

    public final void b(Interaction interaction0, CoroutineScope coroutineScope0) {
        float f;
        ArrayList arrayList0 = this.d;
        if(interaction0 instanceof Enter) {
            arrayList0.add(interaction0);
            goto label_21;
        }
        else if(interaction0 instanceof Exit) {
            arrayList0.remove(((Exit)interaction0).getEnter());
            goto label_21;
        }
        else if(interaction0 instanceof Focus) {
            arrayList0.add(interaction0);
            goto label_21;
        }
        else if(interaction0 instanceof Unfocus) {
            arrayList0.remove(((Unfocus)interaction0).getFocus());
            goto label_21;
        }
        else if(interaction0 instanceof Start) {
            arrayList0.add(interaction0);
            goto label_21;
        }
        else if(interaction0 instanceof Stop) {
            arrayList0.remove(((Stop)interaction0).getStart());
            goto label_21;
        }
        else if(interaction0 instanceof Cancel) {
            arrayList0.remove(((Cancel)interaction0).getStart());
        label_21:
            Interaction interaction1 = (Interaction)CollectionsKt___CollectionsKt.lastOrNull(arrayList0);
            if(!Intrinsics.areEqual(this.e, interaction1)) {
                if(interaction1 == null) {
                    BuildersKt.launch$default(coroutineScope0, null, null, new q(this, RippleKt.access$outgoingStateLayerAnimationSpecFor(this.e), null), 3, null);
                }
                else {
                    RippleAlpha rippleAlpha0 = (RippleAlpha)this.b.invoke();
                    if(interaction0 instanceof Enter) {
                        f = rippleAlpha0.getHoveredAlpha();
                    }
                    else if(interaction0 instanceof Focus) {
                        f = rippleAlpha0.getFocusedAlpha();
                    }
                    else {
                        f = interaction0 instanceof Start ? rippleAlpha0.getDraggedAlpha() : 0.0f;
                    }
                    BuildersKt.launch$default(coroutineScope0, null, null, new p(this, f, RippleKt.access$incomingStateLayerAnimationSpecFor(interaction1), null), 3, null);
                }
                this.e = interaction1;
            }
        }
    }
}

