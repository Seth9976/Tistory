package com.kakao.tistory.presentation.screen.home.ui;

import a;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.TypeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\r\u0010\u0003\u001A\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001A\r\u0010\u0006\u001A\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"COPYRIGHT", "", "COPYRIGHT_SLOT_TYPE", "HomeCopyright", "", "(Landroidx/compose/runtime/Composer;I)V", "HomeCopyrightPreview", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHomeCopyright.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCopyright.kt\ncom/kakao/tistory/presentation/screen/home/ui/HomeCopyrightKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,67:1\n148#2:68\n148#2:107\n148#2:108\n1223#3,6:69\n98#4,3:75\n101#4:106\n105#4:112\n78#5,6:78\n85#5,4:93\n89#5,2:103\n93#5:111\n368#6,9:84\n377#6:105\n378#6,2:109\n4032#7,6:97\n*S KotlinDebug\n*F\n+ 1 HomeCopyright.kt\ncom/kakao/tistory/presentation/screen/home/ui/HomeCopyrightKt\n*L\n43#1:68\n56#1:107\n57#1:108\n44#1:69,6\n38#1:75,3\n38#1:106\n38#1:112\n38#1:78,6\n38#1:93,4\n38#1:103,2\n38#1:111\n38#1:84,9\n38#1:105\n38#1:109,2\n38#1:97,6\n*E\n"})
public final class HomeCopyrightKt {
    @NotNull
    public static final String COPYRIGHT = "CopyRight";
    @NotNull
    public static final String COPYRIGHT_SLOT_TYPE = "footer";

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void HomeCopyright(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x1A8F672F);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1A8F672F, v, -1, "com.kakao.tistory.presentation.screen.home.ui.HomeCopyright (HomeCopyright.kt:32)");
            }
            TextStyle textStyle0 = new TextStyle(0L, 0x141400000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0x141400000L, null, null, null, 0, 0, null, 0xFD7FD8, null);
            String s = StringResources_androidKt.stringResource(string.content_desc_copyright, composer1, 0);
            Vertical alignment$Vertical0 = Alignment.Companion.getCenterVertically();
            HorizontalOrVertical arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.getCenter();
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-VpY3zN4(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 20.0f, 40.0f);
            composer1.startReplaceGroup(-1709850220);
            boolean z = composer1.changed(s);
            d d0 = composer1.rememberedValue();
            if(z || d0 == Composer.Companion.getEmpty()) {
                d0 = new d(s);
                composer1.updateRememberedValue(d0);
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = SemanticsModifierKt.clearAndSetSemantics(modifier0, d0);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement$HorizontalOrVertical0, alignment$Vertical0, composer1, 54);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
                d.a(v1, composer1, v1, function20);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_copyright_front, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0, 0, 0xFFFE);
            Modifier modifier3 = SizeKt.size-3ABfNKs(PaddingKt.padding-3ABfNKs(modifier$Companion0, 1.0f), 16.0f);
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_heart_copyright, composer1, 0), null, modifier3, null, null, 0.0f, null, composer1, 440, 120);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_copyright_back, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0, 0, 0xFFFE);
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
            scopeUpdateScope0.updateScope(new e(v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true, widthDp = 375)
    public static final void HomeCopyrightPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1000380637);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1000380637, v, -1, "com.kakao.tistory.presentation.screen.home.ui.HomeCopyrightPreview (HomeCopyright.kt:24)");
            }
            HomeCopyrightKt.HomeCopyright(composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(v));
        }
    }
}

