package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainIntent.ShowBottomSheet;
import com.kakao.tistory.presentation.screen.blog.main.contract.BottomSheetType.EntryModify;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c2 extends Lambda implements Function4 {
    public final BlogMainViewModel a;
    public final boolean b;

    public c2(BlogMainViewModel blogMainViewModel0, boolean z) {
        this.a = blogMainViewModel0;
        this.b = z;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        Intrinsics.checkNotNullParameter(((String)object1), "title");
        Intrinsics.checkNotNullParameter(((EntryVisibilityType)object2), "visibility");
        BlogMainTiara.INSTANCE.trackLongClickEntryItem();
        ShowBottomSheet blogMainIntent$ShowBottomSheet0 = new ShowBottomSheet(new EntryModify(((Number)object0).longValue(), this.b, ((String)object1), ((EntryVisibilityType)object2), ((String)object3)));
        this.a.sendIntent(blogMainIntent$ShowBottomSheet0);
        return Unit.INSTANCE;
    }
}

