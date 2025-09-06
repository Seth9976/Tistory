package lc;

import android.app.Application;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.text.DynamicLayout.Builder;
import android.text.DynamicLayout;
import android.view.View;
import s1.h;

public abstract class a {
    public static Bitmap a(ImageDecoder.Source imageDecoder$Source0) {
        return ImageDecoder.decodeBitmap(imageDecoder$Source0);
    }

    public static Bitmap b(h h0) {
        return Bitmap.createBitmap(h0);
    }

    public static ImageDecoder.Source c(ContentResolver contentResolver0, Uri uri0) {
        return ImageDecoder.createSource(contentResolver0, uri0);
    }

    public static DynamicLayout d(DynamicLayout.Builder dynamicLayout$Builder0) {
        return dynamicLayout$Builder0.build();
    }

    public static String e() {
        return Application.getProcessName();
    }

    public static void f(int v, View view0) {
        view0.setOutlineSpotShadowColor(v);
    }

    public static void g(View view0) {
        view0.resetPivot();
    }

    public static void h(int v, View view0) {
        view0.setOutlineAmbientShadowColor(v);
    }
}

