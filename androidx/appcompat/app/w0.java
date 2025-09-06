package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.view.Choreographer;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.material3.PinnedScrollBehavior.nestedScrollConnection.1;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.dynamicanimation.animation.a;
import androidx.dynamicanimation.animation.b;
import androidx.window.layout.ExtensionInterfaceCompat.ExtensionCallbackInterface;
import androidx.window.layout.WindowLayoutInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.ktx.AppUpdateManagerKtxKt;
import com.google.android.play.core.ktx.AppUpdateResult.Available;
import com.google.android.play.core.ktx.AppUpdateResult.Downloaded;
import com.google.android.play.core.ktx.AppUpdateResult.NotAvailable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.common.h;
import com.google.firebase.crashlytics.internal.common.l;
import com.google.firebase.crashlytics.internal.settings.Settings;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Function;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import k8.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel.DefaultImpls;

public final class w0 implements TopAppBarScrollBehavior, ExtensionCallbackInterface, OnSuccessListener, SuccessContinuation, BiConsumer {
    public final Object a;
    public final Object b;
    public final Object c;
    public static w0 d;

    public w0(Context context0, LocationManager locationManager0) {
        this.c = new v0();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.a = context0;
        this.b = locationManager0;
    }

    public w0(TopAppBarState topAppBarState0, Function0 function00) {
        this.a = topAppBarState0;
        this.b = function00;
        this.c = new PinnedScrollBehavior.nestedScrollConnection.1(this);
    }

    public w0(a a0) {
        this.a = a0;
        this.b = Choreographer.getInstance();
        this.c = new b(this);
    }

    public w0(ExtensionCallbackInterface extensionInterfaceCompat$ExtensionCallbackInterface0) {
        Intrinsics.checkNotNullParameter(extensionInterfaceCompat$ExtensionCallbackInterface0, "callbackInterface");
        super();
        this.a = extensionInterfaceCompat$ExtensionCallbackInterface0;
        this.b = new ReentrantLock();
        this.c = new WeakHashMap();
    }

    public w0(h h0, Executor executor0, String s) {
        this.c = h0;
        this.a = executor0;
        this.b = s;
    }

    public w0(Object object0, Object object1, Object object2) {
        this.a = object0;
        this.b = object1;
        this.c = object2;
        super();
    }

    public w0(IntRange intRange0, Method[] arr_method, Method method0) {
        Intrinsics.checkNotNullParameter(intRange0, "argumentRange");
        Intrinsics.checkNotNullParameter(arr_method, "unbox");
        super();
        this.a = intRange0;
        this.b = arr_method;
        this.c = method0;
    }

    @Override  // io.reactivex.functions.BiConsumer
    public void accept(Object object0, Object object1) {
        Object object2 = ((Function)this.c).apply(object1);
        Collection collection0 = (Collection)((Map)object0).get(object2);
        if(collection0 == null) {
            collection0 = (Collection)((Function)this.a).apply(object2);
            ((Map)object0).put(object2, collection0);
        }
        collection0.add(((Function)this.b).apply(object1));
    }

    @Override  // androidx.compose.material3.TopAppBarScrollBehavior
    public DecayAnimationSpec getFlingAnimationSpec() {
        return null;
    }

    @Override  // androidx.compose.material3.TopAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return (PinnedScrollBehavior.nestedScrollConnection.1)this.c;
    }

    @Override  // androidx.compose.material3.TopAppBarScrollBehavior
    public AnimationSpec getSnapAnimationSpec() {
        return null;
    }

    @Override  // androidx.compose.material3.TopAppBarScrollBehavior
    public TopAppBarState getState() {
        return (TopAppBarState)this.a;
    }

    @Override  // androidx.compose.material3.TopAppBarScrollBehavior
    public boolean isPinned() {
        return true;
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object object0) {
        int v = ((AppUpdateInfo)object0).updateAvailability();
        ProducerScope producerScope0 = (ProducerScope)this.a;
        switch(v) {
            case 0: {
                producerScope0.close(new InstallException(-2));
                return;
            }
            case 1: {
                AppUpdateManagerKtxKt.tryOffer(producerScope0, NotAvailable.INSTANCE);
                DefaultImpls.close$default(producerScope0, null, 1, null);
                return;
            }
            case 2: 
            case 3: {
                Intrinsics.checkNotNullExpressionValue(((AppUpdateInfo)object0), "updateInfo");
                int v1 = ((AppUpdateInfo)object0).installStatus();
                AppUpdateManager appUpdateManager0 = (AppUpdateManager)this.b;
                if(v1 == 11) {
                    AppUpdateManagerKtxKt.tryOffer(producerScope0, new Downloaded(appUpdateManager0));
                    DefaultImpls.close$default(producerScope0, null, 1, null);
                    return;
                }
                appUpdateManager0.registerListener(((f)this.c));
                AppUpdateManagerKtxKt.tryOffer(producerScope0, new Available(appUpdateManager0, ((AppUpdateInfo)object0)));
            }
        }
    }

    @Override  // androidx.window.layout.ExtensionInterfaceCompat$ExtensionCallbackInterface
    public void onWindowLayoutChanged(Activity activity0, WindowLayoutInfo windowLayoutInfo0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(windowLayoutInfo0, "newLayout");
        ReentrantLock reentrantLock0 = (ReentrantLock)this.b;
        reentrantLock0.lock();
        WeakHashMap weakHashMap0 = (WeakHashMap)this.c;
        try {
            if(Intrinsics.areEqual(windowLayoutInfo0, ((WindowLayoutInfo)weakHashMap0.get(activity0)))) {
                return;
            }
            WindowLayoutInfo windowLayoutInfo1 = (WindowLayoutInfo)weakHashMap0.put(activity0, windowLayoutInfo0);
        }
        finally {
            reentrantLock0.unlock();
        }
        ((ExtensionCallbackInterface)this.a).onWindowLayoutChanged(activity0, windowLayoutInfo0);
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object object0) {
        String s = null;
        if(((Settings)object0) == null) {
            Logger.getLogger().w("Received null app settings, cannot send reports at crash time.");
            return Tasks.forResult(null);
        }
        Task task0 = l.b(((h)this.c).f);
        SessionReportingCoordinator sessionReportingCoordinator0 = ((h)this.c).f.l;
        if(((h)this.c).e) {
            s = (String)this.b;
        }
        return Tasks.whenAll(new Task[]{task0, sessionReportingCoordinator0.sendReports(((Executor)this.a), s)});
    }
}

