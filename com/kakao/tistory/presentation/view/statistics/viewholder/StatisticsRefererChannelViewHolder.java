package com.kakao.tistory.presentation.view.statistics.viewholder;

import a;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import c;
import com.kakao.tistory.data.model.RefererChannelItem;
import com.kakao.tistory.data.model.StatisticsItem.RefererChannel;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.theme.TTextStyle;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000B\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000B\u0010\fJ;\u0010\u0013\u001A\u00020\b2\b\b\u0001\u0010\u000E\u001A\u00020\r2\n\b\u0003\u0010\u000F\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001A\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001A\u00020\b2\b\b\u0001\u0010\u000E\u001A\u00020\r2\n\b\u0003\u0010\u000F\u001A\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsRefererChannelViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererChannel;", "refererChannel", "", "setRefererChannel", "(Lcom/kakao/tistory/data/model/StatisticsItem$RefererChannel;)V", "RefererChannel", "(Lcom/kakao/tistory/data/model/StatisticsItem$RefererChannel;Landroidx/compose/runtime/Composer;I)V", "", "titleRes", "dotImageRes", "percent", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "RefererChannelContainer", "(ILjava/lang/Integer;Ljava/lang/Integer;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;II)V", "RefererChannelTitle", "(ILjava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsRefererChannelViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsRefererChannelViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsRefererChannelViewHolder\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,129:1\n148#2:130\n148#2:171\n148#2:249\n148#2:250\n148#2:251\n98#3:131\n95#3,6:132\n101#3:166\n105#3:170\n98#3:212\n94#3,7:213\n101#3:248\n105#3:255\n78#4,6:138\n85#4,4:153\n89#4,2:163\n93#4:169\n78#4,6:179\n85#4,4:194\n89#4,2:204\n93#4:210\n78#4,6:220\n85#4,4:235\n89#4,2:245\n93#4:254\n368#5,9:144\n377#5:165\n378#5,2:167\n368#5,9:185\n377#5:206\n378#5,2:208\n368#5,9:226\n377#5:247\n378#5,2:252\n4032#6,6:157\n4032#6,6:198\n4032#6,6:239\n85#7:172\n82#7,6:173\n88#7:207\n92#7:211\n*S KotlinDebug\n*F\n+ 1 StatisticsRefererChannelViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsRefererChannelViewHolder\n*L\n45#1:130\n82#1:171\n117#1:249\n121#1:250\n122#1:251\n45#1:131\n45#1:132,6\n45#1:166\n45#1:170\n107#1:212\n107#1:213,7\n107#1:248\n107#1:255\n45#1:138,6\n45#1:153,4\n45#1:163,2\n45#1:169\n81#1:179,6\n81#1:194,4\n81#1:204,2\n81#1:210\n107#1:220,6\n107#1:235,4\n107#1:245,2\n107#1:254\n45#1:144,9\n45#1:165\n45#1:167,2\n81#1:185,9\n81#1:206\n81#1:208,2\n107#1:226,9\n107#1:247\n107#1:252,2\n45#1:157,6\n81#1:198,6\n107#1:239,6\n81#1:172\n81#1:173,6\n81#1:207\n81#1:211\n*E\n"})
public final class StatisticsRefererChannelViewHolder extends ViewHolder {
    public static final int $stable;
    public final ComposeView a;

    static {
        StatisticsRefererChannelViewHolder.$stable = ComposeView.$stable;
    }

    public StatisticsRefererChannelViewHolder(@NotNull ComposeView composeView0) {
        Intrinsics.checkNotNullParameter(composeView0, "composeView");
        super(composeView0);
        this.a = composeView0;
        composeView0.setViewCompositionStrategy(DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void RefererChannel(@Nullable RefererChannel statisticsItem$RefererChannel0, @Nullable Composer composer0, int v) {
        Integer integer6;
        Integer integer5;
        Integer integer3;
        Integer integer1;
        Composer composer1 = composer0.startRestartGroup(-250287489);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-250287489, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererChannelViewHolder.RefererChannel (StatisticsRefererChannelViewHolder.kt:43)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0(modifier$Companion0, 20.0f, 14.0f, 20.0f, 23.0f);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getTop(), composer1, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        int v2 = string.label_statistics_referer_channel_search;
        Integer integer0 = drawable.ic_statistics_dot_search;
        if(statisticsItem$RefererChannel0 == null) {
            integer1 = null;
        }
        else {
            RefererChannelItem refererChannelItem0 = statisticsItem$RefererChannel0.getPageView();
            integer1 = refererChannelItem0 == null ? null : refererChannelItem0.getSearchEnginePercent();
        }
        int v3 = v << 9 & 0xE000;
        int v4 = ComposeView.$stable << 12 | v3;
        this.RefererChannelContainer(v2, integer0, integer1, null, composer1, v4, 8);
        int v5 = string.label_statistics_referer_channel_sns;
        Integer integer2 = drawable.ic_statistics_dot_sns;
        if(statisticsItem$RefererChannel0 == null) {
            integer3 = null;
        }
        else {
            RefererChannelItem refererChannelItem1 = statisticsItem$RefererChannel0.getPageView();
            integer3 = refererChannelItem1 == null ? null : refererChannelItem1.getSocialPercent();
        }
        this.RefererChannelContainer(v5, integer2, integer3, null, composer1, v4, 8);
        int v6 = string.label_statistics_referer_channel_etc;
        Integer integer4 = drawable.ic_statistics_dot_etc;
        if(statisticsItem$RefererChannel0 == null) {
            integer5 = null;
        }
        else {
            RefererChannelItem refererChannelItem2 = statisticsItem$RefererChannel0.getPageView();
            integer5 = refererChannelItem2 == null ? null : refererChannelItem2.getEtcPercent();
        }
        this.RefererChannelContainer(v6, integer4, integer5, null, composer1, v4, 8);
        SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        int v7 = string.label_statistics_referer_channel_mobile;
        if(statisticsItem$RefererChannel0 == null) {
            integer6 = null;
        }
        else {
            RefererChannelItem refererChannelItem3 = statisticsItem$RefererChannel0.getDeviceType();
            integer6 = refererChannelItem3 == null ? null : refererChannelItem3.getMobilePercent();
        }
        this.RefererChannelContainer(v7, null, integer6, alignment$Companion0.getEnd(), composer1, 0x8C00 | v3, 2);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(this, statisticsItem$RefererChannel0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void RefererChannelContainer(@StringRes int v, @DrawableRes @Nullable Integer integer0, @Nullable Integer integer1, @Nullable Horizontal alignment$Horizontal0, @Nullable Composer composer0, int v1, int v2) {
        Horizontal alignment$Horizontal1;
        Integer integer3;
        Integer integer2;
        String s;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xB46873F3);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(integer0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(integer1) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changed(alignment$Horizontal0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v3 |= (composer1.changed(this) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v3) != 9362 || !composer1.getSkipping()) {
            Integer integer4 = (v2 & 2) == 0 ? integer0 : null;
            Integer integer5 = (v2 & 4) == 0 ? integer1 : null;
            Horizontal alignment$Horizontal2 = (v2 & 8) == 0 ? alignment$Horizontal0 : Alignment.Companion.getStart();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB46873F3, v3, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererChannelViewHolder.RefererChannelContainer (StatisticsRefererChannelViewHolder.kt:79)");
            }
            Modifier modifier0 = SizeKt.defaultMinSize-VpY3zN4$default(Modifier.Companion, 66.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Horizontal2, composer1, (v3 >> 3 & 0x380 | 6) >> 3 & 0x70);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            this.RefererChannelTitle(v, integer4, composer1, v3 & 0x7E | ComposeView.$stable << 6 | v3 >> 6 & 0x380, 0);
            if(integer5 == null) {
                composer1.startReplaceGroup(0x58680604);
                s = StringResources_androidKt.stringResource(string.label_statistics_referer_channel_dash, composer1, 0);
            }
            else {
                composer1.startReplaceGroup(1483085781);
                s = StringResources_androidKt.stringResource(string.label_statistics_referer_channel_percentage, new Object[]{integer5}, composer1, 0x40);
            }
            composer1.endReplaceGroup();
            TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize15Weight700(), composer1, 0x180, 0x180000, 0xFFFA);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            integer3 = integer5;
            alignment$Horizontal1 = alignment$Horizontal2;
            integer2 = integer4;
        }
        else {
            composer1.skipToGroupEnd();
            integer2 = integer0;
            integer3 = integer1;
            alignment$Horizontal1 = alignment$Horizontal0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(this, v, integer2, integer3, alignment$Horizontal1, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void RefererChannelTitle(@StringRes int v, @DrawableRes @Nullable Integer integer0, @Nullable Composer composer0, int v1, int v2) {
        Integer integer1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xCB992ADB);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? v1 | (composer1.changed(v) ? 4 : 2) : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(integer0) ? 0x20 : 16);
        }
        if((v3 & 91) != 18 || !composer1.getSkipping()) {
            Integer integer2 = (v2 & 2) == 0 ? integer0 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCB992ADB, v3, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererChannelViewHolder.RefererChannelTitle (StatisticsRefererChannelViewHolder.kt:105)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer1, 0x30);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(v, composer1, v3 & 14), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize16Weight400(), composer1, 0x180, 0x180000, 0xFFFA);
            composer1.startReplaceGroup(-734141057);
            if(integer2 != null) {
                c.a(1.0f, modifier$Companion0, composer1, 6);
                Modifier modifier1 = SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 2.0f, 0.0f, 0.0f, 13, null), 5.0f);
                ImageKt.Image(PainterResources_androidKt.painterResource(integer2.intValue(), composer1, 0), null, modifier1, null, null, 0.0f, null, composer1, 440, 120);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
            integer1 = integer2;
        }
        else {
            composer1.skipToGroupEnd();
            integer1 = integer0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.view.statistics.viewholder.m(this, v, integer1, v1, v2));
        }
    }

    public final void setRefererChannel(@Nullable RefererChannel statisticsItem$RefererChannel0) {
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x9A107029, true, new o(this, statisticsItem$RefererChannel0));
        this.a.setContent(composableLambda0);
    }
}

