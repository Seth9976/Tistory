package com.kakao.kandinsky.sticker.ui;

import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.GridCells.Adaptive;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.text.selection.a;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.kakao.kandinsky.designsystem.theme.Orientation;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import com.kakao.kandinsky.sticker.contract.StickerSizeType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ya.d;
import ya.e;
import ya.g;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A7\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"StickerList", "", "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/kakao/kandinsky/sticker/contract/StickerItem;", "sizeType", "Lcom/kakao/kandinsky/sticker/contract/StickerSizeType;", "onClickItem", "Lkotlin/Function1;", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/kakao/kandinsky/sticker/contract/StickerSizeType;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "sticker_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStickerList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerList.kt\ncom/kakao/kandinsky/sticker/ui/StickerListKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,83:1\n1223#2,6:84\n1223#2,6:98\n148#3:90\n148#3:91\n148#3:92\n148#3:93\n148#3:94\n148#3:95\n77#4:96\n77#4:97\n*S KotlinDebug\n*F\n+ 1 StickerList.kt\ncom/kakao/kandinsky/sticker/ui/StickerListKt\n*L\n29#1:84,6\n65#1:98,6\n34#1:90\n35#1:91\n39#1:92\n40#1:93\n44#1:94\n45#1:95\n56#1:96\n60#1:97\n*E\n"})
public final class StickerListKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[StickerSizeType.values().length];
            try {
                arr_v[StickerSizeType.Large.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[StickerSizeType.Small.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[Orientation.values().length];
            try {
                arr_v1[Orientation.Portrait.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[Orientation.Landscape.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void StickerList(@NotNull ImmutableList immutableList0, @NotNull StickerSizeType stickerSizeType0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        HorizontalOrVertical arrangement$HorizontalOrVertical1;
        HorizontalOrVertical arrangement$HorizontalOrVertical0;
        float f3;
        Pair pair0;
        float f;
        Intrinsics.checkNotNullParameter(immutableList0, "items");
        Intrinsics.checkNotNullParameter(stickerSizeType0, "sizeType");
        Intrinsics.checkNotNullParameter(function10, "onClickItem");
        Composer composer1 = composer0.startRestartGroup(1185452410);
        int v1 = (v & 14) == 0 ? (composer1.changed(immutableList0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(stickerSizeType0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1185452410, v1, -1, "com.kakao.kandinsky.sticker.ui.StickerList (StickerList.kt:26)");
            }
            LazyGridState lazyGridState0 = LazyGridStateKt.rememberLazyGridState(0, 0, composer1, 0, 3);
            composer1.startReplaceGroup(1701485857);
            boolean z = composer1.changed(lazyGridState0);
            d d0 = composer1.rememberedValue();
            if(z || d0 == Composer.Companion.getEmpty()) {
                d0 = new d(lazyGridState0, null);
                composer1.updateRememberedValue(d0);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(immutableList0, d0, composer1, v1 & 14 | 0x40);
            int[] arr_v = WhenMappings.$EnumSwitchMapping$0;
            switch(arr_v[stickerSizeType0.ordinal()]) {
                case 1: {
                    f = 60.0f;
                    break;
                }
                case 2: {
                    f = 36.0f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            switch(arr_v[stickerSizeType0.ordinal()]) {
                case 1: {
                    pair0 = TuplesKt.to(Dp.box-impl(12.0f), Dp.box-impl(8.0f));
                    break;
                }
                case 2: {
                    pair0 = TuplesKt.to(Dp.box-impl(24.0f), Dp.box-impl(16.0f));
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            float f1 = ((Dp)pair0.component1()).unbox-impl();
            float f2 = ((Dp)pair0.component2()).unbox-impl();
            switch(arr_v[stickerSizeType0.ordinal()]) {
                case 1: {
                    f3 = 12.0f;
                    break;
                }
                case 2: {
                    f3 = 16.0f;
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Adaptive gridCells$Adaptive0 = new Adaptive(f, null);
            Modifier modifier0 = OrientationKt.byOrientation(Modifier.Companion, e.x, e.y);
            Orientation orientation0 = (Orientation)composer1.consume(OrientationKt.getLocalOrientation());
            int[] arr_v1 = WhenMappings.$EnumSwitchMapping$1;
            switch(arr_v1[orientation0.ordinal()]) {
                case 1: {
                    arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.spacedBy-0680j_4(f2);
                    break;
                }
                case 2: {
                    arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.spacedBy-0680j_4(f1);
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            switch(arr_v1[((Orientation)composer1.consume(OrientationKt.getLocalOrientation())).ordinal()]) {
                case 1: {
                    arrangement$HorizontalOrVertical1 = Arrangement.INSTANCE.spacedBy-0680j_4(f1);
                    break;
                }
                case 2: {
                    arrangement$HorizontalOrVertical1 = Arrangement.INSTANCE.spacedBy-0680j_4(f2);
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            PaddingValues paddingValues0 = PaddingKt.PaddingValues-0680j_4(f3);
            composer1.startReplaceGroup(0x656AA20F);
            boolean z1 = composer1.changed(f);
            g g0 = composer1.rememberedValue();
            if(((v1 & 14) == 4 | z1 | ((v1 & 0x380) == 0x100 ? 1 : 0)) != 0 || g0 == Composer.Companion.getEmpty()) {
                g0 = new g(immutableList0, f, function10);
                composer1.updateRememberedValue(g0);
            }
            composer1.endReplaceGroup();
            LazyGridDslKt.LazyVerticalGrid(gridCells$Adaptive0, modifier0, lazyGridState0, paddingValues0, false, arrangement$HorizontalOrVertical0, arrangement$HorizontalOrVertical1, null, false, g0, composer1, 0, 400);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(v, 20, immutableList0, stickerSizeType0, function10));
        }
    }
}

