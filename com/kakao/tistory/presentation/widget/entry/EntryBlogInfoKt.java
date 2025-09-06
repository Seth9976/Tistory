package com.kakao.tistory.presentation.widget.entry;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
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
import c;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.common.coil.ImageModifiers;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.common.BlogLogoViewKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A)\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"EntryBlogInfo", "", "modifier", "Landroidx/compose/ui/Modifier;", "blogTitle", "", "blog", "Lcom/kakao/tistory/domain/entity/Blog;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/Blog;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEntryBlogInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntryBlogInfo.kt\ncom/kakao/tistory/presentation/widget/entry/EntryBlogInfoKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,38:1\n148#2:39\n148#2:76\n148#2:77\n98#3:40\n95#3,6:41\n101#3:75\n105#3:81\n78#4,6:47\n85#4,4:62\n89#4,2:72\n93#4:80\n368#5,9:53\n377#5:74\n378#5,2:78\n4032#6,6:66\n*S KotlinDebug\n*F\n+ 1 EntryBlogInfo.kt\ncom/kakao/tistory/presentation/widget/entry/EntryBlogInfoKt\n*L\n20#1:39\n26#1:76\n30#1:77\n18#1:40\n18#1:41,6\n18#1:75\n18#1:81\n18#1:47,6\n18#1:62,4\n18#1:72,2\n18#1:80\n18#1:53,9\n18#1:74\n18#1:78,2\n18#1:66,6\n*E\n"})
public final class EntryBlogInfoKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void EntryBlogInfo(@Nullable Modifier modifier0, @NotNull String s, @Nullable Blog blog0, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(s, "blogTitle");
        Composer composer1 = composer0.startRestartGroup(0x8E16BF8E);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8E16BF8E, v, -1, "com.kakao.tistory.presentation.widget.entry.EntryBlogInfo (EntryBlogInfo.kt:16)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 9.0f, 0.0f, 0.0f, 13, null).then(modifier1);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        BlogLogoViewKt.BlogLogoView(SizeKt.size-3ABfNKs(modifier$Companion0, 21.0f).then(ImageModifiers.INSTANCE.getROUNDED_CORNER_4(composer1, 6)), blog0, 0, composer1, 0x40, 4);
        c.a(6.0f, modifier$Companion0, composer1, 6);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, TypeKt.getSubtext2(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), composer1, v >> 3 & 14, 0x6030, 0x1B7FE);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(modifier1, s, blog0, v, v1));
        }
    }
}

