package com.kakao.tistory.presentation.screen.home.ui.common;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import c;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A6\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"SlotStoryCreator", "", "storyCreator", "", "style", "Landroidx/compose/ui/text/TextStyle;", "modifier", "Landroidx/compose/ui/Modifier;", "labelSize", "Landroidx/compose/ui/unit/Dp;", "SlotStoryCreator--jt2gSs", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotStoryCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotStoryCreator.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotStoryCreatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,49:1\n148#2:50\n148#2:87\n98#3:51\n95#3,6:52\n101#3:86\n105#3:91\n78#4,6:58\n85#4,4:73\n89#4,2:83\n93#4:90\n368#5,9:64\n377#5:85\n378#5,2:88\n4032#6,6:77\n*S KotlinDebug\n*F\n+ 1 SlotStoryCreator.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotStoryCreatorKt\n*L\n27#1:50\n39#1:87\n29#1:51\n29#1:52,6\n29#1:86\n29#1:91\n29#1:58,6\n29#1:73,4\n29#1:83,2\n29#1:90\n29#1:64,9\n29#1:85\n29#1:88,2\n29#1:77,6\n*E\n"})
public final class SlotStoryCreatorKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SlotStoryCreator--jt2gSs(@NotNull String s, @NotNull TextStyle textStyle0, @Nullable Modifier modifier0, float f, @Nullable Composer composer0, int v, int v1) {
        float f1;
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "storyCreator");
        Intrinsics.checkNotNullParameter(textStyle0, "style");
        Composer composer1 = composer0.startRestartGroup(0x38630F30);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(textStyle0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(f) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
            float f2 = (v1 & 8) == 0 ? f : 14.0f;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x38630F30, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotStoryCreator (SlotStoryCreator.kt:27)");
            }
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_story, composer1, 0), StringResources_androidKt.stringResource(string.content_desc_story_creator, composer1, 0), SizeKt.size-3ABfNKs(Modifier.Companion, f2), 0L, composer1, 3080, 0);
            c.a(4.0f, Modifier.Companion, composer1, 6);
            TextKt.Text--4IGK_g(s, Modifier.Companion, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, textStyle0, composer1, v2 & 14 | 0x30, v2 << 15 & 0x380000 | 0xC30, 0xD7FC);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            f1 = f2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m1(s, textStyle0, modifier1, f1, v, v1));
        }
    }
}

