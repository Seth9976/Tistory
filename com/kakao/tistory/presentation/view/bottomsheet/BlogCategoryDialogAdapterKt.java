package com.kakao.tistory.presentation.view.bottomsheet;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.domain.blog.entity.EntryCategoryVisibilityType;
import com.kakao.tistory.domain.entity.CategoryItem;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogCategoryDialogAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogCategoryDialogAdapter.kt\ncom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapterKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,214:1\n148#2:215\n148#2:216\n148#2:289\n148#2:290\n148#2:295\n148#2:296\n98#3:217\n95#3,6:218\n101#3:252\n98#3:253\n95#3,6:254\n101#3:288\n105#3:294\n105#3:340\n78#4,6:224\n85#4,4:239\n89#4,2:249\n78#4,6:260\n85#4,4:275\n89#4,2:285\n93#4:293\n78#4,6:304\n85#4,4:319\n89#4,2:329\n93#4:335\n93#4:339\n368#5,9:230\n377#5:251\n368#5,9:266\n377#5:287\n378#5,2:291\n368#5,9:310\n377#5:331\n378#5,2:333\n378#5,2:337\n4032#6,6:243\n4032#6,6:279\n4032#6,6:323\n71#7:297\n68#7,6:298\n74#7:332\n78#7:336\n*S KotlinDebug\n*F\n+ 1 BlogCategoryDialogAdapter.kt\ncom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogAdapterKt\n*L\n161#1:215\n165#1:216\n192#1:289\n193#1:290\n201#1:295\n202#1:296\n159#1:217\n159#1:218,6\n159#1:252\n168#1:253\n168#1:254,6\n168#1:288\n168#1:294\n159#1:340\n159#1:224,6\n159#1:239,4\n159#1:249,2\n168#1:260,6\n168#1:275,4\n168#1:285,2\n168#1:293\n199#1:304,6\n199#1:319,4\n199#1:329,2\n199#1:335\n159#1:339\n159#1:230,9\n159#1:251\n168#1:266,9\n168#1:287\n168#1:291,2\n199#1:310,9\n199#1:331\n199#1:333,2\n159#1:337,2\n159#1:243,6\n168#1:279,6\n199#1:323,6\n199#1:297\n199#1:298,6\n199#1:332\n199#1:336\n*E\n"})
public final class BlogCategoryDialogAdapterKt {
    public static final void access$Category(CategoryItem categoryItem0, TextStyle textStyle0, boolean z, Function0 function00, Function3 function30, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(2116282094);
        Function3 function31 = (v1 & 16) == 0 ? function30 : ComposableSingletons.BlogCategoryDialogAdapterKt.INSTANCE.getLambda-1$presentation_prodRelease();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2116282094, v, -1, "com.kakao.tistory.presentation.view.bottomsheet.Category (BlogCategoryDialogAdapter.kt:157)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(ClickableKt.clickable-XHw0xAI$default(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, 52.0f), 0.0f, 1, null), 0L, null, 2, null), false, null, null, function00, 7, null), 20.0f, 0.0f, 2, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
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
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        Modifier modifier2 = RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
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
        Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function21);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        function31.invoke(rowScopeInstance0, composer1, ((int)(v >> 9 & 0x70 | 6)));
        String s = categoryItem0.getName();
        if(s == null) {
            s = "";
        }
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, SemanticKt.contentDescription(rowScopeInstance0.weight(modifier$Companion0, 1.0f, false), new String[]{StringResources_androidKt.stringResource(string.content_desc_blog_category_title, composer1, 0), s}, composer1, 0), 0L, 0L, null, FontWeight.Companion.getNormal(), TypeKt.getTFont(), 0L, null, null, 0L, 2, false, false, 1, 0, null, textStyle0, composer1, 0x1B0000, v << 18 & 0x1C00000 | 0x6030, 112540);
        composer1.startReplaceGroup(0x68BFA428);
        if(categoryItem0.getVisibility() == EntryCategoryVisibilityType.PRIVATE.getValue()) {
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_entry_list_private, composer1, 0), StringResources_androidKt.stringResource(string.content_desc_blog_category_private, composer1, 0), SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 6.0f, 0.0f, 0.0f, 0.0f, 14, null), 16.0f), 0L, composer1, 0xD88, 0);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        Modifier modifier4 = SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 43.0f, 0.0f, 0.0f, 0.0f, 14, null), 24.0f);
        MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
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
        Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
            d.a(v4, composer1, v4, function22);
        }
        r0.a.z(composeUiNode$Companion0, composer1, modifier5, composer1, 0x68BFF13C);
        if(z) {
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_list_check, composer1, 0), StringResources_androidKt.stringResource(string.content_desc_select, composer1, 0), SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), 0L, composer1, 0xD88, 0);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(categoryItem0, textStyle0, z, function00, function31, v, v1));
        }
    }
}

