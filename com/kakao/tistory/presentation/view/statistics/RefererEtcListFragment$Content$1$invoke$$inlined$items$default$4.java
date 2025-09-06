package com.kakao.tistory.presentation.view.statistics;

import a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.kakao.tistory.data.model.RefererEtcItem;
import com.kakao.tistory.presentation.R.color;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u000B¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$items$4"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 RefererEtcListFragment.kt\ncom/kakao/tistory/presentation/view/statistics/RefererEtcListFragment$Content$1\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,433:1\n75#2:434\n76#2,4:472\n80#2:477\n77#2,6:478\n83#2:488\n71#3:435\n67#3,7:436\n74#3:471\n78#3:487\n78#4,6:443\n85#4,4:458\n89#4,2:468\n93#4:486\n368#5,9:449\n377#5:470\n378#5,2:484\n4032#6,6:462\n158#7:476\n*S KotlinDebug\n*F\n+ 1 RefererEtcListFragment.kt\ncom/kakao/tistory/presentation/view/statistics/RefererEtcListFragment$Content$1\n*L\n75#1:435\n75#1:436,7\n75#1:471\n75#1:487\n75#1:443,6\n75#1:458,4\n75#1:468,2\n75#1:486\n75#1:449,9\n75#1:470\n75#1:484,2\n75#1:462,6\n79#1:476\n*E\n"})
public final class RefererEtcListFragment.Content.1.invoke..inlined.items.default.4 extends Lambda implements Function4 {
    public final List a;
    public final RefererEtcListFragment b;

    public RefererEtcListFragment.Content.1.invoke..inlined.items.default.4(List list0, RefererEtcListFragment refererEtcListFragment0) {
        this.a = list0;
        this.b = refererEtcListFragment0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public Object invoke(Object object0, Object object1, Object object2, Object object3) {
        this.invoke(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull LazyItemScope lazyItemScope0, int v, @Nullable Composer composer0, int v1) {
        int v2 = (v1 & 6) == 0 ? (composer0.changed(lazyItemScope0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer0.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDA480CDF, v2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
        }
        RefererEtcItem refererEtcItem0 = (RefererEtcItem)this.a.get(v);
        composer0.startReplaceGroup(0x9A574FE9);
        Companion modifier$Companion0 = Modifier.Companion;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
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
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v3)) {
            d.a(v3, composer0, v3, function20);
        }
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        this.b.Referer(refererEtcItem0, composer0, 72);
        DividerKt.Divider-oMI9zvI(BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getBottomStart()), ColorResources_androidKt.colorResource(color.gray4, composer0, 0), 0.5f, 0.0f, composer0, 0x180, 8);
        composer0.endNode();
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

