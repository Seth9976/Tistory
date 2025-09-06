package com.kakao.tistory.presentation.screen.home.item;

import com.kakao.tistory.domain.home.entity.HomeSlotContent.Tip;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara.ClickEntry;
import com.kakao.tistory.presentation.screen.home.tiara.HomeTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function0 {
    public final int a;
    public final Tip b;
    public final Function2 c;

    public q(int v, Tip homeSlotContent$Tip0, Function2 function20) {
        this.a = v;
        this.b = homeSlotContent$Tip0;
        this.c = function20;
        super(0);
    }

    // 去混淆评级： 低(25)
    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClickEntry homeTiara$ClickEntry0 = new ClickEntry(this.a, this.b.getId(), "", null, null, null, "", "", null, 0x100, null);
        HomeTiara.INSTANCE.trackClickTipEntry(homeTiara$ClickEntry0);
        this.c.invoke("", this.b.getId());
        return Unit.INSTANCE;
    }
}

