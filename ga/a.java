package ga;

import android.content.Context;
import android.os.Bundle;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostControllerKt;
import com.kakao.kandinsky.crop.contract.CropRatioType;
import com.kakao.kandinsky.crop.contract.CropRatioTypeKt;
import com.kakao.kandinsky.filter.contract.EffectMenu;
import com.kakao.kandinsky.filter.contract.MenuKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final int w;
    public final Context x;

    public a(Context context0, int v) {
        this.w = v;
        this.x = context0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                int v1 = ((EffectMenu)MenuKt.getEffectMenuList().get(((Number)object0).intValue())).getTitle();
                String s1 = this.x.getString(v1);
                Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
                return s1;
            }
            case 1: {
                NavHostController navHostController0 = NavHostControllerKt.access$createNavController(this.x);
                navHostController0.restoreState(((Bundle)object0));
                return navHostController0;
            }
            default: {
                int v = ((CropRatioType)CropRatioTypeKt.getCropRatioTypeList().get(((Number)object0).intValue())).getNameRes();
                String s = this.x.getString(v);
                Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
                return s;
            }
        }
    }
}

