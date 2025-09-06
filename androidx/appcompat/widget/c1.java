package androidx.appcompat.widget;

import android.view.textclassifier.TextClassifier;

public class c1 implements SuperCaller {
    public final AppCompatTextView a;

    public c1(AppCompatTextView appCompatTextView0) {
        this.a = appCompatTextView0;
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public final int getAutoSizeMaxTextSize() {
        return this.a.super.getAutoSizeMaxTextSize();
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public final int getAutoSizeMinTextSize() {
        return this.a.super.getAutoSizeMinTextSize();
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public final int getAutoSizeStepGranularity() {
        return this.a.super.getAutoSizeStepGranularity();
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public final int[] getAutoSizeTextAvailableSizes() {
        return this.a.super.getAutoSizeTextAvailableSizes();
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public final int getAutoSizeTextType() {
        return this.a.super.getAutoSizeTextType();
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public final TextClassifier getTextClassifier() {
        return this.a.super.getTextClassifier();
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public final void setAutoSizeTextTypeUniformWithConfiguration(int v, int v1, int v2, int v3) {
        this.a.super.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] arr_v, int v) {
        this.a.super.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public final void setAutoSizeTextTypeWithDefaults(int v) {
        this.a.super.setAutoSizeTextTypeWithDefaults(v);
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public void setFirstBaselineToTopHeight(int v) {
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public void setLastBaselineToBottomHeight(int v) {
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
    public final void setTextClassifier(TextClassifier textClassifier0) {
        this.a.super.setTextClassifier(textClassifier0);
    }
}

