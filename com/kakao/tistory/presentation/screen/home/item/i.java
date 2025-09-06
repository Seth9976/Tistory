package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlotContent.Today;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara.ClickEntry;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public final int a;
    public final Today b;
    public final Function1 c;

    public i(int v, Today homeSlotContent$Today0, Function1 function10) {
        this.a = v;
        this.b = homeSlotContent$Today0;
        this.c = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClickEntry homeTiara$ClickEntry0 = new ClickEntry(this.a, 0L, this.b.getTitle(), this.b.getImage().getOrigin(), this.b.getCategoryLabel(), this.b.getCategoryId(), this.b.getBlogName(), "", null, 0x100, null);
        HomeTiara.INSTANCE.trackClickToday(homeTiara$ClickEntry0, this.b.getType());
        this.c.invoke("");
        return Unit.INSTANCE;
    }
}

