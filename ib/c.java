package ib;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import com.kakao.kemoticon.EmoticonHistory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class c implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final EmoticonHistory a;

    public c(EmoticonHistory emoticonHistory0) {
        this.a = emoticonHistory0;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        EmoticonHistory emoticonHistory0 = this.a;
        Intrinsics.checkNotNullParameter(emoticonHistory0, "this$0");
        if(s != null && s.hashCode() == 0x373FE494 && s.equals("history")) {
            Function0 function00 = emoticonHistory0.c;
            if(function00 != null) {
                function00.invoke();
            }
        }
    }
}

