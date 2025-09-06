package com.kakao.tistory.presentation.widget.common;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.common.utils.DateUtils.DateTimeFormat;
import com.kakao.tistory.presentation.common.utils.DateUtils;
import java.time.ZonedDateTime;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\u001Ad\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001Ad\u0010\u0000\u001A\u00020\u00012\b\u0010\u0014\u001A\u0004\u0018\u00010\u00152\u0006\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0016\u001A\u00020\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"DateTimeText", "", "date", "Ljava/util/Date;", "format", "Lcom/kakao/tistory/presentation/common/utils/DateUtils$DateTimeFormat;", "includeFontPadding", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "color", "Landroidx/compose/ui/graphics/Color;", "style", "Landroidx/compose/ui/text/TextStyle;", "DateTimeText-Vc6wB30", "(Ljava/util/Date;Lcom/kakao/tistory/presentation/common/utils/DateUtils$DateTimeFormat;ZLandroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;JJLandroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)V", "time", "", "isRelative", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/common/utils/DateUtils$DateTimeFormat;ZLandroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;JJLandroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDateTimeText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimeText.kt\ncom/kakao/tistory/presentation/widget/common/DateTimeTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,92:1\n77#2:93\n77#2:100\n77#2:101\n1223#3,6:94\n1223#3,6:102\n*S KotlinDebug\n*F\n+ 1 DateTimeText.kt\ncom/kakao/tistory/presentation/widget/common/DateTimeTextKt\n*L\n29#1:93\n60#1:100\n67#1:101\n37#1:94,6\n81#1:102,6\n*E\n"})
public final class DateTimeTextKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DateTimeText-Vc6wB30(@Nullable String s, @NotNull DateTimeFormat dateUtils$DateTimeFormat0, boolean z, @Nullable FontFamily fontFamily0, @Nullable FontWeight fontWeight0, long v, long v1, @Nullable TextStyle textStyle0, @Nullable Composer composer0, int v2, int v3) {
        String s2;
        String s1;
        long v7;
        long v6;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        TextStyle textStyle1;
        long v5;
        FontWeight fontWeight1;
        FontFamily fontFamily1;
        boolean z1;
        int v4;
        Intrinsics.checkNotNullParameter(dateUtils$DateTimeFormat0, "format");
        Composer composer1 = composer0.startRestartGroup(1014786274);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(dateUtils$DateTimeFormat0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
            z1 = z;
        }
        else if((v2 & 0x380) == 0) {
            z1 = z;
            v4 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        else {
            z1 = z;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            fontFamily1 = fontFamily0;
        }
        else if((v2 & 0x1C00) == 0) {
            fontFamily1 = fontFamily0;
            v4 |= (composer1.changed(fontFamily1) ? 0x800 : 0x400);
        }
        else {
            fontFamily1 = fontFamily0;
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            fontWeight1 = fontWeight0;
        }
        else if((0xE000 & v2) == 0) {
            fontWeight1 = fontWeight0;
            v4 |= (composer1.changed(fontWeight1) ? 0x4000 : 0x2000);
        }
        else {
            fontWeight1 = fontWeight0;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.changed(v) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) == 0) {
            v5 = v1;
            if((v2 & 0x380000) == 0) {
                v4 |= (composer1.changed(v5) ? 0x100000 : 0x80000);
            }
        }
        else {
            v4 |= 0x180000;
            v5 = v1;
        }
        if((v2 & 0x1C00000) == 0) {
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(textStyle0) ? 0x400000 : 0x800000);
        }
        if((0x16DB6DB & v4) == 4793490 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            textStyle1 = textStyle0;
            fontFamily2 = fontFamily1;
            fontWeight2 = fontWeight1;
            v6 = v5;
            v7 = v;
            goto label_113;
        }
        composer1.startDefaults();
        if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
            if((v3 & 4) != 0) {
                z1 = false;
            }
            if((v3 & 8) != 0) {
                fontFamily1 = null;
            }
            if((v3 & 16) != 0) {
                fontWeight1 = null;
            }
            if((v3 & 0x80) == 0) {
                textStyle1 = textStyle0;
            }
            else {
                v4 &= 0xFE3FFFFF;
                textStyle1 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
            }
            fontWeight2 = fontWeight1;
            v6 = (v3 & 0x40) == 0 ? v5 : 0L;
            v7 = (v3 & 0x20) == 0 ? v : 0x7FC00000L;
        }
        else {
            composer1.skipToGroupEnd();
            if((v3 & 0x80) != 0) {
                v4 &= 0xFE3FFFFF;
            }
            textStyle1 = textStyle0;
            fontWeight2 = fontWeight1;
            v6 = v5;
            v7 = v;
        }
        composer1.endDefaults();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1014786274, v4, -1, "com.kakao.tistory.presentation.widget.common.DateTimeText (DateTimeText.kt:60)");
        }
        if(s != null && !p.isBlank(s)) {
            if(((Boolean)composer1.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                s1 = s;
                s2 = s1;
            }
            else if(z1) {
                ZonedDateTime zonedDateTime0 = ZonedDateTime.now();
                Intrinsics.checkNotNull(zonedDateTime0);
                String s3 = DateUtils.getRelativeDateTime$default(DateUtils.INSTANCE, s, zonedDateTime0, dateUtils$DateTimeFormat0.getFormat(), null, 8, null);
                s1 = DateUtils.getRelativeDateTime$default(DateUtils.INSTANCE, s, zonedDateTime0, dateUtils$DateTimeFormat0.getContentDescriptionFormat(), null, 8, null);
                s2 = s3;
            }
            else {
                s2 = DateUtils.INSTANCE.getDateTimeFormatFromISO8601(s, dateUtils$DateTimeFormat0.getFormat());
                s1 = DateUtils.INSTANCE.getDateTimeFormatFromISO8601(s, dateUtils$DateTimeFormat0.getContentDescriptionFormat());
            }
            Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceGroup(0xD0029E73);
            boolean z2 = composer1.changed(s1);
            g1 g10 = composer1.rememberedValue();
            if(z2 || g10 == Composer.Companion.getEmpty()) {
                g10 = new g1(s1);
                composer1.updateRememberedValue(g10);
            }
            composer1.endReplaceGroup();
            androidx.compose.material3.TextKt.Text--4IGK_g(s2, SemanticsModifierKt.semantics$default(modifier$Companion0, false, g10, 1, null), v6, v7, null, fontWeight2, fontFamily1, 0L, null, null, 0L, 2, false, 1, 0, null, textStyle1, composer1, v4 >> 12 & 0x380 | v4 >> 6 & 0x1C00 | v4 << 3 & 0x70000 | v4 << 9 & 0x380000, v4 >> 3 & 0x380000 | 0xC30, 0xD790);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            fontFamily2 = fontFamily1;
        label_113:
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new h1(s, dateUtils$DateTimeFormat0, z1, fontFamily2, fontWeight2, v7, v6, textStyle1, v2, v3));
            }
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new f1(s, dateUtils$DateTimeFormat0, z1, fontFamily1, fontWeight2, v7, v6, textStyle1, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DateTimeText-Vc6wB30(@Nullable Date date0, @NotNull DateTimeFormat dateUtils$DateTimeFormat0, boolean z, @Nullable FontFamily fontFamily0, @Nullable FontWeight fontWeight0, long v, long v1, @Nullable TextStyle textStyle0, @Nullable Composer composer0, int v2, int v3) {
        int v6;
        TextStyle textStyle1;
        Intrinsics.checkNotNullParameter(dateUtils$DateTimeFormat0, "format");
        Composer composer1 = composer0.startRestartGroup(0x1A305265);
        boolean z1 = (v3 & 4) == 0 ? z : false;
        FontFamily fontFamily1 = (v3 & 8) == 0 ? fontFamily0 : null;
        FontWeight fontWeight1 = (v3 & 16) == 0 ? fontWeight0 : null;
        long v4 = (v3 & 0x20) == 0 ? v : 0x7FC00000L;
        long v5 = (v3 & 0x40) == 0 ? v1 : 0L;
        if((v3 & 0x80) == 0) {
            textStyle1 = textStyle0;
            v6 = v2;
        }
        else {
            textStyle1 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
            v6 = v2 & 0xFE3FFFFF;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1A305265, v6, -1, "com.kakao.tistory.presentation.widget.common.DateTimeText (DateTimeText.kt:29)");
        }
        if(date0 == null) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new c1(null, dateUtils$DateTimeFormat0, z1, fontFamily1, fontWeight1, v4, v5, textStyle1, v2, v3));
            }
            return;
        }
        String s = DateUtils.INSTANCE.getDateFormat(date0, dateUtils$DateTimeFormat0.getFormat());
        String s1 = DateUtils.INSTANCE.getDateFormat(date0, dateUtils$DateTimeFormat0.getContentDescriptionFormat());
        Companion modifier$Companion0 = Modifier.Companion;
        composer1.startReplaceGroup(0xD001F7F3);
        boolean z2 = composer1.changed(s1);
        d1 d10 = composer1.rememberedValue();
        if(z2 || d10 == Composer.Companion.getEmpty()) {
            d10 = new d1(s1);
            composer1.updateRememberedValue(d10);
        }
        composer1.endReplaceGroup();
        androidx.compose.material3.TextKt.Text--4IGK_g(s, SemanticsModifierKt.semantics$default(modifier$Companion0, false, d10, 1, null), v5, v4, null, fontWeight1, fontFamily1, 0L, null, null, 0L, 2, false, 1, 0, null, textStyle1, composer1, v6 >> 12 & 0x380 | v6 >> 6 & 0x1C00 | v6 << 3 & 0x70000 | v6 << 9 & 0x380000, v6 >> 3 & 0x380000 | 0xC30, 0xD790);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new e1(date0, dateUtils$DateTimeFormat0, z1, fontFamily1, fontWeight1, v4, v5, textStyle1, v2, v3));
        }
    }
}

