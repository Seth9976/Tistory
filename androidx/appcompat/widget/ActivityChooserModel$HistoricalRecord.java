package androidx.appcompat.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class ActivityChooserModel.HistoricalRecord {
    public final ComponentName activity;
    public final long time;
    public final float weight;

    public ActivityChooserModel.HistoricalRecord(ComponentName componentName0, long v, float f) {
        this.activity = componentName0;
        this.time = v;
        this.weight = f;
    }

    public ActivityChooserModel.HistoricalRecord(String s, long v, float f) {
        this(ComponentName.unflattenFromString(s), v, f);
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
        if(ActivityChooserModel.HistoricalRecord.class != class0) {
            return false;
        }
        ComponentName componentName0 = this.activity;
        if(componentName0 == null) {
            if(((ActivityChooserModel.HistoricalRecord)object0).activity != null) {
                return false;
            }
        }
        else if(!componentName0.equals(((ActivityChooserModel.HistoricalRecord)object0).activity)) {
            return false;
        }
        return this.time == ((ActivityChooserModel.HistoricalRecord)object0).time ? Float.floatToIntBits(this.weight) == Float.floatToIntBits(((ActivityChooserModel.HistoricalRecord)object0).weight) : false;
    }

    @Override
    public int hashCode() {
        return this.activity == null ? Float.floatToIntBits(this.weight) + (961 + ((int)(this.time ^ this.time >>> 0x20))) * 0x1F : Float.floatToIntBits(this.weight) + ((this.activity.hashCode() + 0x1F) * 0x1F + ((int)(this.time ^ this.time >>> 0x20))) * 0x1F;
    }

    @Override
    public String toString() {
        return "[; activity:" + this.activity + "; time:" + this.time + "; weight:" + new BigDecimal(((double)this.weight)) + "]";
    }
}

