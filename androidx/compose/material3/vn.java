package androidx.compose.material3;

import aa.x;
import androidx.compose.foundation.ScrollState;
import androidx.compose.material.SliderKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.room.a;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.filter.ui.FilterMenuKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.coroutines.CoroutineScope;

public final class vn extends Lambda implements Function2 {
    public final int A;
    public final Object B;
    public final Object C;
    public final int w;
    public final float x;
    public final Object y;
    public final Object z;

    public vn(float f, int v, ScrollState scrollState0, Function2 function20, Function2 function21, Function3 function30) {
        this.w = 0;
        this.C = scrollState0;
        this.y = function20;
        this.z = function21;
        this.x = f;
        this.A = v;
        this.B = function30;
        super(2);
    }

    public vn(float f, Function2 function20, Function2 function21, si si0, int v, Function3 function30) {
        this.w = 1;
        this.x = f;
        this.y = function20;
        this.z = function21;
        this.C = si0;
        this.A = v;
        this.B = function30;
        super(2);
    }

    public vn(List list0, Filter filter0, float f, Function3 function30, Function1 function10, int v) {
        this.w = 2;
        this.C = list0;
        this.y = filter0;
        this.x = f;
        this.B = function30;
        this.z = function10;
        this.A = v;
        super(2);
    }

    public vn(Function1 function10, ClosedFloatingPointRange closedFloatingPointRange0, ClosedFloatingPointRange closedFloatingPointRange1, MutableState mutableState0, float f, int v) {
        this.w = 3;
        this.C = function10;
        this.y = closedFloatingPointRange0;
        this.z = closedFloatingPointRange1;
        this.B = mutableState0;
        this.x = f;
        this.A = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        float f = this.x;
        int v = this.A;
        Object object2 = this.z;
        Object object3 = this.y;
        Object object4 = this.C;
        Object object5 = this.B;
        switch(this.w) {
            case 0: {
                Composer composer0 = (Composer)object0;
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1556158104, v1, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous> (TabRow.kt:710)");
                }
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.rememberedValue();
                Companion composer$Companion0 = Composer.Companion;
                if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                    compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer0), composer0);
                }
                CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
                boolean z = composer0.changed(((ScrollState)object4));
                boolean z1 = composer0.changed(coroutineScope0);
                si si0 = composer0.rememberedValue();
                if(z || z1 || si0 == composer$Companion0.getEmpty()) {
                    si0 = new si(((ScrollState)object4), coroutineScope0);
                    composer0.updateRememberedValue(si0);
                }
                TabRowKt.ScrollableTabRowImpl.1.scope.1.1 tabRowKt$ScrollableTabRowImpl$1$scope$1$10 = composer0.rememberedValue();
                if(tabRowKt$ScrollableTabRowImpl$1$scope$1$10 == composer$Companion0.getEmpty()) {
                    tabRowKt$ScrollableTabRowImpl$1$scope$1$10 = new TabRowKt.ScrollableTabRowImpl.1.scope.1.1();
                    composer0.updateRememberedValue(tabRowKt$ScrollableTabRowImpl$1$scope$1$10);
                }
                List list0 = CollectionsKt__CollectionsKt.listOf(new Function2[]{((Function2)object3), ((Function2)object2), ComposableLambdaKt.rememberComposableLambda(-1530560661, true, new x(8, ((Function3)object5), tabRowKt$ScrollableTabRowImpl$1$scope$1$10), composer0, 54)});
                boolean z2 = composer0.changed(f);
                boolean z3 = composer0.changed(v);
                boolean z4 = composer0.changedInstance(si0);
                un un0 = composer0.rememberedValue();
                if((z2 | z3 | z4) != 0 || un0 == composer$Companion0.getEmpty()) {
                    un0 = new un(f, tabRowKt$ScrollableTabRowImpl$1$scope$1$10, v, si0);
                    composer0.updateRememberedValue(un0);
                }
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                Function2 function20 = LayoutKt.combineAsVirtualLayouts(list0);
                boolean z5 = composer0.changed(un0);
                MeasurePolicy measurePolicy0 = composer0.rememberedValue();
                if(z5 || measurePolicy0 == composer$Companion0.getEmpty()) {
                    measurePolicy0 = MultiContentMeasurePolicyKt.createMeasurePolicy(un0);
                    composer0.updateRememberedValue(measurePolicy0);
                }
                int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
                CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
                Modifier modifier0 = ComposedModifierKt.materializeModifier(composer0, modifier$Companion0);
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
                Function0 function00 = composeUiNode$Companion0.getConstructor();
                if(composer0.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer0.startReusableNode();
                if(composer0.getInserting()) {
                    composer0.createNode(function00);
                }
                else {
                    composer0.useNode();
                }
                Function2 function21 = a.r(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
                if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                    a.t(v2, composer0, v2, function21);
                }
                if(r0.a.B(function20, composer0, r0.a.l(composeUiNode$Companion0, composer0, modifier0, 0))) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                long v3 = ((Constraints)object1).unbox-impl();
                int v4 = ((SubcomposeMeasureScope)object0).roundToPx-0680j_4(90.0f);
                int v5 = ((SubcomposeMeasureScope)object0).roundToPx-0680j_4(f);
                List list1 = ((SubcomposeMeasureScope)object0).subcompose(lo.a, ((Function2)object3));
                Integer integer0 = 0;
                int v6 = list1.size();
                for(int v7 = 0; v7 < v6; ++v7) {
                    integer0 = Math.max(integer0.intValue(), ((Measurable)list1.get(v7)).maxIntrinsicHeight(0x7FFFFFFF));
                }
                int v8 = integer0.intValue();
                long v9 = Constraints.copy-Zbe2FdA$default(v3, v4, 0, v8, v8, 2, null);
                ArrayList arrayList0 = new ArrayList();
                ArrayList arrayList1 = new ArrayList();
                int v10 = list1.size();
                for(int v11 = 0; v11 < v10; ++v11) {
                    Object object6 = list1.get(v11);
                    Placeable placeable0 = ((Measurable)object6).measure-BRTryo0(v9);
                    float f1 = Dp.constructor-impl(((SubcomposeMeasureScope)object0).toDp-u2uoSUM(Math.min(((Measurable)object6).maxIntrinsicWidth(placeable0.getHeight()), placeable0.getWidth())) - 0.0f);
                    arrayList0.add(placeable0);
                    arrayList1.add(Dp.box-impl(f1));
                }
                Integer integer1 = (int)(v5 * 2);
                int v12 = arrayList0.size();
                for(int v13 = 0; v13 < v12; ++v13) {
                    integer1 = (int)(((Placeable)arrayList0.get(v13)).getWidth() + integer1.intValue());
                }
                int v14 = integer1.intValue();
                return MeasureScope.layout$default(((SubcomposeMeasureScope)object0), v14, v8, null, new xn(v5, arrayList0, ((SubcomposeMeasureScope)object0), ((Function2)object2), ((si)object4), this.A, arrayList1, v3, v14, v8, ((Function3)object5)), 4, null);
            }
            case 2: {
                ((Number)object1).intValue();
                FilterMenuKt.FilterMenu(((List)object4), ((Filter)object3), this.x, ((Function3)object5), ((Function1)object2), ((Composer)object0), (v | 1) & -920350135 | ((0x24924924 & (v | 1)) >> 1 | 306783378 & (v | 1)) | (306783378 & (v | 1)) << 1 & (0x24924924 & (v | 1)));
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                SliderKt.access$CorrectValueSideEffect(((Function1)object4), ((ClosedFloatingPointRange)object3), ((ClosedFloatingPointRange)object2), ((MutableState)object5), this.x, ((Composer)object0), (v | 1) & -920350135 | ((0x24924924 & (v | 1)) >> 1 | 306783378 & (v | 1)) | (306783378 & (v | 1)) << 1 & (0x24924924 & (v | 1)));
                return Unit.INSTANCE;
            }
        }
    }
}

