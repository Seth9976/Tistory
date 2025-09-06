package com.kakao.kphotopicker;

import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\'\u0010\u000B\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\r\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006¨\u0006\u000E"}, d2 = {"com/kakao/kphotopicker/PreviewFragment$createPageChangeListener$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "", "state", "", "onPageScrollStateChanged", "(I)V", "position", "", "positionOffset", "positionOffsetPixels", "onPageScrolled", "(IFI)V", "onPageSelected", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PreviewFragment.createPageChangeListener.1 implements OnPageChangeListener {
    public final PreviewFragment a;

    public PreviewFragment.createPageChangeListener.1(PreviewFragment previewFragment0) {
        this.a = previewFragment0;
    }

    @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
    public void onPageScrollStateChanged(int v) {
    }

    @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
    public void onPageScrolled(int v, float f, int v1) {
    }

    @Override  // androidx.viewpager.widget.ViewPager$OnPageChangeListener
    public void onPageSelected(int v) {
        PreviewFragment.access$updateSelectIndex(this.a, v);
    }
}

