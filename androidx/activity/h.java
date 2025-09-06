package androidx.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.collection.IntObjectMap;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.material3.e9;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.InputMethodManager;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.core.app.o;
import androidx.core.app.p;
import androidx.core.app.q;
import androidx.core.content.v;
import androidx.core.view.a1;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.room.InvalidationTracker;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.SynchronousExecutor;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.impl.workers.ConstraintTrackingWorkerKt;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.e;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.sidesheet.g;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.a0;
import com.kakao.keditor.widget.KeditorEditText;
import com.kakao.tistory.presentation.view.common.dialog.CommonDatePickerDialog;
import com.kakao.tistory.presentation.view.common.dialog.CommonDialog;
import com.kakao.tistory.presentation.view.common.dialog.CommonTimePickerDialog;
import com.kakao.tistory.presentation.view.common.dialog.ToastBarDialog;
import f8.c;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job.DefaultImpls;
import l1.a;

public final class h implements Runnable {
    public final int a;
    public final Object b;

    public h(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final void run() {
        long[] arr_v6;
        MutableIntObjectMap mutableIntObjectMap3;
        int[] arr_v2;
        IntObjectMap intObjectMap1;
        MutableIntObjectMap mutableIntObjectMap2;
        Application application1;
        p p1;
        Handler handler1;
        switch(this.a) {
            case 0: {
                i i0 = (i)this.b;
                Intrinsics.checkNotNullParameter(i0, "this$0");
                Runnable runnable0 = i0.b;
                if(runnable0 != null) {
                    Intrinsics.checkNotNull(runnable0);
                    runnable0.run();
                    i0.b = null;
                }
                return;
            }
            case 1: {
                ComponentDialog.a(((ComponentDialog)this.b));
                return;
            }
            case 2: {
                FullyDrawnReporter fullyDrawnReporter0 = (FullyDrawnReporter)this.b;
                Intrinsics.checkNotNullParameter(fullyDrawnReporter0, "this$0");
                synchronized(fullyDrawnReporter0.c) {
                    fullyDrawnReporter0.e = false;
                    if(fullyDrawnReporter0.d == 0 && !fullyDrawnReporter0.f) {
                        fullyDrawnReporter0.b.invoke();
                        fullyDrawnReporter0.fullyDrawnReported();
                    }
                }
                return;
            }
            case 3: {
                AndroidComposeView androidComposeView0 = (AndroidComposeView)this.b;
                androidComposeView0.v0 = false;
                MotionEvent motionEvent0 = androidComposeView0.p0;
                Intrinsics.checkNotNull(motionEvent0);
                if(motionEvent0.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                androidComposeView0.n(motionEvent0);
                return;
            }
            case 4: {
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat0 = (AndroidComposeViewAccessibilityDelegateCompat)this.b;
                Trace.beginSection("measureAndLayout");
                try {
                    Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat0.d, false, 1, null);
                    Trace.beginSection("checkForSemanticsChanges");
                    androidComposeViewAccessibilityDelegateCompat0.c();
                }
                finally {
                    Trace.endSection();
                }
                androidComposeViewAccessibilityDelegateCompat0.K = false;
                return;
            }
            case 5: {
                Carousel carousel0 = (Carousel)this.b;
                carousel0.i.setTransitionDuration(carousel0.v);
                if(carousel0.u < carousel0.h) {
                    carousel0.i.transitionToState(carousel0.n, carousel0.v);
                    return;
                }
                carousel0.i.transitionToState(carousel0.o, carousel0.v);
                return;
            }
            case 6: {
                Activity activity0 = (Activity)this.b;
                if(!activity0.isFinishing()) {
                    int v3 = Build.VERSION.SDK_INT;
                    if(v3 >= 28) {
                        activity0.recreate();
                        return;
                    }
                    Method method0 = q.f;
                    if((v3 != 26 && v3 != 27 || method0 != null) && (q.e != null || q.d != null)) {
                        try {
                            Object object2 = q.c.get(activity0);
                            if(object2 != null) {
                                Object object3 = q.b.get(activity0);
                                if(object3 != null) {
                                    Application application0 = activity0.getApplication();
                                    p p0 = new p(activity0);
                                    application0.registerActivityLifecycleCallbacks(p0);
                                    Handler handler0 = q.g;
                                    handler0.post(new o(0, p0, object2));
                                    boolean z = v3 == 26 || v3 == 27;
                                    try {
                                        if(z) {
                                            handler1 = handler0;
                                            p1 = p0;
                                            application1 = application0;
                                            method0.invoke(object3, object2, 0, 0, 0, Boolean.FALSE, 0, 0, Boolean.FALSE, Boolean.FALSE);
                                        }
                                        else {
                                            handler1 = handler0;
                                            p1 = p0;
                                            application1 = application0;
                                            activity0.recreate();
                                        }
                                    }
                                    finally {
                                        handler1.post(new o(application1, p1, false, 1));
                                    }
                                    return;
                                }
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                    activity0.recreate();
                }
                return;
            }
            case 7: {
                v v5 = (v)this.b;
                if(!v5.d) {
                    throw new IllegalStateException("bindService must be called before unbind");
                }
                v5.d = false;
                v5.c.unbindService(v5);
                return;
            }
            case 8: {
                Intrinsics.checkNotNullParameter(((ProcessLifecycleOwner)this.b), "this$0");
                ((ProcessLifecycleOwner)this.b).dispatchPauseIfNeeded$lifecycle_process_release();
                ((ProcessLifecycleOwner)this.b).dispatchStopIfNeeded$lifecycle_process_release();
                return;
            }
            case 9: {
                synchronized(((InvalidationTracker)this.b).o) {
                    ((InvalidationTracker)this.b).h = false;
                    ((InvalidationTracker)this.b).j.resetTriggerState();
                    SupportSQLiteStatement supportSQLiteStatement0 = ((InvalidationTracker)this.b).i;
                    if(supportSQLiteStatement0 != null) {
                        supportSQLiteStatement0.close();
                    }
                }
                return;
            }
            case 10: {
                ((CarouselLayoutManager)this.b).w();
                return;
            }
            case 11: {
                ViewUtils.requestFocusAndShowKeyboard(((EditText)this.b), false);
                return;
            }
            case 12: {
                SearchBar searchBar0 = (SearchBar)this.b;
                com.google.android.material.search.h h0 = searchBar0.g0;
                Iterator iterator0 = h0.a.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                }
                TextView textView0 = searchBar0.getTextView();
                View view0 = searchBar0.getCenterView();
                View view1 = ToolbarUtils.getSecondaryActionMenuItemView(searchBar0);
                AnimatorSet animatorSet0 = new AnimatorSet();
                animatorSet0.setStartDelay(0xFAL);
                ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                valueAnimator0.addUpdateListener(MultiViewUpdateListener.alphaListener(new View[]{textView0}));
                TimeInterpolator timeInterpolator0 = AnimationUtils.LINEAR_INTERPOLATOR;
                valueAnimator0.setInterpolator(timeInterpolator0);
                valueAnimator0.setDuration(0xFAL);
                animatorSet0.play(valueAnimator0);
                if(view1 != null) {
                    ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    valueAnimator1.addUpdateListener(MultiViewUpdateListener.alphaListener(new View[]{view1}));
                    valueAnimator1.setInterpolator(timeInterpolator0);
                    valueAnimator1.setDuration(0xFAL);
                    animatorSet0.play(valueAnimator1);
                }
                animatorSet0.addListener(new e(h0));
                h0.d = animatorSet0;
                textView0.setAlpha(0.0f);
                if(view1 != null) {
                    view1.setAlpha(0.0f);
                }
                if(view0 instanceof AnimatableView) {
                    ((AnimatableView)view0).startAnimation(new androidx.core.app.h(animatorSet0, 5));
                    return;
                }
                if(view0 != null) {
                    view0.setAlpha(0.0f);
                    view0.setVisibility(0);
                    ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    valueAnimator2.addUpdateListener(MultiViewUpdateListener.alphaListener(new View[]{view0}));
                    valueAnimator2.setInterpolator(timeInterpolator0);
                    long v7 = 0L;
                    valueAnimator2.setDuration((h0.h ? 0xFAL : 0L));
                    if(h0.h) {
                        v7 = 500L;
                    }
                    valueAnimator2.setStartDelay(v7);
                    ValueAnimator valueAnimator3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    valueAnimator3.addUpdateListener(MultiViewUpdateListener.alphaListener(new View[]{view0}));
                    valueAnimator3.setInterpolator(timeInterpolator0);
                    valueAnimator3.setDuration(0xFAL);
                    valueAnimator3.setStartDelay(750L);
                    AnimatorSet animatorSet1 = new AnimatorSet();
                    animatorSet1.playSequentially(new Animator[]{valueAnimator2, valueAnimator3});
                    h0.e = animatorSet1;
                    animatorSet1.addListener(new a1(3, view0, animatorSet0));
                    animatorSet1.start();
                    return;
                }
                animatorSet0.start();
                return;
            }
            case 13: {
                g g0 = (g)this.b;
                g0.c = false;
                SideSheetBehavior sideSheetBehavior0 = (SideSheetBehavior)g0.e;
                if(sideSheetBehavior0.x != null && sideSheetBehavior0.x.continueSettling(true)) {
                    g0.a(g0.b);
                    return;
                }
                if(sideSheetBehavior0.v == 2) {
                    sideSheetBehavior0.a(g0.b);
                }
                return;
            }
            case 14: {
                ((FirebaseInstallations)this.b).a(false);
                return;
            }
            case 15: {
                e9 e90 = (e9)this.b;
                synchronized(((ArrayDeque)e90.d)) {
                    SharedPreferences.Editor sharedPreferences$Editor0 = ((SharedPreferences)e90.e).edit();
                    String s2 = (String)e90.b;
                    StringBuilder stringBuilder0 = new StringBuilder();
                    for(Object object5: ((ArrayDeque)e90.d)) {
                        stringBuilder0.append(((String)object5));
                        stringBuilder0.append(((String)e90.c));
                    }
                    sharedPreferences$Editor0.putString(s2, stringBuilder0.toString()).commit();
                }
                return;
            }
            case 16: {
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + ((a0)this.b).a.getAction() + " Releasing WakeLock.");
                ((a0)this.b).b.trySetResult(null);
                return;
            }
            case 17: {
                KeditorEditText.requestPendingFocusAndSelection$lambda$1(((KeditorEditText)this.b));
                return;
            }
            case 18: {
                ((c)this.b).t(true);
                return;
            }
            case 19: {
                boolean z1 = ((f8.i)this.b).h.isPopupShowing();
                ((f8.i)this.b).t(z1);
                ((f8.i)this.b).m = z1;
                return;
            }
            case 20: {
                ((TextInputLayout)this.b).h.requestLayout();
                return;
            }
            case 21: {
                ((g3.o)this.b).f = null;
                ((g3.o)this.b).onLocationChanged(null);
                return;
            }
            case 22: {
                TextInputServiceAndroid textInputServiceAndroid0 = (TextInputServiceAndroid)this.b;
                textInputServiceAndroid0.n = null;
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ObjectRef ref$ObjectRef1 = new ObjectRef();
                MutableVector mutableVector0 = textInputServiceAndroid0.m;
                int v9 = mutableVector0.getSize();
                if(v9 > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    int v10 = 0;
                    while(true) {
                        j2.i i1 = (j2.i)arr_object[v10];
                        switch(i1.ordinal()) {
                            case 0: {
                                ref$ObjectRef0.element = Boolean.TRUE;
                                ref$ObjectRef1.element = Boolean.TRUE;
                                break;
                            }
                            case 1: {
                                ref$ObjectRef0.element = Boolean.FALSE;
                                ref$ObjectRef1.element = Boolean.FALSE;
                                break;
                            }
                            case 2: 
                            case 3: {
                                if(!Intrinsics.areEqual(ref$ObjectRef0.element, Boolean.FALSE)) {
                                    ref$ObjectRef1.element = Boolean.valueOf(i1 == j2.i.c);
                                }
                            }
                        }
                        ++v10;
                        if(v10 >= v9) {
                            break;
                        }
                    }
                }
                mutableVector0.clear();
                boolean z2 = Intrinsics.areEqual(ref$ObjectRef0.element, Boolean.TRUE);
                InputMethodManager inputMethodManager0 = textInputServiceAndroid0.b;
                if(z2) {
                    inputMethodManager0.restartInput();
                }
                Boolean boolean0 = (Boolean)ref$ObjectRef1.element;
                if(boolean0 != null) {
                    if(boolean0.booleanValue()) {
                        inputMethodManager0.showSoftInput();
                    }
                    else {
                        inputMethodManager0.hideSoftInput();
                    }
                }
                if(Intrinsics.areEqual(ref$ObjectRef0.element, Boolean.FALSE)) {
                    inputMethodManager0.restartInput();
                }
                return;
            }
            case 23: {
                CoroutineWorker coroutineWorker0 = (CoroutineWorker)this.b;
                Intrinsics.checkNotNullParameter(coroutineWorker0, "this$0");
                if(coroutineWorker0.f.isCancelled()) {
                    DefaultImpls.cancel$default(coroutineWorker0.e, null, 1, null);
                }
                return;
            }
            case 24: {
                CommonDatePickerDialog.a(((CommonDatePickerDialog)this.b));
                return;
            }
            case 25: {
                CommonDialog.a(((CommonDialog)this.b));
                return;
            }
            case 26: {
                CommonTimePickerDialog.a(((CommonTimePickerDialog)this.b));
                return;
            }
            case 27: {
                ToastBarDialog.a(((Dialog)this.b));
                return;
            }
            case 28: {
                AndroidContentCaptureManager androidContentCaptureManager0 = (AndroidContentCaptureManager)this.b;
                if(androidContentCaptureManager0.isEnabled$ui_release()) {
                    AndroidComposeView androidComposeView1 = androidContentCaptureManager0.a;
                    Owner.measureAndLayout$default(androidComposeView1, false, 1, null);
                    androidContentCaptureManager0.d(androidComposeView1.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager0.o);
                    androidContentCaptureManager0.b(androidComposeView1.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager0.o);
                    IntObjectMap intObjectMap0 = androidContentCaptureManager0.getCurrentSemanticsNodes$ui_release();
                    int[] arr_v = intObjectMap0.keys;
                    long[] arr_v1 = intObjectMap0.metadata;
                    int v11 = arr_v1.length - 2;
                    MutableIntObjectMap mutableIntObjectMap0 = androidContentCaptureManager0.n;
                    if(v11 >= 0) {
                        MutableIntObjectMap mutableIntObjectMap1 = mutableIntObjectMap0;
                        int v12 = 0;
                        while(true) {
                            long v13 = arr_v1[v12];
                            if((~v13 << 7 & v13 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_401;
                            }
                            int v14 = 8 - (~(v12 - v11) >>> 0x1F);
                            int v15 = 0;
                            while(v15 < v14) {
                                if((v13 & 0xFFL) < 0x80L) {
                                    int v16 = arr_v[(v12 << 3) + v15];
                                    mutableIntObjectMap2 = mutableIntObjectMap1;
                                    SemanticsNodeCopy semanticsNodeCopy0 = (SemanticsNodeCopy)mutableIntObjectMap2.get(v16);
                                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)intObjectMap0.get(v16);
                                    SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0 == null ? null : semanticsNodeWithAdjustedBounds0.getSemanticsNode();
                                    if(semanticsNode0 == null) {
                                        throw a.b("no value for specified key");
                                    }
                                    if(semanticsNodeCopy0 == null) {
                                        for(Object object6: semanticsNode0.getUnmergedConfig$ui_release()) {
                                            Object object7 = ((Map.Entry)object6).getKey();
                                            SemanticsProperties semanticsProperties0 = SemanticsProperties.INSTANCE;
                                            if(Intrinsics.areEqual(object7, semanticsProperties0.getText())) {
                                                List list0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties0.getText());
                                                androidContentCaptureManager0.c(semanticsNode0.getId(), String.valueOf((list0 == null ? null : ((AnnotatedString)CollectionsKt___CollectionsKt.firstOrNull(list0)))));
                                            }
                                        }
                                        intObjectMap1 = intObjectMap0;
                                    }
                                    else {
                                        intObjectMap1 = intObjectMap0;
                                        for(Object object8: semanticsNode0.getUnmergedConfig$ui_release()) {
                                            SemanticsPropertyKey semanticsPropertyKey0 = (SemanticsPropertyKey)((Map.Entry)object8).getKey();
                                            SemanticsProperties semanticsProperties1 = SemanticsProperties.INSTANCE;
                                            if(Intrinsics.areEqual(semanticsPropertyKey0, semanticsProperties1.getText())) {
                                                List list1 = (List)SemanticsConfigurationKt.getOrNull(semanticsNodeCopy0.getUnmergedConfig(), semanticsProperties1.getText());
                                                AnnotatedString annotatedString0 = list1 == null ? null : ((AnnotatedString)CollectionsKt___CollectionsKt.firstOrNull(list1));
                                                List list2 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), semanticsProperties1.getText());
                                                AnnotatedString annotatedString1 = list2 == null ? null : ((AnnotatedString)CollectionsKt___CollectionsKt.firstOrNull(list2));
                                                if(!Intrinsics.areEqual(annotatedString0, annotatedString1)) {
                                                    androidContentCaptureManager0.c(semanticsNode0.getId(), String.valueOf(annotatedString1));
                                                }
                                            }
                                        }
                                    }
                                    arr_v2 = arr_v;
                                }
                                else {
                                    intObjectMap1 = intObjectMap0;
                                    arr_v2 = arr_v;
                                    mutableIntObjectMap2 = mutableIntObjectMap1;
                                }
                                v13 >>= 8;
                                ++v15;
                                mutableIntObjectMap1 = mutableIntObjectMap2;
                                intObjectMap0 = intObjectMap1;
                                arr_v = arr_v2;
                            }
                            IntObjectMap intObjectMap2 = intObjectMap0;
                            int[] arr_v3 = arr_v;
                            mutableIntObjectMap3 = mutableIntObjectMap1;
                            if(v14 == 8) {
                                goto label_404;
                            label_401:
                                intObjectMap2 = intObjectMap0;
                                arr_v3 = arr_v;
                                mutableIntObjectMap3 = mutableIntObjectMap1;
                            label_404:
                                if(v12 != v11) {
                                    ++v12;
                                    mutableIntObjectMap1 = mutableIntObjectMap3;
                                    intObjectMap0 = intObjectMap2;
                                    arr_v = arr_v3;
                                    continue;
                                }
                            }
                            break;
                        }
                    }
                    else {
                        mutableIntObjectMap3 = mutableIntObjectMap0;
                    }
                    mutableIntObjectMap3.clear();
                    IntObjectMap intObjectMap3 = androidContentCaptureManager0.getCurrentSemanticsNodes$ui_release();
                    int[] arr_v4 = intObjectMap3.keys;
                    Object[] arr_object1 = intObjectMap3.values;
                    long[] arr_v5 = intObjectMap3.metadata;
                    int v17 = arr_v5.length - 2;
                    if(v17 >= 0) {
                        int v18 = 0;
                        while(true) {
                            long v19 = arr_v5[v18];
                            if((~v19 << 7 & v19 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_437;
                            }
                            int v20 = 8 - (~(v18 - v17) >>> 0x1F);
                            int v21 = 0;
                            while(v21 < v20) {
                                if((v19 & 0xFFL) < 0x80L) {
                                    int v22 = (v18 << 3) + v21;
                                    arr_v6 = arr_v5;
                                    mutableIntObjectMap3.set(arr_v4[v22], new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds)arr_object1[v22]).getSemanticsNode(), androidContentCaptureManager0.getCurrentSemanticsNodes$ui_release()));
                                }
                                else {
                                    arr_v6 = arr_v5;
                                }
                                v19 >>= 8;
                                ++v21;
                                arr_v5 = arr_v6;
                            }
                            long[] arr_v7 = arr_v5;
                            if(v20 == 8) {
                                goto label_438;
                            label_437:
                                arr_v7 = arr_v5;
                            label_438:
                                if(v18 != v17) {
                                    ++v18;
                                    arr_v5 = arr_v7;
                                    continue;
                                }
                                androidContentCaptureManager0.o = new SemanticsNodeCopy(androidComposeView1.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager0.getCurrentSemanticsNodes$ui_release());
                                androidContentCaptureManager0.p = false;
                                return;
                            }
                            break;
                        }
                    }
                    androidContentCaptureManager0.o = new SemanticsNodeCopy(androidComposeView1.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager0.getCurrentSemanticsNodes$ui_release());
                    androidContentCaptureManager0.p = false;
                }
                return;
            }
            default: {
                ConstraintTrackingWorker constraintTrackingWorker0 = (ConstraintTrackingWorker)this.b;
                Intrinsics.checkNotNullParameter(constraintTrackingWorker0, "this$0");
                if(!constraintTrackingWorker0.h.isCancelled()) {
                    String s = constraintTrackingWorker0.getInputData().getString("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                    Logger logger0 = Logger.get();
                    Intrinsics.checkNotNullExpressionValue(logger0, "get()");
                    if(s != null && s.length() != 0) {
                        ListenableWorker listenableWorker0 = constraintTrackingWorker0.getWorkerFactory().createWorkerWithDefaultFallback(constraintTrackingWorker0.getApplicationContext(), s, constraintTrackingWorker0.e);
                        constraintTrackingWorker0.i = listenableWorker0;
                        if(listenableWorker0 == null) {
                            logger0.debug("WM-ConstraintTrkngWrkr", "No worker to delegate to.");
                            Intrinsics.checkNotNullExpressionValue(constraintTrackingWorker0.h, "future");
                            ConstraintTrackingWorkerKt.access$setFailed(constraintTrackingWorker0.h);
                            return;
                        }
                        WorkManagerImpl workManagerImpl0 = WorkManagerImpl.getInstance(constraintTrackingWorker0.getApplicationContext());
                        Intrinsics.checkNotNullExpressionValue(workManagerImpl0, "getInstance(applicationContext)");
                        WorkSpecDao workSpecDao0 = workManagerImpl0.getWorkDatabase().workSpecDao();
                        String s1 = constraintTrackingWorker0.getId().toString();
                        Intrinsics.checkNotNullExpressionValue(s1, "id.toString()");
                        WorkSpec workSpec0 = workSpecDao0.getWorkSpec(s1);
                        if(workSpec0 == null) {
                            Intrinsics.checkNotNullExpressionValue(constraintTrackingWorker0.h, "future");
                            ConstraintTrackingWorkerKt.access$setFailed(constraintTrackingWorker0.h);
                            return;
                        }
                        Trackers trackers0 = workManagerImpl0.getTrackers();
                        Intrinsics.checkNotNullExpressionValue(trackers0, "workManagerImpl.trackers");
                        WorkConstraintsTracker workConstraintsTracker0 = new WorkConstraintsTracker(trackers0);
                        CoroutineDispatcher coroutineDispatcher0 = workManagerImpl0.getWorkTaskExecutor().getTaskCoroutineDispatcher();
                        Intrinsics.checkNotNullExpressionValue(coroutineDispatcher0, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
                        m5.a a0 = new m5.a(WorkConstraintsTrackerKt.listen(workConstraintsTracker0, workSpec0, coroutineDispatcher0, constraintTrackingWorker0), 0);
                        SynchronousExecutor synchronousExecutor0 = new SynchronousExecutor();
                        constraintTrackingWorker0.h.addListener(a0, synchronousExecutor0);
                        if(workConstraintsTracker0.areAllConstraintsMet(workSpec0)) {
                            logger0.debug("WM-ConstraintTrkngWrkr", "Constraints met for delegate " + s);
                            try {
                                ListenableWorker listenableWorker1 = constraintTrackingWorker0.i;
                                Intrinsics.checkNotNull(listenableWorker1);
                                ListenableFuture listenableFuture0 = listenableWorker1.startWork();
                                Intrinsics.checkNotNullExpressionValue(listenableFuture0, "delegate!!.startWork()");
                                listenableFuture0.addListener(new m(28, constraintTrackingWorker0, listenableFuture0), constraintTrackingWorker0.getBackgroundExecutor());
                            }
                            catch(Throwable throwable0) {
                                logger0.debug("WM-ConstraintTrkngWrkr", "Delegated worker " + s + " threw exception in startWork.", throwable0);
                                synchronized(constraintTrackingWorker0.f) {
                                    if(constraintTrackingWorker0.g) {
                                        logger0.debug("WM-ConstraintTrkngWrkr", "Constraints were unmet, Retrying.");
                                        Intrinsics.checkNotNullExpressionValue(constraintTrackingWorker0.h, "future");
                                        ConstraintTrackingWorkerKt.access$setRetry(constraintTrackingWorker0.h);
                                    }
                                    else {
                                        Intrinsics.checkNotNullExpressionValue(constraintTrackingWorker0.h, "future");
                                        ConstraintTrackingWorkerKt.access$setFailed(constraintTrackingWorker0.h);
                                    }
                                }
                            }
                            return;
                        }
                        logger0.debug("WM-ConstraintTrkngWrkr", "Constraints not met for delegate " + s + ". Requesting retry.");
                        Intrinsics.checkNotNullExpressionValue(constraintTrackingWorker0.h, "future");
                        ConstraintTrackingWorkerKt.access$setRetry(constraintTrackingWorker0.h);
                        return;
                    }
                    logger0.error("WM-ConstraintTrkngWrkr", "No worker to delegate to.");
                    Intrinsics.checkNotNullExpressionValue(constraintTrackingWorker0.h, "future");
                    ConstraintTrackingWorkerKt.access$setFailed(constraintTrackingWorker0.h);
                }
            }
        }
    }
}

