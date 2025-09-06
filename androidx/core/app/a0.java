package androidx.core.app;

import android.os.AsyncTask;

public final class a0 extends AsyncTask {
    public final JobIntentService a;

    public a0(JobIntentService jobIntentService0) {
        this.a = jobIntentService0;
        super();
    }

    @Override  // android.os.AsyncTask
    public final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        while(true) {
            JobIntentService jobIntentService0 = this.a;
            jobIntentService0.a.getClass();
            GenericWorkItem jobIntentService$GenericWorkItem0 = jobIntentService0.a.dequeueWork();
            if(jobIntentService$GenericWorkItem0 == null) {
                break;
            }
            jobIntentService0.onHandleWork(((b0)jobIntentService$GenericWorkItem0).a.getIntent());
            ((b0)jobIntentService$GenericWorkItem0).complete();
        }
        return null;
    }

    @Override  // android.os.AsyncTask
    public final void onCancelled(Object object0) {
        Void void0 = (Void)object0;
        this.a.getClass();
    }

    @Override  // android.os.AsyncTask
    public final void onPostExecute(Object object0) {
        Void void0 = (Void)object0;
        this.a.getClass();
    }
}

