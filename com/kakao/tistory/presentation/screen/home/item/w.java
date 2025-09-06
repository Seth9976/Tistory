package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlotContent.Category;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara.ClickEntry;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function0 {
    public final String a;
    public final int b;
    public final Category c;
    public final Function2 d;

    public w(String s, int v, Category homeSlotContent$Category0, Function2 function20) {
        this.a = s;
        this.b = v;
        this.c = homeSlotContent$Category0;
        this.d = function20;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClickEntry homeTiara$ClickEntry0 = new ClickEntry(this.b % 7, this.c.getId(), "", this.c.getThumbnail().getOrigin(), this.c.getCategoryLabel(), this.c.getCategoryId(), "", this.c.getMobileLink(), ((int)(this.b / 7)));
        HomeTiara.INSTANCE.trackClickCategoryEntry(this.a, homeTiara$ClickEntry0);
        this.d.invoke("", this.c.getId());
        return Unit.INSTANCE;
    }
}

