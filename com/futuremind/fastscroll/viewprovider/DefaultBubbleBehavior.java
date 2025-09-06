package com.futuremind.fastscroll.viewprovider;

public class DefaultBubbleBehavior implements ViewBehavior {
    public final VisibilityAnimationManager a;

    public DefaultBubbleBehavior(VisibilityAnimationManager visibilityAnimationManager0) {
        this.a = visibilityAnimationManager0;
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ViewBehavior
    public void onHandleGrabbed() {
        this.a.show();
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ViewBehavior
    public void onHandleReleased() {
        this.a.hide();
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ViewBehavior
    public void onScrollFinished() {
    }

    @Override  // com.futuremind.fastscroll.viewprovider.ViewBehavior
    public void onScrollStarted() {
    }
}

