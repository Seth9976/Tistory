package com.kakao.tistory.presentation.screen.blog.main.contract;

import a5.b;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.viewmodel.BlogTopReportData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function0 {
    public final BlogInfo a;
    public final Function3 b;

    public z(BlogInfo blogInfo0, Function3 function30) {
        this.a = blogInfo0;
        this.b = function30;
        super(0);
    }

    public final void a() {
        String s = String.valueOf(this.a.getUserId());
        String s1 = this.a.getNickname();
        String s2 = this.a.getNickname();
        String s3 = b.n("블로그 이름: ", this.a.getName(), ", 블로그 설명: ", this.a.getDescription());
        String s4 = this.a.getLogoImageUrl();
        if(s4 == null) {
            s4 = "https://t1.daumcdn.net/tistory_admin/static/manage/images/r3/default_L.png";
        }
        BlogTopReportData blogTopReportData0 = new BlogTopReportData(s, s1, s2, s3, s4, this.a.getDefaultDomain(), false, 0x40, null);
        this.b.invoke(this.a.getName(), this.a.getId(), blogTopReportData0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a();
        return Unit.INSTANCE;
    }
}

