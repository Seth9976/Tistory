package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;

public final class TaskStackBuilder implements Iterable {
    public interface SupportParentable {
        @Nullable
        Intent getSupportParentActivityIntent();
    }

    public final ArrayList a;
    public final Context b;

    public TaskStackBuilder(Context context0) {
        this.a = new ArrayList();
        this.b = context0;
    }

    @NonNull
    public TaskStackBuilder addNextIntent(@NonNull Intent intent0) {
        this.a.add(intent0);
        return this;
    }

    @NonNull
    public TaskStackBuilder addNextIntentWithParentStack(@NonNull Intent intent0) {
        ComponentName componentName0 = intent0.getComponent();
        if(componentName0 == null) {
            componentName0 = intent0.resolveActivity(this.b.getPackageManager());
        }
        if(componentName0 != null) {
            this.addParentStack(componentName0);
        }
        this.addNextIntent(intent0);
        return this;
    }

    @NonNull
    public TaskStackBuilder addParentStack(@NonNull Activity activity0) {
        Intent intent0 = activity0 instanceof SupportParentable ? ((SupportParentable)activity0).getSupportParentActivityIntent() : null;
        if(intent0 == null) {
            intent0 = NavUtils.getParentActivityIntent(activity0);
        }
        if(intent0 != null) {
            ComponentName componentName0 = intent0.getComponent();
            if(componentName0 == null) {
                componentName0 = intent0.resolveActivity(this.b.getPackageManager());
            }
            this.addParentStack(componentName0);
            this.addNextIntent(intent0);
        }
        return this;
    }

    @NonNull
    public TaskStackBuilder addParentStack(@NonNull ComponentName componentName0) {
        Context context0 = this.b;
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        try {
            for(Intent intent0 = NavUtils.getParentActivityIntent(context0, componentName0); intent0 != null; intent0 = NavUtils.getParentActivityIntent(context0, intent0.getComponent())) {
                arrayList0.add(v, intent0);
            }
            return this;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(packageManager$NameNotFoundException0);
        }
    }

    @NonNull
    public TaskStackBuilder addParentStack(@NonNull Class class0) {
        return this.addParentStack(new ComponentName(this.b, class0));
    }

    @NonNull
    public static TaskStackBuilder create(@NonNull Context context0) {
        return new TaskStackBuilder(context0);
    }

    @Nullable
    public Intent editIntentAt(int v) {
        return (Intent)this.a.get(v);
    }

    @Deprecated
    public static TaskStackBuilder from(Context context0) {
        return TaskStackBuilder.create(context0);
    }

    @Deprecated
    public Intent getIntent(int v) {
        return this.editIntentAt(v);
    }

    public int getIntentCount() {
        return this.a.size();
    }

    @NonNull
    public Intent[] getIntents() {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        Intent[] arr_intent = new Intent[v];
        if(v == 0) {
            return arr_intent;
        }
        arr_intent[0] = new Intent(((Intent)arrayList0.get(0))).addFlags(0x1000C000);
        for(int v1 = 1; v1 < v; ++v1) {
            arr_intent[v1] = new Intent(((Intent)arrayList0.get(v1)));
        }
        return arr_intent;
    }

    @Nullable
    public PendingIntent getPendingIntent(int v, int v1) {
        return this.getPendingIntent(v, v1, null);
    }

    @Nullable
    public PendingIntent getPendingIntent(int v, int v1, @Nullable Bundle bundle0) {
        ArrayList arrayList0 = this.a;
        if(arrayList0.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] arr_intent = (Intent[])arrayList0.toArray(new Intent[0]);
        arr_intent[0] = new Intent(arr_intent[0]).addFlags(0x1000C000);
        return PendingIntent.getActivities(this.b, v, arr_intent, v1, bundle0);
    }

    @Override
    @NonNull
    @Deprecated
    public Iterator iterator() {
        return this.a.iterator();
    }

    public void startActivities() {
        this.startActivities(null);
    }

    public void startActivities(@Nullable Bundle bundle0) {
        ArrayList arrayList0 = this.a;
        if(arrayList0.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] arr_intent = (Intent[])arrayList0.toArray(new Intent[0]);
        arr_intent[0] = new Intent(arr_intent[0]).addFlags(0x1000C000);
        Context context0 = this.b;
        if(!ContextCompat.startActivities(context0, arr_intent, bundle0)) {
            Intent intent0 = new Intent(arr_intent[arr_intent.length - 1]);
            intent0.addFlags(0x10000000);
            context0.startActivity(intent0);
        }
    }
}

