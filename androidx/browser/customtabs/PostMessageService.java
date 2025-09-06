package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import q.j;

public class PostMessageService extends Service {
    public final j a;

    public PostMessageService() {
        this.a = new j();  // 初始化器: Landroid/support/customtabs/IPostMessageService$Stub;-><init>()V
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        return this.a;
    }
}

