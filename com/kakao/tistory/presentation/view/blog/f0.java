package com.kakao.tistory.presentation.view.blog;

import a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.widget.common.BlogFollowingKt;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function4 {
    public final LazyPagingItems a;
    public final State b;
    public final BlogFollowingFragment c;

    public f0(LazyPagingItems lazyPagingItems0, State state0, BlogFollowingFragment blogFollowingFragment0) {
        this.a = lazyPagingItems0;
        this.b = state0;
        this.c = blogFollowingFragment0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$items");
        if((v1 & 0x70) == 0) {
            v1 |= (((Composer)object2).changed(v) ? 0x20 : 16);
        }
        if((v1 & 721) == 0x90 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE8AAB2AC, v1, -1, "com.kakao.tistory.presentation.view.blog.BlogFollowingFragment.FollowingList.<anonymous>.<anonymous> (BlogFollowingFragment.kt:107)");
        }
        Object object4 = this.a.get(v);
        if(((Blog)object4) != null) {
            BlogFollowingFragment blogFollowingFragment0 = this.c;
            State state0 = SnapshotStateKt.derivedStateOf(new e0(((Blog)object4), this.b));
            Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object2), 0);
            CompositionLocalMap compositionLocalMap0 = ((Composer)object2).getCurrentCompositionLocalMap();
            Modifier modifier0 = ComposedModifierKt.materializeModifier(((Composer)object2), modifier$Companion0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(((Composer)object2).getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            ((Composer)object2).startReusableNode();
            if(((Composer)object2).getInserting()) {
                ((Composer)object2).createNode(function00);
            }
            else {
                ((Composer)object2).useNode();
            }
            Composer composer0 = Updater.constructor-impl(((Composer)object2));
            Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
            if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v2)) {
                d.a(v2, composer0, v2, function20);
            }
            Updater.set-impl(composer0, modifier0, composeUiNode$Companion0.getSetModifier());
            ((Blog)object4).setSubscriber(((Boolean)state0.getValue()).booleanValue());
            BlogFollowingKt.BlogFollowing(((Blog)object4), false, new c0(BlogFollowingFragment.access$getBlogFollowViewModel(blogFollowingFragment0)), new d0(BlogFollowingFragment.access$getBlogFollowViewModel(blogFollowingFragment0)), ((Composer)object2), 8, 2);
            DividerKt.Divider-oMI9zvI(BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getBottomCenter()), ColorResources_androidKt.colorResource(color.gray4, ((Composer)object2), 0), 0.5f, 0.0f, ((Composer)object2), 0x180, 8);
            ((Composer)object2).endNode();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

