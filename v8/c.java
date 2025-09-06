package v8;

import android.util.Base64OutputStream;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.heartbeatinfo.HeartBeatResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import jeb.synthetic.TWR;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c implements Callable {
    public final int a;
    public final DefaultHeartBeatController b;

    public c(DefaultHeartBeatController defaultHeartBeatController0, int v) {
        this.a = v;
        this.b = defaultHeartBeatController0;
        super();
    }

    @Override
    public final Object call() {
        if(this.a != 0) {
            synchronized(this.b) {
                ((e)this.b.a.get()).h(System.currentTimeMillis(), ((UserAgentPublisher)this.b.c.get()).getUserAgent());
                return null;
            }
        }
        DefaultHeartBeatController defaultHeartBeatController0 = this.b;
        synchronized(defaultHeartBeatController0) {
            e e0 = (e)defaultHeartBeatController0.a.get();
            ArrayList arrayList0 = e0.c();
            e0.b();
            JSONArray jSONArray0 = new JSONArray();
            for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
                HeartBeatResult heartBeatResult0 = (HeartBeatResult)arrayList0.get(v2);
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("agent", heartBeatResult0.getUserAgent());
                jSONObject0.put("dates", new JSONArray(heartBeatResult0.getUsedDates()));
                jSONArray0.put(jSONObject0);
            }
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("heartbeats", jSONArray0);
            jSONObject1.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream0 = new Base64OutputStream(byteArrayOutputStream0, 11);
            try(GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(base64OutputStream0)) {
                gZIPOutputStream0.write(jSONObject1.toString().getBytes("UTF-8"));
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(base64OutputStream0, throwable0);
                throw throwable0;
            }
            base64OutputStream0.close();
            return byteArrayOutputStream0.toString("UTF-8");
        }
    }
}

