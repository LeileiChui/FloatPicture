package tool.xfy9326.floatpicture;

import android.app.Application;
import android.view.View;

import java.util.HashMap;

public class MainApplication extends Application {
    private HashMap<String, View> ViewRegister;

    @Override
    public void onCreate() {
        super.onCreate();
        this.ViewRegister = new HashMap<>();
    }

    public void registerView(String id, View mView) {
        ViewRegister.put(id, mView);
    }

    public View getRegisteredView(String id) {
        if (ViewRegister.containsKey(id)) {
            return ViewRegister.get(id);
        }
        return null;
    }

    public boolean unregisterView(String id) {
        if (ViewRegister.containsKey(id)) {
            ViewRegister.remove(id);
            return true;
        }
        return false;
    }
}
