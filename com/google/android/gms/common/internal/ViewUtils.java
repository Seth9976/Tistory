package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class ViewUtils {
    @Nullable
    @KeepForSdk
    public static String getXmlAttributeString(@NonNull String s, @NonNull String s1, @NonNull Context context0, @NonNull AttributeSet attributeSet0, boolean z, boolean z1, @NonNull String s2) {
        String s3 = attributeSet0 == null ? null : attributeSet0.getAttributeValue(s, s1);
        if(s3 != null && s3.startsWith("@string/") && z) {
            TypedValue typedValue0 = new TypedValue();
            try {
                context0.getResources().getValue("net.daum.android.tistoryapp:string/" + s3.substring(8), typedValue0, true);
            }
            catch(Resources.NotFoundException unused_ex) {
                Log.w(s2, "Could not find resource for " + s1 + ": " + s3);
            }
            CharSequence charSequence0 = typedValue0.string;
            if(charSequence0 == null) {
                Log.w(s2, "Resource " + s1 + " was not a string: " + typedValue0.toString());
            }
            else {
                s3 = charSequence0.toString();
            }
        }
        if(z1 && s3 == null) {
            Log.w(s2, "Required XML attribute \"" + s1 + "\" missing");
        }
        return s3;
    }
}

