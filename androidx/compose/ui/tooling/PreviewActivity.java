package androidx.compose.ui.tooling;

import aa.x;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import o2.f;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPreviewActivity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewActivity.android.kt\nandroidx/compose/ui/tooling/PreviewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
public final class PreviewActivity extends ComponentActivity {
    public static final int $stable;
    public final String y;

    public PreviewActivity() {
        this.y = "PreviewActivity";
    }

    @Override  // androidx.activity.ComponentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ApplicationInfo applicationInfo0 = this.getApplicationInfo();
        String s = this.y;
        if((applicationInfo0.flags & 2) == 0) {
            Log.d(s, "Application is not debuggable. Compose Preview not allowed.");
            this.finish();
            return;
        }
        Intent intent0 = this.getIntent();
        if(intent0 != null) {
            String s1 = intent0.getStringExtra("composable");
            if(s1 != null) {
                Log.d(s, "PreviewActivity has composable " + s1);
                String s2 = StringsKt__StringsKt.substringBeforeLast$default(s1, '.', null, 2, null);
                String s3 = StringsKt__StringsKt.substringAfterLast$default(s1, '.', null, 2, null);
                String s4 = this.getIntent().getStringExtra("parameterProviderClassName");
                if(s4 != null) {
                    Log.d(s, "Previewing \'" + s3 + "\' with parameter provider: \'" + s4 + '\'');
                    Object[] arr_object = PreviewUtils_androidKt.getPreviewProviderParameters(PreviewUtils_androidKt.asPreviewProviderClass(s4), this.getIntent().getIntExtra("parameterProviderIndex", -1));
                    if(arr_object.length > 1) {
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(0xCC9FD9DD, true, new f(arr_object, s2, s3)), 1, null);
                        return;
                    }
                    ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1901447514, true, new f(s2, s3, arr_object)), 1, null);
                    return;
                }
                Log.d(s, "Previewing \'" + s3 + "\' without a parameter provider.");
                ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(0xCDE50CFC, true, new x(18, s2, s3)), 1, null);
            }
        }
    }
}

