package com.kakao.tistory.presentation.common.graph;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u000B¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 StatisticsBarGraph.kt\ncom/kakao/tistory/presentation/common/graph/StatisticsBarGraphKt$StatisticsBarGraph$1$1\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,433:1\n87#2,6:434\n93#2:446\n104#2:447\n1223#3,6:440\n*S KotlinDebug\n*F\n+ 1 StatisticsBarGraph.kt\ncom/kakao/tistory/presentation/common/graph/StatisticsBarGraphKt$StatisticsBarGraph$1$1\n*L\n92#1:440,6\n*E\n"})
public final class StatisticsBarGraphKt.StatisticsBarGraph.1.1.invoke..inlined.itemsIndexed.default.3 extends Lambda implements Function4 {
    public final List a;
    public final int b;
    public final long c;
    public final Function1 d;
    public final Density e;
    public final float f;
    public final MutableState g;

    public StatisticsBarGraphKt.StatisticsBarGraph.1.1.invoke..inlined.itemsIndexed.default.3(List list0, int v, long v1, Function1 function10, Density density0, float f, MutableState mutableState0) {
        this.a = list0;
        this.b = v;
        this.c = v1;
        this.d = function10;
        this.e = density0;
        this.f = f;
        this.g = mutableState0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public Object invoke(Object object0, Object object1, Object object2, Object object3) {
        this.invoke(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull LazyItemScope lazyItemScope0, int v, @Nullable Composer composer0, int v1) {
        int v2 = (v1 & 6) == 0 ? v1 | (composer0.changed(lazyItemScope0) ? 4 : 2) : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (composer0.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBEF78951, v2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
        }
        BarGraphItem barGraphItem0 = (BarGraphItem)this.a.get(v);
        composer0.startReplaceGroup(2045015541);
        boolean z = false;
        boolean z1 = this.b == v;
        long v3 = this.c;
        composer0.startReplaceGroup(-1180950846);
        boolean z2 = composer0.changed(this.d);
        if((v2 & 0x70 ^ 0x30) > 0x20 && composer0.changed(v) || (v2 & 0x30) == 0x20) {
            z = true;
        }
        a0 a00 = composer0.rememberedValue();
        if(z2 || z || a00 == Composer.Companion.getEmpty()) {
            a00 = new a0(this.d, v);
            composer0.updateRememberedValue(a00);
        }
        composer0.endReplaceGroup();
        TistoryBarGraphKt.TistoryBarGraphItem-vRFhKjU(null, z1, barGraphItem0, v3, 0L, a00, ComposableLambdaKt.rememberComposableLambda(0x2F791CB, true, new c0(this.e, z1, this.f, this.g), composer0, 54), composer0, 0x180000, 17);
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

