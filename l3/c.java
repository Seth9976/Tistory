package l3;

import android.text.Spannable;
import android.text.util.Linkify.MatchFilter;
import android.text.util.Linkify.TransformFilter;
import android.text.util.Linkify;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import java.util.regex.Pattern;

public abstract class c {
    @DoNotInline
    public static void a(TextView textView0, Pattern pattern0, String s, String[] arr_s, Linkify.MatchFilter linkify$MatchFilter0, Linkify.TransformFilter linkify$TransformFilter0) {
        Linkify.addLinks(textView0, pattern0, s, arr_s, linkify$MatchFilter0, linkify$TransformFilter0);
    }

    @DoNotInline
    public static boolean b(Spannable spannable0, Pattern pattern0, String s, String[] arr_s, Linkify.MatchFilter linkify$MatchFilter0, Linkify.TransformFilter linkify$TransformFilter0) {
        return Linkify.addLinks(spannable0, pattern0, s, arr_s, linkify$MatchFilter0, linkify$TransformFilter0);
    }
}

