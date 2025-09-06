package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
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
import e0.a;
import e0.b;
import e0.c;
import e0.d;
import e0.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001A\u0083\u0001\u0010\u0018\u001A\u00020\u00132\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\b2\u0017\u0010\u0015\u001A\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u00A2\u0006\u0002\b\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\u0083\u0001\u0010\u001F\u001A\u00020\u00132\u0006\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u001B\u001A\u00020\u001A2\b\b\u0002\u0010\u001C\u001A\u00020\n2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0010\u001A\u00020\b2\u0017\u0010\u0015\u001A\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u00A2\u0006\u0002\b\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001E\u001A\u00D2\u0001\u0010\"\u001A\u00020\u0013\"\u0004\b\u0000\u0010 *\u00020\u00122\f\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000!2%\b\n\u0010\'\u001A\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&\u0018\u00010\u00112%\b\u0006\u0010(\u001A\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0006\u0012\u0004\u0018\u00010&0\u00112%\b\n\u0010*\u001A\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020)\u0018\u00010\u001123\b\u0004\u0010.\u001A-\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00130+\u00A2\u0006\u0002\b-\u00A2\u0006\u0002\b\u0014H\u0086\b\u00A2\u0006\u0004\b\"\u0010/\u001A\u00A6\u0002\u00103\u001A\u00020\u0013\"\u0004\b\u0000\u0010 *\u00020\u00122\f\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000!2:\b\n\u0010\'\u001A4\u0012\u0013\u0012\u001100\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&\u0018\u00010+2:\b\u0006\u0010(\u001A4\u0012\u0013\u0012\u001100\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0006\u0012\u0004\u0018\u00010&0+2:\b\n\u0010*\u001A4\u0012\u0013\u0012\u001100\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020)\u0018\u00010+2H\b\u0004\u0010.\u001AB\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u001100\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u001302\u00A2\u0006\u0002\b-\u00A2\u0006\u0002\b\u0014H\u0086\b\u00A2\u0006\u0004\b3\u00104\u001A\u00D2\u0001\u0010\"\u001A\u00020\u0013\"\u0004\b\u0000\u0010 *\u00020\u00122\f\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u0000052%\b\n\u0010\'\u001A\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&\u0018\u00010\u00112%\b\u0006\u0010(\u001A\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0006\u0012\u0004\u0018\u00010&0\u00112%\b\n\u0010*\u001A\u001F\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020)\u0018\u00010\u001123\b\u0004\u0010.\u001A-\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00130+\u00A2\u0006\u0002\b-\u00A2\u0006\u0002\b\u0014H\u0086\b\u00A2\u0006\u0004\b\"\u00106\u001A\u00A6\u0002\u00103\u001A\u00020\u0013\"\u0004\b\u0000\u0010 *\u00020\u00122\f\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u0000052:\b\n\u0010\'\u001A4\u0012\u0013\u0012\u001100\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&\u0018\u00010+2:\b\u0006\u0010(\u001A4\u0012\u0013\u0012\u001100\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0006\u0012\u0004\u0018\u00010&0+2:\b\n\u0010*\u001A4\u0012\u0013\u0012\u001100\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020)\u0018\u00010+2H\b\u0004\u0010.\u001AB\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u001100\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(1\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u001302\u00A2\u0006\u0002\b-\u00A2\u0006\u0002\b\u0014H\u0086\b\u00A2\u0006\u0004\b3\u00107\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00068"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "columns", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/ui/unit/Dp;", "verticalItemSpacing", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "rows", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "horizontalItemSpacing", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyHorizontalStaggeredGrid", "T", "", "items", "Lkotlin/ParameterName;", "name", "item", "", "key", "contentType", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "span", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "itemContent", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "index", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,469:1\n148#2:470\n148#2:471\n148#2:472\n148#2:479\n148#2:480\n148#2:481\n1223#3,6:473\n1223#3,6:482\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n*L\n66#1:470\n68#1:471\n69#1:472\n156#1:479\n158#1:480\n159#1:481\n95#1:473,6\n185#1:482,6\n*E\n"})
public final class LazyStaggeredGridDslKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LazyHorizontalStaggeredGrid-cJHQLPU(@NotNull StaggeredGridCells staggeredGridCells0, @Nullable Modifier modifier0, @Nullable LazyStaggeredGridState lazyStaggeredGridState0, @Nullable PaddingValues paddingValues0, boolean z, @Nullable Vertical arrangement$Vertical0, float f, @Nullable FlingBehavior flingBehavior0, boolean z1, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        boolean z4;
        float f1;
        boolean z3;
        PaddingValues paddingValues1;
        Vertical arrangement$Vertical1;
        LazyStaggeredGridState lazyStaggeredGridState1;
        Modifier modifier1;
        FlingBehavior flingBehavior1;
        float f5;
        float f4;
        boolean z6;
        int v4;
        float f2;
        boolean z5;
        Vertical arrangement$Vertical2;
        LazyStaggeredGridState lazyStaggeredGridState2;
        boolean z2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-8666074);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(staggeredGridCells0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changedInstance(lazyStaggeredGridState0) ? 0x80 : 0x100);
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
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changed(arrangement$Vertical0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x180000) == 0) {
            v2 |= (composer1.changed(f) ? 0x100000 : 0x80000);
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
            int v3 = 1;
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) == 0) {
                    lazyStaggeredGridState2 = lazyStaggeredGridState0;
                }
                else {
                    lazyStaggeredGridState2 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composer1, 0, 3);
                    v2 &= -897;
                }
                paddingValues1 = (v1 & 8) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
                if((v1 & 16) != 0) {
                    z2 = false;
                }
                arrangement$Vertical2 = (v1 & 0x20) == 0 ? arrangement$Vertical0 : Arrangement.INSTANCE.spacedBy-0680j_4(0.0f);
                f2 = (v1 & 0x40) == 0 ? f : 0.0f;
                if((v1 & 0x80) == 0) {
                    flingBehavior1 = flingBehavior0;
                }
                else {
                    flingBehavior1 = ScrollableDefaults.INSTANCE.flingBehavior(composer1, 6);
                    v2 &= 0xFE3FFFFF;
                }
                v4 = v2;
                if((v1 & 0x100) == 0) {
                    z5 = z2;
                    z6 = z1;
                }
                else {
                    z5 = z2;
                    z6 = true;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                flingBehavior1 = flingBehavior0;
                modifier1 = modifier0;
                lazyStaggeredGridState2 = lazyStaggeredGridState0;
                arrangement$Vertical2 = arrangement$Vertical0;
                paddingValues1 = paddingValues0;
                z5 = z2;
                f2 = f;
                v4 = v2;
                z6 = z1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-8666074, v4, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:162)");
            }
            Orientation orientation0 = Orientation.Horizontal;
            float f3 = arrangement$Vertical2.getSpacing-D9Ej5fM();
            int v5 = v4 >> 3 & 0x380 | (v4 & 14 | v4 >> 12 & 0x70);
            if(ComposerKt.isTraceInProgress()) {
                f4 = f3;
                f5 = f2;
                ComposerKt.traceEventStart(0xA4A9B0B3, v5, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:184)");
            }
            else {
                f4 = f3;
                f5 = f2;
            }
            int v6 = ((v5 & 14 ^ 6) <= 4 || !composer1.changed(staggeredGridCells0)) && (v5 & 6) != 4 ? 0 : 1;
            int v7 = ((v5 & 0x70 ^ 0x30) <= 0x20 || !composer1.changed(arrangement$Vertical2)) && (v5 & 0x30) != 0x20 ? 0 : 1;
            if(((v5 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(paddingValues1)) && (v5 & 0x180) != 0x100) {
                v3 = 0;
            }
            l l0 = composer1.rememberedValue();
            if((v6 | v7 | v3) != 0 || l0 == Composer.Companion.getEmpty()) {
                l0 = new l(new d(paddingValues1, staggeredGridCells0, arrangement$Vertical2));
                composer1.updateRememberedValue(l0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            LazyStaggeredGridKt.LazyStaggeredGrid-LJWHXA8(lazyStaggeredGridState2, orientation0, l0, modifier1, paddingValues1, z5, flingBehavior1, z6, f5, f4, function10, composer1, v4 >> 6 & 14 | 0x30 | v4 << 6 & 0x1C00 | v4 << 3 & 0xE000 | v4 << 3 & 0x70000 | 0x380000 & v4 >> 3 | v4 >> 3 & 0x1C00000 | v4 << 6 & 0xE000000, v4 >> 27 & 14, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z6;
            lazyStaggeredGridState1 = lazyStaggeredGridState2;
            arrangement$Vertical1 = arrangement$Vertical2;
            f1 = f5;
            z3 = z5;
        }
        else {
            composer1.skipToGroupEnd();
            flingBehavior1 = flingBehavior0;
            modifier1 = modifier0;
            lazyStaggeredGridState1 = lazyStaggeredGridState0;
            arrangement$Vertical1 = arrangement$Vertical0;
            paddingValues1 = paddingValues0;
            z3 = z2;
            f1 = f;
            z4 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(staggeredGridCells0, modifier1, lazyStaggeredGridState1, paddingValues1, z3, arrangement$Vertical1, f1, flingBehavior1, z4, function10, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LazyVerticalStaggeredGrid-zadm560(@NotNull StaggeredGridCells staggeredGridCells0, @Nullable Modifier modifier0, @Nullable LazyStaggeredGridState lazyStaggeredGridState0, @Nullable PaddingValues paddingValues0, boolean z, float f, @Nullable Horizontal arrangement$Horizontal0, @Nullable FlingBehavior flingBehavior0, boolean z1, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        FlingBehavior flingBehavior1;
        Horizontal arrangement$Horizontal1;
        boolean z4;
        PaddingValues paddingValues1;
        float f1;
        LazyStaggeredGridState lazyStaggeredGridState1;
        Modifier modifier1;
        boolean z3;
        float f5;
        float f4;
        boolean z6;
        int v4;
        boolean z5;
        float f2;
        LazyStaggeredGridState lazyStaggeredGridState2;
        FlingBehavior flingBehavior2;
        boolean z2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x650C9692);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(staggeredGridCells0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v2 |= ((v1 & 4) != 0 || !composer1.changedInstance(lazyStaggeredGridState0) ? 0x80 : 0x100);
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
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changed(f) ? 0x20000 : 0x10000);
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
            int v3 = 1;
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 4) == 0) {
                    lazyStaggeredGridState2 = lazyStaggeredGridState0;
                }
                else {
                    lazyStaggeredGridState2 = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composer1, 0, 3);
                    v2 &= -897;
                }
                paddingValues1 = (v1 & 8) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
                if((v1 & 16) != 0) {
                    z2 = false;
                }
                f2 = (v1 & 0x20) == 0 ? f : 0.0f;
                arrangement$Horizontal1 = (v1 & 0x40) == 0 ? arrangement$Horizontal0 : Arrangement.INSTANCE.spacedBy-0680j_4(0.0f);
                if((v1 & 0x80) == 0) {
                    flingBehavior2 = flingBehavior0;
                }
                else {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composer1, 6);
                    v2 &= 0xFE3FFFFF;
                }
                v4 = v2;
                if((v1 & 0x100) == 0) {
                    z5 = z2;
                    z6 = z1;
                }
                else {
                    z5 = z2;
                    z6 = true;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 4) != 0) {
                    v2 &= -897;
                }
                if((v1 & 0x80) != 0) {
                    v2 &= 0xFE3FFFFF;
                }
                flingBehavior2 = flingBehavior0;
                modifier1 = modifier0;
                lazyStaggeredGridState2 = lazyStaggeredGridState0;
                f2 = f;
                paddingValues1 = paddingValues0;
                z5 = z2;
                arrangement$Horizontal1 = arrangement$Horizontal0;
                v4 = v2;
                z6 = z1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x650C9692, v4, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:72)");
            }
            Orientation orientation0 = Orientation.Vertical;
            float f3 = arrangement$Horizontal1.getSpacing-D9Ej5fM();
            int v5 = v4 >> 3 & 0x380 | (v4 & 14 | v4 >> 15 & 0x70);
            if(ComposerKt.isTraceInProgress()) {
                f4 = f3;
                f5 = f2;
                ComposerKt.traceEventStart(0xB479F117, v5, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:94)");
            }
            else {
                f4 = f3;
                f5 = f2;
            }
            int v6 = ((v5 & 14 ^ 6) <= 4 || !composer1.changed(staggeredGridCells0)) && (v5 & 6) != 4 ? 0 : 1;
            int v7 = ((v5 & 0x70 ^ 0x30) <= 0x20 || !composer1.changed(arrangement$Horizontal1)) && (v5 & 0x30) != 0x20 ? 0 : 1;
            if(((v5 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(paddingValues1)) && (v5 & 0x180) != 0x100) {
                v3 = 0;
            }
            l l0 = composer1.rememberedValue();
            if((v6 | v7 | v3) != 0 || l0 == Composer.Companion.getEmpty()) {
                l0 = new l(new c(paddingValues1, staggeredGridCells0, arrangement$Horizontal1));
                composer1.updateRememberedValue(l0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            LazyStaggeredGridKt.LazyStaggeredGrid-LJWHXA8(lazyStaggeredGridState2, orientation0, l0, modifier1, paddingValues1, z5, flingBehavior2, z6, f5, f4, function10, composer1, v4 >> 6 & 14 | 0x30 | v4 << 6 & 0x1C00 | 0xE000 & v4 << 3 | v4 << 3 & 0x70000 | 0x380000 & v4 >> 3 | 0x1C00000 & v4 >> 3 | v4 << 9 & 0xE000000, v4 >> 27 & 14, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f5;
            flingBehavior1 = flingBehavior2;
            z3 = z6;
            lazyStaggeredGridState1 = lazyStaggeredGridState2;
            z4 = z5;
        }
        else {
            composer1.skipToGroupEnd();
            z3 = z1;
            modifier1 = modifier0;
            lazyStaggeredGridState1 = lazyStaggeredGridState0;
            f1 = f;
            paddingValues1 = paddingValues0;
            z4 = z2;
            arrangement$Horizontal1 = arrangement$Horizontal0;
            flingBehavior1 = flingBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(staggeredGridCells0, modifier1, lazyStaggeredGridState1, paddingValues1, z4, f1, arrangement$Horizontal1, flingBehavior1, z3, function10, v, v1));
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void items(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope0, @NotNull List list0, @Nullable Function1 function10, @NotNull Function1 function11, @Nullable Function1 function12, @NotNull Function4 function40) {
        lazyStaggeredGridScope0.items(list0.size(), (function10 == null ? null : new Function1(function10, list0) {
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
        }), new Function1(function11, list0) {
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
        }, (function12 == null ? null : new Function1(function12, list0) {
            public final Function1 w;
            public final List x;

            {
                this.w = function10;
                this.x = list0;
                super(1);
            }

            @NotNull
            public final StaggeredGridItemSpan invoke(int v) {
                Object object0 = this.x.get(v);
                return (StaggeredGridItemSpan)this.w.invoke(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        }), ComposableLambdaKt.composableLambdaInstance(0xCB29BF61, true, new Function4(function40, list0) {
            public final Function4 w;
            public final List x;

            {
                this.w = function40;
                this.x = list0;
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
                    ComposerKt.traceEventStart(0xCB29BF61, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:345)");
                }
                Object object0 = this.x.get(v);
                this.w.invoke(lazyStaggeredGridItemScope0, object0, composer0, ((int)(v2 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void items(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope0, @NotNull Object[] arr_object, @Nullable Function1 function10, @NotNull Function1 function11, @Nullable Function1 function12, @NotNull Function4 function40) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.7.1 lazyStaggeredGridDslKt$items$7$10 = function10 == null ? null : new Function1(function10, arr_object) {
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
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.8 lazyStaggeredGridDslKt$items$80 = new Function1(function11, arr_object) {
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
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.9.1 lazyStaggeredGridDslKt$items$9$10 = function12 == null ? null : new Function1(function12, arr_object) {
            public final Function1 w;
            public final Object[] x;

            {
                this.w = function10;
                this.x = arr_object;
                super(1);
            }

            @NotNull
            public final StaggeredGridItemSpan invoke(int v) {
                return (StaggeredGridItemSpan)this.w.invoke(this.x[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(2101296000, true, new Function4(function40, arr_object) {
            public final Function4 w;
            public final Object[] x;

            {
                this.w = function40;
                this.x = arr_object;
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
                    ComposerKt.traceEventStart(2101296000, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:425)");
                }
                this.w.invoke(lazyStaggeredGridItemScope0, this.x[v], composer0, ((int)(v2 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        lazyStaggeredGridScope0.items(arr_object.length, lazyStaggeredGridDslKt$items$7$10, lazyStaggeredGridDslKt$items$80, lazyStaggeredGridDslKt$items$9$10, composableLambda0);
    }

    public static void items$default(LazyStaggeredGridScope lazyStaggeredGridScope0, List list0, Function1 function10, Function1 function11, Function1 function12, Function4 function40, int v, Object object0) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.4.1 lazyStaggeredGridDslKt$items$4$10 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            function11 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1.INSTANCE;
        }
        if((v & 8) != 0) {
            function12 = null;
        }
        int v1 = list0.size();
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.2.1 lazyStaggeredGridDslKt$items$2$10 = function10 == null ? null : new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.2.1(function10, list0);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.3 lazyStaggeredGridDslKt$items$30 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.3(function11, list0);
        if(function12 != null) {
            lazyStaggeredGridDslKt$items$4$10 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.4.1(function12, list0);
        }
        lazyStaggeredGridScope0.items(v1, lazyStaggeredGridDslKt$items$2$10, lazyStaggeredGridDslKt$items$30, lazyStaggeredGridDslKt$items$4$10, ComposableLambdaKt.composableLambdaInstance(0xCB29BF61, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.5(function40, list0)));

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$1\n*L\n1#1,469:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1 extends Lambda implements Function1 {
            public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1 INSTANCE;

            static {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1.INSTANCE = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1();
            }

            public androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1() {
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

    public static void items$default(LazyStaggeredGridScope lazyStaggeredGridScope0, Object[] arr_object, Function1 function10, Function1 function11, Function1 function12, Function4 function40, int v, Object object0) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.9.1 lazyStaggeredGridDslKt$items$9$10 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            function11 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6.INSTANCE;
        }
        if((v & 8) != 0) {
            function12 = null;
        }
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.7.1 lazyStaggeredGridDslKt$items$7$10 = function10 == null ? null : new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.7.1(function10, arr_object);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.8 lazyStaggeredGridDslKt$items$80 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.8(function11, arr_object);
        if(function12 != null) {
            lazyStaggeredGridDslKt$items$9$10 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.9.1(function12, arr_object);
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(2101296000, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.10(function40, arr_object));
        lazyStaggeredGridScope0.items(arr_object.length, lazyStaggeredGridDslKt$items$7$10, lazyStaggeredGridDslKt$items$80, lazyStaggeredGridDslKt$items$9$10, composableLambda0);

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$6\n*L\n1#1,469:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6 extends Lambda implements Function1 {
            public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6 INSTANCE;

            static {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6.INSTANCE = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6();
            }

            public androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6() {
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
    public static final void itemsIndexed(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope0, @NotNull List list0, @Nullable Function2 function20, @NotNull Function2 function21, @Nullable Function2 function22, @NotNull Function5 function50) {
        lazyStaggeredGridScope0.items(list0.size(), (function20 == null ? null : new Function1(function20, list0) {
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
        }), new Function1(function21, list0) {
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
        }, (function22 == null ? null : new Function1(function22, list0) {
            public final Function2 w;
            public final List x;

            {
                this.w = function20;
                this.x = list0;
                super(1);
            }

            @NotNull
            public final StaggeredGridItemSpan invoke(int v) {
                Object object0 = this.x.get(v);
                return (StaggeredGridItemSpan)this.w.invoke(v, object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        }), ComposableLambdaKt.composableLambdaInstance(0x10FA3898, true, new Function4(function50, list0) {
            public final Function5 w;
            public final List x;

            {
                this.w = function50;
                this.x = list0;
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
                Object object0 = this.x.get(v);
                this.w.invoke(lazyStaggeredGridItemScope0, v, object0, composer0, ((int)(v2 & 0x7E)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void itemsIndexed(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope0, @NotNull Object[] arr_object, @Nullable Function2 function20, @NotNull Function2 function21, @Nullable Function2 function22, @NotNull Function5 function50) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.7.1 lazyStaggeredGridDslKt$itemsIndexed$7$10 = function20 == null ? null : new Function1(function20, arr_object) {
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
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.8 lazyStaggeredGridDslKt$itemsIndexed$80 = new Function1(function21, arr_object) {
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
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.9.1 lazyStaggeredGridDslKt$itemsIndexed$9$10 = function22 == null ? null : new Function1(function22, arr_object) {
            public final Function2 w;
            public final Object[] x;

            {
                this.w = function20;
                this.x = arr_object;
                super(1);
            }

            @NotNull
            public final StaggeredGridItemSpan invoke(int v) {
                return (StaggeredGridItemSpan)this.w.invoke(v, this.x[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xD00C7DA1, true, new Function4(function50, arr_object) {
            public final Function5 w;
            public final Object[] x;

            {
                this.w = function50;
                this.x = arr_object;
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
                    ComposerKt.traceEventStart(0xD00C7DA1, v2, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:465)");
                }
                this.w.invoke(lazyStaggeredGridItemScope0, v, this.x[v], composer0, ((int)(v2 & 0x7E)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        lazyStaggeredGridScope0.items(arr_object.length, lazyStaggeredGridDslKt$itemsIndexed$7$10, lazyStaggeredGridDslKt$itemsIndexed$80, lazyStaggeredGridDslKt$itemsIndexed$9$10, composableLambda0);
    }

    public static void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope0, List list0, Function2 function20, Function2 function21, Function2 function22, Function5 function50, int v, Object object0) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.4.1 lazyStaggeredGridDslKt$itemsIndexed$4$10 = null;
        if((v & 2) != 0) {
            function20 = null;
        }
        if((v & 4) != 0) {
            function21 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1.INSTANCE;
        }
        if((v & 8) != 0) {
            function22 = null;
        }
        int v1 = list0.size();
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.2.1 lazyStaggeredGridDslKt$itemsIndexed$2$10 = function20 == null ? null : new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.2.1(function20, list0);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.3 lazyStaggeredGridDslKt$itemsIndexed$30 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.3(function21, list0);
        if(function22 != null) {
            lazyStaggeredGridDslKt$itemsIndexed$4$10 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.4.1(function22, list0);
        }
        lazyStaggeredGridScope0.items(v1, lazyStaggeredGridDslKt$itemsIndexed$2$10, lazyStaggeredGridDslKt$itemsIndexed$30, lazyStaggeredGridDslKt$itemsIndexed$4$10, ComposableLambdaKt.composableLambdaInstance(0x10FA3898, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.5(function50, list0)));

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke", "(ILjava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$1\n*L\n1#1,469:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1 extends Lambda implements Function2 {
            public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1 INSTANCE;

            static {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1.INSTANCE = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1();
            }

            public androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1() {
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

    public static void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope0, Object[] arr_object, Function2 function20, Function2 function21, Function2 function22, Function5 function50, int v, Object object0) {
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.9.1 lazyStaggeredGridDslKt$itemsIndexed$9$10 = null;
        if((v & 2) != 0) {
            function20 = null;
        }
        if((v & 4) != 0) {
            function21 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6.INSTANCE;
        }
        if((v & 8) != 0) {
            function22 = null;
        }
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.7.1 lazyStaggeredGridDslKt$itemsIndexed$7$10 = function20 == null ? null : new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.7.1(function20, arr_object);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.8 lazyStaggeredGridDslKt$itemsIndexed$80 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.8(function21, arr_object);
        if(function22 != null) {
            lazyStaggeredGridDslKt$itemsIndexed$9$10 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.9.1(function22, arr_object);
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xD00C7DA1, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.10(function50, arr_object));
        lazyStaggeredGridScope0.items(arr_object.length, lazyStaggeredGridDslKt$itemsIndexed$7$10, lazyStaggeredGridDslKt$itemsIndexed$80, lazyStaggeredGridDslKt$itemsIndexed$9$10, composableLambda0);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke", "(ILjava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$6\n*L\n1#1,469:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6 extends Lambda implements Function2 {
            public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6 INSTANCE;

            static {
                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6.INSTANCE = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6();
            }

            public androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6() {
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

