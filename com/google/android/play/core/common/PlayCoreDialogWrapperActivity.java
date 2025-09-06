package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {
    public ResultReceiver a;

    @Override  // android.app.Activity
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 0) {
            ResultReceiver resultReceiver0 = this.a;
            if(resultReceiver0 != null) {
                switch(v1) {
                    case -1: {
                        resultReceiver0.send(1, new Bundle());
                        break;
                    }
                    case 0: {
                        resultReceiver0.send(2, new Bundle());
                    }
                }
            }
        }
        this.finish();
    }

    @Override  // android.app.Activity
    public final void onCreate(Bundle bundle0) {
        Intent intent0;
        int v = this.getIntent().getIntExtra("window_flags", 0);
        if(v == 0) {
            intent0 = null;
        }
        else {
            this.getWindow().getDecorView().setSystemUiVisibility(v);
            intent0 = new Intent();
            intent0.putExtra("window_flags", v);
        }
        super.onCreate(bundle0);
        if(bundle0 == null) {
            this.a = (ResultReceiver)this.getIntent().getParcelableExtra("result_receiver");
            Bundle bundle1 = this.getIntent().getExtras();
            if(bundle1 == null) {
                ResultReceiver resultReceiver0 = this.a;
                if(resultReceiver0 != null) {
                    resultReceiver0.send(3, new Bundle());
                }
                this.finish();
                return;
            }
            PendingIntent pendingIntent0 = (PendingIntent)bundle1.get("confirmation_intent");
            try {
                this.startIntentSenderForResult(pendingIntent0.getIntentSender(), 0, intent0, 0, 0, 0);
            }
            catch(IntentSender.SendIntentException unused_ex) {
                ResultReceiver resultReceiver1 = this.a;
                if(resultReceiver1 != null) {
                    resultReceiver1.send(3, new Bundle());
                }
                this.finish();
            }
            return;
        }
        this.a = (ResultReceiver)bundle0.getParcelable("result_receiver");
    }

    @Override  // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putParcelable("result_receiver", this.a);
    }
}

