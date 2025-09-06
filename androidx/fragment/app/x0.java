package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest.Builder;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;

public final class x0 extends ActivityResultContract {
    @Override  // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context0, Object object0) {
        IntentSenderRequest intentSenderRequest0 = (IntentSenderRequest)object0;
        Intent intent0 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent1 = intentSenderRequest0.getFillInIntent();
        if(intent1 != null) {
            Bundle bundle0 = intent1.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if(bundle0 != null) {
                intent0.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle0);
                intent1.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if(intent1.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest0 = new Builder(intentSenderRequest0.getIntentSender()).setFillInIntent(null).setFlags(intentSenderRequest0.getFlagsValues(), intentSenderRequest0.getFlagsMask()).build();
                }
            }
        }
        intent0.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest0);
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "CreateIntent created the following intent: " + intent0);
        }
        return intent0;
    }

    @Override  // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int v, Intent intent0) {
        return new ActivityResult(v, intent0);
    }
}

