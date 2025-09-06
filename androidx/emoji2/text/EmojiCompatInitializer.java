package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;

public class EmojiCompatInitializer implements Initializer {
    @NonNull
    public Boolean create(@NonNull Context context0) {
        j j0 = new j(new m(context0));  // 初始化器: Landroidx/emoji2/text/EmojiCompat$Config;-><init>(Landroidx/emoji2/text/EmojiCompat$MetadataRepoLoader;)V
        j0.setMetadataLoadStrategy(1);
        EmojiCompat.init(j0);
        Lifecycle lifecycle0 = ((LifecycleOwner)AppInitializer.getInstance(context0).initializeComponent(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle0.addObserver(new i(this, lifecycle0));
        return true;
    }

    @Override  // androidx.startup.Initializer
    @NonNull
    public Object create(@NonNull Context context0) {
        return this.create(context0);
    }

    @Override  // androidx.startup.Initializer
    @NonNull
    public List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}

