package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.selection.g1;
import f2.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ComposeScrollCaptureCallback_androidKt {
    public static final Job access$launchWithCancellationSignal(CoroutineScope coroutineScope0, CancellationSignal cancellationSignal0, Function2 function20) {
        Job job0 = BuildersKt.launch$default(coroutineScope0, null, null, function20, 3, null);
        job0.invokeOnCompletion(new g1(cancellationSignal0, 26));
        cancellationSignal0.setOnCancelListener(new d(job0, 0));
        return job0;
    }
}

