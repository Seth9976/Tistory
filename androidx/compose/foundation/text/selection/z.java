package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.material3.DateRangePickerState;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.Shapes;
import androidx.compose.material3.Typography;
import androidx.compose.material3.c8;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.r5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import com.kakao.kandinsky.mosaic.ui.MosaicDecorationKt;
import com.kakao.sdk.auth.AuthCodeClient;
import com.kakao.sdk.auth.LoginClient;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;

public final class z extends Lambda implements Function2 {
    public final Object A;
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public z(int v, Object object0, Object object1, Object object2, Object object3) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        this.A = object3;
        super(2);
    }

    public z(LoginClient loginClient0, Function2 function20, Context context0, List list0) {
        this.w = 6;
        this.x = loginClient0;
        this.A = function20;
        this.y = context0;
        this.z = list0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-123806316, v, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:104)");
                }
                CompositionLocalKt.CompositionLocalProvider(SelectionRegistrarKt.getLocalSelectionRegistrar().provides(((SelectionRegistrarImpl)this.x)), ComposableLambdaKt.rememberComposableLambda(0x37C17254, true, new y(((Modifier)this.y), ((SelectionManager)this.z), 0, ((Function2)this.A)), ((Composer)object0), 54), ((Composer)object0), ProvidedValue.$stable | 0x30);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1840727866, v1, -1, "androidx.compose.material3.DatePicker.<anonymous> (DatePicker.kt:211)");
                }
                DatePickerState datePickerState0 = (DatePickerState)this.x;
                Long long0 = datePickerState0.getSelectedDateMillis();
                long v2 = datePickerState0.getDisplayedMonthMillis();
                int v3 = datePickerState0.getDisplayMode-jFl-4v0();
                boolean z = ((Composer)object0).changed(datePickerState0);
                r5 r50 = ((Composer)object0).rememberedValue();
                if(z || r50 == Composer.Companion.getEmpty()) {
                    r50 = new r5(datePickerState0, 1);
                    ((Composer)object0).updateRememberedValue(r50);
                }
                boolean z1 = ((Composer)object0).changed(datePickerState0);
                r5 r51 = ((Composer)object0).rememberedValue();
                if(z1 || r51 == Composer.Companion.getEmpty()) {
                    r51 = new r5(datePickerState0, 2);
                    ((Composer)object0).updateRememberedValue(r51);
                }
                IntRange intRange0 = datePickerState0.getYearRange();
                SelectableDates selectableDates0 = datePickerState0.getSelectableDates();
                DatePickerKt.access$SwitchableDateEntryContent-d7iavvg(long0, v2, v3, r50, r51, ((CalendarModel)this.y), intRange0, ((DatePickerFormatter)this.z), selectableDates0, ((DatePickerColors)this.A), ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                int v4 = ((Number)object1).intValue();
                if((v4 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xFC921885, v4, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:137)");
                }
                DateRangePickerState dateRangePickerState0 = (DateRangePickerState)this.x;
                Long long1 = dateRangePickerState0.getSelectedStartDateMillis();
                Long long2 = dateRangePickerState0.getSelectedEndDateMillis();
                long v5 = dateRangePickerState0.getDisplayedMonthMillis();
                int v6 = dateRangePickerState0.getDisplayMode-jFl-4v0();
                boolean z2 = ((Composer)object0).changed(dateRangePickerState0);
                b1 b11 = ((Composer)object0).rememberedValue();
                if(z2 || b11 == Composer.Companion.getEmpty()) {
                    b11 = new b1(dateRangePickerState0, 2);
                    ((Composer)object0).updateRememberedValue(b11);
                }
                boolean z3 = ((Composer)object0).changed(dateRangePickerState0);
                c8 c80 = ((Composer)object0).rememberedValue();
                if(z3 || c80 == Composer.Companion.getEmpty()) {
                    c80 = new c8(dateRangePickerState0, 1);
                    ((Composer)object0).updateRememberedValue(c80);
                }
                IntRange intRange1 = dateRangePickerState0.getYearRange();
                SelectableDates selectableDates1 = dateRangePickerState0.getSelectableDates();
                DateRangePickerKt.access$SwitchableDateEntryContent-RN-2D1Q(long1, long2, v5, v6, b11, c80, ((CalendarModel)this.y), intRange1, ((DatePickerFormatter)this.z), selectableDates1, ((DatePickerColors)this.A), ((Composer)object0), 0, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 3: {
                int v7 = ((Number)object1).intValue();
                if((v7 & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2050809758, v7, -1, "androidx.compose.material3.MaterialExpressiveTheme.<anonymous> (MaterialTheme.kt:143)");
                }
                ColorScheme colorScheme0 = (ColorScheme)this.x;
                if(colorScheme0 == null) {
                    colorScheme0 = ColorSchemeKt.expressiveLightColorScheme();
                }
                Shapes shapes0 = (Shapes)this.y;
                if(shapes0 == null) {
                    shapes0 = new Shapes(null, null, null, null, null, 0x1F, null);
                }
                Typography typography0 = (Typography)this.z;
                if(typography0 == null) {
                    typography0 = new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x7FFF, null);
                }
                MaterialThemeKt.MaterialTheme(colorScheme0, shapes0, typography0, ((Function2)this.A), ((Composer)object0), 0, 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 4: {
                int v8 = ((Number)object1).intValue();
                if((v8 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x6E68FA48, v8, -1, "com.kakao.kandinsky.mosaic.ui.BlurDecoration.<anonymous> (MosaicDecoration.kt:140)");
                }
                Bitmap bitmap0 = (Bitmap)((MosaicAndBlurBitmapLoader)this.x).loadSelectedBitmap(null, ((Blur)this.y), ((Composer)object0), 0, 1).getValue();
                if(bitmap0 == null) {
                    bitmap0 = ((MosaicAndBlurBitmapLoader)this.x).getFullBitmap();
                }
                if(bitmap0 != null) {
                    MosaicDecorationKt.access$BitmapImage(AndroidImageBitmap_androidKt.asImageBitmap(bitmap0), 2.0f, ((Rect)this.z), ((Matrix)this.A), ((Composer)object0), 0x1038, 0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 5: {
                int v9 = ((Number)object1).intValue();
                if((v9 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x2CF87E2A, v9, -1, "com.kakao.kandinsky.mosaic.ui.MosaicContent.<anonymous> (MosaicDecoration.kt:109)");
                }
                Bitmap bitmap1 = (Bitmap)((MosaicAndBlurBitmapLoader)this.x).loadSelectedBitmap(((Mosaic)this.y), null, ((Composer)object0), 0, 2).getValue();
                if(bitmap1 == null) {
                    bitmap1 = ((MosaicAndBlurBitmapLoader)this.x).getFullBitmap();
                }
                if(bitmap1 != null) {
                    MosaicDecorationKt.access$BitmapImage(AndroidImageBitmap_androidKt.asImageBitmap(bitmap1), 2.0f, ((Rect)this.z), ((Matrix)this.A), ((Composer)object0), 0x1038, 0);
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                if(((Throwable)object1) != null) {
                    ((Function2)this.A).invoke(null, ((Throwable)object1));
                    return Unit.INSTANCE;
                }
                AuthCodeClient authCodeClient0 = LoginClient.access$getAuthCodeClient$p(((LoginClient)this.x));
                b1 b10 = new b1(this, 19);
                AuthCodeClient.authorizeWithKakaoAccount$default(authCodeClient0, ((Context)this.y), null, ((List)this.z), ((String)object0), null, null, b10, 50, null);
                return Unit.INSTANCE;
            }
        }
    }
}

