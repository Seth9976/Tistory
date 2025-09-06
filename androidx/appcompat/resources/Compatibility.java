package androidx.appcompat.resources;

import android.animation.ObjectAnimator;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.LIBRARY})
public final class Compatibility {
    @RequiresApi(15)
    public static class Api15Impl {
        @DoNotInline
        public static void getValueForDensity(@NonNull Resources resources0, int v, int v1, @NonNull TypedValue typedValue0, boolean z) {
            resources0.getValueForDensity(v, v1, typedValue0, z);
        }
    }

    @RequiresApi(18)
    public static class Api18Impl {
        @DoNotInline
        public static void setAutoCancel(@NonNull ObjectAnimator objectAnimator0, boolean z) {
            objectAnimator0.setAutoCancel(z);
        }
    }

    @RequiresApi(21)
    public static class Api21Impl {
        @DoNotInline
        @NonNull
        public static Drawable createFromXmlInner(@NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws IOException, XmlPullParserException {
            return Drawable.createFromXmlInner(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        }

        @DoNotInline
        public static int getChangingConfigurations(@NonNull TypedArray typedArray0) {
            return typedArray0.getChangingConfigurations();
        }

        @DoNotInline
        public static void inflate(@NonNull Drawable drawable0, @NonNull Resources resources0, @NonNull XmlPullParser xmlPullParser0, @NonNull AttributeSet attributeSet0, @Nullable Resources.Theme resources$Theme0) throws IOException, XmlPullParserException {
            drawable0.inflate(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
        }
    }

}

