package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public final LazyListState a;
    public final LazyPagingItems b;
    public final State c;
    public final DraftViewModel d;

    public m(LazyListState lazyListState0, LazyPagingItems lazyPagingItems0, State state0, DraftViewModel draftViewModel0) {
        this.a = lazyListState0;
        this.b = lazyPagingItems0;
        this.c = state0;
        this.d = draftViewModel0;
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
            ComposerKt.traceEventStart(0x3F804469, v, -1, "com.kakao.tistory.presentation.view.editor.DraftBottomSheet.<anonymous> (DraftBottomSheet.kt:103)");
        }
        Long long0 = DraftBottomSheetKt.access$DraftBottomSheet$lambda$1(this.c);
        j j0 = new j(this.d);
        k k0 = new k(this.d);
        l l0 = new l(this.d);
        DraftBottomSheetKt.DraftList(this.a, this.b, long0, j0, k0, l0, ((Composer)object0), LazyPagingItems.$stable << 3, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

