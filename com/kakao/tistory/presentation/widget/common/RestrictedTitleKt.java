package com.kakao.tistory.presentation.widget.common;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.RestrictType;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001AJ\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u0001\u001A\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000F"}, d2 = {"", "title", "entryRestrict", "", "isMine", "Landroidx/compose/ui/unit/TextUnit;", "letterSpacing", "Landroidx/compose/ui/text/TextStyle;", "style", "", "maxLines", "", "RestrictedTitle-KgUXRuw", "(Ljava/lang/String;Ljava/lang/String;ZJLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/runtime/Composer;II)V", "RestrictedTitle", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRestrictedTitle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RestrictedTitle.kt\ncom/kakao/tistory/presentation/widget/common/RestrictedTitleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,65:1\n77#2:66\n1240#3:67\n1039#3,6:68\n*S KotlinDebug\n*F\n+ 1 RestrictedTitle.kt\ncom/kakao/tistory/presentation/widget/common/RestrictedTitleKt\n*L\n20#1:66\n41#1:67\n50#1:68,6\n*E\n"})
public final class RestrictedTitleKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void RestrictedTitle-KgUXRuw(@NotNull String s, @Nullable String s1, boolean z, long v, @Nullable TextStyle textStyle0, int v1, @Nullable Composer composer0, int v2, int v3) {
        int v6;
        TextStyle textStyle1;
        int v7;
        TextStyle textStyle2;
        TextStyle textStyle3;
        long v5;
        int v4;
        Intrinsics.checkNotNullParameter(s, "title");
        Composer composer1 = composer0.startRestartGroup(0xD12355CF);
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
            v4 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v3 & 8) == 0) {
            v5 = v;
            if((v2 & 0x1C00) == 0) {
                v4 |= (composer1.changed(v5) ? 0x800 : 0x400);
            }
        }
        else {
            v4 |= 0xC00;
            v5 = v;
        }
        if((v2 & 0xE000) == 0) {
            v4 |= ((v3 & 16) != 0 || !composer1.changed(textStyle0) ? 0x2000 : 0x4000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((0x70000 & v2) == 0) {
            v4 |= (composer1.changed(v1) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v4) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v3 & 8) != 0) {
                    v5 = 0x7FC00000L;
                }
                if((v3 & 16) == 0) {
                    textStyle3 = textStyle0;
                }
                else {
                    textStyle3 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
                    v4 &= 0xFFFF1FFF;
                }
                if((v3 & 0x20) == 0) {
                    textStyle2 = textStyle3;
                    v7 = v1;
                }
                else {
                    textStyle2 = textStyle3;
                    v7 = 0x7FFFFFFF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 16) != 0) {
                    v4 &= 0xFFFF1FFF;
                }
                textStyle2 = textStyle0;
                v7 = v1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD12355CF, v4, -1, "com.kakao.tistory.presentation.widget.common.RestrictedTitle (RestrictedTitle.kt:21)");
            }
            ExcludeFontPaddingTextKt.Text-edWjEy0(RestrictedTitleKt.a(s, s1, z, composer1, v4 & 0x3FE), null, 0L, 0L, null, null, null, v5, null, null, 0L, 2, false, false, v7, 0, null, null, textStyle2, composer1, v4 << 12 & 0x1C00000, 0xE000 & v4 >> 3 | 0xC30 | v4 << 12 & 0xE000000, 235390);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle1 = textStyle2;
            v6 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            textStyle1 = textStyle0;
            v6 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j2(s, s1, z, v5, textStyle1, v6, v2, v3));
        }
    }

    public static final AnnotatedString a(String s, String s1, boolean z, Composer composer0, int v) {
        String s2;
        composer0.startReplaceGroup(-1113250621);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1113250621, v, -1, "com.kakao.tistory.presentation.widget.common.getRestrictedText (RestrictedTitle.kt:39)");
        }
        Unit unit0 = null;
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        RestrictType restrictType0 = RestrictType.ADMIN_DELETE;
        if(Intrinsics.areEqual(s1, "del")) {
            composer0.startReplaceGroup(1656590450);
            s2 = StringResources_androidKt.stringResource(restrictType0.getTitleStringId(), composer0, 6);
            composer0.endReplaceGroup();
        }
        else {
            RestrictType restrictType1 = RestrictType.TEMPORARY;
            if(Intrinsics.areEqual(s1, "tmp")) {
                composer0.startReplaceGroup(0x62BD9D8F);
                s2 = StringResources_androidKt.stringResource(restrictType1.getTitleStringId(), composer0, 6);
                composer0.endReplaceGroup();
            }
            else {
                composer0.startReplaceGroup(0xF4F73C27);
                composer0.endReplaceGroup();
                s2 = null;
            }
        }
        composer0.startReplaceGroup(0xE172D6F9);
        if(s2 != null) {
            if(z) {
                composer0.startReplaceGroup(0xAD49FC50);
                int v1 = annotatedString$Builder0.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(color.point1, composer0, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFE, null));
                try {
                    annotatedString$Builder0.append("[" + s2 + "]");
                }
                finally {
                    annotatedString$Builder0.pop(v1);
                }
                if(!Intrinsics.areEqual(s1, restrictType0.getValue()) && Intrinsics.areEqual(s1, "tmp")) {
                    annotatedString$Builder0.append(" " + s);
                }
            }
            else {
                composer0.startReplaceGroup(0xAD4F5376);
                if(Intrinsics.areEqual(s1, restrictType0.getValue())) {
                    annotatedString$Builder0.append(s2);
                }
                else if(Intrinsics.areEqual(s1, "tmp")) {
                    annotatedString$Builder0.append(s2 + " " + StringResources_androidKt.stringResource(string.label_entry_restricted_sub, composer0, 0));
                }
            }
            composer0.endReplaceGroup();
            unit0 = Unit.INSTANCE;
        }
        composer0.endReplaceGroup();
        if(unit0 == null) {
            annotatedString$Builder0.append(s);
        }
        AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return annotatedString0;
    }
}

