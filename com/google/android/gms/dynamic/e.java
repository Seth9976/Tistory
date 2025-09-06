package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;

public final class e implements View.OnClickListener {
    public final Context a;
    public final Intent b;

    public e(Context context0, Intent intent0) {
        this.a = context0;
        this.b = intent0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        try {
            this.a.startActivity(this.b);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", activityNotFoundException0);
        }
    }
}

