package m9;

import androidx.work.ListenableWorker.Result;
import com.kakao.editortracker.Tracker;
import java.io.InputStream;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final Tracker w;

    public e(Tracker tracker0) {
        this.w = tracker0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((InputStream)object1), "inputStream");
        Tracker tracker0 = this.w;
        Tracker.access$readLine(tracker0, ((InputStream)object1), d.w);
        if(Tracker.access$isServerError(tracker0, ((Number)object0).intValue())) {
            return Tracker.access$retryOrFailure(tracker0, tracker0);
        }
        Result listenableWorker$Result0 = Result.failure();
        Intrinsics.checkNotNull(listenableWorker$Result0);
        return listenableWorker$Result0;
    }
}

