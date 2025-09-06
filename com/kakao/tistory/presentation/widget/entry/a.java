package com.kakao.tistory.presentation.widget.entry;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
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
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public static final a a;

    static {
        a.a = new a();
    }

    public a() {
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
            ComposerKt.traceEventStart(0x922A73B9, v, -1, "com.kakao.tistory.presentation.widget.entry.ComposableSingletons$EntryItemKt.lambda-1.<anonymous> (EntryItem.kt:26)");
        }
        Modifier modifier0 = BackgroundKt.background-bw27NRU$default(Modifier.Companion, 0xFFFFFFFF00000000L, null, 2, null);
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
        EntryItemKt.a(null, new EntryItem(null, null, null, null, false, "del", false, "일이삼사오육칠팔구십일이삼", null, null, "물고기는 모두가 먹을 수 있는거야. 물고기의 수는 엄청나지. 매년 새로 생기고,", null, null, null, null, null, null, null, null, null, 0x1869FL, 0x1869FL, false, 0L, false, 0x1CFFB5F, null), false, false, false, null, ((Composer)object0), 0xD80, 49);
        EntryItemKt.a(null, new EntryItem(null, null, null, null, false, null, false, "일<b>이삼</b>사</b>오육칠</b>팔구<b>십일</b>이삼", null, null, "물고기는 모두가 먹을 수 있는거야. 물고기의 수는 엄청나지. 매년 새로 생기고,", null, null, null, null, null, new Blog(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, "https://img1.daumcdn.net/thumb/C1200x900/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Ftistory_admin%2Fassets%2Fpromotions%2F9a80c95f057b40f6a00a934ba7d2c4fe", null, false, false, null, null, false, false, 0, false, null, 0x7FEFFFF, null), "블로그 타이틀", null, null, 0x1869FL, 0x1869FL, false, 0L, false, 0x1CCFB6F, null), true, false, true, null, ((Composer)object0), 0x6D80, 33);
        ((Composer)object0).endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

