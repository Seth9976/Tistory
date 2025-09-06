package com.google.android.material.slider;

import androidx.annotation.NonNull;
import java.util.Locale;

public final class BasicLabelFormatter implements LabelFormatter {
    @Override  // com.google.android.material.slider.LabelFormatter
    @NonNull
    public String getFormattedValue(float f) {
        if(f >= 999999995904.0f) {
            return String.format(Locale.US, "%.1fT", ((float)(f / 999999995904.0f)));
        }
        if(f >= 1000000000.0f) {
            return String.format(Locale.US, "%.1fB", ((float)(f / 1000000000.0f)));
        }
        if(f >= 1000000.0f) {
            return String.format(Locale.US, "%.1fM", ((float)(f / 1000000.0f)));
        }
        return f >= 1000.0f ? String.format(Locale.US, "%.1fK", ((float)(f / 1000.0f))) : String.format(Locale.US, "%.0f", f);
    }
}

