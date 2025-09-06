package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001A\u00020\u00028\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000E¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/text/android/StaticLayoutFactoryDefault$Companion", "", "", "isInitialized", "Z", "Ljava/lang/reflect/Constructor;", "Landroid/text/StaticLayout;", "staticLayoutConstructor", "Ljava/lang/reflect/Constructor;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class StaticLayoutFactoryDefault.Companion {
    public StaticLayoutFactoryDefault.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public static final Constructor access$getStaticLayoutConstructor(StaticLayoutFactoryDefault.Companion staticLayoutFactoryDefault$Companion0) {
        staticLayoutFactoryDefault$Companion0.getClass();
        if(p.a) {
            return p.b;
        }
        try {
            p.a = true;
            p.b = StaticLayout.class.getConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
        }
        catch(NoSuchMethodException unused_ex) {
            p.b = null;
            Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
        }
        return p.b;
    }
}

