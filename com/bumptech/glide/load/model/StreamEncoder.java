package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamEncoder implements Encoder {
    public final ArrayPool a;

    public StreamEncoder(ArrayPool arrayPool0) {
        this.a = arrayPool0;
    }

    public boolean encode(@NonNull InputStream inputStream0, @NonNull File file0, @NonNull Options options0) {
        FileOutputStream fileOutputStream1;
        ArrayPool arrayPool0 = this.a;
        byte[] arr_b = (byte[])arrayPool0.get(0x10000, byte[].class);
        FileOutputStream fileOutputStream0 = null;
        try {
            fileOutputStream1 = new FileOutputStream(file0);
            goto label_7;
        }
        catch(IOException iOException0) {
            goto label_18;
            try {
                while(true) {
                label_7:
                    int v = inputStream0.read(arr_b);
                    if(v == -1) {
                        break;
                    }
                    fileOutputStream1.write(arr_b, 0, v);
                }
                fileOutputStream1.close();
                goto label_31;
            }
            catch(IOException iOException0) {
                fileOutputStream0 = fileOutputStream1;
            }
            catch(Throwable throwable0) {
                fileOutputStream0 = fileOutputStream1;
                goto label_27;
            }
            try {
            label_18:
                if(Log.isLoggable("StreamEncoder", 3)) {
                    Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", iOException0);
                }
            }
            catch(Throwable throwable0) {
                goto label_27;
            }
        }
        catch(Throwable throwable0) {
            goto label_27;
        }
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        arrayPool0.put(arr_b);
        return false;
    label_27:
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        arrayPool0.put(arr_b);
        throw throwable0;
        try {
        label_31:
            fileOutputStream1.close();
        }
        catch(IOException unused_ex) {
        }
        arrayPool0.put(arr_b);
        return true;
    }

    @Override  // com.bumptech.glide.load.Encoder
    public boolean encode(@NonNull Object object0, @NonNull File file0, @NonNull Options options0) {
        return this.encode(((InputStream)object0), file0, options0);
    }
}

