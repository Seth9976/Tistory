package a7;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.appcompat.view.menu.f;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.compose.BaselineAnchorable;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope.BaselineAnchor;
import androidx.constraintlayout.core.PriorityGoalRow;
import androidx.constraintlayout.core.SolverVariable;
import androidx.core.splashscreen.R.id;
import androidx.core.util.Preconditions;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.y0;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.g;
import com.bumptech.glide.util.Util;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.carousel.k;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import d0.s;
import d4.a;
import d4.i;
import hg.e;
import hg.j;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.l;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ClassValueParametrizedCache.get-gIAlu-s..inlined.getOrSet.1;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.SerializerCache;
import md.c;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.h;

public class b implements BaselineAnchorable, OnApplyWindowInsetsListener, RequestManagerTreeNode, SuccessContinuation, QueueFile.ElementReader, FidListenerHandle, BiConsumer, ParametrizedSerializerCache, SerializerCache, CallAdapter, Callback {
    public final int a;
    public Object b;
    public Object c;

    public b(int v) {
        this.a = v;
        switch(v) {
            case 6: {
                super();
                this.b = new HashMap();
                this.c = new HashMap();
                return;
            }
            case 7: {
                super();
                this.b = new HashMap();
                this.c = new f(6);
                return;
            }
            default: {
                super();
                this.c = new Object();
            }
        }
    }

    public b(int v, int v1) {
        this.a = 4;
        super();
        this.b = new int[]{v, v1};
        this.c = new float[]{0.0f, 1.0f};
    }

    public b(int v, int v1, int v2) {
        this.a = 4;
        super();
        this.b = new int[]{v, v1, v2};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    public b(Activity activity0) {
        this.a = 23;
        Intrinsics.checkNotNullParameter(activity0, "activity");
        super();
        this.b = activity0;
        this.c = c.lazy(new s(this, 23));
    }

    public b(IBinder iBinder0) {
        this.a = 9;
        super();
        String s = iBinder0.getInterfaceDescriptor();
        if("android.os.IMessenger".equals(s)) {
            this.b = new Messenger(iBinder0);
            this.c = null;
            return;
        }
        if("com.google.android.gms.iid.IMessengerCompat".equals(s)) {
            this.c = new zzd(iBinder0);
            this.b = null;
            return;
        }
        String s1 = String.valueOf(s);
        Log.w("MessengerIpcClient", (s1.length() == 0 ? new String("Invalid interface descriptor: ") : "Invalid interface descriptor: " + s1));
        throw new RemoteException();
    }

    public b(EditText editText0, boolean z) {
        this.a = 18;
        super();
        this.b = editText0;
        i i0 = new i(editText0, z);
        this.c = i0;
        editText0.addTextChangedListener(i0);
        if(a.b == null) {
            synchronized(a.a) {
                if(a.b == null) {
                    a a0 = new a();  // 初始化器: Landroid/text/Editable$Factory;-><init>()V
                    try {
                        a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, a.class.getClassLoader());
                    }
                    catch(Throwable unused_ex) {
                    }
                    a.b = a0;
                }
            }
        }
        editText0.setEditableFactory(a.b);
    }

    public b(PriorityGoalRow priorityGoalRow0) {
        this.a = 2;
        super();
        this.c = priorityGoalRow0;
    }

    public b(ViewPager viewPager0) {
        this.a = 19;
        super();
        this.c = viewPager0;
        this.b = new Rect();
    }

    public b(k k0, k k1) {
        this.a = 10;
        super();
        Preconditions.checkArgument(k0.a <= k1.a);
        this.b = k0;
        this.c = k1;
    }

    public b(DevelopmentPlatformProvider developmentPlatformProvider0) {
        this.a = 27;
        super();
        int v = CommonUtils.getResourcesIdentifier(developmentPlatformProvider0.a, "com.google.firebase.crashlytics.unity_version", "string");
        Context context0 = developmentPlatformProvider0.a;
        if(v != 0) {
            this.b = "Unity";
            String s = context0.getResources().getString(v);
            this.c = s;
            Logger.getLogger().v("Unity Editor version is: " + s);
            return;
        }
        if(context0.getAssets() != null) {
            try {
                InputStream inputStream0 = context0.getAssets().open("flutter_assets/NOTICES.Z");
                if(inputStream0 != null) {
                    inputStream0.close();
                }
            }
            catch(IOException unused_ex) {
                this.b = null;
                this.c = null;
                return;
            }
            this.b = "Flutter";
            this.c = null;
            Logger.getLogger().v("Development platform is: Flutter");
            return;
        }
        this.b = null;
        this.c = null;
    }

    public b(Object object0) {
        this.a = 25;
        super();
        this.b = object0;
        this.c = Thread.currentThread();
    }

    public b(Object object0, Object object1, boolean z, int v) {
        this.a = v;
        this.c = object0;
        this.b = object1;
        super();
    }

    public b(Object object0, ArrayList arrayList0) {
        this.a = 1;
        Intrinsics.checkNotNullParameter(object0, "id");
        Intrinsics.checkNotNullParameter(arrayList0, "tasks");
        super();
        this.b = object0;
        this.c = arrayList0;
    }

    public b(ArrayList arrayList0, ArrayList arrayList1) {
        this.a = 4;
        super();
        int v = arrayList0.size();
        this.b = new int[v];
        this.c = new float[v];
        for(int v1 = 0; v1 < v; ++v1) {
            int[] arr_v = (int[])this.b;
            arr_v[v1] = (int)(((Integer)arrayList0.get(v1)));
            float[] arr_f = (float[])this.c;
            arr_f[v1] = (float)(((Float)arrayList1.get(v1)));
        }
    }

    public b(ExecutorService executorService0) {
        this.a = 17;
        super();
        this.c = new ArrayMap();
        this.b = executorService0;
    }

    public b(Function1 function10) {
        this.a = 21;
        Intrinsics.checkNotNullParameter(function10, "compute");
        super();
        this.b = function10;
        this.c = new ConcurrentHashMap();
    }

    public b(Function2 function20, int v) {
        this.a = v;
        if(v != 22) {
            Intrinsics.checkNotNullParameter(function20, "compute");
            super();
            this.b = function20;
            this.c = new hg.c();
            return;
        }
        Intrinsics.checkNotNullParameter(function20, "compute");
        super();
        this.b = function20;
        this.c = new ConcurrentHashMap();
    }

    public static b a(Context context0) {
        FileLock fileLock0;
        FileChannel fileChannel0;
        try {
            fileChannel0 = new RandomAccessFile(new File(context0.getFilesDir(), "generatefid.lock"), "rw").getChannel();
        }
        catch(IOException | Error | OverlappingFileLockException iOException0) {
            fileChannel0 = null;
            fileLock0 = null;
            goto label_13;
        }
        try {
            fileLock0 = fileChannel0.lock();
        }
        catch(IOException | Error | OverlappingFileLockException iOException0) {
            fileLock0 = null;
            goto label_13;
        }
        try {
            return new b(15, fileChannel0, fileLock0);
        }
        catch(IOException | Error | OverlappingFileLockException iOException0) {
        }
    label_13:
        Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", iOException0);
        if(fileLock0 != null) {
            try {
                fileLock0.release();
            }
            catch(IOException unused_ex) {
            }
        }
        if(fileChannel0 != null) {
            try {
                fileChannel0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        return null;
    }

    @Override  // io.reactivex.functions.BiConsumer
    public void accept(Object object0, Object object1) {
        ((Map)object0).put(((Function)this.c).apply(object1), ((Function)this.b).apply(object1));
    }

    @Override  // retrofit2.CallAdapter
    public Object adapt(Call call0) {
        Executor executor0 = (Executor)this.c;
        return executor0 != null ? new h(executor0, call0) : call0;
    }

    public void b() {
        String s = (String)this.b;
        try {
            ((FileStore)this.c).getCommonFile(s).createNewFile();
        }
        catch(IOException iOException0) {
            Logger.getLogger().e("Error creating marker: " + s, iOException0);
        }
    }

    public void c() {
        View view0 = ((ViewGroup)((Activity)this.b).findViewById(0x1020002)).getRootView();
        ViewGroup viewGroup0 = view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
        if(viewGroup0 != null) {
            viewGroup0.addView(((ViewGroup)((Lazy)this.c).getValue()));
        }
    }

    public void d(FragmentManager fragmentManager0, HashSet hashSet0) {
        List list0 = fragmentManager0.getFragments();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Fragment fragment0 = (Fragment)list0.get(v1);
            this.d(fragment0.getChildFragmentManager(), hashSet0);
            g g0 = (g)this.c;
            g0.getClass();
            Util.assertMainThread();
            RequestManager requestManager0 = (RequestManager)g0.a.get(fragment0.getLifecycle());
            if(requestManager0 != null) {
                hashSet0.add(requestManager0);
            }
        }
    }

    public long e() {
        return 0L;
    }

    public long f() {
        return 0L;
    }

    public View g() {
        View view0 = this.h().findViewById(id.splashscreen_icon_view);
        Intrinsics.checkNotNullExpressionValue(view0, "splashScreenView.findVie…d.splashscreen_icon_view)");
        return view0;
    }

    @Override  // kotlinx.serialization.internal.SerializerCache
    public KSerializer get(KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "key");
        ConcurrentHashMap concurrentHashMap0 = (ConcurrentHashMap)this.c;
        Class class0 = JvmClassMappingKt.getJavaClass(kClass0);
        hg.a a0 = concurrentHashMap0.get(class0);
        if(a0 == null) {
            a0 = new hg.a(((KSerializer)((Function1)this.b).invoke(kClass0)));
            Object object0 = concurrentHashMap0.putIfAbsent(class0, a0);
            if(object0 != null) {
                a0 = object0;
            }
        }
        return a0.a;
    }

    @Override  // kotlinx.serialization.internal.ParametrizedSerializerCache
    public Object get-gIAlu-s(KClass kClass0, List list0) {
        Object object7;
        Object object2;
        Intrinsics.checkNotNullParameter(kClass0, "key");
        Intrinsics.checkNotNullParameter(list0, "types");
        if(this.a != 20) {
            ConcurrentHashMap concurrentHashMap0 = (ConcurrentHashMap)this.c;
            Class class0 = JvmClassMappingKt.getJavaClass(kClass0);
            j j0 = concurrentHashMap0.get(class0);
            if(j0 == null) {
                j0 = new j();
                Object object0 = concurrentHashMap0.putIfAbsent(class0, j0);
                if(object0 != null) {
                    j0 = object0;
                }
            }
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
            for(Object object1: list0) {
                arrayList0.add(new e(((KType)object1)));
            }
            ConcurrentHashMap concurrentHashMap1 = j0.a;
            Result result0 = concurrentHashMap1.get(arrayList0);
            if(result0 == null) {
                try {
                    object2 = Result.constructor-impl(((KSerializer)((Function2)this.b).invoke(kClass0, list0)));
                }
                catch(Throwable throwable0) {
                    object2 = Result.constructor-impl(ResultKt.createFailure(throwable0));
                }
                Result result1 = Result.box-impl(object2);
                Object object3 = concurrentHashMap1.putIfAbsent(arrayList0, result1);
                result0 = object3 == null ? result1 : object3;
            }
            Intrinsics.checkNotNullExpressionValue(result0, "getOrPut(...)");
            return result0.unbox-impl();
        }
        Object object4 = ((hg.c)this.c).get(JvmClassMappingKt.getJavaClass(kClass0));
        Intrinsics.checkNotNullExpressionValue(object4, "get(...)");
        Object object5 = ((hg.h)object4).a.get();
        if(object5 == null) {
            object5 = ((hg.h)object4).a(new ClassValueParametrizedCache.get-gIAlu-s..inlined.getOrSet.1());
        }
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object6: list0) {
            arrayList1.add(new e(((KType)object6)));
        }
        ConcurrentHashMap concurrentHashMap2 = ((j)object5).a;
        Result result2 = concurrentHashMap2.get(arrayList1);
        if(result2 == null) {
            try {
                object7 = Result.constructor-impl(((KSerializer)((Function2)this.b).invoke(kClass0, list0)));
            }
            catch(Throwable throwable1) {
                object7 = Result.constructor-impl(ResultKt.createFailure(throwable1));
            }
            Result result3 = Result.box-impl(object7);
            Object object8 = concurrentHashMap2.putIfAbsent(arrayList1, result3);
            result2 = object8 == null ? result3 : object8;
        }
        Intrinsics.checkNotNullExpressionValue(result2, "getOrPut(...)");
        return result2.unbox-impl();
    }

    @Override  // com.bumptech.glide.manager.RequestManagerTreeNode
    public Set getDescendants() {
        Set set0 = new HashSet();
        this.d(((FragmentManager)this.b), ((HashSet)set0));
        return set0;
    }

    public ViewGroup h() {
        return (ViewGroup)((Lazy)this.c).getValue();
    }

    public y0 i() {
        synchronized(this.c) {
            y0 y00 = (y0)this.b;
            if(y00 == null) {
                return null;
            }
            this.b = y00.a;
            return y00;
        }
    }

    public void j(String s) {
        com.bumptech.glide.load.engine.cache.a a0;
        synchronized(this) {
            a0 = (com.bumptech.glide.load.engine.cache.a)com.bumptech.glide.util.Preconditions.checkNotNull(((HashMap)this.b).get(s));
            int v1 = a0.b;
            if(v1 >= 1) {
                a0.b = v1 - 1;
                if(v1 - 1 == 0) {
                    com.bumptech.glide.load.engine.cache.a a1 = (com.bumptech.glide.load.engine.cache.a)((HashMap)this.b).remove(s);
                    if(!a1.equals(a0)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + a0 + ", but actually removed: " + a1 + ", safeKey: " + s);
                    }
                    f f0 = (f)this.c;
                    synchronized(((ArrayDeque)f0.b)) {
                        if(((ArrayDeque)f0.b).size() < 10) {
                            ((ArrayDeque)f0.b).offer(a1);
                        }
                    }
                }
                a0.a.unlock();
                return;
            }
        }
        throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + s + ", interestedThreads: " + a0.b);
    }

    public void k() {
        try {
            ((FileLock)this.c).release();
            ((FileChannel)this.b).close();
        }
        catch(IOException iOException0) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", iOException0);
        }
    }

    public void l() {
        ViewParent viewParent0 = this.h().getParent();
        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        if(viewGroup0 != null) {
            viewGroup0.removeView(this.h());
        }
    }

    @Override  // androidx.constraintlayout.compose.BaselineAnchorable
    public void linkTo-VpY3zN4(BaselineAnchor constraintLayoutBaseScope$BaselineAnchor0, float f, float f1) {
        Intrinsics.checkNotNullParameter(constraintLayoutBaseScope$BaselineAnchor0, "anchor");
        androidx.constraintlayout.compose.c c0 = new androidx.constraintlayout.compose.c(f, f1, this, 3, constraintLayoutBaseScope$BaselineAnchor0);
        ((ArrayList)this.c).add(c0);
    }

    public void m(int v) {
        y0 y00;
        synchronized(this.c) {
            while(true) {
                y00 = (y0)this.b;
                if(y00 == null || y00.b != v) {
                    break;
                }
                this.b = y00.a;
                y00.b();
            }
            if(y00 != null) {
                for(y0 y01 = y00.a; y01 != null; y01 = y02) {
                    y0 y02 = y01.a;
                    if(y01.b == v) {
                        y00.a = y02;
                        y01.b();
                    }
                    else {
                        y00 = y01;
                    }
                }
            }
        }
    }

    public void n(y0 y00) {
        synchronized(this.c) {
            y0 y01 = (y0)this.b;
            if(y01 == null) {
                this.b = y00;
                return;
            }
            y0 y02;
            while((y02 = y01.a) != null) {
                y01 = y02;
            }
            y01.a = y00;
        }
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0) {
        WindowInsetsCompat windowInsetsCompat1 = ViewCompat.onApplyWindowInsets(view0, windowInsetsCompat0);
        if(windowInsetsCompat1.isConsumed()) {
            return windowInsetsCompat1;
        }
        int v = windowInsetsCompat1.getSystemWindowInsetLeft();
        Rect rect0 = (Rect)this.b;
        rect0.left = v;
        rect0.top = windowInsetsCompat1.getSystemWindowInsetTop();
        rect0.right = windowInsetsCompat1.getSystemWindowInsetRight();
        rect0.bottom = windowInsetsCompat1.getSystemWindowInsetBottom();
        ViewPager viewPager0 = (ViewPager)this.c;
        int v1 = viewPager0.getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            WindowInsetsCompat windowInsetsCompat2 = ViewCompat.dispatchApplyWindowInsets(viewPager0.getChildAt(v2), windowInsetsCompat1);
            rect0.left = Math.min(windowInsetsCompat2.getSystemWindowInsetLeft(), rect0.left);
            rect0.top = Math.min(windowInsetsCompat2.getSystemWindowInsetTop(), rect0.top);
            rect0.right = Math.min(windowInsetsCompat2.getSystemWindowInsetRight(), rect0.right);
            rect0.bottom = Math.min(windowInsetsCompat2.getSystemWindowInsetBottom(), rect0.bottom);
        }
        return windowInsetsCompat1.replaceSystemWindowInsets(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    @Override  // retrofit2.Callback
    public void onFailure(Call call0, Throwable throwable0) {
        ((h)this.c).a.execute(new androidx.emoji2.text.k(this, ((Callback)this.b), 9, throwable0));
    }

    @Override  // retrofit2.Callback
    public void onResponse(Call call0, Response response0) {
        ((h)this.c).a.execute(new androidx.emoji2.text.k(this, ((Callback)this.b), 8, response0));
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.QueueFile$ElementReader
    public void read(InputStream inputStream0, int v) {
        int[] arr_v = (int[])this.c;
        try(inputStream0) {
            inputStream0.read(((byte[])this.b), arr_v[0], v);
            arr_v[0] += v;
        }
    }

    @Override  // retrofit2.CallAdapter
    public Type responseType() {
        return (Type)this.b;
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object object0) {
        if(this.a != 11) {
            return ((com.google.firebase.crashlytics.internal.common.l)this.c).e.submitTask(new androidx.work.impl.model.b(1, this, ((Boolean)object0)));
        }
        if(((Settings)object0) == null) {
            Logger.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
            return Tasks.forResult(null);
        }
        androidx.work.impl.model.b b0 = (androidx.work.impl.model.b)this.c;
        com.google.firebase.crashlytics.internal.common.l.b(((com.google.firebase.crashlytics.internal.common.l)((b)b0.c).c));
        ((com.google.firebase.crashlytics.internal.common.l)((b)b0.c).c).l.sendReports(((Executor)this.b));
        ((com.google.firebase.crashlytics.internal.common.l)((b)b0.c).c).q.trySetResult(null);
        return Tasks.forResult(null);
    }

    @Override
    public String toString() {
        String s = "[ ";
        if(this.a != 2) {
            return super.toString();
        }
        if(((SolverVariable)this.b) != null) {
            for(int v = 0; v < 9; ++v) {
                StringBuilder stringBuilder0 = a5.b.t(s);
                s = androidx.room.a.h(((SolverVariable)this.b).d[v], " ", stringBuilder0);
            }
        }
        StringBuilder stringBuilder1 = a5.b.u(s, "] ");
        stringBuilder1.append(((SolverVariable)this.b));
        return stringBuilder1.toString();
    }

    @Override  // com.google.firebase.installations.internal.FidListenerHandle
    public void unregister() {
        synchronized(((FirebaseInstallations)this.c)) {
            ((FirebaseInstallations)this.c).k.remove(((FidListener)this.b));
        }
    }
}

