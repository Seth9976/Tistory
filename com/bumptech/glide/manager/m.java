package com.bumptech.glide.manager;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import com.bumptech.glide.util.Util;

public final class m extends ConnectivityManager.NetworkCallback {
    public final n a;

    public m(n n0) {
        this.a = n0;
        super();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onAvailable(Network network0) {
        Util.postOnUiThread(new l(this, true));
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onLost(Network network0) {
        Util.postOnUiThread(new l(this, false));
    }
}

