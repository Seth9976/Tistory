package androidx.compose.ui.platform;

import android.app.job.JobInfo.Builder;
import android.content.ClipData;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.LocationRequest;
import android.view.ContentInfo.Builder;
import android.view.ContentInfo;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.translation.ViewTranslationCallback;

public abstract class a {
    public static void A(View view0) {
        view0.clearViewTranslationCallback();
    }

    public static void B(View view0, ViewTranslationCallback viewTranslationCallback0) {
        view0.setViewTranslationCallback(viewTranslationCallback0);
    }

    public static LocationRequest d(Object object0) [...] // Inlined contents

    public static ContentInfo.Builder h(ClipData clipData0, int v) {
        return new ContentInfo.Builder(clipData0, v);
    }

    public static ContentInfo.Builder i(ContentInfo contentInfo0) {
        return new ContentInfo.Builder(contentInfo0);
    }

    public static ContentInfo k(Object object0) [...] // Inlined contents

    public static ScrollCaptureSession m(Object object0) [...] // Inlined contents

    public static ScrollCaptureTarget n(View view0, Rect rect0, Point point0, ScrollCaptureCallback scrollCaptureCallback0) {
        return new ScrollCaptureTarget(view0, rect0, point0, scrollCaptureCallback0);
    }

    public static void p() {
    }

    public static void r(JobInfo.Builder jobInfo$Builder0) {
        jobInfo$Builder0.setExpedited(true);
    }
}

