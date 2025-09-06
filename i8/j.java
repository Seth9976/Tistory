package i8;

import com.google.android.play.core.appupdate.AppUpdateOptions;

public final class j extends AppUpdateOptions {
    public final int a;
    public final boolean b;

    public j(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateOptions
    public final boolean allowAssetPackDeletion() {
        return this.b;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateOptions
    public final int appUpdateType() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof AppUpdateOptions) {
            int v = ((AppUpdateOptions)object0).appUpdateType();
            if(this.a == v) {
                boolean z = ((AppUpdateOptions)object0).allowAssetPackDeletion();
                return this.b == z;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a ^ 1000003;
        return this.b ? v * 1000003 ^ 0x4CF : v * 1000003 ^ 0x4D5;
    }

    @Override
    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.a + ", allowAssetPackDeletion=" + this.b + "}";
    }
}

