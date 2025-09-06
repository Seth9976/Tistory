package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PageSize.Fixed;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import b;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainStatistics;
import com.kakao.tistory.presentation.widget.common.PageIndicatorKt;
import d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h2 extends Lambda implements Function3 {
    public final BlogMainStatistics a;
    public final float b;

    public h2(BlogMainStatistics blogMainStatistics0, float f) {
        this.a = blogMainStatistics0;
        this.b = f;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxWithConstraintsScope)object0), "$this$BoxWithConstraints");
        if((v & 14) == 0) {
            v |= (composer0.changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x92FF0D1C, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainStatistics.<anonymous> (BlogMainStatistics.kt:267)");
        }
        boolean z = Dp.compareTo-0680j_4(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM(), 440.0f) >= 0;
        List list0 = this.a.getTypeList();
        int v1 = list0.size();
        composer0.startReplaceGroup(0x7094B746);
        boolean z1 = composer0.changed(v1);
        g2 g20 = composer0.rememberedValue();
        if(z1 || g20 == Composer.Companion.getEmpty()) {
            g20 = new g2(v1);
            composer0.updateRememberedValue(g20);
        }
        composer0.endReplaceGroup();
        PagerState pagerState0 = PagerStateKt.rememberPagerState(0, 0.0f, g20, composer0, 6, 2);
        Dp dp0 = Dp.box-impl(((BoxWithConstraintsScope)object0).getMaxWidth-D9Ej5fM());
        composer0.startReplaceGroup(0x7094C24C);
        boolean z2 = composer0.changed(pagerState0);
        c2 c20 = composer0.rememberedValue();
        if(z2 || c20 == Composer.Companion.getEmpty()) {
            c20 = new c2(pagerState0, null);
            composer0.updateRememberedValue(c20);
        }
        composer0.endReplaceGroup();
        EffectsKt.LaunchedEffect(dp0, c20, composer0, 0x40);
        EffectsKt.LaunchedEffect(pagerState0.getTargetPage(), new d2(pagerState0, list0, null), composer0, 0x40);
        float f = this.b;
        BlogMainStatistics blogMainStatistics0 = this.a;
        Companion modifier$Companion0 = Modifier.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
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
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
            d.a(v2, composer0, v2, function20);
        }
        Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
        Modifier modifier1 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), f);
        Fixed pageSize$Fixed0 = z ? new Fixed(320.0f, null) : (Density density0, int v, int v1) -> v;
        PagerKt.HorizontalPager-oI3XNZo(pagerState0, modifier1, PaddingKt.PaddingValues-YgX7TsA$default(20.0f, 0.0f, 2, null), pageSize$Fixed0, 0, 10.0f, null, null, false, false, new e2(list0), null, null, ComposableLambdaKt.rememberComposableLambda(0x37C68B04, true, new f2(list0, blogMainStatistics0), composer0, 54), composer0, 0x301B0, 0xC00, 7120);
        b.a(10.0f, modifier$Companion0, composer0, 6);
        PageIndicatorKt.PageIndicator(pagerState0, (z ? 0 : v1), composer0, 0, 0);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 30.0f), composer0, 6);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

