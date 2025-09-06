package androidx.appcompat.view.menu;

import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences.Editor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewOverlay;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.w;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.room.EmptyResultSetException;
import coil.compose.AsyncImagePainter.updateRequest.2.1.size..inlined.mapNotNull.1;
import coil.compose.AsyncImagePainter;
import coil.size.SizeResolver;
import com.bumptech.glide.manager.RequestManagerFragment;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.animation.TransformationCallback;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.internal.bind.TreeTypeAdapter;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.k;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import r0.a;
import retrofit2.Converter;
import t8.d;

public class f implements MenuItemHoverListener, DifferentialMotionFlingTarget, OnApplyWindowInsetsListener, SizeResolver, RequestManagerTreeNode, zaj, OnFailureListener, SuccessContinuation, TransformationCallback, ViewOverlayImpl, ShadowViewDelegate, IntentSenderForResultStarter, DataEncoder, JsonDeserializationContext, JsonSerializationContext, SingleOnSubscribe, BiConsumer, Predicate, Neighbors, Converter {
    public final int a;
    public Object b;

    public f(int v) {
        this.a = v;
        switch(v) {
            case 14: {
                super();
                return;
            }
            case 25: {
                super();
                this.b = new Stack();
                return;
            }
            default: {
                super();
                this.b = new ArrayDeque();
            }
        }
    }

    public f(View view0) {
        this.a = 17;
        super();
        this.b = view0.getOverlay();
    }

    public f(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    public f(byte[] arr_b, int v) {
        this.a = 7;
        super();
        this.b = (ByteBuffer)ByteBuffer.wrap(arr_b).order(ByteOrder.BIG_ENDIAN).limit(v);
    }

    @Override  // io.reactivex.functions.BiConsumer
    public void accept(Object object0, Object object1) {
        ((Map)object0).put(((Function)this.b).apply(object1), object1);
    }

    @Override  // com.google.android.material.internal.ViewOverlayImpl
    public void add(Drawable drawable0) {
        ((ViewOverlay)this.b).add(drawable0);
    }

    public void c(ByteString byteString0) {
        if(byteString0.isBalanced()) {
            int[] arr_v = k.g;
            int v = Arrays.binarySearch(arr_v, byteString0.size());
            if(v < 0) {
                v = -(v + 1) - 1;
            }
            int v1 = arr_v[v + 1];
            Stack stack0 = (Stack)this.b;
            if(!stack0.isEmpty() && ((ByteString)stack0.peek()).size() < v1) {
                int v2 = arr_v[v];
                ByteString byteString1;
                for(byteString1 = (ByteString)stack0.pop(); !stack0.isEmpty() && ((ByteString)stack0.peek()).size() < v2; byteString1 = new k(((ByteString)stack0.pop()), byteString1)) {
                }
                k k0;
                for(k0 = new k(byteString1, byteString0); !stack0.isEmpty(); k0 = new k(((ByteString)stack0.pop()), k0)) {
                    int[] arr_v1 = k.g;
                    int v3 = Arrays.binarySearch(arr_v1, k0.a);
                    if(v3 < 0) {
                        v3 = -(v3 + 1) - 1;
                    }
                    int v4 = arr_v1[v3 + 1];
                    if(((ByteString)stack0.peek()).size() >= v4) {
                        break;
                    }
                }
                stack0.push(k0);
                return;
            }
            stack0.push(byteString0);
            return;
        }
        if(byteString0 instanceof k) {
            this.c(((k)byteString0).b);
            this.c(((k)byteString0).c);
            return;
        }
        String s = String.valueOf(byteString0.getClass());
        throw new IllegalArgumentException(a.o(new StringBuilder(s.length() + 49), "Has a new type of ByteString been created? Found ", s));
    }

    @Override  // retrofit2.Converter
    public Object convert(Object object0) {
        return Optional.ofNullable(((Converter)this.b).convert(((ResponseBody)object0)));
    }

    public short d(int v) {
        ByteBuffer byteBuffer0 = (ByteBuffer)this.b;
        return byteBuffer0.remaining() - v >= 2 ? byteBuffer0.getShort(v) : -1;
    }

    @Override  // com.google.gson.JsonDeserializationContext
    public Object deserialize(JsonElement jsonElement0, Type type0) {
        return ((TreeTypeAdapter)this.b).c.fromJson(jsonElement0, type0);
    }

    public void e() {
        View view0 = (View)this.b;
        if(view0 != null) {
            ((InputMethodManager)view0.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view0.getWindowToken(), 0);
        }
    }

    @Override  // com.google.firebase.encoders.DataEncoder
    public String encode(Object object0) {
        StringWriter stringWriter0 = new StringWriter();
        try {
            this.encode(object0, stringWriter0);
        }
        catch(IOException unused_ex) {
        }
        return stringWriter0.toString();
    }

    @Override  // com.google.firebase.encoders.DataEncoder
    public void encode(Object object0, Writer writer0) {
        d d0 = new d(writer0, ((JsonDataEncoderBuilder)this.b).a, ((JsonDataEncoderBuilder)this.b).b, ((JsonDataEncoderBuilder)this.b).c, ((JsonDataEncoderBuilder)this.b).d);
        d0.b(object0, false);
        d0.c();
        d0.c.flush();
    }

    public void f() {
        View view1;
        View view0 = (View)this.b;
        if(view0 == null) {
            return;
        }
        if(view0.isInEditMode() || view0.onCheckIsTextEditor()) {
            view0.requestFocus();
            view1 = view0;
        }
        else {
            view1 = view0.getRootView().findFocus();
        }
        if(view1 == null) {
            view1 = view0.getRootView().findViewById(0x1020002);
        }
        if(view1 != null && view1.hasWindowFocus()) {
            view1.post(new w(0, view1));
        }
    }

    @Override  // com.bumptech.glide.manager.RequestManagerTreeNode
    public Set getDescendants() {
        if(this.a != 8) {
            Set set0 = ((SupportRequestManagerFragment)this.b).h();
            Set set1 = new HashSet(set0.size());
            for(Object object0: set0) {
                SupportRequestManagerFragment supportRequestManagerFragment0 = (SupportRequestManagerFragment)object0;
                if(supportRequestManagerFragment0.getRequestManager() != null) {
                    ((HashSet)set1).add(supportRequestManagerFragment0.getRequestManager());
                }
            }
            return set1;
        }
        Set set2 = ((RequestManagerFragment)this.b).a();
        Set set3 = new HashSet(set2.size());
        for(Object object1: set2) {
            RequestManagerFragment requestManagerFragment0 = (RequestManagerFragment)object1;
            if(requestManagerFragment0.getRequestManager() != null) {
                ((HashSet)set3).add(requestManagerFragment0.getRequestManager());
            }
        }
        return set3;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$Neighbors
    public Iterable getNeighbors(Object object0) {
        if(this.a != 20) {
            JvmBuiltInsCustomizer jvmBuiltInsCustomizer0 = (JvmBuiltInsCustomizer)this.b;
            Intrinsics.checkNotNullParameter(jvmBuiltInsCustomizer0, "this$0");
            Collection collection0 = ((ClassDescriptor)object0).getTypeConstructor().getSupertypes();
            Intrinsics.checkNotNullExpressionValue(collection0, "it.typeConstructor.supertypes");
            Iterable iterable0 = new ArrayList();
            for(Object object1: collection0) {
                ClassifierDescriptor classifierDescriptor0 = ((KotlinType)object1).getConstructor().getDeclarationDescriptor();
                LazyJavaClassDescriptor lazyJavaClassDescriptor0 = null;
                ClassifierDescriptor classifierDescriptor1 = classifierDescriptor0 == null ? null : classifierDescriptor0.getOriginal();
                ClassDescriptor classDescriptor0 = classifierDescriptor1 instanceof ClassDescriptor ? ((ClassDescriptor)classifierDescriptor1) : null;
                if(classDescriptor0 != null) {
                    lazyJavaClassDescriptor0 = jvmBuiltInsCustomizer0.a(classDescriptor0);
                }
                if(lazyJavaClassDescriptor0 != null) {
                    ((ArrayList)iterable0).add(lazyJavaClassDescriptor0);
                }
            }
            return iterable0;
        }
        de.d d0 = (de.d)this.b;
        Intrinsics.checkNotNullParameter(d0, "$tmp0");
        return (Iterable)d0.invoke(((KClass)object0));
    }

    @Override  // com.google.android.material.shadow.ShadowViewDelegate
    public float getRadius() {
        return ((float)((FloatingActionButton)this.b).getSizeDimension()) / 2.0f;
    }

    @Override  // androidx.core.view.DifferentialMotionFlingTarget
    public float getScaledScrollFactor() {
        return -((NestedScrollView)this.b).getVerticalScrollFactorCompat();
    }

    @Override  // com.google.android.material.shadow.ShadowViewDelegate
    public boolean isCompatPaddingEnabled() {
        return ((FloatingActionButton)this.b).k;
    }

    @Override  // com.google.android.gms.common.internal.zaj
    public boolean isConnected() {
        return ((zabe)this.b).isConnected();
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view0, WindowInsetsCompat windowInsetsCompat0) {
        switch(this.a) {
            case 11: {
                AppBarLayout appBarLayout0 = (AppBarLayout)this.b;
                appBarLayout0.getClass();
                WindowInsetsCompat windowInsetsCompat1 = ViewCompat.getFitsSystemWindows(appBarLayout0) ? windowInsetsCompat0 : null;
                if(!ObjectsCompat.equals(appBarLayout0.g, windowInsetsCompat1)) {
                    appBarLayout0.g = windowInsetsCompat1;
                    appBarLayout0.setWillNotDraw(((boolean)((appBarLayout0.v == null || appBarLayout0.getTopInset() <= 0 ? 0 : 1) ^ 1)));
                    appBarLayout0.requestLayout();
                }
                return windowInsetsCompat0;
            }
            case 12: {
                CollapsingToolbarLayout collapsingToolbarLayout0 = (CollapsingToolbarLayout)this.b;
                collapsingToolbarLayout0.getClass();
                WindowInsetsCompat windowInsetsCompat2 = ViewCompat.getFitsSystemWindows(collapsingToolbarLayout0) ? windowInsetsCompat0 : null;
                if(!ObjectsCompat.equals(collapsingToolbarLayout0.A, windowInsetsCompat2)) {
                    collapsingToolbarLayout0.A = windowInsetsCompat2;
                    collapsingToolbarLayout0.requestLayout();
                }
                return windowInsetsCompat0.consumeSystemWindowInsets();
            }
            default: {
                ScrimInsetsFrameLayout scrimInsetsFrameLayout0 = (ScrimInsetsFrameLayout)this.b;
                if(scrimInsetsFrameLayout0.b == null) {
                    scrimInsetsFrameLayout0.b = new Rect();
                }
                scrimInsetsFrameLayout0.b.set(windowInsetsCompat0.getSystemWindowInsetLeft(), windowInsetsCompat0.getSystemWindowInsetTop(), windowInsetsCompat0.getSystemWindowInsetRight(), windowInsetsCompat0.getSystemWindowInsetBottom());
                scrimInsetsFrameLayout0.onInsetsChanged(windowInsetsCompat0);
                scrimInsetsFrameLayout0.setWillNotDraw(!windowInsetsCompat0.hasSystemWindowInsets() || scrimInsetsFrameLayout0.a == null);
                ViewCompat.postInvalidateOnAnimation(scrimInsetsFrameLayout0);
                return windowInsetsCompat0.consumeSystemWindowInsets();
            }
        }
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception0) {
        Intrinsics.checkNotNullParameter(exception0, "exception");
        ((ProducerScope)this.b).close(exception0);
    }

    @Override  // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverEnter(MenuBuilder menuBuilder0, MenuItem menuItem0) {
        h h0 = (h)this.b;
        g g0 = null;
        h0.g.removeCallbacksAndMessages(null);
        ArrayList arrayList0 = h0.i;
        int v = arrayList0.size();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(menuBuilder0 == ((g)arrayList0.get(v1)).b) {
                break;
            }
        }
        if(v1 == -1) {
            return;
        }
        if(v1 + 1 < arrayList0.size()) {
            g0 = (g)arrayList0.get(v1 + 1);
        }
        e e0 = new e(0, this, g0, menuItem0, menuBuilder0);
        long v2 = SystemClock.uptimeMillis();
        h0.g.postAtTime(e0, menuBuilder0, v2 + 200L);
    }

    @Override  // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverExit(MenuBuilder menuBuilder0, MenuItem menuItem0) {
        ((h)this.b).g.removeCallbacksAndMessages(menuBuilder0);
    }

    @Override  // com.google.android.material.animation.TransformationCallback
    public void onScaleChanged(View view0) {
        BottomAppBar bottomAppBar0 = (BottomAppBar)this.b;
        float f = ((FloatingActionButton)view0).getVisibility() != 0 || bottomAppBar0.j0 != 1 ? 0.0f : ((FloatingActionButton)view0).getScaleY();
        bottomAppBar0.e0.setInterpolation(f);
    }

    @Override  // com.google.android.material.animation.TransformationCallback
    public void onTranslationChanged(View view0) {
        BottomAppBar bottomAppBar0 = (BottomAppBar)this.b;
        if(bottomAppBar0.j0 == 1) {
            float f = ((FloatingActionButton)view0).getTranslationX();
            MaterialShapeDrawable materialShapeDrawable0 = bottomAppBar0.e0;
            if(Float.compare(bottomAppBar0.getTopEdgeTreatment().getHorizontalOffset(), f) != 0) {
                bottomAppBar0.getTopEdgeTreatment().e = f;
                materialShapeDrawable0.invalidateSelf();
            }
            float f1 = 0.0f;
            float f2 = Math.max(0.0f, -((FloatingActionButton)view0).getTranslationY());
            if(bottomAppBar0.getTopEdgeTreatment().d != f2) {
                bottomAppBar0.getTopEdgeTreatment().b(f2);
                materialShapeDrawable0.invalidateSelf();
            }
            if(((FloatingActionButton)view0).getVisibility() == 0) {
                f1 = ((FloatingActionButton)view0).getScaleY();
            }
            materialShapeDrawable0.setInterpolation(f1);
        }
    }

    @Override  // com.google.android.material.internal.ViewOverlayImpl
    public void remove(Drawable drawable0) {
        ((ViewOverlay)this.b).remove(drawable0);
    }

    @Override  // com.google.gson.JsonSerializationContext
    public JsonElement serialize(Object object0) {
        return ((TreeTypeAdapter)this.b).c.toJsonTree(object0);
    }

    @Override  // com.google.gson.JsonSerializationContext
    public JsonElement serialize(Object object0, Type type0) {
        return ((TreeTypeAdapter)this.b).c.toJsonTree(object0, type0);
    }

    @Override  // com.google.android.material.shadow.ShadowViewDelegate
    public void setBackgroundDrawable(Drawable drawable0) {
        if(drawable0 != null) {
            ((FloatingActionButton)this.b).super.setBackgroundDrawable(drawable0);
        }
    }

    @Override  // com.google.android.material.shadow.ShadowViewDelegate
    public void setShadowPadding(int v, int v1, int v2, int v3) {
        FloatingActionButton floatingActionButton0 = (FloatingActionButton)this.b;
        floatingActionButton0.l.set(v, v1, v2, v3);
        floatingActionButton0.setPadding(v + floatingActionButton0.i, v1 + floatingActionButton0.i, v2 + floatingActionButton0.i, v3 + floatingActionButton0.i);
    }

    @Override  // coil.size.SizeResolver
    public Object size(Continuation continuation0) {
        return FlowKt.first(new AsyncImagePainter.updateRequest.2.1.size..inlined.mapNotNull.1(((AsyncImagePainter)this.b).g), continuation0);
    }

    @Override  // androidx.core.view.DifferentialMotionFlingTarget
    public boolean startDifferentialMotionFling(float f) {
        if(f == 0.0f) {
            return false;
        }
        this.stopDifferentialMotionFling();
        ((NestedScrollView)this.b).fling(((int)f));
        return true;
    }

    @Override  // com.google.android.play.core.common.IntentSenderForResultStarter
    public void startIntentSenderForResult(IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) {
        Intrinsics.checkNotNullParameter(intentSender0, "p0");
        ((Fragment)this.b).startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    @Override  // androidx.core.view.DifferentialMotionFlingTarget
    public void stopDifferentialMotionFling() {
        ((NestedScrollView)this.b).d.abortAnimation();
    }

    @Override  // io.reactivex.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter0) {
        try {
            singleEmitter0.onSuccess(((Callable)this.b).call());
        }
        catch(EmptyResultSetException emptyResultSetException0) {
            singleEmitter0.tryOnError(emptyResultSetException0);
        }
    }

    @Override  // io.reactivex.functions.Predicate
    public boolean test(Object object0) {
        return !((BooleanSupplier)this.b).getAsBoolean();
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object object0) {
        Void void0 = (Void)object0;
        SettingsController settingsController0 = (SettingsController)this.b;
        com.google.firebase.crashlytics.internal.settings.d d0 = settingsController0.b;
        JSONObject jSONObject0 = settingsController0.f.invoke(d0, true);
        if(jSONObject0 != null) {
            Settings settings0 = settingsController0.c.parseSettingsJson(jSONObject0);
            settingsController0.e.writeCachedSettings(settings0.expiresAtMillis, jSONObject0);
            Logger.getLogger().d("Loaded settings: " + jSONObject0.toString());
            SharedPreferences.Editor sharedPreferences$Editor0 = CommonUtils.getSharedPrefs(settingsController0.a).edit();
            sharedPreferences$Editor0.putString("existing_instance_identifier", d0.f);
            sharedPreferences$Editor0.apply();
            settingsController0.h.set(settings0);
            ((TaskCompletionSource)settingsController0.i.get()).trySetResult(settings0);
        }
        return Tasks.forResult(null);
    }

    @Override
    public String toString() {
        switch(this.a) {
            case 8: {
                return super.toString() + "{fragment=" + ((RequestManagerFragment)this.b) + "}";
            }
            case 9: {
                return super.toString() + "{fragment=" + ((SupportRequestManagerFragment)this.b) + "}";
            }
            default: {
                return super.toString();
            }
        }
    }
}

