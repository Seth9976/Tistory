package androidx.activity;

import android.app.Person;
import android.os.Parcelable;
import android.text.PrecomputedText.Params.Builder;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.WindowManager.LayoutParams;

public abstract class p {
    public static void D(WindowManager.LayoutParams windowManager$LayoutParams0) {
        windowManager$LayoutParams0.layoutInDisplayCutoutMode = 3;
    }

    public static Person e(Parcelable parcelable0) {
        return (Person)parcelable0;
    }

    public static Person f(Object object0) [...] // Inlined contents

    public static PrecomputedText.Params.Builder k(TextPaint textPaint0) {
        return new PrecomputedText.Params.Builder(textPaint0);
    }

    public static PrecomputedText n(Object object0) [...] // Inlined contents

    public static void w(WindowManager.LayoutParams windowManager$LayoutParams0) {
        windowManager$LayoutParams0.layoutInDisplayCutoutMode = 1;
    }

    public static boolean y(Object object0) {
        return object0 instanceof PrecomputedText;
    }
}

