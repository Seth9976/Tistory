package e6;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.io.FileNotFoundException;

public final class b implements DataFetcher {
    public final Context a;
    public final ModelLoader b;
    public final ModelLoader c;
    public final Uri d;
    public final int e;
    public final int f;
    public final Options g;
    public final Class h;
    public volatile boolean i;
    public volatile DataFetcher j;
    public static final String[] k;

    static {
        b.k = new String[]{"_data"};
    }

    public b(Context context0, ModelLoader modelLoader0, ModelLoader modelLoader1, Uri uri0, int v, int v1, Options options0, Class class0) {
        this.a = context0.getApplicationContext();
        this.b = modelLoader0;
        this.c = modelLoader1;
        this.d = uri0;
        this.e = v;
        this.f = v1;
        this.g = options0;
        this.h = class0;
    }

    public final DataFetcher a() {
        LoadData modelLoader$LoadData0;
        File file0;
        Cursor cursor0;
        Uri uri0;
        boolean z = Environment.isExternalStorageLegacy();
        DataFetcher dataFetcher0 = null;
        Options options0 = this.g;
        int v = this.f;
        int v1 = this.e;
        Context context0 = this.a;
        if(z) {
            try {
                uri0 = this.d;
                cursor0 = context0.getContentResolver().query(uri0, b.k, null, null, null);
            }
            catch(Throwable throwable0) {
                goto label_24;
            }
            if(cursor0 != null) {
                try {
                    if(!cursor0.moveToFirst()) {
                        throw new FileNotFoundException("Failed to media store entry for: " + uri0);
                    }
                    String s = cursor0.getString(cursor0.getColumnIndexOrThrow("_data"));
                    if(TextUtils.isEmpty(s)) {
                        throw new FileNotFoundException("File path was empty in media store for: " + uri0);
                    }
                    file0 = new File(s);
                }
                catch(Throwable throwable0) {
                    goto label_23;
                }
                cursor0.close();
                modelLoader$LoadData0 = this.b.buildLoadData(file0, v1, v, options0);
                return modelLoader$LoadData0 == null ? null : modelLoader$LoadData0.fetcher;
            }
            try {
                throw new FileNotFoundException("Failed to media store entry for: " + uri0);
            }
            catch(Throwable throwable0) {
            label_23:
                dataFetcher0 = cursor0;
            }
        label_24:
            if(dataFetcher0 != null) {
                ((Cursor)dataFetcher0).close();
            }
            throw throwable0;
        }
        Uri uri1 = context0.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.d) : this.d;
        modelLoader$LoadData0 = this.c.buildLoadData(uri1, v1, v, options0);
        return modelLoader$LoadData0 == null ? null : modelLoader$LoadData0.fetcher;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        this.i = true;
        DataFetcher dataFetcher0 = this.j;
        if(dataFetcher0 != null) {
            dataFetcher0.cancel();
        }
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        DataFetcher dataFetcher0 = this.j;
        if(dataFetcher0 != null) {
            dataFetcher0.cleanup();
        }
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return this.h;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(Priority priority0, DataCallback dataFetcher$DataCallback0) {
        try {
            DataFetcher dataFetcher0 = this.a();
            if(dataFetcher0 == null) {
                dataFetcher$DataCallback0.onLoadFailed(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
                return;
            }
            this.j = dataFetcher0;
            if(this.i) {
                this.cancel();
                return;
            }
            dataFetcher0.loadData(priority0, dataFetcher$DataCallback0);
            return;
        }
        catch(FileNotFoundException fileNotFoundException0) {
        }
        dataFetcher$DataCallback0.onLoadFailed(fileNotFoundException0);
    }
}

