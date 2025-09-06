package androidx.appcompat.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class ActivityChooserModel.ActivityResolveInfo implements Comparable {
    public final ResolveInfo resolveInfo;
    public float weight;

    public ActivityChooserModel.ActivityResolveInfo(ResolveInfo resolveInfo0) {
        this.resolveInfo = resolveInfo0;
    }

    public int compareTo(ActivityChooserModel.ActivityResolveInfo activityChooserModel$ActivityResolveInfo0) {
        return Float.floatToIntBits(activityChooserModel$ActivityResolveInfo0.weight) - Float.floatToIntBits(this.weight);
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((ActivityChooserModel.ActivityResolveInfo)object0));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        return ActivityChooserModel.ActivityResolveInfo.class == class0 ? Float.floatToIntBits(this.weight) == Float.floatToIntBits(((ActivityChooserModel.ActivityResolveInfo)object0).weight) : false;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.weight) + 0x1F;
    }

    @Override
    public String toString() {
        return "[resolveInfo:" + this.resolveInfo.toString() + "; weight:" + new BigDecimal(((double)this.weight)) + "]";
    }
}

