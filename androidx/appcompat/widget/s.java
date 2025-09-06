package androidx.appcompat.widget;

import android.os.AsyncTask;
import android.util.Log;
import android.util.Xml;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

public final class s extends AsyncTask {
    public final t a;

    public s(t t0) {
        this.a = t0;
        super();
    }

    @Override  // android.os.AsyncTask
    public final Object doInBackground(Object[] arr_object) {
        FileOutputStream fileOutputStream0;
        String s1;
        t t0 = this.a;
        List list0 = (List)arr_object[0];
        String s = (String)arr_object[1];
        try {
            s1 = t0.e;
            fileOutputStream0 = t0.d.openFileOutput(s, 0);
        }
        catch(FileNotFoundException fileNotFoundException0) {
            Log.e("t", "Error writing historical record file: " + s, fileNotFoundException0);
            return null;
        }
        XmlSerializer xmlSerializer0 = Xml.newSerializer();
        try {
            try {
                xmlSerializer0.setOutput(fileOutputStream0, null);
                xmlSerializer0.startDocument("UTF-8", Boolean.TRUE);
                xmlSerializer0.startTag(null, "historical-records");
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ActivityChooserModel.HistoricalRecord activityChooserModel$HistoricalRecord0 = (ActivityChooserModel.HistoricalRecord)list0.remove(0);
                    xmlSerializer0.startTag(null, "historical-record");
                    xmlSerializer0.attribute(null, "activity", activityChooserModel$HistoricalRecord0.activity.flattenToString());
                    xmlSerializer0.attribute(null, "time", String.valueOf(activityChooserModel$HistoricalRecord0.time));
                    xmlSerializer0.attribute(null, "weight", String.valueOf(activityChooserModel$HistoricalRecord0.weight));
                    xmlSerializer0.endTag(null, "historical-record");
                }
                xmlSerializer0.endTag(null, "historical-records");
                xmlSerializer0.endDocument();
                t0.i = true;
                goto label_51;
            }
            catch(IllegalArgumentException illegalArgumentException0) {
            }
            catch(IllegalStateException illegalStateException0) {
                goto label_39;
            }
            catch(IOException iOException0) {
                goto label_43;
            }
            Log.e("t", "Error writing historical record file: " + s1, illegalArgumentException0);
            t0.i = true;
            if(fileOutputStream0 != null) {
                goto label_52;
            }
            return null;
        label_39:
            Log.e("t", "Error writing historical record file: " + s1, illegalStateException0);
            t0.i = true;
            if(fileOutputStream0 != null) {
                goto label_52;
            label_43:
                Log.e("t", "Error writing historical record file: " + s1, iOException0);
                t0.i = true;
                if(fileOutputStream0 != null) {
                    goto label_52;
                }
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_47;
        }
        goto label_52;
    label_47:
        t0.i = true;
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
    label_51:
        if(fileOutputStream0 != null) {
            try {
            label_52:
                fileOutputStream0.close();
                return null;
            }
            catch(IOException unused_ex) {
            }
        }
        return null;
    }
}

