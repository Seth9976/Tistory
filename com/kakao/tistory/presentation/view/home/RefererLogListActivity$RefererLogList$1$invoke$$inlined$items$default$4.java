package com.kakao.tistory.presentation.view.home;

import a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import com.kakao.tistory.data.model.StatisticsItem.RefererLogItem;
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
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 RefererLogListActivity.kt\ncom/kakao/tistory/presentation/view/home/RefererLogListActivity$RefererLogList$1\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,433:1\n92#2:434\n93#2,9:472\n103#2:482\n104#2:487\n148#3:435\n158#3:481\n71#4:436\n68#4,6:437\n74#4:471\n78#4:486\n78#5,6:443\n85#5,4:458\n89#5,2:468\n93#5:485\n368#6,9:449\n377#6:470\n378#6,2:483\n4032#7,6:462\n*S KotlinDebug\n*F\n+ 1 RefererLogListActivity.kt\ncom/kakao/tistory/presentation/view/home/RefererLogListActivity$RefererLogList$1\n*L\n92#1:435\n101#1:481\n92#1:436\n92#1:437,6\n92#1:471\n92#1:486\n92#1:443,6\n92#1:458,4\n92#1:468,2\n92#1:485\n92#1:449,9\n92#1:470\n92#1:483,2\n92#1:462,6\n*E\n"})
public final class RefererLogListActivity.RefererLogList.1.invoke..inlined.items.default.4 extends Lambda implements Function4 {
    public final List a;
    public final RefererLogListActivity b;

    public RefererLogListActivity.RefererLogList.1.invoke..inlined.items.default.4(List list0, RefererLogListActivity refererLogListActivity0) {
        this.a = list0;
        this.b = refererLogListActivity0;
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
        Object object0 = this.a.get(v);
        composer0.startReplaceGroup(0x42B91818);
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.height-3ABfNKs(modifier$Companion0, 52.0f);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
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
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
        RefererLogListActivity refererLogListActivity0 = this.b;
        Boolean boolean0 = (Boolean)RefererLogListActivity.access$getRefererLogViewModel(refererLogListActivity0).isShowTopReferer().getValue();
        if(boolean0 == null) {
            boolean0 = Boolean.FALSE;
        }
        Intrinsics.checkNotNull(boolean0);
        refererLogListActivity0.RefererLogItem(null, ((RefererLogItem)object0), boolean0.booleanValue(), new m(RefererLogListActivity.access$getRefererLogViewModel(this.b)), composer0, 0x8040, 1);
        DividerKt.Divider-oMI9zvI(boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getBottomCenter()), ColorResources_androidKt.colorResource(color.gray4, composer0, 0), 0.5f, 0.0f, composer0, 0x180, 8);
        composer0.endNode();
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

