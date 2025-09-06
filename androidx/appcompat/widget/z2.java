package androidx.appcompat.widget;

import android.content.Intent;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;

public final class z2 implements MenuItem.OnMenuItemClickListener {
    public final ShareActionProvider a;

    public z2(ShareActionProvider shareActionProvider0) {
        this.a = shareActionProvider0;
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        ShareActionProvider shareActionProvider0 = this.a;
        Intent intent0 = t.d(shareActionProvider0.f, shareActionProvider0.g).b(menuItem0.getItemId());
        if(intent0 != null) {
            String s = intent0.getAction();
            if("android.intent.action.SEND".equals(s) || "android.intent.action.SEND_MULTIPLE".equals(s)) {
                shareActionProvider0.getClass();
                intent0.addFlags(0x8080000);
            }
            shareActionProvider0.f.startActivity(intent0);
        }
        return true;
    }
}

