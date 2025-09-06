package coil.util;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.XmlRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001A\u0016\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001A\u00020\u0004H\u0000\u001A$\u0010\u0000\u001A\u00020\u0001*\u00020\u00052\b\b\u0001\u0010\u0003\u001A\u00020\u00042\f\u0010\u0006\u001A\b\u0018\u00010\u0007R\u00020\u0005H\u0000\u001A\u0010\u0010\b\u001A\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0002H\u0000\u001A\u001E\u0010\n\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00052\b\b\u0001\u0010\u0003\u001A\u00020\u0004H\u0000\u001A\u0014\u0010\f\u001A\u00020\r*\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u000FH\u0000\u001A\u001E\u0010\u0010\u001A\u0002H\u0011\"\n\b\u0000\u0010\u0011\u0018\u0001*\u00020\u0012*\u00020\u0002H\u0080\b¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"getDrawableCompat", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "resId", "", "Landroid/content/res/Resources;", "theme", "Landroid/content/res/Resources$Theme;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "getXmlDrawableCompat", "resources", "isPermissionGranted", "", "permission", "", "requireSystemService", "T", "", "(Landroid/content/Context;)Ljava/lang/Object;", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-Contexts")
@SourceDebugExtension({"SMAP\nContexts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Contexts.kt\ncoil/util/-Contexts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,83:1\n1#2:84\n31#3:85\n*S KotlinDebug\n*F\n+ 1 Contexts.kt\ncoil/util/-Contexts\n*L\n78#1:85\n*E\n"})
public final class -Contexts {
    @NotNull
    public static final Drawable getDrawableCompat(@NotNull Context context0, @DrawableRes int v) {
        Drawable drawable0 = AppCompatResources.getDrawable(context0, v);
        if(drawable0 == null) {
            throw new IllegalStateException(("Invalid resource ID: " + v).toString());
        }
        return drawable0;
    }

    @NotNull
    public static final Drawable getDrawableCompat(@NotNull Resources resources0, @DrawableRes int v, @Nullable Resources.Theme resources$Theme0) {
        Drawable drawable0 = ResourcesCompat.getDrawable(resources0, v, resources$Theme0);
        if(drawable0 == null) {
            throw new IllegalStateException(("Invalid resource ID: " + v).toString());
        }
        return drawable0;
    }

    @Nullable
    public static final Lifecycle getLifecycle(@Nullable Context context0) {
        while(true) {
            if(context0 instanceof LifecycleOwner) {
                return ((LifecycleOwner)context0).getLifecycle();
            }
            if(!(context0 instanceof ContextWrapper)) {
                return null;
            }
            context0 = ((ContextWrapper)context0).getBaseContext();
        }
    }

    @NotNull
    public static final Drawable getXmlDrawableCompat(@NotNull Context context0, @NotNull Resources resources0, @DrawableRes @XmlRes int v) {
        XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
        int v1;
        for(v1 = xmlResourceParser0.next(); v1 != 1 && v1 != 2; v1 = xmlResourceParser0.next()) {
        }
        if(v1 != 2) {
            throw new XmlPullParserException("No start tag found.");
        }
        return -Contexts.getDrawableCompat(resources0, v, context0.getTheme());
    }

    public static final boolean isPermissionGranted(@NotNull Context context0, @NotNull String s) {
        return ContextCompat.checkSelfPermission(context0, s) == 0;
    }

    public static final Object requireSystemService(Context context0) {
        Intrinsics.reifiedOperationMarker(4, "T");
        Object object0 = ContextCompat.getSystemService(context0, Object.class);
        Intrinsics.checkNotNull(object0);
        return object0;
    }
}

