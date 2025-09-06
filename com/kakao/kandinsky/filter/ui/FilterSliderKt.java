package com.kakao.kandinsky.filter.ui;

import androidx.compose.material3.ti;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import ce.e;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import eb.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AP\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u001D\u0010\b\u001A\u0019\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\u000BH\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"FilterSlider", "", "currentFilter", "Lcom/kakao/kandinsky/core/kdphoto/Filter;", "intensity", "", "updateIntensityValue", "Lkotlin/Function1;", "onDragStopped", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ExtensionFunctionType;", "(Lcom/kakao/kandinsky/core/kdphoto/Filter;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "filter_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFilterSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilterSlider.kt\ncom/kakao/kandinsky/filter/ui/FilterSliderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,27:1\n1223#2,6:28\n*S KotlinDebug\n*F\n+ 1 FilterSlider.kt\ncom/kakao/kandinsky/filter/ui/FilterSliderKt\n*L\n18#1:28,6\n*E\n"})
public final class FilterSliderKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void FilterSlider(@NotNull Filter filter0, float f, @NotNull Function1 function10, @NotNull Function2 function20, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(filter0, "currentFilter");
        Intrinsics.checkNotNullParameter(function10, "updateIntensityValue");
        Intrinsics.checkNotNullParameter(function20, "onDragStopped");
        Composer composer1 = composer0.startRestartGroup(0x331420EF);
        int v1 = (v & 14) == 0 ? (composer1.changed(filter0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x331420EF, v1, -1, "com.kakao.kandinsky.filter.ui.FilterSlider (FilterSlider.kt:13)");
            }
            boolean z = filter0.isOriginalFilter();
            boolean z1 = true;
            composer1.startReplaceGroup(-2072814972);
            if((v1 & 0x380) != 0x100) {
                z1 = false;
            }
            ti ti0 = composer1.rememberedValue();
            if(z1 || ti0 == Composer.Companion.getEmpty()) {
                ti0 = new ti(function10, 6);
                composer1.updateRememberedValue(ti0);
            }
            composer1.endReplaceGroup();
            KDSliderKt.KDSlider(null, !z, f * 100.0f, ti0, 100.0f, function20, false, null, 0, e.rangeTo(0.0f, 100.0f), composer1, v1 << 6 & 0x70000 | 0x6186000, 0x81);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(filter0, f, function10, function20, v, 2));
        }
    }
}

