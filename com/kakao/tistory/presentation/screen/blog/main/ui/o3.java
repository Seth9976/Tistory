package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import com.kakao.tistory.presentation.common.TistoryWindowInsetsKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarKt;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o3 extends Lambda implements Function2 {
    public final float a;
    public final boolean b;
    public final boolean c;
    public final Function0 d;
    public final BlogMainInfo e;

    public o3(float f, boolean z, boolean z1, Function0 function00, BlogMainInfo blogMainInfo0) {
        this.a = f;
        this.b = z;
        this.c = z1;
        this.d = function00;
        this.e = blogMainInfo0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030717899, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainAppBar.<anonymous> (BlogMainTopAppBar.kt:27)");
        }
        Modifier modifier0 = TistoryWindowInsetsKt.topInsetsHeight-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 56.0f);
        float f = this.a;
        boolean z = this.b;
        boolean z1 = this.c;
        Function0 function00 = this.d;
        BlogMainInfo blogMainInfo0 = this.e;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function01 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object0).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object0).startReusableNode();
        if(((Composer)object0).getInserting()) {
            ((Composer)object0).createNode(function01);
        }
        else {
            ((Composer)object0).useNode();
        }
        Composer composer0 = Updater.constructor-impl(((Composer)object0));
        Function2 function20 = a.a(composeUiNode$Companion0, composer0, measurePolicy0, composer0, compositionLocalMap0);
        if(composer0.getInserting() || !Intrinsics.areEqual(composer0.rememberedValue(), v1)) {
            d.a(v1, composer0, v1, function20);
        }
        Updater.set-impl(composer0, modifier1, composeUiNode$Companion0.getSetModifier());
        TistoryTopAppBarKt.TistoryTopAppBarLayout-ygeTB3I(f, ComposableLambdaKt.rememberComposableLambda(0xE903EEF8, true, new l3(z1, function00), ((Composer)object0), 54), ComposableLambdaKt.rememberComposableLambda(0x5906611, true, new m3(blogMainInfo0), ((Composer)object0), 54), ComposableLambdaKt.rememberComposableLambda(0x6571D07A, true, new n3(blogMainInfo0, f), ((Composer)object0), 54), 0L, f, 0L, 0.0f, (z ? f : 0.0f), ((Composer)object0), 0xDB0, 0xD0);
        ((Composer)object0).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

