package androidx.compose.foundation.text.selection;

import aa.l;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationInstance;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.TabRowKt.ScrollableTabRowImpl.1.scope.1.1;
import androidx.compose.material3.TabRowKt.TabRowImpl.1.scope.1.1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.input.pointer.RequestDisallowInterceptTouchEvent;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.navigation.NavType;
import androidx.navigation.serialization.RouteBuilder;
import androidx.room.a;
import com.kakao.kandinsky.crop.CropScreenKt;
import com.kakao.kandinsky.crop.ui.CropBoxKt;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt.byOrientation.3.WhenMappings;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import u.h2;
import va.v;

public final class w0 extends Lambda implements Function3 {
    public final int w;
    public final Object x;
    public final Object y;

    public w0(int v, Object object0, Object object1) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        super(3);
    }

    public w0(int v, Object object0, Function1 function10) {
        this.w = v;
        this.y = function10;
        this.x = object0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Modifier modifier2;
        Object object4;
        switch(this.w) {
            case 0: {
                Modifier modifier0 = (Modifier)object0;
                int v2 = ((Number)object2).intValue();
                ((Composer)object1).startReplaceGroup(0x2D4ACC1B);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x2D4ACC1B, v2, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
                }
                State state1 = SelectionMagnifierKt.access$rememberAnimatedMagnifierPosition(((Function0)this.x), ((Composer)object1), 0);
                boolean z10 = ((Composer)object1).changed(state1);
                l l0 = ((Composer)object1).rememberedValue();
                if(z10 || l0 == Composer.Companion.getEmpty()) {
                    l0 = new l(state1, 2);
                    ((Composer)object1).updateRememberedValue(l0);
                }
                Modifier modifier1 = (Modifier)((Function1)this.y).invoke(l0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier1;
            }
            case 1: {
                boolean z11 = ((Boolean)object0).booleanValue();
                int v3 = ((Number)object2).intValue();
                if((v3 & 6) == 0) {
                    v3 |= (((Composer)object1).changed(z11) ? 4 : 2);
                }
                if((v3 & 19) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xAEA5AE6D, v3, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:582)");
                }
                if(z11) {
                    ((Composer)object1).startReplaceGroup(94251810);
                    object4 = this.x;
                }
                else {
                    ((Composer)object1).startReplaceGroup(0x59E2DC4);
                    object4 = this.y;
                }
                ((Function2)object4).invoke(((Composer)object1), 0);
                ((Composer)object1).endReplaceGroup();
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                Constraints constraints0 = Constraints.box-impl(((Constraints)object2).unbox-impl());
                Object object5 = ((TabRowKt.ScrollableTabRowImpl.1.scope.1.1)this.y).getTabPositions().getValue();
                return (MeasureResult)((Function4)this.x).invoke(((MeasureScope)object0), ((Measurable)object1), constraints0, object5);
            }
            case 3: {
                Constraints constraints1 = Constraints.box-impl(((Constraints)object2).unbox-impl());
                Object object6 = ((TabRowKt.TabRowImpl.1.scope.1.1)this.y).getTabPositions().getValue();
                return (MeasureResult)((Function4)this.x).invoke(((MeasureScope)object0), ((Measurable)object1), constraints1, object6);
            }
            case 4: {
                int v4 = ((Number)object2).intValue();
                Intrinsics.checkNotNullParameter(((AnimatedVisibilityScope)object0), "$this$AnimatedVisibility");
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(360169814, v4, -1, "com.kakao.kandinsky.designsystem.common.ItemSlider.<anonymous>.<anonymous> (ItemSlider.kt:136)");
                }
                Integer integer0 = ((PagerState)this.x).getCurrentPage();
                Object object7 = ((Function1)this.y).invoke(integer0);
                if(((String)object7).length() <= 0) {
                    object7 = null;
                }
                if(((String)object7) != null) {
                    ItemSliderKt.access$ToastMessage(((AnimatedVisibilityScope)object0), ((String)object7), ((Composer)object1), 8);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                int v5 = a.c(((Number)object2), ((Modifier)object0), "$this$composed", ((Composer)object1), 0x340526ED);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x340526ED, v5, -1, "com.kakao.kandinsky.designsystem.theme.byOrientation.<anonymous> (Orientation.kt:27)");
                }
                switch(OrientationKt.byOrientation.3.WhenMappings.$EnumSwitchMapping$0[((Orientation)((Composer)object1).consume(OrientationKt.getLocalOrientation())).ordinal()]) {
                    case 1: {
                        ((Composer)object1).startReplaceGroup(0x4833EF9D);
                        modifier2 = (Modifier)((Function3)this.x).invoke(((Modifier)object0), ((Composer)object1), ((int)(v5 & 14)));
                        ((Composer)object1).endReplaceGroup();
                        break;
                    }
                    case 2: {
                        ((Composer)object1).startReplaceGroup(0x4833EFCE);
                        modifier2 = (Modifier)((Function3)this.y).invoke(((Modifier)object0), ((Composer)object1), ((int)(v5 & 14)));
                        ((Composer)object1).endReplaceGroup();
                        break;
                    }
                    default: {
                        ((Composer)object1).startReplaceGroup(0x4833EBF7);
                        ((Composer)object1).endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier2;
            }
            case 6: {
                Intrinsics.checkNotNullParameter(((String)object1), "argName");
                Intrinsics.checkNotNullParameter(((NavType)object2), "navType");
                Object object8 = ((Map)this.x).get(((String)object1));
                Intrinsics.checkNotNull(object8);
                ((RouteBuilder)this.y).appendArg(((Number)object0).intValue(), ((String)object1), ((NavType)object2), ((List)object8));
                return Unit.INSTANCE;
            }
            case 7: {
                Modifier modifier3 = (Modifier)object0;
                int v6 = ((Number)object2).intValue();
                ((Composer)object1).startReplaceGroup(0xEAE6CFBB);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xEAE6CFBB, v6, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:182)");
                }
                IndicationInstance indicationInstance0 = ((Indication)this.x).rememberUpdatedInstance(((InteractionSource)this.y), ((Composer)object1), 0);
                boolean z12 = ((Composer)object1).changed(indicationInstance0);
                h2 h20 = ((Composer)object1).rememberedValue();
                if(z12 || h20 == Composer.Companion.getEmpty()) {
                    h20 = new h2(indicationInstance0);
                    ((Composer)object1).updateRememberedValue(h20);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return h20;
            }
            case 8: {
                ColumnScope columnScope0 = (ColumnScope)object0;
                int v7 = ((Number)object2).intValue();
                if((v7 & 17) == 16 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x44F1A924, v7, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous>.<anonymous> (ContextMenuUi.android.kt:128)");
                }
                ContextMenuScope contextMenuScope0 = ((Composer)object1).rememberedValue();
                if(contextMenuScope0 == Composer.Companion.getEmpty()) {
                    contextMenuScope0 = new ContextMenuScope();
                    ((Composer)object1).updateRememberedValue(contextMenuScope0);
                }
                contextMenuScope0.clear$foundation_release();
                ((Function1)this.y).invoke(contextMenuScope0);
                contextMenuScope0.Content$foundation_release(((ContextMenuColors)this.x), ((Composer)object1), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 9: {
                Modifier modifier4 = (Modifier)object0;
                int v8 = ((Number)object2).intValue();
                ((Composer)object1).startReplaceGroup(0x1650851B);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x1650851B, v8, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
                }
                PointerInteropFilter pointerInteropFilter0 = ((Composer)object1).rememberedValue();
                if(pointerInteropFilter0 == Composer.Companion.getEmpty()) {
                    pointerInteropFilter0 = new PointerInteropFilter();
                    ((Composer)object1).updateRememberedValue(pointerInteropFilter0);
                }
                pointerInteropFilter0.setOnTouchEvent(((Function1)this.y));
                pointerInteropFilter0.setRequestDisallowInterceptTouchEvent(((RequestDisallowInterceptTouchEvent)this.x));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return pointerInteropFilter0;
            }
            default: {
                Composer composer0 = (Composer)object1;
                int v = ((Number)object2).intValue();
                Intrinsics.checkNotNullParameter(((AnimatedVisibilityScope)object0), "$this$AnimatedVisibility");
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1520309299, v, -1, "com.kakao.kandinsky.crop.CropScreen.<anonymous> (CropScreen.kt:49)");
                }
                State state0 = (State)this.x;
                Rect rect0 = CropScreenKt.access$CropScreen$lambda$0(state0).getDraggingRubberRect();
                if(rect0 == null) {
                    rect0 = CropScreenKt.access$CropScreen$lambda$0(state0).getDraggingCropRect();
                }
                Object object3 = AnimateAsStateKt.animateRectAsState(rect0, null, "", null, composer0, 0x180, 10).getValue();
                boolean z = CropScreenKt.access$CropScreen$lambda$0(state0).getShowGuideLine();
                boolean z1 = CropScreenKt.access$CropScreen$lambda$0(state0).getEnabledDrag();
                composer0.startReplaceGroup(979803901);
                Function1 function10 = (Function1)this.y;
                boolean z2 = composer0.changed(function10);
                boolean z3 = composer0.changed(state0);
                x9.a a0 = composer0.rememberedValue();
                if(z2 || z3 || a0 == Composer.Companion.getEmpty()) {
                    a0 = new x9.a(function10, state0, 0);
                    composer0.updateRememberedValue(a0);
                }
                composer0.endReplaceGroup();
                Function1 function11 = FunctionStateKt.skippableLambda(a0, composer0, 0);
                composer0.startReplaceGroup(979804045);
                boolean z4 = composer0.changed(function10);
                boolean z5 = composer0.changed(state0);
                x9.a a1 = composer0.rememberedValue();
                if(z4 || z5 || a1 == Composer.Companion.getEmpty()) {
                    a1 = new x9.a(function10, state0, 1);
                    composer0.updateRememberedValue(a1);
                }
                composer0.endReplaceGroup();
                Function1 function12 = FunctionStateKt.skippableLambda(a1, composer0, 0);
                composer0.startReplaceGroup(0x3A66A021);
                boolean z6 = composer0.changed(function10);
                boolean z7 = composer0.changed(state0);
                v v1 = composer0.rememberedValue();
                if(z6 || z7 || v1 == Composer.Companion.getEmpty()) {
                    v1 = new v(function10, state0);
                    composer0.updateRememberedValue(v1);
                }
                composer0.endReplaceGroup();
                Function2 function20 = FunctionStateKt.skippableLambda(v1, composer0, 0);
                composer0.startReplaceGroup(0x3A66A0DA);
                boolean z8 = composer0.changed(function10);
                boolean z9 = composer0.changed(state0);
                p9.a a2 = composer0.rememberedValue();
                if(z8 || z9 || a2 == Composer.Companion.getEmpty()) {
                    a2 = new p9.a(13, function10, state0);
                    composer0.updateRememberedValue(a2);
                }
                composer0.endReplaceGroup();
                CropBoxKt.CropBox(((Rect)object3), z, z1, function11, function12, function20, FunctionStateKt.skippableLambda(a2, composer0, 0), composer0, 0, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

