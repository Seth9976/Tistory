package androidx.appcompat.widget;

import android.content.Intent;

public final class y2 implements ActivityChooserModel.OnChooseActivityListener {
    public final ShareActionProvider a;

    public y2(ShareActionProvider shareActionProvider0) {
        this.a = shareActionProvider0;
    }

    @Override  // androidx.appcompat.widget.ActivityChooserModel$OnChooseActivityListener
    public final boolean onChooseActivity(t t0, Intent intent0) {
        ShareActionProvider shareActionProvider0 = this.a;
        OnShareTargetSelectedListener shareActionProvider$OnShareTargetSelectedListener0 = shareActionProvider0.h;
        if(shareActionProvider$OnShareTargetSelectedListener0 != null) {
            shareActionProvider$OnShareTargetSelectedListener0.onShareTargetSelected(shareActionProvider0, intent0);
        }
        return false;
    }
}

