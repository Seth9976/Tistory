package com.kakao.tistory.presentation.widget.common;

import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.room.a;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.common.utils.UrlUtils;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A\u0085\u0001\u0010\u0012\u001A\u00020\f2\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0003\u0010\b\u001A\u00020\u00062\b\b\u0003\u0010\t\u001A\u00020\u00062\u0014\b\u0002\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n2\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\f0\n2\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\f0\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017²\u0006\u000E\u0010\u0015\u001A\u00020\u00148\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0016\u001A\u00020\u00148\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", "style", "", "ellipsisLine", "moreText", "moreColor", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "", "onClickLink", "Lkotlin/Function0;", "onClickReadMore", "ReadMoreTextView", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "isOverMaxLine", "expended", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nReadMoreTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadMoreTextView.kt\ncom/kakao/tistory/presentation/widget/common/ReadMoreTextViewKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,93:1\n1223#2,6:94\n1223#2,6:100\n1223#2,6:106\n1223#2,6:112\n1223#2,6:118\n1223#2,6:124\n1240#3:130\n81#4:131\n107#4,2:132\n81#4:134\n107#4,2:135\n*S KotlinDebug\n*F\n+ 1 ReadMoreTextView.kt\ncom/kakao/tistory/presentation/widget/common/ReadMoreTextViewKt\n*L\n35#1:94,6\n36#1:100,6\n38#1:106,6\n46#1:112,6\n51#1:118,6\n59#1:124,6\n73#1:130\n35#1:131\n35#1:132,2\n36#1:134\n36#1:135,2\n*E\n"})
public final class ReadMoreTextViewKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ReadMoreTextView(@Nullable Modifier modifier0, @NotNull AnnotatedString annotatedString0, @Nullable TextStyle textStyle0, int v, @StringRes int v1, @ColorRes int v2, @Nullable Function1 function10, @Nullable Function1 function11, @Nullable Function0 function00, @Nullable Composer composer0, int v3, int v4) {
        Function1 function13;
        int v13;
        int v12;
        TextStyle textStyle2;
        Function0 function01;
        Function1 function12;
        int v18;
        Function1 function14;
        int v17;
        int v16;
        int v15;
        int v14;
        int v11;
        int v10;
        int v9;
        int v8;
        int v7;
        int v6;
        TextStyle textStyle1;
        Modifier modifier1;
        int v5;
        Intrinsics.checkNotNullParameter(annotatedString0, "text");
        Composer composer1 = composer0.startRestartGroup(0xA4E99696);
        if((v4 & 1) != 0) {
            v5 = v3 | 6;
            modifier1 = modifier0;
        }
        else if((v3 & 14) == 0) {
            modifier1 = modifier0;
            v5 = (composer1.changed(modifier1) ? 4 : 2) | v3;
        }
        else {
            modifier1 = modifier0;
            v5 = v3;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v5 |= (composer1.changed(annotatedString0) ? 0x20 : 16);
        }
        if((v3 & 0x380) == 0) {
            if((v4 & 4) == 0) {
                textStyle1 = textStyle0;
                v6 = composer1.changed(textStyle1) ? 0x100 : 0x80;
            }
            else {
                textStyle1 = textStyle0;
                v6 = 0x80;
            }
            v5 |= v6;
        }
        else {
            textStyle1 = textStyle0;
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
            v7 = v;
        }
        else if((v3 & 0x1C00) == 0) {
            v7 = v;
            v5 |= (composer1.changed(v7) ? 0x800 : 0x400);
        }
        else {
            v7 = v;
        }
        if((0xE000 & v3) == 0) {
            if((v4 & 16) == 0) {
                v8 = v1;
                v9 = composer1.changed(v8) ? 0x4000 : 0x2000;
            }
            else {
                v8 = v1;
                v9 = 0x2000;
            }
            v5 |= v9;
        }
        else {
            v8 = v1;
        }
        if((0x70000 & v3) == 0) {
            if((v4 & 0x20) == 0) {
                v10 = v2;
                v11 = composer1.changed(v10) ? 0x20000 : 0x10000;
            }
            else {
                v10 = v2;
                v11 = 0x10000;
            }
            v5 |= v11;
        }
        else {
            v10 = v2;
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v3 & 0x380000) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0x1C00000) == 0) {
            v5 |= (composer1.changedInstance(function11) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v3 & 0xE000000) == 0) {
            v5 |= (composer1.changedInstance(function00) ? 0x4000000 : 0x2000000);
        }
        if((v5 & 0xB6DB6DB) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v4 & 1) != 0) {
                    modifier1 = Modifier.Companion;
                }
                if((v4 & 4) != 0) {
                    v5 &= -897;
                    textStyle1 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getBody1();
                }
                if((v4 & 8) != 0) {
                    v7 = 14;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                    v8 = string.label_comment_read_more;
                }
                if((v4 & 0x20) != 0) {
                    v10 = color.gray2;
                    v5 &= 0xFFF8FFFF;
                }
                Function1 function15 = (v4 & 0x40) == 0 ? function10 : c2.a;
                Function1 function16 = (v4 & 0x80) == 0 ? function11 : d2.a;
                function01 = (v4 & 0x100) == 0 ? function00 : e2.a;
                function12 = function16;
                v14 = v5;
                v15 = v7;
                v17 = v10;
                function14 = function15;
                v16 = v8;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x20) != 0) {
                    v5 &= 0xFFF8FFFF;
                }
                function12 = function11;
                function01 = function00;
                v14 = v5;
                v15 = v7;
                v16 = v8;
                v17 = v10;
                function14 = function10;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA4E99696, v14, -1, "com.kakao.tistory.presentation.widget.common.ReadMoreTextView (ReadMoreTextView.kt:33)");
            }
            composer1.startReplaceGroup(0x5B038ECC);
            boolean z = true;
            MutableState mutableState0 = composer1.rememberedValue();
            if((v14 & 0x70) == 0x20 || mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x5B03966C);
            MutableState mutableState1 = composer1.rememberedValue();
            if((v14 & 0x70) == 0x20 || mutableState1 == Composer.Companion.getEmpty()) {
                v18 = v15;
                mutableState1 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            else {
                v18 = v15;
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x5B039E89);
            AnnotatedString annotatedString1 = composer1.rememberedValue();
            if((v14 & 0x70) == 0x20 || annotatedString1 == Composer.Companion.getEmpty()) {
                annotatedString1 = ReadMoreTextViewKt.a(annotatedString0);
                composer1.updateRememberedValue(annotatedString1);
            }
            composer1.endReplaceGroup();
            int v19 = ((Boolean)mutableState1.getValue()).booleanValue() ? 0x7FFFFFFF : v18;
            TextStyle textStyle3 = TextStyle.copy-p1EtxEg$default(textStyle1, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 0xF7FFFF, null);
            composer1.startReplaceGroup(0x5B03C8A7);
            boolean z1 = composer1.changed(mutableState0);
            f2 f20 = composer1.rememberedValue();
            if((v14 & 0x380000) == 0x100000 || z1 || f20 == Composer.Companion.getEmpty()) {
                f20 = new f2(function14, mutableState0);
                composer1.updateRememberedValue(f20);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x5B03DADD);
            boolean z2 = composer1.changed(annotatedString1);
            g2 g20 = composer1.rememberedValue();
            if((v14 & 0x1C00000) == 0x800000 || z2 || g20 == Composer.Companion.getEmpty()) {
                g20 = new g2(annotatedString1, function12);
                composer1.updateRememberedValue(g20);
            }
            composer1.endReplaceGroup();
            ClickableTextKt.ClickableText-4YKlhWE(annotatedString1, modifier1, textStyle3, false, 1, v19, f20, g20, composer1, v14 << 3 & 0x70 | 0x6000, 8);
            if(!((Boolean)mutableState1.getValue()).booleanValue() && ((Boolean)mutableState0.getValue()).booleanValue()) {
                Companion modifier$Companion0 = Modifier.Companion;
                composer1.startReplaceGroup(0x5B03FFA9);
                if((v14 & 0xE000000) != 0x4000000) {
                    z = false;
                }
                boolean z3 = composer1.changed(mutableState1);
                h2 h20 = composer1.rememberedValue();
                if(z || z3 || h20 == Composer.Companion.getEmpty()) {
                    h20 = new h2(function01, mutableState1);
                    composer1.updateRememberedValue(h20);
                }
                composer1.endReplaceGroup();
                Modifier modifier2 = ClickableKt.clickable-XHw0xAI$default(modifier$Companion0, false, null, null, h20, 7, null);
                String s = StringResources_androidKt.stringResource(v16, composer1, v14 >> 12 & 14);
                FontWeight fontWeight0 = FontWeight.Companion.getNormal();
                ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier2, ColorResources_androidKt.colorResource(v17, composer1, v14 >> 15 & 14), 0x141400000L, null, fontWeight0, TypeKt.getTFont(), 0L, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0x1B0C00, 0xC00, 0x3DF90);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v12 = v18;
            v8 = v16;
            v13 = v17;
            function13 = function14;
            textStyle2 = textStyle1;
        }
        else {
            composer1.skipToGroupEnd();
            function12 = function11;
            function01 = function00;
            textStyle2 = textStyle1;
            v12 = v7;
            v13 = v10;
            function13 = function10;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i2(modifier1, annotatedString0, textStyle2, v12, v8, v13, function13, function12, function01, v3, v4));
        }
    }

    public static final AnnotatedString a(AnnotatedString annotatedString0) {
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        annotatedString$Builder0.append(annotatedString0);
        for(Object object0: Regex.findAll$default(StringUtils.INSTANCE.getREGEX_URL(), annotatedString0, 0, 2, null)) {
            MatchResult matchResult0 = (MatchResult)object0;
            String s = matchResult0.getValue();
            annotatedString$Builder0.addStringAnnotation("link", (UrlUtils.INSTANCE.isUrl(s) ? matchResult0.getValue() : a.j("https://", matchResult0.getValue())), matchResult0.getRange().getFirst(), matchResult0.getRange().getLast() + 1);
            annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, null, 0xEFFF, null), matchResult0.getRange().getFirst(), matchResult0.getRange().getLast() + 1);
        }
        return annotatedString$Builder0.toAnnotatedString();
    }

    public static final void access$ReadMoreTextView$lambda$2(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final void access$ReadMoreTextView$lambda$5(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }
}

