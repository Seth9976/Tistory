package androidx.compose.material3;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.internal.zzad;
import com.google.android.play.core.appupdate.internal.zzaf;
import com.google.android.play.core.appupdate.zza;
import com.google.android.play.core.appupdate.zzd;
import com.google.android.play.core.appupdate.zzh;
import com.google.android.play.core.appupdate.zzj;
import com.google.android.play.core.appupdate.zzk;
import com.google.android.play.core.appupdate.zzs;
import com.google.android.play.core.appupdate.zzu;
import i8.c;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.functions.Function0;

public final class e9 implements BottomAppBarScrollBehavior, TopAppBarScrollBehavior, zza {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public e9(SharedPreferences sharedPreferences0, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0) {
        this.a = 3;
        super();
        this.d = new ArrayDeque();
        this.e = sharedPreferences0;
        this.b = "topic_operation_queue";
        this.c = ",";
        this.f = scheduledThreadPoolExecutor0;
    }

    public e9(MutableInteractionSource mutableInteractionSource0, MutableInteractionSource mutableInteractionSource1, State state0, State state1, State state2) {
        this.a = 5;
        super();
        this.e = mutableInteractionSource0;
        this.b = mutableInteractionSource1;
        this.c = state0;
        this.d = state1;
        this.f = state2;
    }

    public e9(BottomAppBarState bottomAppBarState0, AnimationSpec animationSpec0, DecayAnimationSpec decayAnimationSpec0, Function0 function00) {
        this.a = 1;
        super();
        this.e = bottomAppBarState0;
        this.b = animationSpec0;
        this.c = decayAnimationSpec0;
        this.d = function00;
        this.f = new ExitAlwaysScrollBehavior.nestedScrollConnection.1(this);
    }

    public e9(TopAppBarState topAppBarState0, AnimationSpec animationSpec0, DecayAnimationSpec decayAnimationSpec0, Function0 function00, int v) {
        this.a = v;
        if(v != 2) {
            super();
            this.e = topAppBarState0;
            this.b = animationSpec0;
            this.c = decayAnimationSpec0;
            this.d = function00;
            this.f = new EnterAlwaysScrollBehavior.nestedScrollConnection.1(this);
            return;
        }
        super();
        this.e = topAppBarState0;
        this.b = animationSpec0;
        this.c = decayAnimationSpec0;
        this.d = function00;
        this.f = new ExitUntilCollapsedScrollBehavior.nestedScrollConnection.1(this);
    }

    public e9(c c0) {
        this.a = 4;
        super();
        zzk zzk0 = new zzk(c0);
        zzaf zzaf0 = zzad.zzb(new zzu(zzk0));
        this.e = zzaf0;
        zzaf zzaf1 = zzad.zzb(new zzs(zzk0, zzaf0));
        this.b = zzaf1;
        zzaf zzaf2 = zzad.zzb(new zzd(zzk0));
        this.c = zzaf2;
        zzaf zzaf3 = zzad.zzb(new zzh(zzaf1, zzaf2, zzk0));
        this.d = zzaf3;
        this.f = zzad.zzb(new zzj(zzaf3));
    }

    public static e9 a(SharedPreferences sharedPreferences0, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0) {
        e9 e90 = new e9(sharedPreferences0, scheduledThreadPoolExecutor0);
        synchronized(((ArrayDeque)e90.d)) {
            ((ArrayDeque)e90.d).clear();
            String s = ((SharedPreferences)e90.e).getString(((String)e90.b), "");
            if(!TextUtils.isEmpty(s) && s.contains(((String)e90.c))) {
                String[] arr_s = s.split(((String)e90.c), -1);
                if(arr_s.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    String s1 = arr_s[v1];
                    if(!TextUtils.isEmpty(s1)) {
                        ((ArrayDeque)e90.d).add(s1);
                    }
                }
                return e90;
            }
            return e90;
        }
    }

    @Override  // androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.material3.BottomAppBarScrollBehavior
    public DecayAnimationSpec getFlingAnimationSpec() {
        switch(this.a) {
            case 0: {
                return (DecayAnimationSpec)this.c;
            }
            case 1: {
                return (DecayAnimationSpec)this.c;
            }
            default: {
                return (DecayAnimationSpec)this.c;
            }
        }
    }

    @Override  // androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.material3.BottomAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        switch(this.a) {
            case 0: {
                return (EnterAlwaysScrollBehavior.nestedScrollConnection.1)this.f;
            }
            case 1: {
                return (ExitAlwaysScrollBehavior.nestedScrollConnection.1)this.f;
            }
            default: {
                return (ExitUntilCollapsedScrollBehavior.nestedScrollConnection.1)this.f;
            }
        }
    }

    @Override  // androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.material3.BottomAppBarScrollBehavior
    public AnimationSpec getSnapAnimationSpec() {
        switch(this.a) {
            case 0: {
                return (AnimationSpec)this.b;
            }
            case 1: {
                return (AnimationSpec)this.b;
            }
            default: {
                return (AnimationSpec)this.b;
            }
        }
    }

    @Override  // androidx.compose.material3.BottomAppBarScrollBehavior
    public BottomAppBarState getState() {
        return (BottomAppBarState)this.e;
    }

    @Override  // androidx.compose.material3.TopAppBarScrollBehavior
    public TopAppBarState getState() {
        return (TopAppBarState)this.e;
    }

    @Override  // androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.material3.BottomAppBarScrollBehavior
    public boolean isPinned() {
        switch(this.a) {
            case 0: {
                return false;
            }
            case 1: {
                return false;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.google.android.play.core.appupdate.zza
    public AppUpdateManager zza() {
        return (AppUpdateManager)((zzaf)this.f).zza();
    }
}

