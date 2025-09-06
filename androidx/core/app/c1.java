package androidx.core.app;

import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import androidx.annotation.DoNotInline;

public abstract class c1 {
    @DoNotInline
    public static AudioAttributes a(AudioAttributes.Builder audioAttributes$Builder0) {
        return audioAttributes$Builder0.build();
    }

    @DoNotInline
    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    @DoNotInline
    public static AudioAttributes.Builder c(AudioAttributes.Builder audioAttributes$Builder0, int v) {
        return audioAttributes$Builder0.setContentType(v);
    }

    @DoNotInline
    public static AudioAttributes.Builder d(AudioAttributes.Builder audioAttributes$Builder0, int v) {
        return audioAttributes$Builder0.setLegacyStreamType(v);
    }

    @DoNotInline
    public static AudioAttributes.Builder e(AudioAttributes.Builder audioAttributes$Builder0, int v) {
        return audioAttributes$Builder0.setUsage(v);
    }
}

