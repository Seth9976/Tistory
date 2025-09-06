package com.kakao.kemoticon;

import androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener;
import ib.f;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/kakao/kemoticon/EmoticonKeyboard$initAdapters$1$2", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "", "position", "", "onPageSelected", "(I)V", "kemoticon_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EmoticonKeyboard.initAdapters.1.2 extends SimpleOnPageChangeListener {
    public final f a;

    public EmoticonKeyboard.initAdapters.1.2(f f0) {
        this.a = f0;
        super();
    }

    @Override  // androidx.viewpager.widget.ViewPager$SimpleOnPageChangeListener
    public void onPageSelected(int v) {
        this.a.a(v);
    }
}

