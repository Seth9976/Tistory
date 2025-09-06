package androidx.browser.browseractions;

import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import java.util.List;

public final class f implements AdapterView.OnItemClickListener {
    public final List a;
    public d b;

    public f(Context context0, Uri uri0, List list0) {
        this.a = list0;
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        PendingIntent pendingIntent0 = ((BrowserActionItem)this.a.get(v)).getAction();
        try {
            pendingIntent0.send();
            this.b.b(false);
        }
        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
            Log.e("BrowserActionskMenuUi", "Failed to send custom item action", pendingIntent$CanceledException0);
        }
    }
}

