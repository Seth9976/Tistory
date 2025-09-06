package androidx.compose.ui.text;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.Editable;
import androidx.arch.core.util.Function;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.core.splashscreen.SplashScreen.KeepOnScreenCondition;
import androidx.work.impl.model.WorkSpec.WorkInfoPojo;
import coil.EventListener.Factory;
import coil.EventListener;
import coil.request.ImageRequest;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator;
import com.google.android.material.textfield.TextInputLayout.LengthCounter;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.inject.Deferred.DeferredHandler;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;

public final class n0 implements Function, DoubleFunction, TextInclusionStrategy, VisualTransformation, Interpolator, KeepOnScreenCondition, Factory, Transformer, TransportScheduleCallback, Continuation, CornerSizeUnaryOperator, LengthCounter, ComponentRegistrarProcessor, DeferredHandler, VersionExtractor {
    public final int a;

    public n0(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.material.shape.ShapeAppearanceModel$CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize0) {
        return cornerSize0 instanceof AbsoluteCornerSize ? ClampedCornerSize.createFromCornerSize(((AbsoluteCornerSize)cornerSize0)) : cornerSize0;
    }

    @Override  // androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public Object apply(Object object0) {
        switch(this.a) {
            case 10: {
                if(((List)object0) != null) {
                    ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(((List)object0), 10));
                    for(Object object1: ((List)object0)) {
                        arrayList0.add(((WorkInfoPojo)object1).toWorkInfo());
                    }
                    return arrayList0;
                }
                return null;
            }
            case 11: {
                return ((Long)object0) == null ? 0L : ((long)(((Long)object0)));
            }
            default: {
                return ((MessagingClientEventExtension)object0).toByteArray();
            }
        }
    }

    @Override  // com.google.android.material.textfield.TextInputLayout$LengthCounter
    public int countLength(Editable editable0) {
        return editable0 == null ? 0 : editable0.length();
    }

    @Override  // coil.EventListener$Factory
    public EventListener create(ImageRequest imageRequest0) {
        return EventListener.NONE;
    }

    @Override  // com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor
    public String extract(Object object0) {
        switch(this.a) {
            case 21: {
                return ((Context)object0).getApplicationInfo() == null ? "" : "35";
            }
            case 22: {
                ApplicationInfo applicationInfo0 = ((Context)object0).getApplicationInfo();
                return applicationInfo0 == null ? "" : String.valueOf(applicationInfo0.minSdkVersion);
            }
            case 23: {
                if(((Context)object0).getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if(((Context)object0).getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if(((Context)object0).getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return ((Context)object0).getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
            default: {
                String s = ((Context)object0).getPackageManager().getInstallerPackageName("net.daum.android.tistoryapp");
                return s == null ? "" : FirebaseCommonRegistrar.a(s);
            }
        }
    }

    @Override  // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString annotatedString0) {
        return new TransformedText(annotatedString0, OffsetMapping.Companion.getIdentity());
    }

    @Override  // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        switch(this.a) {
            case 3: {
                return (float)Easing.getInterpolator("standard").get(((double)f));
            }
            case 4: {
                return (float)Easing.getInterpolator("accelerate").get(((double)f));
            }
            case 5: {
                return (float)Easing.getInterpolator("decelerate").get(((double)f));
            }
            case 6: {
                return (float)Easing.getInterpolator("linear").get(((double)f));
            }
            case 7: {
                return (float)Easing.getInterpolator("anticipate").get(((double)f));
            }
            case 8: {
                return (float)Easing.getInterpolator("overshoot").get(((double)f));
            }
            default: {
                return (float)Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(((double)f));
            }
        }
    }

    @Override  // com.google.firebase.inject.Deferred$DeferredHandler
    public void handle(Provider provider0) {
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double f) {
        switch(this.a) {
            case 26: {
                return ColorSpaceKt.absRcpResponse(f, 0.947867, 0.052133, 0.077399, 0.04045, 2.4);
            }
            case 27: {
                return ColorSpaceKt.absResponse(f, 0.947867, 0.052133, 0.077399, 0.04045, 2.4);
            }
            default: {
                return f;
            }
        }
    }

    @Override  // androidx.compose.ui.text.TextInclusionStrategy
    public boolean isIncluded(Rect rect0, Rect rect1) {
        switch(this.a) {
            case 0: {
                return rect0.overlaps(rect1);
            }
            case 1: {
                return !rect1.isEmpty() && rect0.getLeft() >= rect1.getLeft() && rect0.getRight() <= rect1.getRight() && rect0.getTop() >= rect1.getTop() && rect0.getBottom() <= rect1.getBottom();
            }
            default: {
                return rect1.contains-k-4lQ0M(rect0.getCenter-F1C5BW0());
            }
        }
    }

    @Override  // com.google.android.datatransport.TransportScheduleCallback
    public void onSchedule(Exception exception0) {
    }

    @Override  // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar0) {
        return componentRegistrar0.getComponents();
    }

    @Override  // androidx.core.splashscreen.SplashScreen$KeepOnScreenCondition
    public boolean shouldKeepOnScreen() {
        return false;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public Object then(Task task0) {
        return 403;
    }
}

