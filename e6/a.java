package e6;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.model.stream.QMediaStoreUriLoader;
import java.io.File;

public abstract class a implements ModelLoaderFactory {
    public final Context a;
    public final Class b;

    public a(Context context0, Class class0) {
        this.a = context0;
        this.b = class0;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
    @NonNull
    public final ModelLoader build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory0) {
        ModelLoader modelLoader0 = multiModelLoaderFactory0.build(File.class, this.b);
        ModelLoader modelLoader1 = multiModelLoaderFactory0.build(Uri.class, this.b);
        return new QMediaStoreUriLoader(this.a, modelLoader0, modelLoader1, this.b);
    }

    @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
    public final void teardown() {
    }
}

