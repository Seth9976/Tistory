package androidx.print;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.net.Uri;
import android.print.PrintAttributes.Builder;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class PrintHelper {
    public interface OnPrintFinishCallback {
        void onFinish();
    }

    @SuppressLint({"InlinedApi"})
    public static final int COLOR_MODE_COLOR = 2;
    @SuppressLint({"InlinedApi"})
    public static final int COLOR_MODE_MONOCHROME = 1;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    public final Context a;
    public BitmapFactory.Options b;
    public final Object c;
    public int d;
    public int e;
    public int f;

    public PrintHelper(@NonNull Context context0) {
        this.b = null;
        this.c = new Object();
        this.d = 2;
        this.e = 2;
        this.f = 1;
        this.a = context0;
    }

    public static Bitmap a(Bitmap bitmap0, int v) {
        if(v != 1) {
            return bitmap0;
        }
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap0.getWidth(), bitmap0.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap1);
        Paint paint0 = new Paint();
        ColorMatrix colorMatrix0 = new ColorMatrix();
        colorMatrix0.setSaturation(0.0f);
        paint0.setColorFilter(new ColorMatrixColorFilter(colorMatrix0));
        canvas0.drawBitmap(bitmap0, 0.0f, 0.0f, paint0);
        canvas0.setBitmap(null);
        return bitmap1;
    }

    public final Bitmap b(Uri uri0, BitmapFactory.Options bitmapFactory$Options0) {
        Bitmap bitmap0;
        InputStream inputStream0;
        if(uri0 != null) {
            Context context0 = this.a;
            if(context0 != null) {
                try {
                    inputStream0 = null;
                    inputStream0 = context0.getContentResolver().openInputStream(uri0);
                    bitmap0 = BitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options0);
                }
                catch(Throwable throwable0) {
                    if(inputStream0 != null) {
                        try {
                            inputStream0.close();
                        }
                        catch(IOException iOException0) {
                            Log.w("PrintHelper", "close fail ", iOException0);
                        }
                    }
                    throw throwable0;
                }
                if(inputStream0 != null) {
                    try {
                        inputStream0.close();
                        return bitmap0;
                    }
                    catch(IOException iOException1) {
                        Log.w("PrintHelper", "close fail ", iOException1);
                    }
                }
                return bitmap0;
            }
        }
        throw new IllegalArgumentException("bad argument to loadBitmap");
    }

    public final Bitmap c(Uri uri0) {
        BitmapFactory.Options bitmapFactory$Options1;
        if(uri0 == null || this.a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        this.b(uri0, bitmapFactory$Options0);
        int v = bitmapFactory$Options0.outWidth;
        int v1 = bitmapFactory$Options0.outHeight;
        if(v > 0 && v1 > 0) {
            int v2 = Math.max(v, v1);
            int v3;
            for(v3 = 1; v2 > 3500; v3 <<= 1) {
                v2 >>>= 1;
            }
            if(v3 > 0 && Math.min(v, v1) / v3 > 0) {
                synchronized(this.c) {
                    bitmapFactory$Options1 = new BitmapFactory.Options();
                    this.b = bitmapFactory$Options1;
                    bitmapFactory$Options1.inMutable = true;
                    bitmapFactory$Options1.inSampleSize = v3;
                }
                try {
                    return this.b(uri0, bitmapFactory$Options1);
                }
                finally {
                    synchronized(this.c) {
                        this.b = null;
                    }
                }
            }
        }
        return null;
    }

    public int getColorMode() {
        return this.e;
    }

    public int getOrientation() {
        return this.f == 0 ? 1 : this.f;
    }

    public int getScaleMode() {
        return this.d;
    }

    public void printBitmap(@NonNull String s, @NonNull Bitmap bitmap0) {
        this.printBitmap(s, bitmap0, null);
    }

    public void printBitmap(@NonNull String s, @NonNull Bitmap bitmap0, @Nullable OnPrintFinishCallback printHelper$OnPrintFinishCallback0) {
        if(bitmap0 == null) {
            return;
        }
        PrintManager printManager0 = (PrintManager)this.a.getSystemService("print");
        PrintAttributes.MediaSize printAttributes$MediaSize0 = bitmap0.getWidth() > bitmap0.getHeight() ? PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE : PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
        PrintAttributes printAttributes0 = new PrintAttributes.Builder().setMediaSize(printAttributes$MediaSize0).setColorMode(this.e).build();
        printManager0.print(s, new a(this, s, this.d, bitmap0, printHelper$OnPrintFinishCallback0), printAttributes0);
    }

    public void printBitmap(@NonNull String s, @NonNull Uri uri0) throws FileNotFoundException {
        this.printBitmap(s, uri0, null);
    }

    public void printBitmap(@NonNull String s, @NonNull Uri uri0, @Nullable OnPrintFinishCallback printHelper$OnPrintFinishCallback0) throws FileNotFoundException {
        b b0 = new b(this, s, uri0, printHelper$OnPrintFinishCallback0, this.d);
        PrintManager printManager0 = (PrintManager)this.a.getSystemService("print");
        PrintAttributes.Builder printAttributes$Builder0 = new PrintAttributes.Builder();
        printAttributes$Builder0.setColorMode(this.e);
        int v = this.f;
        if(v == 0 || v == 1) {
            printAttributes$Builder0.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        }
        else if(v == 2) {
            printAttributes$Builder0.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager0.print(s, b0, printAttributes$Builder0.build());
    }

    public void setColorMode(int v) {
        this.e = v;
    }

    public void setOrientation(int v) {
        this.f = v;
    }

    public void setScaleMode(int v) {
        this.d = v;
    }

    public static boolean systemSupportsPrint() {
        return true;
    }
}

