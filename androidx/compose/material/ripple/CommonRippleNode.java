package androidx.compose.material.ripple;

import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import u0.d;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\n¢\u0006\u0004\b\r\u0010\u000EJ*\u0010\u0018\u001A\u00020\u00152\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001A\u00020\u00152\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0019\u0010\u001AJ\u0013\u0010\u001C\u001A\u00020\u0015*\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u001E\u0010\u001F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material/ripple/CommonRippleNode;", "Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Landroidx/compose/ui/geometry/Size;", "size", "", "targetRadius", "", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "addRipple", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawRipples", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "onDetach", "()V", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleNode\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,185:1\n391#2,4:186\n363#2,6:190\n373#2,3:197\n376#2,2:201\n396#2,2:203\n379#2,6:205\n398#2:211\n391#2,4:212\n363#2,6:216\n373#2,3:223\n376#2,2:227\n396#2,2:229\n379#2,6:231\n398#2:237\n1810#3:196\n1672#3:200\n1810#3:222\n1672#3:226\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleNode\n*L\n78#1:186,4\n78#1:190,6\n78#1:197,3\n78#1:201,2\n78#1:203,2\n78#1:205,6\n78#1:211\n104#1:212,4\n104#1:216,6\n104#1:223,3\n104#1:227,2\n104#1:229,2\n104#1:231,6\n104#1:237\n78#1:196\n78#1:200\n104#1:222\n104#1:226\n*E\n"})
public final class CommonRippleNode extends RippleNode {
    public static final int $stable = 8;
    public final MutableScatterMap x;

    public CommonRippleNode(InteractionSource interactionSource0, boolean z, float f, ColorProducer colorProducer0, Function0 function00, DefaultConstructorMarker defaultConstructorMarker0) {
        super(interactionSource0, z, f, colorProducer0, function00, null);
        this.x = new MutableScatterMap(0, 1, null);
    }

    @Override  // androidx.compose.material.ripple.RippleNode
    public void addRipple-12SF9DM(@NotNull Press pressInteraction$Press0, long v, float f) {
        MutableScatterMap mutableScatterMap0 = this.x;
        Object[] arr_object = mutableScatterMap0.keys;
        Object[] arr_object1 = mutableScatterMap0.values;
        long[] arr_v = mutableScatterMap0.metadata;
        int v1 = arr_v.length - 2;
        if(v1 >= 0) {
            int v2 = 0;
            while(true) {
                long v3 = arr_v[v2];
                if((~v3 << 7 & v3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v4 = 8 - (~(v2 - v1) >>> 0x1F);
                    for(int v5 = 0; v5 < v4; ++v5) {
                        if((0xFFL & v3) < 0x80L) {
                            int v6 = (v2 << 3) + v5;
                            Object object0 = arr_object[v6];
                            RippleAnimation rippleAnimation0 = (RippleAnimation)arr_object1[v6];
                            Press pressInteraction$Press1 = (Press)object0;
                            rippleAnimation0.finish();
                        }
                        v3 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_22;
                    }
                    break;
                }
            label_22:
                if(v2 == v1) {
                    break;
                }
                ++v2;
            }
        }
        RippleAnimation rippleAnimation1 = new RippleAnimation((this.getBounded() ? Offset.box-impl(pressInteraction$Press0.getPressPosition-F1C5BW0()) : null), f, this.getBounded(), null);
        mutableScatterMap0.set(pressInteraction$Press0, rippleAnimation1);
        BuildersKt.launch$default(this.getCoroutineScope(), null, null, new d(rippleAnimation1, this, pressInteraction$Press0, null), 3, null);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override  // androidx.compose.material.ripple.RippleNode
    public void drawRipples(@NotNull DrawScope drawScope0) {
        float f2;
        float f1;
        int v8;
        int v7;
        float f = ((RippleAlpha)this.getRippleAlpha().invoke()).getPressedAlpha();
        if(f != 0.0f) {
            Object[] arr_object = this.x.keys;
            Object[] arr_object1 = this.x.values;
            long[] arr_v = this.x.metadata;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        f2 = f;
                    }
                    else {
                        int v3 = 8 - (~(v1 - v) >>> 0x1F);
                        long v4 = v2;
                        int v5 = 0;
                        while(v5 < v3) {
                            if((v4 & 0xFFL) < 0x80L) {
                                int v6 = (v1 << 3) + v5;
                                Object object0 = arr_object[v6];
                                RippleAnimation rippleAnimation0 = (RippleAnimation)arr_object1[v6];
                                Press pressInteraction$Press0 = (Press)object0;
                                v7 = v5;
                                v8 = v3;
                                f1 = f;
                                rippleAnimation0.draw-4WTKRHQ(drawScope0, Color.copy-wmQWz5c$default(this.getRippleColor-0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null));
                            }
                            else {
                                f1 = f;
                                v7 = v5;
                                v8 = v3;
                            }
                            v4 >>= 8;
                            v5 = v7 + 1;
                            f = f1;
                            v3 = v8;
                        }
                        f2 = f;
                        if(v3 != 8) {
                            break;
                        }
                    }
                    if(v1 == v) {
                        break;
                    }
                    ++v1;
                    f = f2;
                }
            }
        }
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void onDetach() {
        this.x.clear();
    }

    @Override  // androidx.compose.material.ripple.RippleNode
    public void removeRipple(@NotNull Press pressInteraction$Press0) {
        RippleAnimation rippleAnimation0 = (RippleAnimation)this.x.get(pressInteraction$Press0);
        if(rippleAnimation0 != null) {
            rippleAnimation0.finish();
        }
    }
}

