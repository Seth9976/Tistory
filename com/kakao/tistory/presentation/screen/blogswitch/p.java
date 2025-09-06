package com.kakao.tistory.presentation.screen.blogswitch;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.kakao.tistory.presentation.common.TistoryWindowInsets;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchState;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function3 {
    public final BlogSwitchType a;
    public final BlogSwitchState b;

    public p(BlogSwitchType blogSwitchType0, BlogSwitchState blogSwitchState0) {
        this.a = blogSwitchType0;
        this.b = blogSwitchState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxWithConstraintsScope)object0), "$this$BoxWithConstraints");
        if((v & 14) == 0) {
            v |= (composer0.changed(((BoxWithConstraintsScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026679012, v, -1, "com.kakao.tistory.presentation.screen.blogswitch.BlogSwitchBottomSheetContent.<anonymous> (BlogSwitchBottomSheet.kt:78)");
        }
        float f = ((BoxWithConstraintsScope)object0).getMaxHeight-D9Ej5fM();
        float f1 = WindowInsetsKt.asPaddingValues(TistoryWindowInsets.INSTANCE.getModalBottom(composer0, 6), composer0, 0).calculateBottomPadding-D9Ej5fM();
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.heightIn-VpY3zN4$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 0.0f, f, 1, null);
        BlogSwitchType blogSwitchType0 = this.a;
        BlogSwitchState blogSwitchState0 = this.b;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer0, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer0, 0);
        CompositionLocalMap compositionLocalMap0 = composer0.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer0, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer0.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer0.startReusableNode();
        if(composer0.getInserting()) {
            composer0.createNode(function00);
        }
        else {
            composer0.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        switch(BlogSwitchBottomSheetKt.BlogSwitchBottomSheetContent.1.WhenMappings.$EnumSwitchMapping$0[blogSwitchType0.ordinal()]) {
            case 1: {
                composer0.startReplaceGroup(303960136);
                BlogSwitchBottomSheetKt.access$BlogSwitchBottomSheetNormal(blogSwitchState0.getCurrentBlog(), blogSwitchState0.getDefaultBlog(), blogSwitchState0.getOwnerBlogList(), blogSwitchState0.getJoinedBlogList(), blogSwitchState0.getOnClickSetting(), blogSwitchState0.getOnClickBlog(), composer0, 4680);
                composer0.endReplaceGroup();
                break;
            }
            case 2: {
                composer0.startReplaceGroup(303971003);
                BlogSwitchBottomSheetKt.access$BlogSwitchBottomSheetQuick(blogSwitchState0.getCurrentBlog(), blogSwitchState0.getDefaultBlog(), blogSwitchState0.getOwnerBlogList(), blogSwitchState0.getJoinedBlogList(), blogSwitchState0.getOnClickBlog(), composer0, 4680);
                composer0.endReplaceGroup();
                break;
            }
            default: {
                composer0.startReplaceGroup(0x31AD0C65);
                composer0.endReplaceGroup();
            }
        }
        SpacerKt.Spacer(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), f1), 0L, null, 2, null), composer0, 0);
        composer0.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

