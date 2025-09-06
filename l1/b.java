package l1;

import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest.Builder;
import android.view.translation.ViewTranslationResponse;

public abstract class b {
    public static TranslationResponseValue b(ViewTranslationResponse viewTranslationResponse0) {
        return viewTranslationResponse0.getValue("android:text");
    }

    public static ViewTranslationRequest.Builder c(AutofillId autofillId0, long v) {
        return new ViewTranslationRequest.Builder(autofillId0, v);
    }

    public static ViewTranslationResponse e(Object object0) {
        return (ViewTranslationResponse)object0;
    }

    public static void g() {
    }

    public static void h(ViewTranslationRequest.Builder viewTranslationRequest$Builder0, TranslationRequestValue translationRequestValue0) {
        viewTranslationRequest$Builder0.setValue("android:text", translationRequestValue0);
    }
}

