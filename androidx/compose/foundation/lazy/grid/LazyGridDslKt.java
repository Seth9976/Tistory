package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import c0.b;
import c0.c;
import c0.d;
import c0.e;
import c0.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008C\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001A\u0080\u0001\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\b2\u0017\u0010\u0015\u001A\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u00A2\u0006\u0002\b\u0014H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\u0080\u0001\u0010\u0019\u001A\u00020\u00132\u0006\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\b2\u0017\u0010\u0015\u001A\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u00A2\u0006\u0002\b\u0014H\u0007\u00A2\u0006\u0004\b\u0019\u0010\u001A\u001A\u00DD\u0001\u0010\u001D\u001A\u00020\u0013\"\u0004\b\u0000\u0010\u001B*\u00020\u00122\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u001C2%\b\n\u0010\"\u001A\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!\u0018\u00010\u001120\b\n\u0010&\u001A*\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020%\u0018\u00010#\u00A2\u0006\u0002\b\u00142%\b\n\u0010\'\u001A\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0006\u0012\u0004\u0018\u00010!0\u001123\b\u0004\u0010*\u001A-\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00130#\u00A2\u0006\u0002\b)\u00A2\u0006\u0002\b\u0014H\u0086\b\u00A2\u0006\u0004\b\u001D\u0010+\u001A\u00B1\u0002\u0010/\u001A\u00020\u0013\"\u0004\b\u0000\u0010\u001B*\u00020\u00122\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u001C2:\b\n\u0010\"\u001A4\u0012\u0013\u0012\u00110,\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!\u0018\u00010#2E\b\n\u0010&\u001A?\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110,\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020%\u0018\u00010.\u00A2\u0006\u0002\b\u00142:\b\u0006\u0010\'\u001A4\u0012\u0013\u0012\u00110,\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0006\u0012\u0004\u0018\u00010!0#2H\b\u0004\u0010*\u001AB\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110,\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00130.\u00A2\u0006\u0002\b)\u00A2\u0006\u0002\b\u0014H\u0086\b\u00A2\u0006\u0004\b/\u00100\u001A\u00DD\u0001\u0010\u001D\u001A\u00020\u0013\"\u0004\b\u0000\u0010\u001B*\u00020\u00122\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u0000012%\b\n\u0010\"\u001A\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!\u0018\u00010\u001120\b\n\u0010&\u001A*\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020%\u0018\u00010#\u00A2\u0006\u0002\b\u00142%\b\n\u0010\'\u001A\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0006\u0012\u0004\u0018\u00010!0\u001123\b\u0004\u0010*\u001A-\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00130#\u00A2\u0006\u0002\b)\u00A2\u0006\u0002\b\u0014H\u0086\b\u00A2\u0006\u0004\b\u001D\u00102\u001A\u00B1\u0002\u0010/\u001A\u00020\u0013\"\u0004\b\u0000\u0010\u001B*\u00020\u00122\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u0000012:\b\n\u0010\"\u001A4\u0012\u0013\u0012\u00110,\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!\u0018\u00010#2E\b\n\u0010&\u001A?\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110,\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020%\u0018\u00010.\u00A2\u0006\u0002\b\u00142:\b\u0006\u0010\'\u001A4\u0012\u0013\u0012\u00110,\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0006\u0012\u0004\u0018\u00010!0#2H\b\u0004\u0010*\u001AB\u0012\u0004\u0012\u00020(\u0012\u0013\u0012\u00110,\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b\u001E\u0012\b\b\u001F\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00130.\u00A2\u0006\u0002\b)\u00A2\u0006\u0002\b\u0014H\u0086\b\u00A2\u0006\u0004\b/\u00103\u00A8\u00064"}, d2 = {"Landroidx/compose/foundation/lazy/grid/GridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "LazyVerticalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rows", "LazyHorizontalGrid", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "T", "", "items", "Lkotlin/ParameterName;", "name", "item", "", "key", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "span", "contentType", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "index", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,569:1\n148#2:570\n148#2:571\n1223#3,6:572\n1223#3,6:578\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n66#1:570\n119#1:571\n149#1:572,6\n182#1:578,6\n*E\n"})
public final class LazyGridDslKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LazyHorizontalGrid(@NotNull GridCells gridCells0, @Nullable Modifier modifier0, @Nullable LazyGridState lazyGridState0, @Nullable PaddingValues paddingValues0, boolean z, @Nullable Horizontal arrangement$Horizontal0, @Nullable Vertical arrangement$Vertical0, @Nullable FlingBehavior flingBehavior0, boolean z1, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        boolean z4;
        PaddingValues paddingValues1;
        Horizontal arrangement$Horizontal2;
        LazyGridState lazyGridState1;
        boolean z3;
        FlingBehavior flingBehavior1;
        Vertical arrangement$Vertical1;
        Vertical arrangement$Vertical2;
        boolean z6;
        int v3;
        PaddingValues paddingValues2;
        Horizontal arrangement$Horizontal3;
        LazyGridState lazyGridState2;
        Modifier modifier2;
        boolean z5;
        FlingBehavior flingBehavior2;
        Horizontal arrangement$Horizontal1;
        boolean z2;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(2123608858);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(gridCells0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changed(lazyGridState0) ? 0x80 : 0x100);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            z2 = z;
        }
        else if((v & 0x6000) == 0) {
            z2 = z;
            v2 |= (composer1.changed(z2) ? 0x4000 : 0x2000);
        }
        else {
            z2 = z;
        }
        if((v & 0x30000) == 0) {
            arrangement$Horizontal1 = arrangement$Horizontal0;
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(arrangement$Horizontal1) ? 0x10000 : 0x20000);
        }
        else {
            arrangement$Horizontal1 = arrangement$Horizontal0;
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changed(arrangement$Vertical0) ? 0x100000 : 0x80000);
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(flingBehavior0) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changed(z1) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
                if((v1 & 4) == 0) {
                    lazyGridState2 = lazyGridState0;
                }
                else {
                    lazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, composer1, 0, 3);
                    v2 &= -897;
                }
                PaddingValues paddingValues3 = (v1 & 8) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
                if((v1 & 16) != 0) {
                    z2 = false;
                }
                if((v1 & 0x20) != 0) {
                    arrangement$Horizontal1 = z2 ? Arrangement.INSTANCE.getEnd() : Arrangement.INSTANCE.getStart();
                    v2 &= 0xFFF8FFFF;
                }
                Vertical arrangement$Vertical3 = (v1 & 0x40) == 0 ? arrangement$Vertical0 : Arrangement.INSTANCE.getTop();
                if((v1 & 0x80) == 0) {
                    flingBehavior2 = flingBehavior0;
                }
                else {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composer1, 6);
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) == 0) {
                    z5 = z1;
                    paddingValues2 = paddingValues3;
                    arrangement$Horizontal3 = arrangement$Horizontal1;
                    flingBehavior1 = flingBehavior2;
                }
                else {
                    paddingValues2 = paddingValues3;
                    arrangement$Horizontal3 = arrangement$Horizontal1;
                    flingBehavior1 = flingBehavior2;
                    z5 = true;
                }
                v3 = v2;
                z6 = z2;
                arrangement$Vertical2 = arrangement$Vertical3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                flingBehavior1 = flingBehavior0;
                z5 = z1;
                modifier2 = modifier1;
                lazyGridState2 = lazyGridState0;
                arrangement$Horizontal3 = arrangement$Horizontal1;
                paddingValues2 = paddingValues0;
                v3 = v2;
                z6 = z2;
                arrangement$Vertical2 = arrangement$Vertical0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2123608858, v3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:126)");
            }
            int v4 = v3 & 14 | v3 >> 15 & 0x70 | v3 >> 3 & 0x380;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-741512409, v4, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:181)");
            }
            int v5 = ((6 ^ v4 & 14) <= 4 || !composer1.changed(gridCells0)) && (v4 & 6) != 4 ? 0 : 1;
            int v6 = ((v4 & 0x70 ^ 0x30) <= 0x20 || !composer1.changed(arrangement$Vertical2)) && (v4 & 0x30) != 0x20 ? 0 : 1;
            int v7 = ((v4 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(paddingValues2)) && (v4 & 0x180) != 0x100 ? 0 : 1;
            b b0 = composer1.rememberedValue();
            if((v5 | v6 | v7) != 0 || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(new f(paddingValues2, gridCells0, arrangement$Vertical2));
                composer1.updateRememberedValue(b0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            LazyGridKt.LazyGrid(modifier2, lazyGridState2, b0, paddingValues2, z6, false, flingBehavior1, z5, arrangement$Vertical2, arrangement$Horizontal3, function10, composer1, v3 >> 3 & 14 | 0x30000 | v3 >> 3 & 0x70 | v3 & 0x1C00 | 0xE000 & v3 | 0x380000 & v3 >> 3 | 0x1C00000 & v3 >> 3 | v3 << 6 & 0xE000000 | v3 << 12 & 0x70000000, v3 >> 27 & 14, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z6;
            modifier1 = modifier2;
            lazyGridState1 = lazyGridState2;
            arrangement$Vertical1 = arrangement$Vertical2;
            arrangement$Horizontal2 = arrangement$Horizontal3;
            z3 = z5;
            paddingValues1 = paddingValues2;
        }
        else {
            composer1.skipToGroupEnd();
            arrangement$Vertical1 = arrangement$Vertical0;
            flingBehavior1 = flingBehavior0;
            z3 = z1;
            lazyGridState1 = lazyGridState0;
            arrangement$Horizontal2 = arrangement$Horizontal1;
            paddingValues1 = paddingValues0;
            z4 = z2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(v, v1, flingBehavior1, arrangement$Horizontal2, arrangement$Vertical1, paddingValues1, gridCells0, lazyGridState1, modifier1, function10, z4, z3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LazyVerticalGrid(@NotNull GridCells gridCells0, @Nullable Modifier modifier0, @Nullable LazyGridState lazyGridState0, @Nullable PaddingValues paddingValues0, boolean z, @Nullable Vertical arrangement$Vertical0, @Nullable Horizontal arrangement$Horizontal0, @Nullable FlingBehavior flingBehavior0, boolean z1, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        boolean z4;
        PaddingValues paddingValues1;
        Vertical arrangement$Vertical1;
        LazyGridState lazyGridState1;
        boolean z3;
        FlingBehavior flingBehavior1;
        Horizontal arrangement$Horizontal1;
        Horizontal arrangement$Horizontal2;
        boolean z6;
        int v4;
        PaddingValues paddingValues2;
        Vertical arrangement$Vertical2;
        LazyGridState lazyGridState2;
        Modifier modifier2;
        boolean z5;
        FlingBehavior flingBehavior2;
        Vertical arrangement$Vertical3;
        boolean z2;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x588990D0);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(gridCells0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v & 0x30) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changed(lazyGridState0) ? 0x80 : 0x100);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            z2 = z;
        }
        else if((v & 0x6000) == 0) {
            z2 = z;
            v2 |= (composer1.changed(z2) ? 0x4000 : 0x2000);
        }
        else {
            z2 = z;
        }
        if((v & 0x30000) == 0) {
            v2 |= ((v1 & 0x20) != 0 || !composer1.changed(arrangement$Vertical0) ? 0x10000 : 0x20000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changed(arrangement$Horizontal0) ? 0x100000 : 0x80000);
        }
        if((v & 0xC00000) == 0) {
            v2 |= ((v1 & 0x80) != 0 || !composer1.changed(flingBehavior0) ? 0x400000 : 0x800000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changed(z1) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 306783379) != 306783378 || !composer1.getSkipping()) {
            composer1.startDefaults();
            int v3 = 0;
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v1 & 2) == 0 ? modifier1 : Modifier.Companion;
                if((v1 & 4) == 0) {
                    lazyGridState2 = lazyGridState0;
                }
                else {
                    lazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, composer1, 0, 3);
                    v2 &= -897;
                }
                PaddingValues paddingValues3 = (v1 & 8) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
                if((v1 & 16) != 0) {
                    z2 = false;
                }
                if((v1 & 0x20) == 0) {
                    arrangement$Vertical3 = arrangement$Vertical0;
                }
                else {
                    arrangement$Vertical3 = z2 ? Arrangement.INSTANCE.getBottom() : Arrangement.INSTANCE.getTop();
                    v2 &= 0xFFF8FFFF;
                }
                Horizontal arrangement$Horizontal3 = (v1 & 0x40) == 0 ? arrangement$Horizontal0 : Arrangement.INSTANCE.getStart();
                if((v1 & 0x80) == 0) {
                    flingBehavior2 = flingBehavior0;
                }
                else {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composer1, 6);
                    v2 &= 0xFE3FFFFF;
                }
                if((v1 & 0x100) == 0) {
                    z5 = z1;
                    paddingValues2 = paddingValues3;
                    arrangement$Vertical2 = arrangement$Vertical3;
                    flingBehavior1 = flingBehavior2;
                }
                else {
                    paddingValues2 = paddingValues3;
                    arrangement$Vertical2 = arrangement$Vertical3;
                    flingBehavior1 = flingBehavior2;
                    z5 = true;
                }
                v4 = v2;
                z6 = z2;
                arrangement$Horizontal2 = arrangement$Horizontal3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 0x20) != 0) {
                    v2 &= 0xFFF8FFFF;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                flingBehavior1 = flingBehavior0;
                z5 = z1;
                modifier2 = modifier1;
                lazyGridState2 = lazyGridState0;
                arrangement$Vertical2 = arrangement$Vertical0;
                paddingValues2 = paddingValues0;
                v4 = v2;
                z6 = z2;
                arrangement$Horizontal2 = arrangement$Horizontal0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x588990D0, v4, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:73)");
            }
            int v5 = v4 & 14 | v4 >> 15 & 0x70 | v4 >> 3 & 0x380;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x614D4906, v5, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
            }
            int v6 = ((v5 & 14 ^ 6) <= 4 || !composer1.changed(gridCells0)) && (v5 & 6) != 4 ? 0 : 1;
            int v7 = ((v5 & 0x70 ^ 0x30) <= 0x20 || !composer1.changed(arrangement$Horizontal2)) && (v5 & 0x30) != 0x20 ? 0 : 1;
            if((v5 & 0x380 ^ 0x180) > 0x100 && composer1.changed(paddingValues2) || (v5 & 0x180) == 0x100) {
                v3 = 1;
            }
            b b0 = composer1.rememberedValue();
            if((v3 | (v6 | v7)) != 0 || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(new e(paddingValues2, gridCells0, arrangement$Horizontal2));
                composer1.updateRememberedValue(b0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            LazyGridKt.LazyGrid(modifier2, lazyGridState2, b0, paddingValues2, z6, true, flingBehavior1, z5, arrangement$Vertical2, arrangement$Horizontal2, function10, composer1, v4 >> 3 & 14 | 0x30000 | v4 >> 3 & 0x70 | v4 & 0x1C00 | 0xE000 & v4 | 0x380000 & v4 >> 3 | v4 >> 3 & 0x1C00000 | 0xE000000 & v4 << 9 | v4 << 9 & 0x70000000, v4 >> 27 & 14, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z6;
            modifier1 = modifier2;
            lazyGridState1 = lazyGridState2;
            arrangement$Horizontal1 = arrangement$Horizontal2;
            arrangement$Vertical1 = arrangement$Vertical2;
            z3 = z5;
            paddingValues1 = paddingValues2;
        }
        else {
            composer1.skipToGroupEnd();
            arrangement$Horizontal1 = arrangement$Horizontal0;
            flingBehavior1 = flingBehavior0;
            z3 = z1;
            lazyGridState1 = lazyGridState0;
            arrangement$Vertical1 = arrangement$Vertical0;
            paddingValues1 = paddingValues0;
            z4 = z2;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(v, v1, flingBehavior1, arrangement$Horizontal1, arrangement$Vertical1, paddingValues1, gridCells0, lazyGridState1, modifier1, function10, z4, z3));
        }
    }

    public static final List access$calculateCellsCrossAxisSizeImpl(int v, int v1, int v2) {
        int v3 = v - (v1 - 1) * v2;
        List list0 = new ArrayList(v1);
        for(int v4 = 0; v4 < v1; ++v4) {
            ((ArrayList)list0).add(((int)((v4 >= v3 % v1 ? 0 : 1) + v3 / v1)));
        }
        return list0;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void items(@NotNull LazyGridScope lazyGridScope0, @NotNull List list0, @Nullable Function1 function10, @Nullable Function2 function20, @NotNull Function1 function11, @NotNull Function4 function40) {
        int v = list0.size();
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.3 lazyGridDslKt$items$30 = null;
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.2 lazyGridDslKt$items$20 = function10 == null ? null : new Function1(function10, list0) {
            public final Function1 w;
            public final List x;

            {
                this.w = function10;
                this.x = list0;
                super(1);
            }

            @NotNull
            public final Object invoke(int v) {
                Object object0 = this.x.get(v);
                return this.w.invoke(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        if(function20 != null) {
            lazyGridDslKt$items$30 = new Function2(function20, list0) {
                public final Function2 w;
                public final List x;

                {
                    this.w = function20;
                    this.x = list0;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    return GridItemSpan.box-impl(this.invoke-_-orMbw(((LazyGridItemSpanScope)object0), ((Number)object1).intValue()));
                }

                public final long invoke-_-orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
                    Object object0 = this.x.get(v);
                    return ((GridItemSpan)this.w.invoke(lazyGridItemSpanScope0, object0)).unbox-impl();
                }
            };
        }
        lazyGridScope0.items(v, lazyGridDslKt$items$20, lazyGridDslKt$items$30, new Function1(function11, list0) {
            public final Function1 w;
            public final List x;

            {
                this.w = function10;
                this.x = list0;
                super(1);
            }

            @Nullable
            public final Object invoke(int v) {
                Object object0 = this.x.get(v);
                return this.w.invoke(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        }, ComposableLambdaKt.composableLambdaInstance(0x29B3C0FE, true, new Function4(function40, list0) {
            public final Function4 w;
            public final List x;

            {
                this.w = function40;
                this.x = list0;
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                this.invoke(((LazyGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope0, int v, @Nullable Composer composer0, int v1) {
                int v2 = (v1 & 6) == 0 ? (composer0.changed(lazyGridItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x30) == 0) {
                    v2 |= (composer0.changed(v) ? 0x20 : 16);
                }
                if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x29B3C0FE, v2, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
                }
                Object object0 = this.x.get(v);
                this.w.invoke(lazyGridItemScope0, object0, composer0, ((int)(v2 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void items(@NotNull LazyGridScope lazyGridScope0, @NotNull Object[] arr_object, @Nullable Function1 function10, @Nullable Function2 function20, @NotNull Function1 function11, @NotNull Function4 function40) {
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.8 lazyGridDslKt$items$80 = null;
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.7 lazyGridDslKt$items$70 = function10 == null ? null : new Function1(function10, arr_object) {
            public final Function1 w;
            public final Object[] x;

            {
                this.w = function10;
                this.x = arr_object;
                super(1);
            }

            @NotNull
            public final Object invoke(int v) {
                return this.w.invoke(this.x[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        if(function20 != null) {
            lazyGridDslKt$items$80 = new Function2(function20, arr_object) {
                public final Function2 w;
                public final Object[] x;

                {
                    this.w = function20;
                    this.x = arr_object;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    return GridItemSpan.box-impl(this.invoke-_-orMbw(((LazyGridItemSpanScope)object0), ((Number)object1).intValue()));
                }

                public final long invoke-_-orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
                    return ((GridItemSpan)this.w.invoke(lazyGridItemSpanScope0, this.x[v])).unbox-impl();
                }
            };
        }
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.9 lazyGridDslKt$items$90 = new Function1(function11, arr_object) {
            public final Function1 w;
            public final Object[] x;

            {
                this.w = function10;
                this.x = arr_object;
                super(1);
            }

            @Nullable
            public final Object invoke(int v) {
                return this.w.invoke(this.x[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(407562193, true, new Function4(function40, arr_object) {
            public final Function4 w;
            public final Object[] x;

            {
                this.w = function40;
                this.x = arr_object;
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                this.invoke(((LazyGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope0, int v, @Nullable Composer composer0, int v1) {
                int v2 = (v1 & 6) == 0 ? (composer0.changed(lazyGridItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x30) == 0) {
                    v2 |= (composer0.changed(v) ? 0x20 : 16);
                }
                if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407562193, v2, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:532)");
                }
                this.w.invoke(lazyGridItemScope0, this.x[v], composer0, ((int)(v2 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        lazyGridScope0.items(arr_object.length, lazyGridDslKt$items$70, lazyGridDslKt$items$80, lazyGridDslKt$items$90, composableLambda0);
    }

    public static void items$default(LazyGridScope lazyGridScope0, List list0, Function1 function10, Function2 function20, Function1 function11, Function4 function40, int v, Object object0) {
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.3 lazyGridDslKt$items$30 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            function20 = null;
        }
        if((v & 8) != 0) {
            function11 = androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1.INSTANCE;
        }
        int v1 = list0.size();
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.2 lazyGridDslKt$items$20 = function10 == null ? null : new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.2(function10, list0);
        if(function20 != null) {
            lazyGridDslKt$items$30 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.3(function20, list0);
        }
        lazyGridScope0.items(v1, lazyGridDslKt$items$20, lazyGridDslKt$items$30, new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.4(function11, list0), ComposableLambdaKt.composableLambdaInstance(0x29B3C0FE, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.5(function40, list0)));

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$1\n*L\n1#1,569:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1 extends Lambda implements Function1 {
            public static final androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1 INSTANCE;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1.INSTANCE = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1();
            }

            public androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return null;
            }

            @Nullable
            public final Void invoke(Object object0) [...] // Inlined contents
        }

    }

    public static void items$default(LazyGridScope lazyGridScope0, Object[] arr_object, Function1 function10, Function2 function20, Function1 function11, Function4 function40, int v, Object object0) {
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.8 lazyGridDslKt$items$80 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            function20 = null;
        }
        if((v & 8) != 0) {
            function11 = androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6.INSTANCE;
        }
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.7 lazyGridDslKt$items$70 = function10 == null ? null : new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.7(function10, arr_object);
        if(function20 != null) {
            lazyGridDslKt$items$80 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.8(function20, arr_object);
        }
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.9 lazyGridDslKt$items$90 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.9(function11, arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(407562193, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.10(function40, arr_object));
        lazyGridScope0.items(arr_object.length, lazyGridDslKt$items$70, lazyGridDslKt$items$80, lazyGridDslKt$items$90, composableLambda0);

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$6\n*L\n1#1,569:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6 extends Lambda implements Function1 {
            public static final androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6 INSTANCE;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6.INSTANCE = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6();
            }

            public androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return null;
            }

            @Nullable
            public final Void invoke(Object object0) [...] // Inlined contents
        }

    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void itemsIndexed(@NotNull LazyGridScope lazyGridScope0, @NotNull List list0, @Nullable Function2 function20, @Nullable Function3 function30, @NotNull Function2 function21, @NotNull Function5 function50) {
        int v = list0.size();
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.3 lazyGridDslKt$itemsIndexed$30 = null;
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.2 lazyGridDslKt$itemsIndexed$20 = function20 == null ? null : new Function1(function20, list0) {
            public final Function2 w;
            public final List x;

            {
                this.w = function20;
                this.x = list0;
                super(1);
            }

            @NotNull
            public final Object invoke(int v) {
                Object object0 = this.x.get(v);
                return this.w.invoke(v, object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        if(function30 != null) {
            lazyGridDslKt$itemsIndexed$30 = new Function2(function30, list0) {
                public final Function3 w;
                public final List x;

                {
                    this.w = function30;
                    this.x = list0;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    return GridItemSpan.box-impl(this.invoke-_-orMbw(((LazyGridItemSpanScope)object0), ((Number)object1).intValue()));
                }

                public final long invoke-_-orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
                    Object object0 = this.x.get(v);
                    return ((GridItemSpan)this.w.invoke(lazyGridItemSpanScope0, v, object0)).unbox-impl();
                }
            };
        }
        lazyGridScope0.items(v, lazyGridDslKt$itemsIndexed$20, lazyGridDslKt$itemsIndexed$30, new Function1(function21, list0) {
            public final Function2 w;
            public final List x;

            {
                this.w = function20;
                this.x = list0;
                super(1);
            }

            @Nullable
            public final Object invoke(int v) {
                Object object0 = this.x.get(v);
                return this.w.invoke(v, object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        }, ComposableLambdaKt.composableLambdaInstance(0x49456F69, true, new Function4(function50, list0) {
            public final Function5 w;
            public final List x;

            {
                this.w = function50;
                this.x = list0;
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                this.invoke(((LazyGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope0, int v, @Nullable Composer composer0, int v1) {
                int v2 = (v1 & 6) == 0 ? (composer0.changed(lazyGridItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x30) == 0) {
                    v2 |= (composer0.changed(v) ? 0x20 : 16);
                }
                if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x49456F69, v2, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:498)");
                }
                Object object0 = this.x.get(v);
                this.w.invoke(lazyGridItemScope0, v, object0, composer0, ((int)(v2 & 0x7E)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void itemsIndexed(@NotNull LazyGridScope lazyGridScope0, @NotNull Object[] arr_object, @Nullable Function2 function20, @Nullable Function3 function30, @NotNull Function2 function21, @NotNull Function5 function50) {
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.8 lazyGridDslKt$itemsIndexed$80 = null;
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.7 lazyGridDslKt$itemsIndexed$70 = function20 == null ? null : new Function1(function20, arr_object) {
            public final Function2 w;
            public final Object[] x;

            {
                this.w = function20;
                this.x = arr_object;
                super(1);
            }

            @NotNull
            public final Object invoke(int v) {
                return this.w.invoke(v, this.x[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        if(function30 != null) {
            lazyGridDslKt$itemsIndexed$80 = new Function2(function30, arr_object) {
                public final Function3 w;
                public final Object[] x;

                {
                    this.w = function30;
                    this.x = arr_object;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    return GridItemSpan.box-impl(this.invoke-_-orMbw(((LazyGridItemSpanScope)object0), ((Number)object1).intValue()));
                }

                public final long invoke-_-orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope0, int v) {
                    return ((GridItemSpan)this.w.invoke(lazyGridItemSpanScope0, v, this.x[v])).unbox-impl();
                }
            };
        }
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.9 lazyGridDslKt$itemsIndexed$90 = new Function1(function21, arr_object) {
            public final Function2 w;
            public final Object[] x;

            {
                this.w = function20;
                this.x = arr_object;
                super(1);
            }

            @Nullable
            public final Object invoke(int v) {
                return this.w.invoke(v, this.x[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xC9AC493E, true, new Function4(function50, arr_object) {
            public final Function5 w;
            public final Object[] x;

            {
                this.w = function50;
                this.x = arr_object;
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                this.invoke(((LazyGridItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull LazyGridItemScope lazyGridItemScope0, int v, @Nullable Composer composer0, int v1) {
                int v2 = (v1 & 6) == 0 ? (composer0.changed(lazyGridItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x30) == 0) {
                    v2 |= (composer0.changed(v) ? 0x20 : 16);
                }
                if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xC9AC493E, v2, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:566)");
                }
                this.w.invoke(lazyGridItemScope0, v, this.x[v], composer0, ((int)(v2 & 0x7E)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        lazyGridScope0.items(arr_object.length, lazyGridDslKt$itemsIndexed$70, lazyGridDslKt$itemsIndexed$80, lazyGridDslKt$itemsIndexed$90, composableLambda0);
    }

    public static void itemsIndexed$default(LazyGridScope lazyGridScope0, List list0, Function2 function20, Function3 function30, Function2 function21, Function5 function50, int v, Object object0) {
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.3 lazyGridDslKt$itemsIndexed$30 = null;
        if((v & 2) != 0) {
            function20 = null;
        }
        if((v & 4) != 0) {
            function30 = null;
        }
        if((v & 8) != 0) {
            function21 = androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1.INSTANCE;
        }
        int v1 = list0.size();
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.2 lazyGridDslKt$itemsIndexed$20 = function20 == null ? null : new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.2(function20, list0);
        if(function30 != null) {
            lazyGridDslKt$itemsIndexed$30 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.3(function30, list0);
        }
        lazyGridScope0.items(v1, lazyGridDslKt$itemsIndexed$20, lazyGridDslKt$itemsIndexed$30, new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.4(function21, list0), ComposableLambdaKt.composableLambdaInstance(0x49456F69, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.5(function50, list0)));

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke", "(ILjava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$1\n*L\n1#1,569:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1 extends Lambda implements Function2 {
            public static final androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1 INSTANCE;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1.INSTANCE = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1();
            }

            public androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Number)object0).intValue(), object1);
            }

            @Nullable
            public final Void invoke(int v, Object object0) {
                return null;
            }
        }

    }

    public static void itemsIndexed$default(LazyGridScope lazyGridScope0, Object[] arr_object, Function2 function20, Function3 function30, Function2 function21, Function5 function50, int v, Object object0) {
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.8 lazyGridDslKt$itemsIndexed$80 = null;
        if((v & 2) != 0) {
            function20 = null;
        }
        if((v & 4) != 0) {
            function30 = null;
        }
        if((v & 8) != 0) {
            function21 = androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6.INSTANCE;
        }
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.7 lazyGridDslKt$itemsIndexed$70 = function20 == null ? null : new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.7(function20, arr_object);
        if(function30 != null) {
            lazyGridDslKt$itemsIndexed$80 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.8(function30, arr_object);
        }
        androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.9 lazyGridDslKt$itemsIndexed$90 = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.9(function21, arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xC9AC493E, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.10(function50, arr_object));
        lazyGridScope0.items(arr_object.length, lazyGridDslKt$itemsIndexed$70, lazyGridDslKt$itemsIndexed$80, lazyGridDslKt$itemsIndexed$90, composableLambda0);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke", "(ILjava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$6\n*L\n1#1,569:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6 extends Lambda implements Function2 {
            public static final androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6 INSTANCE;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6.INSTANCE = new androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6();
            }

            public androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Number)object0).intValue(), object1);
            }

            @Nullable
            public final Void invoke(int v, Object object0) {
                return null;
            }
        }

    }
}

