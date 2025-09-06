package androidx.core.app;

import android.animation.AnimatorSet;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.ClipData.Item;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.navigation.NavController;
import androidx.navigation.ui.NavigationUI;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;
import coil.EventListener;
import coil.request.ImageRequest;
import com.google.android.datatransport.cct.internal.LogResponse;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Function;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.animation.AnimatableView.Listener;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.canvas.CanvasCompat.CanvasOperation;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener;
import com.google.android.material.search.SearchBar;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.inject.Deferred.DeferredHandler;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.a0;
import com.google.firebase.messaging.y;
import com.kakao.tistory.presentation.view.SplashActivity;
import com.kakao.tistory.presentation.view.common.base.TistoryActivity;
import com.kakao.tistory.presentation.view.common.base.TistoryAppCompatActivity;
import com.kakao.tistory.presentation.view.d;
import com.kakao.tistory.presentation.view.n;
import com.kakao.tistory.presentation.view.statistics.StatisticsFragment;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel;
import com.kakao.tistory.presentation.viewmodel.SignUpViewModel;
import com.kakao.tistory.presentation.viewmodel.SplashViewModel;
import com.kakao.tistory.presentation.viewmodel.a6;
import com.kakao.tistory.presentation.viewmodel.b5;
import com.kakao.tistory.presentation.viewmodel.i2;
import f8.i;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.TWR;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.Job.DefaultImpls;
import okhttp3.Call;
import r6.a;
import r6.b;
import r6.c;

public final class h implements ObserverHandle, OnSharedElementsReadyListener, OnApplyWindowInsetsListener, TouchExplorationStateChangeListener, AccessibilityViewCommand, OnCommitContentListener, Factory, OnRefreshListener, coil.EventListener.Factory, Function, Continuation, OnCompleteListener, OnSuccessListener, Listener, CanvasOperation, OnItemSelectedListener, DeferredHandler, ReadOnlyProperty, okhttp3.EventListener.Factory {
    public final int a;
    public final Object b;

    public h(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // com.google.android.datatransport.runtime.retries.Function
    public Object apply(Object object0) {
        b b0;
        a a0 = (a)object0;
        c c0 = (c)this.b;
        c0.getClass();
        Logging.i("CctTransportBackend", "Making request to: %s", a0.a);
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)a0.a.openConnection();
        httpURLConnection0.setConnectTimeout(30000);
        httpURLConnection0.setReadTimeout(c0.g);
        httpURLConnection0.setDoOutput(true);
        httpURLConnection0.setInstanceFollowRedirects(false);
        httpURLConnection0.setRequestMethod("POST");
        httpURLConnection0.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection0.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection0.setRequestProperty("Content-Type", "application/json");
        httpURLConnection0.setRequestProperty("Accept-Encoding", "gzip");
        String s = a0.c;
        if(s != null) {
            httpURLConnection0.setRequestProperty("X-Goog-Api-Key", s);
        }
        try(OutputStream outputStream0 = httpURLConnection0.getOutputStream(); GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(outputStream0)) {
            BufferedWriter bufferedWriter0 = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream0));
            c0.a.encode(a0.b, bufferedWriter0);
        }
        catch(ConnectException | UnknownHostException connectException0) {
            Logging.e("CctTransportBackend", "Couldn\'t open connection, returning with 500", connectException0);
            return new b(500, null, 0L);
        }
        catch(EncodingException | IOException encodingException0) {
            Logging.e("CctTransportBackend", "Couldn\'t encode request, returning with 400", encodingException0);
            return new b(400, null, 0L);
        }
        int v = httpURLConnection0.getResponseCode();
        Logging.i("CctTransportBackend", "Status Code: %d", v);
        Logging.d("CctTransportBackend", "Content-Type: %s", httpURLConnection0.getHeaderField("Content-Type"));
        Logging.d("CctTransportBackend", "Content-Encoding: %s", httpURLConnection0.getHeaderField("Content-Encoding"));
        switch(v) {
            case 200: {
                InputStream inputStream0 = httpURLConnection0.getInputStream();
                try {
                    InputStream inputStream1 = "gzip".equals(httpURLConnection0.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream0) : inputStream0;
                    try {
                        b0 = new b(200, null, LogResponse.fromJson(new BufferedReader(new InputStreamReader(inputStream1))).getNextRequestWaitMillis());
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(inputStream1, throwable1);
                        throw throwable1;
                    }
                    if(inputStream1 != null) {
                        inputStream1.close();
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(inputStream0, throwable0);
                    throw throwable0;
                }
                if(inputStream0 != null) {
                    inputStream0.close();
                }
                return b0;
            }
            case 301: 
            case 302: 
            case 307: {
                return new b(v, new URL(httpURLConnection0.getHeaderField("Location")), 0L);
            }
            default: {
                return new b(v, null, 0L);
            }
        }
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Factory
    public SupportSQLiteOpenHelper create(Configuration supportSQLiteOpenHelper$Configuration0) {
        Intrinsics.checkNotNullParameter(((Context)this.b), "$context");
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper$Configuration0, "configuration");
        Builder supportSQLiteOpenHelper$Configuration$Builder0 = Configuration.Companion.builder(((Context)this.b));
        supportSQLiteOpenHelper$Configuration$Builder0.name(supportSQLiteOpenHelper$Configuration0.name).callback(supportSQLiteOpenHelper$Configuration0.callback).noBackupDirectory(true).allowDataLossOnRecovery(true);
        return new FrameworkSQLiteOpenHelperFactory().create(supportSQLiteOpenHelper$Configuration$Builder0.build());
    }

    @Override  // coil.EventListener$Factory
    public EventListener create(ImageRequest imageRequest0) {
        return (EventListener)this.b;
    }

    @Override  // okhttp3.EventListener$Factory
    public okhttp3.EventListener create(Call call0) {
        Intrinsics.checkNotNullParameter(((okhttp3.EventListener)this.b), "$this_asFactory");
        Intrinsics.checkNotNullParameter(call0, "it");
        return (okhttp3.EventListener)this.b;
    }

    @Override  // androidx.compose.runtime.snapshots.ObserverHandle
    public void dispose() {
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.h = CollectionsKt___CollectionsKt.minus(SnapshotKt.h, ((Function2)this.b));
        }
    }

    @Override  // kotlin.properties.ReadOnlyProperty
    public Object getValue(Object object0, KProperty kProperty0) {
        Intrinsics.checkNotNullParameter(this.b, "$value");
        Intrinsics.checkNotNullParameter(kProperty0, "<anonymous parameter 1>");
        return this.b;
    }

    @Override  // com.google.firebase.inject.Deferred$DeferredHandler
    public void handle(Provider provider0) {
        ((CrashlyticsNativeComponentDeferredProxy)this.b).getClass();
        Logger.getLogger().d("Crashlytics native component now available.");
        CrashlyticsNativeComponent crashlyticsNativeComponent0 = (CrashlyticsNativeComponent)provider0.get();
        ((CrashlyticsNativeComponentDeferredProxy)this.b).b.set(crashlyticsNativeComponent0);
    }

    @Override  // com.google.android.material.animation.AnimatableView$Listener
    public void onAnimationEnd() {
        ((AnimatorSet)this.b).start();
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0) {
        return this.a == 17 ? TistoryActivity.a(((TistoryActivity)this.b), view0, windowInsetsCompat0) : TistoryAppCompatActivity.a(((TistoryAppCompatActivity)this.b), view0, windowInsetsCompat0);
    }

    @Override  // androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat0, int v, Bundle bundle0) {
        if((v & 1) != 0) {
            try {
                inputContentInfoCompat0.requestPermission();
            }
            catch(Exception exception0) {
                Log.w("InputConnectionCompat", "Can\'t insert content from IME; requestPermission() failed", exception0);
                return false;
            }
            bundle0 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            bundle0.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", ((Parcelable)inputContentInfoCompat0.unwrap()));
        }
        ContentInfoCompat contentInfoCompat0 = new androidx.core.view.ContentInfoCompat.Builder(new ClipData(inputContentInfoCompat0.getDescription(), new ClipData.Item(inputContentInfoCompat0.getContentUri())), 2).setLinkUri(inputContentInfoCompat0.getLinkUri()).setExtras(bundle0).build();
        return ViewCompat.performReceiveContent(((View)this.b), contentInfoCompat0) == null;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task0) {
        switch(this.a) {
            case 9: {
                y.a(((Intent)this.b));
                return;
            }
            case 10: {
                ((a0)this.b).b.trySetResult(null);
                return;
            }
            case 11: {
                ((ScheduledFuture)this.b).cancel(false);
                return;
            }
            default: {
                Exception exception0 = task0.getException();
                CompletableDeferred completableDeferred0 = (CompletableDeferred)this.b;
                if(exception0 == null) {
                    if(task0.isCanceled()) {
                        DefaultImpls.cancel$default(completableDeferred0, null, 1, null);
                        return;
                    }
                    completableDeferred0.complete(task0.getResult());
                    return;
                }
                completableDeferred0.completeExceptionally(exception0);
            }
        }
    }

    @Override  // com.google.android.material.navigation.NavigationBarView$OnItemSelectedListener
    public boolean onNavigationItemSelected(MenuItem menuItem0) {
        Intrinsics.checkNotNullParameter(((NavController)this.b), "$navController");
        Intrinsics.checkNotNullParameter(menuItem0, "item");
        return NavigationUI.onNavDestinationSelected(menuItem0, ((NavController)this.b));
    }

    @Override  // androidx.swiperefreshlayout.widget.SwipeRefreshLayout$OnRefreshListener
    public void onRefresh() {
        StatisticsFragment.a(((StatisticsFragment)this.b));
    }

    @Override  // androidx.core.app.SharedElementCallback$OnSharedElementsReadyListener
    public void onSharedElementsReady() {
        androidx.core.app.c.a(((SharedElementCallback.OnSharedElementsReadyListener)this.b));
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object object0) {
        switch(this.a) {
            case 14: {
                SplashActivity.b(((n)this.b), object0);
                return;
            }
            case 15: {
                SplashActivity.a(((d)this.b), object0);
                return;
            }
            case 27: {
                KakaoLoginViewModel.e(((i2)this.b), object0);
                return;
            }
            case 28: {
                SignUpViewModel.a(((b5)this.b), object0);
                return;
            }
            default: {
                SplashViewModel.a(((a6)this.b), object0);
            }
        }
    }

    @Override  // androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        Object object0 = this.b;
        if(this.a != 4) {
            AutoCompleteTextView autoCompleteTextView0 = ((i)object0).h;
            if(autoCompleteTextView0 != null && !g.a.H(autoCompleteTextView0)) {
                ViewCompat.setImportantForAccessibility(((i)object0).d, (z ? 2 : 1));
            }
            return;
        }
        ((SearchBar)object0).setFocusableInTouchMode(z);
    }

    @Override  // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view0, CommandArguments accessibilityViewCommand$CommandArguments0) {
        return ((BottomSheetDragHandleView)this.b).a();
    }

    @Override  // com.google.android.material.canvas.CanvasCompat$CanvasOperation
    public void run(Canvas canvas0) {
        MaskableFrameLayout.a(((MaskableFrameLayout)this.b), canvas0);
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public Object then(Task task0) {
        Object object0 = this.b;
        switch(this.a) {
            case 6: {
                ((SessionReportingCoordinator)object0).getClass();
                if(task0.isSuccessful()) {
                    CrashlyticsReportWithSessionId crashlyticsReportWithSessionId0 = (CrashlyticsReportWithSessionId)task0.getResult();
                    Logger.getLogger().d("Crashlytics report successfully enqueued to DataTransport: " + crashlyticsReportWithSessionId0.getSessionId());
                    File file0 = crashlyticsReportWithSessionId0.getReportFile();
                    if(file0.delete()) {
                        Logger.getLogger().d("Deleted report file: " + file0.getPath());
                        return true;
                    }
                    Logger.getLogger().w("Crashlytics could not delete report file: " + file0.getPath());
                    return true;
                }
                Logger.getLogger().w("Crashlytics report could not be enqueued to DataTransport", task0.getException());
                return false;
            }
            case 7: {
                ((CountDownLatch)object0).countDown();
                return null;
            }
            default: {
                ((com.google.firebase.messaging.n)object0).getClass();
                Bundle bundle0 = (Bundle)task0.getResult(IOException.class);
                if(bundle0 == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String s = bundle0.getString("registration_id");
                if(s == null) {
                    s = bundle0.getString("unregistered");
                    if(s == null) {
                        String s1 = bundle0.getString("error");
                        if("RST".equals(s1)) {
                            throw new IOException("INSTANCE_ID_RESET");
                        }
                        if(s1 != null) {
                            throw new IOException(s1);
                        }
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle0, new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                }
                return s;
            }
        }
    }
}

