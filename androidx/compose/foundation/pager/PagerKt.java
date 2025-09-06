package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import f0.n;
import f0.o;
import f0.q;
import f0.r;
import f0.s;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.c;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u00E2\u0001\u0010&\u001A\u00020 2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u00102%\b\u0002\u0010\u0018\u001A\u001F\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u001B21\u0010#\u001A-\u0012\u0004\u0012\u00020\u001E\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001F\u0012\u0004\u0012\u00020 0\u001D\u00A2\u0006\u0002\b!\u00A2\u0006\u0002\b\"H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%\u001A\u00E2\u0001\u0010+\u001A\u00020 2\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010(\u001A\u00020\'2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\b\b\u0002\u0010\u0012\u001A\u00020\u00102%\b\u0002\u0010\u0018\u001A\u001F\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00132\b\b\u0002\u0010\u001A\u001A\u00020\u00192\b\b\u0002\u0010\u001C\u001A\u00020\u001B21\u0010#\u001A-\u0012\u0004\u0012\u00020\u001E\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001F\u0012\u0004\u0012\u00020 0\u001D\u00A2\u0006\u0002\b!\u00A2\u0006\u0002\b\"H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b)\u0010*\u001AS\u00104\u001A\u00020\b*\u00020\u001B2\u0006\u0010,\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010-\u001A\u00020\b2\u0006\u0010.\u001A\u00020\b2\u0006\u0010/\u001A\u00020\b2\u0006\u00100\u001A\u00020\b2\u0006\u00102\u001A\u0002012\u0006\u00103\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b4\u00105\u001A3\u00109\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u00106\u001A\u00020\u00102\u0006\u00108\u001A\u0002072\u0006\u0010\u0011\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b9\u0010:\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006;"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "", "beyondViewportPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "flingBehavior", "", "userScrollEnabled", "reverseLayout", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "key", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "pageContent", "HorizontalPager-oI3XNZo", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "HorizontalPager", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "VerticalPager-oI3XNZo", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "VerticalPager", "layoutSize", "spaceBetweenPages", "beforeContentPadding", "afterContentPadding", "currentPage", "", "currentPageOffsetFraction", "pageCount", "currentPageOffset", "(Landroidx/compose/foundation/gestures/snapping/SnapPosition;IIIIIIFI)I", "isVertical", "Lkotlinx/coroutines/CoroutineScope;", "scope", "pagerSemantics", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLkotlinx/coroutines/CoroutineScope;Z)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,511:1\n148#2:512\n148#2:513\n148#2:514\n148#2:515\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n110#1:512\n113#1:513\n197#1:514\n200#1:515\n*E\n"})
public final class PagerKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void HorizontalPager-oI3XNZo(@NotNull PagerState pagerState0, @Nullable Modifier modifier0, @Nullable PaddingValues paddingValues0, @Nullable PageSize pageSize0, int v, float f, @Nullable Vertical alignment$Vertical0, @Nullable TargetedFlingBehavior targetedFlingBehavior0, boolean z, boolean z1, @Nullable Function1 function10, @Nullable NestedScrollConnection nestedScrollConnection0, @Nullable SnapPosition snapPosition0, @NotNull Function4 function40, @Nullable Composer composer0, int v1, int v2, int v3) {
        PageSize pageSize1;
        int v11;
        float f1;
        NestedScrollConnection nestedScrollConnection1;
        boolean z3;
        TargetedFlingBehavior targetedFlingBehavior1;
        Modifier modifier1;
        SnapPosition snapPosition1;
        Function1 function11;
        boolean z2;
        Vertical alignment$Vertical1;
        PaddingValues paddingValues1;
        Function1 function12;
        int v13;
        TargetedFlingBehavior targetedFlingBehavior2;
        Modifier modifier2;
        float f2;
        int v12;
        SnapPosition snapPosition2;
        NestedScrollConnection nestedScrollConnection2;
        boolean z5;
        boolean z4;
        Vertical alignment$Vertical2;
        PageSize pageSize2;
        PaddingValues paddingValues2;
        int v18;
        NestedScrollConnection nestedScrollConnection3;
        TargetedFlingBehavior targetedFlingBehavior3;
        int v17;
        int v16;
        boolean z6;
        int v15;
        int v14;
        int v9;
        int v8;
        int v7;
        int v6;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x6F839C82);
        if((v3 & 1) == 0) {
            v4 = (v1 & 6) == 0 ? (composer1.changed(pagerState0) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v4 |= (composer1.changed(paddingValues0) ? 0x100 : 0x80);
        }
        int v5 = 0x400;
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v4 |= (composer1.changed(pageSize0) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v4 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v4 |= (composer1.changed(f) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v4 |= (composer1.changed(alignment$Vertical0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0xC00000) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(targetedFlingBehavior0) ? 0x400000 : 0x800000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v4 |= (composer1.changed(z) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) == 0) {
            if((v1 & 0x30000000) == 0) {
                v7 = v3 & 0x200;
                v4 |= (composer1.changed(z1) ? 0x20000000 : 0x10000000);
            }
            else {
                v7 = v3 & 0x200;
            }
            v6 = v4;
        }
        else {
            v6 = v4 | 0x30000000;
            v7 = v3 & 0x200;
        }
        if((v3 & 0x400) == 0) {
            v8 = (v2 & 6) == 0 ? v2 | (composer1.changedInstance(function10) ? 4 : 2) : v2;
        }
        else {
            v8 = v2 | 6;
        }
        if((v2 & 0x30) == 0) {
            v9 = v3 & 0x400;
            v8 |= ((v3 & 0x800) != 0 || !composer1.changedInstance(nestedScrollConnection0) ? 16 : 0x20);
        }
        else {
            v9 = v3 & 0x400;
        }
        int v10 = v8;
        if((v3 & 0x1000) != 0) {
            v10 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v10 |= (composer1.changed(snapPosition0) ? 0x100 : 0x80);
        }
        if((v3 & 0x2000) != 0) {
            v10 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            if(composer1.changedInstance(function40)) {
                v5 = 0x800;
            }
            v10 |= v5;
        }
        if((v6 & 306783379) != 306783378 || (v10 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                PaddingValues paddingValues3 = (v3 & 4) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
                PageSize pageSize3 = (v3 & 8) == 0 ? pageSize0 : (Density density0, int v, int v1) -> v;
                Vertical alignment$Vertical3 = (v3 & 0x40) == 0 ? alignment$Vertical0 : Alignment.Companion.getCenterVertically();
                if((v3 & 0x80) == 0) {
                    v14 = v10;
                    z6 = false;
                    v16 = v3 & 0x1000;
                    v17 = v7;
                    v15 = v9;
                    targetedFlingBehavior3 = targetedFlingBehavior0;
                }
                else {
                    v14 = v10;
                    v15 = v9;
                    z6 = false;
                    v16 = v3 & 0x1000;
                    v17 = v7;
                    targetedFlingBehavior3 = PagerDefaults.INSTANCE.flingBehavior(pagerState0, null, null, null, 0.0f, composer1, v6 & 14 | 0x30000, 30);
                    v6 &= 0xFE3FFFFF;
                }
                boolean z7 = (v3 & 0x100) == 0 ? z : true;
                if(v17 == 0) {
                    z6 = z1;
                }
                if((v3 & 0x800) == 0) {
                    nestedScrollConnection3 = nestedScrollConnection0;
                    v18 = v14;
                }
                else {
                    nestedScrollConnection3 = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState0, Orientation.Horizontal, composer1, v6 & 14 | 0x1B0);
                    v18 = v14 & 0xFFFFFF8F;
                }
                if(v16 == 0) {
                    snapPosition2 = snapPosition0;
                    targetedFlingBehavior2 = targetedFlingBehavior3;
                    z4 = z7;
                    nestedScrollConnection2 = nestedScrollConnection3;
                    v10 = v18;
                }
                else {
                    targetedFlingBehavior2 = targetedFlingBehavior3;
                    z4 = z7;
                    nestedScrollConnection2 = nestedScrollConnection3;
                    v10 = v18;
                    snapPosition2 = (int v, int v1, int v2, int v3, int v4, int v5) -> 0;
                }
                pageSize2 = pageSize3;
                v12 = (v3 & 16) == 0 ? v : 0;
                alignment$Vertical2 = alignment$Vertical3;
                z5 = z6;
                v13 = v6;
                function12 = v15 == 0 ? function10 : null;
                paddingValues2 = paddingValues3;
                f2 = (v3 & 0x20) == 0 ? f : 0.0f;
                modifier2 = modifier3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x80) != 0) {
                    v6 &= 0xFE3FFFFF;
                }
                if((v3 & 0x800) != 0) {
                    v10 &= 0xFFFFFF8F;
                }
                paddingValues2 = paddingValues0;
                pageSize2 = pageSize0;
                alignment$Vertical2 = alignment$Vertical0;
                z4 = z;
                z5 = z1;
                nestedScrollConnection2 = nestedScrollConnection0;
                snapPosition2 = snapPosition0;
                v12 = v;
                f2 = f;
                modifier2 = modifier0;
                targetedFlingBehavior2 = targetedFlingBehavior0;
                v13 = v6;
                function12 = function10;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6F839C82, v13, v10, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:124)");
            }
            LazyLayoutPagerKt.Pager-uYRUAWA(modifier2, pagerState0, paddingValues2, z5, Orientation.Horizontal, targetedFlingBehavior2, z4, v12, f2, pageSize2, nestedScrollConnection2, function12, Alignment.Companion.getCenterHorizontally(), alignment$Vertical2, snapPosition2, function40, composer1, v13 >> 3 & 14 | 0x6000 | v13 << 3 & 0x70 | v13 & 0x380 | v13 >> 18 & 0x1C00 | 0x70000 & v13 >> 6 | v13 >> 6 & 0x380000 | 0x1C00000 & v13 << 9 | v13 << 9 & 0xE000000 | v13 << 18 & 0x70000000, v13 >> 9 & 0x1C00 | (v10 >> 3 & 14 | 0x180 | v10 << 3 & 0x70) | 0xE000 & v10 << 6 | v10 << 6 & 0x70000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            paddingValues1 = paddingValues2;
            pageSize1 = pageSize2;
            v11 = v12;
            f1 = f2;
            alignment$Vertical1 = alignment$Vertical2;
            targetedFlingBehavior1 = targetedFlingBehavior2;
            z2 = z4;
            z3 = z5;
            function11 = function12;
            nestedScrollConnection1 = nestedScrollConnection2;
            snapPosition1 = snapPosition2;
        }
        else {
            composer1.skipToGroupEnd();
            paddingValues1 = paddingValues0;
            alignment$Vertical1 = alignment$Vertical0;
            z2 = z;
            function11 = function10;
            snapPosition1 = snapPosition0;
            modifier1 = modifier0;
            targetedFlingBehavior1 = targetedFlingBehavior0;
            z3 = z1;
            nestedScrollConnection1 = nestedScrollConnection0;
            f1 = f;
            v11 = v;
            pageSize1 = pageSize0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n(pagerState0, modifier1, paddingValues1, pageSize1, v11, f1, alignment$Vertical1, targetedFlingBehavior1, z2, z3, function11, nestedScrollConnection1, snapPosition1, function40, v1, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void VerticalPager-oI3XNZo(@NotNull PagerState pagerState0, @Nullable Modifier modifier0, @Nullable PaddingValues paddingValues0, @Nullable PageSize pageSize0, int v, float f, @Nullable Horizontal alignment$Horizontal0, @Nullable TargetedFlingBehavior targetedFlingBehavior0, boolean z, boolean z1, @Nullable Function1 function10, @Nullable NestedScrollConnection nestedScrollConnection0, @Nullable SnapPosition snapPosition0, @NotNull Function4 function40, @Nullable Composer composer0, int v1, int v2, int v3) {
        PageSize pageSize1;
        int v11;
        float f1;
        SnapPosition snapPosition1;
        boolean z3;
        TargetedFlingBehavior targetedFlingBehavior1;
        Modifier modifier1;
        NestedScrollConnection nestedScrollConnection1;
        Function1 function11;
        boolean z2;
        Horizontal alignment$Horizontal1;
        PaddingValues paddingValues1;
        Function1 function12;
        int v13;
        TargetedFlingBehavior targetedFlingBehavior2;
        Modifier modifier2;
        float f2;
        int v12;
        SnapPosition snapPosition2;
        NestedScrollConnection nestedScrollConnection2;
        boolean z5;
        boolean z4;
        Horizontal alignment$Horizontal2;
        PageSize pageSize2;
        PaddingValues paddingValues2;
        int v18;
        NestedScrollConnection nestedScrollConnection3;
        TargetedFlingBehavior targetedFlingBehavior3;
        int v17;
        int v16;
        boolean z6;
        int v15;
        int v14;
        int v9;
        int v8;
        int v7;
        int v6;
        int v4;
        Composer composer1 = composer0.startRestartGroup(909160706);
        if((v3 & 1) == 0) {
            v4 = (v1 & 6) == 0 ? (composer1.changed(pagerState0) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v4 |= (composer1.changed(paddingValues0) ? 0x100 : 0x80);
        }
        int v5 = 0x400;
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v4 |= (composer1.changed(pageSize0) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v4 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v4 |= (composer1.changed(f) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v4 |= (composer1.changed(alignment$Horizontal0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0xC00000) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(targetedFlingBehavior0) ? 0x400000 : 0x800000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v4 |= (composer1.changed(z) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) == 0) {
            if((v1 & 0x30000000) == 0) {
                v7 = v3 & 0x200;
                v4 |= (composer1.changed(z1) ? 0x20000000 : 0x10000000);
            }
            else {
                v7 = v3 & 0x200;
            }
            v6 = v4;
        }
        else {
            v6 = v4 | 0x30000000;
            v7 = v3 & 0x200;
        }
        if((v3 & 0x400) == 0) {
            v8 = (v2 & 6) == 0 ? v2 | (composer1.changedInstance(function10) ? 4 : 2) : v2;
        }
        else {
            v8 = v2 | 6;
        }
        if((v2 & 0x30) == 0) {
            v9 = v3 & 0x400;
            v8 |= ((v3 & 0x800) != 0 || !composer1.changedInstance(nestedScrollConnection0) ? 16 : 0x20);
        }
        else {
            v9 = v3 & 0x400;
        }
        int v10 = v8;
        if((v3 & 0x1000) != 0) {
            v10 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v10 |= (composer1.changed(snapPosition0) ? 0x100 : 0x80);
        }
        if((v3 & 0x2000) != 0) {
            v10 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            if(composer1.changedInstance(function40)) {
                v5 = 0x800;
            }
            v10 |= v5;
        }
        if((v6 & 306783379) != 306783378 || (v10 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v3 & 2) == 0 ? modifier0 : Modifier.Companion;
                PaddingValues paddingValues3 = (v3 & 4) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
                PageSize pageSize3 = (v3 & 8) == 0 ? pageSize0 : (Density density0, int v, int v1) -> v;
                Horizontal alignment$Horizontal3 = (v3 & 0x40) == 0 ? alignment$Horizontal0 : Alignment.Companion.getCenterHorizontally();
                if((v3 & 0x80) == 0) {
                    v14 = v10;
                    z6 = false;
                    v16 = v3 & 0x1000;
                    v17 = v7;
                    v15 = v9;
                    targetedFlingBehavior3 = targetedFlingBehavior0;
                }
                else {
                    v14 = v10;
                    v15 = v9;
                    z6 = false;
                    v16 = v3 & 0x1000;
                    v17 = v7;
                    targetedFlingBehavior3 = PagerDefaults.INSTANCE.flingBehavior(pagerState0, null, null, null, 0.0f, composer1, v6 & 14 | 0x30000, 30);
                    v6 &= 0xFE3FFFFF;
                }
                boolean z7 = (v3 & 0x100) == 0 ? z : true;
                if(v17 == 0) {
                    z6 = z1;
                }
                if((v3 & 0x800) == 0) {
                    nestedScrollConnection3 = nestedScrollConnection0;
                    v18 = v14;
                }
                else {
                    nestedScrollConnection3 = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState0, Orientation.Vertical, composer1, v6 & 14 | 0x1B0);
                    v18 = v14 & 0xFFFFFF8F;
                }
                if(v16 == 0) {
                    snapPosition2 = snapPosition0;
                    targetedFlingBehavior2 = targetedFlingBehavior3;
                    z4 = z7;
                    nestedScrollConnection2 = nestedScrollConnection3;
                    v10 = v18;
                }
                else {
                    targetedFlingBehavior2 = targetedFlingBehavior3;
                    z4 = z7;
                    nestedScrollConnection2 = nestedScrollConnection3;
                    v10 = v18;
                    snapPosition2 = (int v, int v1, int v2, int v3, int v4, int v5) -> 0;
                }
                pageSize2 = pageSize3;
                v12 = (v3 & 16) == 0 ? v : 0;
                alignment$Horizontal2 = alignment$Horizontal3;
                z5 = z6;
                v13 = v6;
                function12 = v15 == 0 ? function10 : null;
                paddingValues2 = paddingValues3;
                f2 = (v3 & 0x20) == 0 ? f : 0.0f;
                modifier2 = modifier3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 0x80) != 0) {
                    v6 &= 0xFE3FFFFF;
                }
                if((v3 & 0x800) != 0) {
                    v10 &= 0xFFFFFF8F;
                }
                paddingValues2 = paddingValues0;
                pageSize2 = pageSize0;
                alignment$Horizontal2 = alignment$Horizontal0;
                z4 = z;
                z5 = z1;
                nestedScrollConnection2 = nestedScrollConnection0;
                snapPosition2 = snapPosition0;
                v12 = v;
                f2 = f;
                modifier2 = modifier0;
                targetedFlingBehavior2 = targetedFlingBehavior0;
                v13 = v6;
                function12 = function10;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(909160706, v13, v10, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:211)");
            }
            LazyLayoutPagerKt.Pager-uYRUAWA(modifier2, pagerState0, paddingValues2, z5, Orientation.Vertical, targetedFlingBehavior2, z4, v12, f2, pageSize2, nestedScrollConnection2, function12, alignment$Horizontal2, Alignment.Companion.getCenterVertically(), snapPosition2, function40, composer1, v13 >> 3 & 14 | 0x6000 | v13 << 3 & 0x70 | v13 & 0x380 | v13 >> 18 & 0x1C00 | 0x70000 & v13 >> 6 | v13 >> 6 & 0x380000 | 0x1C00000 & v13 << 9 | v13 << 9 & 0xE000000 | v13 << 18 & 0x70000000, v13 >> 12 & 0x380 | (v10 >> 3 & 14 | 0xC00 | v10 << 3 & 0x70) | 0xE000 & v10 << 6 | v10 << 6 & 0x70000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            paddingValues1 = paddingValues2;
            pageSize1 = pageSize2;
            v11 = v12;
            f1 = f2;
            alignment$Horizontal1 = alignment$Horizontal2;
            targetedFlingBehavior1 = targetedFlingBehavior2;
            z2 = z4;
            z3 = z5;
            function11 = function12;
            nestedScrollConnection1 = nestedScrollConnection2;
            snapPosition1 = snapPosition2;
        }
        else {
            composer1.skipToGroupEnd();
            paddingValues1 = paddingValues0;
            alignment$Horizontal1 = alignment$Horizontal0;
            z2 = z;
            function11 = function10;
            nestedScrollConnection1 = nestedScrollConnection0;
            modifier1 = modifier0;
            targetedFlingBehavior1 = targetedFlingBehavior0;
            z3 = z1;
            snapPosition1 = snapPosition0;
            f1 = f;
            v11 = v;
            pageSize1 = pageSize0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(pagerState0, modifier1, paddingValues1, pageSize1, v11, f1, alignment$Horizontal1, targetedFlingBehavior1, z2, z3, function11, nestedScrollConnection1, snapPosition1, function40, v1, v2, v3));
        }
    }

    public static final boolean access$pagerSemantics$performBackwardPaging(PagerState pagerState0, CoroutineScope coroutineScope0) {
        if(pagerState0.getCanScrollBackward()) {
            BuildersKt.launch$default(coroutineScope0, null, null, new r(pagerState0, null), 3, null);
            return true;
        }
        return false;
    }

    public static final boolean access$pagerSemantics$performForwardPaging(PagerState pagerState0, CoroutineScope coroutineScope0) {
        if(pagerState0.getCanScrollForward()) {
            BuildersKt.launch$default(coroutineScope0, null, null, new s(pagerState0, null), 3, null);
            return true;
        }
        return false;
    }

    public static final int currentPageOffset(@NotNull SnapPosition snapPosition0, int v, int v1, int v2, int v3, int v4, int v5, float f, int v6) {
        return c.roundToInt(((float)snapPosition0.position(v, v1, v3, v4, v5, v6)) - f * ((float)(v1 + v2)));
    }

    @NotNull
    public static final Modifier pagerSemantics(@NotNull Modifier modifier0, @NotNull PagerState pagerState0, boolean z, @NotNull CoroutineScope coroutineScope0, boolean z1) {
        if(z1) {
            q q0 = new q(z, pagerState0, coroutineScope0);
            return modifier0.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, q0, 1, null));
        }
        return modifier0.then(Modifier.Companion);
    }
}

