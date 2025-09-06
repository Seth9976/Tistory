import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

public abstract class e {
    public static boolean a(Composer composer0) {
        composer0.endNode();
        composer0.endNode();
        return ComposerKt.isTraceInProgress();
    }
}

