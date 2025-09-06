package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.common.Thumbnail;
import com.kakao.tistory.domain.home.entity.HomeSlot.Focus;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara.ClickEntry;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function0 {
    public final Focus a;
    public final int b;
    public final com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus c;
    public final Function2 d;

    public o(Focus homeSlot$Focus0, int v, com.kakao.tistory.domain.home.entity.HomeSlotContent.Focus homeSlotContent$Focus0, Function2 function20) {
        this.a = homeSlot$Focus0;
        this.b = v;
        this.c = homeSlotContent$Focus0;
        this.d = function20;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Thumbnail thumbnail0 = this.c.getThumbnail();
        HomeTiara.INSTANCE.trackClickFocusEntry(this.a.getTitle(), new ClickEntry(this.b, this.c.getId(), "", (thumbnail0 == null ? null : thumbnail0.getOrigin()), this.c.getCategoryLabel(), this.c.getCategoryId(), "", this.c.getMobileLink(), null, 0x100, null));
        this.d.invoke("", this.c.getId());
        return Unit.INSTANCE;
    }
}

