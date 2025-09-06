package com.kakao.tistory.presentation.design.ui.list;

import a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.common.utils.ScaleUtilsKt;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.thumbnail.EntryThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.widget.common.NewMarkKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u00A6\u0001\u0010\u0017\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0010\b\u0002\u0010\u0003\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\b2\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\f\u001A\u0004\u0018\u00010\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001A\u00020\u000F2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0014\u001A\u00020\u00042\b\b\u0002\u0010\u0016\u001A\u00020\u0015H\u0007\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A\u008D\u0001\u0010\u0017\u001A\u00020\u00012\u0010\b\u0002\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0010\b\u0002\u0010\u0003\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0015\b\u0002\u0010\t\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\b2\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\f\u001A\u0004\u0018\u00010\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\u0011\u0010\u0019\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000\u00A2\u0006\u0002\b\bH\u0007\u00A2\u0006\u0004\b\u0017\u0010\u001A\u001A\u0085\u0001\u0010\u001E\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\u0010\u001B\u001A\u0004\u0018\u00010\r2\u0006\u0010\u001C\u001A\u00020\u00122\f\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\f\u001A\u0004\u0018\u00010\n2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F2\b\u0010\u0011\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\u0013\u001A\u00020\u0012H\u0007\u00A2\u0006\u0004\b\u001E\u0010\u001F\u001AS\u0010#\u001A\u00020\u00012\u000E\u0010\u0002\u001A\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u0006\u0010 \u001A\u00020\n2\b\u0010!\u001A\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u000F2\u0006\u0010\"\u001A\u00020\u000FH\u0007\u00A2\u0006\u0004\b#\u0010$\u001A\u009D\u0001\u00102\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0015\b\u0002\u0010%\u001A\u000F\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u00A2\u0006\u0002\b\b2\b\u0010!\u001A\u0004\u0018\u00010\r2\b\b\u0002\u0010\'\u001A\u00020&2\u0006\u0010\u000B\u001A\u00020\u00122\b\b\u0002\u0010(\u001A\u00020&2\b\b\u0002\u0010)\u001A\u00020\u00042 \b\u0002\u0010-\u001A\u001A\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0001\u0018\u00010*\u00A2\u0006\u0002\b\b\u00A2\u0006\u0002\b,2\b\b\u0002\u0010/\u001A\u00020.H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00063"}, d2 = {"Lkotlin/Function0;", "", "onClick", "onLongClick", "", "clickable", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/runtime/Composable;", "head", "Landroidx/compose/ui/text/AnnotatedString;", "entryTitle", "entrySummary", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "entryThumbnail", "", "likeCount", "commentCount", "", "publishedDate", "scheduled", "Lcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;", "visibility", "EntryListItem", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;ILjava/lang/Integer;Ljava/lang/String;ZLcom/kakao/tistory/presentation/design/ui/list/EntryListUiState$Visibility;Landroidx/compose/runtime/Composer;III)V", "info", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "blogThumbnail", "blogTitle", "onClickBlog", "EntryListItemWithLargeImage", "(Lkotlin/jvm/functions/Function0;ZLandroidx/compose/foundation/layout/PaddingValues;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;ILjava/lang/Integer;Ljava/lang/String;Landroidx/compose/runtime/Composer;III)V", "title", "thumbnail", "viewCount", "EntryListCompactItem", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/text/AnnotatedString;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;IIILandroidx/compose/runtime/Composer;II)V", "thumbnailOverlay", "Landroidx/compose/ui/graphics/Color;", "dimColor", "titleColor", "isNew", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "extraContent", "Landroidx/compose/ui/unit/Dp;", "extraContentHeight", "EntryGridItem-hjhQcyg", "(Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;JLjava/lang/String;JZLkotlin/jvm/functions/Function3;FLandroidx/compose/runtime/Composer;II)V", "EntryGridItem", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryList.kt\ncom/kakao/tistory/presentation/design/ui/list/EntryListKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,377:1\n85#2:378\n81#2,7:379\n88#2:414\n92#2:541\n85#2:549\n83#2,5:550\n88#2:583\n85#2:631\n83#2,5:632\n88#2:665\n92#2:670\n92#2:674\n78#3,6:386\n85#3,4:401\n89#3,2:411\n78#3,6:424\n85#3,4:439\n89#3,2:449\n78#3,6:460\n85#3,4:475\n89#3,2:485\n93#3:491\n78#3,6:500\n85#3,4:515\n89#3,2:525\n93#3:532\n93#3:536\n93#3:540\n78#3,6:555\n85#3,4:570\n89#3,2:580\n78#3,6:592\n85#3,4:607\n89#3,2:617\n93#3:624\n78#3,6:637\n85#3,4:652\n89#3,2:662\n93#3:669\n93#3:673\n78#3,6:683\n85#3,4:698\n89#3,2:708\n93#3:714\n368#4,9:392\n377#4:413\n368#4,9:430\n377#4:451\n368#4,9:466\n377#4:487\n378#4,2:489\n368#4,9:506\n377#4:527\n378#4,2:530\n378#4,2:534\n378#4,2:538\n368#4,9:561\n377#4:582\n368#4,9:598\n377#4:619\n378#4,2:622\n368#4,9:643\n377#4:664\n378#4,2:667\n378#4,2:671\n368#4,9:689\n377#4:710\n378#4,2:712\n4032#5,6:405\n4032#5,6:443\n4032#5,6:479\n4032#5,6:519\n4032#5,6:574\n4032#5,6:611\n4032#5,6:656\n4032#5,6:702\n148#6:415\n148#6:529\n148#6:542\n148#6:543\n148#6:544\n148#6:545\n148#6:546\n148#6:547\n148#6:548\n148#6:621\n148#6:626\n148#6:629\n148#6:630\n98#7:416\n94#7,7:417\n101#7:452\n105#7:537\n98#7:676\n95#7,6:677\n101#7:711\n105#7:715\n71#8:453\n68#8,6:454\n74#8:488\n78#8:492\n71#8:493\n68#8,6:494\n74#8:528\n78#8:533\n71#8:584\n67#8,7:585\n74#8:620\n78#8:625\n86#9:627\n50#9:628\n696#10:666\n77#11:675\n*S KotlinDebug\n*F\n+ 1 EntryList.kt\ncom/kakao/tistory/presentation/design/ui/list/EntryListKt\n*L\n41#1:378\n41#1:379,7\n41#1:414\n41#1:541\n286#1:549\n286#1:550,5\n286#1:583\n319#1:631\n319#1:632,5\n319#1:665\n319#1:670\n286#1:674\n41#1:386,6\n41#1:401,4\n41#1:411,2\n74#1:424,6\n74#1:439,4\n74#1:449,2\n77#1:460,6\n77#1:475,4\n77#1:485,2\n77#1:491\n85#1:500,6\n85#1:515,4\n85#1:525,2\n85#1:532\n74#1:536\n41#1:540\n286#1:555,6\n286#1:570,4\n286#1:580,2\n293#1:592,6\n293#1:607,4\n293#1:617,2\n293#1:624\n319#1:637,6\n319#1:652,4\n319#1:662,2\n319#1:669\n286#1:673\n352#1:683,6\n352#1:698,4\n352#1:708,2\n352#1:714\n41#1:392,9\n41#1:413\n74#1:430,9\n74#1:451\n77#1:466,9\n77#1:487\n77#1:489,2\n85#1:506,9\n85#1:527\n85#1:530,2\n74#1:534,2\n41#1:538,2\n286#1:561,9\n286#1:582\n293#1:598,9\n293#1:619\n293#1:622,2\n319#1:643,9\n319#1:664\n319#1:667,2\n286#1:671,2\n352#1:689,9\n352#1:710\n352#1:712,2\n41#1:405,6\n74#1:443,6\n77#1:479,6\n85#1:519,6\n286#1:574,6\n293#1:611,6\n319#1:656,6\n352#1:702,6\n75#1:415\n90#1:529\n109#1:542\n145#1:543\n190#1:544\n236#1:545\n284#1:546\n288#1:547\n291#1:548\n307#1:621\n315#1:626\n317#1:629\n321#1:630\n74#1:416\n74#1:417,7\n74#1:452\n74#1:537\n352#1:676\n352#1:677,6\n352#1:711\n352#1:715\n77#1:453\n77#1:454,6\n77#1:488\n77#1:492\n85#1:493\n85#1:494,6\n85#1:528\n85#1:533\n293#1:584\n293#1:585,7\n293#1:620\n293#1:625\n316#1:627\n317#1:628\n330#1:666\n350#1:675\n*E\n"})
public final class EntryListKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void EntryGridItem-hjhQcyg(@NotNull Function0 function00, boolean z, @Nullable Function2 function20, @Nullable ThumbnailUiState thumbnailUiState0, long v, @NotNull String s, long v1, boolean z1, @Nullable Function3 function30, float f, @Nullable Composer composer0, int v2, int v3) {
        float f1;
        Function3 function31;
        long v8;
        boolean z3;
        long v7;
        Function2 function21;
        boolean z2;
        Function3 function33;
        long v11;
        Companion composeUiNode$Companion1;
        Arrangement arrangement2;
        Arrangement arrangement1;
        int v6;
        long v5;
        int v4;
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Intrinsics.checkNotNullParameter(s, "entryTitle");
        Composer composer1 = composer0.startRestartGroup(1150965122);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(thumbnailUiState0) ? 0x800 : 0x400);
        }
        if((v3 & 16) == 0) {
            v5 = v;
            if((0xE000 & v2) == 0) {
                v4 |= (composer1.changed(v5) ? 0x4000 : 0x2000);
            }
        }
        else {
            v4 |= 0x6000;
            v5 = v;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.changed(s) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) == 0) {
            v6 = v4;
            if((v2 & 0x380000) == 0) {
                v6 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
            }
        }
        else {
            v6 = v4 | 0x180000;
        }
        if((v3 & 0x80) != 0) {
            v6 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v6 |= (composer1.changed(z1) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v6 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v6 |= (composer1.changedInstance(function30) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v6 |= 0x30000000;
        }
        else if((v2 & 0x70000000) == 0) {
            v6 |= (composer1.changed(f) ? 0x20000000 : 0x10000000);
        }
        if((v6 & 0x5B6DB6DB) != 306783378 || !composer1.getSkipping()) {
            boolean z4 = (v3 & 2) == 0 ? z : true;
            Function2 function22 = (v3 & 4) == 0 ? function20 : null;
            if((v3 & 16) != 0) {
                v5 = 0L;
            }
            v7 = (v3 & 0x40) == 0 ? v1 : 0L;
            z3 = (v3 & 0x80) == 0 ? z1 : false;
            Function3 function32 = (v3 & 0x100) == 0 ? function30 : null;
            float f2 = (v3 & 0x200) == 0 ? f : 0.0f;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1150965122, v6, -1, "com.kakao.tistory.presentation.design.ui.list.EntryGridItem (EntryList.kt:284)");
            }
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f);
            Modifier modifier0 = SemanticKt.contentDescription(ClipKt.clip(Modifier.Companion, roundedCornerShape0), new String[]{StringResources_androidKt.stringResource(string.content_desc_entry, composer1, 0)}, composer1, 0);
            String s1 = StringResources_androidKt.stringResource(string.content_desc_entry_move, composer1, 0);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier1 = ClickableKt.clickable-XHw0xAI$default(modifier0, z4, s1, null, function00, 4, null);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            HorizontalOrVertical arrangement$HorizontalOrVertical0 = arrangement0.spacedBy-0680j_4(8.0f);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement$HorizontalOrVertical0, alignment$Companion0.getStart(), composer1, 6);
            int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function23 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                d.a(v9, composer1, v9, function23);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function24 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting()) {
                arrangement1 = arrangement0;
                d.a(v10, composer1, v10, function24);
            }
            else {
                arrangement1 = arrangement0;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
                    d.a(v10, composer1, v10, function24);
                }
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            composer1.startReplaceGroup(1053358012);
            if(thumbnailUiState0 == null) {
                arrangement2 = arrangement1;
                composeUiNode$Companion1 = composeUiNode$Companion0;
                v11 = v5;
                function33 = function32;
                function21 = function22;
            }
            else {
                composeUiNode$Companion1 = composeUiNode$Companion0;
                arrangement2 = arrangement1;
                v11 = v5;
                EntryThumbnailKt.EntryThumbnail-T-dY9a0(thumbnailUiState0, SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), null, Color.box-impl(v5), composer1, v6 >> 9 & 14 | 0x30 | v6 >> 3 & 0x1C00, 4);
                composer1.startReplaceGroup(1053364889);
                function21 = function22;
                if(function21 != null) {
                    function21.invoke(composer1, ((int)(v6 >> 6 & 14)));
                }
                composer1.endReplaceGroup();
                composer1.startReplaceGroup(1053365934);
                if(z3) {
                    NewMarkKt.NewMark-rAjV9yQ(PaddingKt.padding-3ABfNKs(boxScopeInstance0.align(modifier$Companion0, alignment$Companion0.getTopEnd()), 8.0f), 0.0f, composer1, 0, 2);
                }
                function33 = function32;
                composer1.endReplaceGroup();
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            TextStyle textStyle0 = EntryStyle.INSTANCE.getGridTitleTextStyle();
            float f3 = Dp.constructor-impl(ScaleUtilsKt.lineHeightToDp(textStyle0, composer1, 6) * 2.0f);
            Modifier modifier4 = ModifierKt.textWrapperHeight-3ABfNKs(PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 4.0f, 0.0f, 2, null), f3 + (function33 == null ? 0.0f : f2 + 8.0f));
            MeasurePolicy measurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.spacedBy-0680j_4(8.0f), alignment$Companion0.getStart(), composer1, 6);
            int v12 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            Function0 function03 = composeUiNode$Companion1.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function25 = a.a(composeUiNode$Companion1, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v12)) {
                d.a(v12, composer1, v12, function25);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion1.getSetModifier());
            EntryListItemBodyKt.EntryTitle(StringUtils.INSTANCE.asAnnotationString(s), 2, 1, TextStyle.copy-p1EtxEg$default(textStyle0, (v7 == 16L ? textStyle0.getColor-0d7_KjU() : v7), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, 0x1B0, 0);
            composer1.startReplaceGroup(1053400473);
            if(function33 != null) {
                function33.invoke(columnScopeInstance0, composer1, ((int)(v6 >> 21 & 0x70 | 6)));
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v8 = v11;
            function31 = function33;
            z2 = z4;
            f1 = f2;
        }
        else {
            composer1.skipToGroupEnd();
            z2 = z;
            function21 = function20;
            v7 = v1;
            z3 = z1;
            v8 = v5;
            function31 = function30;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(function00, z2, function21, thumbnailUiState0, v8, s, v7, z3, function31, f1, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EntryListCompactItem(@Nullable Function0 function00, @Nullable PaddingValues paddingValues0, @NotNull AnnotatedString annotatedString0, @Nullable ThumbnailUiState thumbnailUiState0, int v, int v1, int v2, @Nullable Composer composer0, int v3, int v4) {
        PaddingValues paddingValues1;
        int v5;
        Intrinsics.checkNotNullParameter(annotatedString0, "title");
        Composer composer1 = composer0.startRestartGroup(-741509090);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v5 |= (composer1.changed(paddingValues0) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v5 |= (composer1.changed(annotatedString0) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v3 & 0x1C00) == 0) {
            v5 |= (composer1.changed(thumbnailUiState0) ? 0x800 : 0x400);
        }
        if((v4 & 16) != 0) {
            v5 |= 0x6000;
        }
        else if((0xE000 & v3) == 0) {
            v5 |= (composer1.changed(v) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((0x70000 & v3) == 0) {
            v5 |= (composer1.changed(v1) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((0x380000 & v3) == 0) {
            v5 |= (composer1.changed(v2) ? 0x100000 : 0x80000);
        }
        if((0x2DB6DB & v5) != 0x92492 || !composer1.getSkipping()) {
            PaddingValues paddingValues2 = (v4 & 2) == 0 ? paddingValues0 : PaddingKt.PaddingValues-YgX7TsA(20.0f, 15.0f);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-741509090, v5, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListCompactItem (EntryList.kt:241)");
            }
            EntryListKt.a(function00, null, false, paddingValues2, ComposableLambdaKt.rememberComposableLambda(0x4F22AFA7, true, new i0(thumbnailUiState0, annotatedString0, v, v1, v2), composer1, 54), composer1, v5 & 14 | 0x6000 | v5 << 6 & 0x1C00, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            paddingValues1 = paddingValues2;
        }
        else {
            composer1.skipToGroupEnd();
            paddingValues1 = paddingValues0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j0(function00, paddingValues1, annotatedString0, thumbnailUiState0, v, v1, v2, v3, v4));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void EntryListItem(@NotNull Function0 function00, @Nullable Function0 function01, boolean z, @Nullable PaddingValues paddingValues0, @Nullable Function2 function20, @NotNull AnnotatedString annotatedString0, @Nullable AnnotatedString annotatedString1, @Nullable ThumbnailUiState thumbnailUiState0, int v, @Nullable Integer integer0, @NotNull String s, boolean z1, @Nullable Visibility entryListUiState$Visibility0, @Nullable Composer composer0, int v1, int v2, int v3) {
        Visibility entryListUiState$Visibility1;
        boolean z3;
        Integer integer1;
        Function2 function21;
        PaddingValues paddingValues1;
        boolean z2;
        Function0 function02;
        Integer integer2;
        Function2 function22;
        PaddingValues paddingValues2;
        boolean z4;
        Function0 function03;
        PaddingValues paddingValues3;
        boolean z6;
        Function0 function05;
        int v6;
        int v4;
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Intrinsics.checkNotNullParameter(annotatedString0, "entryTitle");
        Intrinsics.checkNotNullParameter(s, "publishedDate");
        Composer composer1 = composer0.startRestartGroup(0xC9F9982E);
        if((v3 & 1) == 0) {
            v4 = (v1 & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.changedInstance(function01) ? 0x20 : 16);
        }
        int v5 = 0x80;
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v4 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v4 |= ((v3 & 8) != 0 || !composer1.changed(paddingValues0) ? 0x400 : 0x800);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v4 |= (composer1.changed(annotatedString0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v4 |= (composer1.changed(annotatedString1) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((0x1C00000 & v1) == 0) {
            v4 |= (composer1.changed(thumbnailUiState0) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((0xE000000 & v1) == 0) {
            v4 |= (composer1.changed(v) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x70000000) == 0) {
            v4 |= (composer1.changed(integer0) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v6 = (v2 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v2 : v2;
        }
        else {
            v6 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v6 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v6 |= (composer1.changed(z1) ? 0x20 : 16);
        }
        if((v3 & 0x1000) != 0) {
            v6 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            if(composer1.changed(entryListUiState$Visibility0)) {
                v5 = 0x100;
            }
            v6 |= v5;
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || (v6 & 731) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Function0 function04 = (v3 & 2) == 0 ? function01 : null;
                boolean z5 = (v3 & 4) == 0 ? z : true;
                if((v3 & 8) == 0) {
                    function05 = function04;
                    z6 = z5;
                    paddingValues3 = paddingValues0;
                }
                else {
                    function05 = function04;
                    z6 = z5;
                    paddingValues3 = PaddingKt.PaddingValues-a9UjIt4(20.0f, 20.0f, 20.0f, 22.0f);
                    v4 &= 0xFFFFE3FF;
                }
                Integer integer3 = (v3 & 0x200) == 0 ? integer0 : null;
                boolean z7 = (v3 & 0x800) == 0 ? z1 : false;
                if((v3 & 0x1000) == 0) {
                    function03 = function05;
                    z4 = z6;
                    entryListUiState$Visibility1 = entryListUiState$Visibility0;
                    integer2 = integer3;
                    z3 = z7;
                    paddingValues2 = paddingValues3;
                }
                else {
                    function03 = function05;
                    z4 = z6;
                    integer2 = integer3;
                    z3 = z7;
                    paddingValues2 = paddingValues3;
                    entryListUiState$Visibility1 = Visibility.NORMAL;
                }
                function22 = (v3 & 16) == 0 ? function20 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                function03 = function01;
                z4 = z;
                paddingValues2 = paddingValues0;
                function22 = function20;
                integer2 = integer0;
                z3 = z1;
                entryListUiState$Visibility1 = entryListUiState$Visibility0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC9F9982E, v4, v6, "com.kakao.tistory.presentation.design.ui.list.EntryListItem (EntryList.kt:118)");
            }
            EntryListKt.EntryListItem(function00, function03, z4, paddingValues2, function22, annotatedString0, annotatedString1, thumbnailUiState0, ComposableLambdaKt.rememberComposableLambda(875191390, true, new k0(v, integer2, s, z3, entryListUiState$Visibility1), composer1, 54), composer1, v4 & 14 | 0x6000000 | v4 & 0x70 | v4 & 0x380 | v4 & 0x1C00 | v4 & 0xE000 | v4 & 0x70000 | v4 & 0x380000 | 0x1C00000 & v4, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function02 = function03;
            z2 = z4;
            paddingValues1 = paddingValues2;
            function21 = function22;
            integer1 = integer2;
        }
        else {
            composer1.skipToGroupEnd();
            function02 = function01;
            z2 = z;
            paddingValues1 = paddingValues0;
            function21 = function20;
            integer1 = integer0;
            z3 = z1;
            entryListUiState$Visibility1 = entryListUiState$Visibility0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l0(function00, function02, z2, paddingValues1, function21, annotatedString0, annotatedString1, thumbnailUiState0, v, integer1, s, z3, entryListUiState$Visibility1, v1, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void EntryListItem(@Nullable Function0 function00, @Nullable Function0 function01, boolean z, @Nullable PaddingValues paddingValues0, @Nullable Function2 function20, @NotNull AnnotatedString annotatedString0, @Nullable AnnotatedString annotatedString1, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull Function2 function21, @Nullable Composer composer0, int v, int v1) {
        Function2 function22;
        PaddingValues paddingValues2;
        boolean z2;
        Function0 function04;
        Function0 function03;
        Function2 function23;
        PaddingValues paddingValues3;
        boolean z3;
        Function0 function06;
        Function0 function05;
        int v3;
        PaddingValues paddingValues1;
        boolean z1;
        Function0 function02;
        int v2;
        Intrinsics.checkNotNullParameter(annotatedString0, "entryTitle");
        Intrinsics.checkNotNullParameter(function21, "info");
        Composer composer1 = composer0.startRestartGroup(0x82B7250D);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            function02 = function01;
        }
        else if((v & 0x70) == 0) {
            function02 = function01;
            v2 |= (composer1.changedInstance(function02) ? 0x20 : 16);
        }
        else {
            function02 = function01;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x380) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v & 0x1C00) == 0) {
            if((v1 & 8) == 0) {
                paddingValues1 = paddingValues0;
                v3 = composer1.changed(paddingValues1) ? 0x800 : 0x400;
            }
            else {
                paddingValues1 = paddingValues0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changed(annotatedString0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changed(annotatedString1) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((0x1C00000 & v) == 0) {
            v2 |= (composer1.changed(thumbnailUiState0) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((0xE000000 & v) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x4000000 : 0x2000000);
        }
        if((0xB6DB6DB & v2) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 2) != 0) {
                    function02 = null;
                }
                if((v1 & 4) != 0) {
                    z1 = true;
                }
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                    paddingValues1 = PaddingKt.PaddingValues-a9UjIt4(20.0f, 20.0f, 20.0f, 22.0f);
                }
                function05 = (v1 & 1) == 0 ? function00 : null;
                function06 = function02;
                z3 = z1;
                paddingValues3 = paddingValues1;
                function23 = (v1 & 16) == 0 ? function20 : null;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                function05 = function00;
                function06 = function02;
                z3 = z1;
                paddingValues3 = paddingValues1;
                function23 = function20;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x82B7250D, v2, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListItem (EntryList.kt:150)");
            }
            EntryListKt.a(function05, function06, z3, paddingValues3, ComposableLambdaKt.rememberComposableLambda(-1439450908, true, new m0(function23, thumbnailUiState0, annotatedString0, annotatedString1, function21), composer1, 54), composer1, v2 & 14 | 0x6000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function03 = function05;
            function04 = function06;
            z2 = z3;
            paddingValues2 = paddingValues3;
            function22 = function23;
        }
        else {
            composer1.skipToGroupEnd();
            function03 = function00;
            function04 = function02;
            z2 = z1;
            paddingValues2 = paddingValues1;
            function22 = function20;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n0(function03, function04, z2, paddingValues2, function22, annotatedString0, annotatedString1, thumbnailUiState0, function21, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EntryListItemWithLargeImage(@NotNull Function0 function00, boolean z, @Nullable PaddingValues paddingValues0, @Nullable ThumbnailUiState thumbnailUiState0, @NotNull String s, @NotNull Function0 function01, @NotNull AnnotatedString annotatedString0, @Nullable AnnotatedString annotatedString1, @NotNull ThumbnailUiState thumbnailUiState1, int v, @Nullable Integer integer0, @NotNull String s1, @Nullable Composer composer0, int v1, int v2, int v3) {
        PaddingValues paddingValues1;
        boolean z2;
        boolean z3;
        int v6;
        PaddingValues paddingValues2;
        int v5;
        boolean z1;
        int v4;
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Intrinsics.checkNotNullParameter(s, "blogTitle");
        Intrinsics.checkNotNullParameter(function01, "onClickBlog");
        Intrinsics.checkNotNullParameter(annotatedString0, "entryTitle");
        Intrinsics.checkNotNullParameter(thumbnailUiState1, "entryThumbnail");
        Intrinsics.checkNotNullParameter(s1, "publishedDate");
        Composer composer1 = composer0.startRestartGroup(1028773006);
        if((v3 & 1) == 0) {
            v4 = (v1 & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) == 0) {
            z1 = z;
            if((v1 & 0x70) == 0) {
                v4 |= (composer1.changed(z1) ? 0x20 : 16);
            }
        }
        else {
            v4 |= 0x30;
            z1 = z;
        }
        if((v1 & 0x380) == 0) {
            v4 |= ((v3 & 4) != 0 || !composer1.changed(paddingValues0) ? 0x80 : 0x100);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 |= (composer1.changed(thumbnailUiState0) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v4 |= (composer1.changed(s) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v4 |= (composer1.changedInstance(function01) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v4 |= (composer1.changed(annotatedString0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((0x1C00000 & v1) == 0) {
            v4 |= (composer1.changed(annotatedString1) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((0xE000000 & v1) == 0) {
            v4 |= (composer1.changed(thumbnailUiState1) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((0x70000000 & v1) == 0) {
            v4 |= (composer1.changed(v) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v5 = (v2 & 14) == 0 ? v2 | (composer1.changed(integer0) ? 4 : 2) : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || (v5 & 91) != 18 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 2) != 0) {
                    z1 = true;
                }
                if((v3 & 4) == 0) {
                label_82:
                    v6 = v4;
                    z3 = z1;
                    paddingValues2 = paddingValues0;
                }
                else {
                    paddingValues2 = PaddingKt.PaddingValues-a9UjIt4(20.0f, 20.0f, 20.0f, 22.0f);
                    v6 = v4 & -897;
                    z3 = z1;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                goto label_82;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1028773006, v6, v5, "com.kakao.tistory.presentation.design.ui.list.EntryListItemWithLargeImage (EntryList.kt:199)");
            }
            EntryListKt.a(function00, null, z3, paddingValues2, ComposableLambdaKt.rememberComposableLambda(-2002692201, true, new w0(thumbnailUiState1, thumbnailUiState0, s, function01, z3, annotatedString0, annotatedString1, v, integer0, s1), composer1, 54), composer1, v6 & 14 | 0x6000 | v6 << 3 & 0x380 | v6 << 3 & 0x1C00, 2);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z3;
            paddingValues1 = paddingValues2;
        }
        else {
            composer1.skipToGroupEnd();
            z2 = z1;
            paddingValues1 = paddingValues0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x0(function00, z2, paddingValues1, thumbnailUiState0, s, function01, annotatedString0, annotatedString1, thumbnailUiState1, v, integer0, s1, v1, v2, v3));
        }
    }

    public static final void a(Function0 function00, Function0 function01, boolean z, PaddingValues paddingValues0, Function3 function30, Composer composer0, int v, int v1) {
        boolean z1;
        Function0 function03;
        Function0 function02;
        int v2;
        Composer composer1 = composer0.startRestartGroup(898901188);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            function02 = function00;
        }
        else if((v & 14) == 0) {
            function02 = function00;
            v2 = (composer1.changedInstance(function02) ? 4 : 2) | v;
        }
        else {
            function02 = function00;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            function03 = function01;
        }
        else if((v & 0x70) == 0) {
            function03 = function01;
            v2 |= (composer1.changedInstance(function03) ? 0x20 : 16);
        }
        else {
            function03 = function01;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            z1 = z;
        }
        else if((v & 0x380) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        o0 o00 = null;
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                function02 = null;
            }
            if((v1 & 2) != 0) {
                function03 = null;
            }
            if((v1 & 4) != 0) {
                z1 = true;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(898901188, v2, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListItemContainer (EntryList.kt:348)");
            }
            HapticFeedback hapticFeedback0 = (HapticFeedback)composer1.consume(CompositionLocalsKt.getLocalHapticFeedback());
            Modifier modifier0 = Modifier.Companion;
            Modifier modifier1 = SizeKt.fillMaxWidth$default(modifier0, 0.0f, 1, null);
            composer1.startReplaceGroup(-1052482589);
            if(function02 != null) {
                String s = StringResources_androidKt.stringResource(string.content_desc_entry_move, composer1, 0);
                String s1 = StringResources_androidKt.stringResource(string.content_desc_entry_long_click, composer1, 0);
                if(function03 != null) {
                    o00 = new o0(hapticFeedback0, function03);
                }
                modifier0 = ClickableKt.combinedClickable-cJG_KMw$default(modifier0, z1, s, null, s1, o00, null, function02, 36, null);
            }
            composer1.endReplaceGroup();
            Modifier modifier2 = PaddingKt.padding(modifier1.then(modifier0), paddingValues0);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function04 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function04);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            function30.invoke(RowScopeInstance.INSTANCE, composer1, ((int)((v2 >> 3 & 0x1C00) >> 6 & 0x70 | 6)));
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p0(function02, function03, z1, paddingValues0, function30, v, v1));
        }
    }

    public static final void access$EntryListItemPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x9BAD7A87);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9BAD7A87, v, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListItemPreview (EntryList.kt:34)");
            }
            AnnotatedString annotatedString0 = StringUtils.INSTANCE.asAnnotationString("preview 넷플릭스 x 아드만 스튜디오 - 윌레스와 그로밋: 복수의 날개 Wallace & Gromit: Vengeance Most Fowl 공식 예고편");
            AnnotatedString annotatedString1 = StringUtils.INSTANCE.asAnnotationString("넷플릭스로 공개될 예정인 애니메이션 는 \'아드만 스튜디오\'가 선보이는 신작이다. 물론, 글로벌 배급을 맡은 넷플릭스는, 앞서 영국의 BBC가 국내 방영을 먼저 시행한 뒤에 해외 공개가 이루어질 예정이긴 하지 ...");
            ThumbnailUiState thumbnailUiState0 = ThumbnailUiStateKt.toThumbnailItem("");
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            EntryListKt.EntryListItem(q0.a, null, false, null, null, annotatedString0, annotatedString1, thumbnailUiState0, 100, 100, "1분 전", false, null, composer1, 0x36000006, 6, 6174);
            EntryListKt.EntryListItem(r0.a, null, false, null, null, annotatedString0, annotatedString1, thumbnailUiState0, 15000, 34, "1분 전", true, Visibility.PROTECTED, composer1, 0x36000006, 438, 30);
            EntryListKt.EntryListCompactItem(s0.a, null, annotatedString0, thumbnailUiState0, 15000, 34, 100, composer1, 0x1B6006, 2);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.spacedBy-0680j_4(8.0f), alignment$Companion0.getTop(), composer1, 6);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            Modifier modifier2 = RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null);
            MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function22);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            EntryListKt.EntryGridItem-hjhQcyg(t0.a, false, null, thumbnailUiState0, 0L, annotatedString0.toString(), 0L, true, null, 0.0f, composer1, 0xC00006, 854);
            composer1.endNode();
            Modifier modifier4 = RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null);
            MeasurePolicy measurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function23 = a.a(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap3);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function23);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            EntryListKt.EntryGridItem-hjhQcyg(u0.a, false, null, thumbnailUiState0, 0L, annotatedString0.toString(), 0L, false, ComposableSingletons.EntryListKt.INSTANCE.getLambda-1$presentation_prodRelease(), 20.0f, composer1, 0x36000006, 0xD6);
            composer1.endNode();
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v0(v));
        }
    }
}

