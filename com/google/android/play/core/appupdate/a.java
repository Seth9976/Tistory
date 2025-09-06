package com.google.android.play.core.appupdate;

import i8.j;

public final class a extends Builder {
    public int a;
    public boolean b;
    public byte c;

    @Override  // com.google.android.play.core.appupdate.AppUpdateOptions$Builder
    public final AppUpdateOptions build() {
        if(this.c != 3) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.c & 1) == 0) {
                stringBuilder0.append(" appUpdateType");
            }
            if((this.c & 2) == 0) {
                stringBuilder0.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new j(this.a, this.b);
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateOptions$Builder
    public final Builder setAllowAssetPackDeletion(boolean z) {
        this.b = z;
        this.c = (byte)(this.c | 2);
        return this;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateOptions$Builder
    public final Builder setAppUpdateType(int v) {
        this.a = v;
        this.c = (byte)(this.c | 1);
        return this;
    }
}

