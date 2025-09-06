package com.google.android.material.internal;

public final class a implements OnCheckedChangeListener {
    public final CheckableGroup a;

    public a(CheckableGroup checkableGroup0) {
        this.a = checkableGroup0;
    }

    @Override  // com.google.android.material.internal.MaterialCheckable$OnCheckedChangeListener
    public final void onCheckedChanged(Object object0, boolean z) {
        CheckableGroup checkableGroup0 = this.a;
        if(!z) {
            if(checkableGroup0.b(((MaterialCheckable)object0), checkableGroup0.e)) {
            label_5:
                OnCheckedStateChangeListener checkableGroup$OnCheckedStateChangeListener0 = checkableGroup0.c;
                if(checkableGroup$OnCheckedStateChangeListener0 != null) {
                    checkableGroup$OnCheckedStateChangeListener0.onCheckedStateChanged(checkableGroup0.getCheckedIds());
                }
            }
        }
        else if(checkableGroup0.a(((MaterialCheckable)object0))) {
            goto label_5;
        }
    }
}

