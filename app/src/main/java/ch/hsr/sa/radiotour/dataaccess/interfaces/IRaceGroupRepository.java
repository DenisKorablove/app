package ch.hsr.sa.radiotour.dataaccess.interfaces;

import ch.hsr.sa.radiotour.dataaccess.models.RaceGroup;
import io.realm.RealmList;

public interface IRaceGroupRepository {
    interface OnSaveRaceGroupCallback {
        void onSuccess();
        void onError(String message);
    }

    interface OnGetAllRaceGroupsCallback {
        void onSuccess(RealmList<RaceGroup> raceGroups);
        void onError(String message);
    }

    void addRaceGroup(RaceGroup raceGroup, OnSaveRaceGroupCallback callback);

    void getAllRaceGroups(OnGetAllRaceGroupsCallback callback);

    void clearAllRaceGroups();

    void deleteRaceGroup();
}