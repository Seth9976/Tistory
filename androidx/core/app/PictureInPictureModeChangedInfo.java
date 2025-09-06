package androidx.core.app;

import android.content.res.Configuration;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u0003\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\u00068G¢\u0006\u0006\u001A\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"Landroidx/core/app/PictureInPictureModeChangedInfo;", "", "", "isInPictureInPictureMode", "<init>", "(Z)V", "Landroid/content/res/Configuration;", "newConfig", "(ZLandroid/content/res/Configuration;)V", "a", "Z", "()Z", "getNewConfig", "()Landroid/content/res/Configuration;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PictureInPictureModeChangedInfo {
    public final boolean a;
    public final Configuration b;

    public PictureInPictureModeChangedInfo(boolean z) {
        this.a = z;
    }

    @RequiresApi(26)
    public PictureInPictureModeChangedInfo(boolean z, @NotNull Configuration configuration0) {
        Intrinsics.checkNotNullParameter(configuration0, "newConfig");
        this(z);
        this.b = configuration0;
    }

    @RequiresApi(26)
    @NotNull
    public final Configuration getNewConfig() {
        Configuration configuration0 = this.b;
        if(configuration0 == null) {
            throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
        }
        return configuration0;
    }

    public final boolean isInPictureInPictureMode() {
        return this.a;
    }
}

