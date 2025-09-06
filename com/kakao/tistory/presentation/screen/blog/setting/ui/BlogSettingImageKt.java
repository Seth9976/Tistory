package com.kakao.tistory.presentation.screen.blog.setting.ui;

import a;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
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
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A\'\u0010\u0005\u001A\u00020\u00032\b\u0010\u0001\u001A\u0004\u0018\u00010\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "imageUrl", "Lkotlin/Function0;", "", "onClickImage", "BlogSettingImage", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogSettingImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogSettingImage.kt\ncom/kakao/tistory/presentation/screen/blog/setting/ui/BlogSettingImageKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,72:1\n148#2:73\n148#2:74\n148#2:77\n148#2:114\n56#3:75\n71#3:76\n71#4:78\n68#4,6:79\n74#4:113\n78#4:118\n78#5,6:85\n85#5,4:100\n89#5,2:110\n93#5:117\n368#6,9:91\n377#6:112\n378#6,2:115\n4032#7,6:104\n*S KotlinDebug\n*F\n+ 1 BlogSettingImage.kt\ncom/kakao/tistory/presentation/screen/blog/setting/ui/BlogSettingImageKt\n*L\n34#1:73\n35#1:74\n41#1:77\n58#1:114\n36#1:75\n36#1:76\n38#1:78\n38#1:79,6\n38#1:113\n38#1:118\n38#1:85,6\n38#1:100,4\n38#1:110,2\n38#1:117\n38#1:91,9\n38#1:112\n38#1:115,2\n38#1:104,6\n*E\n"})
public final class BlogSettingImageKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogSettingImage(@Nullable String s, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onClickImage");
        Composer composer1 = composer0.startRestartGroup(-1047371477);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1047371477, v1, -1, "com.kakao.tistory.presentation.screen.blog.setting.ui.BlogSettingImage (BlogSettingImage.kt:32)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 152.0f);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            BlogThumbnailKt.BlogThumbnail-EUb7tLY((s == null ? null : ThumbnailUiStateKt.toThumbnailItem(s)), 104.0f, BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getCenter()), false, null, composer1, 0x30, 24);
            IconButtonKt.IconButton(function00, SizeKt.size-3ABfNKs(ModifierKt.shape-8ww4TTg$default(BoxScopeInstance.INSTANCE.align(OffsetKt.offset-VpY3zN4(modifier$Companion0, 36.0f, 36.0f), alignment$Companion0.getCenter()), RoundedCornerShapeKt.getCircleShape(), 0L, BorderStrokeKt.BorderStroke-cXLIe8U(1.0f, 0L), 0.0f, 8, null), 32.0f), false, null, null, ComposableSingletons.BlogSettingImageKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, v1 >> 3 & 14 | 0x30000, 28);
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
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.screen.blog.setting.ui.a(s, function00, v));
        }
    }

    public static final void access$BlogSettingImagePreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x9598E85C);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9598E85C, v, -1, "com.kakao.tistory.presentation.screen.blog.setting.ui.BlogSettingImagePreview (BlogSettingImage.kt:21)");
            }
            BlogSettingImageKt.BlogSettingImage("", b.a, composer1, 54);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(v));
        }
    }
}

