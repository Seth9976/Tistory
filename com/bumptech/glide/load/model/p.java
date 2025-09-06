package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.File;
import java.io.FileNotFoundException;
import jeb.synthetic.TWR;

public final class p implements DataFetcher {
    public final Context a;
    public final Uri b;
    public static final String[] c;

    static {
        p.c = new String[]{"_data"};
    }

    public p(Context context0, Uri uri0) {
        this.a = context0;
        this.b = uri0;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return File.class;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    @Override  // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(Priority priority0, DataCallback dataFetcher$DataCallback0) {
        Cursor cursor0 = this.a.getContentResolver().query(this.b, p.c, null, null, null);
        CharSequence charSequence0 = null;
        if(cursor0 != null) {
            try {
                if(cursor0.moveToFirst()) {
                    charSequence0 = cursor0.getString(cursor0.getColumnIndexOrThrow("_data"));
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
            cursor0.close();
        }
        if(TextUtils.isEmpty(charSequence0)) {
            dataFetcher$DataCallback0.onLoadFailed(new FileNotFoundException("Failed to find file path for: " + this.b));
            return;
        }
        dataFetcher$DataCallback0.onDataReady(new File(((String)charSequence0)));
    }
}

