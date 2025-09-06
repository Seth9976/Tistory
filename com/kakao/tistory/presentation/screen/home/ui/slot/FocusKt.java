package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Focus;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotContainerKt;
import com.kakao.tistory.presentation.theme.TColor;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\u000E\u0010\u0006\u001A\u00020\u00058\n@\nX\u008A\u008E\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Focus;", "slot", "", "Focus", "(Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Focus;Landroidx/compose/runtime/Composer;I)V", "", "baseLine", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFocus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focus.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/FocusKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,115:1\n148#2:116\n1223#3,6:117\n1223#3,6:123\n1223#3,6:129\n81#4:135\n107#4,2:136\n*S KotlinDebug\n*F\n+ 1 Focus.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/FocusKt\n*L\n58#1:116\n85#1:117,6\n96#1:123,6\n92#1:129,6\n85#1:135\n85#1:136,2\n*E\n"})
public final class FocusKt {
    public static final Focus a;

    static {
        ThumbnailUiState thumbnailUiState0 = ThumbnailUiStateKt.toThumbnailItem("http://t1.daumcdn.net/brunch/service/user/2xr/image/6-d1CBljJhw2mnAT69vMQfDoNyM.png");
        ThumbnailUiState thumbnailUiState1 = ThumbnailUiStateKt.toThumbnailItem("http://t1.daumcdn.net/brunch/service/user/2xr/image/6-d1CBljJhw2mnAT69vMQfDoNyM.png");
        com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Focus homeSlotUiStateContent$Focus0 = new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Focus("", "일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십", thumbnailUiState0, n1.a, "일이삼사오육칠팔구십일이삼사오육칠팔구십", thumbnailUiState1, o1.a, 1, 2, "2024-05-30T17:22:18+09:00");
        FocusKt.a = new Focus(null, null, "J의 주말 계획\uD83D\uDEB4", "주말 나들이 갈만한 곳을 알아보세요.\n진정한 J라면 월요일부터 주말 계획을 짜야 하기 때문에 그렇습니다.", CollectionsKt__CollectionsKt.listOf(new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Focus[]{com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Focus.copy$default(homeSlotUiStateContent$Focus0, null, null, null, null, "1줄", null, null, 0, 0, null, 1007, null), com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Focus.copy$default(homeSlotUiStateContent$Focus0, null, null, null, null, "일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십", null, null, 0, 0, null, 1007, null), com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Focus.copy$default(homeSlotUiStateContent$Focus0, null, null, null, null, null, null, null, 2, 3, null, 0x27F, null), homeSlotUiStateContent$Focus0, homeSlotUiStateContent$Focus0}), 3, null);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Focus(@NotNull Focus homeSlotUiState$Focus0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(homeSlotUiState$Focus0, "slot");
        Composer composer1 = composer0.startRestartGroup(0x38B976BB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x38B976BB, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Focus (Focus.kt:56)");
        }
        SlotContainerKt.SlotContainer(null, false, PaddingKt.PaddingValues-0680j_4(0.0f), ComposableLambdaKt.rememberComposableLambda(0xDBD79E00, true, new h1(homeSlotUiState$Focus0), composer1, 54), composer1, 0xD80, 3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i1(homeSlotUiState$Focus0, v));
        }
    }

    public static final void access$Description(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-820909428);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-820909428, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Description (Focus.kt:108)");
            }
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), composer1, v1 & 14 | 0x180, 0xC00000, 0x1FFFA);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g1(s, v));
        }
    }

    public static final void access$FocusMark(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x51BE4F32);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x51BE4F32, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.FocusMark (Focus.kt:83)");
            }
            composer1.startReplaceGroup(0x2B6570B3);
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(0.0f, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            String s = StringResources_androidKt.stringResource(string.label_home_slot_focus_title, composer1, 0);
            TextStyle textStyle0 = TTextStyle.INSTANCE.getSize14Weight700();
            long v1 = TColor.INSTANCE.getGray900-0d7_KjU();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceGroup(728079520);
            j1 j10 = composer1.rememberedValue();
            if(j10 == composer$Companion0.getEmpty()) {
                j10 = new j1(mutableState0);
                composer1.updateRememberedValue(j10);
            }
            composer1.endReplaceGroup();
            Modifier modifier0 = DrawModifierKt.drawBehind(modifier$Companion0, j10);
            composer1.startReplaceGroup(728075911);
            k1 k10 = composer1.rememberedValue();
            if(k10 == composer$Companion0.getEmpty()) {
                k10 = new k1(mutableState0);
                composer1.updateRememberedValue(k10);
            }
            composer1.endReplaceGroup();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier0, v1, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 1, 0, k10, textStyle0, composer1, 0x180, 0xD86000, 0xBFF8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l1(v));
        }
    }

    public static final float access$FocusMark$lambda$1(MutableState mutableState0) {
        return ((Number)mutableState0.getValue()).floatValue();
    }

    public static final void access$FocusMark$lambda$2(MutableState mutableState0, float f) {
        mutableState0.setValue(f);
    }

    public static final void access$FocusPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x6FA3742B);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6FA3742B, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.FocusPreview (Focus.kt:49)");
            }
            FocusKt.Focus(FocusKt.a, composer1, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m1(v));
        }
    }
}

