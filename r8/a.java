package r8;

import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.RetryStrategy;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import java.net.URL;
import java.nio.charset.Charset;
import r6.b;

public final class a implements Transformer, RetryStrategy {
    @Override  // com.google.android.datatransport.Transformer
    public Object apply(Object object0) {
        return DataTransportCrashlyticsReportSender.b.reportToJson(((CrashlyticsReport)object0)).getBytes(Charset.forName("UTF-8"));
    }

    @Override  // com.google.android.datatransport.runtime.retries.RetryStrategy
    public Object shouldRetry(Object object0, Object object1) {
        URL uRL0 = ((b)object1).b;
        if(uRL0 != null) {
            Logging.d("CctTransportBackend", "Following redirect to: %s", uRL0);
            return new r6.a(((b)object1).b, ((r6.a)object0).b, ((r6.a)object0).c);
        }
        return null;
    }
}

