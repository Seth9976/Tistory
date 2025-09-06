package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.common.Thumbnail;
import com.kakao.tistory.domain.home.entity.HomeSlotContent.Best;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara.ClickEntry;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function0 {
    public final Best a;
    public final Function2 b;

    public u(Best homeSlotContent$Best0, Function2 function20) {
        this.a = homeSlotContent$Best0;
        this.b = function20;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Thumbnail thumbnail0 = this.a.getThumbnail();
        HomeTiara.INSTANCE.trackClickBest(new ClickEntry(this.a.getRank(), this.a.getId(), "", (thumbnail0 == null ? null : thumbnail0.getOrigin()), this.a.getCategoryLabel(), this.a.getCategoryId(), "", this.a.getMobileLink(), null, 0x100, null));
        this.b.invoke("", this.a.getId());
        return Unit.INSTANCE;
    }
}

