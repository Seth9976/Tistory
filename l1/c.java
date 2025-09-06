package l1;

import android.os.Build.VERSION;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest.Builder;
import android.view.translation.ViewTranslationResponse;
import androidx.activity.m;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.util.LongSparseArrayKt;
import java.util.List;
import java.util.function.Consumer;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class c {
    public static final c a;

    static {
        c.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static void a(AndroidContentCaptureManager androidContentCaptureManager0, LongSparseArray longSparseArray0) {
        LongIterator longIterator0 = LongSparseArrayKt.keyIterator(longSparseArray0);
        while(longIterator0.hasNext()) {
            long v = longIterator0.nextLong();
            ViewTranslationResponse viewTranslationResponse0 = b.e(longSparseArray0.get(v));
            if(viewTranslationResponse0 != null) {
                TranslationResponseValue translationResponseValue0 = b.b(viewTranslationResponse0);
                if(translationResponseValue0 != null) {
                    CharSequence charSequence0 = translationResponseValue0.getText();
                    if(charSequence0 != null) {
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)androidContentCaptureManager0.getCurrentSemanticsNodes$ui_release().get(((int)v));
                        if(semanticsNodeWithAdjustedBounds0 != null) {
                            SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0.getSemanticsNode();
                            if(semanticsNode0 != null) {
                                AccessibilityAction accessibilityAction0 = (AccessibilityAction)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsActions.INSTANCE.getSetTextSubstitution());
                                if(accessibilityAction0 != null) {
                                    Function1 function10 = (Function1)accessibilityAction0.getAction();
                                    if(function10 != null) {
                                        Boolean boolean0 = (Boolean)function10.invoke(new AnnotatedString(charSequence0.toString(), null, null, 6, null));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @DoNotInline
    @RequiresApi(0x1F)
    public final void b(@NotNull AndroidContentCaptureManager androidContentCaptureManager0, @NotNull long[] arr_v, @NotNull int[] arr_v1, @NotNull Consumer consumer0) {
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds0 = (SemanticsNodeWithAdjustedBounds)androidContentCaptureManager0.getCurrentSemanticsNodes$ui_release().get(((int)v1));
            if(semanticsNodeWithAdjustedBounds0 != null) {
                SemanticsNode semanticsNode0 = semanticsNodeWithAdjustedBounds0.getSemanticsNode();
                if(semanticsNode0 != null) {
                    ViewTranslationRequest.Builder viewTranslationRequest$Builder0 = b.c(androidContentCaptureManager0.getView().getAutofillId(), ((long)semanticsNode0.getId()));
                    List list0 = (List)SemanticsConfigurationKt.getOrNull(semanticsNode0.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getText());
                    if(list0 != null) {
                        String s = ListUtilsKt.fastJoinToString$default(list0, "\n", null, null, 0, null, null, 62, null);
                        if(s != null) {
                            b.h(viewTranslationRequest$Builder0, TranslationRequestValue.forText(new AnnotatedString(s, null, null, 6, null)));
                            consumer0.accept(viewTranslationRequest$Builder0.build());
                        }
                    }
                }
            }
        }
    }

    @DoNotInline
    @RequiresApi(0x1F)
    public final void c(@NotNull AndroidContentCaptureManager androidContentCaptureManager0, @NotNull LongSparseArray longSparseArray0) {
        if(Build.VERSION.SDK_INT < 0x1F) {
            return;
        }
        if(Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            c.a(androidContentCaptureManager0, longSparseArray0);
            return;
        }
        androidContentCaptureManager0.getView().post(new m(26, androidContentCaptureManager0, longSparseArray0));
    }
}

