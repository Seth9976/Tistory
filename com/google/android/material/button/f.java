package com.google.android.material.button;

public final class f implements OnPressedChangeListener {
    public final MaterialButtonToggleGroup a;

    public f(MaterialButtonToggleGroup materialButtonToggleGroup0) {
        this.a = materialButtonToggleGroup0;
    }

    @Override  // com.google.android.material.button.MaterialButton$OnPressedChangeListener
    public final void onPressedChanged(MaterialButton materialButton0, boolean z) {
        this.a.invalidate();
    }
}

