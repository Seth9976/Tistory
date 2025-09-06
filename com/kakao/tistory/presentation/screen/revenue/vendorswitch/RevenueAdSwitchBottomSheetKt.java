package com.kakao.tistory.presentation.screen.revenue.vendorswitch;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A7\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"RevenueAdSwitchBottomSheet", "", "selectedVendor", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "vendorList", "", "onClickVendor", "Lkotlin/Function1;", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRevenueAdSwitchBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevenueAdSwitchBottomSheet.kt\ncom/kakao/tistory/presentation/screen/revenue/vendorswitch/RevenueAdSwitchBottomSheetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,71:1\n148#2:72\n148#2:111\n148#2:112\n85#3:73\n82#3,6:74\n88#3:108\n92#3:163\n78#4,6:80\n85#4,4:95\n89#4,2:105\n78#4,6:126\n85#4,4:141\n89#4,2:151\n93#4:157\n93#4:162\n368#5,9:86\n377#5:107\n368#5,9:132\n377#5:153\n378#5,2:155\n378#5,2:160\n4032#6,6:99\n4032#6,6:145\n1864#7,2:109\n1866#7:159\n1223#8,6:113\n98#9:119\n95#9,6:120\n101#9:154\n105#9:158\n*S KotlinDebug\n*F\n+ 1 RevenueAdSwitchBottomSheet.kt\ncom/kakao/tistory/presentation/screen/revenue/vendorswitch/RevenueAdSwitchBottomSheetKt\n*L\n31#1:72\n46#1:111\n47#1:112\n28#1:73\n28#1:74,6\n28#1:108\n28#1:163\n28#1:80,6\n28#1:95,4\n28#1:105,2\n43#1:126,6\n43#1:141,4\n43#1:151,2\n43#1:157\n28#1:162\n28#1:86,9\n28#1:107\n43#1:132,9\n43#1:153\n43#1:155,2\n28#1:160,2\n28#1:99,6\n43#1:145,6\n33#1:109,2\n33#1:159\n48#1:113,6\n43#1:119\n43#1:120,6\n43#1:154\n43#1:158\n*E\n"})
public final class RevenueAdSwitchBottomSheetKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void RevenueAdSwitchBottomSheet(@NotNull Vendor vendor0, @NotNull List list0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Vendor vendor2;
        boolean z1;
        Vendor vendor1;
        Intrinsics.checkNotNullParameter(vendor0, "selectedVendor");
        Intrinsics.checkNotNullParameter(list0, "vendorList");
        Intrinsics.checkNotNullParameter(function10, "onClickVendor");
        Composer composer1 = composer0.startRestartGroup(0x5CE8E579);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x5CE8E579, v, -1, "com.kakao.tistory.presentation.screen.revenue.vendorswitch.RevenueAdSwitchBottomSheet (RevenueAdSwitchBottomSheet.kt:26)");
        }
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 12.0f, 0.0f, 0.0f, 13, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function00);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        r0.a.z(composeUiNode$Companion0, composer1, modifier1, composer1, 0xF7221A6F);
        int v2 = 0;
        for(Object object0: list0) {
            if(v2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            boolean z = ((Vendor)object0) == vendor0;
            composer1.startReplaceGroup(-148757909);
            if(v2 == 0) {
                vendor1 = (Vendor)object0;
            }
            else {
                vendor1 = (Vendor)object0;
                DividerKt.HorizontalDivider-9IZ8Weo(null, 0.0f, 0L, composer1, 0x180, 3);
            }
            composer1.endReplaceGroup();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier2 = PaddingKt.padding-VpY3zN4$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 64.0f), 20.0f, 0.0f, 2, null);
            composer1.startReplaceGroup(1697828002);
            if(((v & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(function10)) && (v & 0x180) != 0x100) {
                vendor2 = vendor1;
                z1 = false;
            }
            else {
                z1 = true;
                vendor2 = vendor1;
            }
            boolean z2 = composer1.changed(vendor2);
            com.kakao.tistory.presentation.screen.revenue.vendorswitch.a a0 = composer1.rememberedValue();
            if(z2 || z1 || a0 == Composer.Companion.getEmpty()) {
                a0 = new com.kakao.tistory.presentation.screen.revenue.vendorswitch.a(function10, vendor2);
                composer1.updateRememberedValue(a0);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = ModifierKt.noRippleClickable(modifier2, a0);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
            Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion1.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.a(composeUiNode$Companion1, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion1.getSetModifier());
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(vendor2.getTitle(), composer1, 0), null, 0L, 0x141880000L, null, (z ? FontWeight.Companion.getSemiBold() : FontWeight.Companion.getNormal()), TypeKt.getTFont(), 0L, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0x180D80, 0, 0x3FF92);
            SpacerKt.Spacer(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
            composer1.startReplaceGroup(0xD0008473);
            if(z) {
                IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_list_check, composer1, 0), null, null, 0L, composer1, 0xC38, 4);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            ++v2;
        }
        if(m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(vendor0, list0, function10, v));
        }
    }
}

