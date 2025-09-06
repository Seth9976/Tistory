package com.kakao.tistory.presentation.widget.entry;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import c;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import com.kakao.tistory.presentation.common.utils.DateUtils.DateTimeFormat;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.common.DateTimeTextKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\'\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "item", "", "showLikeAndComment", "isMine", "", "EntryStatus", "(Lcom/kakao/tistory/domain/entity/entry/EntryItem;ZZLandroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryStatus.kt\ncom/kakao/tistory/presentation/widget/entry/EntryStatusKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,84:1\n148#2:85\n148#2:122\n148#2:123\n148#2:124\n148#2:125\n148#2:130\n158#2:137\n148#2:138\n98#3:86\n95#3,6:87\n101#3:121\n105#3:129\n78#4,6:93\n85#4,4:108\n89#4,2:118\n93#4:128\n368#5,9:99\n377#5:120\n378#5,2:126\n4032#6,6:112\n1223#7,6:131\n*S KotlinDebug\n*F\n+ 1 EntryStatus.kt\ncom/kakao/tistory/presentation/widget/entry/EntryStatusKt\n*L\n31#1:85\n36#1:122\n38#1:123\n49#1:124\n50#1:125\n64#1:130\n73#1:137\n81#1:138\n30#1:86\n30#1:87,6\n30#1:121\n30#1:129\n30#1:93,6\n30#1:108,4\n30#1:118,2\n30#1:128\n30#1:99,9\n30#1:120\n30#1:126,2\n30#1:112,6\n66#1:131,6\n*E\n"})
public final class EntryStatusKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EntryStatus(@NotNull EntryItem entryItem0, boolean z, boolean z1, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(entryItem0, "item");
        Composer composer1 = composer0.startRestartGroup(0xD65C0BFD);
        int v1 = (v & 14) == 0 ? (composer1.changed(entryItem0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD65C0BFD, v1, -1, "com.kakao.tistory.presentation.widget.entry.EntryStatus (EntryStatus.kt:28)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, (z1 ? 5.0f : 8.0f), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
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
            r0.a.z(composeUiNode$Companion0, composer1, modifier1, composer1, 0xF5B16215);
            if(z) {
                EntryStatusKt.a(drawable.ic_list_like, entryItem0.getLikeCount(), string.content_desc_like, composer1, 0);
                c.a(6.0f, modifier$Companion0, composer1, 6);
                EntryStatusKt.a(drawable.ic_list_comment, entryItem0.getCommentCount(), string.content_desc_comment, composer1, 0);
                c.a(6.0f, modifier$Companion0, composer1, 6);
            }
            composer1.endReplaceGroup();
            TextStyle textStyle0 = TypeKt.getSubtext2(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable));
            boolean z2 = Intrinsics.areEqual(entryItem0.getScheduleStatus(), "scheduled");
            DateTimeTextKt.DateTimeText-Vc6wB30(entryItem0.getPublished(), DateTimeFormat.DATE_TIME_FORMAT_yyyy_M_d, !z2, null, null, 0L, 0L, textStyle0, composer1, 0x30, 120);
            EntryStatusImageViewKt.EntryStatusImageView(SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 4.0f, 0.0f, 0.0f, 0.0f, 14, null), 18.0f), entryItem0, composer1, v1 << 3 & 0x70 | 6, 0);
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
            scopeUpdateScope0.updateScope(new l(entryItem0, z, z1, v));
        }
    }

    public static final void a(int v, long v1, int v2, Composer composer0, int v3) {
        Composer composer1 = composer0.startRestartGroup(0xFE2ED6F8);
        int v4 = (v3 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        if((v3 & 0x70) == 0) {
            v4 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v3 & 0x380) == 0) {
            v4 |= (composer1.changed(v2) ? 0x100 : 0x80);
        }
        if((v4 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFE2ED6F8, v4, -1, "com.kakao.tistory.presentation.widget.entry.CountItem (EntryStatus.kt:56)");
            }
            String s = StringResources_androidKt.stringResource(v2, new Object[]{v1}, composer1, v4 >> 6 & 14 | 0x40);
            ImageKt.Image(PainterResources_androidKt.painterResource(v, composer1, v4 & 14), null, null, null, null, 0.0f, null, composer1, 56, 0x7C);
            Companion modifier$Companion0 = Modifier.Companion;
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 4.0f), composer1, 6);
            composer1.startReplaceGroup(0x440F904E);
            boolean z = composer1.changed(s);
            i i0 = composer1.rememberedValue();
            if(z || i0 == Composer.Companion.getEmpty()) {
                i0 = new i(s);
                composer1.updateRememberedValue(i0);
            }
            composer1.endReplaceGroup();
            Modifier modifier0 = SemanticsModifierKt.semantics$default(modifier$Companion0, false, i0, 1, null);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringExtensionKt.toFormattedString(v1, 4), modifier0, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TypeKt.getSubtext2(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), composer1, 0, 0xC00, 0x1DFFC);
            c.a(6.5f, modifier$Companion0, composer1, 6);
            EntryStatusKt.a(null, composer1, 0, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(v, v1, v2, v3));
        }
    }

    public static final void a(Modifier modifier0, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(644051108);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(644051108, v2, -1, "com.kakao.tistory.presentation.widget.entry.Dot (EntryStatus.kt:77)");
            }
            BoxKt.Box(BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(modifier0, 2.0f), ColorResources_androidKt.colorResource(color.gray3, composer1, 0), RoundedCornerShapeKt.getCircleShape()), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(modifier0, v, v1));
        }
    }
}

