package r8;

import android.app.job.JobParameters;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.o;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public final class b implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public b(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override
    public final void run() {
        Object object0 = this.c;
        Object object1 = this.b;
        switch(this.a) {
            case 0: {
                ForcedSender.sendBlocking(((c)object1).g, Priority.HIGHEST);
                ((CountDownLatch)object0).countDown();
                return;
            }
            case 1: {
                ((ProfileInstallerInitializer)object1).getClass();
                Handler handler0 = Build.VERSION.SDK_INT < 28 ? new Handler(Looper.getMainLooper()) : v4.c.a(Looper.getMainLooper());
                int v = new Random().nextInt(1000);
                handler0.postDelayed(new o(((Context)object0), 2), ((long)(v + 5000)));
                return;
            }
            default: {
                ((JobInfoSchedulerService)object1).jobFinished(((JobParameters)object0), false);
            }
        }
    }
}

