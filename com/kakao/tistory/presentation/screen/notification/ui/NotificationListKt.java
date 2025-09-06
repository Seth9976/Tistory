package com.kakao.tistory.presentation.screen.notification.ui;

import a;
import android.text.Spanned;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter.Companion;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.text.HtmlCompat;
import androidx.paging.compose.LazyPagingItems;
import b;
import c;
import com.kakao.tistory.domain.entity.NotificationItem.Notification;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.common.utils.DateUtils.DateTimeFormat;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.notification.NotificationViewModel;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.common.DateTimeTextKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\u001A%\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001A\u000F\u0010\b\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000F²\u0006\u000E\u0010\u000B\u001A\u00020\n8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\r\u001A\u00020\f8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u000E\u001A\u00020\n8\n@\nX\u008A\u008E\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/screen/notification/NotificationViewModel;", "notificationViewModel", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/kakao/tistory/domain/entity/NotificationItem;", "notifications", "", "NotificationList", "(Lcom/kakao/tistory/presentation/screen/notification/NotificationViewModel;Landroidx/paging/compose/LazyPagingItems;Landroidx/compose/runtime/Composer;I)V", "PreviewNotification", "(Landroidx/compose/runtime/Composer;I)V", "", "isRead", "", "content", "isConvertedQuoteString", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNotificationList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationList.kt\ncom/kakao/tistory/presentation/screen/notification/ui/NotificationListKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,287:1\n148#2:288\n148#2:325\n148#2:362\n148#2:363\n148#2:364\n148#2:369\n148#2:370\n148#2:407\n148#2:408\n148#2:446\n148#2:447\n148#2:448\n148#2:519\n98#3:289\n95#3,6:290\n101#3:324\n98#3:326\n95#3,6:327\n101#3:361\n105#3:368\n98#3:409\n94#3,7:410\n101#3:445\n105#3:452\n105#3:460\n78#4,6:296\n85#4,4:311\n89#4,2:321\n78#4,6:333\n85#4,4:348\n89#4,2:358\n93#4:367\n78#4,6:378\n85#4,4:393\n89#4,2:403\n78#4,6:417\n85#4,4:432\n89#4,2:442\n93#4:451\n93#4:455\n93#4:459\n78#4,6:486\n85#4,4:501\n89#4,2:511\n93#4:517\n368#5,9:302\n377#5:323\n368#5,9:339\n377#5:360\n378#5,2:365\n368#5,9:384\n377#5:405\n368#5,9:423\n377#5:444\n378#5,2:449\n378#5,2:453\n378#5,2:457\n368#5,9:492\n377#5:513\n378#5,2:515\n4032#6,6:315\n4032#6,6:352\n4032#6,6:397\n4032#6,6:436\n4032#6,6:505\n85#7:371\n82#7,6:372\n88#7:406\n92#7:456\n1223#8,6:461\n1223#8,6:467\n1223#8,6:473\n71#9:479\n68#9,6:480\n74#9:514\n78#9:518\n81#10:520\n107#10,2:521\n81#10:523\n107#10,2:524\n*S KotlinDebug\n*F\n+ 1 NotificationList.kt\ncom/kakao/tistory/presentation/screen/notification/ui/NotificationListKt\n*L\n133#1:288\n136#1:325\n140#1:362\n143#1:363\n148#1:364\n151#1:369\n153#1:370\n155#1:407\n159#1:408\n177#1:446\n181#1:447\n185#1:448\n282#1:519\n124#1:289\n124#1:290,6\n124#1:324\n135#1:326\n135#1:327,6\n135#1:361\n135#1:368\n162#1:409\n162#1:410,7\n162#1:445\n162#1:452\n124#1:460\n124#1:296,6\n124#1:311,4\n124#1:321,2\n135#1:333,6\n135#1:348,4\n135#1:358,2\n135#1:367\n153#1:378,6\n153#1:393,4\n153#1:403,2\n162#1:417,6\n162#1:432,4\n162#1:442,2\n162#1:451\n153#1:455\n124#1:459\n262#1:486,6\n262#1:501,4\n262#1:511,2\n262#1:517\n124#1:302,9\n124#1:323\n135#1:339,9\n135#1:360\n135#1:365,2\n153#1:384,9\n153#1:405\n162#1:423,9\n162#1:444\n162#1:449,2\n153#1:453,2\n124#1:457,2\n262#1:492,9\n262#1:513\n262#1:515,2\n124#1:315,6\n135#1:352,6\n153#1:397,6\n162#1:436,6\n262#1:505,6\n153#1:371\n153#1:372,6\n153#1:406\n153#1:456\n228#1:461,6\n229#1:467,6\n242#1:473,6\n262#1:479\n262#1:480,6\n262#1:514\n262#1:518\n228#1:520\n228#1:521,2\n229#1:523\n229#1:524,2\n*E\n"})
public final class NotificationListKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void NotificationList(@NotNull NotificationViewModel notificationViewModel0, @NotNull LazyPagingItems lazyPagingItems0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(notificationViewModel0, "notificationViewModel");
        Intrinsics.checkNotNullParameter(lazyPagingItems0, "notifications");
        Composer composer1 = composer0.startRestartGroup(-1513702456);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1513702456, v, -1, "com.kakao.tistory.presentation.screen.notification.ui.NotificationList (NotificationList.kt:49)");
        }
        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new q(lazyPagingItems0, lazyPagingItems0.getItemCount() - 1, notificationViewModel0), composer1, 0, 0xFF);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(notificationViewModel0, lazyPagingItems0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview
    public static final void PreviewNotification(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x9BB86B4F);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9BB86B4F, v, -1, "com.kakao.tistory.presentation.screen.notification.ui.PreviewNotification (NotificationList.kt:206)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.NotificationListKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(v));
        }
    }

    public static final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(298900951);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(298900951, v, -1, "com.kakao.tistory.presentation.screen.notification.ui.ReadIcon (NotificationList.kt:279)");
            }
            Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 4.0f);
            Painter painter0 = PainterResources_androidKt.painterResource(drawable.dot_e1e1e1, composer1, 0);
            long v1 = ColorResources_androidKt.colorResource(color.point1, composer1, 0);
            ImageKt.Image(painter0, null, modifier0, null, null, 0.0f, Companion.tint-xETnrds$default(ColorFilter.Companion, v1, 0, 2, null), composer1, 440, 56);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(v));
        }
    }

    public static final void a(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x4AB09D5F);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4AB09D5F, v1, -1, "com.kakao.tistory.presentation.screen.notification.ui.HtmlText (NotificationList.kt:254)");
            }
            Spanned spanned0 = HtmlCompat.fromHtml((s == null ? "" : s), 0);
            Intrinsics.checkNotNullExpressionValue(spanned0, "fromHtml(...)");
            g g0 = new g(spanned0);
            Modifier modifier0 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, g0, 1, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            AndroidView_androidKt.AndroidView(new h(spanned0), null, null, composer1, 0, 6);
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
            scopeUpdateScope0.updateScope(new i(s, v));
        }
    }

    public static final void access$Notification(Notification notificationItem$Notification0, Function0 function00, Function0 function01, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(-73095874);
        Function0 function02 = (v1 & 2) == 0 ? function00 : j.a;
        Function0 function03 = (v1 & 4) == 0 ? function01 : k.a;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-73095874, v, -1, "com.kakao.tistory.presentation.screen.notification.ui.Notification (NotificationList.kt:122)");
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(ClickableKt.combinedClickable-cJG_KMw$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), false, "", null, "", function03, null, function02, 37, null), 10.0f, 0.0f, 20.0f, 0.0f, 10, null);
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 22.0f, 0.0f, 0.0f, 13, null);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
        Function0 function05 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function05);
        }
        else {
            composer1.useNode();
        }
        Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function21);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        if(notificationItem$Notification0.getRead()) {
            composer1.startReplaceGroup(0xBB2521F1);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 10.0f), composer1, 6);
        }
        else {
            composer1.startReplaceGroup(0xBB2628B7);
            NotificationListKt.a(composer1, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 6.0f), composer1, 6);
        }
        composer1.endReplaceGroup();
        String s = notificationItem$Notification0.getRepresentativeImage();
        BlogThumbnailKt.BlogThumbnail-EUb7tLY((s == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(s)), 40.0f, null, false, null, composer1, 0x30, 28);
        composer1.endNode();
        c.a(15.0f, modifier$Companion0, composer1, 6);
        Modifier modifier4 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 19.0f, 0.0f, 22.0f, 5, null);
        MeasurePolicy measurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
        Function0 function06 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function06);
        }
        else {
            composer1.useNode();
        }
        Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
            d.a(v4, composer1, v4, function22);
        }
        Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
        NotificationListKt.a(notificationItem$Notification0.getTitle(), composer1, 0);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 7.0f), composer1, 6);
        composer1.startReplaceGroup(0xFDC7A6FC);
        String s1 = notificationItem$Notification0.getContent();
        if(s1 != null && !p.isBlank(s1)) {
            NotificationListKt.b(notificationItem$Notification0.getContent(), composer1, 0);
            b.a(8.0f, modifier$Companion0, composer1, 6);
        }
        composer1.endReplaceGroup();
        MeasurePolicy measurePolicy3 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
        Function0 function07 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function07);
        }
        else {
            composer1.useNode();
        }
        Function2 function23 = a.a(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap3);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
            d.a(v5, composer1, v5, function23);
        }
        Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
        androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0 = FontWeight.Companion;
        TextStyle textStyle0 = new TextStyle(0xFF88888800000000L, 0x141400000L, fontWeight$Companion0.getLight(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ((notificationItem$Notification0.getBottomLabel() == null ? "" : notificationItem$Notification0.getBottomLabel()), rowScopeInstance0.weight(modifier$Companion0, 1.0f, false), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, textStyle0, composer1, 0, 0x6C30, 0x197FC);
        c.a(6.0f, modifier$Companion0, composer1, 6);
        BoxKt.Box(BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(modifier$Companion0, 2.0f), ColorResources_androidKt.colorResource(color.gray3, composer1, 0), RoundedCornerShapeKt.getCircleShape()), composer1, 0);
        SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 6.0f), composer1, 6);
        String s2 = notificationItem$Notification0.getTimestamp();
        composer1.startReplaceGroup(0x939D298F);
        if(s2 != null) {
            TextStyle textStyle1 = new TextStyle(0xFF88888800000000L, 0x141400000L, fontWeight$Companion0.getLight(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null);
            DateTimeTextKt.DateTimeText-Vc6wB30(s2, DateTimeFormat.DATE_TIME_FORMAT_yyyy_M_d, true, null, null, 0L, 0L, textStyle1, composer1, 0x1B0, 120);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        composer1.endNode();
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(notificationItem$Notification0, function02, function03, v, v1));
        }
    }

    public static final void access$QuoteText$lambda$10(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final String access$QuoteText$lambda$6(MutableState mutableState0) {
        return (String)mutableState0.getValue();
    }

    public static final void access$QuoteText$lambda$7(MutableState mutableState0, String s) {
        mutableState0.setValue(s);
    }

    public static final boolean access$QuoteText$lambda$9(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void b(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xE0DE640A);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE0DE640A, v1, -1, "com.kakao.tistory.presentation.screen.notification.ui.QuoteText (NotificationList.kt:226)");
            }
            composer1.startReplaceGroup(0x22FD9B4F);
            boolean z = false;
            MutableState mutableState0 = composer1.rememberedValue();
            if((v1 & 14) == 4 || mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default((s == null ? "" : s), null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(587048390);
            if((v1 & 14) == 4) {
                z = true;
            }
            MutableState mutableState1 = composer1.rememberedValue();
            if(z || mutableState1 == Composer.Companion.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            composer1.endReplaceGroup();
            String s1 = wb.a.d("\"", ((String)mutableState0.getValue()), "\"");
            TextStyle textStyle0 = new TextStyle(0xFF22222200000000L, 0x141600000L, FontWeight.Companion.getLight(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null);
            composer1.startReplaceGroup(587060914);
            boolean z1 = composer1.changed(mutableState1);
            boolean z2 = composer1.changed(mutableState0);
            t t0 = composer1.rememberedValue();
            if(z1 || z2 || t0 == Composer.Companion.getEmpty()) {
                t0 = new t(mutableState1, mutableState0);
                composer1.updateRememberedValue(t0);
            }
            composer1.endReplaceGroup();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s1, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, false, 2, 0, t0, textStyle0, composer1, 0, 0x6C30, 0x97FE);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(s, v));
        }
    }
}

