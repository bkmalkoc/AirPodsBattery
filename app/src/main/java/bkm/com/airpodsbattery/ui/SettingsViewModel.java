package bkm.com.airpodsbattery.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingsViewModel extends ViewModel {
    private LiveData<String> userId;

    public LiveData<String> getUserId() {
        if(userId == null) {
            userId = new MutableLiveData<>();
        }
        return userId;
    }

    public void init(LiveData<String> userId) {
        this.userId = userId;
    }

}
