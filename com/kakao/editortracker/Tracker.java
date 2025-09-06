package com.kakao.editortracker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import m9.a;
import m9.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000B2\u00020\u0001:\u0001\u000BB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/kakao/editortracker/Tracker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Tracker extends CoroutineWorker {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/editortracker/Tracker$Companion;", "", "", "JSON_STRING", "Ljava/lang/String;", "URL", "editortracker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String JSON_STRING = "JSON_STRING";
    @NotNull
    public static final String URL = "URL";

    static {
        Tracker.Companion = new Companion(null);
    }

    public Tracker(@NotNull Context context0, @NotNull WorkerParameters workerParameters0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(workerParameters0, "workerParameters");
        super(context0, workerParameters0);
    }

    public static final boolean access$isServerError(Tracker tracker0, int v) {
        tracker0.getClass();
        return 500 <= v && v < 600;
    }

    public static final void access$readLine(Tracker tracker0, InputStream inputStream0, Function1 function10) {
        tracker0.getClass();
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0));
        String s = bufferedReader0.readLine();
        Intrinsics.checkNotNullExpressionValue(s, "readLine(...)");
        function10.invoke(s);
        bufferedReader0.close();
    }

    public static final void access$request(Tracker tracker0, HttpURLConnection httpURLConnection0, byte[] arr_b) {
        tracker0.getClass();
        OutputStream outputStream0 = httpURLConnection0.getOutputStream();
        outputStream0.write(arr_b);
        outputStream0.close();
    }

    public static final Object access$response(Tracker tracker0, HttpURLConnection httpURLConnection0, Function1 function10, Function2 function20) {
        tracker0.getClass();
        int v = httpURLConnection0.getResponseCode();
        if(200 <= v && v < 300) {
            InputStream inputStream0 = httpURLConnection0.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream0, "getInputStream(...)");
            return function10.invoke(inputStream0);
        }
        InputStream inputStream1 = httpURLConnection0.getErrorStream();
        Intrinsics.checkNotNullExpressionValue(inputStream1, "getErrorStream(...)");
        return function20.invoke(v, inputStream1);
    }

    public static final Result access$retryOrFailure(Tracker tracker0, ListenableWorker listenableWorker0) {
        Result listenableWorker$Result0;
        tracker0.getClass();
        if(listenableWorker0.getRunAttemptCount() < 2) {
            listenableWorker$Result0 = Result.retry();
            Intrinsics.checkNotNull(listenableWorker$Result0);
            return listenableWorker$Result0;
        }
        listenableWorker$Result0 = Result.failure();
        Intrinsics.checkNotNull(listenableWorker$Result0);
        return listenableWorker$Result0;
    }

    @Override  // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull Continuation continuation0) {
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.q;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.q = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, continuation0);
        }
        Object object0 = a0.o;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                f f0 = new f(this, null);
                a0.q = 1;
                object0 = BuildersKt.withContext(Dispatchers.getIO(), f0, a0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Intrinsics.checkNotNullExpressionValue(object0, "withContext(...)");
        return object0;
    }
}

