package com.google.android.material.button;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.k;
import com.google.android.material.R.attr;

@RequiresApi(29)
@RestrictTo({Scope.LIBRARY})
public final class MaterialButton.InspectionCompanion implements InspectionCompanion {
    public boolean a;
    public int b;

    public MaterialButton.InspectionCompanion() {
        this.a = false;
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper0) {
        this.b = k.d(propertyMapper0, attr.iconPadding);
        this.a = true;
    }

    public void readProperties(@NonNull MaterialButton materialButton0, @NonNull PropertyReader propertyReader0) {
        if(!this.a) {
            throw k.m();
        }
        propertyReader0.readInt(this.b, materialButton0.getIconPadding());
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void readProperties(@NonNull Object object0, @NonNull PropertyReader propertyReader0) {
        this.readProperties(((MaterialButton)object0), propertyReader0);
    }
}

