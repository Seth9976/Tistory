package com.kakao.kandinsky.selector;

import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells.Adaptive;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.text.selection.a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ra.o;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001Af\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u00042\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u0002H\u00020\u00062;\u0010\u0007\u001A7\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000B\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"SelectorGrid", "", "T", "modifier", "Landroidx/compose/ui/Modifier;", "items", "", "content", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "item", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "selector_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSelectorGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectorGrid.kt\ncom/kakao/kandinsky/selector/SelectorGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,32:1\n148#2:33\n148#2:34\n148#2:35\n*S KotlinDebug\n*F\n+ 1 SelectorGrid.kt\ncom/kakao/kandinsky/selector/SelectorGridKt\n*L\n19#1:33\n20#1:34\n21#1:35\n*E\n"})
public final class SelectorGridKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectorGrid(@NotNull Modifier modifier0, @NotNull List list0, @NotNull Function4 function40, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Intrinsics.checkNotNullParameter(list0, "items");
        Intrinsics.checkNotNullParameter(function40, "content");
        Composer composer1 = composer0.startRestartGroup(-1315532404);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1315532404, v, -1, "com.kakao.kandinsky.selector.SelectorGrid (SelectorGrid.kt:14)");
        }
        Modifier modifier1 = SizeKt.fillMaxSize$default(modifier0, 0.0f, 1, null);
        HorizontalOrVertical arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.spacedBy-0680j_4(3.0f);
        HorizontalOrVertical arrangement$HorizontalOrVertical1 = Arrangement.INSTANCE.spacedBy-0680j_4(3.0f);
        LazyGridDslKt.LazyVerticalGrid(new Adaptive(110.0f, null), modifier1, null, null, false, arrangement$HorizontalOrVertical1, arrangement$HorizontalOrVertical0, null, false, new o(list0, function40), composer1, 0x1B0000, 412);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, 17, modifier0, list0, function40));
        }
    }
}

