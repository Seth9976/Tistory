package j3;

import android.telephony.SubscriptionManager;
import androidx.annotation.DoNotInline;

public abstract class a {
    @DoNotInline
    public static int a(int v) {
        return SubscriptionManager.getSlotIndex(v);
    }
}

