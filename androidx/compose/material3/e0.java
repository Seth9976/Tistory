package androidx.compose.material3;

import aa.o;
import aa.r;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.OnLookaheadMeasured;
import androidx.compose.animation.SharedTransitionScopeImpl;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition.Segment;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavType;
import androidx.navigation.serialization.RouteBuilder;
import com.google.accompanist.navigation.material.BottomSheetNavigator;
import com.google.accompanist.navigation.material.SheetContentHostKt;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.core.kdphoto.Text;
import com.kakao.kandinsky.signature.ui.SignatureDecorationKt;
import com.kakao.kandinsky.text.ui.TextDecorationKt;
import com.kakao.kandinsky.textedit.contract.FontData;
import j0.j3;
import j0.k3;
import j0.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.MutexImpl;
import n6.b;
import n6.d;
import s.f;
import s.l1;
import s.p;
import zd.c;

public final class e0 extends Lambda implements Function3 {
    public final int w;
    public final Object x;

    public e0(Object object0, int v) {
        this.w = v;
        this.x = object0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        BottomAppBarState bottomAppBarState0 = null;
        int v = 2;
        Object object3 = this.x;
        switch(this.w) {
            case 0: {
                long v1 = ((Constraints)object2).unbox-impl();
                if(((BottomAppBarScrollBehavior)object3) != null) {
                    bottomAppBarState0 = ((BottomAppBarScrollBehavior)object3).getState();
                }
                if(bottomAppBarState0 != null) {
                    bottomAppBarState0.setHeightOffsetLimit(-((MeasureScope)object0).toPx-0680j_4(0.0f));
                }
                Placeable placeable0 = ((Measurable)object1).measure-BRTryo0(v1);
                float f = (float)placeable0.getHeight();
                if(((BottomAppBarScrollBehavior)object3) != null) {
                    BottomAppBarState bottomAppBarState1 = ((BottomAppBarScrollBehavior)object3).getState();
                    return bottomAppBarState1 == null ? MeasureScope.layout$default(((MeasureScope)object0), placeable0.getWidth(), c.roundToInt(f + 0.0f), null, new d0(placeable0), 4, null) : MeasureScope.layout$default(((MeasureScope)object0), placeable0.getWidth(), c.roundToInt(f + bottomAppBarState1.getHeightOffset()), null, new d0(placeable0), 4, null);
                }
                return MeasureScope.layout$default(((MeasureScope)object0), placeable0.getWidth(), c.roundToInt(f + 0.0f), null, new d0(placeable0), 4, null);
            }
            case 1: {
                BoxScope boxScope0 = (BoxScope)object0;
                int v2 = ((Number)object2).intValue();
                if((v2 & 17) == 16 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xAE9B3E61, v2, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                }
                ((ComposableLambda)object3).invoke(((Composer)object1), 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                int v3 = ((Number)object2).intValue();
                ((Composer)object1).startReplaceGroup(-1498516085);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1498516085, v3, -1, "androidx.compose.material3.animateTooltip.<anonymous> (Tooltip.kt:584)");
                }
                FloatCompanionObject floatCompanionObject0 = FloatCompanionObject.INSTANCE;
                TwoWayConverter twoWayConverter0 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
                boolean z = ((Boolean)((Transition)object3).getCurrentState()).booleanValue();
                ((Composer)object1).startReplaceGroup(0xA36992EF);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xA36992EF, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:603)");
                }
                float f1 = 0.8f;
                float f2 = 1.0f;
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                Float float0 = (float)(z ? 1.0f : 0.8f);
                boolean z1 = ((Boolean)((Transition)object3).getTargetState()).booleanValue();
                ((Composer)object1).startReplaceGroup(0xA36992EF);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xA36992EF, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:603)");
                }
                if(z1) {
                    f1 = 1.0f;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                Segment transition$Segment0 = ((Transition)object3).getSegment();
                State state0 = TransitionKt.createTransitionAnimation(((Transition)object3), float0, f1, ((FiniteAnimationSpec)zq.w.invoke(transition$Segment0, ((Composer)object1), 0)), twoWayConverter0, "tooltip transition: scaling", ((Composer)object1), 0x30000);
                TwoWayConverter twoWayConverter1 = VectorConvertersKt.getVectorConverter(floatCompanionObject0);
                boolean z2 = ((Boolean)((Transition)object3).getCurrentState()).booleanValue();
                ((Composer)object1).startReplaceGroup(2073045083);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:619)");
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                Float float1 = (float)(z2 ? 1.0f : 0.0f);
                boolean z3 = ((Boolean)((Transition)object3).getTargetState()).booleanValue();
                ((Composer)object1).startReplaceGroup(2073045083);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2073045083, 0, -1, "androidx.compose.material3.animateTooltip.<anonymous>.<anonymous> (Tooltip.kt:619)");
                }
                if(!z3) {
                    f2 = 0.0f;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                Segment transition$Segment1 = ((Transition)object3).getSegment();
                State state1 = TransitionKt.createTransitionAnimation(((Transition)object3), float1, f2, ((FiniteAnimationSpec)yq.w.invoke(transition$Segment1, ((Composer)object1), 0)), twoWayConverter1, "tooltip transition: alpha", ((Composer)object1), 0x30000);
                Modifier modifier0 = GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(((Modifier)object0), ((Number)state0.getValue()).floatValue(), ((Number)state0.getValue()).floatValue(), ((Number)state1.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFF8, null);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ((Composer)object1).endReplaceGroup();
                return modifier0;
            }
            case 3: {
                long v4 = ((Size)object0).unbox-impl();
                int v5 = ((Number)object2).intValue();
                if((v5 & 14) == 0) {
                    if(((Composer)object1).changed(v4)) {
                        v = 4;
                    }
                    v5 |= v;
                }
                if((v5 & 91) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x5AEAEA9A, v5, -1, "com.kakao.kandinsky.text.ui.TextDecoration.<anonymous> (TextDecoration.kt:41)");
                }
                TextDecorationKt.TextDecoration-x_KDEd0(((Text)object3).getTextData(), v4, ((Composer)object1), v5 << 3 & 0x70);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 4: {
                SelectInstance selectInstance0 = (SelectInstance)object0;
                return new o(23, ((MutexImpl)object3), object1);
            }
            case 5: {
                int v6 = ((Number)object2).intValue();
                Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$KDButton");
                if((v6 & 81) == 16 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xD488894F, v6, -1, "com.kakao.kandinsky.textedit.ui.FontToggleButton.<anonymous> (TextStyleAndFontPanel.kt:263)");
                }
                String s = ((FontData)object3).getAlias();
                TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object1), MaterialTheme.$stable).getBodyMedium();
                Integer integer0 = ((FontData)object3).getResource();
                if(integer0 != null) {
                    bottomAppBarState0 = FontFamilyKt.FontFamily(new Font[]{FontKt.Font-YpTlLL0$default(integer0.intValue(), null, 0, 0, 14, null)});
                }
                TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, ((FontFamily)bottomAppBarState0), 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, ((Composer)object1), 0, 0, 0xFFBE);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 6: {
                long v7 = ((Constraints)object2).unbox-impl();
                long v8 = ((j3)object3).f;
                Placeable placeable1 = ((Measurable)object1).measure-BRTryo0(Constraints.copy-Zbe2FdA$default(v7, kotlin.ranges.c.coerceIn(IntSize.getWidth-impl(v8), Constraints.getMinWidth-impl(v7), Constraints.getMaxWidth-impl(v7)), 0, kotlin.ranges.c.coerceIn(IntSize.getHeight-impl(v8), Constraints.getMinHeight-impl(v7), Constraints.getMaxHeight-impl(v7)), 0, 10, null));
                return MeasureScope.layout$default(((MeasureScope)object0), placeable1.getWidth(), placeable1.getHeight(), null, new k3(placeable1), 4, null);
            }
            case 7: {
                int v9 = ((Number)object0).intValue();
                int v10 = ((Number)object1).intValue();
                boolean z4 = ((Boolean)object2).booleanValue();
                TextFieldCharSequence textFieldCharSequence0 = z4 ? ((TextFieldDecoratorModifierNode)object3).getTextFieldState().getUntransformedText() : ((TextFieldDecoratorModifierNode)object3).getTextFieldState().getVisualText();
                long v11 = textFieldCharSequence0.getSelection-d9O1mEE();
                if(((TextFieldDecoratorModifierNode)object3).getEnabled() && Math.min(v9, v10) >= 0 && Math.max(v9, v10) <= textFieldCharSequence0.length()) {
                    if(v9 == TextRange.getStart-impl(v11) && v10 == TextRange.getEnd-impl(v11)) {
                        return true;
                    }
                    long v12 = TextRangeKt.TextRange(v9, v10);
                    if(z4 || v9 == v10) {
                        ((TextFieldDecoratorModifierNode)object3).getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.None);
                    }
                    else {
                        ((TextFieldDecoratorModifierNode)object3).getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                    }
                    if(z4) {
                        ((TextFieldDecoratorModifierNode)object3).getTextFieldState().selectUntransformedCharsIn-5zc-tL8(v12);
                        return true;
                    }
                    ((TextFieldDecoratorModifierNode)object3).getTextFieldState().selectCharsIn-5zc-tL8(v12);
                    return true;
                }
                return false;
            }
            case 8: {
                int v13 = ((Number)object2).intValue();
                Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$null");
                if((v13 & 14) == 0) {
                    if(((Composer)object1).changed(((ColumnScope)object0))) {
                        v = 4;
                    }
                    v13 |= v;
                }
                if((v13 & 91) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2102030527, v13, -1, "com.google.accompanist.navigation.material.BottomSheetNavigator.sheetContent.<anonymous> (BottomSheetNavigator.kt:155)");
                }
                SaveableStateHolder saveableStateHolder0 = SaveableStateHolderKt.rememberSaveableStateHolder(((Composer)object1), 0);
                State state2 = SnapshotStateKt.collectAsState(((BottomSheetNavigator)object3).getTransitionsInProgress$navigation_material_release(), null, ((Composer)object1), 8, 1);
                State state3 = SnapshotStateKt.produceState(null, BottomSheetNavigator.access$getBackStack(((BottomSheetNavigator)object3)), new d(((BottomSheetNavigator)object3), null), ((Composer)object1), 582);
                ((Composer)object1).startReplaceableGroup(0x8D9FC094);
                if(((NavBackStackEntry)state3.getValue()) != null) {
                    EffectsKt.LaunchedEffect(((NavBackStackEntry)state3.getValue()), new b(((BottomSheetNavigator)object3), null), ((Composer)object1), 72);
                    BackHandlerKt.BackHandler(false, new t1(16, ((BottomSheetNavigator)object3), state3), ((Composer)object1), 0, 1);
                }
                ((Composer)object1).endReplaceableGroup();
                SheetContentHostKt.SheetContentHost(((ColumnScope)object0), ((NavBackStackEntry)state3.getValue()), ((BottomSheetNavigator)object3).getSheetState$navigation_material_release(), saveableStateHolder0, new n6.c(((BottomSheetNavigator)object3), state2, 0), new n6.c(((BottomSheetNavigator)object3), state2, 1), ((Composer)object1), v13 & 14 | 0x1040 | ModalBottomSheetState.$stable << 6);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 9: {
                Intrinsics.checkNotNullParameter(((String)object1), "argName");
                Intrinsics.checkNotNullParameter(((NavType)object2), "navType");
                ((RouteBuilder)object3).appendPattern(((Number)object0).intValue(), ((String)object1), ((NavType)object2));
                return Unit.INSTANCE;
            }
            case 10: {
                Placeable placeable2 = ((Measurable)object1).measure-BRTryo0(((Constraints)object2).unbox-impl());
                return MeasureScope.layout$default(((MeasureScope)object0), placeable2.getWidth(), placeable2.getHeight(), null, new f(placeable2, ((ContentTransform)object3)), 4, null);
            }
            case 11: {
                Placeable placeable3 = ((Measurable)object1).measure-BRTryo0(((Constraints)object2).unbox-impl());
                if(((MeasureScope)object0).isLookingAhead()) {
                    ((OnLookaheadMeasured)object3).invoke-ozmzZPI(IntSizeKt.IntSize(placeable3.getWidth(), placeable3.getHeight()));
                }
                return MeasureScope.layout$default(((MeasureScope)object0), placeable3.getWidth(), placeable3.getHeight(), null, new p(placeable3), 4, null);
            }
            case 12: {
                Placeable placeable4 = ((Measurable)object1).measure-BRTryo0(((Constraints)object2).unbox-impl());
                return MeasureScope.layout$default(((MeasureScope)object0), placeable4.getWidth(), placeable4.getHeight(), null, new l1(((MeasureScope)object0), ((SharedTransitionScopeImpl)object3), placeable4), 4, null);
            }
            case 13: {
                return new r(object2, ((BufferedChannel)object3), 26, ((SelectInstance)object0));
            }
            case 14: {
                long v14 = ((Size)object0).unbox-impl();
                int v15 = ((Number)object2).intValue();
                if((v15 & 14) == 0) {
                    if(((Composer)object1).changed(v14)) {
                        v = 4;
                    }
                    v15 |= v;
                }
                if((v15 & 91) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x6DEA5AF, v15, -1, "com.kakao.kandinsky.signature.ui.SignatureDecoration.<anonymous> (SignatureDecoration.kt:52)");
                }
                SignatureDecorationKt.access$SignatureContent-x_KDEd0(((Signature)object3), v14, ((Composer)object1), v15 << 3 & 0x70);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 15: {
                int v16 = ((Number)object2).intValue();
                if((v16 & 6) == 0) {
                    if(((v16 & 8) == 0 ? ((Composer)object1).changed(object0) : ((Composer)object1).changedInstance(object0))) {
                        v = 4;
                    }
                    v16 |= v;
                }
                if((v16 & 19) == 18 && ((Composer)object1).getSkipping()) {
                    ((Composer)object1).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xEF37CA2, v16, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:170)");
                }
                ((Function3)object3).invoke(object0, ((Composer)object1), ((int)(v16 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                ((Function3)((State)object3).getValue()).invoke(((Number)object0).floatValue(), Offset.box-impl(((Offset)object1).unbox-impl()), ((Number)object2).floatValue());
                return Unit.INSTANCE;
            }
        }
    }
}

