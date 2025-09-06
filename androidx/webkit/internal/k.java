package androidx.webkit.internal;

import android.app.NotificationManager;
import android.app.Person;
import android.content.LocusId;
import android.content.pm.ShortcutInfo.Builder;
import android.content.pm.ShortcutInfo;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.os.Trace;
import android.text.TextPaint;
import android.view.Window;
import android.view.WindowInsets.Builder;
import android.view.WindowInsets;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inspector.InspectionCompanion.UninitializedPropertyMapException;
import android.view.inspector.PropertyMapper;
import android.webkit.WebViewRenderProcess;

public abstract class k {
    public static BlendMode A() {
        return BlendMode.COLOR_BURN;
    }

    public static void B(NotificationManager notificationManager0) {
        notificationManager0.setNotificationDelegate(null);
    }

    public static BlendMode D() {
        return BlendMode.SRC;
    }

    public static int a(BlendMode blendMode0) [...] // 潜在的解密器

    public static int b(TextPaint textPaint0, CharSequence charSequence0, int v, int v1) {
        return textPaint0.getTextRunCursor(charSequence0, 0, v, false, v1, 2);
    }

    public static int d(PropertyMapper propertyMapper0, int v) {
        return propertyMapper0.mapInt("iconPadding", v);
    }

    public static LocusId e(ShortcutInfo shortcutInfo0) {
        return shortcutInfo0.getLocusId();
    }

    public static BlendMode f() {
        return BlendMode.COLOR_DODGE;
    }

    public static WindowInsets.Builder j() {
        return new WindowInsets.Builder();
    }

    public static WindowInsets k(WindowInsets.Builder windowInsets$Builder0) {
        return windowInsets$Builder0.build();
    }

    public static ContentCaptureSession l(Object object0) [...] // Inlined contents

    public static InspectionCompanion.UninitializedPropertyMapException m() {
        return new InspectionCompanion.UninitializedPropertyMapException();
    }

    public static WebViewRenderProcess n(Object object0) {
        return (WebViewRenderProcess)object0;
    }

    public static void p(NotificationManager notificationManager0) {
        notificationManager0.setNotificationDelegate("com.google.android.gms");
    }

    public static void q(ShortcutInfo.Builder shortcutInfo$Builder0, LocusId locusId0) {
        shortcutInfo$Builder0.setLocusId(locusId0);
    }

    public static void r(ShortcutInfo.Builder shortcutInfo$Builder0, boolean z) {
        shortcutInfo$Builder0.setLongLived(z);
    }

    public static void s(ShortcutInfo.Builder shortcutInfo$Builder0, Person[] arr_person) {
        shortcutInfo$Builder0.setPersons(arr_person);
    }

    public static void t(Canvas canvas0, BlendMode blendMode0) {
        canvas0.drawColor(0, blendMode0);
    }

    public static void u(Window window0) {
        window0.setNavigationBarContrastEnforced(false);
    }

    public static void v(Window window0, boolean z) {
        window0.setStatusBarContrastEnforced(z);
    }

    public static boolean x() {
        return Trace.isEnabled();
    }

    public static int z(TextPaint textPaint0, CharSequence charSequence0, int v, int v1) {
        return textPaint0.getTextRunCursor(charSequence0, 0, v, false, v1, 0);
    }
}

