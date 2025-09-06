package m9;

import androidx.work.ListenableWorker.Result;
import com.kakao.editortracker.Logger;
import com.kakao.editortracker.Tracker;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import md.b;

public final class f extends SuspendLambda implements Function2 {
    public final Tracker o;

    public f(Tracker tracker0, Continuation continuation0) {
        this.o = tracker0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new f(this.o, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return ((f)this.create(((CoroutineScope)object0), ((Continuation)object1))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Result listenableWorker$Result0;
        HttpURLConnection httpURLConnection1;
        HttpURLConnection httpURLConnection0;
        ResultKt.throwOnFailure(object0);
        Tracker tracker0 = this.o;
        URL uRL0 = new URL(tracker0.getInputData().getString("URL"));
        String s = tracker0.getInputData().getString("JSON_STRING");
        Intrinsics.checkNotNull(s);
        Intrinsics.checkNotNullExpressionValue("Tracker", "access$getTAG$p(...)");
        Logger.INSTANCE.debug("Tracker", "Tracker request url : " + uRL0, new Object[0]);
        Intrinsics.checkNotNullExpressionValue("Tracker", "access$getTAG$p(...)");
        Logger.INSTANCE.debug("Tracker", "Tracker request body : " + s, new Object[0]);
        Charset charset0 = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(charset0, "forName(...)");
        byte[] arr_b = s.getBytes(charset0);
        Intrinsics.checkNotNullExpressionValue(arr_b, "getBytes(...)");
        if(arr_b.length > 80000) {
            return Result.failure();
        }
        try {
            httpURLConnection0 = null;
            URLConnection uRLConnection0 = uRL0.openConnection();
            Intrinsics.checkNotNull(uRLConnection0, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection1 = (HttpURLConnection)uRLConnection0;
            httpURLConnection1.setRequestMethod("POST");
            httpURLConnection1.setDoOutput(true);
            httpURLConnection1.setDoInput(true);
            httpURLConnection1.setReadTimeout(5000);
            httpURLConnection1.setConnectTimeout(5000);
            httpURLConnection1.setRequestProperty("Connection", "Close");
            httpURLConnection1.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
        }
        catch(SocketTimeoutException socketTimeoutException0) {
            goto label_38;
        }
        catch(ConnectException connectException0) {
            goto label_46;
        }
        catch(Throwable throwable0) {
            goto label_58;
        }
        try {
            Tracker.access$request(tracker0, httpURLConnection1, arr_b);
            listenableWorker$Result0 = (Result)Tracker.access$response(tracker0, httpURLConnection1, new c(tracker0), new e(tracker0));
            goto label_70;
        }
        catch(SocketTimeoutException socketTimeoutException0) {
        }
        catch(ConnectException connectException0) {
            goto label_45;
        }
        catch(Throwable throwable0) {
            goto label_57;
        }
        httpURLConnection0 = httpURLConnection1;
        try {
        label_38:
            Intrinsics.checkNotNullExpressionValue("Tracker", "access$getTAG$p(...)");
            String s1 = b.stackTraceToString(socketTimeoutException0);
            Logger.INSTANCE.error("Tracker", s1, new Object[0]);
            listenableWorker$Result0 = Tracker.access$retryOrFailure(tracker0, tracker0);
            if(httpURLConnection0 == null) {
                return listenableWorker$Result0;
            label_45:
                httpURLConnection0 = httpURLConnection1;
            label_46:
                Intrinsics.checkNotNullExpressionValue("Tracker", "access$getTAG$p(...)");
                String s2 = uRL0.toString();
                Intrinsics.checkNotNullExpressionValue(s2, "toString(...)");
                Logger.INSTANCE.error("Tracker", s2, new Object[0]);
                Intrinsics.checkNotNullExpressionValue("Tracker", "access$getTAG$p(...)");
                String s3 = b.stackTraceToString(connectException0);
                Logger.INSTANCE.error("Tracker", s3, new Object[0]);
                listenableWorker$Result0 = Tracker.access$retryOrFailure(tracker0, tracker0);
                if(httpURLConnection0 == null) {
                    return listenableWorker$Result0;
                }
                goto label_68;
            label_57:
                httpURLConnection0 = httpURLConnection1;
            label_58:
                Intrinsics.checkNotNullExpressionValue("Tracker", "access$getTAG$p(...)");
                String s4 = b.stackTraceToString(throwable0);
                Logger.INSTANCE.error("Tracker", s4, new Object[0]);
                listenableWorker$Result0 = Result.failure();
                if(httpURLConnection0 == null) {
                    return listenableWorker$Result0;
                }
            }
        }
        catch(Throwable throwable1) {
            if(httpURLConnection0 != null) {
                httpURLConnection0.disconnect();
            }
            throw throwable1;
        }
    label_68:
        httpURLConnection0.disconnect();
        return listenableWorker$Result0;
    label_70:
        httpURLConnection1.disconnect();
        return listenableWorker$Result0;
    }
}

