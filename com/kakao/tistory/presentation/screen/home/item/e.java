package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlotContent.Creator;
import com.kakao.tistory.domain.home.entity.HomeSlotContent.CreatorEntry;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara.ClickEntry;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function0 {
    public final int a;
    public final int b;
    public final CreatorEntry c;
    public final Creator d;
    public final int e;
    public final Function2 f;

    public e(int v, int v1, CreatorEntry homeSlotContent$CreatorEntry0, Creator homeSlotContent$Creator0, int v2, Function2 function20) {
        this.a = v;
        this.b = v1;
        this.c = homeSlotContent$CreatorEntry0;
        this.d = homeSlotContent$Creator0;
        this.e = v2;
        this.f = function20;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClickEntry homeTiara$ClickEntry0 = new ClickEntry(this.b + this.a * 2, this.c.getId(), "", this.c.getThumbnail().getOrigin(), this.c.getCategoryLabel(), this.c.getCategoryId(), "", this.c.getMobileLink(), this.e);
        HomeTiara.INSTANCE.trackClickCreatorEntry(homeTiara$ClickEntry0);
        this.f.invoke("", this.c.getId());
        return Unit.INSTANCE;
    }
}

