package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class r implements ActivityChooserModel.ActivitySorter {
    public final HashMap a;

    public r(int v) {
        if(v != 1) {
            super();
            this.a = new HashMap();
            return;
        }
        super();
        this.a = new HashMap();
    }

    @Override  // androidx.appcompat.widget.ActivityChooserModel$ActivitySorter
    public void sort(Intent intent0, List list0, List list1) {
        HashMap hashMap0 = this.a;
        hashMap0.clear();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ActivityChooserModel.ActivityResolveInfo activityChooserModel$ActivityResolveInfo0 = (ActivityChooserModel.ActivityResolveInfo)list0.get(v1);
            activityChooserModel$ActivityResolveInfo0.weight = 0.0f;
            hashMap0.put(new ComponentName(activityChooserModel$ActivityResolveInfo0.resolveInfo.activityInfo.packageName, activityChooserModel$ActivityResolveInfo0.resolveInfo.activityInfo.name), activityChooserModel$ActivityResolveInfo0);
        }
        int v2 = list1.size() - 1;
        float f = 1.0f;
        while(v2 >= 0) {
            ActivityChooserModel.HistoricalRecord activityChooserModel$HistoricalRecord0 = (ActivityChooserModel.HistoricalRecord)list1.get(v2);
            ActivityChooserModel.ActivityResolveInfo activityChooserModel$ActivityResolveInfo1 = (ActivityChooserModel.ActivityResolveInfo)hashMap0.get(activityChooserModel$HistoricalRecord0.activity);
            if(activityChooserModel$ActivityResolveInfo1 != null) {
                activityChooserModel$ActivityResolveInfo1.weight = activityChooserModel$HistoricalRecord0.weight * f + activityChooserModel$ActivityResolveInfo1.weight;
                f *= 0.95f;
            }
            --v2;
        }
        Collections.sort(list0);
    }
}

