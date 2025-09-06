package com.kakao.tistory.presentation.screen.home.ui;

import a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u000B¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5\n+ 2 HomeSlotList.kt\ncom/kakao/tistory/presentation/screen/home/ui/HomeSlotListKt$MultiLane$2\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,469:1\n98#2:470\n97#2,3:471\n101#2,2:475\n100#2:477\n104#2,2:514\n106#2,2:520\n1#3:474\n71#4:478\n68#4,6:479\n74#4:513\n78#4:519\n78#5,6:485\n85#5,4:500\n89#5,2:510\n93#5:518\n368#6,9:491\n377#6:512\n378#6,2:516\n4032#7,6:504\n*S KotlinDebug\n*F\n+ 1 HomeSlotList.kt\ncom/kakao/tistory/presentation/screen/home/ui/HomeSlotListKt$MultiLane$2\n*L\n100#1:478\n100#1:479,6\n100#1:513\n100#1:519\n100#1:485,6\n100#1:500,4\n100#1:510,2\n100#1:518\n100#1:491,9\n100#1:512\n100#1:516,2\n100#1:504,6\n*E\n"})
public final class HomeSlotListKt.MultiLane.2.invoke..inlined.itemsIndexed.default.4 extends Lambda implements Function4 {
    public final List a;
    public final Density b;

    public HomeSlotListKt.MultiLane.2.invoke..inlined.itemsIndexed.default.4(List list0, Density density0) {
        this.a = list0;
        this.b = density0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public Object invoke(Object object0, Object object1, Object object2, Object object3) {
        this.invoke(((LazyStaggeredGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull LazyStaggeredGridItemScope lazyStaggeredGridItemScope0, int v, @Nullable Composer composer0, int v1) {
        int v2 = (v1 & 6) == 0 ? (composer0.changed(lazyStaggeredGridItemScope0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer0.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x10FA3898, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:385)");
        }
        Pair pair0 = (Pair)this.a.get(v);
        composer0.startReplaceGroup(-583305961);
        HomeSlotUiState homeSlotUiState0 = (HomeSlotUiState)pair0.component1();
        int v3 = ((Number)pair0.component2()).intValue();
        composer0.startReplaceGroup(1505204518);
        if(homeSlotUiState0 != null) {
            float f = this.b.toDp-u2uoSUM(v3);
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, f, 7, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
            CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v4)) {
                d.a(v4, composer0, v4, function20);
            }
            Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
            HomeSlotListKt.access$HomeSlot(homeSlotUiState0, composer0, 0);
            composer0.endNode();
        }
        composer0.endReplaceGroup();
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

