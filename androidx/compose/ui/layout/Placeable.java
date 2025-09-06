package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\'\u0018\u00002\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000F\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0019\u0010\f\u001A\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000BH$ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ*\u0010\u000F\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u0010H\u0014ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0012R$\u0010\u0019\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00138\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R$\u0010\u001C\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00138\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u001A\u0010\u0016\u001A\u0004\b\u001B\u0010\u0018R0\u0010%\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u001D8\u0004@DX\u0084\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R0\u0010*\u001A\u00020&2\u0006\u0010\u001E\u001A\u00020&8\u0004@DX\u0084\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\'\u0010 \u001A\u0004\b(\u0010\"\"\u0004\b)\u0010$R*\u0010-\u001A\u00020\u00042\u0006\u0010\u0014\u001A\u00020\u00048\u0004@BX\u0084\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010 \u001A\u0004\b,\u0010\"R\u0014\u0010/\u001A\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b.\u0010\u0018R\u0014\u00101\u001A\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b0\u0010\u0018\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "<init>", "()V", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "", "<set-?>", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "Landroidx/compose/ui/unit/IntSize;", "value", "c", "J", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "measuredSize", "Landroidx/compose/ui/unit/Constraints;", "d", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "measurementConstraints", "e", "getApparentToRealOffset-nOcc-ac", "apparentToRealOffset", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "PlacementScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class Placeable implements Measured {
    @StabilityInferred(parameters = 0)
    @PlacementScopeMarker
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u00002\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0002\u0010\u0003J\u001B\u0010\u0007\u001A\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\u0007\u0010\bJ&\u0010\u0010\u001A\u00020\r*\u00020\t2\u0006\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\u0005\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJ+\u0010\u0010\u001A\u00020\r*\u00020\t2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u00112\b\b\u0002\u0010\f\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0010\u0010\u0014J+\u0010\u0015\u001A\u00020\r*\u00020\t2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u00112\b\b\u0002\u0010\f\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0015\u0010\u0014J&\u0010\u0015\u001A\u00020\r*\u00020\t2\u0006\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\u0005\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u000FJA\u0010\u001D\u001A\u00020\r*\u00020\t2\u0006\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\u00052\u0019\b\u0002\u0010\u001A\u001A\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017\u00A2\u0006\u0002\b\u0019\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010\u001CJF\u0010\u001D\u001A\u00020\r*\u00020\t2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u00112\b\b\u0002\u0010\f\u001A\u00020\u00052\u0019\b\u0002\u0010\u001A\u001A\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0004\b\u001D\u0010\u001EJF\u0010\u001F\u001A\u00020\r*\u00020\t2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u00112\b\b\u0002\u0010\f\u001A\u00020\u00052\u0019\b\u0002\u0010\u001A\u001A\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0004\b\u001F\u0010\u001EJA\u0010\u001F\u001A\u00020\r*\u00020\t2\u0006\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\f\u001A\u00020\u00052\u0019\b\u0002\u0010\u001A\u001A\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017\u00A2\u0006\u0002\b\u0019\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010\u001CJ3\u0010\u001F\u001A\u00020\r*\u00020\t2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u00112\u0006\u0010\"\u001A\u00020!2\b\b\u0002\u0010\f\u001A\u00020\u0005\u00A2\u0006\u0004\b\u001F\u0010#J.\u0010\u001F\u001A\u00020\r*\u00020\t2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\"\u001A\u00020!2\b\b\u0002\u0010\f\u001A\u00020\u0005\u00F8\u0001\u0000\u00A2\u0006\u0004\b \u0010$J3\u0010\u001D\u001A\u00020\r*\u00020\t2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0013\u001A\u00020\u00112\u0006\u0010\"\u001A\u00020!2\b\b\u0002\u0010\f\u001A\u00020\u0005\u00A2\u0006\u0004\b\u001D\u0010#J.\u0010\u001D\u001A\u00020\r*\u00020\t2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\"\u001A\u00020!2\b\b\u0002\u0010\f\u001A\u00020\u0005\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001B\u0010$JD\u0010&\u001A\u00020\r*\u00020\t2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00052\u001B\b\b\u0010\u001A\u001A\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0017\u00A2\u0006\u0002\b\u0019H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010\u001CJ/\u0010&\u001A\u00020\r*\u00020\t2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\"\u001A\u00020!H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b%\u0010\'JD\u0010)\u001A\u00020\r*\u00020\t2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00052\u001B\b\b\u0010\u001A\u001A\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0017\u00A2\u0006\u0002\b\u0019H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010\u001CJ/\u0010)\u001A\u00020\r*\u00020\t2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00052\u0006\u0010\"\u001A\u00020!H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b(\u0010\'J&\u0010+\u001A\u00020\r2\u0017\u0010*\u001A\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\u0017\u00A2\u0006\u0002\b\u0019\u00A2\u0006\u0004\b+\u0010,R\u0014\u0010/\u001A\u00020\u00118$X\u00A4\u0004\u00A2\u0006\u0006\u001A\u0004\b-\u0010.R\u0014\u00103\u001A\u0002008$X\u00A4\u0004\u00A2\u0006\u0006\u001A\u0004\b1\u00102R\u0016\u00107\u001A\u0004\u0018\u0001048VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b5\u00106\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00068"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "<init>", "()V", "Landroidx/compose/ui/layout/Ruler;", "", "defaultValue", "current", "(Landroidx/compose/ui/layout/Ruler;F)F", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", "position", "zIndex", "", "placeRelative-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "placeRelative", "", "x", "y", "(Landroidx/compose/ui/layout/Placeable;IIF)V", "place", "place-70tqf50", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeRelativeWithLayer", "(Landroidx/compose/ui/layout/Placeable;IIFLkotlin/jvm/functions/Function1;)V", "placeWithLayer", "placeWithLayer-aW-9-wM", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "(Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "placeAutoMirrored-aW-9-wM$ui_release", "placeAutoMirrored", "(Landroidx/compose/ui/layout/Placeable;JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeApparentToRealOffset-aW-9-wM$ui_release", "placeApparentToRealOffset", "block", "withMotionFrameOfReferencePlacement", "(Lkotlin/jvm/functions/Function1;)V", "getParentWidth", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n1#1,594:1\n452#1,2:595\n486#1,3:597\n455#1,2:600\n486#1,3:602\n461#1:605\n452#1,2:606\n486#1,3:608\n455#1,2:611\n486#1,3:613\n461#1:616\n486#1,3:617\n486#1,3:620\n452#1,2:623\n486#1,3:625\n455#1,2:628\n486#1,3:630\n461#1:633\n452#1,2:634\n486#1,3:636\n455#1,2:639\n486#1,3:641\n461#1:644\n486#1,3:645\n486#1,3:648\n496#1,3:651\n496#1,3:654\n469#1,2:657\n496#1,3:659\n472#1,2:662\n496#1,3:664\n478#1:667\n469#1,2:668\n496#1,3:670\n472#1,2:673\n496#1,3:675\n478#1:678\n486#1,3:679\n486#1,3:682\n496#1,3:685\n496#1,3:688\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n215#1:595,2\n215#1:597,3\n215#1:600,2\n215#1:602,3\n215#1:605\n233#1:606,2\n233#1:608,3\n233#1:611,2\n233#1:613,3\n233#1:616\n247#1:617,3\n260#1:620,3\n284#1:623,2\n284#1:625,3\n284#1:628,2\n284#1:630,3\n284#1:633\n310#1:634,2\n310#1:636,3\n310#1:639,2\n310#1:641,3\n310#1:644\n332#1:645,3\n352#1:648,3\n374#1:651,3\n394#1:654,3\n420#1:657,2\n420#1:659,3\n420#1:662,2\n420#1:664,3\n420#1:667\n444#1:668,2\n444#1:670,3\n444#1:673,2\n444#1:675,3\n444#1:678\n453#1:679,3\n455#1:682,3\n470#1:685,3\n472#1:688,3\n*E\n"})
    public static abstract class PlacementScope {
        public static final int $stable = 8;
        public boolean a;

        public static final void access$handleMotionFrameOfReferencePlacement(PlacementScope placeable$PlacementScope0, Placeable placeable0) {
            placeable$PlacementScope0.getClass();
            if(placeable0 instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate)placeable0).setPlacedUnderMotionFrameOfReference(placeable$PlacementScope0.a);
            }
        }

        public float current(@NotNull Ruler ruler0, float f) {
            return f;
        }

        @Nullable
        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(@NotNull Placeable placeable0, int v, int v1, float f) {
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(IntOffsetKt.IntOffset(v, v1), placeable0.e), f, null);
        }

        public static void place$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, float f, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if((v2 & 4) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.place(placeable0, v, v1, f);
        }

        public final void place-70tqf50(@NotNull Placeable placeable0, long v, float f) {
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v, placeable0.e), f, null);
        }

        public static void place-70tqf50$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, float f, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.place-70tqf50(placeable0, v, f);
        }

        public final void placeApparentToRealOffset-aW-9-wM$ui_release(@NotNull Placeable placeable0, long v, float f, @NotNull GraphicsLayer graphicsLayer0) {
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v, placeable0.e), f, graphicsLayer0);
        }

        public final void placeApparentToRealOffset-aW-9-wM$ui_release(@NotNull Placeable placeable0, long v, float f, @Nullable Function1 function10) {
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v, placeable0.e), f, function10);
        }

        public final void placeAutoMirrored-aW-9-wM$ui_release(@NotNull Placeable placeable0, long v, float f, @NotNull GraphicsLayer graphicsLayer0) {
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                int v1 = this.getParentWidth();
                PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
                placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(IntOffsetKt.IntOffset(v1 - placeable0.getWidth() - IntOffset.getX-impl(v), IntOffset.getY-impl(v)), placeable0.e), f, graphicsLayer0);
                return;
            }
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v, placeable0.e), f, graphicsLayer0);
        }

        public final void placeAutoMirrored-aW-9-wM$ui_release(@NotNull Placeable placeable0, long v, float f, @Nullable Function1 function10) {
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                int v1 = this.getParentWidth();
                PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
                placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(IntOffsetKt.IntOffset(v1 - placeable0.getWidth() - IntOffset.getX-impl(v), IntOffset.getY-impl(v)), placeable0.e), f, function10);
                return;
            }
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v, placeable0.e), f, function10);
        }

        public final void placeRelative(@NotNull Placeable placeable0, int v, int v1, float f) {
            long v2 = IntOffsetKt.IntOffset(v, v1);
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                int v3 = this.getParentWidth();
                PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
                placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(IntOffsetKt.IntOffset(v3 - placeable0.getWidth() - IntOffset.getX-impl(v2), IntOffset.getY-impl(v2)), placeable0.e), f, null);
                return;
            }
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v2, placeable0.e), f, null);
        }

        public static void placeRelative$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, float f, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if((v2 & 4) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.placeRelative(placeable0, v, v1, f);
        }

        public final void placeRelative-70tqf50(@NotNull Placeable placeable0, long v, float f) {
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                int v1 = this.getParentWidth();
                PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
                placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(IntOffsetKt.IntOffset(v1 - placeable0.getWidth() - IntOffset.getX-impl(v), IntOffset.getY-impl(v)), placeable0.e), f, null);
                return;
            }
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v, placeable0.e), f, null);
        }

        public static void placeRelative-70tqf50$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, float f, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.placeRelative-70tqf50(placeable0, v, f);
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable0, int v, int v1, float f, @NotNull Function1 function10) {
            long v2 = IntOffsetKt.IntOffset(v, v1);
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                int v3 = this.getParentWidth();
                PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
                placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(IntOffsetKt.IntOffset(v3 - placeable0.getWidth() - IntOffset.getX-impl(v2), IntOffset.getY-impl(v2)), placeable0.e), f, function10);
                return;
            }
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v2, placeable0.e), f, function10);
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable0, int v, int v1, @NotNull GraphicsLayer graphicsLayer0, float f) {
            long v2 = IntOffsetKt.IntOffset(v, v1);
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                int v3 = this.getParentWidth();
                PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
                placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(IntOffsetKt.IntOffset(v3 - placeable0.getWidth() - IntOffset.getX-impl(v2), IntOffset.getY-impl(v2)), placeable0.e), f, graphicsLayer0);
                return;
            }
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v2, placeable0.e), f, graphicsLayer0);
        }

        public static void placeRelativeWithLayer$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, float f, Function1 function10, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if((v2 & 4) != 0) {
                f = 0.0f;
            }
            if((v2 & 8) != 0) {
                function10 = PlaceableKt.a;
            }
            placeable$PlacementScope0.placeRelativeWithLayer(placeable0, v, v1, f, function10);
        }

        public static void placeRelativeWithLayer$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, GraphicsLayer graphicsLayer0, float f, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if((v2 & 8) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.placeRelativeWithLayer(placeable0, v, v1, graphicsLayer0, f);
        }

        public final void placeRelativeWithLayer-aW-9-wM(@NotNull Placeable placeable0, long v, float f, @NotNull Function1 function10) {
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                int v1 = this.getParentWidth();
                PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
                placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(IntOffsetKt.IntOffset(v1 - placeable0.getWidth() - IntOffset.getX-impl(v), IntOffset.getY-impl(v)), placeable0.e), f, function10);
                return;
            }
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v, placeable0.e), f, function10);
        }

        public final void placeRelativeWithLayer-aW-9-wM(@NotNull Placeable placeable0, long v, @NotNull GraphicsLayer graphicsLayer0, float f) {
            if(this.getParentLayoutDirection() != LayoutDirection.Ltr && this.getParentWidth() != 0) {
                int v1 = this.getParentWidth();
                PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
                placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(IntOffsetKt.IntOffset(v1 - placeable0.getWidth() - IntOffset.getX-impl(v), IntOffset.getY-impl(v)), placeable0.e), f, graphicsLayer0);
                return;
            }
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v, placeable0.e), f, graphicsLayer0);
        }

        public static void placeRelativeWithLayer-aW-9-wM$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, float f, Function1 function10, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                function10 = PlaceableKt.a;
            }
            placeable$PlacementScope0.placeRelativeWithLayer-aW-9-wM(placeable0, v, f, function10);
        }

        public static void placeRelativeWithLayer-aW-9-wM$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, GraphicsLayer graphicsLayer0, float f, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if((v1 & 4) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.placeRelativeWithLayer-aW-9-wM(placeable0, v, graphicsLayer0, f);
        }

        public final void placeWithLayer(@NotNull Placeable placeable0, int v, int v1, float f, @NotNull Function1 function10) {
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(IntOffsetKt.IntOffset(v, v1), placeable0.e), f, function10);
        }

        public final void placeWithLayer(@NotNull Placeable placeable0, int v, int v1, @NotNull GraphicsLayer graphicsLayer0, float f) {
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(IntOffsetKt.IntOffset(v, v1), placeable0.e), f, graphicsLayer0);
        }

        public static void placeWithLayer$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, float f, Function1 function10, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if((v2 & 4) != 0) {
                f = 0.0f;
            }
            if((v2 & 8) != 0) {
                function10 = PlaceableKt.a;
            }
            placeable$PlacementScope0.placeWithLayer(placeable0, v, v1, f, function10);
        }

        public static void placeWithLayer$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, int v, int v1, GraphicsLayer graphicsLayer0, float f, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if((v2 & 8) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.placeWithLayer(placeable0, v, v1, graphicsLayer0, f);
        }

        public final void placeWithLayer-aW-9-wM(@NotNull Placeable placeable0, long v, float f, @NotNull Function1 function10) {
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v, placeable0.e), f, function10);
        }

        public final void placeWithLayer-aW-9-wM(@NotNull Placeable placeable0, long v, @NotNull GraphicsLayer graphicsLayer0, float f) {
            PlacementScope.access$handleMotionFrameOfReferencePlacement(this, placeable0);
            placeable0.placeAt-f8xVGno(IntOffset.plus-qkQi6aY(v, placeable0.e), f, graphicsLayer0);
        }

        public static void placeWithLayer-aW-9-wM$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, float f, Function1 function10, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if((v1 & 2) != 0) {
                f = 0.0f;
            }
            if((v1 & 4) != 0) {
                function10 = PlaceableKt.a;
            }
            placeable$PlacementScope0.placeWithLayer-aW-9-wM(placeable0, v, f, function10);
        }

        public static void placeWithLayer-aW-9-wM$default(PlacementScope placeable$PlacementScope0, Placeable placeable0, long v, GraphicsLayer graphicsLayer0, float f, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if((v1 & 4) != 0) {
                f = 0.0f;
            }
            placeable$PlacementScope0.placeWithLayer-aW-9-wM(placeable0, v, graphicsLayer0, f);
        }

        public final void withMotionFrameOfReferencePlacement(@NotNull Function1 function10) {
            this.a = true;
            function10.invoke(this);
            this.a = false;
        }
    }

    public static final int $stable = 8;
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;

    public Placeable() {
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void b() {
        this.a = c.coerceIn(IntSize.getWidth-impl(this.c), Constraints.getMinWidth-impl(this.d), Constraints.getMaxWidth-impl(this.d));
        this.b = c.coerceIn(IntSize.getHeight-impl(this.c), Constraints.getMinHeight-impl(this.d), Constraints.getMaxHeight-impl(this.d));
        this.e = IntOffsetKt.IntOffset((this.a - IntSize.getWidth-impl(this.c)) / 2, (this.b - IntSize.getHeight-impl(this.c)) / 2);
    }

    public final long getApparentToRealOffset-nOcc-ac() {
        return this.e;
    }

    public final int getHeight() {
        return this.b;
    }

    @Override  // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.getHeight-impl(this.c);
    }

    public final long getMeasuredSize-YbymL2g() {
        return this.c;
    }

    @Override  // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.getWidth-impl(this.c);
    }

    public final long getMeasurementConstraints-msEJaDk() {
        return this.d;
    }

    public final int getWidth() {
        return this.a;
    }

    public void placeAt-f8xVGno(long v, float f, @NotNull GraphicsLayer graphicsLayer0) {
        this.placeAt-f8xVGno(v, f, null);
    }

    public abstract void placeAt-f8xVGno(long arg1, float arg2, @Nullable Function1 arg3);

    public final void setMeasuredSize-ozmzZPI(long v) {
        if(!IntSize.equals-impl0(this.c, v)) {
            this.c = v;
            this.b();
        }
    }

    public final void setMeasurementConstraints-BRTryo0(long v) {
        if(!Constraints.equals-impl0(this.d, v)) {
            this.d = v;
            this.b();
        }
    }
}

