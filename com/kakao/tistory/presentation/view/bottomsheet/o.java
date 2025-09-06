package com.kakao.tistory.presentation.view.bottomsheet;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import com.kakao.tistory.presentation.screen.blogswitch.BlogSwitchBottomSheetKt;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import com.kakao.tistory.presentation.theme.TColor;
import com.kakao.tistory.presentation.viewmodel.BlogSwitchViewModel;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final BlogSwitchViewModel c;

    public o(String s, String s1, BlogSwitchViewModel blogSwitchViewModel0) {
        this.a = s;
        this.b = s1;
        this.c = blogSwitchViewModel0;
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
            ComposerKt.traceEventStart(0xEC1E242A, v, -1, "com.kakao.tistory.presentation.view.bottomsheet.BlogSwitchBottomSheetModal.<anonymous> (BlogSwitchBottomSheet.kt:61)");
        }
        Modifier modifier0 = BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), TColor.INSTANCE.getWhite-0d7_KjU(), null, 2, null);
        String s = this.a;
        String s1 = this.b;
        BlogSwitchViewModel blogSwitchViewModel0 = this.c;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), ((Composer)object0), 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(((Composer)object0), 0);
        CompositionLocalMap compositionLocalMap0 = ((Composer)object0).getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(((Composer)object0), modifier0);
        Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(((Composer)object0).getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        ((Composer)object0).startReusableNode();
        if(((Composer)object0).getInserting()) {
            ((Composer)object0).createNode(function00);
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
        l l0 = new l(blogSwitchViewModel0);
        m m0 = new m(blogSwitchViewModel0);
        n n0 = new n(blogSwitchViewModel0);
        BlogSwitchBottomSheetKt.BlogSwitchBottomSheet(s, s1, BlogSwitchType.NORMAL, l0, m0, n0, null, ((Composer)object0), 0x180, 0x40);
        ((Composer)object0).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

