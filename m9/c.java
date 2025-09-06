package m9;

import androidx.work.ListenableWorker.Result;
import com.kakao.editortracker.Tracker;
import java.io.InputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final Tracker w;

    public c(Tracker tracker0) {
        this.w = tracker0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((InputStream)object0), "inputStream");
        Tracker.access$readLine(this.w, ((InputStream)object0), b.w);
        return Result.success();
    }
}

